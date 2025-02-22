package l1;

import h0.e;
import j1.b;
import j1.d;
import j1.g;
import l1.c;

public final class a extends i {

    /* renamed from: u0  reason: collision with root package name */
    public int f10806u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f10807v0 = true;

    /* renamed from: w0  reason: collision with root package name */
    public int f10808w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f10809x0 = false;

    public final boolean B() {
        return this.f10809x0;
    }

    public final boolean C() {
        return this.f10809x0;
    }

    public final boolean S() {
        int i8;
        int i10;
        int i11;
        boolean z10 = true;
        int i12 = 0;
        while (true) {
            i8 = this.f10918t0;
            if (i12 >= i8) {
                break;
            }
            d dVar = this.f10917s0[i12];
            if ((this.f10807v0 || dVar.d()) && ((((i10 = this.f10806u0) == 0 || i10 == 1) && !dVar.B()) || (((i11 = this.f10806u0) == 2 || i11 == 3) && !dVar.C()))) {
                z10 = false;
            }
            i12++;
        }
        if (!z10 || i8 <= 0) {
            return false;
        }
        int i13 = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f10918t0; i14++) {
            d dVar2 = this.f10917s0[i14];
            if (this.f10807v0 || dVar2.d()) {
                c.a aVar = c.a.f10838d;
                c.a aVar2 = c.a.f10836b;
                c.a aVar3 = c.a.f10837c;
                c.a aVar4 = c.a.f10835a;
                if (!z11) {
                    int i15 = this.f10806u0;
                    if (i15 == 0) {
                        i13 = dVar2.j(aVar4).d();
                    } else if (i15 == 1) {
                        i13 = dVar2.j(aVar3).d();
                    } else if (i15 == 2) {
                        i13 = dVar2.j(aVar2).d();
                    } else if (i15 == 3) {
                        i13 = dVar2.j(aVar).d();
                    }
                    z11 = true;
                }
                int i16 = this.f10806u0;
                if (i16 == 0) {
                    i13 = Math.min(i13, dVar2.j(aVar4).d());
                } else if (i16 == 1) {
                    i13 = Math.max(i13, dVar2.j(aVar3).d());
                } else if (i16 == 2) {
                    i13 = Math.min(i13, dVar2.j(aVar2).d());
                } else if (i16 == 3) {
                    i13 = Math.max(i13, dVar2.j(aVar).d());
                }
            }
        }
        int i17 = i13 + this.f10808w0;
        int i18 = this.f10806u0;
        if (i18 == 0 || i18 == 1) {
            J(i17, i17);
        } else {
            K(i17, i17);
        }
        this.f10809x0 = true;
        return true;
    }

    public final int T() {
        int i8 = this.f10806u0;
        if (i8 == 0 || i8 == 1) {
            return 0;
        }
        return (i8 == 2 || i8 == 3) ? 1 : -1;
    }

    public final void c(d dVar, boolean z10) {
        boolean z11;
        int i8;
        int i10;
        d dVar2 = dVar;
        c[] cVarArr = this.S;
        c cVar = this.K;
        cVarArr[0] = cVar;
        int i11 = 2;
        c cVar2 = this.L;
        cVarArr[2] = cVar2;
        c cVar3 = this.M;
        cVarArr[1] = cVar3;
        c cVar4 = this.N;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.f10834i = dVar2.k(cVar5);
        }
        int i12 = this.f10806u0;
        if (i12 >= 0 && i12 < 4) {
            c cVar6 = cVarArr[i12];
            if (!this.f10809x0) {
                S();
            }
            if (this.f10809x0) {
                this.f10809x0 = false;
                int i13 = this.f10806u0;
                if (i13 == 0 || i13 == 1) {
                    dVar2.d(cVar.f10834i, this.f10843b0);
                    dVar2.d(cVar3.f10834i, this.f10843b0);
                } else if (i13 == 2 || i13 == 3) {
                    dVar2.d(cVar2.f10834i, this.f10845c0);
                    dVar2.d(cVar4.f10834i, this.f10845c0);
                }
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f10918t0) {
                        z11 = false;
                        break;
                    }
                    d dVar3 = this.f10917s0[i14];
                    if ((this.f10807v0 || dVar3.d()) && ((((i10 = this.f10806u0) == 0 || i10 == 1) && dVar3.V[0] == 3 && dVar3.K.f10831f != null && dVar3.M.f10831f != null) || ((i10 == 2 || i10 == 3) && dVar3.V[1] == 3 && dVar3.L.f10831f != null && dVar3.N.f10831f != null))) {
                        z11 = true;
                    } else {
                        i14++;
                    }
                }
                boolean z12 = cVar.g() || cVar3.g();
                boolean z13 = cVar2.g() || cVar4.g();
                int i15 = !(!z11 && (((i8 = this.f10806u0) == 0 && z12) || ((i8 == 2 && z13) || ((i8 == 1 && z12) || (i8 == 3 && z13))))) ? 4 : 5;
                int i16 = 0;
                while (i16 < this.f10918t0) {
                    d dVar4 = this.f10917s0[i16];
                    if (this.f10807v0 || dVar4.d()) {
                        g k10 = dVar2.k(dVar4.S[this.f10806u0]);
                        int i17 = this.f10806u0;
                        c cVar7 = dVar4.S[i17];
                        cVar7.f10834i = k10;
                        c cVar8 = cVar7.f10831f;
                        int i18 = (cVar8 == null || cVar8.f10829d != this) ? 0 : cVar7.f10832g + 0;
                        if (i17 == 0 || i17 == i11) {
                            b l10 = dVar.l();
                            g m = dVar.m();
                            m.f9786d = 0;
                            l10.d(cVar6.f10834i, k10, m, this.f10808w0 - i18);
                            dVar2.c(l10);
                        } else {
                            b l11 = dVar.l();
                            g m10 = dVar.m();
                            m10.f9786d = 0;
                            l11.c(cVar6.f10834i, k10, m10, this.f10808w0 + i18);
                            dVar2.c(l11);
                        }
                        dVar2.e(cVar6.f10834i, k10, this.f10808w0 + i18, i15);
                    }
                    i16++;
                    i11 = 2;
                }
                int i19 = this.f10806u0;
                if (i19 == 0) {
                    dVar2.e(cVar3.f10834i, cVar.f10834i, 0, 8);
                    dVar2.e(cVar.f10834i, this.W.M.f10834i, 0, 4);
                    dVar2.e(cVar.f10834i, this.W.K.f10834i, 0, 0);
                } else if (i19 == 1) {
                    dVar2.e(cVar.f10834i, cVar3.f10834i, 0, 8);
                    dVar2.e(cVar.f10834i, this.W.K.f10834i, 0, 4);
                    dVar2.e(cVar.f10834i, this.W.M.f10834i, 0, 0);
                } else if (i19 == 2) {
                    dVar2.e(cVar4.f10834i, cVar2.f10834i, 0, 8);
                    dVar2.e(cVar2.f10834i, this.W.N.f10834i, 0, 4);
                    dVar2.e(cVar2.f10834i, this.W.L.f10834i, 0, 0);
                } else if (i19 == 3) {
                    dVar2.e(cVar2.f10834i, cVar4.f10834i, 0, 8);
                    dVar2.e(cVar2.f10834i, this.W.L.f10834i, 0, 4);
                    dVar2.e(cVar2.f10834i, this.W.N.f10834i, 0, 0);
                }
            }
        }
    }

    public final boolean d() {
        return true;
    }

    public final String toString() {
        String a10 = androidx.activity.g.a(new StringBuilder("[Barrier] "), this.f10861k0, " {");
        for (int i8 = 0; i8 < this.f10918t0; i8++) {
            d dVar = this.f10917s0[i8];
            if (i8 > 0) {
                a10 = h4.a.c(a10, ", ");
            }
            StringBuilder c3 = e.c(a10);
            c3.append(dVar.f10861k0);
            a10 = c3.toString();
        }
        return h4.a.c(a10, "}");
    }
}
