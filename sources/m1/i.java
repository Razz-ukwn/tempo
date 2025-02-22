package m1;

import java.util.ArrayList;
import l1.c;
import l1.d;
import l1.g;

public final class i {
    public static o a(d dVar, int i8, ArrayList<o> arrayList, o oVar) {
        boolean z10;
        int i10;
        int i11 = i8 == 0 ? dVar.f10872q0 : dVar.f10874r0;
        int i12 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f11162b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i13);
                if (oVar2.f11162b == i11) {
                    if (oVar != null) {
                        oVar.c(i8, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof l1.i) {
                l1.i iVar = (l1.i) dVar;
                int i14 = 0;
                while (true) {
                    if (i14 >= iVar.f10918t0) {
                        i10 = -1;
                        break;
                    }
                    d dVar2 = iVar.f10917s0[i14];
                    if ((i8 == 0 && (i10 = dVar2.f10872q0) != -1) || (i8 == 1 && (i10 = dVar2.f10874r0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i10 != -1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i15);
                        if (oVar3.f11162b == i10) {
                            oVar = oVar3;
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i8);
            }
            arrayList.add(oVar);
        }
        ArrayList<d> arrayList2 = oVar.f11161a;
        if (arrayList2.contains(dVar)) {
            z10 = false;
        } else {
            arrayList2.add(dVar);
            z10 = true;
        }
        if (z10) {
            if (dVar instanceof g) {
                g gVar = (g) dVar;
                c cVar = gVar.f10914v0;
                if (gVar.f10915w0 == 0) {
                    i12 = 1;
                }
                cVar.c(i12, oVar, arrayList);
            }
            int i16 = oVar.f11162b;
            if (i8 == 0) {
                dVar.f10872q0 = i16;
                dVar.K.c(i8, oVar, arrayList);
                dVar.M.c(i8, oVar, arrayList);
            } else {
                dVar.f10874r0 = i16;
                dVar.L.c(i8, oVar, arrayList);
                dVar.O.c(i8, oVar, arrayList);
                dVar.N.c(i8, oVar, arrayList);
            }
            dVar.R.c(i8, oVar, arrayList);
        }
        return oVar;
    }

    public static boolean b(int i8, int i10, int i11, int i12) {
        return (i11 == 1 || i11 == 2 || (i11 == 4 && i8 != 2)) || (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2));
    }
}
