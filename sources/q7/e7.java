package q7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

public final class e7 {

    /* renamed from: a  reason: collision with root package name */
    public final x3 f12981a;

    public e7(x3 x3Var) {
        this.f12981a = x3Var;
    }

    public final void a(Bundle bundle, String str) {
        String str2;
        x3 x3Var = this.f12981a;
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        w3Var.i();
        if (!x3Var.g()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                g3 g3Var = x3Var.D;
                x3.j(g3Var);
                g3Var.Q.b(str2);
                x3.j(g3Var);
                x3Var.J.getClass();
                g3Var.R.b(System.currentTimeMillis());
            }
        }
    }

    public final boolean b() {
        g3 g3Var = this.f12981a.D;
        x3.j(g3Var);
        return g3Var.R.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        x3 x3Var = this.f12981a;
        x3Var.J.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        g3 g3Var = x3Var.D;
        x3.j(g3Var);
        return currentTimeMillis - g3Var.R.a() > x3Var.C.o((String) null, g2.T);
    }
}
