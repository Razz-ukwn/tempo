package androidx.fragment.app;

import androidx.fragment.app.p;
import b2.c;
import o.f;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final f<ClassLoader, f<String, Class<?>>> f1909a = new f<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        f<ClassLoader, f<String, Class<?>>> fVar = f1909a;
        f orDefault = fVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new f();
            fVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    public static Class<? extends p> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new p.d(c.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        } catch (ClassCastException e11) {
            throw new p.d(c.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e11);
        }
    }

    public p a(String str) {
        throw null;
    }
}
