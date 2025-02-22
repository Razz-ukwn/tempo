package m1;

import l1.d;
import l1.g;

public final class j extends p {
    public j(d dVar) {
        super(dVar);
        dVar.f10846d.f();
        dVar.f10848e.f();
        this.f11171f = ((g) dVar).f10915w0;
    }

    public final void a(d dVar) {
        f fVar = this.f11173h;
        if (fVar.f11144c && !fVar.f11151j) {
            fVar.d((int) ((((float) ((f) fVar.f11153l.get(0)).f11148g) * ((g) this.f11167b).f10911s0) + 0.5f));
        }
    }

    public final void d() {
        d dVar = this.f11167b;
        g gVar = (g) dVar;
        int i8 = gVar.f10912t0;
        int i10 = gVar.f10913u0;
        int i11 = gVar.f10915w0;
        f fVar = this.f11173h;
        if (i11 == 1) {
            if (i8 != -1) {
                fVar.f11153l.add(dVar.W.f10846d.f11173h);
                this.f11167b.W.f10846d.f11173h.f11152k.add(fVar);
                fVar.f11147f = i8;
            } else if (i10 != -1) {
                fVar.f11153l.add(dVar.W.f10846d.f11174i);
                this.f11167b.W.f10846d.f11174i.f11152k.add(fVar);
                fVar.f11147f = -i10;
            } else {
                fVar.f11143b = true;
                fVar.f11153l.add(dVar.W.f10846d.f11174i);
                this.f11167b.W.f10846d.f11174i.f11152k.add(fVar);
            }
            m(this.f11167b.f10846d.f11173h);
            m(this.f11167b.f10846d.f11174i);
            return;
        }
        if (i8 != -1) {
            fVar.f11153l.add(dVar.W.f10848e.f11173h);
            this.f11167b.W.f10848e.f11173h.f11152k.add(fVar);
            fVar.f11147f = i8;
        } else if (i10 != -1) {
            fVar.f11153l.add(dVar.W.f10848e.f11174i);
            this.f11167b.W.f10848e.f11174i.f11152k.add(fVar);
            fVar.f11147f = -i10;
        } else {
            fVar.f11143b = true;
            fVar.f11153l.add(dVar.W.f10848e.f11174i);
            this.f11167b.W.f10848e.f11174i.f11152k.add(fVar);
        }
        m(this.f11167b.f10848e.f11173h);
        m(this.f11167b.f10848e.f11174i);
    }

    public final void e() {
        d dVar = this.f11167b;
        int i8 = ((g) dVar).f10915w0;
        f fVar = this.f11173h;
        if (i8 == 1) {
            dVar.f10843b0 = fVar.f11148g;
        } else {
            dVar.f10845c0 = fVar.f11148g;
        }
    }

    public final void f() {
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
