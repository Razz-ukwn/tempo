package m1;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l1.c;
import l1.d;
import l1.g;
import l1.i;
import m1.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final l1.e f11134a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11135b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11136c = true;

    /* renamed from: d  reason: collision with root package name */
    public final l1.e f11137d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<p> f11138e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b.C0211b f11139f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a f11140g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<m> f11141h;

    public e(l1.e eVar) {
        new ArrayList();
        this.f11139f = null;
        this.f11140g = new b.a();
        this.f11141h = new ArrayList<>();
        this.f11134a = eVar;
        this.f11137d = eVar;
    }

    public final void a(f fVar, int i8, int i10, ArrayList arrayList, m mVar) {
        p pVar = fVar.f11145d;
        if (pVar.f11168c == null) {
            l1.e eVar = this.f11134a;
            if (pVar != eVar.f10846d && pVar != eVar.f10848e) {
                if (mVar == null) {
                    mVar = new m(pVar);
                    arrayList.add(mVar);
                }
                pVar.f11168c = mVar;
                mVar.f11157b.add(pVar);
                f fVar2 = pVar.f11173h;
                Iterator it = fVar2.f11152k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i8, 0, arrayList, mVar);
                    }
                }
                f fVar3 = pVar.f11174i;
                Iterator it2 = fVar3.f11152k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i8, 1, arrayList, mVar);
                    }
                }
                if (i8 == 1 && (pVar instanceof n)) {
                    Iterator it3 = ((n) pVar).f11158k.f11152k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i8, 2, arrayList, mVar);
                        }
                    }
                }
                Iterator it4 = fVar2.f11153l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i8, 0, arrayList, mVar);
                }
                Iterator it5 = fVar3.f11153l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i8, 1, arrayList, mVar);
                }
                if (i8 == 1 && (pVar instanceof n)) {
                    Iterator it6 = ((n) pVar).f11158k.f11153l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i8, 2, arrayList, mVar);
                    }
                }
            }
        }
    }

    public final void b(l1.e eVar) {
        int i8;
        int i10;
        int i11;
        int i12;
        int i13;
        l1.e eVar2 = eVar;
        Iterator<d> it = eVar2.f10925s0.iterator();
        while (it.hasNext()) {
            d next = it.next();
            int[] iArr = next.V;
            int i14 = iArr[0];
            int i15 = iArr[1];
            if (next.f10859j0 == 8) {
                next.f10840a = true;
            } else {
                float f10 = next.f10880x;
                if (f10 < 1.0f && i14 == 3) {
                    next.f10875s = 2;
                }
                float f11 = next.A;
                if (f11 < 1.0f && i15 == 3) {
                    next.f10876t = 2;
                }
                if (next.Z > 0.0f) {
                    if (i14 == 3 && (i15 == 2 || i15 == 1)) {
                        next.f10875s = 3;
                    } else if (i15 == 3 && (i14 == 2 || i14 == 1)) {
                        next.f10876t = 3;
                    } else if (i14 == 3 && i15 == 3) {
                        if (next.f10875s == 0) {
                            next.f10875s = 3;
                        }
                        if (next.f10876t == 0) {
                            next.f10876t = 3;
                        }
                    }
                }
                c cVar = next.M;
                c cVar2 = next.K;
                if (i14 == 3 && next.f10875s == 1 && (cVar2.f10831f == null || cVar.f10831f == null)) {
                    i14 = 2;
                }
                c cVar3 = next.N;
                c cVar4 = next.L;
                int i16 = (i15 == 3 && next.f10876t == 1 && (cVar4.f10831f == null || cVar3.f10831f == null)) ? 2 : i15;
                l lVar = next.f10846d;
                lVar.f11169d = i14;
                int i17 = next.f10875s;
                lVar.f11166a = i17;
                n nVar = next.f10848e;
                nVar.f11169d = i16;
                int i18 = next.f10876t;
                nVar.f11166a = i18;
                if ((i14 == 4 || i14 == 1 || i14 == 2) && (i16 == 4 || i16 == 1 || i16 == 2)) {
                    int r10 = next.r();
                    if (i14 == 4) {
                        i11 = (eVar.r() - cVar2.f10832g) - cVar.f10832g;
                        i14 = 1;
                    } else {
                        i11 = r10;
                    }
                    int l10 = next.l();
                    if (i16 == 4) {
                        i12 = (eVar.l() - cVar4.f10832g) - cVar3.f10832g;
                        i13 = 1;
                    } else {
                        i12 = l10;
                        i13 = i16;
                    }
                    f(next, i14, i11, i13, i12);
                    next.f10846d.f11170e.d(next.r());
                    next.f10848e.f11170e.d(next.l());
                    next.f10840a = true;
                } else {
                    int[] iArr2 = eVar2.V;
                    c[] cVarArr = next.S;
                    if (i14 != 3 || (i16 != 2 && i16 != 1)) {
                        i8 = 3;
                    } else if (i17 == 3) {
                        if (i16 == 2) {
                            f(next, 2, 0, 2, 0);
                        }
                        int l11 = next.l();
                        f(next, 1, (int) ((((float) l11) * next.Z) + 0.5f), 1, l11);
                        next.f10846d.f11170e.d(next.r());
                        next.f10848e.f11170e.d(next.l());
                        next.f10840a = true;
                    } else if (i17 == 1) {
                        f(next, 2, 0, i16, 0);
                        next.f10846d.f11170e.m = next.r();
                    } else {
                        if (i17 == 2) {
                            int i19 = iArr2[0];
                            if (i19 == 1 || i19 == 4) {
                                f(next, 1, (int) ((f10 * ((float) eVar.r())) + 0.5f), i16, next.l());
                                next.f10846d.f11170e.d(next.r());
                                next.f10848e.f11170e.d(next.l());
                                next.f10840a = true;
                            }
                        } else if (cVarArr[0].f10831f == null || cVarArr[1].f10831f == null) {
                            f(next, 2, 0, i16, 0);
                            next.f10846d.f11170e.d(next.r());
                            next.f10848e.f11170e.d(next.l());
                            next.f10840a = true;
                        }
                        i8 = 3;
                    }
                    if (i16 != i8 || (i14 != 2 && i14 != 1)) {
                        i10 = i8;
                    } else if (i18 == i8) {
                        if (i14 == 2) {
                            f(next, 2, 0, 2, 0);
                        }
                        int r11 = next.r();
                        float f12 = next.Z;
                        if (next.f10841a0 == -1) {
                            f12 = 1.0f / f12;
                        }
                        f(next, 1, r11, 1, (int) ((((float) r11) * f12) + 0.5f));
                        next.f10846d.f11170e.d(next.r());
                        next.f10848e.f11170e.d(next.l());
                        next.f10840a = true;
                    } else if (i18 == 1) {
                        f(next, i14, 0, 2, 0);
                        next.f10848e.f11170e.m = next.l();
                    } else {
                        if (i18 == 2) {
                            int i20 = iArr2[1];
                            if (i20 == 1 || i20 == 4) {
                                f(next, i14, next.r(), 1, (int) ((f11 * ((float) eVar.l())) + 0.5f));
                                next.f10846d.f11170e.d(next.r());
                                next.f10848e.f11170e.d(next.l());
                                next.f10840a = true;
                            }
                        } else if (cVarArr[2].f10831f == null || cVarArr[3].f10831f == null) {
                            f(next, 2, 0, i16, 0);
                            next.f10846d.f11170e.d(next.r());
                            next.f10848e.f11170e.d(next.l());
                            next.f10840a = true;
                        }
                        i10 = 3;
                    }
                    if (i14 == i10 && i16 == i10) {
                        if (i17 == 1 || i18 == 1) {
                            f(next, 2, 0, 2, 0);
                            next.f10846d.f11170e.m = next.r();
                            next.f10848e.f11170e.m = next.l();
                        } else if (i18 == 2 && i17 == 2 && iArr2[0] == 1 && iArr2[1] == 1) {
                            f(next, 1, (int) ((f10 * ((float) eVar.r())) + 0.5f), 1, (int) ((f11 * ((float) eVar.l())) + 0.5f));
                            next.f10846d.f11170e.d(next.r());
                            next.f10848e.f11170e.d(next.l());
                            next.f10840a = true;
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList<p> arrayList = this.f11138e;
        arrayList.clear();
        l1.e eVar = this.f11137d;
        eVar.f10846d.f();
        eVar.f10848e.f();
        arrayList.add(eVar.f10846d);
        arrayList.add(eVar.f10848e);
        Iterator<d> it = eVar.f10925s0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            d next = it.next();
            if (next instanceof g) {
                arrayList.add(new j(next));
            } else {
                if (next.y()) {
                    if (next.f10842b == null) {
                        next.f10842b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f10842b);
                } else {
                    arrayList.add(next.f10846d);
                }
                if (next.z()) {
                    if (next.f10844c == null) {
                        next.f10844c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f10844c);
                } else {
                    arrayList.add(next.f10848e);
                }
                if (next instanceof i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f11167b != eVar) {
                next2.d();
            }
        }
        ArrayList<m> arrayList2 = this.f11141h;
        arrayList2.clear();
        l1.e eVar2 = this.f11134a;
        e(eVar2.f10846d, 0, arrayList2);
        e(eVar2.f10848e, 1, arrayList2);
        this.f11135b = false;
    }

    public final int d(l1.e eVar, int i8) {
        int i10;
        ArrayList<m> arrayList;
        long j10;
        long max;
        float f10;
        l1.e eVar2 = eVar;
        int i11 = i8;
        ArrayList<m> arrayList2 = this.f11141h;
        int size = arrayList2.size();
        int i12 = 0;
        long j11 = 0;
        while (i12 < size) {
            p pVar = arrayList2.get(i12).f11156a;
            if (!(pVar instanceof c) ? i11 != 0 ? (pVar instanceof n) : (pVar instanceof l) : ((c) pVar).f11171f == i11) {
                f fVar = (i11 == 0 ? eVar2.f10846d : eVar2.f10848e).f11173h;
                f fVar2 = (i11 == 0 ? eVar2.f10846d : eVar2.f10848e).f11174i;
                boolean contains = pVar.f11173h.f11153l.contains(fVar);
                f fVar3 = pVar.f11174i;
                boolean contains2 = fVar3.f11153l.contains(fVar2);
                long j12 = pVar.j();
                f fVar4 = pVar.f11173h;
                if (!contains || !contains2) {
                    arrayList = arrayList2;
                    i10 = size;
                    if (contains) {
                        max = Math.max(m.b(fVar4, (long) fVar4.f11147f), ((long) fVar4.f11147f) + j12);
                    } else if (contains2) {
                        max = Math.max(-m.a(fVar3, (long) fVar3.f11147f), ((long) (-fVar3.f11147f)) + j12);
                    } else {
                        j10 = (pVar.j() + ((long) fVar4.f11147f)) - ((long) fVar3.f11147f);
                    }
                    j10 = max;
                } else {
                    long b10 = m.b(fVar4, 0);
                    long a10 = m.a(fVar3, 0);
                    long j13 = b10 - j12;
                    int i13 = fVar3.f11147f;
                    arrayList = arrayList2;
                    i10 = size;
                    if (j13 >= ((long) (-i13))) {
                        j13 += (long) i13;
                    }
                    long j14 = j13;
                    long j15 = (long) fVar4.f11147f;
                    long j16 = ((-a10) - j12) - j15;
                    if (j16 >= j15) {
                        j16 -= j15;
                    }
                    d dVar = pVar.f11167b;
                    if (i11 == 0) {
                        f10 = dVar.f10853g0;
                    } else if (i11 == 1) {
                        f10 = dVar.f10855h0;
                    } else {
                        dVar.getClass();
                        f10 = -1.0f;
                    }
                    float f11 = (float) (f10 > 0.0f ? (long) ((((float) j14) / (1.0f - f10)) + (((float) j16) / f10)) : 0);
                    j10 = (((long) fVar4.f11147f) + ((((long) ((f11 * f10) + 0.5f)) + j12) + ((long) a2.b.b(1.0f, f10, f11, 0.5f)))) - ((long) fVar3.f11147f);
                }
            } else {
                j10 = 0;
                arrayList = arrayList2;
                i10 = size;
            }
            j11 = Math.max(j11, j10);
            i12++;
            eVar2 = eVar;
            i11 = i8;
            arrayList2 = arrayList;
            size = i10;
        }
        return (int) j11;
    }

    public final void e(p pVar, int i8, ArrayList<m> arrayList) {
        f fVar;
        Iterator it = pVar.f11173h.f11152k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = pVar.f11174i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i8, 0, arrayList, (m) null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f11173h, i8, 0, arrayList, (m) null);
            }
        }
        Iterator it2 = fVar.f11152k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i8, 1, arrayList, (m) null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f11174i, i8, 1, arrayList, (m) null);
            }
        }
        if (i8 == 1) {
            Iterator it3 = ((n) pVar).f11158k.f11152k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i8, 2, arrayList, (m) null);
                }
            }
        }
    }

    public final void f(d dVar, int i8, int i10, int i11, int i12) {
        b.a aVar = this.f11140g;
        aVar.f11122a = i8;
        aVar.f11123b = i11;
        aVar.f11124c = i10;
        aVar.f11125d = i12;
        ((ConstraintLayout.b) this.f11139f).b(dVar, aVar);
        dVar.O(aVar.f11126e);
        dVar.L(aVar.f11127f);
        dVar.F = aVar.f11129h;
        int i13 = aVar.f11128g;
        dVar.f10847d0 = i13;
        dVar.F = i13 > 0;
    }

    public final void g() {
        a aVar;
        Iterator<d> it = this.f11134a.f10925s0.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (!next.f10840a) {
                int[] iArr = next.V;
                boolean z10 = false;
                int i8 = iArr[0];
                int i10 = iArr[1];
                int i11 = next.f10875s;
                int i12 = next.f10876t;
                boolean z11 = i8 == 2 || (i8 == 3 && i11 == 1);
                if (i10 == 2 || (i10 == 3 && i12 == 1)) {
                    z10 = true;
                }
                g gVar = next.f10846d.f11170e;
                boolean z12 = gVar.f11151j;
                g gVar2 = next.f10848e.f11170e;
                boolean z13 = gVar2.f11151j;
                if (z12 && z13) {
                    f(next, 1, gVar.f11148g, 1, gVar2.f11148g);
                    next.f10840a = true;
                } else if (z12 && z10) {
                    f(next, 1, gVar.f11148g, 2, gVar2.f11148g);
                    if (i10 == 3) {
                        next.f10848e.f11170e.m = next.l();
                    } else {
                        next.f10848e.f11170e.d(next.l());
                        next.f10840a = true;
                    }
                } else if (z13 && z11) {
                    f(next, 2, gVar.f11148g, 1, gVar2.f11148g);
                    if (i8 == 3) {
                        next.f10846d.f11170e.m = next.r();
                    } else {
                        next.f10846d.f11170e.d(next.r());
                        next.f10840a = true;
                    }
                }
                if (next.f10840a && (aVar = next.f10848e.f11159l) != null) {
                    aVar.d(next.f10847d0);
                }
            }
        }
    }
}
