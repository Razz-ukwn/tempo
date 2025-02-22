package t;

import ag.g0;
import ag.s0;
import android.view.Choreographer;
import jf.d;
import jf.f;
import kotlinx.coroutines.internal.m;
import lf.e;
import lf.i;
import rf.l;
import rf.p;
import sf.j;
import sf.k;

public final class n0 implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f15162a = new n0();

    /* renamed from: b  reason: collision with root package name */
    public static final Choreographer f15163b = ((Choreographer) cb.b.G(m.f10728a.J0(), new a((d<? super a>) null)));

    @e(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super Choreographer>, Object> {
        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        public final d<ff.m> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            g0 g0Var = (g0) obj;
            return new a((d) obj2).invokeSuspend(ff.m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            cb.b.J(obj);
            return Choreographer.getInstance();
        }
    }

    public static final class b extends k implements l<Throwable, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f15164a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.f15164a = cVar;
        }

        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            n0.f15163b.removeFrameCallback(this.f15164a);
            return ff.m.f8717a;
        }
    }

    public static final class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ag.k<R> f15165a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<Long, R> f15166b;

        public c(ag.l lVar, l lVar2) {
            this.f15165a = lVar;
            this.f15166b = lVar2;
        }

        public final void doFrame(long j10) {
            R r10;
            n0 n0Var = n0.f15162a;
            try {
                r10 = this.f15166b.invoke(Long.valueOf(j10));
            } catch (Throwable th) {
                r10 = cb.b.u(th);
            }
            this.f15165a.resumeWith(r10);
        }
    }

    static {
        kotlinx.coroutines.scheduling.c cVar = s0.f480a;
    }

    public final <R> Object Y(l<? super Long, ? extends R> lVar, d<? super R> dVar) {
        ag.l lVar2 = new ag.l(1, e9.c.g(dVar));
        lVar2.t();
        c cVar = new c(lVar2, lVar);
        f15163b.postFrameCallback(cVar);
        lVar2.v(new b(cVar));
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
