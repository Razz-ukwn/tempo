package q7;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import o6.a;

public final class z5 extends n6 {
    public final d3 B;
    public final d3 C;
    public final d3 D;
    public final d3 E;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f13467d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final d3 f13468e;

    public z5(t6 t6Var) {
        super(t6Var);
        g3 g3Var = ((x3) this.f13121a).D;
        x3.j(g3Var);
        this.f13468e = new d3(g3Var, "last_delete_stale", 0);
        g3 g3Var2 = ((x3) this.f13121a).D;
        x3.j(g3Var2);
        this.B = new d3(g3Var2, "backoff", 0);
        g3 g3Var3 = ((x3) this.f13121a).D;
        x3.j(g3Var3);
        this.C = new d3(g3Var3, "last_upload", 0);
        g3 g3Var4 = ((x3) this.f13121a).D;
        x3.j(g3Var4);
        this.D = new d3(g3Var4, "last_upload_attempt", 0);
        g3 g3Var5 = ((x3) this.f13121a).D;
        x3.j(g3Var5);
        this.E = new d3(g3Var5, "midnight_offset", 0);
    }

    public final boolean l() {
        return false;
    }

    @Deprecated
    public final Pair m(String str) {
        y5 y5Var;
        a.C0231a aVar;
        i();
        k4 k4Var = this.f13121a;
        x3 x3Var = (x3) k4Var;
        x3Var.J.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f13467d;
        y5 y5Var2 = (y5) hashMap.get(str);
        if (y5Var2 == null || elapsedRealtime >= y5Var2.f13449c) {
            long o10 = x3Var.C.o(str, g2.f13026c) + elapsedRealtime;
            try {
                long o11 = ((x3) k4Var).C.o(str, g2.f13028d);
                if (o11 > 0) {
                    try {
                        aVar = a.a(((x3) k4Var).f13419a);
                    } catch (PackageManager.NameNotFoundException unused) {
                        if (y5Var2 != null) {
                            if (elapsedRealtime < y5Var2.f13449c + o11) {
                                return new Pair(y5Var2.f13447a, Boolean.valueOf(y5Var2.f13448b));
                            }
                        }
                        aVar = null;
                    }
                } else {
                    aVar = a.a(((x3) k4Var).f13419a);
                }
                if (aVar == null) {
                    return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
                }
                String str2 = aVar.f12194a;
                boolean z10 = aVar.f12195b;
                y5Var = str2 != null ? new y5(o10, str2, z10) : new y5(o10, "", z10);
                hashMap.put(str, y5Var);
                return new Pair(y5Var.f13447a, Boolean.valueOf(y5Var.f13448b));
            } catch (Exception e10) {
                s2 s2Var = x3Var.E;
                x3.l(s2Var);
                s2Var.I.c(e10, "Unable to get advertising id");
                y5Var = new y5(o10, "", false);
            }
        } else {
            return new Pair(y5Var2.f13447a, Boolean.valueOf(y5Var2.f13448b));
        }
    }

    @Deprecated
    public final String n(String str, boolean z10) {
        i();
        String str2 = z10 ? (String) m(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest q10 = a7.q();
        if (q10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, q10.digest(str2.getBytes()))});
    }
}
