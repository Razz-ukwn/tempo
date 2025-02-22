package f3;

import cb.b;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;
import rf.q;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f8186a = new Object();

    @e(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {86}, m = "invokeSuspend")
    public static final class a extends i implements p<l2<R>, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8187a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8188b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f<T> f8189c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ q<g<? super R>, T, d<? super m>, Object> f8190d;

        @e(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {87}, m = "invokeSuspend")
        /* renamed from: f3.f0$a$a  reason: collision with other inner class name */
        public static final class C0138a extends i implements p<T, d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f8191a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ Object f8192b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ q<g<? super R>, T, d<? super m>, Object> f8193c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ r<R> f8194d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0138a(q<? super g<? super R>, ? super T, ? super d<? super m>, ? extends Object> qVar, r<R> rVar, d<? super C0138a> dVar) {
                super(2, dVar);
                this.f8193c = qVar;
                this.f8194d = rVar;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                C0138a aVar = new C0138a(this.f8193c, this.f8194d, dVar);
                aVar.f8192b = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0138a) create(obj, (d) obj2)).invokeSuspend(m.f8717a);
            }

            public final Object invokeSuspend(Object obj) {
                kf.a aVar = kf.a.f10464a;
                int i8 = this.f8191a;
                if (i8 == 0) {
                    b.J(obj);
                    Object obj2 = this.f8192b;
                    this.f8191a = 1;
                    if (this.f8193c.e(this.f8194d, obj2, this) == aVar) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f<? extends T> fVar, q<? super g<? super R>, ? super T, ? super d<? super m>, ? extends Object> qVar, d<? super a> dVar) {
            super(2, dVar);
            this.f8189c = fVar;
            this.f8190d = qVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f8189c, this.f8190d, dVar);
            aVar.f8188b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((l2) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f8187a;
            if (i8 == 0) {
                b.J(obj);
                C0138a aVar2 = new C0138a(this.f8190d, new r((l2) this.f8188b), (d<? super C0138a>) null);
                this.f8187a = 1;
                if (cb.d.t(this.f8189c, aVar2, this) == aVar) {
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

    public static final <T, R> f<R> a(f<? extends T> fVar, q<? super g<? super R>, ? super T, ? super d<? super m>, ? extends Object> qVar) {
        return k2.a(new a(fVar, qVar, (d<? super a>) null));
    }
}
