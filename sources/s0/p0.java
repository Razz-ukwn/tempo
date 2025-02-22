package s0;

import d0.g;
import g0.n;
import g0.s;
import r0.f;
import s0.q0;
import s0.r;
import sf.j;
import u.d;

public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f14400a;

    /* renamed from: b  reason: collision with root package name */
    public final r f14401b;

    /* renamed from: c  reason: collision with root package name */
    public s0 f14402c;

    /* renamed from: d  reason: collision with root package name */
    public final r.a f14403d;

    /* renamed from: e  reason: collision with root package name */
    public g.c f14404e;

    /* renamed from: f  reason: collision with root package name */
    public d<g.b> f14405f;

    /* renamed from: g  reason: collision with root package name */
    public d<g.b> f14406g;

    /* renamed from: h  reason: collision with root package name */
    public a f14407h;

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public g.c f14408a;

        /* renamed from: b  reason: collision with root package name */
        public int f14409b;

        /* renamed from: c  reason: collision with root package name */
        public d<g.b> f14410c;

        /* renamed from: d  reason: collision with root package name */
        public d<g.b> f14411d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ p0 f14412e;

        public a(p0 p0Var, g.c cVar, int i8, d<g.b> dVar, d<g.b> dVar2) {
            j.f(cVar, "node");
            this.f14412e = p0Var;
            this.f14408a = cVar;
            this.f14409b = i8;
            this.f14410c = dVar;
            this.f14411d = dVar2;
        }

        public final void a(int i8) {
            g.c cVar = this.f14408a;
            this.f14412e.getClass();
            g.c b10 = p0.b((g.b) this.f14411d.f15638a[i8], cVar);
            this.f14408a = b10;
            if (!b10.F) {
                b10.D = true;
                int i10 = this.f14409b | b10.f7178b;
                this.f14409b = i10;
                b10.f7179c = i10;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public final void b(int i8, int i10) {
            g.c cVar = this.f14408a.f7180d;
            j.c(cVar);
            this.f14408a = cVar;
            g.b bVar = (g.b) this.f14410c.f15638a[i8];
            g.b bVar2 = (g.b) this.f14411d.f15638a[i10];
            boolean a10 = j.a(bVar, bVar2);
            p0 p0Var = this.f14412e;
            if (!a10) {
                g.c cVar2 = this.f14408a;
                p0Var.getClass();
                this.f14408a = p0.e(bVar, bVar2, cVar2);
            } else {
                p0Var.getClass();
            }
            int i11 = this.f14409b;
            g.c cVar3 = this.f14408a;
            int i12 = i11 | cVar3.f7178b;
            this.f14409b = i12;
            cVar3.f7179c = i12;
        }
    }

    public p0(a0 a0Var) {
        j.f(a0Var, "layoutNode");
        this.f14400a = a0Var;
        r rVar = new r(a0Var);
        this.f14401b = rVar;
        this.f14402c = rVar;
        r.a aVar = rVar.f14426b0;
        this.f14403d = aVar;
        this.f14404e = aVar;
    }

    public static g.c b(g.b bVar, g.c cVar) {
        g.c cVar2;
        if (bVar instanceof n0) {
            cVar2 = ((n0) bVar).s();
            j.f(cVar2, "node");
            int i8 = cVar2 instanceof x ? 3 : 1;
            if (cVar2 instanceof m) {
                i8 |= 4;
            }
            if (cVar2 instanceof p1) {
                i8 |= 8;
            }
            if (cVar2 instanceof m1) {
                i8 |= 16;
            }
            if (cVar2 instanceof f) {
                i8 |= 32;
            }
            if (cVar2 instanceof l1) {
                i8 |= 64;
            }
            if (cVar2 instanceof w) {
                i8 |= 128;
            }
            if (cVar2 instanceof p) {
                i8 |= 256;
            }
            if (cVar2 instanceof t) {
                i8 |= 512;
            }
            if (cVar2 instanceof s) {
                i8 |= 1024;
            }
            if (cVar2 instanceof n) {
                i8 |= 2048;
            }
            if (cVar2 instanceof g0.d) {
                i8 |= 4096;
            }
            if (cVar2 instanceof n0.d) {
                i8 |= 8192;
            }
            if (cVar2 instanceof p0.a) {
                i8 |= 16384;
            }
            cVar2.f7178b = i8;
        } else {
            cVar2 = new c(bVar);
        }
        if (!cVar2.F) {
            cVar2.D = true;
            g.c cVar3 = cVar.f7180d;
            if (cVar3 != null) {
                cVar3.f7181e = cVar2;
                cVar2.f7180d = cVar3;
            }
            cVar.f7180d = cVar2;
            cVar2.f7181e = cVar;
            return cVar2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static g.c c(g.c cVar) {
        if (cVar.F) {
            v0.a(cVar, 2);
            cVar.y();
        }
        g.c cVar2 = cVar.f7181e;
        g.c cVar3 = cVar.f7180d;
        if (cVar2 != null) {
            cVar2.f7180d = cVar3;
            cVar.f7181e = null;
        }
        if (cVar3 != null) {
            cVar3.f7181e = cVar2;
            cVar.f7180d = null;
        }
        j.c(cVar2);
        return cVar2;
    }

    public static g.c e(g.b bVar, g.b bVar2, g.c cVar) {
        if ((bVar instanceof n0) && (bVar2 instanceof n0)) {
            q0.a aVar = q0.f14424a;
            j.d(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            g.c t2 = ((n0) bVar2).t(cVar);
            if (t2 == cVar) {
                if (t2.F) {
                    v0.a(t2, 0);
                } else {
                    t2.E = true;
                }
                return t2;
            } else if (!t2.F) {
                t2.D = true;
                if (cVar.F) {
                    v0.a(cVar, 2);
                    cVar.y();
                }
                g.c cVar2 = cVar.f7180d;
                if (cVar2 != null) {
                    t2.f7180d = cVar2;
                    cVar2.f7181e = t2;
                    cVar.f7180d = null;
                }
                g.c cVar3 = cVar.f7181e;
                if (cVar3 != null) {
                    t2.f7181e = cVar3;
                    cVar3.f7180d = t2;
                    cVar.f7181e = null;
                }
                t2.C = cVar.C;
                return t2;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } else if (cVar instanceof c) {
            c cVar4 = (c) cVar;
            cVar4.getClass();
            j.f(bVar2, "value");
            if (cVar4.F) {
                cVar4.D();
            }
            cVar4.G = bVar2;
            cVar4.f7178b = v0.b(bVar2);
            if (cVar4.F) {
                cVar4.C(false);
            }
            if (cVar.F) {
                v0.a(cVar, 0);
            } else {
                cVar.E = true;
            }
            return cVar;
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
    }

    public final void a(boolean z10) {
        for (g.c cVar = this.f14404e; cVar != null; cVar = cVar.f7181e) {
            boolean z11 = cVar.F;
            if (!z11) {
                if (!z11) {
                    if (cVar.C != null) {
                        cVar.F = true;
                        cVar.z();
                        if (z10) {
                            if (cVar.D) {
                                v0.a(cVar, 1);
                            }
                            if (cVar.E) {
                                v0.a(cVar, 0);
                            }
                        }
                        cVar.D = false;
                        cVar.E = false;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0206, code lost:
        r1 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(u.d<d0.g.b> r31, int r32, u.d<d0.g.b> r33, int r34, d0.g.c r35) {
        /*
            r30 = this;
            r6 = r30
            r7 = r32
            r8 = r34
            r2 = r35
            s0.p0$a r0 = r6.f14407h
            if (r0 != 0) goto L_0x001f
            s0.p0$a r9 = new s0.p0$a
            int r3 = r2.f7179c
            r0 = r9
            r1 = r30
            r2 = r35
            r4 = r31
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f14407h = r9
            goto L_0x0032
        L_0x001f:
            java.lang.String r1 = "<set-?>"
            sf.j.f(r2, r1)
            r0.f14408a = r2
            int r1 = r2.f7179c
            r0.f14409b = r1
            r1 = r31
            r0.f14410c = r1
            r1 = r33
            r0.f14411d = r1
        L_0x0032:
            int r1 = r7 + r8
            r2 = 1
            int r1 = r1 + r2
            r3 = 2
            int r1 = r1 / r3
            s0.s r4 = new s0.s
            int r5 = r1 * 3
            r4.<init>(r5)
            s0.s r5 = new s0.s
            int r9 = r1 * 4
            r5.<init>(r9)
            r9 = 0
            r5.c(r9, r7, r9, r8)
            int r1 = r1 * r3
            int r1 = r1 + r2
            int[] r10 = new int[r1]
            int[] r11 = new int[r1]
            r12 = 5
            int[] r12 = new int[r12]
        L_0x0053:
            int r13 = r5.f14429b
            if (r13 == 0) goto L_0x0059
            r13 = r2
            goto L_0x005a
        L_0x0059:
            r13 = r9
        L_0x005a:
            if (r13 == 0) goto L_0x02b8
            int r13 = r5.a()
            int r15 = r5.a()
            int r14 = r5.a()
            int r9 = r5.a()
            int r3 = r14 - r9
            int r6 = r13 - r15
            r16 = 4
            if (r3 < r2) goto L_0x0220
            if (r6 >= r2) goto L_0x0078
            goto L_0x0220
        L_0x0078:
            int r17 = r3 + r6
            int r17 = r17 + 1
            r18 = 2
            int r2 = r17 / 2
            int r17 = r1 / 2
            int r19 = r17 + 1
            r10[r19] = r9
            r11[r19] = r14
            r19 = r1
            r1 = 0
        L_0x008b:
            if (r1 >= r2) goto L_0x0222
            int r20 = r3 - r6
            int r21 = java.lang.Math.abs(r20)
            r22 = r2
            int r2 = r21 % 2
            r21 = r3
            r3 = 1
            if (r2 != r3) goto L_0x009e
            r2 = 1
            goto L_0x009f
        L_0x009e:
            r2 = 0
        L_0x009f:
            int r3 = -r1
            r18 = r6
            r6 = r3
        L_0x00a3:
            if (r6 > r1) goto L_0x0146
            if (r6 == r3) goto L_0x00c1
            if (r6 == r1) goto L_0x00b8
            int r23 = r6 + 1
            int r23 = r23 + r17
            r7 = r10[r23]
            int r23 = r6 + -1
            int r23 = r23 + r17
            r8 = r10[r23]
            if (r7 <= r8) goto L_0x00b8
            goto L_0x00c1
        L_0x00b8:
            int r7 = r6 + -1
            int r7 = r7 + r17
            r7 = r10[r7]
            int r8 = r7 + 1
            goto L_0x00c8
        L_0x00c1:
            int r7 = r6 + 1
            int r7 = r7 + r17
            r7 = r10[r7]
            r8 = r7
        L_0x00c8:
            int r23 = r8 - r9
            int r23 = r23 + r15
            int r23 = r23 - r6
            if (r1 == 0) goto L_0x00dc
            if (r8 == r7) goto L_0x00d3
            goto L_0x00dc
        L_0x00d3:
            int r24 = r23 + -1
            r29 = r23
            r23 = r5
            r5 = r29
            goto L_0x00e2
        L_0x00dc:
            r24 = r23
            r23 = r5
            r5 = r24
        L_0x00e2:
            if (r8 >= r14) goto L_0x010e
            if (r5 >= r13) goto L_0x010e
            r25 = r4
            u.d<d0.g$b> r4 = r0.f14410c
            T[] r4 = r4.f15638a
            r4 = r4[r8]
            d0.g$b r4 = (d0.g.b) r4
            r26 = r15
            u.d<d0.g$b> r15 = r0.f14411d
            T[] r15 = r15.f15638a
            r15 = r15[r5]
            d0.g$b r15 = (d0.g.b) r15
            int r4 = s0.q0.a(r4, r15)
            if (r4 == 0) goto L_0x0102
            r4 = 1
            goto L_0x0103
        L_0x0102:
            r4 = 0
        L_0x0103:
            if (r4 == 0) goto L_0x0112
            int r8 = r8 + 1
            int r5 = r5 + 1
            r4 = r25
            r15 = r26
            goto L_0x00e2
        L_0x010e:
            r25 = r4
            r26 = r15
        L_0x0112:
            int r4 = r17 + r6
            r10[r4] = r8
            if (r2 == 0) goto L_0x0138
            int r4 = r20 - r6
            int r15 = r3 + 1
            if (r4 < r15) goto L_0x0138
            int r15 = r1 + -1
            if (r4 > r15) goto L_0x0138
            int r4 = r17 + r4
            r4 = r11[r4]
            if (r4 > r8) goto L_0x0138
            r2 = 0
            r12[r2] = r7
            r4 = 1
            r12[r4] = r24
            r4 = 2
            r12[r4] = r8
            r4 = 3
            r12[r4] = r5
            r12[r16] = r2
            r2 = 1
            goto L_0x014d
        L_0x0138:
            int r6 = r6 + 2
            r7 = r32
            r8 = r34
            r5 = r23
            r4 = r25
            r15 = r26
            goto L_0x00a3
        L_0x0146:
            r25 = r4
            r23 = r5
            r26 = r15
            r2 = 0
        L_0x014d:
            if (r2 == 0) goto L_0x0157
            r27 = r13
            r28 = r14
            r15 = r26
            goto L_0x0206
        L_0x0157:
            int r2 = r20 % 2
            if (r2 != 0) goto L_0x015d
            r2 = 1
            goto L_0x015e
        L_0x015d:
            r2 = 0
        L_0x015e:
            r4 = r3
        L_0x015f:
            if (r4 > r1) goto L_0x01fd
            if (r4 == r3) goto L_0x017d
            if (r4 == r1) goto L_0x0174
            int r5 = r4 + 1
            int r5 = r5 + r17
            r5 = r11[r5]
            int r6 = r4 + -1
            int r6 = r6 + r17
            r6 = r11[r6]
            if (r5 >= r6) goto L_0x0174
            goto L_0x017d
        L_0x0174:
            int r5 = r4 + -1
            int r5 = r5 + r17
            r5 = r11[r5]
            int r6 = r5 + -1
            goto L_0x0184
        L_0x017d:
            int r5 = r4 + 1
            int r5 = r5 + r17
            r5 = r11[r5]
            r6 = r5
        L_0x0184:
            int r7 = r14 - r6
            int r7 = r7 - r4
            int r7 = r13 - r7
            if (r1 == 0) goto L_0x0191
            if (r6 == r5) goto L_0x018e
            goto L_0x0191
        L_0x018e:
            int r8 = r7 + 1
            goto L_0x0192
        L_0x0191:
            r8 = r7
        L_0x0192:
            if (r6 <= r9) goto L_0x01cb
            r15 = r26
            if (r7 <= r15) goto L_0x01c6
            int r24 = r6 + -1
            int r26 = r7 + -1
            r27 = r13
            u.d<d0.g$b> r13 = r0.f14410c
            T[] r13 = r13.f15638a
            r13 = r13[r24]
            d0.g$b r13 = (d0.g.b) r13
            r28 = r14
            u.d<d0.g$b> r14 = r0.f14411d
            T[] r14 = r14.f15638a
            r14 = r14[r26]
            d0.g$b r14 = (d0.g.b) r14
            int r13 = s0.q0.a(r13, r14)
            if (r13 == 0) goto L_0x01b8
            r13 = 1
            goto L_0x01b9
        L_0x01b8:
            r13 = 0
        L_0x01b9:
            if (r13 == 0) goto L_0x01d1
            r6 = r24
            r7 = r26
            r13 = r27
            r14 = r28
            r26 = r15
            goto L_0x0192
        L_0x01c6:
            r27 = r13
            r28 = r14
            goto L_0x01d1
        L_0x01cb:
            r27 = r13
            r28 = r14
            r15 = r26
        L_0x01d1:
            int r13 = r17 + r4
            r11[r13] = r6
            if (r2 == 0) goto L_0x01f3
            int r13 = r20 - r4
            if (r13 < r3) goto L_0x01f3
            if (r13 > r1) goto L_0x01f3
            int r13 = r17 + r13
            r13 = r10[r13]
            if (r13 < r6) goto L_0x01f3
            r2 = 0
            r12[r2] = r6
            r2 = 1
            r12[r2] = r7
            r3 = 2
            r12[r3] = r5
            r3 = 3
            r12[r3] = r8
            r12[r16] = r2
            r2 = 1
            goto L_0x0204
        L_0x01f3:
            int r4 = r4 + 2
            r26 = r15
            r13 = r27
            r14 = r28
            goto L_0x015f
        L_0x01fd:
            r27 = r13
            r28 = r14
            r15 = r26
            r2 = 0
        L_0x0204:
            if (r2 == 0) goto L_0x0208
        L_0x0206:
            r1 = 1
            goto L_0x022b
        L_0x0208:
            int r1 = r1 + 1
            r7 = r32
            r8 = r34
            r6 = r18
            r3 = r21
            r2 = r22
            r5 = r23
            r4 = r25
            r13 = r27
            r14 = r28
            r18 = 2
            goto L_0x008b
        L_0x0220:
            r19 = r1
        L_0x0222:
            r25 = r4
            r23 = r5
            r27 = r13
            r28 = r14
            r1 = 0
        L_0x022b:
            if (r1 == 0) goto L_0x02a7
            int r1 = gc.b.l(r12)
            if (r1 <= 0) goto L_0x027e
            r1 = 3
            r2 = r12[r1]
            r1 = 1
            r3 = r12[r1]
            int r2 = r2 - r3
            r1 = 2
            r4 = r12[r1]
            r1 = 0
            r5 = r12[r1]
            int r4 = r4 - r5
            if (r2 == r4) goto L_0x0245
            r1 = 1
            goto L_0x0246
        L_0x0245:
            r1 = 0
        L_0x0246:
            if (r1 == 0) goto L_0x0278
            r1 = r12[r16]
            if (r1 == 0) goto L_0x024e
            r1 = 1
            goto L_0x024f
        L_0x024e:
            r1 = 0
        L_0x024f:
            if (r1 == 0) goto L_0x025b
            int r1 = gc.b.l(r12)
            r6 = r25
            r6.b(r5, r3, r1)
            goto L_0x0280
        L_0x025b:
            r6 = r25
            if (r2 <= r4) goto L_0x0261
            r1 = 1
            goto L_0x0262
        L_0x0261:
            r1 = 0
        L_0x0262:
            if (r1 == 0) goto L_0x026e
            int r3 = r3 + 1
            int r1 = gc.b.l(r12)
            r6.b(r5, r3, r1)
            goto L_0x0280
        L_0x026e:
            int r5 = r5 + 1
            int r1 = gc.b.l(r12)
            r6.b(r5, r3, r1)
            goto L_0x0280
        L_0x0278:
            r6 = r25
            r6.b(r5, r3, r4)
            goto L_0x0280
        L_0x027e:
            r6 = r25
        L_0x0280:
            r1 = 0
            r2 = r12[r1]
            r3 = 1
            r1 = r12[r3]
            r4 = r23
            r4.c(r9, r2, r15, r1)
            r1 = 2
            r2 = r12[r1]
            r5 = 3
            r5 = r12[r5]
            r7 = r27
            r8 = r28
            r4.c(r2, r8, r5, r7)
            r7 = r32
            r8 = r34
            r2 = r3
            r5 = r4
            r4 = r6
            r9 = 0
            r6 = r30
            r3 = r1
            r1 = r19
            goto L_0x0053
        L_0x02a7:
            r6 = r30
            r7 = r32
            r8 = r34
            r1 = r19
            r5 = r23
            r4 = r25
            r2 = 1
            r3 = 2
            r9 = 0
            goto L_0x0053
        L_0x02b8:
            r3 = r2
            r6 = r4
            r5 = 3
            int r1 = r6.f14429b
            int r2 = r1 % 3
            if (r2 != 0) goto L_0x02c3
            r2 = r3
            goto L_0x02c4
        L_0x02c3:
            r2 = 0
        L_0x02c4:
            if (r2 == 0) goto L_0x033d
            if (r1 <= r5) goto L_0x02ce
            int r1 = r1 - r5
            r2 = 0
            r6.d(r2, r1)
            goto L_0x02cf
        L_0x02ce:
            r2 = 0
        L_0x02cf:
            r1 = r32
            r4 = r34
            r6.b(r1, r4, r2)
        L_0x02d6:
            int r5 = r6.f14429b
            if (r5 == 0) goto L_0x02dc
            r5 = r3
            goto L_0x02dd
        L_0x02dc:
            r5 = r2
        L_0x02dd:
            s0.p0 r7 = r0.f14412e
            if (r5 == 0) goto L_0x031b
            int r5 = r6.a()
            int r8 = r6.a()
            int r9 = r6.a()
        L_0x02ed:
            if (r1 <= r9) goto L_0x0306
            int r1 = r1 + -1
            d0.g$c r10 = r0.f14408a
            d0.g$c r10 = r10.f7180d
            sf.j.c(r10)
            r0.f14408a = r10
            r7.getClass()
            d0.g$c r10 = r0.f14408a
            d0.g$c r10 = c(r10)
            r0.f14408a = r10
            goto L_0x02ed
        L_0x0306:
            if (r4 <= r8) goto L_0x030e
            int r4 = r4 + -1
            r0.a(r4)
            goto L_0x0306
        L_0x030e:
            int r7 = r5 + -1
            if (r5 <= 0) goto L_0x02d6
            int r1 = r1 + -1
            int r4 = r4 + -1
            r0.b(r1, r4)
            r5 = r7
            goto L_0x030e
        L_0x031b:
            if (r1 <= 0) goto L_0x0334
            int r1 = r1 + -1
            d0.g$c r2 = r0.f14408a
            d0.g$c r2 = r2.f7180d
            sf.j.c(r2)
            r0.f14408a = r2
            r7.getClass()
            d0.g$c r2 = r0.f14408a
            d0.g$c r2 = c(r2)
            r0.f14408a = r2
            goto L_0x031b
        L_0x0334:
            if (r4 <= 0) goto L_0x033c
            int r4 = r4 + -1
            r0.a(r4)
            goto L_0x0334
        L_0x033c:
            return
        L_0x033d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.p0.d(u.d, int, u.d, int, d0.g$c):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        g.c cVar = this.f14404e;
        r.a aVar = this.f14403d;
        if (cVar != aVar) {
            while (true) {
                if (cVar == null || cVar == aVar) {
                    break;
                }
                sb2.append(String.valueOf(cVar));
                if (cVar.f7181e == aVar) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                cVar = cVar.f7181e;
            }
        } else {
            sb2.append("]");
        }
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
