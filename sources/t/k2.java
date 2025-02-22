package t;

import ag.g0;
import ag.s0;
import cb.b;
import ff.m;
import jf.d;
import jf.f;
import kotlinx.coroutines.scheduling.c;
import lf.e;
import lf.i;
import rf.l;
import rf.p;
import sf.j;

public final class k2 implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final k2 f15134a = new k2();

    @e(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {52}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super R>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f15135a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<Long, R> f15136b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l<? super Long, ? extends R> lVar, d<? super a> dVar) {
            super(2, dVar);
            this.f15136b = lVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f15136b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f15135a;
            if (i8 == 0) {
                b.J(obj);
                this.f15135a = 1;
                if (cb.d.x(16, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f15136b.invoke(new Long(System.nanoTime()));
        }
    }

    public final <R> Object Y(l<? super Long, ? extends R> lVar, d<? super R> dVar) {
        c cVar = s0.f480a;
        return b.M(kotlinx.coroutines.internal.m.f10728a, new a(lVar, (d<? super a>) null), dVar);
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
