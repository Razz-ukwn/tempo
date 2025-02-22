package l1;

import androidx.constraintlayout.widget.ConstraintLayout;
import m1.b;

public class j extends i {
    public boolean A0 = false;
    public int B0 = 0;
    public int C0 = 0;
    public final b.a D0 = new b.a();
    public b.C0211b E0 = null;

    /* renamed from: u0  reason: collision with root package name */
    public int f10919u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public int f10920v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public int f10921w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public int f10922x0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public int f10923y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public int f10924z0 = 0;

    public void S(int i8, int i10, int i11, int i12) {
    }

    public final void T(d dVar, int i8, int i10, int i11, int i12) {
        b.C0211b bVar;
        d dVar2;
        while (true) {
            bVar = this.E0;
            if (bVar != null || (dVar2 = this.W) == null) {
                b.a aVar = this.D0;
                aVar.f11122a = i8;
                aVar.f11123b = i11;
                aVar.f11124c = i10;
                aVar.f11125d = i12;
                ((ConstraintLayout.b) bVar).b(dVar, aVar);
                dVar.O(aVar.f11126e);
                dVar.L(aVar.f11127f);
                dVar.F = aVar.f11129h;
                int i13 = aVar.f11128g;
                dVar.f10847d0 = i13;
            } else {
                this.E0 = ((e) dVar2).f10886w0;
            }
        }
        b.a aVar2 = this.D0;
        aVar2.f11122a = i8;
        aVar2.f11123b = i11;
        aVar2.f11124c = i10;
        aVar2.f11125d = i12;
        ((ConstraintLayout.b) bVar).b(dVar, aVar2);
        dVar.O(aVar2.f11126e);
        dVar.L(aVar2.f11127f);
        dVar.F = aVar2.f11129h;
        int i132 = aVar2.f11128g;
        dVar.f10847d0 = i132;
        dVar.F = i132 > 0;
    }

    public final void a() {
        for (int i8 = 0; i8 < this.f10918t0; i8++) {
            d dVar = this.f10917s0[i8];
            if (dVar != null) {
                dVar.H = true;
            }
        }
    }
}
