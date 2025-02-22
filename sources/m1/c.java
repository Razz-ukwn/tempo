package m1;

import java.util.ArrayList;
import java.util.Iterator;
import l1.d;
import l1.e;

public final class c extends p {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<p> f11132k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public int f11133l;

    public c(int i8, d dVar) {
        super(dVar);
        this.f11171f = i8;
        d dVar2 = this.f11167b;
        d n2 = dVar2.n(i8);
        while (n2 != null) {
            dVar2 = n2;
            n2 = n2.n(this.f11171f);
        }
        this.f11167b = dVar2;
        int i10 = this.f11171f;
        Object obj = i10 == 0 ? dVar2.f10846d : i10 == 1 ? dVar2.f10848e : null;
        ArrayList<p> arrayList = this.f11132k;
        arrayList.add(obj);
        d m = dVar2.m(this.f11171f);
        while (m != null) {
            int i11 = this.f11171f;
            arrayList.add(i11 == 0 ? m.f10846d : i11 == 1 ? m.f10848e : null);
            m = m.m(this.f11171f);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i12 = this.f11171f;
            if (i12 == 0) {
                next.f11167b.f10842b = this;
            } else if (i12 == 1) {
                next.f11167b.f10844c = this;
            }
        }
        if ((this.f11171f == 0 && ((e) this.f11167b.W).f10887x0) && arrayList.size() > 1) {
            this.f11167b = arrayList.get(arrayList.size() - 1).f11167b;
        }
        this.f11133l = this.f11171f == 0 ? this.f11167b.f10863l0 : this.f11167b.f10864m0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(m1.d r27) {
        /*
            r26 = this;
            r0 = r26
            m1.f r1 = r0.f11173h
            boolean r2 = r1.f11151j
            if (r2 == 0) goto L_0x03c3
            m1.f r2 = r0.f11174i
            boolean r3 = r2.f11151j
            if (r3 != 0) goto L_0x0010
            goto L_0x03c3
        L_0x0010:
            l1.d r3 = r0.f11167b
            l1.d r3 = r3.W
            boolean r4 = r3 instanceof l1.e
            if (r4 == 0) goto L_0x001d
            l1.e r3 = (l1.e) r3
            boolean r3 = r3.f10887x0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r4 = r2.f11148g
            int r6 = r1.f11148g
            int r4 = r4 - r6
            java.util.ArrayList<m1.p> r6 = r0.f11132k
            int r7 = r6.size()
            r8 = 0
        L_0x002a:
            r9 = -1
            r10 = 8
            if (r8 >= r7) goto L_0x003e
            java.lang.Object r11 = r6.get(r8)
            m1.p r11 = (m1.p) r11
            l1.d r11 = r11.f11167b
            int r11 = r11.f10859j0
            if (r11 != r10) goto L_0x003f
            int r8 = r8 + 1
            goto L_0x002a
        L_0x003e:
            r8 = r9
        L_0x003f:
            int r11 = r7 + -1
            r12 = r11
        L_0x0042:
            if (r12 < 0) goto L_0x0054
            java.lang.Object r13 = r6.get(r12)
            m1.p r13 = (m1.p) r13
            l1.d r13 = r13.f11167b
            int r13 = r13.f10859j0
            if (r13 != r10) goto L_0x0053
            int r12 = r12 + -1
            goto L_0x0042
        L_0x0053:
            r9 = r12
        L_0x0054:
            r12 = 0
        L_0x0055:
            r14 = 2
            if (r12 >= r14) goto L_0x0107
            r13 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0060:
            if (r14 >= r7) goto L_0x00ef
            java.lang.Object r20 = r6.get(r14)
            r15 = r20
            m1.p r15 = (m1.p) r15
            l1.d r5 = r15.f11167b
            r21 = r6
            int r6 = r5.f10859j0
            if (r6 != r10) goto L_0x0076
            r23 = r8
            goto L_0x00e5
        L_0x0076:
            int r18 = r18 + 1
            if (r14 <= 0) goto L_0x0081
            if (r14 < r8) goto L_0x0081
            m1.f r6 = r15.f11173h
            int r6 = r6.f11147f
            int r13 = r13 + r6
        L_0x0081:
            m1.g r6 = r15.f11170e
            int r10 = r6.f11148g
            r22 = r10
            int r10 = r15.f11169d
            r23 = r8
            r8 = 3
            if (r10 == r8) goto L_0x0090
            r8 = 1
            goto L_0x0091
        L_0x0090:
            r8 = 0
        L_0x0091:
            if (r8 == 0) goto L_0x00af
            int r6 = r0.f11171f
            if (r6 != 0) goto L_0x00a0
            m1.l r10 = r5.f10846d
            m1.g r10 = r10.f11170e
            boolean r10 = r10.f11151j
            if (r10 != 0) goto L_0x00a0
            return
        L_0x00a0:
            r10 = 1
            if (r6 != r10) goto L_0x00ac
            m1.n r6 = r5.f10848e
            m1.g r6 = r6.f11170e
            boolean r6 = r6.f11151j
            if (r6 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r24 = r8
            goto L_0x00c6
        L_0x00af:
            r24 = r8
            r10 = 1
            int r8 = r15.f11166a
            if (r8 != r10) goto L_0x00bd
            if (r12 != 0) goto L_0x00bd
            int r10 = r6.m
            int r17 = r17 + 1
            goto L_0x00c3
        L_0x00bd:
            boolean r6 = r6.f11151j
            if (r6 == 0) goto L_0x00c6
            r10 = r22
        L_0x00c3:
            r24 = 1
            goto L_0x00c8
        L_0x00c6:
            r10 = r22
        L_0x00c8:
            if (r24 != 0) goto L_0x00da
            int r17 = r17 + 1
            float[] r5 = r5.f10866n0
            int r6 = r0.f11171f
            r5 = r5[r6]
            r6 = 0
            int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00db
            float r19 = r19 + r5
            goto L_0x00db
        L_0x00da:
            int r13 = r13 + r10
        L_0x00db:
            if (r14 >= r11) goto L_0x00e5
            if (r14 >= r9) goto L_0x00e5
            m1.f r5 = r15.f11174i
            int r5 = r5.f11147f
            int r5 = -r5
            int r13 = r13 + r5
        L_0x00e5:
            int r14 = r14 + 1
            r6 = r21
            r8 = r23
            r10 = 8
            goto L_0x0060
        L_0x00ef:
            r21 = r6
            r23 = r8
            if (r13 < r4) goto L_0x0102
            if (r17 != 0) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            int r12 = r12 + 1
            r6 = r21
            r8 = r23
            r10 = 8
            goto L_0x0055
        L_0x0102:
            r5 = r17
            r6 = r18
            goto L_0x0110
        L_0x0107:
            r21 = r6
            r23 = r8
            r5 = 0
            r6 = 0
            r13 = 0
            r19 = 0
        L_0x0110:
            int r1 = r1.f11148g
            if (r3 == 0) goto L_0x0116
            int r1 = r2.f11148g
        L_0x0116:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r13 <= r4) goto L_0x0127
            r8 = 1073741824(0x40000000, float:2.0)
            int r10 = r13 - r4
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r10 + r2
            int r8 = (int) r10
            if (r3 == 0) goto L_0x0126
            int r1 = r1 + r8
            goto L_0x0127
        L_0x0126:
            int r1 = r1 - r8
        L_0x0127:
            if (r5 <= 0) goto L_0x020b
            int r8 = r4 - r13
            float r8 = (float) r8
            float r10 = (float) r5
            float r10 = r8 / r10
            float r10 = r10 + r2
            int r10 = (int) r10
            r12 = 0
            r14 = 0
        L_0x0133:
            if (r12 >= r7) goto L_0x01b7
            r15 = r21
            java.lang.Object r17 = r15.get(r12)
            r2 = r17
            m1.p r2 = (m1.p) r2
            r17 = r10
            l1.d r10 = r2.f11167b
            r21 = r13
            int r13 = r10.f10859j0
            r22 = r1
            r1 = 8
            if (r13 != r1) goto L_0x014e
            goto L_0x01a1
        L_0x014e:
            int r1 = r2.f11169d
            r13 = 3
            if (r1 != r13) goto L_0x01a1
            m1.g r1 = r2.f11170e
            boolean r13 = r1.f11151j
            if (r13 != 0) goto L_0x01a1
            r13 = 0
            int r16 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r16 <= 0) goto L_0x016e
            float[] r13 = r10.f10866n0
            r24 = r3
            int r3 = r0.f11171f
            r3 = r13[r3]
            float r3 = r3 * r8
            float r3 = r3 / r19
            r13 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r13
            int r3 = (int) r3
            goto L_0x0172
        L_0x016e:
            r24 = r3
            r3 = r17
        L_0x0172:
            int r13 = r0.f11171f
            if (r13 != 0) goto L_0x017b
            int r13 = r10.f10879w
            int r10 = r10.f10878v
            goto L_0x017f
        L_0x017b:
            int r13 = r10.f10882z
            int r10 = r10.f10881y
        L_0x017f:
            int r2 = r2.f11166a
            r25 = r8
            r8 = 1
            if (r2 != r8) goto L_0x018d
            int r2 = r1.m
            int r2 = java.lang.Math.min(r3, r2)
            goto L_0x018e
        L_0x018d:
            r2 = r3
        L_0x018e:
            int r2 = java.lang.Math.max(r10, r2)
            if (r13 <= 0) goto L_0x0198
            int r2 = java.lang.Math.min(r13, r2)
        L_0x0198:
            if (r2 == r3) goto L_0x019d
            int r14 = r14 + 1
            r3 = r2
        L_0x019d:
            r1.d(r3)
            goto L_0x01a5
        L_0x01a1:
            r24 = r3
            r25 = r8
        L_0x01a5:
            int r12 = r12 + 1
            r10 = r17
            r13 = r21
            r1 = r22
            r3 = r24
            r8 = r25
            r2 = 1056964608(0x3f000000, float:0.5)
            r21 = r15
            goto L_0x0133
        L_0x01b7:
            r22 = r1
            r24 = r3
            r15 = r21
            r21 = r13
            if (r14 <= 0) goto L_0x01fa
            int r5 = r5 - r14
            r1 = 0
            r2 = 0
        L_0x01c4:
            if (r1 >= r7) goto L_0x01f6
            java.lang.Object r3 = r15.get(r1)
            m1.p r3 = (m1.p) r3
            l1.d r8 = r3.f11167b
            int r8 = r8.f10859j0
            r10 = 8
            if (r8 != r10) goto L_0x01d7
            r8 = r23
            goto L_0x01f1
        L_0x01d7:
            r8 = r23
            if (r1 <= 0) goto L_0x01e2
            if (r1 < r8) goto L_0x01e2
            m1.f r10 = r3.f11173h
            int r10 = r10.f11147f
            int r2 = r2 + r10
        L_0x01e2:
            m1.g r10 = r3.f11170e
            int r10 = r10.f11148g
            int r2 = r2 + r10
            if (r1 >= r11) goto L_0x01f1
            if (r1 >= r9) goto L_0x01f1
            m1.f r3 = r3.f11174i
            int r3 = r3.f11147f
            int r3 = -r3
            int r2 = r2 + r3
        L_0x01f1:
            int r1 = r1 + 1
            r23 = r8
            goto L_0x01c4
        L_0x01f6:
            r8 = r23
            r13 = r2
            goto L_0x01fe
        L_0x01fa:
            r8 = r23
            r13 = r21
        L_0x01fe:
            int r1 = r0.f11133l
            r2 = 2
            if (r1 != r2) goto L_0x0209
            if (r14 != 0) goto L_0x0209
            r1 = 0
            r0.f11133l = r1
            goto L_0x0217
        L_0x0209:
            r1 = 0
            goto L_0x0217
        L_0x020b:
            r22 = r1
            r24 = r3
            r15 = r21
            r8 = r23
            r1 = 0
            r2 = 2
            r21 = r13
        L_0x0217:
            if (r13 <= r4) goto L_0x021b
            r0.f11133l = r2
        L_0x021b:
            if (r6 <= 0) goto L_0x0223
            if (r5 != 0) goto L_0x0223
            if (r8 != r9) goto L_0x0223
            r0.f11133l = r2
        L_0x0223:
            int r2 = r0.f11133l
            r3 = 1
            if (r2 != r3) goto L_0x02ae
            if (r6 <= r3) goto L_0x022e
            int r4 = r4 - r13
            int r6 = r6 - r3
            int r4 = r4 / r6
            goto L_0x0235
        L_0x022e:
            if (r6 != r3) goto L_0x0234
            int r4 = r4 - r13
            r2 = 2
            int r4 = r4 / r2
            goto L_0x0235
        L_0x0234:
            r4 = r1
        L_0x0235:
            if (r5 <= 0) goto L_0x0238
            r4 = r1
        L_0x0238:
            r5 = r1
            r1 = r22
        L_0x023b:
            if (r5 >= r7) goto L_0x03c3
            if (r24 == 0) goto L_0x0244
            int r2 = r5 + 1
            int r2 = r7 - r2
            goto L_0x0245
        L_0x0244:
            r2 = r5
        L_0x0245:
            java.lang.Object r2 = r15.get(r2)
            m1.p r2 = (m1.p) r2
            l1.d r3 = r2.f11167b
            int r3 = r3.f10859j0
            m1.f r6 = r2.f11174i
            m1.f r10 = r2.f11173h
            r12 = 8
            if (r3 != r12) goto L_0x025e
            r10.d(r1)
            r6.d(r1)
            goto L_0x02ab
        L_0x025e:
            if (r5 <= 0) goto L_0x0265
            if (r24 == 0) goto L_0x0264
            int r1 = r1 - r4
            goto L_0x0265
        L_0x0264:
            int r1 = r1 + r4
        L_0x0265:
            if (r5 <= 0) goto L_0x0272
            if (r5 < r8) goto L_0x0272
            if (r24 == 0) goto L_0x026f
            int r3 = r10.f11147f
            int r1 = r1 - r3
            goto L_0x0272
        L_0x026f:
            int r3 = r10.f11147f
            int r1 = r1 + r3
        L_0x0272:
            if (r24 == 0) goto L_0x0278
            r6.d(r1)
            goto L_0x027b
        L_0x0278:
            r10.d(r1)
        L_0x027b:
            m1.g r3 = r2.f11170e
            int r12 = r3.f11148g
            int r13 = r2.f11169d
            r14 = 3
            if (r13 != r14) goto L_0x028b
            int r13 = r2.f11166a
            r14 = 1
            if (r13 != r14) goto L_0x028b
            int r12 = r3.m
        L_0x028b:
            if (r24 == 0) goto L_0x028f
            int r1 = r1 - r12
            goto L_0x0290
        L_0x028f:
            int r1 = r1 + r12
        L_0x0290:
            if (r24 == 0) goto L_0x0296
            r10.d(r1)
            goto L_0x0299
        L_0x0296:
            r6.d(r1)
        L_0x0299:
            r3 = 1
            r2.f11172g = r3
            if (r5 >= r11) goto L_0x02ab
            if (r5 >= r9) goto L_0x02ab
            if (r24 == 0) goto L_0x02a7
            int r2 = r6.f11147f
            int r2 = -r2
            int r1 = r1 - r2
            goto L_0x02ab
        L_0x02a7:
            int r2 = r6.f11147f
            int r2 = -r2
            int r1 = r1 + r2
        L_0x02ab:
            int r5 = r5 + 1
            goto L_0x023b
        L_0x02ae:
            if (r2 != 0) goto L_0x032c
            int r4 = r4 - r13
            r2 = 1
            int r6 = r6 + r2
            int r4 = r4 / r6
            if (r5 <= 0) goto L_0x02b7
            r4 = r1
        L_0x02b7:
            r5 = r1
            r1 = r22
        L_0x02ba:
            if (r5 >= r7) goto L_0x03c3
            if (r24 == 0) goto L_0x02c3
            int r2 = r5 + 1
            int r2 = r7 - r2
            goto L_0x02c4
        L_0x02c3:
            r2 = r5
        L_0x02c4:
            java.lang.Object r2 = r15.get(r2)
            m1.p r2 = (m1.p) r2
            l1.d r3 = r2.f11167b
            int r3 = r3.f10859j0
            m1.f r6 = r2.f11174i
            m1.f r10 = r2.f11173h
            r12 = 8
            if (r3 != r12) goto L_0x02dd
            r10.d(r1)
            r6.d(r1)
            goto L_0x0329
        L_0x02dd:
            if (r24 == 0) goto L_0x02e1
            int r1 = r1 - r4
            goto L_0x02e2
        L_0x02e1:
            int r1 = r1 + r4
        L_0x02e2:
            if (r5 <= 0) goto L_0x02ef
            if (r5 < r8) goto L_0x02ef
            if (r24 == 0) goto L_0x02ec
            int r3 = r10.f11147f
            int r1 = r1 - r3
            goto L_0x02ef
        L_0x02ec:
            int r3 = r10.f11147f
            int r1 = r1 + r3
        L_0x02ef:
            if (r24 == 0) goto L_0x02f5
            r6.d(r1)
            goto L_0x02f8
        L_0x02f5:
            r10.d(r1)
        L_0x02f8:
            m1.g r3 = r2.f11170e
            int r12 = r3.f11148g
            int r13 = r2.f11169d
            r14 = 3
            if (r13 != r14) goto L_0x030c
            int r2 = r2.f11166a
            r13 = 1
            if (r2 != r13) goto L_0x030c
            int r2 = r3.m
            int r12 = java.lang.Math.min(r12, r2)
        L_0x030c:
            if (r24 == 0) goto L_0x0310
            int r1 = r1 - r12
            goto L_0x0311
        L_0x0310:
            int r1 = r1 + r12
        L_0x0311:
            if (r24 == 0) goto L_0x0317
            r10.d(r1)
            goto L_0x031a
        L_0x0317:
            r6.d(r1)
        L_0x031a:
            if (r5 >= r11) goto L_0x0329
            if (r5 >= r9) goto L_0x0329
            if (r24 == 0) goto L_0x0325
            int r2 = r6.f11147f
            int r2 = -r2
            int r1 = r1 - r2
            goto L_0x0329
        L_0x0325:
            int r2 = r6.f11147f
            int r2 = -r2
            int r1 = r1 + r2
        L_0x0329:
            int r5 = r5 + 1
            goto L_0x02ba
        L_0x032c:
            r3 = 2
            if (r2 != r3) goto L_0x03c3
            int r2 = r0.f11171f
            if (r2 != 0) goto L_0x0338
            l1.d r2 = r0.f11167b
            float r2 = r2.f10853g0
            goto L_0x033c
        L_0x0338:
            l1.d r2 = r0.f11167b
            float r2 = r2.f10855h0
        L_0x033c:
            if (r24 == 0) goto L_0x0342
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 - r2
        L_0x0342:
            int r4 = r4 - r13
            float r3 = (float) r4
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x034d
            if (r5 <= 0) goto L_0x034e
        L_0x034d:
            r2 = r1
        L_0x034e:
            if (r24 == 0) goto L_0x0353
            int r2 = r22 - r2
            goto L_0x0355
        L_0x0353:
            int r2 = r22 + r2
        L_0x0355:
            r5 = r1
        L_0x0356:
            if (r5 >= r7) goto L_0x03c3
            if (r24 == 0) goto L_0x035f
            int r1 = r5 + 1
            int r1 = r7 - r1
            goto L_0x0360
        L_0x035f:
            r1 = r5
        L_0x0360:
            java.lang.Object r1 = r15.get(r1)
            m1.p r1 = (m1.p) r1
            l1.d r3 = r1.f11167b
            int r3 = r3.f10859j0
            m1.f r4 = r1.f11174i
            m1.f r6 = r1.f11173h
            r10 = 8
            if (r3 != r10) goto L_0x037b
            r6.d(r2)
            r4.d(r2)
            r13 = 1
            r14 = 3
            goto L_0x03c0
        L_0x037b:
            if (r5 <= 0) goto L_0x0388
            if (r5 < r8) goto L_0x0388
            if (r24 == 0) goto L_0x0385
            int r3 = r6.f11147f
            int r2 = r2 - r3
            goto L_0x0388
        L_0x0385:
            int r3 = r6.f11147f
            int r2 = r2 + r3
        L_0x0388:
            if (r24 == 0) goto L_0x038e
            r4.d(r2)
            goto L_0x0391
        L_0x038e:
            r6.d(r2)
        L_0x0391:
            m1.g r3 = r1.f11170e
            int r12 = r3.f11148g
            int r13 = r1.f11169d
            r14 = 3
            if (r13 != r14) goto L_0x03a2
            int r1 = r1.f11166a
            r13 = 1
            if (r1 != r13) goto L_0x03a3
            int r12 = r3.m
            goto L_0x03a3
        L_0x03a2:
            r13 = 1
        L_0x03a3:
            if (r24 == 0) goto L_0x03a7
            int r2 = r2 - r12
            goto L_0x03a8
        L_0x03a7:
            int r2 = r2 + r12
        L_0x03a8:
            if (r24 == 0) goto L_0x03ae
            r6.d(r2)
            goto L_0x03b1
        L_0x03ae:
            r4.d(r2)
        L_0x03b1:
            if (r5 >= r11) goto L_0x03c0
            if (r5 >= r9) goto L_0x03c0
            if (r24 == 0) goto L_0x03bc
            int r1 = r4.f11147f
            int r1 = -r1
            int r2 = r2 - r1
            goto L_0x03c0
        L_0x03bc:
            int r1 = r4.f11147f
            int r1 = -r1
            int r2 = r2 + r1
        L_0x03c0:
            int r5 = r5 + 1
            goto L_0x0356
        L_0x03c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.c.a(m1.d):void");
    }

    public final void d() {
        ArrayList<p> arrayList = this.f11132k;
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size >= 1) {
            d dVar = arrayList.get(0).f11167b;
            d dVar2 = arrayList.get(size - 1).f11167b;
            int i8 = this.f11171f;
            f fVar = this.f11174i;
            f fVar2 = this.f11173h;
            if (i8 == 0) {
                l1.c cVar = dVar.K;
                l1.c cVar2 = dVar2.M;
                f i10 = p.i(cVar, 0);
                int e10 = cVar.e();
                d m = m();
                if (m != null) {
                    e10 = m.K.e();
                }
                if (i10 != null) {
                    p.b(fVar2, i10, e10);
                }
                f i11 = p.i(cVar2, 0);
                int e11 = cVar2.e();
                d n2 = n();
                if (n2 != null) {
                    e11 = n2.M.e();
                }
                if (i11 != null) {
                    p.b(fVar, i11, -e11);
                }
            } else {
                l1.c cVar3 = dVar.L;
                l1.c cVar4 = dVar2.N;
                f i12 = p.i(cVar3, 1);
                int e12 = cVar3.e();
                d m10 = m();
                if (m10 != null) {
                    e12 = m10.L.e();
                }
                if (i12 != null) {
                    p.b(fVar2, i12, e12);
                }
                f i13 = p.i(cVar4, 1);
                int e13 = cVar4.e();
                d n10 = n();
                if (n10 != null) {
                    e13 = n10.N.e();
                }
                if (i13 != null) {
                    p.b(fVar, i13, -e13);
                }
            }
            fVar2.f11142a = this;
            fVar.f11142a = this;
        }
    }

    public final void e() {
        int i8 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f11132k;
            if (i8 < arrayList.size()) {
                arrayList.get(i8).e();
                i8++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        this.f11168c = null;
        Iterator<p> it = this.f11132k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public final long j() {
        ArrayList<p> arrayList = this.f11132k;
        int size = arrayList.size();
        long j10 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            p pVar = arrayList.get(i8);
            j10 = ((long) pVar.f11174i.f11147f) + pVar.j() + j10 + ((long) pVar.f11173h.f11147f);
        }
        return j10;
    }

    public final boolean k() {
        ArrayList<p> arrayList = this.f11132k;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!arrayList.get(i8).k()) {
                return false;
            }
        }
        return true;
    }

    public final d m() {
        int i8 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f11132k;
            if (i8 >= arrayList.size()) {
                return null;
            }
            d dVar = arrayList.get(i8).f11167b;
            if (dVar.f10859j0 != 8) {
                return dVar;
            }
            i8++;
        }
    }

    public final d n() {
        ArrayList<p> arrayList = this.f11132k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = arrayList.get(size).f11167b;
            if (dVar.f10859j0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f11171f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f11132k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
