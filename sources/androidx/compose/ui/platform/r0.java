package androidx.compose.ui.platform;

import android.content.Context;
import rf.l;
import sf.j;
import sf.k;
import t.q0;

public final class r0 extends k implements l<t.r0, q0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f1407a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s0 f1408b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(Context context, s0 s0Var) {
        super(1);
        this.f1407a = context;
        this.f1408b = s0Var;
    }

    public final Object invoke(Object obj) {
        j.f((t.r0) obj, "$this$DisposableEffect");
        Context context = this.f1407a;
        Context applicationContext = context.getApplicationContext();
        s0 s0Var = this.f1408b;
        applicationContext.registerComponentCallbacks(s0Var);
        return new q0(context, s0Var);
    }
}
