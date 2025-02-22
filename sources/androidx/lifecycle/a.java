package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.m0;
import sf.j;
import x2.c;

public abstract class a extends m0.d implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.savedstate.a f2235a;

    /* renamed from: b  reason: collision with root package name */
    public final j f2236b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f2237c;

    public a() {
    }

    public final <T extends j0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            j jVar = this.f2236b;
            if (jVar != null) {
                androidx.savedstate.a aVar = this.f2235a;
                j.c(aVar);
                j.c(jVar);
                SavedStateHandleController b10 = i.b(aVar, jVar, canonicalName, this.f2237c);
                T d10 = d(canonicalName, cls, b10.f2232b);
                d10.d(b10, "androidx.lifecycle.savedstate.vm.tag");
                return d10;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final j0 b(Class cls, c cVar) {
        String str = (String) cVar.f16911a.get(n0.f2300a);
        if (str != null) {
            androidx.savedstate.a aVar = this.f2235a;
            if (aVar == null) {
                return d(str, cls, c0.a(cVar));
            }
            j.c(aVar);
            j jVar = this.f2236b;
            j.c(jVar);
            SavedStateHandleController b10 = i.b(aVar, jVar, str, this.f2237c);
            j0 d10 = d(str, cls, b10.f2232b);
            d10.d(b10, "androidx.lifecycle.savedstate.vm.tag");
            return d10;
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public final void c(j0 j0Var) {
        androidx.savedstate.a aVar = this.f2235a;
        if (aVar != null) {
            j jVar = this.f2236b;
            j.c(jVar);
            i.a(j0Var, aVar, jVar);
        }
    }

    public abstract <T extends j0> T d(String str, Class<T> cls, b0 b0Var);

    public a(b3.j jVar) {
        j.f(jVar, "owner");
        this.f2235a = jVar.E.f10968b;
        this.f2236b = jVar.D;
        this.f2237c = null;
    }
}
