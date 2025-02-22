package m1;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import l1.d;
import l1.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f11119a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final a f11120b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final e f11121c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f11122a;

        /* renamed from: b  reason: collision with root package name */
        public int f11123b;

        /* renamed from: c  reason: collision with root package name */
        public int f11124c;

        /* renamed from: d  reason: collision with root package name */
        public int f11125d;

        /* renamed from: e  reason: collision with root package name */
        public int f11126e;

        /* renamed from: f  reason: collision with root package name */
        public int f11127f;

        /* renamed from: g  reason: collision with root package name */
        public int f11128g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f11129h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f11130i;

        /* renamed from: j  reason: collision with root package name */
        public int f11131j;
    }

    /* renamed from: m1.b$b  reason: collision with other inner class name */
    public interface C0211b {
    }

    public b(e eVar) {
        this.f11121c = eVar;
    }

    public final boolean a(int i8, d dVar, C0211b bVar) {
        int[] iArr = dVar.V;
        int i10 = iArr[0];
        a aVar = this.f11120b;
        aVar.f11122a = i10;
        boolean z10 = true;
        aVar.f11123b = iArr[1];
        aVar.f11124c = dVar.r();
        aVar.f11125d = dVar.l();
        aVar.f11130i = false;
        aVar.f11131j = i8;
        boolean z11 = aVar.f11122a == 3;
        boolean z12 = aVar.f11123b == 3;
        boolean z13 = z11 && dVar.Z > 0.0f;
        boolean z14 = z12 && dVar.Z > 0.0f;
        int[] iArr2 = dVar.f10877u;
        if (z13 && iArr2[0] == 4) {
            aVar.f11122a = 1;
        }
        if (z14 && iArr2[1] == 4) {
            aVar.f11123b = 1;
        }
        ((ConstraintLayout.b) bVar).b(dVar, aVar);
        dVar.O(aVar.f11126e);
        dVar.L(aVar.f11127f);
        dVar.F = aVar.f11129h;
        int i11 = aVar.f11128g;
        dVar.f10847d0 = i11;
        if (i11 <= 0) {
            z10 = false;
        }
        dVar.F = z10;
        aVar.f11131j = 0;
        return aVar.f11130i;
    }

    public final void b(e eVar, int i8, int i10, int i11) {
        int i12 = eVar.f10849e0;
        int i13 = eVar.f10851f0;
        eVar.f10849e0 = 0;
        eVar.f10851f0 = 0;
        eVar.O(i10);
        eVar.L(i11);
        if (i12 < 0) {
            eVar.f10849e0 = 0;
        } else {
            eVar.f10849e0 = i12;
        }
        if (i13 < 0) {
            eVar.f10851f0 = 0;
        } else {
            eVar.f10851f0 = i13;
        }
        e eVar2 = this.f11121c;
        eVar2.f10885v0 = i8;
        eVar2.R();
    }

    public final void c(e eVar) {
        ArrayList<d> arrayList = this.f11119a;
        arrayList.clear();
        int size = eVar.f10925s0.size();
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = eVar.f10925s0.get(i8);
            int[] iArr = dVar.V;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f10884u0.f11135b = true;
    }
}
