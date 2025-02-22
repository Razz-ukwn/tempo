package yg;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import jg.b0;
import jg.d;
import jg.d0;
import jg.r;
import yg.c;
import yg.f;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f17448a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final d.a f17449b;

    /* renamed from: c  reason: collision with root package name */
    public final r f17450c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f.a> f17451d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f17452e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f17453f;

    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final y f17454a = y.f17557c;

        /* renamed from: b  reason: collision with root package name */
        public final Object[] f17455b = new Object[0];

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Class f17456c;

        public a(Class cls) {
            this.f17456c = cls;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f17455b;
            }
            y yVar = this.f17454a;
            return yVar.f17558a && method.isDefault() ? yVar.b(method, this.f17456c, obj, objArr) : c0.this.c(method).a(objArr);
        }
    }

    public c0(d.a aVar, r rVar, List list, List list2) {
        this.f17449b = aVar;
        this.f17450c = rVar;
        this.f17451d = list;
        this.f17452e = list2;
        this.f17453f = false;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<c.a> list = this.f17452e;
        int indexOf = list.indexOf((Object) null) + 1;
        int size = list.size();
        for (int i8 = indexOf; i8 < size; i8++) {
            c<?, ?> a10 = list.get(i8).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> T b(Class<T> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f17453f) {
                y yVar = y.f17557c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!(yVar.f17558a && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final d0<?> c(Method method) {
        d0<?> d0Var;
        d0<?> d0Var2 = (d0) this.f17448a.get(method);
        if (d0Var2 != null) {
            return d0Var2;
        }
        synchronized (this.f17448a) {
            d0Var = (d0) this.f17448a.get(method);
            if (d0Var == null) {
                d0Var = d0.b(this, method);
                this.f17448a.put(method, d0Var);
            }
        }
        return d0Var;
    }

    public final <T> f<T, b0> d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<f.a> list = this.f17451d;
        int indexOf = list.indexOf((Object) null) + 1;
        int size = list.size();
        for (int i8 = indexOf; i8 < size; i8++) {
            f<T, b0> a10 = list.get(i8).a(type);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> f<d0, T> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<f.a> list = this.f17451d;
        int indexOf = list.indexOf((Object) null) + 1;
        int size = list.size();
        for (int i8 = indexOf; i8 < size; i8++) {
            f<d0, ?> b10 = list.get(i8).b(type, annotationArr, this);
            if (b10 != null) {
                return b10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<f.a> list = this.f17451d;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).getClass();
        }
    }
}
