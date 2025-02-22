package u5;

import java.util.ArrayList;
import r5.i;
import s5.e;
import s5.f;
import v5.a;
import w5.d;
import z5.b;

public class a<T extends v5.a> implements c {

    /* renamed from: a  reason: collision with root package name */
    public final T f15725a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15726b = new ArrayList();

    public a(T t2) {
        this.f15725a = t2;
    }

    public static float f(ArrayList arrayList, float f10, i.a aVar) {
        float f11 = Float.MAX_VALUE;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            b bVar = (b) arrayList.get(i8);
            if (bVar.f15734h == aVar) {
                float abs = Math.abs(bVar.f15730d - f10);
                if (abs < f11) {
                    f11 = abs;
                }
            }
        }
        return f11;
    }

    public b a(float f10, float f11) {
        b b10 = this.f15725a.a(i.a.f14064a).b(f10, f11);
        b.c(b10);
        return e((float) b10.f17726b, f10, f11);
    }

    public ArrayList b(d dVar, int i8, float f10) {
        f C;
        e.a aVar = e.a.f14737c;
        ArrayList arrayList = new ArrayList();
        ArrayList<f> L = dVar.L(f10);
        if (L.size() == 0 && (C = dVar.C(f10, Float.NaN, aVar)) != null) {
            L = dVar.L(C.c());
        }
        if (L.size() == 0) {
            return arrayList;
        }
        for (f fVar : L) {
            b a10 = this.f15725a.a(dVar.U()).a(fVar.c(), fVar.a());
            arrayList.add(new b(fVar.c(), fVar.a(), (float) a10.f17726b, (float) a10.f17727c, i8, dVar.U()));
        }
        return arrayList;
    }

    public s5.a c() {
        return this.f15725a.getData();
    }

    public float d(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot((double) (f10 - f12), (double) (f11 - f13));
    }

    public final b e(float f10, float f11, float f12) {
        ArrayList arrayList = this.f15726b;
        arrayList.clear();
        s5.a c3 = c();
        if (c3 != null) {
            int c10 = c3.c();
            for (int i8 = 0; i8 < c10; i8++) {
                d b10 = c3.b(i8);
                if (b10.Z()) {
                    arrayList.addAll(b(b10, i8, f10));
                }
            }
        }
        b bVar = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        i.a aVar = i.a.f14064a;
        float f13 = f(arrayList, f12, aVar);
        i.a aVar2 = i.a.f14065b;
        if (f13 >= f(arrayList, f12, aVar2)) {
            aVar = aVar2;
        }
        float maxHighlightDistance = this.f15725a.getMaxHighlightDistance();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b bVar2 = (b) arrayList.get(i10);
            if (bVar2.f15734h == aVar) {
                float d10 = d(f11, f12, bVar2.f15729c, bVar2.f15730d);
                if (d10 < maxHighlightDistance) {
                    bVar = bVar2;
                    maxHighlightDistance = d10;
                }
            }
        }
        return bVar;
    }
}
