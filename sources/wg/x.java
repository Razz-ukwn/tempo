package wg;

import gf.c;
import java.util.ArrayList;
import java.util.RandomAccess;

public final class x extends c<i> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final i[] f16804a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f16805b;

    public static final class a {
        public static void a(long j10, e eVar, int i8, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
            int i12;
            int i13;
            int i14;
            long j11;
            int i15;
            e eVar2;
            e eVar3 = eVar;
            int i16 = i8;
            ArrayList arrayList3 = arrayList;
            int i17 = i10;
            int i18 = i11;
            ArrayList arrayList4 = arrayList2;
            if (i17 < i18) {
                int i19 = i17;
                while (i19 < i18) {
                    if (((i) arrayList3.get(i19)).d() >= i16) {
                        i19++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                i iVar = (i) arrayList.get(i10);
                i iVar2 = (i) arrayList3.get(i18 - 1);
                int i20 = -1;
                if (i16 == iVar.d()) {
                    int intValue = ((Number) arrayList4.get(i17)).intValue();
                    int i21 = i17 + 1;
                    i iVar3 = (i) arrayList3.get(i21);
                    i12 = i21;
                    i13 = intValue;
                    iVar = iVar3;
                } else {
                    i12 = i17;
                    i13 = -1;
                }
                if (iVar.i(i16) != iVar2.i(i16)) {
                    int i22 = 1;
                    for (int i23 = i12 + 1; i23 < i18; i23++) {
                        if (((i) arrayList3.get(i23 - 1)).i(i16) != ((i) arrayList3.get(i23)).i(i16)) {
                            i22++;
                        }
                    }
                    long j12 = (long) 4;
                    long j13 = ((long) (i22 * 2)) + (eVar3.f16752b / j12) + j10 + ((long) 2);
                    eVar3.n0(i22);
                    eVar3.n0(i13);
                    for (int i24 = i12; i24 < i18; i24++) {
                        byte i25 = ((i) arrayList3.get(i24)).i(i16);
                        if (i24 == i12 || i25 != ((i) arrayList3.get(i24 - 1)).i(i16)) {
                            eVar3.n0(i25 & 255);
                        }
                    }
                    e eVar4 = new e();
                    while (i12 < i18) {
                        byte i26 = ((i) arrayList3.get(i12)).i(i16);
                        int i27 = i12 + 1;
                        int i28 = i27;
                        while (true) {
                            if (i28 >= i18) {
                                i14 = i18;
                                break;
                            } else if (i26 != ((i) arrayList3.get(i28)).i(i16)) {
                                i14 = i28;
                                break;
                            } else {
                                i28++;
                            }
                        }
                        if (i27 == i14 && i16 + 1 == ((i) arrayList3.get(i12)).d()) {
                            eVar3.n0(((Number) arrayList4.get(i12)).intValue());
                            i15 = i14;
                            eVar2 = eVar4;
                            j11 = j12;
                        } else {
                            eVar3.n0(((int) ((eVar4.f16752b / j12) + j13)) * i20);
                            i15 = i14;
                            eVar2 = eVar4;
                            j11 = j12;
                            a(j13, eVar4, i16 + 1, arrayList, i12, i15, arrayList2);
                        }
                        eVar4 = eVar2;
                        i12 = i15;
                        j12 = j11;
                        i20 = -1;
                    }
                    eVar3.x(eVar4);
                    return;
                }
                int min = Math.min(iVar.d(), iVar2.d());
                int i29 = i16;
                int i30 = 0;
                while (i29 < min && iVar.i(i29) == iVar2.i(i29)) {
                    i30++;
                    i29++;
                }
                long j14 = (long) 4;
                long j15 = (eVar3.f16752b / j14) + j10 + ((long) 2) + ((long) i30) + 1;
                eVar3.n0(-i30);
                eVar3.n0(i13);
                int i31 = i16 + i30;
                while (i16 < i31) {
                    eVar3.n0(iVar.i(i16) & 255);
                    i16++;
                }
                if (i12 + 1 == i18) {
                    if (i31 == ((i) arrayList3.get(i12)).d()) {
                        eVar3.n0(((Number) arrayList4.get(i12)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                e eVar5 = new e();
                eVar3.n0(((int) ((eVar5.f16752b / j14) + j15)) * -1);
                a(j15, eVar5, i31, arrayList, i12, i11, arrayList2);
                eVar3.x(eVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public x(i[] iVarArr, int[] iArr) {
        this.f16804a = iVarArr;
        this.f16805b = iArr;
    }

    public final int a() {
        return this.f16804a.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return super.contains((i) obj);
    }

    public final Object get(int i8) {
        return this.f16804a[i8];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.indexOf((i) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.lastIndexOf((i) obj);
    }
}
