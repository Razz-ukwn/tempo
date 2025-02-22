package o0;

import java.util.LinkedHashMap;
import java.util.List;
import s0.m1;
import s0.s0;
import sf.j;
import u.d;

public final class h extends i {

    /* renamed from: b  reason: collision with root package name */
    public final m1 f12053b;

    /* renamed from: c  reason: collision with root package name */
    public final d<n> f12054c = new d<>(new n[16]);

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f12055d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public s0 f12056e;

    /* renamed from: f  reason: collision with root package name */
    public j f12057f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12058g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12059h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12060i = true;

    public h(m1 m1Var) {
        j.f(m1Var, "pointerInputNode");
        this.f12053b = m1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01df, code lost:
        if ((r10 == 5 ? r5 : false) != false) goto L_0x01e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.util.Map<o0.n, o0.o> r36, q0.h r37, o0.e r38, boolean r39) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r38
            java.lang.String r4 = "changes"
            sf.j.f(r1, r4)
            java.lang.String r4 = "parentCoordinates"
            sf.j.f(r2, r4)
            boolean r4 = super.a(r36, r37, r38, r39)
            s0.m1 r5 = r0.f12053b
            boolean r6 = s0.n1.a(r5)
            r7 = 1
            if (r6 != 0) goto L_0x0020
            return r7
        L_0x0020:
            r6 = 16
            s0.s0 r5 = s0.i.d(r5, r6)
            r0.f12056e = r5
            java.util.Set r5 = r36.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0030:
            boolean r6 = r5.hasNext()
            java.util.LinkedHashMap r8 = r0.f12055d
            u.d<o0.n> r10 = r0.f12054c
            r11 = 0
            if (r6 == 0) goto L_0x0111
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r12 = r6.getKey()
            o0.n r12 = (o0.n) r12
            long r12 = r12.f12068a
            java.lang.Object r6 = r6.getValue()
            o0.o r6 = (o0.o) r6
            o0.n r14 = new o0.n
            r14.<init>(r12)
            boolean r10 = r10.g(r14)
            if (r10 == 0) goto L_0x0109
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List<o0.d> r14 = r6.f12079k
            if (r14 != 0) goto L_0x0065
            gf.s r14 = gf.s.f8978a
        L_0x0065:
            int r15 = r14.size()
        L_0x0069:
            if (r11 >= r15) goto L_0x009e
            java.lang.Object r16 = r14.get(r11)
            r9 = r16
            o0.d r9 = (o0.d) r9
            o0.d r7 = new o0.d
            r16 = r14
            r18 = r15
            long r14 = r9.f12042a
            r33 = r5
            s0.s0 r5 = r0.f12056e
            sf.j.c(r5)
            r34 = r4
            long r3 = r9.f12043b
            long r3 = r5.o0(r2, r3)
            r7.<init>(r14, r3)
            r10.add(r7)
            int r11 = r11 + 1
            r3 = r38
            r14 = r16
            r15 = r18
            r5 = r33
            r4 = r34
            r7 = 1
            goto L_0x0069
        L_0x009e:
            r34 = r4
            r33 = r5
            o0.n r3 = new o0.n
            r3.<init>(r12)
            s0.s0 r4 = r0.f12056e
            sf.j.c(r4)
            long r11 = r6.f12074f
            long r25 = r4.o0(r2, r11)
            s0.s0 r4 = r0.f12056e
            sf.j.c(r4)
            long r11 = r6.f12071c
            long r19 = r4.o0(r2, r11)
            long r4 = r6.f12069a
            long r11 = r6.f12070b
            boolean r7 = r6.f12072d
            long r13 = r6.f12073e
            boolean r9 = r6.f12075g
            int r15 = r6.f12076h
            long r1 = r6.f12077i
            r21 = r13
            o0.o r13 = new o0.o
            java.lang.Float r14 = r6.f12078j
            if (r14 == 0) goto L_0x00da
            float r14 = r14.floatValue()
            r23 = r14
            goto L_0x00dc
        L_0x00da:
            r23 = 0
        L_0x00dc:
            r27 = r21
            r14 = r13
            r29 = r15
            r15 = r4
            r17 = r11
            r21 = r7
            r22 = r23
            r23 = r27
            r27 = r9
            r28 = r29
            r29 = r10
            r30 = r1
            r14.<init>(r15, r17, r19, r21, r22, r23, r25, r27, r28, r29, r30)
            o0.c r1 = r6.f12080l
            r13.f12080l = r1
            r8.put(r3, r13)
            r1 = r36
            r2 = r37
            r3 = r38
            r5 = r33
            r4 = r34
            r7 = 1
            goto L_0x0030
        L_0x0109:
            r1 = r36
            r2 = r37
            r3 = r38
            goto L_0x0030
        L_0x0111:
            r34 = r4
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0123
            r10.f()
            u.d<o0.h> r1 = r0.f12061a
            r1.f()
            r1 = 1
            return r1
        L_0x0123:
            r1 = 1
            int r2 = r10.f15640c
            int r2 = r2 - r1
        L_0x0127:
            r1 = -1
            if (r1 >= r2) goto L_0x0145
            T[] r1 = r10.f15638a
            r1 = r1[r2]
            o0.n r1 = (o0.n) r1
            long r3 = r1.f12068a
            o0.n r1 = new o0.n
            r1.<init>(r3)
            r3 = r36
            boolean r1 = r3.containsKey(r1)
            if (r1 != 0) goto L_0x0142
            r10.k(r2)
        L_0x0142:
            int r2 = r2 + -1
            goto L_0x0127
        L_0x0145:
            o0.j r1 = new o0.j
            java.util.Collection r2 = r8.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = gf.q.O0(r2)
            r3 = r38
            r1.<init>(r2, r3)
            int r4 = r2.size()
            r5 = r11
        L_0x015b:
            if (r5 >= r4) goto L_0x0170
            java.lang.Object r6 = r2.get(r5)
            r7 = r6
            o0.o r7 = (o0.o) r7
            long r7 = r7.f12069a
            boolean r7 = r3.a(r7)
            if (r7 == 0) goto L_0x016d
            goto L_0x0171
        L_0x016d:
            int r5 = r5 + 1
            goto L_0x015b
        L_0x0170:
            r6 = 0
        L_0x0171:
            o0.o r6 = (o0.o) r6
            r3 = 3
            if (r6 == 0) goto L_0x0207
            boolean r4 = r6.f12072d
            if (r39 != 0) goto L_0x017d
            r0.f12059h = r11
            goto L_0x01c1
        L_0x017d:
            boolean r5 = r0.f12059h
            if (r5 != 0) goto L_0x01c1
            if (r4 != 0) goto L_0x0187
            boolean r5 = r6.f12075g
            if (r5 == 0) goto L_0x01c1
        L_0x0187:
            s0.s0 r5 = r0.f12056e
            sf.j.c(r5)
            long r7 = r5.f12811c
            long r5 = r6.f12071c
            float r9 = h0.c.b(r5)
            float r5 = h0.c.c(r5)
            r6 = 32
            long r12 = r7 >> r6
            int r6 = (int) r12
            int r7 = f1.i.a(r7)
            r8 = 0
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x01b9
            float r6 = (float) r6
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x01b9
            int r6 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x01b9
            float r6 = (float) r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x01b5
            goto L_0x01b9
        L_0x01b5:
            r32 = r11
            r5 = 1
            goto L_0x01bc
        L_0x01b9:
            r5 = 1
            r32 = 1
        L_0x01bc:
            r6 = r32 ^ 1
            r0.f12059h = r6
            goto L_0x01c2
        L_0x01c1:
            r5 = 1
        L_0x01c2:
            boolean r6 = r0.f12059h
            boolean r7 = r0.f12058g
            r8 = 5
            r9 = 4
            if (r6 == r7) goto L_0x01e7
            int r10 = r1.f12063b
            if (r10 != r3) goto L_0x01d0
            r12 = r5
            goto L_0x01d1
        L_0x01d0:
            r12 = r11
        L_0x01d1:
            if (r12 != 0) goto L_0x01e1
            if (r10 != r9) goto L_0x01d7
            r12 = r5
            goto L_0x01d8
        L_0x01d7:
            r12 = r11
        L_0x01d8:
            if (r12 != 0) goto L_0x01e1
            if (r10 != r8) goto L_0x01de
            r10 = r5
            goto L_0x01df
        L_0x01de:
            r10 = r11
        L_0x01df:
            if (r10 == 0) goto L_0x01e7
        L_0x01e1:
            if (r6 == 0) goto L_0x01e4
            r8 = r9
        L_0x01e4:
            r1.f12063b = r8
            goto L_0x0208
        L_0x01e7:
            int r10 = r1.f12063b
            if (r10 != r9) goto L_0x01ed
            r9 = r5
            goto L_0x01ee
        L_0x01ed:
            r9 = r11
        L_0x01ee:
            if (r9 == 0) goto L_0x01f9
            if (r7 == 0) goto L_0x01f9
            boolean r7 = r0.f12060i
            if (r7 != 0) goto L_0x01f9
            r1.f12063b = r3
            goto L_0x0208
        L_0x01f9:
            if (r10 != r8) goto L_0x01fd
            r7 = r5
            goto L_0x01fe
        L_0x01fd:
            r7 = r11
        L_0x01fe:
            if (r7 == 0) goto L_0x0208
            if (r6 == 0) goto L_0x0208
            if (r4 == 0) goto L_0x0208
            r1.f12063b = r3
            goto L_0x0208
        L_0x0207:
            r5 = 1
        L_0x0208:
            if (r34 != 0) goto L_0x024d
            int r4 = r1.f12063b
            if (r4 != r3) goto L_0x0210
            r3 = r5
            goto L_0x0211
        L_0x0210:
            r3 = r11
        L_0x0211:
            if (r3 == 0) goto L_0x024d
            o0.j r3 = r0.f12057f
            if (r3 == 0) goto L_0x0247
            java.util.List<o0.o> r3 = r3.f12062a
            int r4 = r3.size()
            int r6 = r2.size()
            if (r4 == r6) goto L_0x0224
            goto L_0x0247
        L_0x0224:
            int r4 = r2.size()
            r6 = r11
        L_0x0229:
            if (r6 >= r4) goto L_0x0245
            java.lang.Object r7 = r3.get(r6)
            o0.o r7 = (o0.o) r7
            java.lang.Object r8 = r2.get(r6)
            o0.o r8 = (o0.o) r8
            long r9 = r7.f12071c
            long r7 = r8.f12071c
            boolean r7 = h0.c.a(r9, r7)
            if (r7 != 0) goto L_0x0242
            goto L_0x0247
        L_0x0242:
            int r6 = r6 + 1
            goto L_0x0229
        L_0x0245:
            r2 = r11
            goto L_0x0248
        L_0x0247:
            r2 = r5
        L_0x0248:
            if (r2 == 0) goto L_0x024b
            goto L_0x024d
        L_0x024b:
            r7 = r11
            goto L_0x024e
        L_0x024d:
            r7 = r5
        L_0x024e:
            r0.f12057f = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.h.a(java.util.Map, q0.h, o0.e, boolean):boolean");
    }

    public final void b(e eVar) {
        super.b(eVar);
        j jVar = this.f12057f;
        if (jVar != null) {
            this.f12058g = this.f12059h;
            List<o> list = jVar.f12062a;
            int size = list.size();
            boolean z10 = false;
            int i8 = 0;
            while (true) {
                boolean z11 = true;
                if (i8 >= size) {
                    break;
                }
                o oVar = list.get(i8);
                boolean z12 = oVar.f12072d;
                long j10 = oVar.f12069a;
                if (z12 || (eVar.a(j10) && this.f12059h)) {
                    z11 = false;
                }
                if (z11) {
                    this.f12054c.j(new n(j10));
                }
                i8++;
            }
            this.f12059h = false;
            if (jVar.f12063b == 5) {
                z10 = true;
            }
            this.f12060i = z10;
        }
    }

    public final void c() {
        d<h> dVar = this.f12061a;
        int i8 = dVar.f15640c;
        if (i8 > 0) {
            T[] tArr = dVar.f15638a;
            int i10 = 0;
            do {
                ((h) tArr[i10]).c();
                i10++;
            } while (i10 < i8);
        }
        this.f12053b.l();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(o0.e r7) {
        /*
            r6 = this;
            java.util.LinkedHashMap r0 = r6.f12055d
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            goto L_0x003c
        L_0x000a:
            s0.m1 r1 = r6.f12053b
            boolean r3 = s0.n1.a(r1)
            if (r3 != 0) goto L_0x0013
            goto L_0x003c
        L_0x0013:
            o0.j r3 = r6.f12057f
            sf.j.c(r3)
            s0.s0 r4 = r6.f12056e
            sf.j.c(r4)
            o0.k r4 = o0.k.f12066c
            r1.p(r3, r4)
            boolean r1 = s0.n1.a(r1)
            r3 = 1
            if (r1 == 0) goto L_0x003b
            u.d<o0.h> r1 = r6.f12061a
            int r4 = r1.f15640c
            if (r4 <= 0) goto L_0x003b
            T[] r1 = r1.f15638a
        L_0x0031:
            r5 = r1[r2]
            o0.h r5 = (o0.h) r5
            r5.d(r7)
            int r2 = r2 + r3
            if (r2 < r4) goto L_0x0031
        L_0x003b:
            r2 = r3
        L_0x003c:
            r6.b(r7)
            r0.clear()
            r7 = 0
            r6.f12056e = r7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.h.d(o0.e):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        r2 = r7.f12061a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.util.Map<o0.n, o0.o> r8, q0.h r9, o0.e r10, boolean r11) {
        /*
            r7 = this;
            java.lang.String r0 = "changes"
            sf.j.f(r8, r0)
            java.lang.String r8 = "parentCoordinates"
            sf.j.f(r9, r8)
            java.util.LinkedHashMap r8 = r7.f12055d
            boolean r9 = r8.isEmpty()
            r0 = 0
            if (r9 == 0) goto L_0x0014
            goto L_0x0056
        L_0x0014:
            s0.m1 r9 = r7.f12053b
            boolean r1 = s0.n1.a(r9)
            if (r1 != 0) goto L_0x001d
            goto L_0x0056
        L_0x001d:
            o0.j r1 = r7.f12057f
            sf.j.c(r1)
            s0.s0 r2 = r7.f12056e
            sf.j.c(r2)
            o0.k r2 = o0.k.f12064a
            r9.p(r1, r2)
            boolean r2 = s0.n1.a(r9)
            r3 = 1
            if (r2 == 0) goto L_0x004a
            u.d<o0.h> r2 = r7.f12061a
            int r4 = r2.f15640c
            if (r4 <= 0) goto L_0x004a
            T[] r2 = r2.f15638a
        L_0x003b:
            r5 = r2[r0]
            o0.h r5 = (o0.h) r5
            s0.s0 r6 = r7.f12056e
            sf.j.c(r6)
            r5.e(r8, r6, r10, r11)
            int r0 = r0 + r3
            if (r0 < r4) goto L_0x003b
        L_0x004a:
            boolean r8 = s0.n1.a(r9)
            if (r8 == 0) goto L_0x0055
            o0.k r8 = o0.k.f12065b
            r9.p(r1, r8)
        L_0x0055:
            r0 = r3
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.h.e(java.util.Map, q0.h, o0.e, boolean):boolean");
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f12053b + ", children=" + this.f12061a + ", pointerIds=" + this.f12054c + ')';
    }
}
