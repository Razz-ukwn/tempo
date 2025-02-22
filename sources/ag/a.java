package ag;

import ab.r;
import ag.n1;
import cb.b;
import com.google.android.gms.internal.p000firebaseauthapi.g;
import d2.f1;
import e9.c;
import ff.e;
import ff.h;
import ff.m;
import jf.d;
import jf.f;
import kotlinx.coroutines.internal.x;
import rf.l;
import rf.p;
import sf.j;
import sf.y;

public abstract class a<T> extends s1 implements d<T>, g0 {

    /* renamed from: b  reason: collision with root package name */
    public final f f389b;

    public a(f fVar, boolean z10) {
        super(z10);
        W((n1) fVar.d(n1.b.f447a));
        this.f389b = fVar.n0(this);
    }

    public void A0(Throwable th, boolean z10) {
    }

    public final String B() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void B0(T t2) {
    }

    public final void C0(int i8, a aVar, p pVar) {
        f fVar;
        Object c3;
        if (i8 != 0) {
            int i10 = i8 - 1;
            if (i10 == 0) {
                try {
                    g.e(c.g(c.e(aVar, this, pVar)), m.f8717a, (l) null);
                } catch (Throwable th) {
                    resumeWith(b.u(th));
                    throw th;
                }
            } else if (i10 == 1) {
            } else {
                if (i10 == 2) {
                    j.f(pVar, "<this>");
                    c.g(c.e(aVar, this, pVar)).resumeWith(m.f8717a);
                } else if (i10 == 3) {
                    try {
                        fVar = this.f389b;
                        c3 = x.c(fVar, (Object) null);
                        y.c(2, pVar);
                        Object invoke = pVar.invoke(aVar, this);
                        x.a(fVar, c3);
                        if (invoke != kf.a.f10464a) {
                            resumeWith(invoke);
                        }
                    } catch (Throwable th2) {
                        resumeWith(b.u(th2));
                    }
                } else {
                    throw new e();
                }
            }
        } else {
            throw null;
        }
    }

    public final void V(r rVar) {
        f1.z(this.f389b, rVar);
    }

    public boolean c() {
        return super.c();
    }

    public final f f0() {
        return this.f389b;
    }

    public final f getContext() {
        return this.f389b;
    }

    public String h0() {
        return super.h0();
    }

    public final void l0(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            A0(wVar.f504a, wVar.a());
            return;
        }
        B0(obj);
    }

    public final void resumeWith(Object obj) {
        Throwable a10 = h.a(obj);
        if (a10 != null) {
            obj = new w(a10, false);
        }
        Object c02 = c0(obj);
        if (c02 != v1.f499b) {
            z0(c02);
        }
    }

    public void z0(Object obj) {
        v(obj);
    }
}
