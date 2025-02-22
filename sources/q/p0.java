package q;

import d2.f1;
import gf.m;
import java.util.ArrayList;
import wf.e;
import wf.f;

public final class p0 implements q {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f12762a;

    public p0(float f10, float f11, p pVar) {
        f P = f1.P(0, pVar.b());
        ArrayList arrayList = new ArrayList(m.n0(P));
        e d10 = P.iterator();
        while (d10.f16719c) {
            arrayList.add(new t(f10, f11, pVar.a(d10.nextInt())));
        }
        this.f12762a = arrayList;
    }

    public final s get(int i8) {
        return (t) this.f12762a.get(i8);
    }
}
