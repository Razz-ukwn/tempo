package s6;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.widget.l;
import com.google.android.gms.internal.measurement.ec;
import com.google.android.gms.internal.measurement.fc;
import q7.a5;
import q7.e6;
import q7.e7;
import q7.f3;
import q7.g2;
import q7.g3;
import q7.g6;
import q7.i6;
import q7.k4;
import q7.s2;
import q7.w3;
import q7.x3;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14767a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14768b;

    public /* synthetic */ k(Object obj, int i8) {
        this.f14767a = i8;
        this.f14768b = obj;
    }

    public final void run() {
        int i8 = this.f14767a;
        Object obj = this.f14768b;
        switch (i8) {
            case 0:
                ((p) obj).a(2, "Service disconnected");
                return;
            case 1:
                e7 e7Var = ((a5) obj).J;
                x3 x3Var = e7Var.f12981a;
                w3 w3Var = x3Var.F;
                x3.l(w3Var);
                w3Var.i();
                if (e7Var.b()) {
                    boolean c3 = e7Var.c();
                    a5 a5Var = x3Var.L;
                    g3 g3Var = x3Var.D;
                    if (c3) {
                        x3.j(g3Var);
                        g3Var.Q.b((String) null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1);
                        x3.k(a5Var);
                        a5Var.p("auto", "_cmpx", bundle);
                    } else {
                        x3.j(g3Var);
                        f3 f3Var = g3Var.Q;
                        String a10 = f3Var.a();
                        if (TextUtils.isEmpty(a10)) {
                            s2 s2Var = x3Var.E;
                            x3.l(s2Var);
                            s2Var.C.b("Cache still valid but referrer not found");
                        } else {
                            long a11 = g3Var.R.a() / 3600000;
                            Uri parse = Uri.parse(a10);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String next : parse.getQueryParameterNames()) {
                                bundle2.putString(next, parse.getQueryParameter(next));
                            }
                            ((Bundle) pair.second).putLong("_cc", (a11 - 1) * 3600000);
                            Object obj2 = pair.first;
                            String str = obj2 == null ? "app" : (String) obj2;
                            x3.k(a5Var);
                            a5Var.p(str, "_cmp", (Bundle) pair.second);
                        }
                        f3Var.b((String) null);
                    }
                    x3.j(g3Var);
                    g3Var.R.b(0);
                    return;
                }
                return;
            default:
                e6 e6Var = (e6) obj;
                l lVar = e6Var.f12980c;
                long j10 = e6Var.f12978a;
                ((i6) lVar.f1059c).i();
                i6 i6Var = (i6) lVar.f1059c;
                s2 s2Var2 = ((x3) i6Var.f13121a).E;
                x3.l(s2Var2);
                s2Var2.I.b("Application going to the background");
                k4 k4Var = i6Var.f13121a;
                g3 g3Var2 = ((x3) k4Var).D;
                x3.j(g3Var2);
                g3Var2.M.a(true);
                if (!((x3) k4Var).C.s()) {
                    g6 g6Var = i6Var.f13126e;
                    g6Var.f13087c.a();
                    g6Var.a(false, false, e6Var.f12979b);
                }
                ((fc) ec.f5266b.f5267a.zza()).zza();
                if (((x3) k4Var).C.r((String) null, g2.f13064v0)) {
                    s2 s2Var3 = ((x3) k4Var).E;
                    x3.l(s2Var3);
                    s2Var3.H.c(Long.valueOf(j10), "Application backgrounded at: timestamp_millis");
                    return;
                }
                a5 a5Var2 = ((x3) k4Var).L;
                x3.k(a5Var2);
                a5Var2.q(j10, new Bundle(), "auto", "_ab");
                return;
        }
    }
}
