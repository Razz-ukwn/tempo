package androidx.lifecycle;

import androidx.lifecycle.j;
import androidx.savedstate.a;

public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f2184a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f2185b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(j jVar, a aVar) {
        this.f2184a = jVar;
        this.f2185b = aVar;
    }

    public final void d(p pVar, j.a aVar) {
        if (aVar == j.a.ON_START) {
            this.f2184a.c(this);
            this.f2185b.d();
        }
    }
}
