package q7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class a3 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final t6 f12891a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12892b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12893c;

    public a3(t6 t6Var) {
        this.f12891a = t6Var;
    }

    public final void a() {
        t6 t6Var = this.f12891a;
        t6Var.f();
        t6Var.h().i();
        t6Var.h().i();
        if (this.f12892b) {
            t6Var.e().J.b("Unregistering connectivity change receiver");
            this.f12892b = false;
            this.f12893c = false;
            try {
                t6Var.H.f13419a.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                t6Var.e().B.c(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        t6 t6Var = this.f12891a;
        t6Var.f();
        String action = intent.getAction();
        t6Var.e().J.c(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            y2 y2Var = t6Var.f13349b;
            t6.H(y2Var);
            boolean m = y2Var.m();
            if (this.f12893c != m) {
                this.f12893c = m;
                t6Var.h().q(new z2(0, this, m));
                return;
            }
            return;
        }
        t6Var.e().E.c(action, "NetworkBroadcastReceiver received unknown action");
    }
}
