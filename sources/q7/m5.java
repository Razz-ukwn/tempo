package q7;

import u6.q;

public final class m5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c7 f13204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f13205b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w6 f13206c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x5 f13207d;

    public m5(x5 x5Var, c7 c7Var, boolean z10, w6 w6Var) {
        this.f13207d = x5Var;
        this.f13204a = c7Var;
        this.f13205b = z10;
        this.f13206c = w6Var;
    }

    public final void run() {
        x5 x5Var = this.f13207d;
        j2 j2Var = x5Var.f13433d;
        if (j2Var == null) {
            s2 s2Var = ((x3) x5Var.f13121a).E;
            x3.l(s2Var);
            s2Var.B.b("Discarding data. Failed to set user property");
            return;
        }
        c7 c7Var = this.f13204a;
        q.i(c7Var);
        x5Var.m(j2Var, this.f13205b ? null : this.f13206c, c7Var);
        x5Var.t();
    }
}
