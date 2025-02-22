package androidx.recyclerview.widget;

import androidx.recyclerview.widget.q;
import c2.e;
import java.util.ArrayList;

public final class a implements q.a {

    /* renamed from: a  reason: collision with root package name */
    public final e f2576a = new e(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f2577b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2578c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final C0029a f2579d;

    /* renamed from: e  reason: collision with root package name */
    public final q f2580e;

    /* renamed from: f  reason: collision with root package name */
    public int f2581f = 0;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface C0029a {
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2582a;

        /* renamed from: b  reason: collision with root package name */
        public int f2583b;

        /* renamed from: c  reason: collision with root package name */
        public Object f2584c;

        /* renamed from: d  reason: collision with root package name */
        public int f2585d;

        public b(Object obj, int i8, int i10, int i11) {
            this.f2582a = i8;
            this.f2583b = i10;
            this.f2585d = i11;
            this.f2584c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i8 = this.f2582a;
            if (i8 != bVar.f2582a) {
                return false;
            }
            if (i8 == 8 && Math.abs(this.f2585d - this.f2583b) == 1 && this.f2585d == bVar.f2583b && this.f2583b == bVar.f2585d) {
                return true;
            }
            if (this.f2585d != bVar.f2585d || this.f2583b != bVar.f2583b) {
                return false;
            }
            Object obj2 = this.f2584c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f2584c)) {
                    return false;
                }
            } else if (bVar.f2584c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f2582a * 31) + this.f2583b) * 31) + this.f2585d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i8 = this.f2582a;
            sb2.append(i8 != 1 ? i8 != 2 ? i8 != 4 ? i8 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb2.append(",s:");
            sb2.append(this.f2583b);
            sb2.append("c:");
            sb2.append(this.f2585d);
            sb2.append(",p:");
            sb2.append(this.f2584c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public a(x xVar) {
        this.f2579d = xVar;
        this.f2580e = new q(this);
    }

    public final boolean a(int i8) {
        ArrayList<b> arrayList = this.f2578c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = arrayList.get(i10);
            int i11 = bVar.f2582a;
            if (i11 == 8) {
                if (f(bVar.f2585d, i10 + 1) == i8) {
                    return true;
                }
            } else if (i11 == 1) {
                int i12 = bVar.f2583b;
                int i13 = bVar.f2585d + i12;
                while (i12 < i13) {
                    if (f(i12, i10 + 1) == i8) {
                        return true;
                    }
                    i12++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.f2578c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((x) this.f2579d).a(arrayList.get(i8));
        }
        l(arrayList);
        this.f2581f = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f2577b;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = arrayList.get(i8);
            int i10 = bVar.f2582a;
            C0029a aVar = this.f2579d;
            if (i10 == 1) {
                x xVar = (x) aVar;
                xVar.a(bVar);
                xVar.d(bVar.f2583b, bVar.f2585d);
            } else if (i10 == 2) {
                x xVar2 = (x) aVar;
                xVar2.a(bVar);
                int i11 = bVar.f2583b;
                int i12 = bVar.f2585d;
                RecyclerView recyclerView = xVar2.f2756a;
                recyclerView.O(i11, i12, true);
                recyclerView.G0 = true;
                recyclerView.D0.f2528c += i12;
            } else if (i10 == 4) {
                x xVar3 = (x) aVar;
                xVar3.a(bVar);
                xVar3.c(bVar.f2584c, bVar.f2583b, bVar.f2585d);
            } else if (i10 == 8) {
                x xVar4 = (x) aVar;
                xVar4.a(bVar);
                xVar4.e(bVar.f2583b, bVar.f2585d);
            }
        }
        l(arrayList);
        this.f2581f = 0;
    }

    public final void d(b bVar) {
        int i8;
        e eVar;
        int i10 = bVar.f2582a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = m(bVar.f2583b, i10);
        int i11 = bVar.f2583b;
        int i12 = bVar.f2582a;
        if (i12 == 2) {
            i8 = 0;
        } else if (i12 == 4) {
            i8 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i13 = 1;
        int i14 = 1;
        while (true) {
            int i15 = bVar.f2585d;
            eVar = this.f2576a;
            if (i13 >= i15) {
                break;
            }
            int m10 = m((i8 * i13) + bVar.f2583b, bVar.f2582a);
            int i16 = bVar.f2582a;
            if (i16 == 2 ? m10 == m : i16 == 4 && m10 == m + 1) {
                i14++;
            } else {
                b h3 = h(bVar.f2584c, i16, m, i14);
                e(h3, i11);
                h3.f2584c = null;
                eVar.a(h3);
                if (bVar.f2582a == 4) {
                    i11 += i14;
                }
                i14 = 1;
                m = m10;
            }
            i13++;
        }
        Object obj = bVar.f2584c;
        bVar.f2584c = null;
        eVar.a(bVar);
        if (i14 > 0) {
            b h10 = h(obj, bVar.f2582a, m, i14);
            e(h10, i11);
            h10.f2584c = null;
            eVar.a(h10);
        }
    }

    public final void e(b bVar, int i8) {
        x xVar = (x) this.f2579d;
        xVar.a(bVar);
        int i10 = bVar.f2582a;
        if (i10 == 2) {
            int i11 = bVar.f2585d;
            RecyclerView recyclerView = xVar.f2756a;
            recyclerView.O(i8, i11, true);
            recyclerView.G0 = true;
            recyclerView.D0.f2528c += i11;
        } else if (i10 == 4) {
            xVar.c(bVar.f2584c, i8, bVar.f2585d);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int f(int i8, int i10) {
        ArrayList<b> arrayList = this.f2578c;
        int size = arrayList.size();
        while (i10 < size) {
            b bVar = arrayList.get(i10);
            int i11 = bVar.f2582a;
            if (i11 == 8) {
                int i12 = bVar.f2583b;
                if (i12 == i8) {
                    i8 = bVar.f2585d;
                } else {
                    if (i12 < i8) {
                        i8--;
                    }
                    if (bVar.f2585d <= i8) {
                        i8++;
                    }
                }
            } else {
                int i13 = bVar.f2583b;
                if (i13 > i8) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = bVar.f2585d;
                    if (i8 < i13 + i14) {
                        return -1;
                    }
                    i8 -= i14;
                } else if (i11 == 1) {
                    i8 += bVar.f2585d;
                }
            }
            i10++;
        }
        return i8;
    }

    public final boolean g() {
        return this.f2577b.size() > 0;
    }

    public final b h(Object obj, int i8, int i10, int i11) {
        b bVar = (b) this.f2576a.b();
        if (bVar == null) {
            return new b(obj, i8, i10, i11);
        }
        bVar.f2582a = i8;
        bVar.f2583b = i10;
        bVar.f2585d = i11;
        bVar.f2584c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f2578c.add(bVar);
        int i8 = bVar.f2582a;
        C0029a aVar = this.f2579d;
        if (i8 == 1) {
            ((x) aVar).d(bVar.f2583b, bVar.f2585d);
        } else if (i8 == 2) {
            int i10 = bVar.f2583b;
            int i11 = bVar.f2585d;
            RecyclerView recyclerView = ((x) aVar).f2756a;
            recyclerView.O(i10, i11, false);
            recyclerView.G0 = true;
        } else if (i8 == 4) {
            x xVar = (x) aVar;
            xVar.c(bVar.f2584c, bVar.f2583b, bVar.f2585d);
        } else if (i8 == 8) {
            ((x) aVar).e(bVar.f2583b, bVar.f2585d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:180:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r16 = this;
            r0 = r16
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2577b
            androidx.recyclerview.widget.q r2 = r0.f2580e
            r2.getClass()
        L_0x0009:
            int r3 = r1.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r1.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.a.b) r9
            int r9 = r9.f2582a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = r4
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = r8
        L_0x0027:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r8) goto L_0x01d8
            int r7 = r3 + 1
            java.lang.Object r11 = r1.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            java.lang.Object r12 = r1.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.a.b) r12
            int r13 = r12.f2582a
            if (r13 == r4) goto L_0x01ae
            androidx.recyclerview.widget.q$a r8 = r2.f2748a
            if (r13 == r10) goto L_0x00af
            if (r13 == r9) goto L_0x0045
            goto L_0x0009
        L_0x0045:
            int r5 = r11.f2585d
            int r10 = r12.f2583b
            if (r5 >= r10) goto L_0x0050
            int r10 = r10 + -1
            r12.f2583b = r10
            goto L_0x0065
        L_0x0050:
            int r13 = r12.f2585d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0065
            int r13 = r13 + -1
            r12.f2585d = r13
            int r5 = r11.f2583b
            java.lang.Object r10 = r12.f2584c
            r13 = r8
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.a$b r4 = r13.h(r10, r9, r5, r4)
            goto L_0x0066
        L_0x0065:
            r4 = r6
        L_0x0066:
            int r5 = r11.f2583b
            int r10 = r12.f2583b
            if (r5 > r10) goto L_0x0071
            int r10 = r10 + 1
            r12.f2583b = r10
            goto L_0x0088
        L_0x0071:
            int r13 = r12.f2585d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0088
            int r10 = r10 - r5
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f2584c
            r14 = r8
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            androidx.recyclerview.widget.a$b r5 = r14.h(r13, r9, r5, r10)
            int r9 = r12.f2585d
            int r9 = r9 - r10
            r12.f2585d = r9
            goto L_0x0089
        L_0x0088:
            r5 = r6
        L_0x0089:
            r1.set(r7, r11)
            int r7 = r12.f2585d
            if (r7 <= 0) goto L_0x0094
            r1.set(r3, r12)
            goto L_0x00a3
        L_0x0094:
            r1.remove(r3)
            androidx.recyclerview.widget.a r8 = (androidx.recyclerview.widget.a) r8
            r8.getClass()
            r12.f2584c = r6
            c2.e r6 = r8.f2576a
            r6.a(r12)
        L_0x00a3:
            if (r4 == 0) goto L_0x00a8
            r1.add(r3, r4)
        L_0x00a8:
            if (r5 == 0) goto L_0x0009
            r1.add(r3, r5)
            goto L_0x0009
        L_0x00af:
            int r9 = r11.f2583b
            int r13 = r11.f2585d
            if (r9 >= r13) goto L_0x00c4
            int r14 = r12.f2583b
            if (r14 != r9) goto L_0x00c2
            int r14 = r12.f2585d
            int r9 = r13 - r9
            if (r14 != r9) goto L_0x00c2
            r5 = r4
            r9 = 0
            goto L_0x00d4
        L_0x00c2:
            r5 = 0
            goto L_0x00d0
        L_0x00c4:
            int r14 = r12.f2583b
            int r15 = r13 + 1
            if (r14 != r15) goto L_0x00d2
            int r14 = r12.f2585d
            int r9 = r9 - r13
            if (r14 != r9) goto L_0x00d2
            r5 = r4
        L_0x00d0:
            r9 = r5
            goto L_0x00d4
        L_0x00d2:
            r9 = r4
            r5 = 0
        L_0x00d4:
            int r14 = r12.f2583b
            if (r13 >= r14) goto L_0x00dd
            int r14 = r14 + -1
            r12.f2583b = r14
            goto L_0x00ff
        L_0x00dd:
            int r15 = r12.f2585d
            int r14 = r14 + r15
            if (r13 >= r14) goto L_0x00ff
            int r15 = r15 + -1
            r12.f2585d = r15
            r11.f2582a = r10
            r11.f2585d = r4
            int r3 = r12.f2585d
            if (r3 != 0) goto L_0x0009
            r1.remove(r7)
            androidx.recyclerview.widget.a r8 = (androidx.recyclerview.widget.a) r8
            r8.getClass()
            r12.f2584c = r6
            c2.e r3 = r8.f2576a
            r3.a(r12)
            goto L_0x0009
        L_0x00ff:
            int r4 = r11.f2583b
            int r13 = r12.f2583b
            if (r4 > r13) goto L_0x010a
            int r13 = r13 + 1
            r12.f2583b = r13
            goto L_0x0121
        L_0x010a:
            int r14 = r12.f2585d
            int r13 = r13 + r14
            if (r4 >= r13) goto L_0x0121
            int r13 = r13 - r4
            int r4 = r4 + 1
            r14 = r8
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            androidx.recyclerview.widget.a$b r4 = r14.h(r6, r10, r4, r13)
            int r10 = r11.f2583b
            int r13 = r12.f2583b
            int r10 = r10 - r13
            r12.f2585d = r10
            goto L_0x0122
        L_0x0121:
            r4 = r6
        L_0x0122:
            if (r5 == 0) goto L_0x0138
            r1.set(r3, r12)
            r1.remove(r7)
            androidx.recyclerview.widget.a r8 = (androidx.recyclerview.widget.a) r8
            r8.getClass()
            r11.f2584c = r6
            c2.e r3 = r8.f2576a
            r3.a(r11)
            goto L_0x0009
        L_0x0138:
            if (r9 == 0) goto L_0x0169
            if (r4 == 0) goto L_0x0152
            int r5 = r11.f2583b
            int r6 = r4.f2583b
            if (r5 <= r6) goto L_0x0147
            int r6 = r4.f2585d
            int r5 = r5 - r6
            r11.f2583b = r5
        L_0x0147:
            int r5 = r11.f2585d
            int r6 = r4.f2583b
            if (r5 <= r6) goto L_0x0152
            int r6 = r4.f2585d
            int r5 = r5 - r6
            r11.f2585d = r5
        L_0x0152:
            int r5 = r11.f2583b
            int r6 = r12.f2583b
            if (r5 <= r6) goto L_0x015d
            int r6 = r12.f2585d
            int r5 = r5 - r6
            r11.f2583b = r5
        L_0x015d:
            int r5 = r11.f2585d
            int r6 = r12.f2583b
            if (r5 <= r6) goto L_0x0197
            int r6 = r12.f2585d
            int r5 = r5 - r6
            r11.f2585d = r5
            goto L_0x0197
        L_0x0169:
            if (r4 == 0) goto L_0x0181
            int r5 = r11.f2583b
            int r6 = r4.f2583b
            if (r5 < r6) goto L_0x0176
            int r6 = r4.f2585d
            int r5 = r5 - r6
            r11.f2583b = r5
        L_0x0176:
            int r5 = r11.f2585d
            int r6 = r4.f2583b
            if (r5 < r6) goto L_0x0181
            int r6 = r4.f2585d
            int r5 = r5 - r6
            r11.f2585d = r5
        L_0x0181:
            int r5 = r11.f2583b
            int r6 = r12.f2583b
            if (r5 < r6) goto L_0x018c
            int r6 = r12.f2585d
            int r5 = r5 - r6
            r11.f2583b = r5
        L_0x018c:
            int r5 = r11.f2585d
            int r6 = r12.f2583b
            if (r5 < r6) goto L_0x0197
            int r6 = r12.f2585d
            int r5 = r5 - r6
            r11.f2585d = r5
        L_0x0197:
            r1.set(r3, r12)
            int r5 = r11.f2583b
            int r6 = r11.f2585d
            if (r5 == r6) goto L_0x01a4
            r1.set(r7, r11)
            goto L_0x01a7
        L_0x01a4:
            r1.remove(r7)
        L_0x01a7:
            if (r4 == 0) goto L_0x0009
            r1.add(r3, r4)
            goto L_0x0009
        L_0x01ae:
            int r4 = r11.f2585d
            int r6 = r12.f2583b
            if (r4 >= r6) goto L_0x01b6
            r5 = r8
            goto L_0x01b7
        L_0x01b6:
            r5 = 0
        L_0x01b7:
            int r8 = r11.f2583b
            if (r8 >= r6) goto L_0x01bd
            int r5 = r5 + 1
        L_0x01bd:
            if (r6 > r8) goto L_0x01c4
            int r6 = r12.f2585d
            int r8 = r8 + r6
            r11.f2583b = r8
        L_0x01c4:
            int r6 = r12.f2583b
            if (r6 > r4) goto L_0x01cd
            int r8 = r12.f2585d
            int r4 = r4 + r8
            r11.f2585d = r4
        L_0x01cd:
            int r6 = r6 + r5
            r12.f2583b = r6
            r1.set(r3, r12)
            r1.set(r7, r11)
            goto L_0x0009
        L_0x01d8:
            int r2 = r1.size()
            r3 = 0
        L_0x01dd:
            if (r3 >= r2) goto L_0x02b9
            java.lang.Object r11 = r1.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            int r12 = r11.f2582a
            if (r12 == r4) goto L_0x02ad
            c2.e r13 = r0.f2576a
            androidx.recyclerview.widget.a$a r14 = r0.f2579d
            if (r12 == r10) goto L_0x0250
            if (r12 == r9) goto L_0x01fa
            if (r12 == r7) goto L_0x01f4
            goto L_0x01f7
        L_0x01f4:
            r0.i(r11)
        L_0x01f7:
            r7 = r10
            goto L_0x02b1
        L_0x01fa:
            int r12 = r11.f2583b
            int r15 = r11.f2585d
            int r15 = r15 + r12
            r5 = r12
            r7 = 0
        L_0x0201:
            if (r12 >= r15) goto L_0x0235
            r10 = r14
            androidx.recyclerview.widget.x r10 = (androidx.recyclerview.widget.x) r10
            androidx.recyclerview.widget.RecyclerView$b0 r10 = r10.b(r12)
            if (r10 != 0) goto L_0x0222
            boolean r10 = r0.a(r12)
            if (r10 == 0) goto L_0x0213
            goto L_0x0222
        L_0x0213:
            if (r8 != r4) goto L_0x0220
            java.lang.Object r8 = r11.f2584c
            androidx.recyclerview.widget.a$b r5 = r0.h(r8, r9, r5, r7)
            r0.i(r5)
            r5 = r12
            r7 = 0
        L_0x0220:
            r8 = 0
            goto L_0x0230
        L_0x0222:
            if (r8 != 0) goto L_0x022f
            java.lang.Object r8 = r11.f2584c
            androidx.recyclerview.widget.a$b r5 = r0.h(r8, r9, r5, r7)
            r0.d(r5)
            r5 = r12
            r7 = 0
        L_0x022f:
            r8 = r4
        L_0x0230:
            int r7 = r7 + r4
            int r12 = r12 + 1
            r10 = 2
            goto L_0x0201
        L_0x0235:
            int r10 = r11.f2585d
            if (r7 == r10) goto L_0x0244
            java.lang.Object r10 = r11.f2584c
            r11.f2584c = r6
            r13.a(r11)
            androidx.recyclerview.widget.a$b r11 = r0.h(r10, r9, r5, r7)
        L_0x0244:
            if (r8 != 0) goto L_0x024a
            r0.d(r11)
            goto L_0x024d
        L_0x024a:
            r0.i(r11)
        L_0x024d:
            r7 = 2
            goto L_0x02b1
        L_0x0250:
            int r5 = r11.f2583b
            int r7 = r11.f2585d
            int r7 = r7 + r5
            r8 = r5
            r10 = 0
            r12 = -1
        L_0x0258:
            if (r8 >= r7) goto L_0x0293
            r15 = r14
            androidx.recyclerview.widget.x r15 = (androidx.recyclerview.widget.x) r15
            androidx.recyclerview.widget.RecyclerView$b0 r15 = r15.b(r8)
            if (r15 != 0) goto L_0x027a
            boolean r15 = r0.a(r8)
            if (r15 == 0) goto L_0x026a
            goto L_0x027a
        L_0x026a:
            if (r12 != r4) goto L_0x0276
            r15 = 2
            androidx.recyclerview.widget.a$b r12 = r0.h(r6, r15, r5, r10)
            r0.i(r12)
            r12 = r4
            goto L_0x0278
        L_0x0276:
            r15 = 2
            r12 = 0
        L_0x0278:
            r15 = 0
            goto L_0x0288
        L_0x027a:
            r15 = 2
            if (r12 != 0) goto L_0x0286
            androidx.recyclerview.widget.a$b r12 = r0.h(r6, r15, r5, r10)
            r0.d(r12)
            r12 = r4
            goto L_0x0287
        L_0x0286:
            r12 = 0
        L_0x0287:
            r15 = r4
        L_0x0288:
            if (r12 == 0) goto L_0x028e
            int r8 = r8 - r10
            int r7 = r7 - r10
            r10 = r4
            goto L_0x0290
        L_0x028e:
            int r10 = r10 + 1
        L_0x0290:
            int r8 = r8 + r4
            r12 = r15
            goto L_0x0258
        L_0x0293:
            int r7 = r11.f2585d
            if (r10 == r7) goto L_0x02a2
            r11.f2584c = r6
            r13.a(r11)
            r7 = 2
            androidx.recyclerview.widget.a$b r11 = r0.h(r6, r7, r5, r10)
            goto L_0x02a3
        L_0x02a2:
            r7 = 2
        L_0x02a3:
            if (r12 != 0) goto L_0x02a9
            r0.d(r11)
            goto L_0x02b1
        L_0x02a9:
            r0.i(r11)
            goto L_0x02b1
        L_0x02ad:
            r7 = r10
            r0.i(r11)
        L_0x02b1:
            int r3 = r3 + 1
            r10 = r7
            r7 = 8
            r8 = -1
            goto L_0x01dd
        L_0x02b9:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.f2584c = null;
        this.f2576a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            k((b) arrayList.get(i8));
        }
        arrayList.clear();
    }

    public final int m(int i8, int i10) {
        int i11;
        int i12;
        ArrayList<b> arrayList = this.f2578c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i13 = bVar.f2582a;
            if (i13 == 8) {
                int i14 = bVar.f2583b;
                int i15 = bVar.f2585d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i8 < i12 || i8 > i11) {
                    if (i8 < i14) {
                        if (i10 == 1) {
                            bVar.f2583b = i14 + 1;
                            bVar.f2585d = i15 + 1;
                        } else if (i10 == 2) {
                            bVar.f2583b = i14 - 1;
                            bVar.f2585d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        bVar.f2585d = i15 + 1;
                    } else if (i10 == 2) {
                        bVar.f2585d = i15 - 1;
                    }
                    i8++;
                } else {
                    if (i10 == 1) {
                        bVar.f2583b = i14 + 1;
                    } else if (i10 == 2) {
                        bVar.f2583b = i14 - 1;
                    }
                    i8--;
                }
            } else {
                int i16 = bVar.f2583b;
                if (i16 <= i8) {
                    if (i13 == 1) {
                        i8 -= bVar.f2585d;
                    } else if (i13 == 2) {
                        i8 += bVar.f2585d;
                    }
                } else if (i10 == 1) {
                    bVar.f2583b = i16 + 1;
                } else if (i10 == 2) {
                    bVar.f2583b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f2582a == 8) {
                int i17 = bVar2.f2585d;
                if (i17 == bVar2.f2583b || i17 < 0) {
                    arrayList.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f2585d <= 0) {
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i8;
    }
}
