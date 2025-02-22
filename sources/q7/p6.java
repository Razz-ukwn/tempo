package q7;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.t2;
import com.google.android.gms.internal.measurement.tc;
import com.google.android.gms.internal.measurement.uc;
import java.util.HashMap;

public final class p6 extends m6 {
    public p6(t6 t6Var) {
        super(t6Var);
    }

    public final o6 j(String str) {
        ((uc) tc.f5539b.f5540a.zza()).zza();
        x3 x3Var = (x3) this.f13121a;
        o6 o6Var = null;
        if (x3Var.C.r((String) null, g2.f13046m0)) {
            s2 s2Var = x3Var.E;
            x3.l(s2Var);
            s2Var.J.b("sgtm feature flag enabled.");
            t6 t6Var = this.f13208b;
            k kVar = t6Var.f13350c;
            t6.H(kVar);
            l4 C = kVar.C(str);
            if (C == null) {
                return new o6(k(str));
            }
            if (C.z()) {
                s2 s2Var2 = x3Var.E;
                x3.l(s2Var2);
                s2Var2.J.b("sgtm upload enabled in manifest.");
                r3 r3Var = t6Var.f13347a;
                t6.H(r3Var);
                t2 s10 = r3Var.s(C.E());
                if (s10 != null) {
                    String C2 = s10.C();
                    if (!TextUtils.isEmpty(C2)) {
                        String B = s10.B();
                        s2 s2Var3 = x3Var.E;
                        x3.l(s2Var3);
                        s2Var3.J.d(C2, true != TextUtils.isEmpty(B) ? "N" : "Y", "sgtm configured with upload_url, server_info");
                        if (TextUtils.isEmpty(B)) {
                            x3Var.getClass();
                            o6Var = new o6(C2);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", B);
                            o6Var = new o6(C2, hashMap);
                        }
                    }
                }
            }
            if (o6Var != null) {
                return o6Var;
            }
        }
        return new o6(k(str));
    }

    public final String k(String str) {
        r3 r3Var = this.f13208b.f13347a;
        t6.H(r3Var);
        r3Var.i();
        r3Var.o(str);
        String str2 = (String) r3Var.H.getOrDefault(str, null);
        if (TextUtils.isEmpty(str2)) {
            return (String) g2.f13057s.a((Object) null);
        }
        Uri parse = Uri.parse((String) g2.f13057s.a((Object) null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(str2 + "." + authority);
        return buildUpon.build().toString();
    }
}
