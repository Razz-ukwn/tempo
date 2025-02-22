package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import b2.c;
import j0.t;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import l3.b;
import sf.j;

public final class Recreator implements n {

    /* renamed from: a  reason: collision with root package name */
    public final b f2767a;

    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashSet f2768a = new LinkedHashSet();

        public a(a aVar) {
            j.f(aVar, "registry");
            aVar.c("androidx.savedstate.Restarter", this);
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f2768a));
            return bundle;
        }
    }

    public Recreator(b bVar) {
        j.f(bVar, "owner");
        this.f2767a = bVar;
    }

    public final void d(p pVar, j.a aVar) {
        if (aVar == j.a.ON_CREATE) {
            pVar.b().c(this);
            b bVar = this.f2767a;
            Bundle a10 = bVar.w().a("androidx.savedstate.Restarter");
            if (a10 != null) {
                ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.C0031a.class);
                            sf.j.e(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                    sf.j.e(newInstance, "{\n                constr…wInstance()\n            }");
                                    ((a.C0031a) newInstance).a(bVar);
                                } catch (Exception e10) {
                                    throw new RuntimeException(t.a("Failed to instantiate ", next), e10);
                                }
                            } catch (NoSuchMethodException e11) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                            }
                        } catch (ClassNotFoundException e12) {
                            throw new RuntimeException(c.a("Class ", next, " wasn't found"), e12);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
