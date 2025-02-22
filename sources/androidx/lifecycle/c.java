package androidx.lifecycle;

import androidx.lifecycle.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f2247c = new c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2248a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2249b = new HashMap();

    @Deprecated
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f2250a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, j.a> f2251b;

        public a(HashMap hashMap) {
            this.f2251b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                j.a aVar = (j.a) entry.getValue();
                List list = (List) this.f2250a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2250a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        public static void a(List<b> list, p pVar, j.a aVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    b bVar = list.get(size);
                    bVar.getClass();
                    try {
                        int i8 = bVar.f2252a;
                        Method method = bVar.f2253b;
                        if (i8 == 0) {
                            method.invoke(obj, new Object[0]);
                        } else if (i8 == 1) {
                            method.invoke(obj, new Object[]{pVar});
                        } else if (i8 == 2) {
                            method.invoke(obj, new Object[]{pVar, aVar});
                        }
                        size--;
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException("Failed to call observer method", e10.getCause());
                    } catch (IllegalAccessException e11) {
                        throw new RuntimeException(e11);
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2252a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2253b;

        public b(int i8, Method method) {
            this.f2252a = i8;
            this.f2253b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2252a == bVar.f2252a && this.f2253b.getName().equals(bVar.f2253b.getName());
        }

        public final int hashCode() {
            return this.f2253b.getName().hashCode() + (this.f2252a * 31);
        }
    }

    public static void c(HashMap hashMap, b bVar, j.a aVar, Class cls) {
        j.a aVar2 = (j.a) hashMap.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2253b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            hashMap.put(bVar, aVar);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i8;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f2251b);
        }
        for (Class b10 : cls.getInterfaces()) {
            for (Map.Entry next : b(b10).f2251b.entrySet()) {
                c(hashMap, (b) next.getKey(), (j.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            x xVar = (x) method.getAnnotation(x.class);
            if (xVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i8 = 0;
                } else if (p.class.isAssignableFrom(parameterTypes[0])) {
                    i8 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                j.a value = xVar.value();
                if (parameterTypes.length > 1) {
                    if (!j.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == j.a.ON_ANY) {
                        i8 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i8, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f2248a.put(cls, aVar);
        this.f2249b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.f2248a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }
}
