package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import sf.j;
import x2.a;

public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f2294a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2295b;

    /* renamed from: c  reason: collision with root package name */
    public final x2.a f2296c;

    public interface b {
        <T extends j0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        j0 b(Class cls, x2.c cVar) {
            return a(cls);
        }
    }

    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static c f2299a;

        public <T extends j0> T a(Class<T> cls) {
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                j.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return (j0) newInstance;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }
    }

    public static class d {
        public void c(j0 j0Var) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, b bVar) {
        this(o0Var, bVar, 0);
        j.f(o0Var, "store");
        j.f(bVar, "factory");
    }

    public m0(o0 o0Var, b bVar, x2.a aVar) {
        j.f(o0Var, "store");
        j.f(bVar, "factory");
        j.f(aVar, "defaultCreationExtras");
        this.f2294a = o0Var;
        this.f2295b = bVar;
        this.f2296c = aVar;
    }

    public final <T extends j0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final j0 b(Class cls, String str) {
        j0 j0Var;
        j.f(str, "key");
        o0 o0Var = this.f2294a;
        o0Var.getClass();
        j0 j0Var2 = (j0) o0Var.f2301a.get(str);
        boolean isInstance = cls.isInstance(j0Var2);
        b bVar = this.f2295b;
        if (isInstance) {
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                j.c(j0Var2);
                dVar.c(j0Var2);
            }
            j.d(j0Var2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return j0Var2;
        }
        x2.c cVar = new x2.c(this.f2296c);
        cVar.f16911a.put(n0.f2300a, str);
        try {
            j0Var = bVar.b(cls, cVar);
        } catch (AbstractMethodError unused) {
            j0Var = bVar.a(cls);
        }
        j.f(j0Var, "viewModel");
        j0 j0Var3 = (j0) o0Var.f2301a.put(str, j0Var);
        if (j0Var3 != null) {
            j0Var3.c();
        }
        return j0Var;
    }

    public static class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public static a f2297c;

        /* renamed from: b  reason: collision with root package name */
        public final Application f2298b;

        public a(Application application, int i8) {
            this.f2298b = application;
        }

        public final <T extends j0> T a(Class<T> cls) {
            Application application = this.f2298b;
            if (application != null) {
                return c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final j0 b(Class cls, x2.c cVar) {
            if (this.f2298b != null) {
                return a(cls);
            }
            Application application = (Application) cVar.f16911a.get(l0.f2292a);
            if (application != null) {
                return c(cls, application);
            }
            if (!b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final <T extends j0> T c(Class<T> cls, Application application) {
            if (!b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t2 = (j0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                j.e(t2, "{\n                try {\n…          }\n            }");
                return t2;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            j.f(application, "application");
        }
    }

    public /* synthetic */ m0(o0 o0Var, b bVar, int i8) {
        this(o0Var, bVar, (x2.a) a.C0311a.f16912b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m0(androidx.lifecycle.p0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            sf.j.f(r4, r0)
            androidx.lifecycle.o0 r0 = r4.s()
            boolean r1 = r4 instanceof androidx.lifecycle.h
            if (r1 == 0) goto L_0x0015
            r2 = r4
            androidx.lifecycle.h r2 = (androidx.lifecycle.h) r2
            androidx.lifecycle.m0$b r2 = r2.k()
            goto L_0x0025
        L_0x0015:
            androidx.lifecycle.m0$c r2 = androidx.lifecycle.m0.c.f2299a
            if (r2 != 0) goto L_0x0020
            androidx.lifecycle.m0$c r2 = new androidx.lifecycle.m0$c
            r2.<init>()
            androidx.lifecycle.m0.c.f2299a = r2
        L_0x0020:
            androidx.lifecycle.m0$c r2 = androidx.lifecycle.m0.c.f2299a
            sf.j.c(r2)
        L_0x0025:
            if (r1 == 0) goto L_0x002e
            androidx.lifecycle.h r4 = (androidx.lifecycle.h) r4
            x2.a r4 = r4.l()
            goto L_0x0030
        L_0x002e:
            x2.a$a r4 = x2.a.C0311a.f16912b
        L_0x0030:
            r3.<init>((androidx.lifecycle.o0) r0, (androidx.lifecycle.m0.b) r2, (x2.a) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m0.<init>(androidx.lifecycle.p0):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m0(androidx.lifecycle.p0 r3, androidx.lifecycle.m0.b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            sf.j.f(r3, r0)
            androidx.lifecycle.o0 r0 = r3.s()
            boolean r1 = r3 instanceof androidx.lifecycle.h
            if (r1 == 0) goto L_0x0014
            androidx.lifecycle.h r3 = (androidx.lifecycle.h) r3
            x2.a r3 = r3.l()
            goto L_0x0016
        L_0x0014:
            x2.a$a r3 = x2.a.C0311a.f16912b
        L_0x0016:
            r2.<init>((androidx.lifecycle.o0) r0, (androidx.lifecycle.m0.b) r4, (x2.a) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m0.<init>(androidx.lifecycle.p0, androidx.lifecycle.m0$b):void");
    }
}
