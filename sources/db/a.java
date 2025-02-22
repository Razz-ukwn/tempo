package db;

import ab.a0;
import ab.b0;
import ab.i;
import hb.b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E> extends a0<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final C0118a f7408c = new C0118a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f7409a;

    /* renamed from: b  reason: collision with root package name */
    public final p f7410b;

    /* renamed from: db.a$a  reason: collision with other inner class name */
    public class C0118a implements b0 {
        public final <T> a0<T> a(i iVar, gb.a<T> aVar) {
            Type type = aVar.f8929b;
            boolean z10 = type instanceof GenericArrayType;
            if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new a(iVar, iVar.c(new gb.a(genericComponentType)), cb.a.f(genericComponentType));
        }
    }

    public a(i iVar, a0<E> a0Var, Class<E> cls) {
        this.f7410b = new p(iVar, a0Var, cls);
        this.f7409a = cls;
    }

    public final Object a(hb.a aVar) {
        if (aVar.k0() == 9) {
            aVar.d0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.F()) {
            arrayList.add(this.f7410b.a(aVar));
        }
        aVar.p();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f7409a, size);
        for (int i8 = 0; i8 < size; i8++) {
            Array.set(newInstance, i8, arrayList.get(i8));
        }
        return newInstance;
    }

    public final void b(b bVar, Object obj) {
        if (obj == null) {
            bVar.z();
            return;
        }
        bVar.d();
        int length = Array.getLength(obj);
        for (int i8 = 0; i8 < length; i8++) {
            this.f7410b.b(bVar, Array.get(obj, i8));
        }
        bVar.p();
    }
}
