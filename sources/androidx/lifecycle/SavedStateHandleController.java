package androidx.lifecycle;

import androidx.lifecycle.j;
import androidx.savedstate.a;
import sf.j;

public final class SavedStateHandleController implements n {

    /* renamed from: a  reason: collision with root package name */
    public final String f2231a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f2232b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2233c;

    public SavedStateHandleController(String str, b0 b0Var) {
        this.f2231a = str;
        this.f2232b = b0Var;
    }

    public final void a(j jVar, a aVar) {
        j.f(aVar, "registry");
        j.f(jVar, "lifecycle");
        if (!this.f2233c) {
            this.f2233c = true;
            jVar.a(this);
            aVar.c(this.f2231a, this.f2232b.f2246e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final void d(p pVar, j.a aVar) {
        if (aVar == j.a.ON_DESTROY) {
            this.f2233c = false;
            pVar.b().c(this);
        }
    }
}
