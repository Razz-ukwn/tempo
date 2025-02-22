package l1;

import j1.b;
import j1.d;
import java.util.ArrayList;
import l1.c;

public final class g extends d {

    /* renamed from: s0  reason: collision with root package name */
    public float f10911s0 = -1.0f;

    /* renamed from: t0  reason: collision with root package name */
    public int f10912t0 = -1;

    /* renamed from: u0  reason: collision with root package name */
    public int f10913u0 = -1;

    /* renamed from: v0  reason: collision with root package name */
    public c f10914v0 = this.L;

    /* renamed from: w0  reason: collision with root package name */
    public int f10915w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f10916x0;

    public g() {
        this.f10915w0 = 0;
        this.T.clear();
        this.T.add(this.f10914v0);
        int length = this.S.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.S[i8] = this.f10914v0;
        }
    }

    public final boolean B() {
        return this.f10916x0;
    }

    public final boolean C() {
        return this.f10916x0;
    }

    public final void Q(d dVar, boolean z10) {
        if (this.W != null) {
            c cVar = this.f10914v0;
            dVar.getClass();
            int n2 = d.n(cVar);
            if (this.f10915w0 == 1) {
                this.f10843b0 = n2;
                this.f10845c0 = 0;
                L(this.W.l());
                O(0);
                return;
            }
            this.f10843b0 = 0;
            this.f10845c0 = n2;
            O(this.W.r());
            L(0);
        }
    }

    public final void R(int i8) {
        this.f10914v0.l(i8);
        this.f10916x0 = true;
    }

    public final void S(int i8) {
        if (this.f10915w0 != i8) {
            this.f10915w0 = i8;
            ArrayList<c> arrayList = this.T;
            arrayList.clear();
            if (this.f10915w0 == 1) {
                this.f10914v0 = this.K;
            } else {
                this.f10914v0 = this.L;
            }
            arrayList.add(this.f10914v0);
            c[] cVarArr = this.S;
            int length = cVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                cVarArr[i10] = this.f10914v0;
            }
        }
    }

    public final void c(d dVar, boolean z10) {
        e eVar = (e) this.W;
        if (eVar != null) {
            c j10 = eVar.j(c.a.f10835a);
            c j11 = eVar.j(c.a.f10837c);
            d dVar2 = this.W;
            boolean z11 = true;
            boolean z12 = dVar2 != null && dVar2.V[0] == 2;
            if (this.f10915w0 == 0) {
                j10 = eVar.j(c.a.f10836b);
                j11 = eVar.j(c.a.f10838d);
                d dVar3 = this.W;
                if (dVar3 == null || dVar3.V[1] != 2) {
                    z11 = false;
                }
                z12 = z11;
            }
            if (this.f10916x0) {
                c cVar = this.f10914v0;
                if (cVar.f10828c) {
                    j1.g k10 = dVar.k(cVar);
                    dVar.d(k10, this.f10914v0.d());
                    if (this.f10912t0 != -1) {
                        if (z12) {
                            dVar.f(dVar.k(j11), k10, 0, 5);
                        }
                    } else if (this.f10913u0 != -1 && z12) {
                        j1.g k11 = dVar.k(j11);
                        dVar.f(k10, dVar.k(j10), 0, 5);
                        dVar.f(k11, k10, 0, 5);
                    }
                    this.f10916x0 = false;
                    return;
                }
            }
            if (this.f10912t0 != -1) {
                j1.g k12 = dVar.k(this.f10914v0);
                dVar.e(k12, dVar.k(j10), this.f10912t0, 8);
                if (z12) {
                    dVar.f(dVar.k(j11), k12, 0, 5);
                }
            } else if (this.f10913u0 != -1) {
                j1.g k13 = dVar.k(this.f10914v0);
                j1.g k14 = dVar.k(j11);
                dVar.e(k13, k14, -this.f10913u0, 8);
                if (z12) {
                    dVar.f(k13, dVar.k(j10), 0, 5);
                    dVar.f(k14, k13, 0, 5);
                }
            } else if (this.f10911s0 != -1.0f) {
                j1.g k15 = dVar.k(this.f10914v0);
                j1.g k16 = dVar.k(j11);
                float f10 = this.f10911s0;
                b l10 = dVar.l();
                l10.f9753d.e(k15, -1.0f);
                l10.f9753d.e(k16, f10);
                dVar.c(l10);
            }
        }
    }

    public final boolean d() {
        return true;
    }

    public final c j(c.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f10915w0 == 0) {
                return this.f10914v0;
            }
            return null;
        }
        if (this.f10915w0 == 1) {
            return this.f10914v0;
        }
        return null;
    }
}
