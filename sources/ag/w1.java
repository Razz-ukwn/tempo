package ag;

import cb.b;
import com.google.android.gms.internal.p000firebaseauthapi.g;
import e9.c;
import ff.m;
import jf.d;
import jf.f;
import rf.l;
import rf.p;

public final class w1 extends f2 {

    /* renamed from: c  reason: collision with root package name */
    public final d<m> f506c;

    public w1(f fVar, p<? super g0, ? super d<? super m>, ? extends Object> pVar) {
        super(fVar, false);
        this.f506c = c.e(this, this, pVar);
    }

    public final void o0() {
        try {
            g.e(c.g(this.f506c), m.f8717a, (l) null);
        } catch (Throwable th) {
            resumeWith(b.u(th));
            throw th;
        }
    }
}
