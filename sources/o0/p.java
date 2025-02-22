package o0;

import java.util.LinkedHashMap;
import java.util.List;
import sf.j;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f12081a = new LinkedHashMap();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f12082a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12083b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12084c;

        public a(long j10, long j11, boolean z10) {
            this.f12082a = j10;
            this.f12083b = j11;
            this.f12084c = z10;
        }
    }

    public final e a(q qVar, v vVar) {
        boolean z10;
        long j10;
        long j11;
        int i8;
        q qVar2 = qVar;
        v vVar2 = vVar;
        j.f(vVar2, "positionCalculator");
        List<r> list = qVar2.f12085a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            r rVar = list.get(i10);
            LinkedHashMap linkedHashMap2 = this.f12081a;
            a aVar = (a) linkedHashMap2.get(new n(rVar.f12087a));
            if (aVar == null) {
                j11 = rVar.f12088b;
                j10 = rVar.f12090d;
                z10 = false;
            } else {
                long r10 = vVar2.r(aVar.f12083b);
                long j12 = aVar.f12082a;
                z10 = aVar.f12084c;
                j10 = r10;
                j11 = j12;
            }
            long j13 = rVar.f12087a;
            linkedHashMap.put(new n(j13), new o(j13, rVar.f12088b, rVar.f12090d, rVar.f12091e, rVar.f12092f, j11, j10, z10, rVar.f12093g, rVar.f12095i, rVar.f12096j));
            boolean z11 = rVar.f12091e;
            long j14 = rVar.f12087a;
            if (z11) {
                i8 = i10;
                linkedHashMap2.put(new n(j14), new a(rVar.f12088b, rVar.f12089c, z11));
            } else {
                i8 = i10;
                linkedHashMap2.remove(new n(j14));
            }
            i10 = i8 + 1;
        }
        return new e(linkedHashMap, qVar2);
    }
}
