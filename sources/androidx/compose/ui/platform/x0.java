package androidx.compose.ui.platform;

import android.view.Choreographer;
import ff.m;
import jf.d;
import jf.e;
import jf.f;
import rf.l;
import rf.p;
import sf.j;
import sf.k;
import t.e1;

public final class x0 implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public final Choreographer f1501a;

    public static final class a extends k implements l<Throwable, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w0 f1502a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f1503b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var, c cVar) {
            super(1);
            this.f1502a = w0Var;
            this.f1503b = cVar;
        }

        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            w0 w0Var = this.f1502a;
            Choreographer.FrameCallback frameCallback = this.f1503b;
            w0Var.getClass();
            j.f(frameCallback, "callback");
            synchronized (w0Var.f1487e) {
                w0Var.C.remove(frameCallback);
            }
            return m.f8717a;
        }
    }

    public static final class b extends k implements l<Throwable, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x0 f1504a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f1505b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(x0 x0Var, c cVar) {
            super(1);
            this.f1504a = x0Var;
            this.f1505b = cVar;
        }

        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f1504a.f1501a.removeFrameCallback(this.f1505b);
            return m.f8717a;
        }
    }

    public static final class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ag.k<R> f1506a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<Long, R> f1507b;

        public c(ag.l lVar, x0 x0Var, l lVar2) {
            this.f1506a = lVar;
            this.f1507b = lVar2;
        }

        public final void doFrame(long j10) {
            R r10;
            try {
                r10 = this.f1507b.invoke(Long.valueOf(j10));
            } catch (Throwable th) {
                r10 = cb.b.u(th);
            }
            this.f1506a.resumeWith(r10);
        }
    }

    public x0(Choreographer choreographer) {
        this.f1501a = choreographer;
    }

    public final <R> Object Y(l<? super Long, ? extends R> lVar, d<? super R> dVar) {
        f.b d10 = dVar.getContext().d(e.a.f10012a);
        w0 w0Var = d10 instanceof w0 ? (w0) d10 : null;
        ag.l lVar2 = new ag.l(1, e9.c.g(dVar));
        lVar2.t();
        c cVar = new c(lVar2, this, lVar);
        if (w0Var == null || !j.a(w0Var.f1485c, this.f1501a)) {
            this.f1501a.postFrameCallback(cVar);
            lVar2.v(new b(this, cVar));
        } else {
            synchronized (w0Var.f1487e) {
                w0Var.C.add(cVar);
                if (!w0Var.F) {
                    w0Var.F = true;
                    w0Var.f1485c.postFrameCallback(w0Var.G);
                }
                m mVar = m.f8717a;
            }
            lVar2.v(new a(w0Var, cVar));
        }
        return lVar2.s();
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        j.f(cVar, "key");
        return f.b.a.a(this, cVar);
    }

    public final f n0(f fVar) {
        j.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    public final <R> R p(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public final f w0(f.c<?> cVar) {
        j.f(cVar, "key");
        return f.b.a.b(this, cVar);
    }
}
