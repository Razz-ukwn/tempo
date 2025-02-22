package m1;

import java.util.ArrayList;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final p f11156a = null;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<p> f11157b = new ArrayList<>();

    public m(p pVar) {
        this.f11156a = pVar;
    }

    public static long a(f fVar, long j10) {
        p pVar = fVar.f11145d;
        if (pVar instanceof k) {
            return j10;
        }
        ArrayList arrayList = fVar.f11152k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) arrayList.get(i8);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f11145d != pVar) {
                    j11 = Math.min(j11, a(fVar2, ((long) fVar2.f11147f) + j10));
                }
            }
        }
        if (fVar != pVar.f11174i) {
            return j11;
        }
        long j12 = pVar.j();
        f fVar3 = pVar.f11173h;
        long j13 = j10 - j12;
        return Math.min(Math.min(j11, a(fVar3, j13)), j13 - ((long) fVar3.f11147f));
    }

    public static long b(f fVar, long j10) {
        p pVar = fVar.f11145d;
        if (pVar instanceof k) {
            return j10;
        }
        ArrayList arrayList = fVar.f11152k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) arrayList.get(i8);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f11145d != pVar) {
                    j11 = Math.max(j11, b(fVar2, ((long) fVar2.f11147f) + j10));
                }
            }
        }
        if (fVar != pVar.f11173h) {
            return j11;
        }
        long j12 = pVar.j();
        f fVar3 = pVar.f11174i;
        long j13 = j10 + j12;
        return Math.max(Math.max(j11, b(fVar3, j13)), j13 - ((long) fVar3.f11147f));
    }
}
