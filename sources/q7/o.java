package q7;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import u6.q;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f13234a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13235b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13236c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13237d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13238e;

    /* renamed from: f  reason: collision with root package name */
    public final q f13239f;

    public o(x3 x3Var, String str, String str2, String str3, long j10, Bundle bundle) {
        q qVar;
        q.f(str2);
        q.f(str3);
        this.f13234a = str2;
        this.f13235b = str3;
        this.f13236c = true == TextUtils.isEmpty(str) ? null : str;
        this.f13237d = j10;
        this.f13238e = 0;
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    s2 s2Var = x3Var.E;
                    x3.l(s2Var);
                    s2Var.B.b("Param name can't be null");
                    it.remove();
                } else {
                    a7 a7Var = x3Var.H;
                    x3.j(a7Var);
                    Object m = a7Var.m(bundle2.get(next), next);
                    if (m == null) {
                        s2 s2Var2 = x3Var.E;
                        x3.l(s2Var2);
                        s2Var2.E.c(x3Var.I.e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        a7 a7Var2 = x3Var.H;
                        x3.j(a7Var2);
                        a7Var2.A(bundle2, next, m);
                    }
                }
            }
            qVar = new q(bundle2);
        } else {
            qVar = new q(new Bundle());
        }
        this.f13239f = qVar;
    }

    public final o a(x3 x3Var, long j10) {
        return new o(x3Var, this.f13236c, this.f13234a, this.f13235b, this.f13237d, j10, this.f13239f);
    }

    public final String toString() {
        String qVar = this.f13239f.toString();
        return "Event{appId='" + this.f13234a + "', name='" + this.f13235b + "', params=" + qVar + "}";
    }

    public o(x3 x3Var, String str, String str2, String str3, long j10, long j11, q qVar) {
        q.f(str2);
        q.f(str3);
        q.i(qVar);
        this.f13234a = str2;
        this.f13235b = str3;
        this.f13236c = true == TextUtils.isEmpty(str) ? null : str;
        this.f13237d = j10;
        this.f13238e = j11;
        if (j11 != 0 && j11 > j10) {
            s2 s2Var = x3Var.E;
            x3.l(s2Var);
            s2Var.E.d(s2.r(str2), s2.r(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f13239f = qVar;
    }
}
