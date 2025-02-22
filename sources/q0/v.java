package q0;

import b3.l0;
import d2.f1;
import e9.c;
import f1.h;
import f1.i;
import f1.j;
import ff.m;
import i0.k;
import q0.w;
import rf.l;
import s0.f0;
import s0.k0;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public int f12809a;

    /* renamed from: b  reason: collision with root package name */
    public int f12810b;

    /* renamed from: c  reason: collision with root package name */
    public long f12811c = l0.a(0, 0);

    /* renamed from: d  reason: collision with root package name */
    public long f12812d = w.f12818b;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0251a f12813a = new C0251a(0);

        /* renamed from: b  reason: collision with root package name */
        public static j f12814b = j.f8039a;

        /* renamed from: c  reason: collision with root package name */
        public static int f12815c;

        /* renamed from: d  reason: collision with root package name */
        public static h f12816d;

        /* renamed from: q0.v$a$a  reason: collision with other inner class name */
        public static final class C0251a extends a {
            public C0251a(int i8) {
            }

            public static final boolean g(C0251a aVar, k0 k0Var) {
                aVar.getClass();
                boolean z10 = false;
                if (k0Var == null) {
                    a.f12816d = null;
                    return false;
                }
                boolean z11 = k0Var.B;
                k0 O = k0Var.O();
                if (O != null && O.B) {
                    z10 = true;
                }
                if (z10) {
                    k0Var.B = true;
                }
                f0 f0Var = k0Var.M().W;
                if (k0Var.B || k0Var.f14379e) {
                    a.f12816d = null;
                } else {
                    a.f12816d = k0Var.K();
                }
                return z11;
            }

            public final j a() {
                return a.f12814b;
            }

            public final int b() {
                return a.f12815c;
            }
        }

        public static void c(C0251a aVar, v vVar, int i8, int i10) {
            aVar.getClass();
            long a10 = c.a(i8, i10);
            long B = vVar.B();
            vVar.D(c.a(((int) (a10 >> 32)) + ((int) (B >> 32)), h.a(B) + h.a(a10)), 0.0f, (l<? super k, m>) null);
        }

        public static void d(v vVar, long j10, float f10) {
            sf.j.f(vVar, "$this$place");
            long B = vVar.B();
            vVar.D(c.a(((int) (j10 >> 32)) + ((int) (B >> 32)), h.a(B) + h.a(j10)), f10, (l<? super k, m>) null);
        }

        public static void e(a aVar, v vVar) {
            aVar.getClass();
            sf.j.f(vVar, "<this>");
            long a10 = c.a(0, 0);
            if (aVar.a() == j.f8039a || aVar.b() == 0) {
                long B = vVar.B();
                vVar.D(c.a(((int) (a10 >> 32)) + ((int) (B >> 32)), h.a(B) + h.a(a10)), 0.0f, (l<? super k, m>) null);
                return;
            }
            long a11 = c.a((aVar.b() - vVar.f12809a) - ((int) (a10 >> 32)), h.a(a10));
            long B2 = vVar.B();
            vVar.D(c.a(((int) (a11 >> 32)) + ((int) (B2 >> 32)), h.a(B2) + h.a(a11)), 0.0f, (l<? super k, m>) null);
        }

        public static void f(a aVar, v vVar) {
            w.a aVar2 = w.f12817a;
            aVar.getClass();
            sf.j.f(vVar, "<this>");
            sf.j.f(aVar2, "layerBlock");
            long a10 = c.a(0, 0);
            if (aVar.a() == j.f8039a || aVar.b() == 0) {
                long B = vVar.B();
                vVar.D(c.a(((int) (a10 >> 32)) + ((int) (B >> 32)), h.a(B) + h.a(a10)), 0.0f, aVar2);
                return;
            }
            long a11 = c.a((aVar.b() - vVar.f12809a) - ((int) (a10 >> 32)), h.a(a10));
            long B2 = vVar.B();
            vVar.D(c.a(((int) (a11 >> 32)) + ((int) (B2 >> 32)), h.a(B2) + h.a(a11)), 0.0f, aVar2);
        }

        public abstract j a();

        public abstract int b();
    }

    public final long B() {
        int i8 = this.f12809a;
        long j10 = this.f12811c;
        return c.a((i8 - ((int) (j10 >> 32))) / 2, (this.f12810b - i.a(j10)) / 2);
    }

    public int C() {
        return (int) (this.f12811c >> 32);
    }

    public abstract void D(long j10, float f10, l<? super k, m> lVar);

    public final void E() {
        this.f12809a = f1.q((int) (this.f12811c >> 32), f1.a.d(this.f12812d), f1.a.b(this.f12812d));
        this.f12810b = f1.q(i.a(this.f12811c), f1.a.c(this.f12812d), f1.a.a(this.f12812d));
    }

    public final void F(long j10) {
        if (!(this.f12811c == j10)) {
            this.f12811c = j10;
            E();
        }
    }

    public final void G(long j10) {
        if (!(this.f12812d == j10)) {
            this.f12812d = j10;
            E();
        }
    }
}
