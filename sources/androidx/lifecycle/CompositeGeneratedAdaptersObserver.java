package androidx.lifecycle;

import androidx.lifecycle.j;

public final class CompositeGeneratedAdaptersObserver implements n {

    /* renamed from: a  reason: collision with root package name */
    public final g[] f2180a;

    public CompositeGeneratedAdaptersObserver(g[] gVarArr) {
        this.f2180a = gVarArr;
    }

    public final void d(p pVar, j.a aVar) {
        new u(0);
        g[] gVarArr = this.f2180a;
        for (g a10 : gVarArr) {
            a10.a();
        }
        for (g a11 : gVarArr) {
            a11.a();
        }
    }
}
