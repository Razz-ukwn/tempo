package mf;

import nf.a;
import sf.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11479a;

    static {
        a aVar;
        Object newInstance;
        a newInstance2;
        Object newInstance3;
        of.a newInstance4;
        Class<a> cls = a.class;
        try {
            newInstance4 = of.a.class.newInstance();
            j.e(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
            aVar = newInstance4;
        } catch (ClassCastException e10) {
            ClassLoader classLoader = newInstance4.getClass().getClassLoader();
            ClassLoader classLoader2 = cls.getClassLoader();
            if (!j.a(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
            }
            throw e10;
        } catch (ClassNotFoundException unused) {
            try {
                newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                j.e(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                aVar = (a) newInstance3;
            } catch (ClassCastException e11) {
                ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader4 = cls.getClassLoader();
                if (!j.a(classLoader3, classLoader4)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
                }
                throw e11;
            } catch (ClassNotFoundException unused2) {
                try {
                    newInstance2 = a.class.newInstance();
                    j.e(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    aVar = newInstance2;
                } catch (ClassCastException e12) {
                    ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader6 = cls.getClassLoader();
                    if (!j.a(classLoader5, classLoader6)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                    }
                    throw e12;
                } catch (ClassNotFoundException unused3) {
                    try {
                        newInstance = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                        j.e(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                        aVar = (a) newInstance;
                    } catch (ClassCastException e13) {
                        ClassLoader classLoader7 = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader8 = cls.getClassLoader();
                        if (!j.a(classLoader7, classLoader8)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
                        }
                        throw e13;
                    } catch (ClassNotFoundException unused4) {
                        aVar = new a();
                    }
                }
            }
        }
        f11479a = aVar;
    }
}
