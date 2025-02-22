package l1;

import j1.d;
import java.util.ArrayList;

public final class f extends j {
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 2;
    public int U0 = 2;
    public int V0 = 0;
    public int W0 = -1;
    public int X0 = 0;
    public final ArrayList<a> Y0 = new ArrayList<>();
    public d[] Z0 = null;

    /* renamed from: a1  reason: collision with root package name */
    public d[] f10890a1 = null;

    /* renamed from: b1  reason: collision with root package name */
    public int[] f10891b1 = null;

    /* renamed from: c1  reason: collision with root package name */
    public d[] f10892c1;

    /* renamed from: d1  reason: collision with root package name */
    public int f10893d1 = 0;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f10894a;

        /* renamed from: b  reason: collision with root package name */
        public d f10895b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f10896c = 0;

        /* renamed from: d  reason: collision with root package name */
        public c f10897d;

        /* renamed from: e  reason: collision with root package name */
        public c f10898e;

        /* renamed from: f  reason: collision with root package name */
        public c f10899f;

        /* renamed from: g  reason: collision with root package name */
        public c f10900g;

        /* renamed from: h  reason: collision with root package name */
        public int f10901h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f10902i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f10903j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f10904k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f10905l = 0;
        public int m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f10906n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f10907o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f10908p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f10909q = 0;

        public a(int i8, c cVar, c cVar2, c cVar3, c cVar4, int i10) {
            this.f10894a = i8;
            this.f10897d = cVar;
            this.f10898e = cVar2;
            this.f10899f = cVar3;
            this.f10900g = cVar4;
            this.f10901h = f.this.f10923y0;
            this.f10902i = f.this.f10919u0;
            this.f10903j = f.this.f10924z0;
            this.f10904k = f.this.f10920v0;
            this.f10909q = i10;
        }

        public final void a(d dVar) {
            int i8 = this.f10894a;
            int i10 = 0;
            f fVar = f.this;
            if (i8 == 0) {
                int V = fVar.V(this.f10909q, dVar);
                if (dVar.V[0] == 3) {
                    this.f10908p++;
                    V = 0;
                }
                int i11 = fVar.R0;
                if (dVar.f10859j0 != 8) {
                    i10 = i11;
                }
                this.f10905l = V + i10 + this.f10905l;
                int U = fVar.U(this.f10909q, dVar);
                if (this.f10895b == null || this.f10896c < U) {
                    this.f10895b = dVar;
                    this.f10896c = U;
                    this.m = U;
                }
            } else {
                int V2 = fVar.V(this.f10909q, dVar);
                int U2 = fVar.U(this.f10909q, dVar);
                if (dVar.V[1] == 3) {
                    this.f10908p++;
                    U2 = 0;
                }
                int i12 = fVar.S0;
                if (dVar.f10859j0 != 8) {
                    i10 = i12;
                }
                this.m = U2 + i10 + this.m;
                if (this.f10895b == null || this.f10896c < V2) {
                    this.f10895b = dVar;
                    this.f10896c = V2;
                    this.f10905l = V2;
                }
            }
            this.f10907o++;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(int r21, boolean r22, boolean r23) {
            /*
                r20 = this;
                r0 = r20
                int r1 = r0.f10907o
                r2 = 0
                r3 = r2
            L_0x0006:
                l1.f r4 = l1.f.this
                if (r3 >= r1) goto L_0x001e
                int r5 = r0.f10906n
                int r5 = r5 + r3
                int r6 = r4.f10893d1
                if (r5 < r6) goto L_0x0012
                goto L_0x001e
            L_0x0012:
                l1.d[] r4 = r4.f10892c1
                r4 = r4[r5]
                if (r4 == 0) goto L_0x001b
                r4.E()
            L_0x001b:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x001e:
                if (r1 == 0) goto L_0x02d1
                l1.d r3 = r0.f10895b
                if (r3 != 0) goto L_0x0026
                goto L_0x02d1
            L_0x0026:
                if (r23 == 0) goto L_0x002c
                if (r21 != 0) goto L_0x002c
                r5 = 1
                goto L_0x002d
            L_0x002c:
                r5 = r2
            L_0x002d:
                r6 = -1
                r7 = r2
                r8 = r6
                r9 = r8
            L_0x0031:
                if (r7 >= r1) goto L_0x0053
                if (r22 == 0) goto L_0x0039
                int r10 = r1 + -1
                int r10 = r10 - r7
                goto L_0x003a
            L_0x0039:
                r10 = r7
            L_0x003a:
                int r11 = r0.f10906n
                int r11 = r11 + r10
                int r10 = r4.f10893d1
                if (r11 < r10) goto L_0x0042
                goto L_0x0053
            L_0x0042:
                l1.d[] r10 = r4.f10892c1
                r10 = r10[r11]
                if (r10 == 0) goto L_0x0050
                int r10 = r10.f10859j0
                if (r10 != 0) goto L_0x0050
                if (r8 != r6) goto L_0x004f
                r8 = r7
            L_0x004f:
                r9 = r7
            L_0x0050:
                int r7 = r7 + 1
                goto L_0x0031
            L_0x0053:
                int r7 = r0.f10894a
                if (r7 != 0) goto L_0x01ae
                l1.d r7 = r0.f10895b
                int r11 = r4.G0
                r7.f10864m0 = r11
                int r11 = r0.f10902i
                if (r21 <= 0) goto L_0x0064
                int r12 = r4.S0
                int r11 = r11 + r12
            L_0x0064:
                l1.c r12 = r0.f10898e
                l1.c r13 = r7.L
                r13.a(r12, r11)
                l1.c r11 = r7.N
                if (r23 == 0) goto L_0x0076
                l1.c r12 = r0.f10900g
                int r14 = r0.f10904k
                r11.a(r12, r14)
            L_0x0076:
                if (r21 <= 0) goto L_0x0081
                l1.c r12 = r0.f10898e
                l1.d r12 = r12.f10829d
                l1.c r12 = r12.N
                r12.a(r13, r2)
            L_0x0081:
                int r12 = r4.U0
                r14 = 3
                if (r12 != r14) goto L_0x00a8
                boolean r12 = r7.F
                if (r12 != 0) goto L_0x00a8
                r12 = r2
            L_0x008b:
                if (r12 >= r1) goto L_0x00a8
                if (r22 == 0) goto L_0x0093
                int r15 = r1 + -1
                int r15 = r15 - r12
                goto L_0x0094
            L_0x0093:
                r15 = r12
            L_0x0094:
                int r10 = r0.f10906n
                int r10 = r10 + r15
                int r15 = r4.f10893d1
                if (r10 < r15) goto L_0x009c
                goto L_0x00a8
            L_0x009c:
                l1.d[] r15 = r4.f10892c1
                r10 = r15[r10]
                boolean r15 = r10.F
                if (r15 == 0) goto L_0x00a5
                goto L_0x00a9
            L_0x00a5:
                int r12 = r12 + 1
                goto L_0x008b
            L_0x00a8:
                r10 = r7
            L_0x00a9:
                r15 = r2
                r12 = 0
            L_0x00ab:
                if (r15 >= r1) goto L_0x02d1
                if (r22 == 0) goto L_0x00b4
                int r16 = r1 + -1
                int r16 = r16 - r15
                goto L_0x00b6
            L_0x00b4:
                r16 = r15
            L_0x00b6:
                int r14 = r0.f10906n
                int r14 = r14 + r16
                int r3 = r4.f10893d1
                if (r14 < r3) goto L_0x00c0
                goto L_0x02d1
            L_0x00c0:
                l1.d[] r3 = r4.f10892c1
                r3 = r3[r14]
                if (r3 != 0) goto L_0x00cb
                r17 = r1
                r2 = 3
                goto L_0x01a5
            L_0x00cb:
                l1.c r14 = r3.K
                if (r15 != 0) goto L_0x00d6
                l1.c r2 = r0.f10897d
                int r6 = r0.f10901h
                r3.g(r14, r2, r6)
            L_0x00d6:
                if (r16 != 0) goto L_0x0122
                int r2 = r4.F0
                r6 = 1065353216(0x3f800000, float:1.0)
                if (r22 == 0) goto L_0x00e5
                r16 = r2
                float r2 = r4.L0
                float r2 = r6 - r2
                goto L_0x00e9
            L_0x00e5:
                r16 = r2
                float r2 = r4.L0
            L_0x00e9:
                int r6 = r0.f10906n
                if (r6 != 0) goto L_0x0105
                int r6 = r4.H0
                r18 = r2
                r2 = -1
                if (r6 == r2) goto L_0x0107
                if (r22 == 0) goto L_0x00fd
                float r2 = r4.N0
                r16 = 1065353216(0x3f800000, float:1.0)
                float r2 = r16 - r2
                goto L_0x00ff
            L_0x00fd:
                float r2 = r4.N0
            L_0x00ff:
                r19 = r6
                r6 = r2
                r2 = r19
                goto L_0x011e
            L_0x0105:
                r18 = r2
            L_0x0107:
                if (r23 == 0) goto L_0x011a
                int r2 = r4.J0
                r6 = -1
                if (r2 == r6) goto L_0x011a
                if (r22 == 0) goto L_0x0117
                float r6 = r4.P0
                r16 = 1065353216(0x3f800000, float:1.0)
                float r6 = r16 - r6
                goto L_0x011e
            L_0x0117:
                float r6 = r4.P0
                goto L_0x011e
            L_0x011a:
                r2 = r16
                r6 = r18
            L_0x011e:
                r3.f10863l0 = r2
                r3.f10853g0 = r6
            L_0x0122:
                int r2 = r1 + -1
                if (r15 != r2) goto L_0x0132
                l1.c r2 = r0.f10899f
                int r6 = r0.f10903j
                r17 = r1
                l1.c r1 = r3.M
                r3.g(r1, r2, r6)
                goto L_0x0134
            L_0x0132:
                r17 = r1
            L_0x0134:
                if (r12 == 0) goto L_0x015c
                int r1 = r4.R0
                l1.c r2 = r12.M
                r14.a(r2, r1)
                if (r15 != r8) goto L_0x0149
                int r1 = r0.f10901h
                boolean r6 = r14.h()
                if (r6 == 0) goto L_0x0149
                r14.f10833h = r1
            L_0x0149:
                r1 = 0
                r2.a(r14, r1)
                r1 = 1
                int r6 = r9 + 1
                if (r15 != r6) goto L_0x015c
                int r1 = r0.f10903j
                boolean r6 = r2.h()
                if (r6 == 0) goto L_0x015c
                r2.f10833h = r1
            L_0x015c:
                if (r3 == r7) goto L_0x01a3
                int r1 = r4.U0
                r2 = 3
                if (r1 != r2) goto L_0x0176
                boolean r6 = r10.F
                if (r6 == 0) goto L_0x0176
                if (r3 == r10) goto L_0x0176
                boolean r6 = r3.F
                if (r6 == 0) goto L_0x0176
                l1.c r1 = r3.O
                l1.c r6 = r10.O
                r12 = 0
                r1.a(r6, r12)
                goto L_0x01a1
            L_0x0176:
                l1.c r6 = r3.L
                if (r1 == 0) goto L_0x019d
                l1.c r12 = r3.N
                r14 = 1
                if (r1 == r14) goto L_0x0198
                if (r5 == 0) goto L_0x0190
                l1.c r1 = r0.f10898e
                int r14 = r0.f10902i
                r6.a(r1, r14)
                l1.c r1 = r0.f10900g
                int r6 = r0.f10904k
                r12.a(r1, r6)
                goto L_0x01a1
            L_0x0190:
                r1 = 0
                r6.a(r13, r1)
                r12.a(r11, r1)
                goto L_0x01a1
            L_0x0198:
                r1 = 0
                r12.a(r11, r1)
                goto L_0x01a1
            L_0x019d:
                r1 = 0
                r6.a(r13, r1)
            L_0x01a1:
                r12 = r3
                goto L_0x01a5
            L_0x01a3:
                r2 = 3
                goto L_0x01a1
            L_0x01a5:
                int r15 = r15 + 1
                r14 = r2
                r1 = r17
                r2 = 0
                r6 = -1
                goto L_0x00ab
            L_0x01ae:
                r17 = r1
                l1.d r1 = r0.f10895b
                int r2 = r4.F0
                r1.f10863l0 = r2
                int r2 = r0.f10901h
                if (r21 <= 0) goto L_0x01bd
                int r3 = r4.R0
                int r2 = r2 + r3
            L_0x01bd:
                l1.c r3 = r1.M
                l1.c r6 = r1.K
                if (r22 == 0) goto L_0x01de
                l1.c r7 = r0.f10899f
                r3.a(r7, r2)
                if (r23 == 0) goto L_0x01d1
                l1.c r2 = r0.f10897d
                int r7 = r0.f10903j
                r6.a(r2, r7)
            L_0x01d1:
                if (r21 <= 0) goto L_0x01f8
                l1.c r2 = r0.f10899f
                l1.d r2 = r2.f10829d
                l1.c r2 = r2.K
                r7 = 0
                r2.a(r3, r7)
                goto L_0x01f8
            L_0x01de:
                l1.c r7 = r0.f10897d
                r6.a(r7, r2)
                if (r23 == 0) goto L_0x01ec
                l1.c r2 = r0.f10899f
                int r7 = r0.f10903j
                r3.a(r2, r7)
            L_0x01ec:
                if (r21 <= 0) goto L_0x01f8
                l1.c r2 = r0.f10897d
                l1.d r2 = r2.f10829d
                l1.c r2 = r2.M
                r7 = 0
                r2.a(r6, r7)
            L_0x01f8:
                r7 = r17
                r2 = 0
                r10 = 0
            L_0x01fc:
                if (r2 >= r7) goto L_0x02d1
                int r11 = r0.f10906n
                int r11 = r11 + r2
                int r12 = r4.f10893d1
                if (r11 < r12) goto L_0x0207
                goto L_0x02d1
            L_0x0207:
                l1.d[] r12 = r4.f10892c1
                r11 = r12[r11]
                if (r11 != 0) goto L_0x0210
                r11 = r10
                goto L_0x02ca
            L_0x0210:
                l1.c r12 = r11.L
                if (r2 != 0) goto L_0x0240
                l1.c r13 = r0.f10898e
                int r14 = r0.f10902i
                r11.g(r12, r13, r14)
                int r13 = r4.G0
                float r14 = r4.M0
                int r15 = r0.f10906n
                if (r15 != 0) goto L_0x022d
                int r15 = r4.I0
                r16 = r13
                r13 = -1
                if (r15 == r13) goto L_0x0230
                float r14 = r4.O0
                goto L_0x023b
            L_0x022d:
                r16 = r13
                r13 = -1
            L_0x0230:
                if (r23 == 0) goto L_0x0239
                int r15 = r4.K0
                if (r15 == r13) goto L_0x0239
                float r14 = r4.Q0
                goto L_0x023b
            L_0x0239:
                r15 = r16
            L_0x023b:
                r11.f10864m0 = r15
                r11.f10855h0 = r14
                goto L_0x0241
            L_0x0240:
                r13 = -1
            L_0x0241:
                int r14 = r7 + -1
                if (r2 != r14) goto L_0x024e
                l1.c r14 = r0.f10900g
                int r15 = r0.f10904k
                l1.c r13 = r11.N
                r11.g(r13, r14, r15)
            L_0x024e:
                if (r10 == 0) goto L_0x0276
                int r13 = r4.S0
                l1.c r10 = r10.N
                r12.a(r10, r13)
                if (r2 != r8) goto L_0x0263
                int r13 = r0.f10902i
                boolean r14 = r12.h()
                if (r14 == 0) goto L_0x0263
                r12.f10833h = r13
            L_0x0263:
                r13 = 0
                r10.a(r12, r13)
                r12 = 1
                int r13 = r9 + 1
                if (r2 != r13) goto L_0x0276
                int r12 = r0.f10904k
                boolean r13 = r10.h()
                if (r13 == 0) goto L_0x0276
                r10.f10833h = r12
            L_0x0276:
                if (r11 == r1) goto L_0x02ca
                r10 = 2
                l1.c r12 = r11.M
                l1.c r13 = r11.K
                if (r22 == 0) goto L_0x029b
                int r14 = r4.T0
                if (r14 == 0) goto L_0x0296
                r15 = 1
                if (r14 == r15) goto L_0x0291
                if (r14 == r10) goto L_0x0289
                goto L_0x02ca
            L_0x0289:
                r10 = 0
                r13.a(r6, r10)
                r12.a(r3, r10)
                goto L_0x02cb
            L_0x0291:
                r10 = 0
                r13.a(r6, r10)
                goto L_0x02cb
            L_0x0296:
                r10 = 0
                r12.a(r3, r10)
                goto L_0x02cb
            L_0x029b:
                int r14 = r4.T0
                if (r14 == 0) goto L_0x02c4
                r15 = 1
                if (r14 == r15) goto L_0x02bf
                if (r14 == r10) goto L_0x02a5
                goto L_0x02b5
            L_0x02a5:
                if (r5 == 0) goto L_0x02b7
                l1.c r10 = r0.f10897d
                int r14 = r0.f10901h
                r13.a(r10, r14)
                l1.c r10 = r0.f10899f
                int r13 = r0.f10903j
                r12.a(r10, r13)
            L_0x02b5:
                r10 = 0
                goto L_0x02cc
            L_0x02b7:
                r10 = 0
                r13.a(r6, r10)
                r12.a(r3, r10)
                goto L_0x02cc
            L_0x02bf:
                r10 = 0
                r12.a(r3, r10)
                goto L_0x02cc
            L_0x02c4:
                r10 = 0
                r15 = 1
                r13.a(r6, r10)
                goto L_0x02cc
            L_0x02ca:
                r10 = 0
            L_0x02cb:
                r15 = 1
            L_0x02cc:
                int r2 = r2 + 1
                r10 = r11
                goto L_0x01fc
            L_0x02d1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l1.f.a.b(int, boolean, boolean):void");
        }

        public final int c() {
            return this.f10894a == 1 ? this.m - f.this.S0 : this.m;
        }

        public final int d() {
            return this.f10894a == 0 ? this.f10905l - f.this.R0 : this.f10905l;
        }

        public final void e(int i8) {
            f fVar;
            int i10;
            int i11 = this.f10908p;
            if (i11 != 0) {
                int i12 = this.f10907o;
                int i13 = i8 / i11;
                int i14 = 0;
                while (true) {
                    fVar = f.this;
                    if (i14 >= i12 || (i10 = this.f10906n + i14) >= fVar.f10893d1) {
                        this.f10905l = 0;
                        this.m = 0;
                        this.f10895b = null;
                        this.f10896c = 0;
                        int i15 = this.f10907o;
                        int i16 = 0;
                    } else {
                        d dVar = fVar.f10892c1[i10];
                        if (this.f10894a == 0) {
                            if (dVar != null) {
                                int[] iArr = dVar.V;
                                if (iArr[0] == 3 && dVar.f10875s == 0) {
                                    fVar.T(dVar, 1, i13, iArr[1], dVar.l());
                                }
                            }
                        } else if (dVar != null) {
                            int[] iArr2 = dVar.V;
                            if (iArr2[1] == 3 && dVar.f10876t == 0) {
                                fVar.T(dVar, iArr2[0], dVar.r(), 1, i13);
                            }
                        }
                        i14++;
                    }
                }
                this.f10905l = 0;
                this.m = 0;
                this.f10895b = null;
                this.f10896c = 0;
                int i152 = this.f10907o;
                int i162 = 0;
                while (i162 < i152) {
                    int i17 = this.f10906n + i162;
                    if (i17 < fVar.f10893d1) {
                        d dVar2 = fVar.f10892c1[i17];
                        if (this.f10894a == 0) {
                            int r10 = dVar2.r();
                            int i18 = fVar.R0;
                            if (dVar2.f10859j0 == 8) {
                                i18 = 0;
                            }
                            this.f10905l = r10 + i18 + this.f10905l;
                            int U = fVar.U(this.f10909q, dVar2);
                            if (this.f10895b == null || this.f10896c < U) {
                                this.f10895b = dVar2;
                                this.f10896c = U;
                                this.m = U;
                            }
                        } else {
                            int V = fVar.V(this.f10909q, dVar2);
                            int U2 = fVar.U(this.f10909q, dVar2);
                            int i19 = fVar.S0;
                            if (dVar2.f10859j0 == 8) {
                                i19 = 0;
                            }
                            this.m = U2 + i19 + this.m;
                            if (this.f10895b == null || this.f10896c < V) {
                                this.f10895b = dVar2;
                                this.f10896c = V;
                                this.f10905l = V;
                            }
                        }
                        i162++;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void f(int i8, c cVar, c cVar2, c cVar3, c cVar4, int i10, int i11, int i12, int i13, int i14) {
            this.f10894a = i8;
            this.f10897d = cVar;
            this.f10898e = cVar2;
            this.f10899f = cVar3;
            this.f10900g = cVar4;
            this.f10901h = i10;
            this.f10902i = i11;
            this.f10903j = i12;
            this.f10904k = i13;
            this.f10909q = i14;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v59, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v10, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v12, resolved type: java.lang.Object[]} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0529 A[SYNTHETIC] */
    public final void S(int r38, int r39, int r40, int r41) {
        /*
            r37 = this;
            r8 = r37
            int r0 = r8.f10918t0
            r9 = 2
            r10 = 3
            r11 = 0
            r12 = 1
            if (r0 <= 0) goto L_0x0084
            l1.d r0 = r8.W
            if (r0 == 0) goto L_0x0013
            l1.e r0 = (l1.e) r0
            m1.b$b r0 = r0.f10886w0
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x0019
            r0 = r11
            goto L_0x007b
        L_0x0019:
            r2 = r11
        L_0x001a:
            int r3 = r8.f10918t0
            if (r2 >= r3) goto L_0x007a
            l1.d[] r3 = r8.f10917s0
            r3 = r3[r2]
            if (r3 != 0) goto L_0x0025
            goto L_0x0077
        L_0x0025:
            boolean r4 = r3 instanceof l1.g
            if (r4 == 0) goto L_0x002a
            goto L_0x0077
        L_0x002a:
            int r4 = r3.k(r11)
            int r5 = r3.k(r12)
            if (r4 != r10) goto L_0x0040
            int r6 = r3.f10875s
            if (r6 == r12) goto L_0x0040
            if (r5 != r10) goto L_0x0040
            int r6 = r3.f10876t
            if (r6 == r12) goto L_0x0040
            r6 = r12
            goto L_0x0041
        L_0x0040:
            r6 = r11
        L_0x0041:
            if (r6 == 0) goto L_0x0044
            goto L_0x0077
        L_0x0044:
            if (r4 != r10) goto L_0x0047
            r4 = r9
        L_0x0047:
            if (r5 != r10) goto L_0x004a
            r5 = r9
        L_0x004a:
            m1.b$a r6 = r8.D0
            r6.f11122a = r4
            r6.f11123b = r5
            int r4 = r3.r()
            r6.f11124c = r4
            int r4 = r3.l()
            r6.f11125d = r4
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            r4.b(r3, r6)
            int r4 = r6.f11126e
            r3.O(r4)
            int r4 = r6.f11127f
            r3.L(r4)
            int r4 = r6.f11128g
            r3.f10847d0 = r4
            if (r4 <= 0) goto L_0x0074
            r4 = r12
            goto L_0x0075
        L_0x0074:
            r4 = r11
        L_0x0075:
            r3.F = r4
        L_0x0077:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x007a:
            r0 = r12
        L_0x007b:
            if (r0 != 0) goto L_0x0084
            r8.B0 = r11
            r8.C0 = r11
            r8.A0 = r11
            return
        L_0x0084:
            int r13 = r8.f10923y0
            int r14 = r8.f10924z0
            int r15 = r8.f10919u0
            int r7 = r8.f10920v0
            int[] r6 = new int[r9]
            int r0 = r39 - r13
            int r0 = r0 - r14
            int r2 = r8.X0
            if (r2 != r12) goto L_0x0098
            int r0 = r41 - r15
            int r0 = r0 - r7
        L_0x0098:
            r5 = r0
            r0 = -1
            if (r2 != 0) goto L_0x00a9
            int r2 = r8.F0
            if (r2 != r0) goto L_0x00a2
            r8.F0 = r11
        L_0x00a2:
            int r2 = r8.G0
            if (r2 != r0) goto L_0x00b5
            r8.G0 = r11
            goto L_0x00b5
        L_0x00a9:
            int r2 = r8.F0
            if (r2 != r0) goto L_0x00af
            r8.F0 = r11
        L_0x00af:
            int r2 = r8.G0
            if (r2 != r0) goto L_0x00b5
            r8.G0 = r11
        L_0x00b5:
            l1.d[] r0 = r8.f10917s0
            r2 = r11
            r3 = r2
        L_0x00b9:
            int r4 = r8.f10918t0
            r1 = 8
            if (r2 >= r4) goto L_0x00cc
            l1.d[] r4 = r8.f10917s0
            r4 = r4[r2]
            int r4 = r4.f10859j0
            if (r4 != r1) goto L_0x00c9
            int r3 = r3 + 1
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x00b9
        L_0x00cc:
            if (r3 <= 0) goto L_0x00e7
            int r4 = r4 - r3
            l1.d[] r0 = new l1.d[r4]
            r2 = r11
            r4 = r2
        L_0x00d3:
            int r3 = r8.f10918t0
            if (r2 >= r3) goto L_0x00e7
            l1.d[] r3 = r8.f10917s0
            r3 = r3[r2]
            int r11 = r3.f10859j0
            if (r11 == r1) goto L_0x00e3
            r0[r4] = r3
            int r4 = r4 + 1
        L_0x00e3:
            int r2 = r2 + 1
            r11 = 0
            goto L_0x00d3
        L_0x00e7:
            r11 = r0
            r8.f10892c1 = r11
            r8.f10893d1 = r4
            int r0 = r8.V0
            java.util.ArrayList<l1.f$a> r3 = r8.Y0
            if (r0 == 0) goto L_0x0759
            l1.c r2 = r8.L
            l1.c r1 = r8.K
            l1.c r10 = r8.M
            l1.c r9 = r8.N
            r27 = r9
            int[] r9 = r8.V
            if (r0 == r12) goto L_0x0547
            r12 = 2
            if (r0 == r12) goto L_0x037b
            r12 = 3
            if (r0 == r12) goto L_0x0107
            goto L_0x010b
        L_0x0107:
            int r12 = r8.X0
            if (r4 != 0) goto L_0x0117
        L_0x010b:
            r31 = r6
            r32 = r7
            r29 = r13
            r33 = r14
            r34 = r15
            goto L_0x076c
        L_0x0117:
            r3.clear()
            l1.f$a r0 = new l1.f$a
            r19 = r3
            l1.c r3 = r8.K
            r20 = r4
            l1.c r4 = r8.L
            r21 = r5
            l1.c r5 = r8.M
            r22 = r6
            l1.c r6 = r8.N
            r16 = r0
            r23 = r1
            r1 = r37
            r24 = r2
            r2 = r12
            r28 = r10
            r10 = r19
            r29 = r13
            r13 = r20
            r30 = r21
            r31 = r22
            r32 = r7
            r7 = r30
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.add(r0)
            if (r12 != 0) goto L_0x01f1
            r1 = 0
            r2 = 0
            r3 = 0
            r7 = 0
        L_0x0151:
            if (r7 >= r13) goto L_0x01e7
            r4 = 1
            int r6 = r1 + 1
            r5 = r11[r7]
            r4 = r30
            int r16 = r8.V(r4, r5)
            int[] r1 = r5.V
            r19 = 0
            r1 = r1[r19]
            r20 = r5
            r5 = 3
            if (r1 != r5) goto L_0x016b
            int r2 = r2 + 1
        L_0x016b:
            r19 = r2
            if (r3 == r4) goto L_0x0176
            int r1 = r8.R0
            int r1 = r1 + r3
            int r1 = r1 + r16
            if (r1 <= r4) goto L_0x017c
        L_0x0176:
            l1.d r1 = r0.f10895b
            if (r1 == 0) goto L_0x017c
            r1 = 1
            goto L_0x017d
        L_0x017c:
            r1 = 0
        L_0x017d:
            if (r1 != 0) goto L_0x0188
            if (r7 <= 0) goto L_0x0188
            int r2 = r8.W0
            if (r2 <= 0) goto L_0x0188
            if (r6 <= r2) goto L_0x0188
            r1 = 1
        L_0x0188:
            if (r1 == 0) goto L_0x01c2
            l1.f$a r5 = new l1.f$a
            l1.c r3 = r8.K
            l1.c r2 = r8.L
            l1.c r1 = r8.M
            l1.c r0 = r8.N
            r21 = r0
            r0 = r5
            r22 = r1
            r1 = r37
            r25 = r2
            r2 = r12
            r30 = r4
            r4 = r25
            r33 = r14
            r34 = r15
            r14 = r20
            r15 = r5
            r5 = r22
            r20 = r6
            r6 = r21
            r21 = r9
            r9 = r7
            r7 = r30
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r15.f10906n = r9
            r10.add(r15)
            r0 = r15
            r3 = r16
            r1 = r20
            goto L_0x01d8
        L_0x01c2:
            r30 = r4
            r21 = r9
            r33 = r14
            r34 = r15
            r14 = r20
            r9 = r7
            if (r9 <= 0) goto L_0x01d5
            int r1 = r8.R0
            int r1 = r1 + r16
            int r16 = r1 + r3
        L_0x01d5:
            r3 = r16
            r1 = 0
        L_0x01d8:
            r0.a(r14)
            int r7 = r9 + 1
            r2 = r19
            r9 = r21
            r14 = r33
            r15 = r34
            goto L_0x0151
        L_0x01e7:
            r21 = r9
            r33 = r14
            r34 = r15
            r15 = r30
            goto L_0x0265
        L_0x01f1:
            r21 = r9
            r33 = r14
            r34 = r15
            r1 = 0
            r2 = 0
            r9 = 0
        L_0x01fa:
            if (r9 >= r13) goto L_0x0262
            r14 = r11[r9]
            r15 = r30
            int r16 = r8.U(r15, r14)
            int[] r3 = r14.V
            r4 = 1
            r3 = r3[r4]
            r4 = 3
            if (r3 != r4) goto L_0x020e
            int r1 = r1 + 1
        L_0x020e:
            r19 = r1
            if (r2 == r15) goto L_0x0219
            int r1 = r8.S0
            int r1 = r1 + r2
            int r1 = r1 + r16
            if (r1 <= r15) goto L_0x021f
        L_0x0219:
            l1.d r1 = r0.f10895b
            if (r1 == 0) goto L_0x021f
            r1 = 1
            goto L_0x0220
        L_0x021f:
            r1 = 0
        L_0x0220:
            if (r1 != 0) goto L_0x022b
            if (r9 <= 0) goto L_0x022b
            int r3 = r8.W0
            if (r3 <= 0) goto L_0x022b
            if (r3 >= 0) goto L_0x022b
            r1 = 1
        L_0x022b:
            if (r1 == 0) goto L_0x0249
            l1.f$a r7 = new l1.f$a
            l1.c r3 = r8.K
            l1.c r4 = r8.L
            l1.c r5 = r8.M
            l1.c r6 = r8.N
            r0 = r7
            r1 = r37
            r2 = r12
            r30 = r11
            r11 = r7
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r11.f10906n = r9
            r10.add(r11)
            r0 = r11
            goto L_0x0254
        L_0x0249:
            r30 = r11
            if (r9 <= 0) goto L_0x0254
            int r1 = r8.S0
            int r1 = r1 + r16
            int r1 = r1 + r2
            r2 = r1
            goto L_0x0256
        L_0x0254:
            r2 = r16
        L_0x0256:
            r0.a(r14)
            int r9 = r9 + 1
            r1 = r19
            r11 = r30
            r30 = r15
            goto L_0x01fa
        L_0x0262:
            r15 = r30
            r2 = r1
        L_0x0265:
            int r0 = r10.size()
            int r1 = r8.f10923y0
            int r3 = r8.f10919u0
            int r4 = r8.f10924z0
            int r5 = r8.f10920v0
            r6 = 0
            r7 = r21[r6]
            r6 = 2
            if (r7 == r6) goto L_0x027f
            r7 = 1
            r9 = r21[r7]
            if (r9 != r6) goto L_0x027d
            goto L_0x027f
        L_0x027d:
            r6 = 0
            goto L_0x0280
        L_0x027f:
            r6 = 1
        L_0x0280:
            if (r2 <= 0) goto L_0x02a5
            if (r6 == 0) goto L_0x02a5
            r2 = 0
        L_0x0285:
            if (r2 >= r0) goto L_0x02a5
            java.lang.Object r6 = r10.get(r2)
            l1.f$a r6 = (l1.f.a) r6
            if (r12 != 0) goto L_0x0299
            int r7 = r6.d()
            int r7 = r15 - r7
            r6.e(r7)
            goto L_0x02a2
        L_0x0299:
            int r7 = r6.c()
            int r7 = r15 - r7
            r6.e(r7)
        L_0x02a2:
            int r2 = r2 + 1
            goto L_0x0285
        L_0x02a5:
            r6 = r3
            r2 = r24
            r13 = r27
            r14 = r28
            r7 = 0
            r9 = 0
            r11 = 0
            r3 = r1
            r1 = r23
        L_0x02b2:
            if (r7 >= r0) goto L_0x0373
            java.lang.Object r16 = r10.get(r7)
            r30 = r5
            r5 = r16
            l1.f$a r5 = (l1.f.a) r5
            if (r12 != 0) goto L_0x0317
            int r13 = r0 + -1
            if (r7 >= r13) goto L_0x02d5
            int r13 = r7 + 1
            java.lang.Object r13 = r10.get(r13)
            l1.f$a r13 = (l1.f.a) r13
            l1.d r13 = r13.f10895b
            l1.c r13 = r13.L
            r35 = r10
            r30 = 0
            goto L_0x02dd
        L_0x02d5:
            int r13 = r8.f10920v0
            r35 = r10
            r30 = r13
            r13 = r27
        L_0x02dd:
            l1.d r10 = r5.f10895b
            l1.c r10 = r10.N
            r16 = r5
            r17 = r12
            r18 = r1
            r19 = r2
            r20 = r14
            r21 = r13
            r22 = r3
            r23 = r6
            r24 = r4
            r25 = r30
            r26 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r5.d()
            int r2 = java.lang.Math.max(r9, r2)
            int r5 = r5.c()
            int r5 = r5 + r11
            if (r7 <= 0) goto L_0x030c
            int r6 = r8.S0
            int r5 = r5 + r6
        L_0x030c:
            r9 = r2
            r11 = r5
            r2 = r10
            r5 = r30
            r10 = r35
            r6 = 0
            r35 = r0
            goto L_0x036d
        L_0x0317:
            r35 = r10
            int r4 = r0 + -1
            if (r7 >= r4) goto L_0x0330
            int r4 = r7 + 1
            r10 = r35
            java.lang.Object r4 = r10.get(r4)
            l1.f$a r4 = (l1.f.a) r4
            l1.d r4 = r4.f10895b
            l1.c r4 = r4.K
            r35 = r0
            r14 = r4
            r4 = 0
            goto L_0x0338
        L_0x0330:
            r10 = r35
            int r4 = r8.f10924z0
            r35 = r0
            r14 = r28
        L_0x0338:
            l1.d r0 = r5.f10895b
            l1.c r0 = r0.M
            r16 = r5
            r17 = r12
            r18 = r1
            r19 = r2
            r20 = r14
            r21 = r13
            r22 = r3
            r23 = r6
            r24 = r4
            r25 = r30
            r26 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r1 = r5.d()
            int r1 = r1 + r9
            int r3 = r5.c()
            int r3 = java.lang.Math.max(r11, r3)
            if (r7 <= 0) goto L_0x0367
            int r5 = r8.R0
            int r1 = r1 + r5
        L_0x0367:
            r9 = r1
            r11 = r3
            r5 = r30
            r3 = 0
            r1 = r0
        L_0x036d:
            int r7 = r7 + 1
            r0 = r35
            goto L_0x02b2
        L_0x0373:
            r0 = 0
            r31[r0] = r9
            r0 = 1
            r31[r0] = r11
            goto L_0x076c
        L_0x037b:
            r31 = r6
            r32 = r7
            r30 = r11
            r29 = r13
            r33 = r14
            r34 = r15
            r13 = r4
            r15 = r5
            int r0 = r8.X0
            if (r0 != 0) goto L_0x03b2
            int r1 = r8.W0
            if (r1 > 0) goto L_0x03af
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0394:
            if (r1 >= r13) goto L_0x03ae
            if (r1 <= 0) goto L_0x039b
            int r4 = r8.R0
            int r2 = r2 + r4
        L_0x039b:
            r4 = r30[r1]
            if (r4 != 0) goto L_0x03a0
            goto L_0x03ab
        L_0x03a0:
            int r4 = r8.V(r15, r4)
            int r4 = r4 + r2
            if (r4 <= r15) goto L_0x03a8
            goto L_0x03ae
        L_0x03a8:
            int r3 = r3 + 1
            r2 = r4
        L_0x03ab:
            int r1 = r1 + 1
            goto L_0x0394
        L_0x03ae:
            r1 = r3
        L_0x03af:
            r2 = r1
            r1 = 0
            goto L_0x03d5
        L_0x03b2:
            int r1 = r8.W0
            if (r1 > 0) goto L_0x03d4
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x03b9:
            if (r1 >= r13) goto L_0x03d3
            if (r1 <= 0) goto L_0x03c0
            int r4 = r8.S0
            int r2 = r2 + r4
        L_0x03c0:
            r4 = r30[r1]
            if (r4 != 0) goto L_0x03c5
            goto L_0x03d0
        L_0x03c5:
            int r4 = r8.U(r15, r4)
            int r4 = r4 + r2
            if (r4 <= r15) goto L_0x03cd
            goto L_0x03d3
        L_0x03cd:
            int r3 = r3 + 1
            r2 = r4
        L_0x03d0:
            int r1 = r1 + 1
            goto L_0x03b9
        L_0x03d3:
            r1 = r3
        L_0x03d4:
            r2 = 0
        L_0x03d5:
            int[] r3 = r8.f10891b1
            if (r3 != 0) goto L_0x03de
            r3 = 2
            int[] r3 = new int[r3]
            r8.f10891b1 = r3
        L_0x03de:
            if (r1 != 0) goto L_0x03e3
            r3 = 1
            if (r0 == r3) goto L_0x03e7
        L_0x03e3:
            if (r2 != 0) goto L_0x03fd
            if (r0 != 0) goto L_0x03fd
        L_0x03e7:
            r3 = r40
            r4 = r41
            r5 = r0
            r6 = r1
            r7 = r2
            r10 = r8
            r12 = r10
            r11 = r30
            r9 = r31
            r14 = r33
            r0 = 1
            r1 = r38
            r2 = r39
            goto L_0x0519
        L_0x03fd:
            r3 = r41
            r4 = r0
            r5 = r1
            r6 = r2
            r10 = r8
            r12 = r10
            r11 = r30
            r7 = r31
            r14 = r33
            r9 = 0
            r0 = r38
            r1 = r39
            r2 = r40
        L_0x0411:
            if (r9 != 0) goto L_0x0529
            if (r4 != 0) goto L_0x0424
            float r5 = (float) r13
            r38 = r0
            float r0 = (float) r6
            float r5 = r5 / r0
            r39 = r1
            double r0 = (double) r5
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r5 = r0
            goto L_0x0432
        L_0x0424:
            r38 = r0
            r39 = r1
            float r0 = (float) r13
            float r1 = (float) r5
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r6 = r0
        L_0x0432:
            l1.d[] r0 = r10.f10890a1
            if (r0 == 0) goto L_0x043f
            int r1 = r0.length
            if (r1 >= r6) goto L_0x043a
            goto L_0x043f
        L_0x043a:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            goto L_0x0444
        L_0x043f:
            r1 = 0
            l1.d[] r0 = new l1.d[r6]
            r10.f10890a1 = r0
        L_0x0444:
            l1.d[] r0 = r10.Z0
            if (r0 == 0) goto L_0x0451
            int r1 = r0.length
            if (r1 >= r5) goto L_0x044c
            goto L_0x0451
        L_0x044c:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            goto L_0x0455
        L_0x0451:
            l1.d[] r0 = new l1.d[r5]
            r10.Z0 = r0
        L_0x0455:
            r0 = 0
        L_0x0456:
            if (r0 >= r6) goto L_0x04b3
            r1 = 0
        L_0x0459:
            if (r1 >= r5) goto L_0x04aa
            int r17 = r1 * r6
            int r17 = r17 + r0
            r40 = r2
            r2 = 1
            if (r4 != r2) goto L_0x0468
            int r2 = r0 * r5
            int r17 = r2 + r1
        L_0x0468:
            r41 = r3
            r2 = r17
            int r3 = r11.length
            if (r2 < r3) goto L_0x0472
        L_0x046f:
            r17 = r9
            goto L_0x04a1
        L_0x0472:
            r2 = r11[r2]
            if (r2 != 0) goto L_0x0477
            goto L_0x046f
        L_0x0477:
            int r3 = r10.V(r15, r2)
            r17 = r9
            l1.d[] r9 = r10.f10890a1
            r9 = r9[r0]
            if (r9 == 0) goto L_0x0489
            int r9 = r9.r()
            if (r9 >= r3) goto L_0x048d
        L_0x0489:
            l1.d[] r3 = r10.f10890a1
            r3[r0] = r2
        L_0x048d:
            int r3 = r10.U(r15, r2)
            l1.d[] r9 = r10.Z0
            r9 = r9[r1]
            if (r9 == 0) goto L_0x049d
            int r9 = r9.l()
            if (r9 >= r3) goto L_0x04a1
        L_0x049d:
            l1.d[] r3 = r10.Z0
            r3[r1] = r2
        L_0x04a1:
            int r1 = r1 + 1
            r2 = r40
            r3 = r41
            r9 = r17
            goto L_0x0459
        L_0x04aa:
            r40 = r2
            r41 = r3
            r17 = r9
            int r0 = r0 + 1
            goto L_0x0456
        L_0x04b3:
            r40 = r2
            r41 = r3
            r17 = r9
            r0 = 0
            r1 = 0
        L_0x04bb:
            if (r0 >= r6) goto L_0x04d1
            l1.d[] r2 = r10.f10890a1
            r2 = r2[r0]
            if (r2 == 0) goto L_0x04ce
            if (r0 <= 0) goto L_0x04c8
            int r3 = r10.R0
            int r1 = r1 + r3
        L_0x04c8:
            int r2 = r10.V(r15, r2)
            int r2 = r2 + r1
            r1 = r2
        L_0x04ce:
            int r0 = r0 + 1
            goto L_0x04bb
        L_0x04d1:
            r0 = 0
            r2 = 0
        L_0x04d3:
            if (r0 >= r5) goto L_0x04e9
            l1.d[] r3 = r10.Z0
            r3 = r3[r0]
            if (r3 == 0) goto L_0x04e6
            if (r0 <= 0) goto L_0x04e0
            int r9 = r10.S0
            int r2 = r2 + r9
        L_0x04e0:
            int r3 = r10.U(r15, r3)
            int r3 = r3 + r2
            r2 = r3
        L_0x04e6:
            int r0 = r0 + 1
            goto L_0x04d3
        L_0x04e9:
            r0 = 0
            r7[r0] = r1
            r0 = 1
            r7[r0] = r2
            if (r4 != 0) goto L_0x04f8
            if (r1 <= r15) goto L_0x050a
            if (r6 <= r0) goto L_0x050a
            int r6 = r6 + -1
            goto L_0x04fe
        L_0x04f8:
            if (r2 <= r15) goto L_0x050a
            if (r5 <= r0) goto L_0x050a
            int r5 = r5 + -1
        L_0x04fe:
            r0 = r38
            r1 = r39
            r2 = r40
            r3 = r41
            r9 = r17
            goto L_0x0411
        L_0x050a:
            r1 = r38
            r2 = r39
            r3 = r40
            r9 = r31
            r31 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r41
        L_0x0519:
            r36 = r9
            r9 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r31
            r31 = r36
            goto L_0x0411
        L_0x0529:
            r38 = r0
            r39 = r1
            r40 = r2
            r41 = r3
            r0 = 1
            int[] r1 = r10.f10891b1
            r2 = 0
            r1[r2] = r6
            r1[r0] = r5
            r0 = r38
            r1 = r39
            r2 = r40
            r13 = r29
            r6 = r31
            r7 = r32
            goto L_0x077d
        L_0x0547:
            r23 = r1
            r24 = r2
            r31 = r6
            r32 = r7
            r21 = r9
            r28 = r10
            r30 = r11
            r29 = r13
            r33 = r14
            r34 = r15
            r10 = r3
            r13 = r4
            r15 = r5
            int r9 = r8.X0
            if (r13 != 0) goto L_0x0564
            goto L_0x076c
        L_0x0564:
            r10.clear()
            l1.f$a r11 = new l1.f$a
            l1.c r3 = r8.K
            l1.c r4 = r8.L
            l1.c r5 = r8.M
            l1.c r6 = r8.N
            r0 = r11
            r1 = r37
            r2 = r9
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.add(r11)
            if (r9 != 0) goto L_0x05df
            r0 = 0
            r1 = 0
            r12 = 0
        L_0x0581:
            if (r12 >= r13) goto L_0x0644
            r14 = r30[r12]
            int r16 = r8.V(r15, r14)
            int[] r2 = r14.V
            r3 = 0
            r2 = r2[r3]
            r3 = 3
            if (r2 != r3) goto L_0x0593
            int r0 = r0 + 1
        L_0x0593:
            r19 = r0
            if (r1 == r15) goto L_0x059e
            int r0 = r8.R0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r15) goto L_0x05a4
        L_0x059e:
            l1.d r0 = r11.f10895b
            if (r0 == 0) goto L_0x05a4
            r0 = 1
            goto L_0x05a5
        L_0x05a4:
            r0 = 0
        L_0x05a5:
            if (r0 != 0) goto L_0x05b2
            if (r12 <= 0) goto L_0x05b2
            int r2 = r8.W0
            if (r2 <= 0) goto L_0x05b2
            int r2 = r12 % r2
            if (r2 != 0) goto L_0x05b2
            r0 = 1
        L_0x05b2:
            if (r0 == 0) goto L_0x05cc
            l1.f$a r11 = new l1.f$a
            l1.c r3 = r8.K
            l1.c r4 = r8.L
            l1.c r5 = r8.M
            l1.c r6 = r8.N
            r0 = r11
            r1 = r37
            r2 = r9
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r11.f10906n = r12
            r10.add(r11)
            goto L_0x05d5
        L_0x05cc:
            if (r12 <= 0) goto L_0x05d5
            int r0 = r8.R0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x05d7
        L_0x05d5:
            r1 = r16
        L_0x05d7:
            r11.a(r14)
            int r12 = r12 + 1
            r0 = r19
            goto L_0x0581
        L_0x05df:
            r0 = 0
            r1 = 0
            r12 = 0
        L_0x05e2:
            if (r12 >= r13) goto L_0x0644
            r14 = r30[r12]
            int r16 = r8.U(r15, r14)
            int[] r2 = r14.V
            r3 = 1
            r2 = r2[r3]
            r7 = 3
            if (r2 != r7) goto L_0x05f4
            int r0 = r0 + 1
        L_0x05f4:
            r17 = r0
            if (r1 == r15) goto L_0x05ff
            int r0 = r8.S0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r15) goto L_0x0605
        L_0x05ff:
            l1.d r0 = r11.f10895b
            if (r0 == 0) goto L_0x0605
            r0 = 1
            goto L_0x0606
        L_0x0605:
            r0 = 0
        L_0x0606:
            if (r0 != 0) goto L_0x0613
            if (r12 <= 0) goto L_0x0613
            int r2 = r8.W0
            if (r2 <= 0) goto L_0x0613
            int r2 = r12 % r2
            if (r2 != 0) goto L_0x0613
            r0 = 1
        L_0x0613:
            if (r0 == 0) goto L_0x062f
            l1.f$a r11 = new l1.f$a
            l1.c r3 = r8.K
            l1.c r4 = r8.L
            l1.c r5 = r8.M
            l1.c r6 = r8.N
            r0 = r11
            r1 = r37
            r2 = r9
            r19 = r7
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r11.f10906n = r12
            r10.add(r11)
            goto L_0x063a
        L_0x062f:
            r19 = r7
            if (r12 <= 0) goto L_0x063a
            int r0 = r8.S0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x063c
        L_0x063a:
            r1 = r16
        L_0x063c:
            r11.a(r14)
            int r12 = r12 + 1
            r0 = r17
            goto L_0x05e2
        L_0x0644:
            int r1 = r10.size()
            int r2 = r8.f10923y0
            int r3 = r8.f10919u0
            int r4 = r8.f10924z0
            int r5 = r8.f10920v0
            r6 = 0
            r7 = r21[r6]
            r6 = 2
            if (r7 == r6) goto L_0x065e
            r7 = 1
            r11 = r21[r7]
            if (r11 != r6) goto L_0x065c
            goto L_0x065e
        L_0x065c:
            r6 = 0
            goto L_0x065f
        L_0x065e:
            r6 = 1
        L_0x065f:
            if (r0 <= 0) goto L_0x0684
            if (r6 == 0) goto L_0x0684
            r0 = 0
        L_0x0664:
            if (r0 >= r1) goto L_0x0684
            java.lang.Object r6 = r10.get(r0)
            l1.f$a r6 = (l1.f.a) r6
            if (r9 != 0) goto L_0x0678
            int r7 = r6.d()
            int r7 = r15 - r7
            r6.e(r7)
            goto L_0x0681
        L_0x0678:
            int r7 = r6.c()
            int r7 = r15 - r7
            r6.e(r7)
        L_0x0681:
            int r0 = r0 + 1
            goto L_0x0664
        L_0x0684:
            r6 = r3
            r0 = r23
            r13 = r27
            r14 = r28
            r7 = 0
            r11 = 0
            r12 = 0
            r3 = r2
            r2 = r24
        L_0x0691:
            if (r7 >= r1) goto L_0x0752
            java.lang.Object r16 = r10.get(r7)
            r30 = r5
            r5 = r16
            l1.f$a r5 = (l1.f.a) r5
            if (r9 != 0) goto L_0x06f6
            int r13 = r1 + -1
            if (r7 >= r13) goto L_0x06b4
            int r13 = r7 + 1
            java.lang.Object r13 = r10.get(r13)
            l1.f$a r13 = (l1.f.a) r13
            l1.d r13 = r13.f10895b
            l1.c r13 = r13.L
            r35 = r10
            r30 = 0
            goto L_0x06bc
        L_0x06b4:
            int r13 = r8.f10920v0
            r35 = r10
            r30 = r13
            r13 = r27
        L_0x06bc:
            l1.d r10 = r5.f10895b
            l1.c r10 = r10.N
            r16 = r5
            r17 = r9
            r18 = r0
            r19 = r2
            r20 = r14
            r21 = r13
            r22 = r3
            r23 = r6
            r24 = r4
            r25 = r30
            r26 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r5.d()
            int r2 = java.lang.Math.max(r11, r2)
            int r5 = r5.c()
            int r5 = r5 + r12
            if (r7 <= 0) goto L_0x06eb
            int r6 = r8.S0
            int r5 = r5 + r6
        L_0x06eb:
            r11 = r2
            r12 = r5
            r2 = r10
            r5 = r30
            r10 = r35
            r6 = 0
            r35 = r1
            goto L_0x074c
        L_0x06f6:
            r35 = r10
            int r4 = r1 + -1
            if (r7 >= r4) goto L_0x070f
            int r4 = r7 + 1
            r10 = r35
            java.lang.Object r4 = r10.get(r4)
            l1.f$a r4 = (l1.f.a) r4
            l1.d r4 = r4.f10895b
            l1.c r4 = r4.K
            r35 = r1
            r14 = r4
            r4 = 0
            goto L_0x0717
        L_0x070f:
            r10 = r35
            int r4 = r8.f10924z0
            r35 = r1
            r14 = r28
        L_0x0717:
            l1.d r1 = r5.f10895b
            l1.c r1 = r1.M
            r16 = r5
            r17 = r9
            r18 = r0
            r19 = r2
            r20 = r14
            r21 = r13
            r22 = r3
            r23 = r6
            r24 = r4
            r25 = r30
            r26 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r0 = r5.d()
            int r0 = r0 + r11
            int r3 = r5.c()
            int r3 = java.lang.Math.max(r12, r3)
            if (r7 <= 0) goto L_0x0746
            int r5 = r8.R0
            int r0 = r0 + r5
        L_0x0746:
            r11 = r0
            r0 = r1
            r12 = r3
            r5 = r30
            r3 = 0
        L_0x074c:
            int r7 = r7 + 1
            r1 = r35
            goto L_0x0691
        L_0x0752:
            r0 = 0
            r31[r0] = r11
            r0 = 1
            r31[r0] = r12
            goto L_0x076c
        L_0x0759:
            r10 = r3
            r31 = r6
            r32 = r7
            r30 = r11
            r29 = r13
            r33 = r14
            r34 = r15
            r13 = r4
            r15 = r5
            int r2 = r8.X0
            if (r13 != 0) goto L_0x0787
        L_0x076c:
            r0 = r38
            r1 = r39
            r2 = r40
            r3 = r41
            r12 = r8
            r13 = r29
            r6 = r31
            r7 = r32
            r14 = r33
        L_0x077d:
            r15 = r34
            r4 = r3
            r19 = 0
            r3 = r2
            r2 = r1
            r1 = 1
            goto L_0x080f
        L_0x0787:
            int r0 = r10.size()
            if (r0 != 0) goto L_0x07a2
            l1.f$a r9 = new l1.f$a
            l1.c r3 = r8.K
            l1.c r4 = r8.L
            l1.c r5 = r8.M
            l1.c r6 = r8.N
            r0 = r9
            r1 = r37
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.add(r9)
            goto L_0x07e2
        L_0x07a2:
            r0 = 0
            java.lang.Object r1 = r10.get(r0)
            r9 = r1
            l1.f$a r9 = (l1.f.a) r9
            r9.f10896c = r0
            r1 = 0
            r9.f10895b = r1
            r9.f10905l = r0
            r9.m = r0
            r9.f10906n = r0
            r9.f10907o = r0
            r9.f10908p = r0
            l1.c r0 = r8.K
            l1.c r1 = r8.L
            l1.c r3 = r8.M
            l1.c r4 = r8.N
            int r5 = r8.f10923y0
            int r6 = r8.f10919u0
            int r7 = r8.f10924z0
            int r10 = r8.f10920v0
            r16 = r9
            r17 = r2
            r18 = r0
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r10
            r26 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x07e2:
            r0 = 0
        L_0x07e3:
            if (r0 >= r13) goto L_0x07ed
            r1 = r30[r0]
            r9.a(r1)
            int r0 = r0 + 1
            goto L_0x07e3
        L_0x07ed:
            int r0 = r9.d()
            r19 = 0
            r31[r19] = r0
            int r0 = r9.c()
            r1 = 1
            r31[r1] = r0
            r0 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r12 = r8
            r13 = r29
            r6 = r31
            r7 = r32
            r14 = r33
            r15 = r34
        L_0x080f:
            r5 = r6[r19]
            int r5 = r5 + r13
            int r5 = r5 + r14
            r6 = r6[r1]
            int r6 = r6 + r15
            int r6 = r6 + r7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r0 != r9) goto L_0x081f
            r0 = r2
            goto L_0x082c
        L_0x081f:
            if (r0 != r7) goto L_0x0826
            int r0 = java.lang.Math.min(r5, r2)
            goto L_0x082c
        L_0x0826:
            if (r0 != 0) goto L_0x082a
            r0 = r5
            goto L_0x082c
        L_0x082a:
            r0 = r19
        L_0x082c:
            if (r3 != r9) goto L_0x0830
            r2 = r4
            goto L_0x083d
        L_0x0830:
            if (r3 != r7) goto L_0x0837
            int r2 = java.lang.Math.min(r6, r4)
            goto L_0x083d
        L_0x0837:
            if (r3 != 0) goto L_0x083b
            r2 = r6
            goto L_0x083d
        L_0x083b:
            r2 = r19
        L_0x083d:
            r12.B0 = r0
            r12.C0 = r2
            r12.O(r0)
            r12.L(r2)
            int r0 = r12.f10918t0
            if (r0 <= 0) goto L_0x084d
            r11 = r1
            goto L_0x084f
        L_0x084d:
            r11 = r19
        L_0x084f:
            r12.A0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.f.S(int, int, int, int):void");
    }

    public final int U(int i8, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.V;
        if (iArr[1] == 3) {
            int i10 = dVar.f10876t;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (dVar.A * ((float) i8));
                if (i11 != dVar.l()) {
                    dVar.f10852g = true;
                    T(dVar, iArr[0], dVar.r(), 1, i11);
                }
                return i11;
            } else if (i10 == 1) {
                return dVar.l();
            } else {
                if (i10 == 3) {
                    return (int) ((((float) dVar.r()) * dVar.Z) + 0.5f);
                }
            }
        }
        return dVar.l();
    }

    public final int V(int i8, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.V;
        if (iArr[0] == 3) {
            int i10 = dVar.f10875s;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (dVar.f10880x * ((float) i8));
                if (i11 != dVar.r()) {
                    dVar.f10852g = true;
                    T(dVar, 1, i11, iArr[1], dVar.l());
                }
                return i11;
            } else if (i10 == 1) {
                return dVar.r();
            } else {
                if (i10 == 3) {
                    return (int) ((((float) dVar.l()) * dVar.Z) + 0.5f);
                }
            }
        }
        return dVar.r();
    }

    public final void c(d dVar, boolean z10) {
        d dVar2;
        float f10;
        int i8;
        super.c(dVar, z10);
        d dVar3 = this.W;
        boolean z11 = dVar3 != null && ((e) dVar3).f10887x0;
        int i10 = this.V0;
        ArrayList<a> arrayList = this.Y0;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    arrayList.get(i11).b(i11, z11, i11 == size + -1);
                    i11++;
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        arrayList.get(i12).b(i12, z11, i12 == size2 + -1);
                        i12++;
                    }
                }
            } else if (!(this.f10891b1 == null || this.f10890a1 == null || this.Z0 == null)) {
                for (int i13 = 0; i13 < this.f10893d1; i13++) {
                    this.f10892c1[i13].E();
                }
                int[] iArr = this.f10891b1;
                int i14 = iArr[0];
                int i15 = iArr[1];
                float f11 = this.L0;
                d dVar4 = null;
                int i16 = 0;
                while (i16 < i14) {
                    if (z11) {
                        i8 = (i14 - i16) - 1;
                        f10 = 1.0f - this.L0;
                    } else {
                        f10 = f11;
                        i8 = i16;
                    }
                    d dVar5 = this.f10890a1[i8];
                    if (!(dVar5 == null || dVar5.f10859j0 == 8)) {
                        c cVar = dVar5.K;
                        if (i16 == 0) {
                            dVar5.g(cVar, this.K, this.f10923y0);
                            dVar5.f10863l0 = this.F0;
                            dVar5.f10853g0 = f10;
                        }
                        if (i16 == i14 - 1) {
                            dVar5.g(dVar5.M, this.M, this.f10924z0);
                        }
                        if (i16 > 0 && dVar4 != null) {
                            int i17 = this.R0;
                            c cVar2 = dVar4.M;
                            dVar5.g(cVar, cVar2, i17);
                            dVar4.g(cVar2, cVar, 0);
                        }
                        dVar4 = dVar5;
                    }
                    i16++;
                    f11 = f10;
                }
                for (int i18 = 0; i18 < i15; i18++) {
                    d dVar6 = this.Z0[i18];
                    if (!(dVar6 == null || dVar6.f10859j0 == 8)) {
                        c cVar3 = dVar6.L;
                        if (i18 == 0) {
                            dVar6.g(cVar3, this.L, this.f10919u0);
                            dVar6.f10864m0 = this.G0;
                            dVar6.f10855h0 = this.M0;
                        }
                        if (i18 == i15 - 1) {
                            dVar6.g(dVar6.N, this.N, this.f10920v0);
                        }
                        if (i18 > 0 && dVar4 != null) {
                            int i19 = this.S0;
                            c cVar4 = dVar4.N;
                            dVar6.g(cVar3, cVar4, i19);
                            dVar4.g(cVar4, cVar3, 0);
                        }
                        dVar4 = dVar6;
                    }
                }
                for (int i20 = 0; i20 < i14; i20++) {
                    for (int i21 = 0; i21 < i15; i21++) {
                        int i22 = (i21 * i14) + i20;
                        if (this.X0 == 1) {
                            i22 = (i20 * i15) + i21;
                        }
                        d[] dVarArr = this.f10892c1;
                        if (!(i22 >= dVarArr.length || (dVar2 = dVarArr[i22]) == null || dVar2.f10859j0 == 8)) {
                            d dVar7 = this.f10890a1[i20];
                            d dVar8 = this.Z0[i21];
                            if (dVar2 != dVar7) {
                                dVar2.g(dVar2.K, dVar7.K, 0);
                                dVar2.g(dVar2.M, dVar7.M, 0);
                            }
                            if (dVar2 != dVar8) {
                                dVar2.g(dVar2.L, dVar8.L, 0);
                                dVar2.g(dVar2.N, dVar8.N, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z11, true);
        }
        this.A0 = false;
    }
}
