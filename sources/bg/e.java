package bg;

import ff.m;
import rf.l;
import sf.k;

public final class e extends k implements l<Throwable, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f3648a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f3649b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar, d dVar) {
        super(1);
        this.f3648a = fVar;
        this.f3649b = dVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f3648a.f3650c.removeCallbacks(this.f3649b);
        return m.f8717a;
    }
}
