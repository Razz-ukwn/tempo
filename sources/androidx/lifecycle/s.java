package androidx.lifecycle;

import cb.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import sf.j;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f2314a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f2315b = new HashMap();

    public static g a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            j.e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (g) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z10;
        HashMap hashMap = f2314a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i8 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : "";
                j.e(name, "fullPackage");
                if (!(name.length() == 0)) {
                    j.e(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    j.e(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                j.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = zf.j.v0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (!(name.length() == 0)) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap hashMap2 = f2315b;
            if (constructor != null) {
                hashMap2.put(cls, d.O(constructor));
            } else {
                c cVar = c.f2247c;
                HashMap hashMap3 = cVar.f2249b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            } else if (((x) declaredMethods[i10].getAnnotation(x.class)) != null) {
                                cVar.a(cls, declaredMethods);
                                z10 = true;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class superclass = cls.getSuperclass();
                    Class<o> cls2 = o.class;
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        j.e(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            j.c(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    j.e(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            Class cls3 = interfaces[i11];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                j.e(cls3, "intrface");
                                if (b(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls3);
                                j.c(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i11++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i8 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i8));
        return i8;
    }
}
