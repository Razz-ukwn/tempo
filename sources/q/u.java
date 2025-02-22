package q;

import cb.b;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.l;
import t.f1;

@e(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
public final class u extends i implements l<d<Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12773a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l<Long, Object> f12774b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(l<? super Long, Object> lVar, d<? super u> dVar) {
        super(1, dVar);
        this.f12774b = lVar;
    }

    public final d<m> create(d<?> dVar) {
        return new u(this.f12774b, dVar);
    }

    public final Object invoke(Object obj) {
        return ((u) create((d) obj)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f12773a;
        if (i8 == 0) {
            b.J(obj);
            this.f12773a = 1;
            obj = f1.a(getContext()).Y(this.f12774b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
