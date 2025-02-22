package androidx.compose.ui.platform;

import android.content.Context;

public final class q0 implements t.q0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f1395a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s0 f1396b;

    public q0(Context context, s0 s0Var) {
        this.f1395a = context;
        this.f1396b = s0Var;
    }

    public final void a() {
        this.f1395a.getApplicationContext().unregisterComponentCallbacks(this.f1396b);
    }
}
