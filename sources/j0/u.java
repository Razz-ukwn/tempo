package j0;

import d2.f1;
import java.util.Arrays;
import rf.l;
import sf.j;
import sf.k;

public final class u extends c {

    /* renamed from: p  reason: collision with root package name */
    public static final o f9717p = new o(0);

    /* renamed from: d  reason: collision with root package name */
    public final w f9718d;

    /* renamed from: e  reason: collision with root package name */
    public final float f9719e;

    /* renamed from: f  reason: collision with root package name */
    public final float f9720f;

    /* renamed from: g  reason: collision with root package name */
    public final v f9721g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f9722h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f9723i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f9724j;

    /* renamed from: k  reason: collision with root package name */
    public final j f9725k;

    /* renamed from: l  reason: collision with root package name */
    public final m f9726l;
    public final j m;

    /* renamed from: n  reason: collision with root package name */
    public final n f9727n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f9728o;

    public static final class a {
        public static float a(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = (((((f12 * f15) + ((f11 * f14) + (f10 * f13))) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }
    }

    public static final class b extends k implements l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u f9729a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(u uVar) {
            super(1);
            this.f9729a = uVar;
        }

        public final Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            u uVar = this.f9729a;
            return Double.valueOf(uVar.m.e(f1.o(doubleValue, (double) uVar.f9719e, (double) uVar.f9720f)));
        }
    }

    public static final class c extends k implements l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u f9730a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(u uVar) {
            super(1);
            this.f9730a = uVar;
        }

        public final Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            u uVar = this.f9730a;
            return Double.valueOf(f1.o(uVar.f9725k.e(doubleValue), (double) uVar.f9719e, (double) uVar.f9720f));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(java.lang.String r32, float[] r33, j0.w r34, float[] r35, j0.j r36, j0.j r37, float r38, float r39, j0.v r40, int r41) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r8 = r39
            r9 = r41
            java.lang.String r10 = "name"
            sf.j.f(r1, r10)
            java.lang.String r10 = "primaries"
            sf.j.f(r2, r10)
            java.lang.String r10 = "oetf"
            sf.j.f(r5, r10)
            java.lang.String r10 = "eotf"
            sf.j.f(r6, r10)
            long r10 = j0.b.f9677a
            r0.<init>(r1, r10, r9)
            r0.f9718d = r3
            r0.f9719e = r7
            r0.f9720f = r8
            r1 = r40
            r0.f9721g = r1
            r0.f9725k = r5
            j0.u$c r1 = new j0.u$c
            r1.<init>(r0)
            j0.m r1 = new j0.m
            r10 = 0
            r1.<init>(r0, r10)
            r0.f9726l = r1
            r0.m = r6
            j0.u$b r1 = new j0.u$b
            r1.<init>(r0)
            j0.n r1 = new j0.n
            r1.<init>(r0, r10)
            r0.f9727n = r1
            int r1 = r2.length
            r11 = 6
            r12 = 9
            if (r1 == r11) goto L_0x0066
            int r1 = r2.length
            if (r1 != r12) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            r1.<init>(r2)
            throw r1
        L_0x0066:
            int r1 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0296
            float[] r1 = new float[r11]
            int r13 = r2.length
            r15 = 7
            r16 = 4
            r14 = 1
            r17 = 3
            r18 = 2
            r19 = 5
            if (r13 != r12) goto L_0x00b2
            r13 = r2[r10]
            r20 = r2[r14]
            float r21 = r13 + r20
            r22 = r2[r18]
            float r21 = r21 + r22
            float r13 = r13 / r21
            r1[r10] = r13
            float r20 = r20 / r21
            r1[r14] = r20
            r13 = r2[r17]
            r20 = r2[r16]
            float r21 = r13 + r20
            r22 = r2[r19]
            float r21 = r21 + r22
            float r13 = r13 / r21
            r1[r18] = r13
            float r20 = r20 / r21
            r1[r17] = r20
            r13 = r2[r11]
            r20 = r2[r15]
            float r21 = r13 + r20
            r22 = 8
            r2 = r2[r22]
            float r21 = r21 + r2
            float r13 = r13 / r21
            r1[r16] = r13
            float r20 = r20 / r21
            r1[r19] = r20
            goto L_0x00b5
        L_0x00b2:
            java.lang.System.arraycopy(r2, r10, r1, r10, r11)
        L_0x00b5:
            r0.f9722h = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x013d
            r4 = r1[r10]
            r13 = r1[r14]
            r20 = r1[r18]
            r21 = r1[r17]
            r22 = r1[r16]
            r23 = r1[r19]
            float r15 = (float) r14
            float r24 = r15 - r4
            float r24 = r24 / r13
            float r25 = r15 - r20
            float r25 = r25 / r21
            float r26 = r15 - r22
            float r26 = r26 / r23
            float r11 = r3.f9738a
            float r15 = r15 - r11
            float r14 = r3.f9739b
            float r15 = r15 / r14
            float r28 = r4 / r13
            float r29 = r20 / r21
            float r30 = r22 / r23
            float r11 = r11 / r14
            float r15 = r15 - r24
            float r29 = r29 - r28
            float r15 = r15 * r29
            float r11 = r11 - r28
            float r25 = r25 - r24
            float r14 = r11 * r25
            float r15 = r15 - r14
            float r26 = r26 - r24
            float r26 = r26 * r29
            float r30 = r30 - r28
            float r25 = r25 * r30
            float r26 = r26 - r25
            float r15 = r15 / r26
            float r30 = r30 * r15
            float r11 = r11 - r30
            float r11 = r11 / r29
            float r14 = r2 - r11
            float r14 = r14 - r15
            float r24 = r14 / r13
            float r25 = r11 / r21
            float r26 = r15 / r23
            float[] r12 = new float[r12]
            float r28 = r24 * r4
            r12[r10] = r28
            r27 = 1
            r12[r27] = r14
            float r4 = r2 - r4
            float r4 = r4 - r13
            float r4 = r4 * r24
            r12[r18] = r4
            float r4 = r25 * r20
            r12[r17] = r4
            r12[r16] = r11
            float r4 = r2 - r20
            float r4 = r4 - r21
            float r4 = r4 * r25
            r12[r19] = r4
            float r4 = r26 * r22
            r11 = 6
            r12[r11] = r4
            r4 = 7
            r12[r4] = r15
            float r4 = r2 - r22
            float r4 = r4 - r23
            float r4 = r4 * r26
            r11 = 8
            r12[r11] = r4
            r0.f9723i = r12
            goto L_0x0142
        L_0x013d:
            int r11 = r4.length
            if (r11 != r12) goto L_0x0281
            r0.f9723i = r4
        L_0x0142:
            float[] r4 = r0.f9723i
            float[] r4 = j0.d.d(r4)
            r0.f9724j = r4
            float r4 = j0.u.a.a(r1)
            float[] r11 = j0.g.f9686a
            float[] r11 = j0.g.f9687b
            float r11 = j0.u.a.a(r11)
            float r4 = r4 / r11
            r11 = 1063675494(0x3f666666, float:0.9)
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            r11 = 0
            if (r4 <= 0) goto L_0x01dc
            float[] r4 = j0.g.f9686a
            r12 = r1[r10]
            r13 = r4[r10]
            float r12 = r12 - r13
            r27 = 1
            r14 = r1[r27]
            r15 = r4[r27]
            float r14 = r14 - r15
            r20 = r1[r18]
            r18 = r4[r18]
            float r20 = r20 - r18
            r21 = r1[r17]
            r17 = r4[r17]
            float r21 = r21 - r17
            r22 = r1[r16]
            r16 = r4[r16]
            float r22 = r22 - r16
            r23 = r1[r19]
            r4 = r4[r19]
            float r23 = r23 - r4
            float r19 = r13 - r16
            float r24 = r15 - r4
            float r24 = r24 * r12
            float r19 = r19 * r14
            float r24 = r24 - r19
            int r19 = (r24 > r11 ? 1 : (r24 == r11 ? 0 : -1))
            if (r19 < 0) goto L_0x01da
            float r19 = r13 - r18
            float r24 = r15 - r17
            float r19 = r19 * r14
            float r24 = r24 * r12
            float r19 = r19 - r24
            int r12 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r12 >= 0) goto L_0x01a2
            goto L_0x01da
        L_0x01a2:
            float r12 = r18 - r13
            float r14 = r17 - r15
            float r14 = r14 * r20
            float r12 = r12 * r21
            float r14 = r14 - r12
            int r12 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r12 < 0) goto L_0x01da
            float r12 = r18 - r16
            float r14 = r17 - r4
            float r12 = r12 * r21
            float r14 = r14 * r20
            float r12 = r12 - r14
            int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r12 >= 0) goto L_0x01bd
            goto L_0x01da
        L_0x01bd:
            float r12 = r16 - r18
            float r14 = r4 - r17
            float r14 = r14 * r22
            float r12 = r12 * r23
            float r14 = r14 - r12
            int r12 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r12 < 0) goto L_0x01da
            float r16 = r16 - r13
            float r4 = r4 - r15
            float r16 = r16 * r23
            float r4 = r4 * r22
            float r16 = r16 - r4
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x01da
            r4 = r27
            goto L_0x01de
        L_0x01da:
            r4 = r10
            goto L_0x01de
        L_0x01dc:
            r27 = 1
        L_0x01de:
            if (r9 != 0) goto L_0x01e2
            goto L_0x027c
        L_0x01e2:
            float[] r4 = j0.g.f9686a
            if (r1 != r4) goto L_0x01e7
            goto L_0x020a
        L_0x01e7:
            r9 = r10
            r12 = 6
        L_0x01e9:
            if (r9 >= r12) goto L_0x020a
            r13 = r1[r9]
            r14 = r4[r9]
            int r13 = java.lang.Float.compare(r13, r14)
            if (r13 == 0) goto L_0x0207
            r13 = r1[r9]
            r14 = r4[r9]
            float r13 = r13 - r14
            float r13 = java.lang.Math.abs(r13)
            r14 = 981668463(0x3a83126f, float:0.001)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x0207
            r1 = r10
            goto L_0x020c
        L_0x0207:
            int r9 = r9 + 1
            goto L_0x01e9
        L_0x020a:
            r1 = r27
        L_0x020c:
            if (r1 != 0) goto L_0x0210
            goto L_0x027e
        L_0x0210:
            j0.w r1 = androidx.fragment.app.z0.f2179e
            boolean r1 = j0.d.c(r3, r1)
            if (r1 != 0) goto L_0x021a
            goto L_0x027e
        L_0x021a:
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0221
            r1 = r27
            goto L_0x0222
        L_0x0221:
            r1 = r10
        L_0x0222:
            if (r1 != 0) goto L_0x0225
            goto L_0x027e
        L_0x0225:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x022c
            r1 = r27
            goto L_0x022d
        L_0x022c:
            r1 = r10
        L_0x022d:
            if (r1 != 0) goto L_0x0230
            goto L_0x027e
        L_0x0230:
            float[] r1 = j0.g.f9686a
            j0.u r1 = j0.g.f9688c
            r2 = 0
        L_0x0236:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x027c
            j0.j r4 = r1.f9725k
            double r7 = r5.e(r2)
            double r11 = r4.e(r2)
            double r7 = r7 - r11
            double r7 = java.lang.Math.abs(r7)
            r11 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0257
            r4 = r27
            goto L_0x0258
        L_0x0257:
            r4 = r10
        L_0x0258:
            if (r4 != 0) goto L_0x025b
            goto L_0x027e
        L_0x025b:
            j0.j r4 = r1.m
            double r7 = r6.e(r2)
            double r13 = r4.e(r2)
            double r7 = r7 - r13
            double r7 = java.lang.Math.abs(r7)
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0271
            r4 = r27
            goto L_0x0272
        L_0x0271:
            r4 = r10
        L_0x0272:
            if (r4 != 0) goto L_0x0275
            goto L_0x027e
        L_0x0275:
            r7 = 4571171282956062736(0x3f70101010101010, double:0.00392156862745098)
            double r2 = r2 + r7
            goto L_0x0236
        L_0x027c:
            r10 = r27
        L_0x027e:
            r0.f9728o = r10
            return
        L_0x0281:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Transform must have 9 entries! Has "
            r2.<init>(r3)
            int r3 = r4.length
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0296:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid range: min="
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = ", max="
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = "; min must be strictly < max"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.u.<init>(java.lang.String, float[], j0.w, float[], j0.j, j0.j, float, float, j0.v, int):void");
    }

    public final float[] a(float[] fArr) {
        d.g(this.f9724j, fArr);
        m mVar = this.f9726l;
        fArr[0] = (float) mVar.e((double) fArr[0]);
        fArr[1] = (float) mVar.e((double) fArr[1]);
        fArr[2] = (float) mVar.e((double) fArr[2]);
        return fArr;
    }

    public final float b(int i8) {
        return this.f9720f;
    }

    public final float c(int i8) {
        return this.f9719e;
    }

    public final boolean d() {
        return this.f9728o;
    }

    public final long e(float f10, float f11, float f12) {
        double d10 = (double) f10;
        n nVar = this.f9727n;
        float e10 = (float) nVar.e(d10);
        float e11 = (float) nVar.e((double) f11);
        float e12 = (float) nVar.e((double) f12);
        float[] fArr = this.f9723i;
        return (((long) Float.floatToIntBits(d.h(fArr, e10, e11, e12))) << 32) | (((long) Float.floatToIntBits(d.i(fArr, e10, e11, e12))) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        u uVar = (u) obj;
        if (Float.compare(uVar.f9719e, this.f9719e) != 0 || Float.compare(uVar.f9720f, this.f9720f) != 0 || !j.a(this.f9718d, uVar.f9718d) || !Arrays.equals(this.f9722h, uVar.f9722h)) {
            return false;
        }
        v vVar = uVar.f9721g;
        v vVar2 = this.f9721g;
        if (vVar2 != null) {
            return j.a(vVar2, vVar);
        }
        if (vVar == null) {
            return true;
        }
        if (!j.a(this.f9725k, uVar.f9725k)) {
            return false;
        }
        return j.a(this.m, uVar.m);
    }

    public final float[] f(float[] fArr) {
        n nVar = this.f9727n;
        fArr[0] = (float) nVar.e((double) fArr[0]);
        fArr[1] = (float) nVar.e((double) fArr[1]);
        fArr[2] = (float) nVar.e((double) fArr[2]);
        d.g(this.f9723i, fArr);
        return fArr;
    }

    public final float g(float f10, float f11, float f12) {
        double d10 = (double) f10;
        n nVar = this.f9727n;
        return d.j(this.f9723i, (float) nVar.e(d10), (float) nVar.e((double) f11), (float) nVar.e((double) f12));
    }

    public final long h(float f10, float f11, float f12, float f13, c cVar) {
        j.f(cVar, "colorSpace");
        float[] fArr = this.f9724j;
        float h3 = d.h(fArr, f10, f11, f12);
        float i8 = d.i(fArr, f10, f11, f12);
        float j10 = d.j(fArr, f10, f11, f12);
        m mVar = this.f9726l;
        return androidx.databinding.a.e((float) mVar.e((double) h3), (float) mVar.e((double) i8), (float) mVar.e((double) j10), f13, cVar);
    }

    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f9722h) + ((this.f9718d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f9719e;
        boolean z10 = true;
        int i8 = 0;
        int floatToIntBits = (hashCode + (!((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f9720f;
        if (f11 != 0.0f) {
            z10 = false;
        }
        int floatToIntBits2 = (floatToIntBits + (!z10 ? Float.floatToIntBits(f11) : 0)) * 31;
        v vVar = this.f9721g;
        if (vVar != null) {
            i8 = vVar.hashCode();
        }
        int i10 = floatToIntBits2 + i8;
        if (vVar != null) {
            return i10;
        }
        return this.m.hashCode() + ((this.f9725k.hashCode() + (i10 * 31)) * 31);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(java.lang.String r12, float[] r13, j0.w r14, j0.v r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            r4 = 0
            double r0 = r9.f9736f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r5 = 1
            if (r0 != 0) goto L_0x000e
            r6 = r5
            goto L_0x000f
        L_0x000e:
            r6 = r1
        L_0x000f:
            double r7 = r9.f9737g
            if (r6 == 0) goto L_0x0022
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0019
            r6 = r5
            goto L_0x001a
        L_0x0019:
            r6 = r1
        L_0x001a:
            if (r6 == 0) goto L_0x0022
            j0.p r6 = new j0.p
            r6.<init>(r15, r1)
            goto L_0x0027
        L_0x0022:
            j0.q r6 = new j0.q
            r6.<init>(r15)
        L_0x0027:
            if (r0 != 0) goto L_0x002b
            r0 = r5
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x003b
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0033
            r1 = r5
        L_0x0033:
            if (r1 == 0) goto L_0x003b
            j0.m r0 = new j0.m
            r0.<init>(r15, r5)
            goto L_0x0040
        L_0x003b:
            j0.n r0 = new j0.n
            r0.<init>(r15, r5)
        L_0x0040:
            r7 = r0
            r8 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.u.<init>(java.lang.String, float[], j0.w, j0.v, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(java.lang.String r16, float[] r17, j0.w r18, double r19, float r21, float r22, int r23) {
        /*
            r15 = this;
            r1 = r19
            r11 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000d
            r5 = r3
            goto L_0x000e
        L_0x000d:
            r5 = r4
        L_0x000e:
            j0.o r6 = f9717p
            if (r5 == 0) goto L_0x0014
            r12 = r6
            goto L_0x001a
        L_0x0014:
            j0.r r5 = new j0.r
            r5.<init>(r1)
            r12 = r5
        L_0x001a:
            if (r0 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r3 = r4
        L_0x001e:
            if (r3 == 0) goto L_0x0022
            r13 = r6
            goto L_0x0028
        L_0x0022:
            j0.s r0 = new j0.s
            r0.<init>(r1)
            r13 = r0
        L_0x0028:
            j0.v r14 = new j0.v
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r0 = r14
            r1 = r19
            r0.<init>(r1, r3, r5, r7, r9)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r21
            r8 = r22
            r9 = r14
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.u.<init>(java.lang.String, float[], j0.w, double, float, float, int):void");
    }
}
