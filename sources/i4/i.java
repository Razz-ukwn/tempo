package i4;

import ag.k;
import ag.l;
import android.view.View;
import android.view.ViewTreeObserver;
import i4.g;

public final class i implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9578a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g<View> f9579b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f9580c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k<e> f9581d;

    public i(g gVar, ViewTreeObserver viewTreeObserver, l lVar) {
        this.f9579b = gVar;
        this.f9580c = viewTreeObserver;
        this.f9581d = lVar;
    }

    public final boolean onPreDraw() {
        g<View> gVar = this.f9579b;
        e a10 = g.a.a(gVar);
        if (a10 != null) {
            ViewTreeObserver viewTreeObserver = this.f9580c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                gVar.a().getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f9578a) {
                this.f9578a = true;
                this.f9581d.resumeWith(a10);
            }
        }
        return true;
    }
}
