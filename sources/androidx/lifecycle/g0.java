package androidx.lifecycle;

import android.app.Application;
import cb.d;
import gf.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import sf.j;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f2270a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f2271b;

    static {
        Class<b0> cls = b0.class;
        f2270a = d.P(Application.class, cls);
        f2271b = d.O(cls);
    }

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        j.f(list, "signature");
        Constructor<T>[] constructors = cls.getConstructors();
        j.e(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i8 = 0;
        while (i8 < length) {
            Constructor<T> constructor = constructors[i8];
            Class[] parameterTypes = constructor.getParameterTypes();
            j.e(parameterTypes, "constructor.parameterTypes");
            List f02 = l.f0(parameterTypes);
            if (j.a(list, f02)) {
                return constructor;
            }
            if (list.size() != f02.size() || !f02.containsAll(list)) {
                i8++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends j0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return (j0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
