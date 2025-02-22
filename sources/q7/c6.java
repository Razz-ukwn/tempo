package q7;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.a1;
import u6.q;

public final class c6 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12947a;

    public c6(Context context) {
        q.i(context);
        this.f12947a = context;
    }

    public final void a(Intent intent) {
        if (intent == null) {
            c().B.b("onRebind called with null intent");
            return;
        }
        c().J.c(intent.getAction(), "onRebind called. action");
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().B.b("onUnbind called with null intent");
            return;
        }
        c().J.c(intent.getAction(), "onUnbind called for intent. action");
    }

    public final s2 c() {
        s2 s2Var = x3.t(this.f12947a, (a1) null, (Long) null).E;
        x3.l(s2Var);
        return s2Var;
    }
}
