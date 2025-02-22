package i4;

import android.view.View;
import android.view.ViewTreeObserver;
import ff.m;
import rf.l;
import sf.k;

public final class h extends k implements l<Throwable, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g<View> f9575a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f9576b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f9577c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(g<View> gVar, ViewTreeObserver viewTreeObserver, i iVar) {
        super(1);
        this.f9575a = gVar;
        this.f9576b = viewTreeObserver;
        this.f9577c = iVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        ViewTreeObserver viewTreeObserver = this.f9576b;
        boolean isAlive = viewTreeObserver.isAlive();
        i iVar = this.f9577c;
        if (isAlive) {
            viewTreeObserver.removeOnPreDrawListener(iVar);
        } else {
            this.f9575a.a().getViewTreeObserver().removeOnPreDrawListener(iVar);
        }
        return m.f8717a;
    }
}
