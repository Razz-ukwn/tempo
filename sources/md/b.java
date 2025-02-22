package md;

import androidx.compose.ui.platform.t1;
import cb.c;
import d2.f1;
import ff.m;
import h0.g;
import i0.i;
import k0.a;
import k0.e;
import k0.h;
import p.d;
import q.c0;
import q.l0;
import q.n0;
import rf.l;
import rf.p;
import sf.j;
import sf.k;
import t.e0;
import t.h;
import t.y1;
import t.y2;

public final class b {

    public static final class a extends k implements l<e, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y2<i> f11384a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y2<Float> f11385b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(y2<i> y2Var, y2<Float> y2Var2) {
            super(1);
            this.f11384a = y2Var;
            this.f11385b = y2Var2;
        }

        public final Object invoke(Object obj) {
            long j10;
            e eVar = (e) obj;
            j.f(eVar, "$this$Canvas");
            int i8 = -15;
            while (true) {
                j10 = 4287468195L;
                if (i8 >= -1) {
                    break;
                }
                long u7 = eVar.u();
                a.b p10 = eVar.p();
                long b10 = p10.b();
                p10.a().c();
                p10.f10256a.a(((float) i8) * 10.0f, u7);
                float f10 = (float) 2;
                eVar.a(androidx.databinding.a.f(4287468195L), f1.f(g.b(eVar.q()) / f10, 0.0f), f1.f(g.b(eVar.q()) / f10, 50.0f), 5.0f, 0, (b1.b) null, 1.0f, 3);
                p10.a().l();
                p10.c(b10);
                i8++;
            }
            int i10 = 2;
            while (i10 < 16) {
                long u10 = eVar.u();
                a.b p11 = eVar.p();
                long b11 = p11.b();
                p11.a().c();
                p11.f10256a.a(((float) i10) * 10.0f, u10);
                float f11 = (float) 2;
                long f12 = f1.f(g.b(eVar.q()) / f11, 0.0f);
                long f13 = f1.f(g.b(eVar.q()) / f11, 50.0f);
                a.b bVar = p11;
                eVar.a(androidx.databinding.a.f(j10), f12, f13, 5.0f, 0, (b1.b) null, 1.0f, 3);
                bVar.a().l();
                bVar.c(b11);
                i10++;
                j10 = 4287468195L;
            }
            y2<i> y2Var = this.f11384a;
            long j11 = y2Var.getValue().f9378a;
            y2<Float> y2Var2 = this.f11385b;
            e eVar2 = eVar;
            e.l(eVar2, j11, 115.0f, b.b(y2Var2), f1.f(25.0f, 25.0f), c.f(g.b(eVar.q()) - 50.0f, g.a(eVar.q()) - 50.0f), new h());
            e eVar3 = eVar;
            e.l(eVar3, y2Var.getValue().f9378a, 65.0f, b.b(y2Var2) * -1.0f, f1.f(25.0f, 25.0f), c.f(g.b(eVar.q()) - 50.0f, g.a(eVar.q()) - 50.0f), new h());
            return m.f8717a;
        }
    }

    /* renamed from: md.b$b  reason: collision with other inner class name */
    public static final class C0218b extends k implements p<t.h, Integer, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f11386a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f11387b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0218b(int i8, float f10) {
            super(2);
            this.f11386a = f10;
            this.f11387b = i8;
        }

        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int L = cb.b.L(this.f11387b | 1);
            b.a(this.f11386a, (t.h) obj, L);
            return m.f8717a;
        }
    }

    public static final void a(float f10, t.h hVar, int i8) {
        int i10;
        t.i g10 = hVar.g(758258907);
        if ((i8 & 14) == 0) {
            i10 = (g10.s(f10) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i10 & 11) != 2 || !g10.h()) {
            e0.b bVar = e0.f15020a;
            int i11 = i10 & 14;
            int i12 = q.e.f12683a;
            g10.c(668842840);
            g10.c(841393662);
            Float valueOf = Float.valueOf(0.01f);
            g10.c(1157296644);
            boolean p10 = g10.p(valueOf);
            Object M = g10.M();
            Object obj = h.a.f15061a;
            if (p10 || M == obj) {
                M = b7.a.C(Float.valueOf(0.01f), 3);
                g10.o0(M);
            }
            g10.E(false);
            g10.E(false);
            int i13 = i11 & 14;
            int i14 = i11 << 3;
            y2 a10 = q.e.a(Float.valueOf(f10), n0.f12730a, (q.j) M, Float.valueOf(0.01f), "FloatAnimation", (l) null, g10, (i14 & 458752) | i13 | (i14 & 7168) | (57344 & i14), 0);
            g10.E(false);
            long f11 = b(a10) < 55.0f ? androidx.databinding.a.f(4278241364L) : b(a10) < 65.0f ? androidx.databinding.a.f(4294961923L) : b(a10) < 75.0f ? androidx.databinding.a.f(4294278144L) : androidx.databinding.a.f(4292684545L);
            c0<i> c0Var = d.f12394a;
            g10.c(-451899108);
            c0<i> c0Var2 = d.f12394a;
            j0.c e10 = i.e(f11);
            g10.c(1157296644);
            boolean p11 = g10.p(e10);
            Object M2 = g10.M();
            if (p11 || M2 == obj) {
                M2 = (l0) p.c.f12390a.invoke(i.e(f11));
                g10.o0(M2);
            }
            g10.E(false);
            y2 a11 = q.e.a(new i(f11), (l0) M2, c0Var2, (Float) null, "ColorAnimation", (l) null, g10, 576, 8);
            g10.E(false);
            float f12 = (float) 200;
            int i15 = s.j.f14287a;
            t1.a aVar = t1.f1463a;
            s.k kVar = new s.k(f12, f12, f12, f12);
            g10.c(511388516);
            boolean p12 = g10.p(a11) | g10.p(a10);
            Object M3 = g10.M();
            if (p12 || M3 == obj) {
                M3 = new a(a11, a10);
                g10.o0(M3);
            }
            g10.E(false);
            r.a.a(kVar, (l) M3, g10, 6);
        } else {
            g10.j();
        }
        y1 G = g10.G();
        if (G != null) {
            G.f15286d = new C0218b(i8, f10);
        }
    }

    public static final float b(y2<Float> y2Var) {
        return y2Var.getValue().floatValue();
    }
}
