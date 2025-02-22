package androidx.lifecycle;

import androidx.lifecycle.j;

public final class SavedStateHandleAttacher implements n {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f2230a;

    public SavedStateHandleAttacher(d0 d0Var) {
        this.f2230a = d0Var;
    }

    public final void d(p pVar, j.a aVar) {
        if (aVar == j.a.ON_CREATE) {
            pVar.b().c(this);
            d0 d0Var = this.f2230a;
            if (!d0Var.f2260b) {
                d0Var.f2261c = d0Var.f2259a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                d0Var.f2260b = true;
                e0 e0Var = (e0) d0Var.f2262d.getValue();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
