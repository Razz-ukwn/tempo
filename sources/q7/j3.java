package q7;

import b7.b;
import b7.c;

public final class j3 {

    /* renamed from: a  reason: collision with root package name */
    public final x3 f13136a;

    public j3(t6 t6Var) {
        this.f13136a = t6Var.H;
    }

    public final boolean a() {
        x3 x3Var = this.f13136a;
        try {
            b a10 = c.a(x3Var.f13419a);
            if (a10 != null) {
                return a10.b(128, "com.android.vending").versionCode >= 80837300;
            }
            s2 s2Var = x3Var.E;
            x3.l(s2Var);
            s2Var.J.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            s2 s2Var2 = x3Var.E;
            x3.l(s2Var2);
            s2Var2.J.c(e10, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
