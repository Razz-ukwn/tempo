package x0;

import gf.s;
import java.util.ArrayList;
import java.util.List;
import sf.j;
import x0.a;

public final class b {
    static {
        boolean z10 = true & true;
        s sVar = s.f8978a;
        s sVar2 = z10 ? sVar : null;
        if (!true || !true) {
            sVar = null;
        }
        j.f(sVar2, "spanStyles");
        j.f(sVar, "paragraphStyles");
    }

    public static final ArrayList a(int i8, int i10, List list) {
        if (i8 <= i10) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = list.get(i11);
                    a.C0309a aVar = (a.C0309a) obj;
                    if (b(i8, i10, aVar.f16824b, aVar.f16825c)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    a.C0309a aVar2 = (a.C0309a) arrayList.get(i12);
                    arrayList2.add(new a.C0309a(aVar2.f16823a, Math.max(i8, aVar2.f16824b) - i8, Math.min(i10, aVar2.f16825c) - i8, aVar2.f16826d));
                }
                if (arrayList2.isEmpty()) {
                    return null;
                }
                return arrayList2;
            }
            return null;
        }
        throw new IllegalArgumentException(("start (" + i8 + ") should be less than or equal to end (" + i10 + ')').toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if ((r6 == r7) == (r4 == r5)) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        if ((r4 == r5) == (r6 == r7)) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b(int r4, int r5, int r6, int r7) {
        /*
            int r0 = java.lang.Math.max(r4, r6)
            int r1 = java.lang.Math.min(r5, r7)
            r2 = 1
            if (r0 < r1) goto L_0x003c
            r0 = 0
            if (r4 > r6) goto L_0x0020
            if (r7 > r5) goto L_0x0020
            if (r5 != r7) goto L_0x001e
            if (r6 != r7) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            if (r4 != r5) goto L_0x001b
            r3 = r2
            goto L_0x001c
        L_0x001b:
            r3 = r0
        L_0x001c:
            if (r1 != r3) goto L_0x0020
        L_0x001e:
            r1 = r2
            goto L_0x0021
        L_0x0020:
            r1 = r0
        L_0x0021:
            if (r1 != 0) goto L_0x003c
            if (r6 > r4) goto L_0x0037
            if (r5 > r7) goto L_0x0037
            if (r7 != r5) goto L_0x0035
            if (r4 != r5) goto L_0x002d
            r4 = r2
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            if (r6 != r7) goto L_0x0032
            r5 = r2
            goto L_0x0033
        L_0x0032:
            r5 = r0
        L_0x0033:
            if (r4 != r5) goto L_0x0037
        L_0x0035:
            r4 = r2
            goto L_0x0038
        L_0x0037:
            r4 = r0
        L_0x0038:
            if (r4 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r2 = r0
        L_0x003c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b.b(int, int, int, int):boolean");
    }
}
