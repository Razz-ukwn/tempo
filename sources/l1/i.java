package l1;

import java.util.ArrayList;
import m1.o;

public class i extends d implements h {

    /* renamed from: s0  reason: collision with root package name */
    public d[] f10917s0 = new d[4];

    /* renamed from: t0  reason: collision with root package name */
    public int f10918t0 = 0;

    public final void R(int i8, o oVar, ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f10918t0; i10++) {
            d dVar = this.f10917s0[i10];
            ArrayList<d> arrayList2 = oVar.f11161a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i11 = 0; i11 < this.f10918t0; i11++) {
            m1.i.a(this.f10917s0[i11], i8, arrayList, oVar);
        }
    }

    public void a() {
    }
}
