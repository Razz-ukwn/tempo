package f3;

import cb.b;
import f3.m0;
import f3.y0;
import gf.k;
import gf.q;
import gf.s;
import java.util.ArrayList;
import java.util.List;
import sf.j;
import wf.e;

public final class c0<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f8094a;

    /* renamed from: b  reason: collision with root package name */
    public int f8095b;

    /* renamed from: c  reason: collision with root package name */
    public final k<s2<T>> f8096c = new k<>();

    /* renamed from: d  reason: collision with root package name */
    public final t0 f8097d = new t0();

    /* renamed from: e  reason: collision with root package name */
    public n0 f8098e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8099f;

    public final void a(y0<T> y0Var) {
        j.f(y0Var, "event");
        this.f8099f = true;
        boolean z10 = y0Var instanceof y0.b;
        int i8 = 0;
        k<s2<T>> kVar = this.f8096c;
        t0 t0Var = this.f8097d;
        if (z10) {
            y0.b bVar = (y0.b) y0Var;
            t0Var.b(bVar.f8554e);
            this.f8098e = bVar.f8555f;
            int ordinal = bVar.f8550a.ordinal();
            int i10 = bVar.f8553d;
            int i11 = bVar.f8552c;
            List<s2<T>> list = bVar.f8551b;
            if (ordinal == 0) {
                kVar.clear();
                this.f8095b = i10;
                this.f8094a = i11;
                kVar.addAll(list);
            } else if (ordinal == 1) {
                this.f8094a = i11;
                int size = list.size() - 1;
                e eVar = new e(size, b.A(size, 0, -1), -1);
                while (eVar.f16719c) {
                    kVar.addFirst(list.get(eVar.nextInt()));
                }
            } else if (ordinal == 2) {
                this.f8095b = i10;
                kVar.addAll(list);
            }
        } else if (y0Var instanceof y0.a) {
            y0.a aVar = (y0.a) y0Var;
            m0.c cVar = m0.c.f8367c;
            o0 o0Var = aVar.f8545a;
            t0Var.c(o0Var, cVar);
            int ordinal2 = o0Var.ordinal();
            int i12 = aVar.f8548d;
            if (ordinal2 == 1) {
                this.f8094a = i12;
                int a10 = aVar.a();
                while (i8 < a10) {
                    kVar.removeFirst();
                    i8++;
                }
            } else if (ordinal2 == 2) {
                this.f8095b = i12;
                int a11 = aVar.a();
                while (i8 < a11) {
                    kVar.removeLast();
                    i8++;
                }
            } else {
                throw new IllegalArgumentException("Page drop type must be prepend or append");
            }
        } else if (y0Var instanceof y0.c) {
            y0.c cVar2 = (y0.c) y0Var;
            t0Var.b(cVar2.f8556a);
            this.f8098e = cVar2.f8557b;
        }
    }

    public final List<y0<T>> b() {
        if (!this.f8099f) {
            return s.f8978a;
        }
        ArrayList arrayList = new ArrayList();
        n0 d10 = this.f8097d.d();
        k<s2<T>> kVar = this.f8096c;
        if (!kVar.isEmpty()) {
            y0.b<Object> bVar = y0.b.f8549g;
            arrayList.add(y0.b.a.a(q.O0(kVar), this.f8094a, this.f8095b, d10, this.f8098e));
        } else {
            arrayList.add(new y0.c(d10, this.f8098e));
        }
        return arrayList;
    }
}
