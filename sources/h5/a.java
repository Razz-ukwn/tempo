package h5;

import ag.b1;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.j;
import h5.a;
import l5.b;
import l5.l;
import p4.f;
import p4.g;
import p4.h;
import r4.m;
import y4.e;
import y4.k;

public abstract class a<T extends a<T>> implements Cloneable {
    public int B;
    public Drawable C;
    public int D;
    public boolean E = true;
    public int F = -1;
    public int G = -1;
    public f H = k5.a.f10293b;
    public boolean I;
    public boolean J = true;
    public Drawable K;
    public int L;
    public h M = new h();
    public b N = new b();
    public Class<?> O = Object.class;
    public boolean P;
    public Resources.Theme Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U = true;
    public boolean V;

    /* renamed from: a  reason: collision with root package name */
    public int f9226a;

    /* renamed from: b  reason: collision with root package name */
    public float f9227b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public m f9228c = m.f13932c;

    /* renamed from: d  reason: collision with root package name */
    public j f9229d = j.f4074c;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f9230e;

    public static boolean i(int i8, int i10) {
        return (i8 & i10) != 0;
    }

    public T a(a<?> aVar) {
        if (this.R) {
            return clone().a(aVar);
        }
        if (i(aVar.f9226a, 2)) {
            this.f9227b = aVar.f9227b;
        }
        if (i(aVar.f9226a, 262144)) {
            this.S = aVar.S;
        }
        if (i(aVar.f9226a, 1048576)) {
            this.V = aVar.V;
        }
        if (i(aVar.f9226a, 4)) {
            this.f9228c = aVar.f9228c;
        }
        if (i(aVar.f9226a, 8)) {
            this.f9229d = aVar.f9229d;
        }
        if (i(aVar.f9226a, 16)) {
            this.f9230e = aVar.f9230e;
            this.B = 0;
            this.f9226a &= -33;
        }
        if (i(aVar.f9226a, 32)) {
            this.B = aVar.B;
            this.f9230e = null;
            this.f9226a &= -17;
        }
        if (i(aVar.f9226a, 64)) {
            this.C = aVar.C;
            this.D = 0;
            this.f9226a &= -129;
        }
        if (i(aVar.f9226a, 128)) {
            this.D = aVar.D;
            this.C = null;
            this.f9226a &= -65;
        }
        if (i(aVar.f9226a, 256)) {
            this.E = aVar.E;
        }
        if (i(aVar.f9226a, 512)) {
            this.G = aVar.G;
            this.F = aVar.F;
        }
        if (i(aVar.f9226a, 1024)) {
            this.H = aVar.H;
        }
        if (i(aVar.f9226a, 4096)) {
            this.O = aVar.O;
        }
        if (i(aVar.f9226a, 8192)) {
            this.K = aVar.K;
            this.L = 0;
            this.f9226a &= -16385;
        }
        if (i(aVar.f9226a, 16384)) {
            this.L = aVar.L;
            this.K = null;
            this.f9226a &= -8193;
        }
        if (i(aVar.f9226a, 32768)) {
            this.Q = aVar.Q;
        }
        if (i(aVar.f9226a, 65536)) {
            this.J = aVar.J;
        }
        if (i(aVar.f9226a, 131072)) {
            this.I = aVar.I;
        }
        if (i(aVar.f9226a, 2048)) {
            this.N.putAll(aVar.N);
            this.U = aVar.U;
        }
        if (i(aVar.f9226a, 524288)) {
            this.T = aVar.T;
        }
        if (!this.J) {
            this.N.clear();
            this.I = false;
            this.f9226a = this.f9226a & -2049 & -131073;
            this.U = true;
        }
        this.f9226a |= aVar.f9226a;
        this.M.f12464b.j(aVar.M.f12464b);
        n();
        return this;
    }

    /* renamed from: b */
    public T clone() {
        try {
            T t2 = (a) super.clone();
            h hVar = new h();
            t2.M = hVar;
            hVar.f12464b.j(this.M.f12464b);
            b bVar = new b();
            t2.N = bVar;
            bVar.putAll(this.N);
            t2.P = false;
            t2.R = false;
            return t2;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.f9227b, this.f9227b) == 0 && this.B == aVar.B && l.b(this.f9230e, aVar.f9230e) && this.D == aVar.D && l.b(this.C, aVar.C) && this.L == aVar.L && l.b(this.K, aVar.K) && this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && this.I == aVar.I && this.J == aVar.J && this.S == aVar.S && this.T == aVar.T && this.f9228c.equals(aVar.f9228c) && this.f9229d == aVar.f9229d && this.M.equals(aVar.M) && this.N.equals(aVar.N) && this.O.equals(aVar.O) && l.b(this.H, aVar.H) && l.b(this.Q, aVar.Q);
        }
    }

    public final T f(Class<?> cls) {
        if (this.R) {
            return clone().f(cls);
        }
        this.O = cls;
        this.f9226a |= 4096;
        n();
        return this;
    }

    public final T g(m mVar) {
        if (this.R) {
            return clone().g(mVar);
        }
        b1.b(mVar);
        this.f9228c = mVar;
        this.f9226a |= 4;
        n();
        return this;
    }

    public final T h(int i8) {
        if (this.R) {
            return clone().h(i8);
        }
        this.B = i8;
        this.f9230e = null;
        this.f9226a = (this.f9226a | 32) & -17;
        n();
        return this;
    }

    public final int hashCode() {
        float f10 = this.f9227b;
        char[] cArr = l.f11007a;
        return l.f(l.f(l.f(l.f(l.f(l.f(l.f((((((((((((((l.f((l.f((l.f(((Float.floatToIntBits(f10) + 527) * 31) + this.B, this.f9230e) * 31) + this.D, this.C) * 31) + this.L, this.K) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0), this.f9228c), this.f9229d), this.M), this.N), this.O), this.H), this.Q);
    }

    public final a j(k kVar, e eVar) {
        if (this.R) {
            return clone().j(kVar, eVar);
        }
        g<k> gVar = k.f17197f;
        b1.b(kVar);
        o(gVar, kVar);
        return u(eVar, false);
    }

    public final T k(int i8, int i10) {
        if (this.R) {
            return clone().k(i8, i10);
        }
        this.G = i8;
        this.F = i10;
        this.f9226a |= 512;
        n();
        return this;
    }

    public final T l(int i8) {
        if (this.R) {
            return clone().l(i8);
        }
        this.D = i8;
        this.C = null;
        this.f9226a = (this.f9226a | 128) & -65;
        n();
        return this;
    }

    public final a m() {
        j jVar = j.f4075d;
        if (this.R) {
            return clone().m();
        }
        this.f9229d = jVar;
        this.f9226a |= 8;
        n();
        return this;
    }

    public final void n() {
        if (this.P) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [p4.g<Y>, java.lang.Object, p4.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Y> T o(p4.g<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.R
            if (r0 == 0) goto L_0x000d
            h5.a r0 = r1.clone()
            h5.a r2 = r0.o(r2, r3)
            return r2
        L_0x000d:
            ag.b1.b(r2)
            ag.b1.b(r3)
            p4.h r0 = r1.M
            l5.b r0 = r0.f12464b
            r0.put(r2, r3)
            r1.n()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.a.o(p4.g, java.lang.Object):h5.a");
    }

    public final a p(k5.b bVar) {
        if (this.R) {
            return clone().p(bVar);
        }
        this.H = bVar;
        this.f9226a |= 1024;
        n();
        return this;
    }

    public final T q(float f10) {
        if (this.R) {
            return clone().q(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f9227b = f10;
        this.f9226a |= 2;
        n();
        return this;
    }

    public final a r() {
        if (this.R) {
            return clone().r();
        }
        this.E = false;
        this.f9226a |= 256;
        n();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [p4.l, p4.l<Y>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Y> T t(java.lang.Class<Y> r2, p4.l<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.R
            if (r0 == 0) goto L_0x000d
            h5.a r0 = r1.clone()
            h5.a r2 = r0.t(r2, r3, r4)
            return r2
        L_0x000d:
            ag.b1.b(r3)
            l5.b r0 = r1.N
            r0.put(r2, r3)
            int r2 = r1.f9226a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.J = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f9226a = r2
            r0 = 0
            r1.U = r0
            if (r4 == 0) goto L_0x002d
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f9226a = r2
            r1.I = r3
        L_0x002d:
            r1.n()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.a.t(java.lang.Class, p4.l, boolean):h5.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [p4.l, p4.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T u(p4.l<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.R
            if (r0 == 0) goto L_0x000d
            h5.a r0 = r2.clone()
            h5.a r3 = r0.u(r3, r4)
            return r3
        L_0x000d:
            y4.n r0 = new y4.n
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.t(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.t(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.t(r1, r0, r4)
            c5.d r0 = new c5.d
            r0.<init>(r3)
            java.lang.Class<c5.c> r3 = c5.c.class
            r2.t(r3, r0, r4)
            r2.n()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.a.u(p4.l, boolean):h5.a");
    }

    public final a v(k.d dVar, y4.h hVar) {
        if (this.R) {
            return clone().v(dVar, hVar);
        }
        g<k> gVar = k.f17197f;
        b1.b(dVar);
        o(gVar, dVar);
        return u(hVar, true);
    }

    public final a w() {
        if (this.R) {
            return clone().w();
        }
        this.V = true;
        this.f9226a |= 1048576;
        n();
        return this;
    }
}
