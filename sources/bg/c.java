package bg;

import ag.u0;

public final /* synthetic */ class c implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f3644a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f3645b;

    public /* synthetic */ c(f fVar, Runnable runnable) {
        this.f3644a = fVar;
        this.f3645b = runnable;
    }

    public final void a() {
        this.f3644a.f3650c.removeCallbacks(this.f3645b);
    }
}
