package u1;

import android.util.TypedValue;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f15654a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.b.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r33, android.content.res.XmlResourceParser r34, android.util.AttributeSet r35, android.content.res.Resources.Theme r36) {
        /*
            r0 = r33
            r1 = r35
            r2 = r36
            java.lang.String r3 = r34.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x034e
            int r3 = r34.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L_0x0020:
            int r9 = r34.next()
            if (r9 == r4) goto L_0x033d
            int r10 = r34.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x033d
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x032c
            if (r10 > r3) goto L_0x032c
            java.lang.String r9 = r34.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x032c
        L_0x0042:
            int[] r9 = androidx.compose.ui.platform.b3.C
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = 31
            r15 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r10) goto L_0x0092
            java.lang.ThreadLocal<android.util.TypedValue> r10 = f15654a
            java.lang.Object r16 = r10.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L_0x006e
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r10.set(r12)
            goto L_0x0070
        L_0x006e:
            r12 = r16
        L_0x0070:
            r0.getValue(r13, r12, r4)
            int r10 = r12.type
            r12 = 28
            if (r10 < r12) goto L_0x007d
            if (r10 > r14) goto L_0x007d
            r10 = r4
            goto L_0x007e
        L_0x007d:
            r10 = r7
        L_0x007e:
            if (r10 != 0) goto L_0x0092
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008d }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008d }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008d }
            goto L_0x0096
        L_0x008d:
            int r10 = r9.getColor(r7, r15)
            goto L_0x0096
        L_0x0092:
            int r10 = r9.getColor(r7, r15)
        L_0x0096:
            boolean r12 = r9.hasValue(r4)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x00a3
            float r11 = r9.getFloat(r4, r13)
            goto L_0x00af
        L_0x00a3:
            boolean r12 = r9.hasValue(r11)
            if (r12 == 0) goto L_0x00ae
            float r11 = r9.getFloat(r11, r13)
            goto L_0x00af
        L_0x00ae:
            r11 = r13
        L_0x00af:
            int r12 = android.os.Build.VERSION.SDK_INT
            r15 = 4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r14) goto L_0x00c2
            r12 = 2
            boolean r14 = r9.hasValue(r12)
            if (r14 == 0) goto L_0x00c2
            float r4 = r9.getFloat(r12, r4)
            goto L_0x00c6
        L_0x00c2:
            float r4 = r9.getFloat(r15, r4)
        L_0x00c6:
            r9.recycle()
            int r9 = r35.getAttributeCount()
            int[] r12 = new int[r9]
            r14 = r7
            r15 = r14
        L_0x00d1:
            if (r14 >= r9) goto L_0x0101
            int r13 = r1.getAttributeNameResource(r14)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r13 == r7) goto L_0x00f9
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r13 == r7) goto L_0x00f9
            r7 = 2130903091(0x7f030033, float:1.741299E38)
            if (r13 == r7) goto L_0x00f9
            r7 = 2130903769(0x7f0302d9, float:1.7414365E38)
            if (r13 == r7) goto L_0x00f9
            int r7 = r15 + 1
            r0 = 0
            boolean r19 = r1.getAttributeBooleanValue(r14, r0)
            if (r19 == 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            int r13 = -r13
        L_0x00f6:
            r12[r15] = r13
            r15 = r7
        L_0x00f9:
            int r14 = r14 + 1
            r0 = r33
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00d1
        L_0x0101:
            int[] r0 = android.util.StateSet.trimStateSet(r12, r15)
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r12 = 1120403456(0x42c80000, float:100.0)
            if (r9 < 0) goto L_0x0112
            int r9 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r9 > 0) goto L_0x0112
            r9 = 1
            goto L_0x0113
        L_0x0112:
            r9 = 0
        L_0x0113:
            r13 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 != 0) goto L_0x0122
            if (r9 != 0) goto L_0x0122
            r7 = r0
            r28 = r3
            r16 = 1
            goto L_0x02e7
        L_0x0122:
            int r13 = android.graphics.Color.alpha(r10)
            float r13 = (float) r13
            float r13 = r13 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r11
            int r11 = (int) r13
            r13 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = b7.a.r(r11, r14, r13)
            if (r9 == 0) goto L_0x02da
            u1.a r9 = u1.a.a(r10)
            u1.l r10 = u1.l.f15687k
            float r13 = r9.f15649b
            double r14 = (double) r13
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 < 0) goto L_0x02d0
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r19 = 0
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 <= 0) goto L_0x02d0
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 < 0) goto L_0x015c
            goto L_0x02d0
        L_0x015c:
            float r9 = r9.f15648a
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 >= 0) goto L_0x0164
            r9 = r7
            goto L_0x016a
        L_0x0164:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r9 = java.lang.Math.min(r14, r9)
        L_0x016a:
            r20 = r7
            r15 = r13
            r14 = 0
            r19 = 1
        L_0x0170:
            float r21 = r20 - r13
            float r21 = java.lang.Math.abs(r21)
            r22 = 1053609165(0x3ecccccd, float:0.4)
            int r21 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r21 < 0) goto L_0x02bf
            r21 = 1148846080(0x447a0000, float:1000.0)
            r23 = r7
            r24 = r12
            r22 = r21
            r25 = 0
        L_0x0187:
            float r26 = r23 - r24
            float r26 = java.lang.Math.abs(r26)
            r27 = 1008981770(0x3c23d70a, float:0.01)
            int r26 = (r26 > r27 ? 1 : (r26 == r27 ? 0 : -1))
            r27 = 1073741824(0x40000000, float:2.0)
            if (r26 <= 0) goto L_0x027b
            float r26 = r24 - r23
            float r26 = r26 / r27
            float r7 = r26 + r23
            u1.a r12 = u1.a.b(r7, r15, r9)
            u1.l r1 = u1.l.f15687k
            int r1 = r12.c(r1)
            int r12 = android.graphics.Color.red(r1)
            float r12 = androidx.databinding.a.i(r12)
            int r28 = android.graphics.Color.green(r1)
            float r28 = androidx.databinding.a.i(r28)
            int r29 = android.graphics.Color.blue(r1)
            float r29 = androidx.databinding.a.i(r29)
            float[][] r30 = androidx.databinding.a.C
            r16 = 1
            r30 = r30[r16]
            r18 = 0
            r31 = r30[r18]
            float r12 = r12 * r31
            r31 = r30[r16]
            float r28 = r28 * r31
            float r28 = r28 + r12
            r12 = 2
            r17 = r30[r12]
            float r29 = r29 * r17
            float r29 = r29 + r28
            r17 = 1120403456(0x42c80000, float:100.0)
            float r12 = r29 / r17
            r28 = 1007753895(0x3c111aa7, float:0.008856452)
            int r28 = (r12 > r28 ? 1 : (r12 == r28 ? 0 : -1))
            if (r28 > 0) goto L_0x01ea
            r28 = 1147261687(0x4461d2f7, float:903.2963)
            float r12 = r12 * r28
            r28 = r3
            goto L_0x01f9
        L_0x01ea:
            r28 = r3
            double r2 = (double) r12
            double r2 = java.lang.Math.cbrt(r2)
            float r2 = (float) r2
            r3 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r3
            r3 = 1098907648(0x41800000, float:16.0)
            float r12 = r2 - r3
        L_0x01f9:
            float r2 = r4 - r12
            float r2 = java.lang.Math.abs(r2)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0250
            u1.a r1 = u1.a.a(r1)
            float r3 = r1.f15650c
            r29 = r2
            float r2 = r1.f15649b
            u1.a r2 = u1.a.b(r3, r2, r9)
            float r3 = r2.f15651d
            r30 = r7
            float r7 = r1.f15651d
            float r7 = r7 - r3
            float r3 = r1.f15652e
            r31 = r9
            float r9 = r2.f15652e
            float r3 = r3 - r9
            float r9 = r1.f15653f
            float r2 = r2.f15653f
            float r9 = r9 - r2
            float r7 = r7 * r7
            float r3 = r3 * r3
            float r3 = r3 + r7
            float r9 = r9 * r9
            float r9 = r9 + r3
            double r2 = (double) r9
            double r2 = java.lang.Math.sqrt(r2)
            r7 = r0
            r9 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r2, r0)
            r2 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r2
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x0257
            r22 = r0
            r25 = r9
            r21 = r29
            goto L_0x0257
        L_0x0250:
            r30 = r7
            r31 = r9
            r1 = 1065353216(0x3f800000, float:1.0)
            r7 = r0
        L_0x0257:
            r0 = 0
            int r2 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0261
            int r2 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0261
            goto L_0x028a
        L_0x0261:
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0268
            r23 = r30
            goto L_0x026a
        L_0x0268:
            r24 = r30
        L_0x026a:
            r1 = r35
            r2 = r36
            r12 = r17
            r3 = r28
            r9 = r31
            r32 = r7
            r7 = r0
            r0 = r32
            goto L_0x0187
        L_0x027b:
            r28 = r3
            r31 = r9
            r17 = r12
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r32 = r7
            r7 = r0
            r0 = r32
        L_0x028a:
            r2 = r25
            if (r19 == 0) goto L_0x029f
            if (r2 == 0) goto L_0x0295
            int r10 = r2.c(r10)
            goto L_0x02df
        L_0x0295:
            float r2 = r13 - r20
            float r2 = r2 / r27
            float r2 = r2 + r20
            r15 = r2
            r19 = 0
            goto L_0x02ae
        L_0x029f:
            if (r2 != 0) goto L_0x02a5
            r13 = r15
            r15 = r20
            goto L_0x02a6
        L_0x02a5:
            r14 = r2
        L_0x02a6:
            float r2 = r13 - r15
            float r2 = r2 / r27
            float r2 = r2 + r15
            r20 = r15
            r15 = r2
        L_0x02ae:
            r1 = r35
            r2 = r36
            r12 = r17
            r3 = r28
            r9 = r31
            r32 = r7
            r7 = r0
            r0 = r32
            goto L_0x0170
        L_0x02bf:
            r7 = r0
            r28 = r3
            r16 = 1
            if (r14 != 0) goto L_0x02cb
            int r10 = androidx.databinding.a.h(r4)
            goto L_0x02df
        L_0x02cb:
            int r10 = r14.c(r10)
            goto L_0x02df
        L_0x02d0:
            r7 = r0
            r28 = r3
            r16 = 1
            int r10 = androidx.databinding.a.h(r4)
            goto L_0x02df
        L_0x02da:
            r7 = r0
            r28 = r3
            r16 = 1
        L_0x02df:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x02e7:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            if (r0 <= r1) goto L_0x02fc
            r1 = 4
            if (r8 > r1) goto L_0x02f3
            r1 = r2
            goto L_0x02f5
        L_0x02f3:
            int r1 = r8 * 2
        L_0x02f5:
            int[] r1 = new int[r1]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r3, r8)
            r5 = r1
        L_0x02fc:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x031a
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r3 = 4
            if (r8 > r3) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            int r2 = r8 * 2
        L_0x030f:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            r6 = r1
        L_0x031a:
            r6[r8] = r7
            int[][] r6 = (int[][]) r6
            r1 = r35
            r2 = r36
            r8 = r0
            r4 = r16
            r3 = r28
            r7 = 0
            r0 = r33
            goto L_0x0020
        L_0x032c:
            r28 = r3
            r16 = r4
            r0 = r33
            r1 = r35
            r2 = r36
            r4 = r16
            r3 = r28
            r7 = 0
            goto L_0x0020
        L_0x033d:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x034e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r34.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.b.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
