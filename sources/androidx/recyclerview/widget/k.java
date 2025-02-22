package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2665a = new a();

    public class a implements Comparator<c> {
        public final int compare(Object obj, Object obj2) {
            return ((c) obj).f2666a - ((c) obj2).f2666a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i8, int i10);

        public abstract boolean b(int i8, int i10);

        public Object c(int i8, int i10) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f2666a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2667b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2668c;

        public c(int i8, int i10, int i11) {
            this.f2666a = i8;
            this.f2667b = i10;
            this.f2668c = i11;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f2669a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f2670b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f2671c;

        /* renamed from: d  reason: collision with root package name */
        public final b f2672d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2673e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2674f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f2675g = true;

        public d(b bVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
            b bVar2;
            int[] iArr3;
            int[] iArr4;
            int i8;
            c cVar;
            int i10;
            this.f2669a = arrayList;
            this.f2670b = iArr;
            this.f2671c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f2672d = bVar;
            int e10 = bVar.e();
            this.f2673e = e10;
            int d10 = bVar.d();
            this.f2674f = d10;
            c cVar2 = arrayList.isEmpty() ? null : (c) arrayList.get(0);
            if (!(cVar2 != null && cVar2.f2666a == 0 && cVar2.f2667b == 0)) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(e10, d10, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                bVar2 = this.f2672d;
                iArr3 = this.f2671c;
                iArr4 = this.f2670b;
                if (!hasNext) {
                    break;
                }
                c cVar3 = (c) it.next();
                for (int i11 = 0; i11 < cVar3.f2668c; i11++) {
                    int i12 = cVar3.f2666a + i11;
                    int i13 = cVar3.f2667b + i11;
                    int i14 = bVar2.a(i12, i13) ? 1 : 2;
                    iArr4[i12] = (i13 << 4) | i14;
                    iArr3[i13] = (i12 << 4) | i14;
                }
            }
            if (this.f2675g) {
                Iterator it2 = arrayList.iterator();
                int i15 = 0;
                while (it2.hasNext()) {
                    c cVar4 = (c) it2.next();
                    while (true) {
                        i8 = cVar4.f2666a;
                        if (i15 >= i8) {
                            break;
                        }
                        if (iArr4[i15] == 0) {
                            int size = arrayList.size();
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                if (i16 >= size) {
                                    break;
                                }
                                cVar = (c) arrayList.get(i16);
                                while (true) {
                                    i10 = cVar.f2667b;
                                    if (i17 >= i10) {
                                        break;
                                    } else if (iArr3[i17] != 0 || !bVar2.b(i15, i17)) {
                                        i17++;
                                    } else {
                                        int i18 = bVar2.a(i15, i17) ? 8 : 4;
                                        iArr4[i15] = (i17 << 4) | i18;
                                        iArr3[i17] = i18 | (i15 << 4);
                                    }
                                }
                                i17 = cVar.f2668c + i10;
                                i16++;
                            }
                        }
                        i15++;
                    }
                    i15 = cVar4.f2668c + i8;
                }
            }
        }

        public static f c(ArrayDeque arrayDeque, int i8, boolean z10) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.f2676a == i8 && fVar.f2678c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z10) {
                    fVar2.f2677b--;
                } else {
                    fVar2.f2677b++;
                }
            }
            return fVar;
        }

        public final int a(int i8) {
            int i10 = this.f2673e;
            if (i8 < 0 || i8 >= i10) {
                throw new IndexOutOfBoundsException(androidx.activity.result.d.a("Index out of bounds - passed position = ", i8, ", old list size = ", i10));
            }
            int i11 = this.f2670b[i8];
            if ((i11 & 15) == 0) {
                return -1;
            }
            return i11 >> 4;
        }

        public final void b(p pVar) {
            int i8;
            int[] iArr;
            b bVar;
            int i10;
            int i11;
            List<c> list;
            d dVar = this;
            p pVar2 = pVar;
            c cVar = pVar2 instanceof c ? (c) pVar2 : new c(pVar2);
            ArrayDeque arrayDeque = new ArrayDeque();
            List<c> list2 = dVar.f2669a;
            int size = list2.size() - 1;
            int i12 = dVar.f2673e;
            int i13 = dVar.f2674f;
            int i14 = i12;
            while (size >= 0) {
                c cVar2 = list2.get(size);
                int i15 = cVar2.f2666a;
                int i16 = cVar2.f2668c;
                int i17 = i15 + i16;
                int i18 = cVar2.f2667b;
                int i19 = i16 + i18;
                while (true) {
                    i8 = 0;
                    iArr = dVar.f2670b;
                    bVar = dVar.f2672d;
                    if (i14 <= i17) {
                        break;
                    }
                    i14--;
                    int i20 = iArr[i14];
                    if ((i20 & 12) != 0) {
                        list = list2;
                        int i21 = i20 >> 4;
                        f c3 = c(arrayDeque, i21, false);
                        if (c3 != null) {
                            i11 = i13;
                            int i22 = (i12 - c3.f2677b) - 1;
                            cVar.d(i14, i22);
                            if ((i20 & 4) != 0) {
                                cVar.c(bVar.c(i14, i21), i22, 1);
                            }
                        } else {
                            i11 = i13;
                            arrayDeque.add(new f(i14, (i12 - i14) - 1, true));
                        }
                    } else {
                        list = list2;
                        i11 = i13;
                        cVar.b(i14, 1);
                        i12--;
                    }
                    list2 = list;
                    i13 = i11;
                }
                List<c> list3 = list2;
                int i23 = i13;
                while (i13 > i19) {
                    i13--;
                    int i24 = dVar.f2671c[i13];
                    if ((i24 & 12) != 0) {
                        int i25 = i24 >> 4;
                        f c10 = c(arrayDeque, i25, true);
                        if (c10 == null) {
                            arrayDeque.add(new f(i13, i12 - i14, false));
                            i10 = 0;
                        } else {
                            i10 = 0;
                            cVar.d((i12 - c10.f2677b) - 1, i14);
                            if ((i24 & 4) != 0) {
                                cVar.c(bVar.c(i25, i13), i14, 1);
                            }
                        }
                    } else {
                        i10 = i8;
                        cVar.a(i14, 1);
                        i12++;
                    }
                    dVar = this;
                    i8 = i10;
                }
                int i26 = i8;
                i14 = cVar2.f2666a;
                int i27 = i14;
                int i28 = i18;
                while (i8 < i16) {
                    if ((iArr[i27] & 15) == 2) {
                        cVar.c(bVar.c(i27, i28), i27, 1);
                    }
                    i27++;
                    i28++;
                    i8++;
                }
                size--;
                dVar = this;
                i13 = i18;
                list2 = list3;
            }
            cVar.e();
        }
    }

    public static abstract class e<T> {
        public abstract boolean a(T t2, T t10);

        public abstract boolean b(T t2, T t10);
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f2676a;

        /* renamed from: b  reason: collision with root package name */
        public int f2677b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f2678c;

        public f(int i8, int i10, boolean z10) {
            this.f2676a = i8;
            this.f2677b = i10;
            this.f2678c = z10;
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f2679a;

        /* renamed from: b  reason: collision with root package name */
        public int f2680b;

        /* renamed from: c  reason: collision with root package name */
        public int f2681c;

        /* renamed from: d  reason: collision with root package name */
        public int f2682d;

        public g() {
        }

        public g(int i8, int i10) {
            this.f2679a = 0;
            this.f2680b = i8;
            this.f2681c = 0;
            this.f2682d = i10;
        }
    }

    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public int f2683a;

        /* renamed from: b  reason: collision with root package name */
        public int f2684b;

        /* renamed from: c  reason: collision with root package name */
        public int f2685c;

        /* renamed from: d  reason: collision with root package name */
        public int f2686d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2687e;

        public final int a() {
            return Math.min(this.f2685c - this.f2683a, this.f2686d - this.f2684b);
        }
    }

    public static d a(b bVar) {
        g gVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        h hVar;
        ArrayList arrayList3;
        int i8;
        g gVar2;
        g gVar3;
        c cVar;
        int i10;
        int i11;
        boolean z10;
        h hVar2;
        h hVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        b bVar2 = bVar;
        int e10 = bVar.e();
        int d10 = bVar.d();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new g(e10, d10));
        int i18 = e10 + d10;
        int i19 = 1;
        int i20 = (((i18 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i20];
        int i21 = i20 / 2;
        int[] iArr2 = new int[i20];
        ArrayList arrayList6 = new ArrayList();
        while (!arrayList5.isEmpty()) {
            g gVar4 = (g) arrayList5.remove(arrayList5.size() - i19);
            int i22 = gVar4.f2680b;
            int i23 = gVar4.f2679a;
            int i24 = i22 - i23;
            if (i24 >= i19 && (i10 = gVar4.f2682d - gVar4.f2681c) >= i19) {
                int i25 = ((i10 + i24) + i19) / 2;
                int i26 = i19 + i21;
                iArr[i26] = i23;
                iArr2[i26] = i22;
                int i27 = 0;
                while (true) {
                    if (i27 >= i25) {
                        break;
                    }
                    int i28 = Math.abs((gVar4.f2680b - gVar4.f2679a) - (gVar4.f2682d - gVar4.f2681c)) % 2 == i19 ? i19 : 0;
                    int i29 = (gVar4.f2680b - gVar4.f2679a) - (gVar4.f2682d - gVar4.f2681c);
                    int i30 = -i27;
                    int i31 = i30;
                    while (true) {
                        if (i31 > i27) {
                            arrayList2 = arrayList5;
                            arrayList = arrayList6;
                            i11 = i25;
                            z10 = false;
                            hVar2 = null;
                            break;
                        }
                        if (i31 == i30 || (i31 != i27 && iArr[i31 + 1 + i21] > iArr[(i31 - 1) + i21])) {
                            i16 = iArr[i31 + 1 + i21];
                            i15 = i16;
                        } else {
                            i16 = iArr[(i31 - 1) + i21];
                            i15 = i16 + 1;
                        }
                        i11 = i25;
                        arrayList2 = arrayList5;
                        int i32 = ((i15 - gVar4.f2679a) + gVar4.f2681c) - i31;
                        int i33 = (i27 == 0 || i15 != i16) ? i32 : i32 - 1;
                        arrayList = arrayList6;
                        while (i15 < gVar4.f2680b && i32 < gVar4.f2682d && bVar2.b(i15, i32)) {
                            i15++;
                            i32++;
                        }
                        iArr[i31 + i21] = i15;
                        if (i28 != 0) {
                            int i34 = i29 - i31;
                            i17 = i28;
                            if (i34 >= i30 + 1 && i34 <= i27 - 1 && iArr2[i34 + i21] <= i15) {
                                hVar2 = new h();
                                hVar2.f2683a = i16;
                                hVar2.f2684b = i33;
                                hVar2.f2685c = i15;
                                hVar2.f2686d = i32;
                                z10 = false;
                                hVar2.f2687e = false;
                                break;
                            }
                        } else {
                            i17 = i28;
                        }
                        i31 += 2;
                        i25 = i11;
                        arrayList5 = arrayList2;
                        arrayList6 = arrayList;
                        i28 = i17;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        gVar = gVar4;
                        break;
                    }
                    int i35 = (gVar4.f2680b - gVar4.f2679a) - (gVar4.f2682d - gVar4.f2681c);
                    boolean z11 = i35 % 2 == 0 ? true : z10;
                    int i36 = i30;
                    while (true) {
                        if (i36 > i27) {
                            gVar = gVar4;
                            hVar3 = null;
                            break;
                        }
                        if (i36 == i30 || (i36 != i27 && iArr2[i36 + 1 + i21] < iArr2[(i36 - 1) + i21])) {
                            i13 = iArr2[i36 + 1 + i21];
                            i12 = i13;
                        } else {
                            i13 = iArr2[(i36 - 1) + i21];
                            i12 = i13 - 1;
                        }
                        int i37 = gVar4.f2682d - ((gVar4.f2680b - i12) - i36);
                        int i38 = (i27 == 0 || i12 != i13) ? i37 : i37 + 1;
                        while (true) {
                            if (i12 > gVar4.f2679a && i37 > gVar4.f2681c) {
                                int i39 = i12 - 1;
                                gVar = gVar4;
                                int i40 = i37 - 1;
                                if (!bVar2.b(i39, i40)) {
                                    break;
                                }
                                i12 = i39;
                                i37 = i40;
                                gVar4 = gVar;
                            } else {
                                gVar = gVar4;
                            }
                        }
                        gVar = gVar4;
                        iArr2[i36 + i21] = i12;
                        if (z11 && (i14 = i35 - i36) >= i30 && i14 <= i27 && iArr[i14 + i21] >= i12) {
                            hVar3 = new h();
                            hVar3.f2683a = i12;
                            hVar3.f2684b = i37;
                            hVar3.f2685c = i13;
                            hVar3.f2686d = i38;
                            hVar3.f2687e = true;
                            break;
                        }
                        i36 += 2;
                        gVar4 = gVar;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i27++;
                    i25 = i11;
                    arrayList5 = arrayList2;
                    arrayList6 = arrayList;
                    gVar4 = gVar;
                    i19 = 1;
                }
            }
            arrayList2 = arrayList5;
            arrayList = arrayList6;
            gVar = gVar4;
            hVar = null;
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i41 = hVar.f2686d;
                    int i42 = hVar.f2684b;
                    int i43 = i41 - i42;
                    int i44 = hVar.f2685c;
                    int i45 = hVar.f2683a;
                    int i46 = i44 - i45;
                    if (!(i43 != i46)) {
                        cVar = new c(i45, i42, i46);
                    } else if (hVar.f2687e) {
                        cVar = new c(i45, i42, hVar.a());
                    } else {
                        cVar = i43 > i46 ? new c(i45, i42 + 1, hVar.a()) : new c(i45 + 1, i42, hVar.a());
                    }
                    arrayList4.add(cVar);
                }
                if (arrayList.isEmpty()) {
                    gVar3 = new g();
                    arrayList6 = arrayList;
                    gVar2 = gVar;
                    i8 = 1;
                } else {
                    i8 = 1;
                    arrayList6 = arrayList;
                    gVar3 = (g) arrayList6.remove(arrayList.size() - 1);
                    gVar2 = gVar;
                }
                gVar3.f2679a = gVar2.f2679a;
                gVar3.f2681c = gVar2.f2681c;
                gVar3.f2680b = hVar.f2683a;
                gVar3.f2682d = hVar.f2684b;
                arrayList3 = arrayList2;
                arrayList3.add(gVar3);
                gVar2.f2680b = gVar2.f2680b;
                gVar2.f2682d = gVar2.f2682d;
                gVar2.f2679a = hVar.f2685c;
                gVar2.f2681c = hVar.f2686d;
                arrayList3.add(gVar2);
            } else {
                arrayList3 = arrayList2;
                arrayList6 = arrayList;
                i8 = 1;
                arrayList6.add(gVar);
            }
            i19 = i8;
            arrayList5 = arrayList3;
        }
        Collections.sort(arrayList4, f2665a);
        return new d(bVar2, arrayList4, iArr, iArr2);
    }
}
