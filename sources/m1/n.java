package m1;

import java.util.ArrayList;
import l1.d;
import q.g;

public final class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public final f f11158k;

    /* renamed from: l  reason: collision with root package name */
    public a f11159l = null;

    public n(d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.f11158k = fVar;
        this.f11173h.f11146e = 6;
        this.f11174i.f11146e = 7;
        fVar.f11146e = 8;
        this.f11171f = 1;
    }

    public final void a(d dVar) {
        int i8;
        float f10;
        float f11;
        float f12;
        if (g.c(this.f11175j) != 3) {
            g gVar = this.f11170e;
            if (gVar.f11144c && !gVar.f11151j && this.f11169d == 3) {
                d dVar2 = this.f11167b;
                int i10 = dVar2.f10876t;
                if (i10 == 2) {
                    d dVar3 = dVar2.W;
                    if (dVar3 != null) {
                        g gVar2 = dVar3.f10848e.f11170e;
                        if (gVar2.f11151j) {
                            gVar.d((int) ((((float) gVar2.f11148g) * dVar2.A) + 0.5f));
                        }
                    }
                } else if (i10 == 3) {
                    g gVar3 = dVar2.f10846d.f11170e;
                    if (gVar3.f11151j) {
                        int i11 = dVar2.f10841a0;
                        if (i11 == -1) {
                            f11 = (float) gVar3.f11148g;
                            f12 = dVar2.Z;
                        } else if (i11 == 0) {
                            f10 = ((float) gVar3.f11148g) * dVar2.Z;
                            i8 = (int) (f10 + 0.5f);
                            gVar.d(i8);
                        } else if (i11 != 1) {
                            i8 = 0;
                            gVar.d(i8);
                        } else {
                            f11 = (float) gVar3.f11148g;
                            f12 = dVar2.Z;
                        }
                        f10 = f11 / f12;
                        i8 = (int) (f10 + 0.5f);
                        gVar.d(i8);
                    }
                }
            }
            f fVar = this.f11173h;
            if (fVar.f11144c) {
                f fVar2 = this.f11174i;
                if (fVar2.f11144c) {
                    if (!fVar.f11151j || !fVar2.f11151j || !gVar.f11151j) {
                        boolean z10 = gVar.f11151j;
                        ArrayList arrayList = fVar.f11153l;
                        ArrayList arrayList2 = fVar2.f11153l;
                        if (!z10 && this.f11169d == 3) {
                            d dVar4 = this.f11167b;
                            if (dVar4.f10875s == 0 && !dVar4.z()) {
                                int i12 = ((f) arrayList.get(0)).f11148g + fVar.f11147f;
                                int i13 = ((f) arrayList2.get(0)).f11148g + fVar2.f11147f;
                                fVar.d(i12);
                                fVar2.d(i13);
                                gVar.d(i13 - i12);
                                return;
                            }
                        }
                        if (!gVar.f11151j && this.f11169d == 3 && this.f11166a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            int i14 = (((f) arrayList2.get(0)).f11148g + fVar2.f11147f) - (((f) arrayList.get(0)).f11148g + fVar.f11147f);
                            int i15 = gVar.m;
                            if (i14 < i15) {
                                gVar.d(i14);
                            } else {
                                gVar.d(i15);
                            }
                        }
                        if (gVar.f11151j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            f fVar3 = (f) arrayList.get(0);
                            f fVar4 = (f) arrayList2.get(0);
                            int i16 = fVar3.f11148g;
                            int i17 = fVar.f11147f + i16;
                            int i18 = fVar4.f11148g;
                            int i19 = fVar2.f11147f + i18;
                            float f13 = this.f11167b.f10855h0;
                            if (fVar3 == fVar4) {
                                f13 = 0.5f;
                            } else {
                                i16 = i17;
                                i18 = i19;
                            }
                            fVar.d((int) ((((float) ((i18 - i16) - gVar.f11148g)) * f13) + ((float) i16) + 0.5f));
                            fVar2.d(fVar.f11148g + gVar.f11148g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        d dVar5 = this.f11167b;
        l(dVar5.L, dVar5.N, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r0 = r15.f11167b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r15 = this;
            l1.d r0 = r15.f11167b
            boolean r1 = r0.f10840a
            m1.g r2 = r15.f11170e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.l()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f11151j
            m1.f r1 = r15.f11174i
            m1.f r3 = r15.f11173h
            r4 = 3
            r5 = 1
            r6 = 4
            if (r0 != 0) goto L_0x0084
            l1.d r0 = r15.f11167b
            int[] r7 = r0.V
            r7 = r7[r5]
            r15.f11169d = r7
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x002d
            m1.a r0 = new m1.a
            r0.<init>(r15)
            r15.f11159l = r0
        L_0x002d:
            int r0 = r15.f11169d
            if (r0 == r4) goto L_0x00b2
            if (r0 != r6) goto L_0x0078
            l1.d r7 = r15.f11167b
            l1.d r7 = r7.W
            if (r7 == 0) goto L_0x0078
            int[] r8 = r7.V
            r8 = r8[r5]
            if (r8 != r5) goto L_0x0078
            int r0 = r7.l()
            l1.d r4 = r15.f11167b
            l1.c r4 = r4.L
            int r4 = r4.e()
            int r0 = r0 - r4
            l1.d r4 = r15.f11167b
            l1.c r4 = r4.N
            int r4 = r4.e()
            int r0 = r0 - r4
            m1.n r4 = r7.f10848e
            m1.f r4 = r4.f11173h
            l1.d r5 = r15.f11167b
            l1.c r5 = r5.L
            int r5 = r5.e()
            m1.p.b(r3, r4, r5)
            m1.n r3 = r7.f10848e
            m1.f r3 = r3.f11174i
            l1.d r4 = r15.f11167b
            l1.c r4 = r4.N
            int r4 = r4.e()
            int r4 = -r4
            m1.p.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x0078:
            if (r0 != r5) goto L_0x00b2
            l1.d r0 = r15.f11167b
            int r0 = r0.l()
            r2.d(r0)
            goto L_0x00b2
        L_0x0084:
            int r0 = r15.f11169d
            if (r0 != r6) goto L_0x00b2
            l1.d r0 = r15.f11167b
            l1.d r7 = r0.W
            if (r7 == 0) goto L_0x00b2
            int[] r8 = r7.V
            r8 = r8[r5]
            if (r8 != r5) goto L_0x00b2
            m1.n r2 = r7.f10848e
            m1.f r2 = r2.f11173h
            l1.c r0 = r0.L
            int r0 = r0.e()
            m1.p.b(r3, r2, r0)
            m1.n r0 = r7.f10848e
            m1.f r0 = r0.f11174i
            l1.d r2 = r15.f11167b
            l1.c r2 = r2.N
            int r2 = r2.e()
            int r2 = -r2
            m1.p.b(r1, r0, r2)
            return
        L_0x00b2:
            boolean r0 = r2.f11151j
            m1.f r7 = r15.f11158k
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x01d7
            l1.d r10 = r15.f11167b
            boolean r11 = r10.f10840a
            if (r11 == 0) goto L_0x01d7
            l1.c[] r0 = r10.S
            r11 = r0[r9]
            l1.c r12 = r11.f10831f
            if (r12 == 0) goto L_0x0132
            r13 = r0[r4]
            l1.c r13 = r13.f10831f
            if (r13 == 0) goto L_0x0132
            boolean r0 = r10.z()
            if (r0 == 0) goto L_0x00ee
            l1.d r0 = r15.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f11147f = r0
            l1.d r0 = r15.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f11147f = r0
            goto L_0x0125
        L_0x00ee:
            l1.d r0 = r15.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r9]
            m1.f r0 = m1.p.h(r0)
            if (r0 == 0) goto L_0x0107
            l1.d r2 = r15.f11167b
            l1.c[] r2 = r2.S
            r2 = r2[r9]
            int r2 = r2.e()
            m1.p.b(r3, r0, r2)
        L_0x0107:
            l1.d r0 = r15.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r4]
            m1.f r0 = m1.p.h(r0)
            if (r0 == 0) goto L_0x0121
            l1.d r2 = r15.f11167b
            l1.c[] r2 = r2.S
            r2 = r2[r4]
            int r2 = r2.e()
            int r2 = -r2
            m1.p.b(r1, r0, r2)
        L_0x0121:
            r3.f11143b = r5
            r1.f11143b = r5
        L_0x0125:
            l1.d r0 = r15.f11167b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x035f
            int r0 = r0.f10847d0
            m1.p.b(r7, r3, r0)
            goto L_0x035f
        L_0x0132:
            if (r12 == 0) goto L_0x0159
            m1.f r0 = m1.p.h(r11)
            if (r0 == 0) goto L_0x035f
            l1.d r4 = r15.f11167b
            l1.c[] r4 = r4.S
            r4 = r4[r9]
            int r4 = r4.e()
            m1.p.b(r3, r0, r4)
            int r0 = r2.f11148g
            m1.p.b(r1, r3, r0)
            l1.d r0 = r15.f11167b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x035f
            int r0 = r0.f10847d0
            m1.p.b(r7, r3, r0)
            goto L_0x035f
        L_0x0159:
            r5 = r0[r4]
            l1.c r9 = r5.f10831f
            if (r9 == 0) goto L_0x0186
            m1.f r0 = m1.p.h(r5)
            if (r0 == 0) goto L_0x0179
            l1.d r5 = r15.f11167b
            l1.c[] r5 = r5.S
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            m1.p.b(r1, r0, r4)
            int r0 = r2.f11148g
            int r0 = -r0
            m1.p.b(r3, r1, r0)
        L_0x0179:
            l1.d r0 = r15.f11167b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x035f
            int r0 = r0.f10847d0
            m1.p.b(r7, r3, r0)
            goto L_0x035f
        L_0x0186:
            r0 = r0[r6]
            l1.c r4 = r0.f10831f
            if (r4 == 0) goto L_0x01a4
            m1.f r0 = m1.p.h(r0)
            if (r0 == 0) goto L_0x035f
            m1.p.b(r7, r0, r8)
            l1.d r0 = r15.f11167b
            int r0 = r0.f10847d0
            int r0 = -r0
            m1.p.b(r3, r7, r0)
            int r0 = r2.f11148g
            m1.p.b(r1, r3, r0)
            goto L_0x035f
        L_0x01a4:
            boolean r0 = r10 instanceof l1.h
            if (r0 != 0) goto L_0x035f
            l1.d r0 = r10.W
            if (r0 == 0) goto L_0x035f
            l1.c$a r0 = l1.c.a.B
            l1.c r0 = r10.j(r0)
            l1.c r0 = r0.f10831f
            if (r0 != 0) goto L_0x035f
            l1.d r0 = r15.f11167b
            l1.d r4 = r0.W
            m1.n r4 = r4.f10848e
            m1.f r4 = r4.f11173h
            int r0 = r0.t()
            m1.p.b(r3, r4, r0)
            int r0 = r2.f11148g
            m1.p.b(r1, r3, r0)
            l1.d r0 = r15.f11167b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x035f
            int r0 = r0.f10847d0
            m1.p.b(r7, r3, r0)
            goto L_0x035f
        L_0x01d7:
            java.util.ArrayList r10 = r2.f11153l
            if (r0 != 0) goto L_0x0226
            int r0 = r15.f11169d
            if (r0 != r4) goto L_0x0226
            l1.d r0 = r15.f11167b
            int r11 = r0.f10876t
            java.util.ArrayList r12 = r2.f11152k
            if (r11 == r9) goto L_0x020c
            if (r11 == r4) goto L_0x01ea
            goto L_0x0229
        L_0x01ea:
            boolean r0 = r0.z()
            if (r0 != 0) goto L_0x0229
            l1.d r0 = r15.f11167b
            int r11 = r0.f10875s
            if (r11 != r4) goto L_0x01f7
            goto L_0x0229
        L_0x01f7:
            m1.l r0 = r0.f10846d
            m1.g r0 = r0.f11170e
            r10.add(r0)
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            r2.f11143b = r5
            r12.add(r3)
            r12.add(r1)
            goto L_0x0229
        L_0x020c:
            l1.d r0 = r0.W
            if (r0 != 0) goto L_0x0211
            goto L_0x0229
        L_0x0211:
            m1.n r0 = r0.f10848e
            m1.g r0 = r0.f11170e
            r10.add(r0)
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            r2.f11143b = r5
            r12.add(r3)
            r12.add(r1)
            goto L_0x0229
        L_0x0226:
            r2.b(r15)
        L_0x0229:
            l1.d r0 = r15.f11167b
            l1.c[] r11 = r0.S
            r12 = r11[r9]
            l1.c r13 = r12.f10831f
            if (r13 == 0) goto L_0x0286
            r14 = r11[r4]
            l1.c r14 = r14.f10831f
            if (r14 == 0) goto L_0x0286
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x0259
            l1.d r0 = r15.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f11147f = r0
            l1.d r0 = r15.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f11147f = r0
            goto L_0x0279
        L_0x0259:
            l1.d r0 = r15.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r9]
            m1.f r0 = m1.p.h(r0)
            l1.d r1 = r15.f11167b
            l1.c[] r1 = r1.S
            r1 = r1[r4]
            m1.f r1 = m1.p.h(r1)
            if (r0 == 0) goto L_0x0272
            r0.b(r15)
        L_0x0272:
            if (r1 == 0) goto L_0x0277
            r1.b(r15)
        L_0x0277:
            r15.f11175j = r6
        L_0x0279:
            l1.d r0 = r15.f11167b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x0357
            m1.a r0 = r15.f11159l
            r15.c(r7, r3, r5, r0)
            goto L_0x0357
        L_0x0286:
            r14 = 0
            if (r13 == 0) goto L_0x02d0
            m1.f r0 = m1.p.h(r12)
            if (r0 == 0) goto L_0x0357
            l1.d r6 = r15.f11167b
            l1.c[] r6 = r6.S
            r6 = r6[r9]
            int r6 = r6.e()
            m1.p.b(r3, r0, r6)
            r15.c(r1, r3, r5, r2)
            l1.d r0 = r15.f11167b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x02aa
            m1.a r0 = r15.f11159l
            r15.c(r7, r3, r5, r0)
        L_0x02aa:
            int r0 = r15.f11169d
            if (r0 != r4) goto L_0x0357
            l1.d r0 = r15.f11167b
            float r1 = r0.Z
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0357
            m1.l r0 = r0.f10846d
            int r1 = r0.f11169d
            if (r1 != r4) goto L_0x0357
            m1.g r0 = r0.f11170e
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            l1.d r0 = r15.f11167b
            m1.l r0 = r0.f10846d
            m1.g r0 = r0.f11170e
            r10.add(r0)
            r2.f11142a = r15
            goto L_0x0357
        L_0x02d0:
            r9 = r11[r4]
            l1.c r12 = r9.f10831f
            r13 = -1
            if (r12 == 0) goto L_0x02fa
            m1.f r0 = m1.p.h(r9)
            if (r0 == 0) goto L_0x0357
            l1.d r6 = r15.f11167b
            l1.c[] r6 = r6.S
            r4 = r6[r4]
            int r4 = r4.e()
            int r4 = -r4
            m1.p.b(r1, r0, r4)
            r15.c(r3, r1, r13, r2)
            l1.d r0 = r15.f11167b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x0357
            m1.a r0 = r15.f11159l
            r15.c(r7, r3, r5, r0)
            goto L_0x0357
        L_0x02fa:
            r6 = r11[r6]
            l1.c r9 = r6.f10831f
            if (r9 == 0) goto L_0x0312
            m1.f r0 = m1.p.h(r6)
            if (r0 == 0) goto L_0x0357
            m1.p.b(r7, r0, r8)
            m1.a r0 = r15.f11159l
            r15.c(r3, r7, r13, r0)
            r15.c(r1, r3, r5, r2)
            goto L_0x0357
        L_0x0312:
            boolean r6 = r0 instanceof l1.h
            if (r6 != 0) goto L_0x0357
            l1.d r6 = r0.W
            if (r6 == 0) goto L_0x0357
            m1.n r6 = r6.f10848e
            m1.f r6 = r6.f11173h
            int r0 = r0.t()
            m1.p.b(r3, r6, r0)
            r15.c(r1, r3, r5, r2)
            l1.d r0 = r15.f11167b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x0333
            m1.a r0 = r15.f11159l
            r15.c(r7, r3, r5, r0)
        L_0x0333:
            int r0 = r15.f11169d
            if (r0 != r4) goto L_0x0357
            l1.d r0 = r15.f11167b
            float r1 = r0.Z
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0357
            m1.l r0 = r0.f10846d
            int r1 = r0.f11169d
            if (r1 != r4) goto L_0x0357
            m1.g r0 = r0.f11170e
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            l1.d r0 = r15.f11167b
            m1.l r0 = r0.f10846d
            m1.g r0 = r0.f11170e
            r10.add(r0)
            r2.f11142a = r15
        L_0x0357:
            int r0 = r10.size()
            if (r0 != 0) goto L_0x035f
            r2.f11144c = r5
        L_0x035f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.n.d():void");
    }

    public final void e() {
        f fVar = this.f11173h;
        if (fVar.f11151j) {
            this.f11167b.f10845c0 = fVar.f11148g;
        }
    }

    public final void f() {
        this.f11168c = null;
        this.f11173h.c();
        this.f11174i.c();
        this.f11158k.c();
        this.f11170e.c();
        this.f11172g = false;
    }

    public final boolean k() {
        return this.f11169d != 3 || this.f11167b.f10876t == 0;
    }

    public final void m() {
        this.f11172g = false;
        f fVar = this.f11173h;
        fVar.c();
        fVar.f11151j = false;
        f fVar2 = this.f11174i;
        fVar2.c();
        fVar2.f11151j = false;
        f fVar3 = this.f11158k;
        fVar3.c();
        fVar3.f11151j = false;
        this.f11170e.f11151j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f11167b.f10861k0;
    }
}
