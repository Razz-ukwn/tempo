package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.m0;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import l3.b;
import sf.j;
import x2.c;

public final class f0 extends m0.d implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f2265a;

    /* renamed from: b  reason: collision with root package name */
    public final m0.a f2266b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f2267c;

    /* renamed from: d  reason: collision with root package name */
    public final j f2268d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2269e;

    public f0() {
        this.f2266b = new m0.a();
    }

    public final <T extends j0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final j0 b(Class cls, c cVar) {
        n0 n0Var = n0.f2300a;
        LinkedHashMap linkedHashMap = cVar.f16911a;
        String str = (String) linkedHashMap.get(n0Var);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (linkedHashMap.get(c0.f2254a) != null && linkedHashMap.get(c0.f2255b) != null) {
            Application application = (Application) linkedHashMap.get(l0.f2292a);
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Constructor<T> a10 = (!isAssignableFrom || application == null) ? g0.a(cls, g0.f2271b) : g0.a(cls, g0.f2270a);
            if (a10 == null) {
                return this.f2266b.b(cls, cVar);
            }
            if (!isAssignableFrom || application == null) {
                return g0.b(cls, a10, c0.a(cVar));
            }
            return g0.b(cls, a10, application, c0.a(cVar));
        } else if (this.f2268d != null) {
            return d(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public final void c(j0 j0Var) {
        j jVar = this.f2268d;
        if (jVar != null) {
            a aVar = this.f2269e;
            j.c(aVar);
            i.a(j0Var, aVar, jVar);
        }
    }

    public final j0 d(Class cls, String str) {
        j jVar = this.f2268d;
        if (jVar != null) {
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Application application = this.f2265a;
            Constructor<T> a10 = (!isAssignableFrom || application == null) ? g0.a(cls, g0.f2271b) : g0.a(cls, g0.f2270a);
            if (a10 != null) {
                a aVar = this.f2269e;
                j.c(aVar);
                SavedStateHandleController b10 = i.b(aVar, jVar, str, this.f2267c);
                b0 b0Var = b10.f2232b;
                T b11 = (!isAssignableFrom || application == null) ? g0.b(cls, a10, b0Var) : g0.b(cls, a10, application, b0Var);
                b11.d(b10, "androidx.lifecycle.savedstate.vm.tag");
                return b11;
            } else if (application != null) {
                return this.f2266b.a(cls);
            } else {
                if (m0.c.f2299a == null) {
                    m0.c.f2299a = new m0.c();
                }
                m0.c cVar = m0.c.f2299a;
                j.c(cVar);
                return cVar.a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    @SuppressLint({"LambdaLast"})
    public f0(Application application, b bVar, Bundle bundle) {
        m0.a aVar;
        j.f(bVar, "owner");
        this.f2269e = bVar.w();
        this.f2268d = bVar.b();
        this.f2267c = bundle;
        this.f2265a = application;
        if (application != null) {
            if (m0.a.f2297c == null) {
                m0.a.f2297c = new m0.a(application);
            }
            aVar = m0.a.f2297c;
            j.c(aVar);
        } else {
            aVar = new m0.a();
        }
        this.f2266b = aVar;
    }
}
