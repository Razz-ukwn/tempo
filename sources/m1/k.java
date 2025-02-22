package m1;

import java.util.ArrayList;
import java.util.Iterator;
import l1.a;
import l1.d;

public final class k extends p {
    public k(d dVar) {
        super(dVar);
    }

    public final void a(d dVar) {
        a aVar = (a) this.f11167b;
        int i8 = aVar.f10806u0;
        f fVar = this.f11173h;
        Iterator it = fVar.f11153l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f11148g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i8 == 0 || i8 == 2) {
            fVar.d(i11 + aVar.f10808w0);
        } else {
            fVar.d(i10 + aVar.f10808w0);
        }
    }

    public final void d() {
        d dVar = this.f11167b;
        if (dVar instanceof a) {
            f fVar = this.f11173h;
            fVar.f11143b = true;
            a aVar = (a) dVar;
            int i8 = aVar.f10806u0;
            boolean z10 = aVar.f10807v0;
            ArrayList arrayList = fVar.f11153l;
            int i10 = 0;
            if (i8 == 0) {
                fVar.f11146e = 4;
                while (i10 < aVar.f10918t0) {
                    d dVar2 = aVar.f10917s0[i10];
                    if (z10 || dVar2.f10859j0 != 8) {
                        f fVar2 = dVar2.f10846d.f11173h;
                        fVar2.f11152k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i10++;
                }
                m(this.f11167b.f10846d.f11173h);
                m(this.f11167b.f10846d.f11174i);
            } else if (i8 == 1) {
                fVar.f11146e = 5;
                while (i10 < aVar.f10918t0) {
                    d dVar3 = aVar.f10917s0[i10];
                    if (z10 || dVar3.f10859j0 != 8) {
                        f fVar3 = dVar3.f10846d.f11174i;
                        fVar3.f11152k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i10++;
                }
                m(this.f11167b.f10846d.f11173h);
                m(this.f11167b.f10846d.f11174i);
            } else if (i8 == 2) {
                fVar.f11146e = 6;
                while (i10 < aVar.f10918t0) {
                    d dVar4 = aVar.f10917s0[i10];
                    if (z10 || dVar4.f10859j0 != 8) {
                        f fVar4 = dVar4.f10848e.f11173h;
                        fVar4.f11152k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i10++;
                }
                m(this.f11167b.f10848e.f11173h);
                m(this.f11167b.f10848e.f11174i);
            } else if (i8 == 3) {
                fVar.f11146e = 7;
                while (i10 < aVar.f10918t0) {
                    d dVar5 = aVar.f10917s0[i10];
                    if (z10 || dVar5.f10859j0 != 8) {
                        f fVar5 = dVar5.f10848e.f11174i;
                        fVar5.f11152k.add(fVar);
                        arrayList.add(fVar5);
                    }
                    i10++;
                }
                m(this.f11167b.f10848e.f11173h);
                m(this.f11167b.f10848e.f11174i);
            }
        }
    }

    public final void e() {
        d dVar = this.f11167b;
        if (dVar instanceof a) {
            int i8 = ((a) dVar).f10806u0;
            f fVar = this.f11173h;
            if (i8 == 0 || i8 == 1) {
                dVar.f10843b0 = fVar.f11148g;
            } else {
                dVar.f10845c0 = fVar.f11148g;
            }
        }
    }

    public final void f() {
        this.f11168c = null;
        this.f11173h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f11173h;
        fVar2.f11152k.add(fVar);
        fVar.f11153l.add(fVar2);
    }
}
