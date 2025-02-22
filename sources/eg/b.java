package eg;

import androidx.fragment.app.f1;
import cb.d;
import eg.e;
import fg.c;
import gg.a;
import java.util.List;
import q.n;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f7994a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7995b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7996c;

    /* renamed from: d  reason: collision with root package name */
    public final float f7997d;

    /* renamed from: e  reason: collision with root package name */
    public final float f7998e;

    /* renamed from: f  reason: collision with root package name */
    public final List<gg.b> f7999f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Integer> f8000g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f8001h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8002i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8003j;

    /* renamed from: k  reason: collision with root package name */
    public final e f8004k;

    /* renamed from: l  reason: collision with root package name */
    public final int f8005l;
    public final f m;

    /* renamed from: n  reason: collision with root package name */
    public final c f8006n;

    public b() {
        throw null;
    }

    public b(List list, e.b bVar, c cVar) {
        List<gg.b> P = d.P(gg.b.f8996d, gg.b.f8997e, gg.b.f8998f);
        List<a> P2 = d.P(a.d.f8995a, a.C0161a.f8990a);
        f fVar = new f(0);
        this.f7994a = 0;
        this.f7995b = 360;
        this.f7996c = 0.0f;
        this.f7997d = 30.0f;
        this.f7998e = 0.9f;
        this.f7999f = P;
        this.f8000g = list;
        this.f8001h = P2;
        this.f8002i = 2000;
        this.f8003j = true;
        this.f8004k = bVar;
        this.f8005l = 0;
        this.m = fVar;
        this.f8006n = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (eg.b) r8;
        r1 = r8.f7994a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof eg.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            eg.b r8 = (eg.b) r8
            int r1 = r8.f7994a
            int r3 = r7.f7994a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r7.f7995b
            int r3 = r8.f7995b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            float r1 = r7.f7996c
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r3 = r8.f7996c
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x002d
            return r2
        L_0x002d:
            float r1 = r7.f7997d
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r3 = r8.f7997d
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x0040
            return r2
        L_0x0040:
            float r1 = r7.f7998e
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r3 = r8.f7998e
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x0053
            return r2
        L_0x0053:
            java.util.List<gg.b> r1 = r7.f7999f
            java.util.List<gg.b> r3 = r8.f7999f
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x005e
            return r2
        L_0x005e:
            java.util.List<java.lang.Integer> r1 = r7.f8000g
            java.util.List<java.lang.Integer> r3 = r8.f8000g
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x0069
            return r2
        L_0x0069:
            java.util.List<gg.a> r1 = r7.f8001h
            java.util.List<gg.a> r3 = r8.f8001h
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x0074
            return r2
        L_0x0074:
            long r3 = r7.f8002i
            long r5 = r8.f8002i
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x007d
            return r2
        L_0x007d:
            boolean r1 = r7.f8003j
            boolean r3 = r8.f8003j
            if (r1 == r3) goto L_0x0084
            return r2
        L_0x0084:
            eg.e r1 = r7.f8004k
            eg.e r3 = r8.f8004k
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x008f
            return r2
        L_0x008f:
            int r1 = r7.f8005l
            int r3 = r8.f8005l
            if (r1 == r3) goto L_0x0096
            return r2
        L_0x0096:
            eg.f r1 = r7.m
            eg.f r3 = r8.m
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x00a1
            return r2
        L_0x00a1:
            fg.c r1 = r7.f8006n
            fg.c r8 = r8.f8006n
            boolean r8 = sf.j.a(r1, r8)
            if (r8 != 0) goto L_0x00ac
            return r2
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int a10 = n.a(this.f7998e, n.a(this.f7997d, n.a(this.f7996c, f1.c(this.f7995b, Integer.hashCode(this.f7994a) * 31, 31), 31), 31), 31);
        int hashCode = this.f8000g.hashCode();
        int hashCode2 = this.f8001h.hashCode();
        int a11 = h0.e.a(this.f8002i, (hashCode2 + ((hashCode + ((this.f7999f.hashCode() + a10) * 31)) * 31)) * 31, 31);
        boolean z10 = this.f8003j;
        if (z10) {
            z10 = true;
        }
        int hashCode3 = this.f8004k.hashCode();
        int c3 = f1.c(this.f8005l, (hashCode3 + ((a11 + (z10 ? 1 : 0)) * 31)) * 31, 31);
        return this.f8006n.hashCode() + ((this.m.hashCode() + c3) * 31);
    }

    public final String toString() {
        return "Party(angle=" + this.f7994a + ", spread=" + this.f7995b + ", speed=" + this.f7996c + ", maxSpeed=" + this.f7997d + ", damping=" + this.f7998e + ", size=" + this.f7999f + ", colors=" + this.f8000g + ", shapes=" + this.f8001h + ", timeToLive=" + this.f8002i + ", fadeOutEnabled=" + this.f8003j + ", position=" + this.f8004k + ", delay=" + this.f8005l + ", rotation=" + this.m + ", emitter=" + this.f8006n + ')';
    }
}
