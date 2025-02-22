package q7;

import android.text.TextUtils;
import cb.c;
import java.util.ArrayList;
import java.util.List;
import u6.q;

public final class l4 {
    public long A;
    public long B;
    public long C;
    public String D;
    public boolean E;
    public long F;
    public long G;

    /* renamed from: a  reason: collision with root package name */
    public final x3 f13162a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13163b;

    /* renamed from: c  reason: collision with root package name */
    public String f13164c;

    /* renamed from: d  reason: collision with root package name */
    public String f13165d;

    /* renamed from: e  reason: collision with root package name */
    public String f13166e;

    /* renamed from: f  reason: collision with root package name */
    public String f13167f;

    /* renamed from: g  reason: collision with root package name */
    public long f13168g;

    /* renamed from: h  reason: collision with root package name */
    public long f13169h;

    /* renamed from: i  reason: collision with root package name */
    public long f13170i;

    /* renamed from: j  reason: collision with root package name */
    public String f13171j;

    /* renamed from: k  reason: collision with root package name */
    public long f13172k;

    /* renamed from: l  reason: collision with root package name */
    public String f13173l;
    public long m;

    /* renamed from: n  reason: collision with root package name */
    public long f13174n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f13175o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f13176p;

    /* renamed from: q  reason: collision with root package name */
    public String f13177q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f13178r;

    /* renamed from: s  reason: collision with root package name */
    public long f13179s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f13180t;

    /* renamed from: u  reason: collision with root package name */
    public String f13181u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f13182v;

    /* renamed from: w  reason: collision with root package name */
    public long f13183w;

    /* renamed from: x  reason: collision with root package name */
    public long f13184x;

    /* renamed from: y  reason: collision with root package name */
    public long f13185y;

    /* renamed from: z  reason: collision with root package name */
    public long f13186z;

    public l4(x3 x3Var, String str) {
        q.i(x3Var);
        q.f(str);
        this.f13162a = x3Var;
        this.f13163b = str;
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        w3Var.i();
    }

    public final long A() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        return this.f13172k;
    }

    public final long B() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        return this.f13179s;
    }

    public final String C() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        return this.f13177q;
    }

    public final String D() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        String str = this.D;
        r((String) null);
        return str;
    }

    public final String E() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        return this.f13163b;
    }

    public final String F() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        return this.f13164c;
    }

    public final String G() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        return this.f13171j;
    }

    public final String H() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        return this.f13167f;
    }

    public final String I() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        return this.f13165d;
    }

    public final void a(String str) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= true ^ c.m(this.f13177q, str);
        this.f13177q = str;
    }

    public final void b(String str) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= !c.m(this.f13164c, str);
        this.f13164c = str;
    }

    public final void c(String str) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= !c.m(this.f13173l, str);
        this.f13173l = str;
    }

    public final void d(String str) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= !c.m(this.f13171j, str);
        this.f13171j = str;
    }

    public final void e(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.f13172k != j10;
        this.f13172k = j10;
    }

    public final void f(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.F != j10;
        this.F = j10;
    }

    public final void g(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.A != j10;
        this.A = j10;
    }

    public final void h(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.B != j10;
        this.B = j10;
    }

    public final void i(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.f13186z != j10;
        this.f13186z = j10;
    }

    public final void j(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.f13185y != j10;
        this.f13185y = j10;
    }

    public final void k(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.C != j10;
        this.C = j10;
    }

    public final void l(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.f13184x != j10;
        this.f13184x = j10;
    }

    public final void m(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.f13174n != j10;
        this.f13174n = j10;
    }

    public final void n(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.f13179s != j10;
        this.f13179s = j10;
    }

    public final void o(String str) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= !c.m(this.f13167f, str);
        this.f13167f = str;
    }

    public final void p(String str) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= true ^ c.m(this.f13165d, str);
        this.f13165d = str;
    }

    public final void q(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.m != j10;
        this.m = j10;
    }

    public final void r(String str) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= !c.m(this.D, str);
        this.D = str;
    }

    public final void s(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.f13170i != j10;
        this.f13170i = j10;
    }

    public final void t(long j10) {
        boolean z10 = true;
        q.a(j10 >= 0);
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        boolean z11 = this.E;
        if (this.f13168g == j10) {
            z10 = false;
        }
        this.E = z11 | z10;
        this.f13168g = j10;
    }

    public final void u(long j10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.f13169h != j10;
        this.f13169h = j10;
    }

    public final void v(boolean z10) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= this.f13175o != z10;
        this.f13175o = z10;
    }

    public final void w(String str) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        this.E |= !c.m(this.f13166e, str);
        this.f13166e = str;
    }

    public final void x(List list) {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        if (!c.m(this.f13180t, list)) {
            this.E = true;
            this.f13180t = list != null ? new ArrayList(list) : null;
        }
    }

    public final boolean y() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        return this.f13176p;
    }

    public final boolean z() {
        w3 w3Var = this.f13162a.F;
        x3.l(w3Var);
        w3Var.i();
        return this.f13182v;
    }
}
