package b0;

import b0.m;
import b7.a;
import rf.l;
import sf.j;
import t.w2;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public k f2910a;

    /* renamed from: b  reason: collision with root package name */
    public int f2911b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2912c;

    /* renamed from: d  reason: collision with root package name */
    public int f2913d;

    public h(int i8, k kVar) {
        int i10;
        int i11;
        this.f2910a = kVar;
        this.f2911b = i8;
        if (i8 != 0) {
            k e10 = e();
            m.a aVar = m.f2940a;
            j.f(e10, "invalid");
            int[] iArr = e10.f2934d;
            if (iArr != null) {
                i8 = iArr[0];
            } else {
                long j10 = e10.f2932b;
                int i12 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
                int i13 = e10.f2933c;
                if (i12 != 0) {
                    i11 = a.i(j10);
                } else {
                    long j11 = e10.f2931a;
                    if (j11 != 0) {
                        i13 += 64;
                        i11 = a.i(j11);
                    }
                }
                i8 = i11 + i13;
            }
            synchronized (m.f2942c) {
                i10 = m.f2945f.a(i8);
            }
        } else {
            i10 = -1;
        }
        this.f2913d = i10;
    }

    public static void o(h hVar) {
        m.f2941b.h(hVar);
    }

    public final void a() {
        synchronized (m.f2942c) {
            b();
            n();
            ff.m mVar = ff.m.f8717a;
        }
    }

    public void b() {
        m.f2943d = m.f2943d.b(d());
    }

    public void c() {
        this.f2912c = true;
        synchronized (m.f2942c) {
            int i8 = this.f2913d;
            if (i8 >= 0) {
                m.r(i8);
                this.f2913d = -1;
            }
            ff.m mVar = ff.m.f8717a;
        }
    }

    public int d() {
        return this.f2911b;
    }

    public k e() {
        return this.f2910a;
    }

    public abstract l<Object, ff.m> f();

    public abstract boolean g();

    public abstract l<Object, ff.m> h();

    public final h i() {
        w2 w2Var = m.f2941b;
        h hVar = (h) w2Var.f();
        w2Var.h(this);
        return hVar;
    }

    public abstract void j(h hVar);

    public abstract void k(h hVar);

    public abstract void l();

    public abstract void m(g0 g0Var);

    public void n() {
        int i8 = this.f2913d;
        if (i8 >= 0) {
            m.r(i8);
            this.f2913d = -1;
        }
    }

    public void p(int i8) {
        this.f2911b = i8;
    }

    public void q(k kVar) {
        j.f(kVar, "<set-?>");
        this.f2910a = kVar;
    }

    public abstract h r(l<Object, ff.m> lVar);
}
