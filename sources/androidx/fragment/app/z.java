package androidx.fragment.app;

import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;
import e9.c;
import hb.a;
import i4.e;
import java.lang.reflect.Modifier;
import java.util.List;
import r0.h;
import se.b;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static a.C0164a f2174a;

    public static void c(Class cls) {
        String g10 = g(cls);
        if (g10 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(g10));
        }
    }

    public static String g(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public void A(b bVar) {
        if (bVar != null) {
            try {
                D(bVar);
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th) {
                c.m(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("observer is null");
        }
    }

    public abstract void D(b bVar);

    public abstract boolean e(e eVar);

    public abstract boolean f();

    public abstract List h(String str, List list);

    public abstract boolean j(r0.c cVar);

    public abstract Object k(h hVar);

    public abstract Path l(float f10, float f11, float f12, float f13);

    public abstract Object m(Class cls);

    public abstract View r(int i8);

    public abstract void t(int i8);

    public abstract void y(Typeface typeface, boolean z10);

    public abstract boolean z();
}
