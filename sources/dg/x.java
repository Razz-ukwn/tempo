package dg;

import cb.b;
import d2.f1;
import ff.m;
import jf.d;
import jf.f;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

public final class x<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f f7592a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7593b;

    /* renamed from: c  reason: collision with root package name */
    public final a f7594c;

    @e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    public static final class a extends i implements p<T, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f7595a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f7596b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g<T> f7597c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g<? super T> gVar, d<? super a> dVar) {
            super(2, dVar);
            this.f7597c = gVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f7597c, dVar);
            aVar.f7596b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create(obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f7595a;
            if (i8 == 0) {
                b.J(obj);
                Object obj2 = this.f7596b;
                this.f7595a = 1;
                if (this.f7597c.m(obj2, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8717a;
        }
    }

    public x(g<? super T> gVar, f fVar) {
        this.f7592a = fVar;
        this.f7593b = kotlinx.coroutines.internal.x.b(fVar);
        this.f7594c = new a(gVar, (d<? super a>) null);
    }

    public final Object m(T t2, d<? super m> dVar) {
        Object Q = f1.Q(this.f7592a, t2, this.f7593b, this.f7594c, dVar);
        return Q == kf.a.f10464a ? Q : m.f8717a;
    }
}
