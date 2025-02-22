package s0;

import ff.e;
import java.util.Arrays;
import q.g;
import s0.b1;
import s0.f0;
import sf.j;
import u.d;

public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f14385a;

    /* renamed from: b  reason: collision with root package name */
    public final l f14386b = new l();

    /* renamed from: c  reason: collision with root package name */
    public boolean f14387c;

    /* renamed from: d  reason: collision with root package name */
    public final z0 f14388d = new z0();

    /* renamed from: e  reason: collision with root package name */
    public final d<b1.a> f14389e = new d<>(new b1.a[16]);

    /* renamed from: f  reason: collision with root package name */
    public final long f14390f = 1;

    /* renamed from: g  reason: collision with root package name */
    public final d<a> f14391g = new d<>(new a[16]);

    /* renamed from: h  reason: collision with root package name */
    public f1.a f14392h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f14393a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14394b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f14395c;

        public a(a0 a0Var, boolean z10, boolean z11) {
            j.f(a0Var, "node");
            this.f14393a = a0Var;
            this.f14394b = z10;
            this.f14395c = z11;
        }
    }

    public m0(a0 a0Var) {
        j.f(a0Var, "root");
        this.f14385a = a0Var;
    }

    public static boolean e(a0 a0Var) {
        f0 f0Var = a0Var.W;
        if (!f0Var.f14341f) {
            return false;
        }
        if (a0Var.R == 1) {
            return true;
        }
        f0Var.getClass();
        return false;
    }

    public final void a(boolean z10) {
        z0 z0Var = this.f14388d;
        if (z10) {
            z0Var.getClass();
            a0 a0Var = this.f14385a;
            j.f(a0Var, "rootNode");
            d<a0> dVar = z0Var.f14471a;
            dVar.f();
            dVar.b(a0Var);
            a0Var.f14313b0 = true;
        }
        y0 y0Var = y0.f14469a;
        d<a0> dVar2 = z0Var.f14471a;
        dVar2.getClass();
        T[] tArr = dVar2.f15638a;
        int i8 = dVar2.f15640c;
        j.f(tArr, "<this>");
        Arrays.sort(tArr, 0, i8, y0Var);
        int i10 = dVar2.f15640c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            T[] tArr2 = dVar2.f15638a;
            do {
                a0 a0Var2 = (a0) tArr2[i11];
                if (a0Var2.f14313b0) {
                    z0.a(a0Var2);
                }
                i11--;
            } while (i11 >= 0);
        }
        dVar2.f();
    }

    public final boolean b(a0 a0Var, f1.a aVar) {
        a0Var.getClass();
        return false;
    }

    public final boolean c(a0 a0Var, f1.a aVar) {
        boolean z10;
        if (aVar != null) {
            z10 = a0Var.E(aVar);
        } else {
            f0.b bVar = a0Var.W.f14344i;
            z10 = a0Var.E(bVar.f14346e ? new f1.a(bVar.f12812d) : null);
        }
        a0 q10 = a0Var.q();
        if (z10 && q10 != null) {
            int i8 = a0Var.Q;
            if (i8 == 1) {
                n(q10, false);
            } else if (i8 == 2) {
                m(q10, false);
            }
        }
        return z10;
    }

    public final void d(a0 a0Var) {
        j.f(a0Var, "layoutNode");
        l lVar = this.f14386b;
        if (!lVar.f14384a.isEmpty()) {
            if (this.f14387c) {
                f0 f0Var = a0Var.W;
                if (!f0Var.f14338c) {
                    d<a0> s10 = a0Var.s();
                    int i8 = s10.f15640c;
                    if (i8 > 0) {
                        T[] tArr = s10.f15638a;
                        int i10 = 0;
                        do {
                            a0 a0Var2 = (a0) tArr[i10];
                            if (a0Var2.W.f14338c && lVar.b(a0Var2)) {
                                i(a0Var2);
                            }
                            if (!a0Var2.W.f14338c) {
                                d(a0Var2);
                            }
                            i10++;
                        } while (i10 < i8);
                    }
                    if (f0Var.f14338c && lVar.b(a0Var)) {
                        i(a0Var);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(rf.a<ff.m> r9) {
        /*
            r8 = this;
            s0.l r0 = r8.f14386b
            s0.a0 r1 = r8.f14385a
            boolean r2 = r1.y()
            java.lang.String r3 = "Failed requirement."
            if (r2 == 0) goto L_0x0082
            boolean r2 = r1.M
            if (r2 == 0) goto L_0x0078
            boolean r2 = r8.f14387c
            r4 = 1
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x006e
            f1.a r2 = r8.f14392h
            r3 = 0
            if (r2 == 0) goto L_0x0057
            r8.f14387c = r4
            s0.r1<s0.a0> r2 = r0.f14384a     // Catch:{ all -> 0x004e }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x004e }
            s0.r1<s0.a0> r5 = r0.f14384a
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0050
            r2 = r3
        L_0x0029:
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x004e }
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x0048
            java.lang.Object r6 = r5.first()     // Catch:{ all -> 0x004e }
            s0.a0 r6 = (s0.a0) r6     // Catch:{ all -> 0x004e }
            java.lang.String r7 = "node"
            sf.j.e(r6, r7)     // Catch:{ all -> 0x004e }
            r0.b(r6)     // Catch:{ all -> 0x004e }
            boolean r7 = r8.i(r6)     // Catch:{ all -> 0x004e }
            if (r6 != r1) goto L_0x0029
            if (r7 == 0) goto L_0x0029
            r2 = r4
            goto L_0x0029
        L_0x0048:
            if (r9 == 0) goto L_0x0051
            r9.d()     // Catch:{ all -> 0x004e }
            goto L_0x0051
        L_0x004e:
            r9 = move-exception
            goto L_0x0054
        L_0x0050:
            r2 = r3
        L_0x0051:
            r8.f14387c = r3
            goto L_0x0058
        L_0x0054:
            r8.f14387c = r3
            throw r9
        L_0x0057:
            r2 = r3
        L_0x0058:
            u.d<s0.b1$a> r9 = r8.f14389e
            int r0 = r9.f15640c
            if (r0 <= 0) goto L_0x006a
            T[] r1 = r9.f15638a
        L_0x0060:
            r5 = r1[r3]
            s0.b1$a r5 = (s0.b1.a) r5
            r5.b()
            int r3 = r3 + r4
            if (r3 < r0) goto L_0x0060
        L_0x006a:
            r9.f()
            return r2
        L_0x006e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r3.toString()
            r9.<init>(r0)
            throw r9
        L_0x0078:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r3.toString()
            r9.<init>(r0)
            throw r9
        L_0x0082:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r3.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.m0.f(rf.a):boolean");
    }

    public final void g() {
        a0 a0Var = this.f14385a;
        if (!a0Var.y()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!a0Var.M) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!this.f14387c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (this.f14392h != null) {
            this.f14387c = true;
            try {
                h(a0Var);
            } finally {
                this.f14387c = false;
            }
        }
    }

    public final void h(a0 a0Var) {
        j(a0Var);
        d<a0> s10 = a0Var.s();
        int i8 = s10.f15640c;
        if (i8 > 0) {
            T[] tArr = s10.f15638a;
            int i10 = 0;
            do {
                a0 a0Var2 = (a0) tArr[i10];
                boolean z10 = true;
                if (a0Var2.Q != 1 && !a0Var2.W.f14344i.H.f()) {
                    z10 = false;
                }
                if (z10) {
                    h(a0Var2);
                }
                i10++;
            } while (i10 < i8);
        }
        j(a0Var);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(s0.a0 r13) {
        /*
            r12 = this;
            boolean r0 = r13.M
            r1 = 1
            r2 = 0
            s0.f0 r3 = r13.W
            if (r0 != 0) goto L_0x0049
            boolean r0 = r3.f14338c
            if (r0 == 0) goto L_0x0022
            int r0 = r13.Q
            if (r0 == r1) goto L_0x001d
            s0.f0$b r0 = r3.f14344i
            s0.d0 r0 = r0.H
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = r2
            goto L_0x001e
        L_0x001d:
            r0 = r1
        L_0x001e:
            if (r0 == 0) goto L_0x0022
            r0 = r1
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            if (r0 != 0) goto L_0x0049
            java.lang.Boolean r0 = r13.z()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r0 = sf.j.a(r0, r4)
            if (r0 != 0) goto L_0x0049
            boolean r0 = e(r13)
            if (r0 != 0) goto L_0x0049
            s0.f0$b r0 = r3.f14344i
            s0.d0 r0 = r0.H
            boolean r0 = r0.f()
            if (r0 != 0) goto L_0x0046
            r3.getClass()
            r0 = r2
            goto L_0x0047
        L_0x0046:
            r0 = r1
        L_0x0047:
            if (r0 == 0) goto L_0x0133
        L_0x0049:
            r3.getClass()
            r0 = 0
            s0.a0 r4 = r12.f14385a
            boolean r5 = r3.f14338c
            if (r5 == 0) goto L_0x0064
            if (r13 != r4) goto L_0x005b
            f1.a r5 = r12.f14392h
            sf.j.c(r5)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            r3.getClass()
            boolean r5 = r12.c(r13, r5)
            goto L_0x0065
        L_0x0064:
            r5 = r2
        L_0x0065:
            boolean r6 = r3.f14341f
            java.lang.String r7 = "Check failed."
            r8 = 3
            if (r6 == 0) goto L_0x0087
            java.lang.Boolean r6 = r13.z()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r6 = sf.j.a(r6, r9)
            if (r6 == 0) goto L_0x0087
            int r0 = r13.S
            if (r0 != r8) goto L_0x007f
            r13.l()
        L_0x007f:
            r13 = 0
            r3.getClass()
            sf.j.c(r13)
            throw r13
        L_0x0087:
            boolean r6 = r3.f14339d
            if (r6 == 0) goto L_0x0101
            boolean r6 = r13.M
            if (r6 == 0) goto L_0x0101
            s0.f0$b r3 = r3.f14344i
            if (r13 != r4) goto L_0x00ce
            int r4 = r13.S
            if (r4 != r8) goto L_0x009a
            r13.l()
        L_0x009a:
            q0.v$a$a r4 = q0.v.a.f12813a
            int r6 = r3.C()
            f1.j r7 = r13.K
            s0.a0 r8 = r13.q()
            if (r8 == 0) goto L_0x00ad
            s0.p0 r8 = r8.V
            s0.r r8 = r8.f14401b
            goto L_0x00ae
        L_0x00ad:
            r8 = r0
        L_0x00ae:
            q0.h r9 = q0.v.a.f12816d
            r4.getClass()
            int r10 = q0.v.a.f12815c
            f1.j r11 = q0.v.a.f12814b
            q0.v.a.f12815c = r6
            q0.v.a.f12814b = r7
            boolean r6 = q0.v.a.C0251a.g(r4, r8)
            q0.v.a.e(r4, r3)
            if (r8 != 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r8.B = r6
        L_0x00c7:
            q0.v.a.f12815c = r10
            q0.v.a.f12814b = r11
            q0.v.a.f12816d = r9
            goto L_0x00e6
        L_0x00ce:
            int r4 = r13.S
            if (r4 != r8) goto L_0x00d5
            r13.l()
        L_0x00d5:
            r13.f14315c0 = r1     // Catch:{ all -> 0x00fd }
            boolean r4 = r3.B     // Catch:{ all -> 0x00fd }
            if (r4 == 0) goto L_0x00f3
            long r6 = r3.C     // Catch:{ all -> 0x00fd }
            float r4 = r3.E     // Catch:{ all -> 0x00fd }
            rf.l<? super i0.k, ff.m> r8 = r3.D     // Catch:{ all -> 0x00fd }
            r3.I(r6, r4, r8)     // Catch:{ all -> 0x00fd }
            r13.f14315c0 = r2
        L_0x00e6:
            s0.z0 r3 = r12.f14388d
            r3.getClass()
            u.d<s0.a0> r3 = r3.f14471a
            r3.b(r13)
            r13.f14313b0 = r1
            goto L_0x0101
        L_0x00f3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x00fd }
            r0.<init>(r1)     // Catch:{ all -> 0x00fd }
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            r13.f14315c0 = r2
            throw r0
        L_0x0101:
            u.d<s0.m0$a> r13 = r12.f14391g
            boolean r1 = r13.i()
            if (r1 == 0) goto L_0x0132
            int r1 = r13.f15640c
            if (r1 <= 0) goto L_0x012f
            T[] r3 = r13.f15638a
        L_0x010f:
            r4 = r3[r2]
            s0.m0$a r4 = (s0.m0.a) r4
            s0.a0 r6 = r4.f14393a
            boolean r6 = r6.y()
            if (r6 == 0) goto L_0x012b
            boolean r6 = r4.f14394b
            boolean r7 = r4.f14395c
            s0.a0 r4 = r4.f14393a
            if (r6 != 0) goto L_0x0127
            r12.n(r4, r7)
            goto L_0x012b
        L_0x0127:
            r12.l(r4, r7)
            throw r0
        L_0x012b:
            int r2 = r2 + 1
            if (r2 < r1) goto L_0x010f
        L_0x012f:
            r13.f()
        L_0x0132:
            r2 = r5
        L_0x0133:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.m0.i(s0.a0):boolean");
    }

    public final void j(a0 a0Var) {
        f1.a aVar;
        f0 f0Var = a0Var.W;
        if (!f0Var.f14338c) {
            f0Var.getClass();
            return;
        }
        if (a0Var == this.f14385a) {
            aVar = this.f14392h;
            j.c(aVar);
        } else {
            aVar = null;
        }
        a0Var.W.getClass();
        c(a0Var, aVar);
    }

    public final boolean k(a0 a0Var, boolean z10) {
        j.f(a0Var, "layoutNode");
        f0 f0Var = a0Var.W;
        int c3 = g.c(f0Var.f14337b);
        if (c3 != 0) {
            if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 != 3) {
                        if (c3 != 4) {
                            throw new e();
                        }
                    }
                }
            }
            return false;
        }
        f0Var.getClass();
        if (!f0Var.f14341f || z10) {
            f0Var.f14341f = true;
            f0Var.getClass();
            f0Var.f14339d = true;
            f0Var.f14340e = true;
            if (j.a(a0Var.z(), Boolean.TRUE)) {
                a0 q10 = a0Var.q();
                if (q10 != null) {
                    q10.W.getClass();
                }
                if (!(q10 != null && q10.W.f14341f)) {
                    this.f14386b.a(a0Var);
                }
            }
            if (!this.f14387c) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(a0 a0Var, boolean z10) {
        j.f(a0Var, "layoutNode");
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }

    public final boolean m(a0 a0Var, boolean z10) {
        j.f(a0Var, "layoutNode");
        f0 f0Var = a0Var.W;
        int c3 = g.c(f0Var.f14337b);
        if (c3 == 0 || c3 == 1 || c3 == 2 || c3 == 3) {
            return false;
        }
        if (c3 != 4) {
            throw new e();
        } else if (!z10 && (f0Var.f14338c || f0Var.f14339d)) {
            return false;
        } else {
            f0Var.f14339d = true;
            f0Var.f14340e = true;
            if (a0Var.M) {
                a0 q10 = a0Var.q();
                if (!(q10 != null && q10.W.f14339d)) {
                    if (!(q10 != null && q10.W.f14338c)) {
                        this.f14386b.a(a0Var);
                    }
                }
            }
            return !this.f14387c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        if ((r6.Q == 1 || r0.f14344i.H.f()) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(s0.a0 r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "layoutNode"
            sf.j.f(r6, r0)
            s0.f0 r0 = r6.W
            int r1 = r0.f14337b
            int r1 = q.g.c(r1)
            r2 = 0
            if (r1 == 0) goto L_0x006e
            r3 = 1
            if (r1 == r3) goto L_0x006e
            r4 = 2
            if (r1 == r4) goto L_0x0064
            r4 = 3
            if (r1 == r4) goto L_0x0064
            r4 = 4
            if (r1 != r4) goto L_0x005e
            boolean r1 = r0.f14338c
            if (r1 == 0) goto L_0x0023
            if (r7 != 0) goto L_0x0023
            goto L_0x006e
        L_0x0023:
            r0.f14338c = r3
            boolean r7 = r6.M
            if (r7 != 0) goto L_0x0042
            int r7 = r6.Q
            if (r7 == r3) goto L_0x003a
            s0.f0$b r7 = r0.f14344i
            s0.d0 r7 = r7.H
            boolean r7 = r7.f()
            if (r7 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r7 = r2
            goto L_0x003b
        L_0x003a:
            r7 = r3
        L_0x003b:
            if (r7 == 0) goto L_0x003f
            r7 = r3
            goto L_0x0040
        L_0x003f:
            r7 = r2
        L_0x0040:
            if (r7 == 0) goto L_0x0058
        L_0x0042:
            s0.a0 r7 = r6.q()
            if (r7 == 0) goto L_0x0050
            s0.f0 r7 = r7.W
            boolean r7 = r7.f14338c
            if (r7 != r3) goto L_0x0050
            r7 = r3
            goto L_0x0051
        L_0x0050:
            r7 = r2
        L_0x0051:
            if (r7 != 0) goto L_0x0058
            s0.l r7 = r5.f14386b
            r7.a(r6)
        L_0x0058:
            boolean r6 = r5.f14387c
            if (r6 != 0) goto L_0x006e
            r2 = r3
            goto L_0x006e
        L_0x005e:
            ff.e r6 = new ff.e
            r6.<init>()
            throw r6
        L_0x0064:
            s0.m0$a r0 = new s0.m0$a
            r0.<init>(r6, r2, r7)
            u.d<s0.m0$a> r6 = r5.f14391g
            r6.b(r0)
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.m0.n(s0.a0, boolean):boolean");
    }

    public final void o(long j10) {
        f1.a aVar = this.f14392h;
        boolean z10 = false;
        if (aVar != null && aVar.f8025a == j10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        if (!this.f14387c) {
            this.f14392h = new f1.a(j10);
            a0 a0Var = this.f14385a;
            a0Var.W.f14338c = true;
            this.f14386b.a(a0Var);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
