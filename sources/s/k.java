package s;

import androidx.compose.ui.platform.t1;
import androidx.compose.ui.platform.v1;
import f1.e;
import ff.m;
import q.n;
import q0.j;
import q0.v;
import rf.l;

public final class k extends v1 implements j {

    /* renamed from: b  reason: collision with root package name */
    public final float f14288b;

    /* renamed from: c  reason: collision with root package name */
    public final float f14289c;

    /* renamed from: d  reason: collision with root package name */
    public final float f14290d;

    /* renamed from: e  reason: collision with root package name */
    public final float f14291e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14292f;

    public static final class a extends sf.k implements l<v.a, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v f14293a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v vVar) {
            super(1);
            this.f14293a = vVar;
        }

        public final Object invoke(Object obj) {
            v.a aVar = (v.a) obj;
            sf.j.f(aVar, "$this$layout");
            v.a.e(aVar, this.f14293a);
            return m.f8717a;
        }
    }

    public k() {
        throw null;
    }

    public k(float f10, float f11, float f12, float f13) {
        super(t1.f1463a);
        this.f14288b = f10;
        this.f14289c = f11;
        this.f14290d = f12;
        this.f14291e = f13;
        this.f14292f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r8 != Integer.MAX_VALUE) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q0.o d(q0.q r12, q0.m r13, long r14) {
        /*
            r11 = this;
            java.lang.String r0 = "$this$measure"
            sf.j.f(r12, r0)
            float r0 = r11.f14290d
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r2 = f1.e.a(r0, r1)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            if (r2 != 0) goto L_0x002c
            f1.e r2 = new f1.e
            r2.<init>(r0)
            float r5 = (float) r4
            f1.e r6 = new f1.e
            r6.<init>(r5)
            int r5 = r2.compareTo(r6)
            if (r5 >= 0) goto L_0x0025
            r2 = r6
        L_0x0025:
            float r2 = r2.f8028a
            int r2 = r12.r(r2)
            goto L_0x002d
        L_0x002c:
            r2 = r3
        L_0x002d:
            float r5 = r11.f14291e
            boolean r6 = f1.e.a(r5, r1)
            if (r6 != 0) goto L_0x004e
            f1.e r6 = new f1.e
            r6.<init>(r5)
            float r7 = (float) r4
            f1.e r8 = new f1.e
            r8.<init>(r7)
            int r7 = r6.compareTo(r8)
            if (r7 >= 0) goto L_0x0047
            r6 = r8
        L_0x0047:
            float r6 = r6.f8028a
            int r6 = r12.r(r6)
            goto L_0x004f
        L_0x004e:
            r6 = r3
        L_0x004f:
            float r7 = r11.f14288b
            boolean r8 = f1.e.a(r7, r1)
            if (r8 != 0) goto L_0x0064
            int r8 = r12.r(r7)
            if (r8 <= r2) goto L_0x005e
            r8 = r2
        L_0x005e:
            if (r8 >= 0) goto L_0x0061
            r8 = r4
        L_0x0061:
            if (r8 == r3) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r8 = r4
        L_0x0065:
            float r9 = r11.f14289c
            boolean r10 = f1.e.a(r9, r1)
            if (r10 != 0) goto L_0x007a
            int r10 = r12.r(r9)
            if (r10 <= r6) goto L_0x0074
            r10 = r6
        L_0x0074:
            if (r10 >= 0) goto L_0x0077
            r10 = r4
        L_0x0077:
            if (r10 == r3) goto L_0x007a
            r4 = r10
        L_0x007a:
            long r2 = f1.b.a(r8, r2, r4, r6)
            boolean r4 = r11.f14292f
            if (r4 == 0) goto L_0x00c7
            int r0 = f1.a.d(r2)
            int r1 = f1.a.d(r14)
            int r4 = f1.a.b(r14)
            int r0 = d2.f1.q(r0, r1, r4)
            int r1 = f1.a.b(r2)
            int r4 = f1.a.d(r14)
            int r5 = f1.a.b(r14)
            int r1 = d2.f1.q(r1, r4, r5)
            int r4 = f1.a.c(r2)
            int r5 = f1.a.c(r14)
            int r6 = f1.a.a(r14)
            int r4 = d2.f1.q(r4, r5, r6)
            int r2 = f1.a.a(r2)
            int r3 = f1.a.c(r14)
            int r14 = f1.a.a(r14)
            int r14 = d2.f1.q(r2, r3, r14)
            long r14 = f1.b.a(r0, r1, r4, r14)
            goto L_0x0123
        L_0x00c7:
            boolean r4 = f1.e.a(r7, r1)
            if (r4 != 0) goto L_0x00d2
            int r4 = f1.a.d(r2)
            goto L_0x00dd
        L_0x00d2:
            int r4 = f1.a.d(r14)
            int r6 = f1.a.b(r2)
            if (r4 <= r6) goto L_0x00dd
            r4 = r6
        L_0x00dd:
            boolean r0 = f1.e.a(r0, r1)
            if (r0 != 0) goto L_0x00e8
            int r0 = f1.a.b(r2)
            goto L_0x00f3
        L_0x00e8:
            int r0 = f1.a.b(r14)
            int r6 = f1.a.d(r2)
            if (r0 >= r6) goto L_0x00f3
            r0 = r6
        L_0x00f3:
            boolean r6 = f1.e.a(r9, r1)
            if (r6 != 0) goto L_0x00fe
            int r6 = f1.a.c(r2)
            goto L_0x0109
        L_0x00fe:
            int r6 = f1.a.c(r14)
            int r7 = f1.a.a(r2)
            if (r6 <= r7) goto L_0x0109
            r6 = r7
        L_0x0109:
            boolean r1 = f1.e.a(r5, r1)
            if (r1 != 0) goto L_0x0114
            int r14 = f1.a.a(r2)
            goto L_0x011f
        L_0x0114:
            int r14 = f1.a.a(r14)
            int r15 = f1.a.c(r2)
            if (r14 >= r15) goto L_0x011f
            r14 = r15
        L_0x011f:
            long r14 = f1.b.a(r4, r0, r6, r14)
        L_0x0123:
            q0.v r13 = r13.i(r14)
            int r14 = r13.f12809a
            int r15 = r13.f12810b
            s.k$a r0 = new s.k$a
            r0.<init>(r13)
            gf.t r13 = gf.t.f8979a
            q0.p r12 = r12.g(r14, r15, r13, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: s.k.d(q0.q, q0.m, long):q0.o");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return e.a(this.f14288b, kVar.f14288b) && e.a(this.f14289c, kVar.f14289c) && e.a(this.f14290d, kVar.f14290d) && e.a(this.f14291e, kVar.f14291e) && this.f14292f == kVar.f14292f;
    }

    public final int hashCode() {
        return n.a(this.f14291e, n.a(this.f14290d, n.a(this.f14289c, Float.hashCode(this.f14288b) * 31, 31), 31), 31);
    }
}
