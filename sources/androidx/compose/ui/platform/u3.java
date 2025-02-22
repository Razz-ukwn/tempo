package androidx.compose.ui.platform;

import ag.g0;
import cb.b;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {153}, m = "invokeSuspend")
public final class u3 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f1478a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WrappedComposition f1479b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u3(WrappedComposition wrappedComposition, d<? super u3> dVar) {
        super(2, dVar);
        this.f1479b = wrappedComposition;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new u3(this.f1479b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u3) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f1478a;
        if (i8 == 0) {
            b.J(obj);
            AndroidComposeView androidComposeView = this.f1479b.f1241a;
            this.f1478a = 1;
            Object k10 = androidComposeView.G.k(this);
            if (k10 != aVar) {
                k10 = m.f8717a;
            }
            if (k10 == aVar) {
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
