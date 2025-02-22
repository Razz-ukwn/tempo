package kotlinx.coroutines.internal;

import ag.a;
import com.google.android.gms.internal.p000firebaseauthapi.g;
import e9.c;
import jf.f;
import lf.d;
import rf.l;

public class s<T> extends a<T> implements d {

    /* renamed from: c  reason: collision with root package name */
    public final jf.d<T> f10734c;

    public s(jf.d dVar, f fVar) {
        super(fVar, true);
        this.f10734c = dVar;
    }

    public final boolean Z() {
        return true;
    }

    public final d getCallerFrame() {
        jf.d<T> dVar = this.f10734c;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public void v(Object obj) {
        g.e(c.g(this.f10734c), cb.d.b0(obj), (l) null);
    }

    public void z0(Object obj) {
        this.f10734c.resumeWith(cb.d.b0(obj));
    }
}
