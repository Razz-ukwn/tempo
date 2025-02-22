package androidx.compose.ui.platform;

import ag.g0;
import android.view.Choreographer;
import cb.b;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
public final class v0 extends i implements p<g0, d<? super Choreographer>, Object> {
    public v0(d<? super v0> dVar) {
        super(2, dVar);
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new v0(dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        g0 g0Var = (g0) obj;
        return new v0((d) obj2).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        return Choreographer.getInstance();
    }
}
