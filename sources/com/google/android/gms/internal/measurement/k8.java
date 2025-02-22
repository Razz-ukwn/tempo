package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class k8<T> implements s8<T> {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f5361n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f5362o = n9.k();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f5363a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f5364b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5365c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5366d;

    /* renamed from: e  reason: collision with root package name */
    public final h8 f5367e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5368f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5369g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f5370h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5371i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5372j;

    /* renamed from: k  reason: collision with root package name */
    public final v7 f5373k;

    /* renamed from: l  reason: collision with root package name */
    public final d9 f5374l;
    public final t6 m;

    public k8(int[] iArr, Object[] objArr, int i8, int i10, h8 h8Var, boolean z10, int[] iArr2, int i11, int i12, v7 v7Var, d9 d9Var, t6 t6Var) {
        this.f5363a = iArr;
        this.f5364b = objArr;
        this.f5365c = i8;
        this.f5366d = i10;
        this.f5369g = z10;
        this.f5368f = t6Var != null && t6Var.c(h8Var);
        this.f5370h = iArr2;
        this.f5371i = i11;
        this.f5372j = i12;
        this.f5373k = v7Var;
        this.f5374l = d9Var;
        this.m = t6Var;
        this.f5367e = h8Var;
    }

    public static long F(Object obj, long j10) {
        return ((Long) n9.j(obj, j10)).longValue();
    }

    public static Field i(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void j(Object obj) {
        if (!s(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof g7) {
            return ((g7) obj).r();
        }
        return true;
    }

    public static final void u(int i8, Object obj, p6 p6Var) {
        if (obj instanceof String) {
            p6Var.f5465a.m(i8, (String) obj);
            return;
        }
        p6Var.f(i8, (k6) obj);
    }

    public static e9 w(Object obj) {
        g7 g7Var = (g7) obj;
        e9 e9Var = g7Var.zzc;
        if (e9Var != e9.f5259f) {
            return e9Var;
        }
        e9 b10 = e9.b();
        g7Var.zzc = b10;
        return b10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0281  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.k8 x(com.google.android.gms.internal.measurement.f8 r34, com.google.android.gms.internal.measurement.v7 r35, com.google.android.gms.internal.measurement.d9 r36, com.google.android.gms.internal.measurement.t6 r37) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.r8
            if (r1 == 0) goto L_0x03cf
            com.google.android.gms.internal.measurement.r8 r0 = (com.google.android.gms.internal.measurement.r8) r0
            int r1 = r0.zzc()
            java.lang.String r2 = r0.a()
            int r3 = r2.length()
            r4 = 0
            char r5 = r2.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0029
            r5 = 1
        L_0x001f:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x002a
            r5 = r8
            goto L_0x001f
        L_0x0029:
            r8 = 1
        L_0x002a:
            int r5 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0049
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0036:
            int r11 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x0046
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r10
            r8 = r8 | r5
            int r10 = r10 + 13
            r5 = r11
            goto L_0x0036
        L_0x0046:
            int r5 = r5 << r10
            r8 = r8 | r5
            r5 = r11
        L_0x0049:
            if (r8 != 0) goto L_0x005e
            int[] r8 = f5361n
            r12 = r4
            r13 = r12
            r14 = r13
            r20 = r14
            r21 = r20
            r25 = r21
            r16 = r5
            r24 = r8
            r5 = r25
            goto L_0x0172
        L_0x005e:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x006a:
            int r11 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x007a
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r5 = r5 | r8
            int r10 = r10 + 13
            r8 = r11
            goto L_0x006a
        L_0x007a:
            int r8 = r8 << r10
            r5 = r5 | r8
            r8 = r11
        L_0x007d:
            int r10 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x009c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x0089:
            int r12 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x0099
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r8 = r8 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x0089
        L_0x0099:
            int r10 = r10 << r11
            r8 = r8 | r10
            r10 = r12
        L_0x009c:
            int r11 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x00bb
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00b8
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00a8
        L_0x00b8:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00bb:
            int r12 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00da
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x014b:
            int r17 = r4 + 1
            char r4 = r2.charAt(r4)
            if (r4 < r6) goto L_0x015d
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x014b
        L_0x015d:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x0162:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int r14 = r5 + r5
            int r14 = r14 + r8
            int[] r8 = new int[r4]
            r24 = r8
            r20 = r10
            r21 = r11
            r25 = r15
        L_0x0172:
            java.lang.Object[] r4 = r0.b()
            com.google.android.gms.internal.measurement.h8 r8 = r0.zza()
            java.lang.Class r8 = r8.getClass()
            int r26 = r25 + r13
            int r10 = r12 + r12
            int r12 = r12 * 3
            int[] r11 = new int[r12]
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r12 = r16
            r16 = r25
            r17 = r26
            r13 = 0
            r15 = 0
        L_0x0190:
            r9 = 2
            if (r1 != r9) goto L_0x0196
            r23 = 1
            goto L_0x0198
        L_0x0196:
            r23 = 0
        L_0x0198:
            if (r12 >= r3) goto L_0x03b9
            int r9 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x01bd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x01a6:
            int r22 = r9 + 1
            char r9 = r2.charAt(r9)
            if (r9 < r6) goto L_0x01b8
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r19
            r12 = r12 | r9
            int r19 = r19 + 13
            r9 = r22
            goto L_0x01a6
        L_0x01b8:
            int r9 = r9 << r19
            r12 = r12 | r9
            r9 = r22
        L_0x01bd:
            int r19 = r9 + 1
            char r9 = r2.charAt(r9)
            if (r9 < r6) goto L_0x01e3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r7 = r19
            r19 = 13
        L_0x01cb:
            int r27 = r7 + 1
            char r7 = r2.charAt(r7)
            if (r7 < r6) goto L_0x01dd
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r19
            r9 = r9 | r7
            int r19 = r19 + 13
            r7 = r27
            goto L_0x01cb
        L_0x01dd:
            int r7 = r7 << r19
            r9 = r9 | r7
            r7 = r27
            goto L_0x01e5
        L_0x01e3:
            r7 = r19
        L_0x01e5:
            r6 = r9 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x01ee
            int r6 = r13 + 1
            r24[r13] = r15
            r13 = r6
        L_0x01ee:
            r6 = r9 & 255(0xff, float:3.57E-43)
            r27 = r1
            sun.misc.Unsafe r1 = f5362o
            r30 = r3
            r3 = 51
            if (r6 < r3) goto L_0x0294
            int r3 = r7 + 1
            char r7 = r2.charAt(r7)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x022e
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
            r33 = r28
            r28 = r7
            r7 = r33
        L_0x0211:
            int r32 = r7 + 1
            char r7 = r2.charAt(r7)
            if (r7 < r3) goto L_0x0227
            r3 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r31
            r28 = r28 | r3
            int r31 = r31 + 13
            r7 = r32
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0211
        L_0x0227:
            int r3 = r7 << r31
            r7 = r28 | r3
            r3 = r32
            goto L_0x0230
        L_0x022e:
            r3 = r28
        L_0x0230:
            r28 = r3
            int r3 = r6 + -51
            r31 = r13
            r13 = 9
            if (r3 == r13) goto L_0x0251
            r13 = 17
            if (r3 != r13) goto L_0x023f
            goto L_0x0251
        L_0x023f:
            r13 = 12
            if (r3 != r13) goto L_0x025d
            if (r23 != 0) goto L_0x025d
            int r3 = r15 / 3
            int r3 = r3 + r3
            r13 = 1
            int r3 = r3 + r13
            int r13 = r14 + 1
            r14 = r4[r14]
            r10[r3] = r14
            goto L_0x025c
        L_0x0251:
            int r3 = r15 / 3
            int r3 = r3 + r3
            r13 = 1
            int r3 = r3 + r13
            int r13 = r14 + 1
            r14 = r4[r14]
            r10[r3] = r14
        L_0x025c:
            r14 = r13
        L_0x025d:
            int r7 = r7 + r7
            r3 = r4[r7]
            boolean r13 = r3 instanceof java.lang.reflect.Field
            if (r13 == 0) goto L_0x0267
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            goto L_0x026f
        L_0x0267:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.reflect.Field r3 = i(r8, r3)
            r4[r7] = r3
        L_0x026f:
            r23 = r14
            long r13 = r1.objectFieldOffset(r3)
            int r3 = (int) r13
            int r7 = r7 + 1
            r13 = r4[r7]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0281
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x0289
        L_0x0281:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = i(r8, r13)
            r4[r7] = r13
        L_0x0289:
            long r13 = r1.objectFieldOffset(r13)
            int r1 = (int) r13
            r14 = r2
            r7 = 0
            r22 = 1
            goto L_0x0385
        L_0x0294:
            r31 = r13
            int r3 = r14 + 1
            r13 = r4[r14]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = i(r8, r13)
            r14 = 9
            if (r6 == r14) goto L_0x0308
            r14 = 17
            if (r6 != r14) goto L_0x02a9
            goto L_0x0308
        L_0x02a9:
            r14 = 27
            if (r6 == r14) goto L_0x02f8
            r14 = 49
            if (r6 != r14) goto L_0x02b2
            goto L_0x02f8
        L_0x02b2:
            r14 = 12
            if (r6 == r14) goto L_0x02e5
            r14 = 30
            if (r6 == r14) goto L_0x02e5
            r14 = 44
            if (r6 != r14) goto L_0x02bf
            goto L_0x02e5
        L_0x02bf:
            r14 = 50
            if (r6 != r14) goto L_0x02f5
            int r14 = r16 + 1
            r24[r16] = r15
            int r16 = r15 / 3
            int r23 = r3 + 1
            r3 = r4[r3]
            int r16 = r16 + r16
            r10[r16] = r3
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x02e0
            int r16 = r16 + 1
            int r3 = r23 + 1
            r23 = r4[r23]
            r10[r16] = r23
            r16 = r14
            goto L_0x02f5
        L_0x02e0:
            r16 = r14
        L_0x02e2:
            r3 = r23
            goto L_0x02f5
        L_0x02e5:
            if (r23 != 0) goto L_0x02f5
            int r14 = r15 / 3
            int r14 = r14 + r14
            r22 = 1
            int r14 = r14 + 1
            int r23 = r3 + 1
            r3 = r4[r3]
            r10[r14] = r3
            goto L_0x02e2
        L_0x02f5:
            r22 = 1
            goto L_0x0315
        L_0x02f8:
            int r14 = r15 / 3
            int r14 = r14 + r14
            r22 = 1
            int r14 = r14 + 1
            int r23 = r3 + 1
            r3 = r4[r3]
            r10[r14] = r3
            r3 = r23
            goto L_0x0315
        L_0x0308:
            r22 = 1
            int r14 = r15 / 3
            int r14 = r14 + r14
            int r14 = r14 + 1
            java.lang.Class r23 = r13.getType()
            r10[r14] = r23
        L_0x0315:
            long r13 = r1.objectFieldOffset(r13)
            int r13 = (int) r13
            r14 = r9 & 4096(0x1000, float:5.74E-42)
            r23 = r3
            r3 = 4096(0x1000, float:5.74E-42)
            if (r14 != r3) goto L_0x036d
            r3 = 17
            if (r6 > r3) goto L_0x036d
            int r3 = r7 + 1
            char r7 = r2.charAt(r7)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r14) goto L_0x034b
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0335:
            int r29 = r3 + 1
            char r3 = r2.charAt(r3)
            if (r3 < r14) goto L_0x0347
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r19
            r7 = r7 | r3
            int r19 = r19 + 13
            r3 = r29
            goto L_0x0335
        L_0x0347:
            int r3 = r3 << r19
            r7 = r7 | r3
            goto L_0x034d
        L_0x034b:
            r29 = r3
        L_0x034d:
            int r3 = r5 + r5
            int r19 = r7 / 32
            int r19 = r19 + r3
            r3 = r4[r19]
            boolean r14 = r3 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x035c
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            goto L_0x0364
        L_0x035c:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.reflect.Field r3 = i(r8, r3)
            r4[r19] = r3
        L_0x0364:
            r14 = r2
            long r1 = r1.objectFieldOffset(r3)
            int r1 = (int) r1
            int r7 = r7 % 32
            goto L_0x0374
        L_0x036d:
            r14 = r2
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r7
            r7 = 0
        L_0x0374:
            r2 = 18
            if (r6 < r2) goto L_0x0382
            r2 = 49
            if (r6 > r2) goto L_0x0382
            int r2 = r17 + 1
            r24[r17] = r13
            r17 = r2
        L_0x0382:
            r3 = r13
            r28 = r29
        L_0x0385:
            int r2 = r15 + 1
            r11[r15] = r12
            int r12 = r2 + 1
            r13 = r9 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0392
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0393
        L_0x0392:
            r13 = 0
        L_0x0393:
            r9 = r9 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x039a
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039b
        L_0x039a:
            r9 = 0
        L_0x039b:
            int r6 = r6 << 20
            r9 = r9 | r13
            r6 = r6 | r9
            r3 = r3 | r6
            r11[r2] = r3
            int r15 = r12 + 1
            int r2 = r7 << 20
            r1 = r1 | r2
            r11[r12] = r1
            r2 = r14
            r14 = r23
            r1 = r27
            r12 = r28
            r3 = r30
            r13 = r31
            r6 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0190
        L_0x03b9:
            com.google.android.gms.internal.measurement.k8 r1 = new com.google.android.gms.internal.measurement.k8
            com.google.android.gms.internal.measurement.h8 r22 = r0.zza()
            r17 = r1
            r18 = r11
            r19 = r10
            r27 = r35
            r28 = r36
            r29 = r37
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x03cf:
            com.google.android.gms.internal.measurement.b9 r0 = (com.google.android.gms.internal.measurement.b9) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k8.x(com.google.android.gms.internal.measurement.f8, com.google.android.gms.internal.measurement.v7, com.google.android.gms.internal.measurement.d9, com.google.android.gms.internal.measurement.t6):com.google.android.gms.internal.measurement.k8");
    }

    public static int z(Object obj, long j10) {
        return ((Integer) n9.j(obj, j10)).intValue();
    }

    public final void A(Object obj, int i8, long j10) {
        Object f10 = f(i8);
        Unsafe unsafe = f5362o;
        Object object = unsafe.getObject(obj, j10);
        if (!((c8) object).h()) {
            c8 b10 = c8.a().b();
            d8.b(b10, object);
            unsafe.putObject(obj, j10, b10);
        }
        b8 b8Var = (b8) f10;
        throw null;
    }

    public final int B(Object obj, byte[] bArr, int i8, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, c6 c6Var) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i17 = i8;
        int i18 = i11;
        int i19 = i12;
        int i20 = i13;
        long j11 = j10;
        int i21 = i16;
        c6 c6Var2 = c6Var;
        long j12 = (long) (this.f5363a[i21 + 2] & 1048575);
        boolean z10 = true;
        Unsafe unsafe = f5362o;
        switch (i15) {
            case 51:
                if (i20 == 1) {
                    unsafe.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(d6.o(bArr, i8))));
                    int i22 = i17 + 8;
                    unsafe.putInt(obj2, j12, i19);
                    return i22;
                }
                break;
            case 52:
                if (i20 == 5) {
                    unsafe.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(d6.b(bArr, i8))));
                    int i23 = i17 + 4;
                    unsafe.putInt(obj2, j12, i19);
                    return i23;
                }
                break;
            case 53:
            case 54:
                if (i20 == 0) {
                    int l10 = d6.l(bArr2, i17, c6Var2);
                    unsafe.putObject(obj2, j11, Long.valueOf(c6Var2.f5175b));
                    unsafe.putInt(obj2, j12, i19);
                    return l10;
                }
                break;
            case 55:
            case 62:
                if (i20 == 0) {
                    int i24 = d6.i(bArr2, i17, c6Var2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(c6Var2.f5174a));
                    unsafe.putInt(obj2, j12, i19);
                    return i24;
                }
                break;
            case 56:
            case 65:
                if (i20 == 1) {
                    unsafe.putObject(obj2, j11, Long.valueOf(d6.o(bArr, i8)));
                    int i25 = i17 + 8;
                    unsafe.putInt(obj2, j12, i19);
                    return i25;
                }
                break;
            case 57:
            case 64:
                if (i20 == 5) {
                    unsafe.putObject(obj2, j11, Integer.valueOf(d6.b(bArr, i8)));
                    int i26 = i17 + 4;
                    unsafe.putInt(obj2, j12, i19);
                    return i26;
                }
                break;
            case 58:
                if (i20 == 0) {
                    int l11 = d6.l(bArr2, i17, c6Var2);
                    if (c6Var2.f5175b == 0) {
                        z10 = false;
                    }
                    unsafe.putObject(obj2, j11, Boolean.valueOf(z10));
                    unsafe.putInt(obj2, j12, i19);
                    return l11;
                }
                break;
            case 59:
                if (i20 == 2) {
                    int i27 = d6.i(bArr2, i17, c6Var2);
                    int i28 = c6Var2.f5174a;
                    if (i28 == 0) {
                        unsafe.putObject(obj2, j11, "");
                    } else if ((i14 & 536870912) == 0 || r9.d(bArr2, i27, i27 + i28)) {
                        unsafe.putObject(obj2, j11, new String(bArr2, i27, i28, m7.f5399a));
                        i27 += i28;
                    } else {
                        throw o7.a();
                    }
                    unsafe.putInt(obj2, j12, i19);
                    return i27;
                }
                break;
            case 60:
                if (i20 == 2) {
                    Object h3 = h(obj2, i19, i21);
                    int n2 = d6.n(h3, e(i21), bArr, i8, i10, c6Var);
                    p(obj2, i19, i21, h3);
                    return n2;
                }
                break;
            case 61:
                if (i20 == 2) {
                    int a10 = d6.a(bArr2, i17, c6Var2);
                    unsafe.putObject(obj2, j11, c6Var2.f5176c);
                    unsafe.putInt(obj2, j12, i19);
                    return a10;
                }
                break;
            case 63:
                if (i20 == 0) {
                    int i29 = d6.i(bArr2, i17, c6Var2);
                    int i30 = c6Var2.f5174a;
                    int i31 = i21 / 3;
                    i7 i7Var = (i7) this.f5364b[i31 + i31 + 1];
                    if (i7Var == null || i7Var.zza(i30)) {
                        unsafe.putObject(obj2, j11, Integer.valueOf(i30));
                        unsafe.putInt(obj2, j12, i19);
                    } else {
                        w(obj).c(i18, Long.valueOf((long) i30));
                    }
                    return i29;
                }
                break;
            case 66:
                if (i20 == 0) {
                    int i32 = d6.i(bArr2, i17, c6Var2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(l6.a(c6Var2.f5174a)));
                    unsafe.putInt(obj2, j12, i19);
                    return i32;
                }
                break;
            case 67:
                if (i20 == 0) {
                    int l12 = d6.l(bArr2, i17, c6Var2);
                    unsafe.putObject(obj2, j11, Long.valueOf(l6.b(c6Var2.f5175b)));
                    unsafe.putInt(obj2, j12, i19);
                    return l12;
                }
                break;
            case 68:
                if (i20 == 3) {
                    Object h10 = h(obj2, i19, i21);
                    int i33 = (i18 & -8) | 4;
                    int m10 = d6.m(h10, e(i21), bArr, i8, i10, i33, c6Var);
                    p(obj2, i19, i21, h10);
                    return m10;
                }
                break;
        }
        return i17;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x04a0 A[SYNTHETIC] */
    public final int C(java.lang.Object r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, long r29, com.google.android.gms.internal.measurement.c6 r31) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r2 = r22
            r8 = r23
            r6 = r24
            r9 = r25
            r10 = r29
            r7 = r31
            sun.misc.Unsafe r12 = f5362o
            java.lang.Object r13 = r12.getObject(r1, r10)
            com.google.android.gms.internal.measurement.l7 r13 = (com.google.android.gms.internal.measurement.l7) r13
            boolean r14 = r13.zzc()
            if (r14 != 0) goto L_0x0035
            int r14 = r13.size()
            if (r14 != 0) goto L_0x002d
            r14 = 10
            goto L_0x002e
        L_0x002d:
            int r14 = r14 + r14
        L_0x002e:
            com.google.android.gms.internal.measurement.l7 r13 = r13.zzd(r14)
            r12.putObject(r1, r10, r13)
        L_0x0035:
            r10 = 3
            r11 = 1
            r14 = 5
            r15 = 0
            r12 = 2
            switch(r28) {
                case 18: goto L_0x0430;
                case 19: goto L_0x03e2;
                case 20: goto L_0x039f;
                case 21: goto L_0x039f;
                case 22: goto L_0x0386;
                case 23: goto L_0x0344;
                case 24: goto L_0x0302;
                case 25: goto L_0x02aa;
                case 26: goto L_0x01f7;
                case 27: goto L_0x01de;
                case 28: goto L_0x0184;
                case 29: goto L_0x0386;
                case 30: goto L_0x00fd;
                case 31: goto L_0x0302;
                case 32: goto L_0x0344;
                case 33: goto L_0x00ae;
                case 34: goto L_0x005f;
                case 35: goto L_0x0430;
                case 36: goto L_0x03e2;
                case 37: goto L_0x039f;
                case 38: goto L_0x039f;
                case 39: goto L_0x0386;
                case 40: goto L_0x0344;
                case 41: goto L_0x0302;
                case 42: goto L_0x02aa;
                case 43: goto L_0x0386;
                case 44: goto L_0x00fd;
                case 45: goto L_0x0302;
                case 46: goto L_0x0344;
                case 47: goto L_0x00ae;
                case 48: goto L_0x005f;
                default: goto L_0x003e;
            }
        L_0x003e:
            if (r6 != r10) goto L_0x049f
            com.google.android.gms.internal.measurement.s8 r1 = r0.e(r9)
            r6 = r2 & -8
            r6 = r6 | 4
            r23 = r1
            r24 = r19
            r25 = r20
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = com.google.android.gms.internal.measurement.d6.c(r23, r24, r25, r26, r27, r28)
            java.lang.Object r8 = r7.f5176c
            r13.add(r8)
            goto L_0x047d
        L_0x005f:
            if (r6 != r12) goto L_0x0083
            com.google.android.gms.internal.measurement.w7 r13 = (com.google.android.gms.internal.measurement.w7) r13
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r2 = r7.f5174a
            int r2 = r2 + r1
        L_0x006a:
            if (r1 >= r2) goto L_0x007a
            int r1 = com.google.android.gms.internal.measurement.d6.l(r3, r1, r7)
            long r4 = r7.f5175b
            long r4 = com.google.android.gms.internal.measurement.l6.b(r4)
            r13.b(r4)
            goto L_0x006a
        L_0x007a:
            if (r1 != r2) goto L_0x007e
            goto L_0x04a0
        L_0x007e:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.d()
            throw r1
        L_0x0083:
            if (r6 != 0) goto L_0x049f
            com.google.android.gms.internal.measurement.w7 r13 = (com.google.android.gms.internal.measurement.w7) r13
            int r1 = com.google.android.gms.internal.measurement.d6.l(r3, r4, r7)
            long r8 = r7.f5175b
            long r8 = com.google.android.gms.internal.measurement.l6.b(r8)
            r13.b(r8)
        L_0x0094:
            if (r1 >= r5) goto L_0x00ad
            int r4 = com.google.android.gms.internal.measurement.d6.i(r3, r1, r7)
            int r6 = r7.f5174a
            if (r2 == r6) goto L_0x009f
            goto L_0x00ad
        L_0x009f:
            int r1 = com.google.android.gms.internal.measurement.d6.l(r3, r4, r7)
            long r8 = r7.f5175b
            long r8 = com.google.android.gms.internal.measurement.l6.b(r8)
            r13.b(r8)
            goto L_0x0094
        L_0x00ad:
            return r1
        L_0x00ae:
            if (r6 != r12) goto L_0x00d2
            com.google.android.gms.internal.measurement.h7 r13 = (com.google.android.gms.internal.measurement.h7) r13
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r2 = r7.f5174a
            int r2 = r2 + r1
        L_0x00b9:
            if (r1 >= r2) goto L_0x00c9
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r1, r7)
            int r4 = r7.f5174a
            int r4 = com.google.android.gms.internal.measurement.l6.a(r4)
            r13.b(r4)
            goto L_0x00b9
        L_0x00c9:
            if (r1 != r2) goto L_0x00cd
            goto L_0x04a0
        L_0x00cd:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.d()
            throw r1
        L_0x00d2:
            if (r6 != 0) goto L_0x049f
            com.google.android.gms.internal.measurement.h7 r13 = (com.google.android.gms.internal.measurement.h7) r13
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r4 = r7.f5174a
            int r4 = com.google.android.gms.internal.measurement.l6.a(r4)
            r13.b(r4)
        L_0x00e3:
            if (r1 >= r5) goto L_0x00fc
            int r4 = com.google.android.gms.internal.measurement.d6.i(r3, r1, r7)
            int r6 = r7.f5174a
            if (r2 == r6) goto L_0x00ee
            goto L_0x00fc
        L_0x00ee:
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r4 = r7.f5174a
            int r4 = com.google.android.gms.internal.measurement.l6.a(r4)
            r13.b(r4)
            goto L_0x00e3
        L_0x00fc:
            return r1
        L_0x00fd:
            if (r6 != r12) goto L_0x0104
            int r2 = com.google.android.gms.internal.measurement.d6.e(r3, r4, r13, r7)
            goto L_0x0115
        L_0x0104:
            if (r6 != 0) goto L_0x049f
            r2 = r22
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r13
            r7 = r31
            int r2 = com.google.android.gms.internal.measurement.d6.k(r2, r3, r4, r5, r6, r7)
        L_0x0115:
            int r3 = r9 / 3
            int r3 = r3 + r3
            int r3 = r3 + r11
            java.lang.Object[] r4 = r0.f5364b
            r3 = r4[r3]
            com.google.android.gms.internal.measurement.i7 r3 = (com.google.android.gms.internal.measurement.i7) r3
            java.lang.Class r4 = com.google.android.gms.internal.measurement.t8.f5528a
            if (r3 == 0) goto L_0x0181
            boolean r4 = r13 instanceof java.util.RandomAccess
            r5 = 0
            com.google.android.gms.internal.measurement.d9 r6 = r0.f5374l
            if (r4 == 0) goto L_0x015f
            int r4 = r13.size()
            r7 = 0
            r12 = 0
        L_0x0130:
            if (r12 >= r4) goto L_0x0155
            java.lang.Object r9 = r13.get(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r3.zza(r9)
            if (r10 == 0) goto L_0x014e
            if (r12 == r7) goto L_0x014b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.set(r7, r9)
        L_0x014b:
            int r7 = r7 + 1
            goto L_0x0152
        L_0x014e:
            java.lang.Object r5 = com.google.android.gms.internal.measurement.t8.a(r1, r8, r9, r5, r6)
        L_0x0152:
            int r12 = r12 + 1
            goto L_0x0130
        L_0x0155:
            if (r7 == r4) goto L_0x0181
            java.util.List r1 = r13.subList(r7, r4)
            r1.clear()
            return r2
        L_0x015f:
            java.util.Iterator r4 = r13.iterator()
        L_0x0163:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0181
            java.lang.Object r7 = r4.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r3.zza(r7)
            if (r9 != 0) goto L_0x0163
            java.lang.Object r5 = com.google.android.gms.internal.measurement.t8.a(r1, r8, r7, r5, r6)
            r4.remove()
            goto L_0x0163
        L_0x0181:
            r1 = r2
            goto L_0x04a0
        L_0x0184:
            if (r6 != r12) goto L_0x049f
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r4 = r7.f5174a
            if (r4 < 0) goto L_0x01d9
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01d4
            if (r4 != 0) goto L_0x019a
            com.google.android.gms.internal.measurement.i6 r4 = com.google.android.gms.internal.measurement.k6.f5359b
            r13.add(r4)
            goto L_0x01a2
        L_0x019a:
            com.google.android.gms.internal.measurement.i6 r6 = com.google.android.gms.internal.measurement.k6.j(r3, r1, r4)
            r13.add(r6)
        L_0x01a1:
            int r1 = r1 + r4
        L_0x01a2:
            if (r1 >= r5) goto L_0x01d3
            int r4 = com.google.android.gms.internal.measurement.d6.i(r3, r1, r7)
            int r6 = r7.f5174a
            if (r2 == r6) goto L_0x01ad
            goto L_0x01d3
        L_0x01ad:
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r4 = r7.f5174a
            if (r4 < 0) goto L_0x01ce
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01c9
            if (r4 != 0) goto L_0x01c1
            com.google.android.gms.internal.measurement.i6 r4 = com.google.android.gms.internal.measurement.k6.f5359b
            r13.add(r4)
            goto L_0x01a2
        L_0x01c1:
            com.google.android.gms.internal.measurement.i6 r6 = com.google.android.gms.internal.measurement.k6.j(r3, r1, r4)
            r13.add(r6)
            goto L_0x01a1
        L_0x01c9:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.d()
            throw r1
        L_0x01ce:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.b()
            throw r1
        L_0x01d3:
            return r1
        L_0x01d4:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.d()
            throw r1
        L_0x01d9:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.b()
            throw r1
        L_0x01de:
            if (r6 != r12) goto L_0x049f
            com.google.android.gms.internal.measurement.s8 r1 = r0.e(r9)
            r23 = r1
            r24 = r22
            r25 = r19
            r26 = r20
            r27 = r21
            r28 = r13
            r29 = r31
            int r1 = com.google.android.gms.internal.measurement.d6.d(r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x01f7:
            if (r6 != r12) goto L_0x049f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r26 & r8
            int r1 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x024a
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r4 = r7.f5174a
            if (r4 < 0) goto L_0x0245
            if (r4 != 0) goto L_0x0212
            r13.add(r6)
            goto L_0x021d
        L_0x0212:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.m7.f5399a
            r8.<init>(r3, r1, r4, r9)
            r13.add(r8)
        L_0x021c:
            int r1 = r1 + r4
        L_0x021d:
            if (r1 >= r5) goto L_0x04a0
            int r4 = com.google.android.gms.internal.measurement.d6.i(r3, r1, r7)
            int r8 = r7.f5174a
            if (r2 != r8) goto L_0x04a0
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r4 = r7.f5174a
            if (r4 < 0) goto L_0x0240
            if (r4 != 0) goto L_0x0235
            r13.add(r6)
            goto L_0x021d
        L_0x0235:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.m7.f5399a
            r8.<init>(r3, r1, r4, r9)
            r13.add(r8)
            goto L_0x021c
        L_0x0240:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.b()
            throw r1
        L_0x0245:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.b()
            throw r1
        L_0x024a:
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r4 = r7.f5174a
            if (r4 < 0) goto L_0x02a5
            if (r4 != 0) goto L_0x0258
            r13.add(r6)
            goto L_0x026b
        L_0x0258:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.r9.d(r3, r1, r8)
            if (r9 == 0) goto L_0x02a0
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.m7.f5399a
            r9.<init>(r3, r1, r4, r10)
            r13.add(r9)
        L_0x026a:
            r1 = r8
        L_0x026b:
            if (r1 >= r5) goto L_0x04a0
            int r4 = com.google.android.gms.internal.measurement.d6.i(r3, r1, r7)
            int r8 = r7.f5174a
            if (r2 != r8) goto L_0x04a0
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r4 = r7.f5174a
            if (r4 < 0) goto L_0x029b
            if (r4 != 0) goto L_0x0283
            r13.add(r6)
            goto L_0x026b
        L_0x0283:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.r9.d(r3, r1, r8)
            if (r9 == 0) goto L_0x0296
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.m7.f5399a
            r9.<init>(r3, r1, r4, r10)
            r13.add(r9)
            goto L_0x026a
        L_0x0296:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.a()
            throw r1
        L_0x029b:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.b()
            throw r1
        L_0x02a0:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.a()
            throw r1
        L_0x02a5:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.b()
            throw r1
        L_0x02aa:
            if (r6 != r12) goto L_0x02d1
            com.google.android.gms.internal.measurement.e6 r13 = (com.google.android.gms.internal.measurement.e6) r13
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r2 = r7.f5174a
            int r2 = r2 + r1
        L_0x02b5:
            if (r1 >= r2) goto L_0x02c8
            int r1 = com.google.android.gms.internal.measurement.d6.l(r3, r1, r7)
            long r4 = r7.f5175b
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 == 0) goto L_0x02c3
            r4 = r11
            goto L_0x02c4
        L_0x02c3:
            r4 = 0
        L_0x02c4:
            r13.b(r4)
            goto L_0x02b5
        L_0x02c8:
            if (r1 != r2) goto L_0x02cc
            goto L_0x04a0
        L_0x02cc:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.d()
            throw r1
        L_0x02d1:
            if (r6 != 0) goto L_0x049f
            com.google.android.gms.internal.measurement.e6 r13 = (com.google.android.gms.internal.measurement.e6) r13
            int r1 = com.google.android.gms.internal.measurement.d6.l(r3, r4, r7)
            long r8 = r7.f5175b
            int r4 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r4 == 0) goto L_0x02e1
            r4 = r11
            goto L_0x02e2
        L_0x02e1:
            r4 = 0
        L_0x02e2:
            r13.b(r4)
        L_0x02e5:
            if (r1 >= r5) goto L_0x0301
            int r4 = com.google.android.gms.internal.measurement.d6.i(r3, r1, r7)
            int r6 = r7.f5174a
            if (r2 == r6) goto L_0x02f0
            goto L_0x0301
        L_0x02f0:
            int r1 = com.google.android.gms.internal.measurement.d6.l(r3, r4, r7)
            long r8 = r7.f5175b
            int r4 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r4 == 0) goto L_0x02fc
            r4 = r11
            goto L_0x02fd
        L_0x02fc:
            r4 = 0
        L_0x02fd:
            r13.b(r4)
            goto L_0x02e5
        L_0x0301:
            return r1
        L_0x0302:
            if (r6 != r12) goto L_0x0322
            com.google.android.gms.internal.measurement.h7 r13 = (com.google.android.gms.internal.measurement.h7) r13
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r2 = r7.f5174a
            int r2 = r2 + r1
        L_0x030d:
            if (r1 >= r2) goto L_0x0319
            int r4 = com.google.android.gms.internal.measurement.d6.b(r3, r1)
            r13.b(r4)
            int r1 = r1 + 4
            goto L_0x030d
        L_0x0319:
            if (r1 != r2) goto L_0x031d
            goto L_0x04a0
        L_0x031d:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.d()
            throw r1
        L_0x0322:
            if (r6 != r14) goto L_0x049f
            com.google.android.gms.internal.measurement.h7 r13 = (com.google.android.gms.internal.measurement.h7) r13
            int r1 = com.google.android.gms.internal.measurement.d6.b(r19, r20)
            r13.b(r1)
        L_0x032d:
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x0343
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r6 = r7.f5174a
            if (r2 == r6) goto L_0x033a
            goto L_0x0343
        L_0x033a:
            int r4 = com.google.android.gms.internal.measurement.d6.b(r3, r1)
            r13.b(r4)
            r4 = r1
            goto L_0x032d
        L_0x0343:
            return r4
        L_0x0344:
            if (r6 != r12) goto L_0x0364
            com.google.android.gms.internal.measurement.w7 r13 = (com.google.android.gms.internal.measurement.w7) r13
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r2 = r7.f5174a
            int r2 = r2 + r1
        L_0x034f:
            if (r1 >= r2) goto L_0x035b
            long r4 = com.google.android.gms.internal.measurement.d6.o(r3, r1)
            r13.b(r4)
            int r1 = r1 + 8
            goto L_0x034f
        L_0x035b:
            if (r1 != r2) goto L_0x035f
            goto L_0x04a0
        L_0x035f:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.d()
            throw r1
        L_0x0364:
            if (r6 != r11) goto L_0x049f
            com.google.android.gms.internal.measurement.w7 r13 = (com.google.android.gms.internal.measurement.w7) r13
            long r8 = com.google.android.gms.internal.measurement.d6.o(r19, r20)
            r13.b(r8)
        L_0x036f:
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x0385
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r6 = r7.f5174a
            if (r2 == r6) goto L_0x037c
            goto L_0x0385
        L_0x037c:
            long r8 = com.google.android.gms.internal.measurement.d6.o(r3, r1)
            r13.b(r8)
            r4 = r1
            goto L_0x036f
        L_0x0385:
            return r4
        L_0x0386:
            if (r6 != r12) goto L_0x038e
            int r1 = com.google.android.gms.internal.measurement.d6.e(r3, r4, r13, r7)
            goto L_0x04a0
        L_0x038e:
            if (r6 != 0) goto L_0x049f
            r23 = r19
            r24 = r20
            r25 = r21
            r26 = r13
            r27 = r31
            int r1 = com.google.android.gms.internal.measurement.d6.k(r22, r23, r24, r25, r26, r27)
            return r1
        L_0x039f:
            if (r6 != r12) goto L_0x03bf
            com.google.android.gms.internal.measurement.w7 r13 = (com.google.android.gms.internal.measurement.w7) r13
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r2 = r7.f5174a
            int r2 = r2 + r1
        L_0x03aa:
            if (r1 >= r2) goto L_0x03b6
            int r1 = com.google.android.gms.internal.measurement.d6.l(r3, r1, r7)
            long r4 = r7.f5175b
            r13.b(r4)
            goto L_0x03aa
        L_0x03b6:
            if (r1 != r2) goto L_0x03ba
            goto L_0x04a0
        L_0x03ba:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.d()
            throw r1
        L_0x03bf:
            if (r6 != 0) goto L_0x049f
            com.google.android.gms.internal.measurement.w7 r13 = (com.google.android.gms.internal.measurement.w7) r13
            int r1 = com.google.android.gms.internal.measurement.d6.l(r3, r4, r7)
            long r8 = r7.f5175b
            r13.b(r8)
        L_0x03cc:
            if (r1 >= r5) goto L_0x03e1
            int r4 = com.google.android.gms.internal.measurement.d6.i(r3, r1, r7)
            int r6 = r7.f5174a
            if (r2 == r6) goto L_0x03d7
            goto L_0x03e1
        L_0x03d7:
            int r1 = com.google.android.gms.internal.measurement.d6.l(r3, r4, r7)
            long r8 = r7.f5175b
            r13.b(r8)
            goto L_0x03cc
        L_0x03e1:
            return r1
        L_0x03e2:
            if (r6 != r12) goto L_0x0406
            com.google.android.gms.internal.measurement.z6 r13 = (com.google.android.gms.internal.measurement.z6) r13
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r2 = r7.f5174a
            int r2 = r2 + r1
        L_0x03ed:
            if (r1 >= r2) goto L_0x03fd
            int r4 = com.google.android.gms.internal.measurement.d6.b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.b(r4)
            int r1 = r1 + 4
            goto L_0x03ed
        L_0x03fd:
            if (r1 != r2) goto L_0x0401
            goto L_0x04a0
        L_0x0401:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.d()
            throw r1
        L_0x0406:
            if (r6 != r14) goto L_0x049f
            com.google.android.gms.internal.measurement.z6 r13 = (com.google.android.gms.internal.measurement.z6) r13
            int r1 = com.google.android.gms.internal.measurement.d6.b(r19, r20)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.b(r1)
        L_0x0415:
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x042f
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r6 = r7.f5174a
            if (r2 == r6) goto L_0x0422
            goto L_0x042f
        L_0x0422:
            int r4 = com.google.android.gms.internal.measurement.d6.b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.b(r4)
            r4 = r1
            goto L_0x0415
        L_0x042f:
            return r4
        L_0x0430:
            if (r6 != r12) goto L_0x0453
            com.google.android.gms.internal.measurement.q6 r13 = (com.google.android.gms.internal.measurement.q6) r13
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r2 = r7.f5174a
            int r2 = r2 + r1
        L_0x043b:
            if (r1 >= r2) goto L_0x044b
            long r4 = com.google.android.gms.internal.measurement.d6.o(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.b(r4)
            int r1 = r1 + 8
            goto L_0x043b
        L_0x044b:
            if (r1 != r2) goto L_0x044e
            goto L_0x04a0
        L_0x044e:
            com.google.android.gms.internal.measurement.o7 r1 = com.google.android.gms.internal.measurement.o7.d()
            throw r1
        L_0x0453:
            if (r6 != r11) goto L_0x049f
            com.google.android.gms.internal.measurement.q6 r13 = (com.google.android.gms.internal.measurement.q6) r13
            long r8 = com.google.android.gms.internal.measurement.d6.o(r19, r20)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.b(r8)
        L_0x0462:
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x047c
            int r1 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r6 = r7.f5174a
            if (r2 == r6) goto L_0x046f
            goto L_0x047c
        L_0x046f:
            long r8 = com.google.android.gms.internal.measurement.d6.o(r3, r1)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.b(r8)
            r4 = r1
            goto L_0x0462
        L_0x047c:
            return r4
        L_0x047d:
            if (r4 >= r5) goto L_0x049e
            int r8 = com.google.android.gms.internal.measurement.d6.i(r3, r4, r7)
            int r9 = r7.f5174a
            if (r2 == r9) goto L_0x0488
            goto L_0x049e
        L_0x0488:
            r23 = r1
            r24 = r19
            r25 = r8
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = com.google.android.gms.internal.measurement.d6.c(r23, r24, r25, r26, r27, r28)
            java.lang.Object r8 = r7.f5176c
            r13.add(r8)
            goto L_0x047d
        L_0x049e:
            return r4
        L_0x049f:
            r1 = r4
        L_0x04a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k8.C(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.c6):int");
    }

    public final int D(int i8, int i10) {
        int[] iArr = this.f5363a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i8 == i13) {
                return i12;
            }
            if (i8 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    public final int E(int i8) {
        return this.f5363a[i8 + 1];
    }

    public final boolean a(Object obj) {
        int i8 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            boolean z10 = true;
            if (i8 < this.f5371i) {
                int i12 = this.f5370h[i8];
                int[] iArr = this.f5363a;
                int i13 = iArr[i12];
                int E = E(i12);
                int i14 = iArr[i12 + 2];
                int i15 = i14 & 1048575;
                int i16 = 1 << (i14 >>> 20);
                if (i15 != i11) {
                    if (i15 != 1048575) {
                        i10 = f5362o.getInt(obj, (long) i15);
                    }
                    i11 = i15;
                }
                if ((268435456 & E) != 0) {
                    if (!(i11 == 1048575 ? r(i12, obj) : (i10 & i16) != 0)) {
                        return false;
                    }
                }
                int i17 = (E >>> 20) & 255;
                if (i17 == 9 || i17 == 17) {
                    if (i11 == 1048575) {
                        z10 = r(i12, obj);
                    } else if ((i10 & i16) == 0) {
                        z10 = false;
                    }
                    if (z10 && !e(i12).a(n9.j(obj, (long) (E & 1048575)))) {
                        return false;
                    }
                } else {
                    if (i17 != 27) {
                        if (i17 == 60 || i17 == 68) {
                            if (t(obj, i13, i12) && !e(i12).a(n9.j(obj, (long) (E & 1048575)))) {
                                return false;
                            }
                        } else if (i17 != 49) {
                            if (i17 == 50 && !((c8) n9.j(obj, (long) (E & 1048575))).isEmpty()) {
                                b8 b8Var = (b8) f(i12);
                                throw null;
                            }
                        }
                    }
                    List list = (List) n9.j(obj, (long) (E & 1048575));
                    if (!list.isEmpty()) {
                        s8 e10 = e(i12);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (!e10.a(list.get(i18))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                i8++;
            } else if (!this.f5368f) {
                return true;
            } else {
                this.m.a(obj);
                throw null;
            }
        }
    }

    public final boolean b(Object obj, Object obj2) {
        boolean z10;
        int[] iArr = this.f5363a;
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int E = E(i8);
            long j10 = (long) (E & 1048575);
            switch ((E >>> 20) & 255) {
                case 0:
                    if (q(i8, obj, obj2) && Double.doubleToLongBits(n9.e(obj, j10)) == Double.doubleToLongBits(n9.e(obj2, j10))) {
                        continue;
                    }
                case 1:
                    if (q(i8, obj, obj2) && Float.floatToIntBits(n9.f(obj, j10)) == Float.floatToIntBits(n9.f(obj2, j10))) {
                        continue;
                    }
                case 2:
                    if (q(i8, obj, obj2) && n9.h(obj, j10) == n9.h(obj2, j10)) {
                        continue;
                    }
                case 3:
                    if (q(i8, obj, obj2) && n9.h(obj, j10) == n9.h(obj2, j10)) {
                        continue;
                    }
                case 4:
                    if (q(i8, obj, obj2) && n9.g(obj, j10) == n9.g(obj2, j10)) {
                        continue;
                    }
                case 5:
                    if (q(i8, obj, obj2) && n9.h(obj, j10) == n9.h(obj2, j10)) {
                        continue;
                    }
                case 6:
                    if (q(i8, obj, obj2) && n9.g(obj, j10) == n9.g(obj2, j10)) {
                        continue;
                    }
                case 7:
                    if (q(i8, obj, obj2) && n9.v(obj, j10) == n9.v(obj2, j10)) {
                        continue;
                    }
                case 8:
                    if (q(i8, obj, obj2) && t8.t(n9.j(obj, j10), n9.j(obj2, j10))) {
                        continue;
                    }
                case 9:
                    if (q(i8, obj, obj2) && t8.t(n9.j(obj, j10), n9.j(obj2, j10))) {
                        continue;
                    }
                case 10:
                    if (q(i8, obj, obj2) && t8.t(n9.j(obj, j10), n9.j(obj2, j10))) {
                        continue;
                    }
                case ModuleDescriptor.MODULE_VERSION:
                    if (q(i8, obj, obj2) && n9.g(obj, j10) == n9.g(obj2, j10)) {
                        continue;
                    }
                case 12:
                    if (q(i8, obj, obj2) && n9.g(obj, j10) == n9.g(obj2, j10)) {
                        continue;
                    }
                case 13:
                    if (q(i8, obj, obj2) && n9.g(obj, j10) == n9.g(obj2, j10)) {
                        continue;
                    }
                case 14:
                    if (q(i8, obj, obj2) && n9.h(obj, j10) == n9.h(obj2, j10)) {
                        continue;
                    }
                case 15:
                    if (q(i8, obj, obj2) && n9.g(obj, j10) == n9.g(obj2, j10)) {
                        continue;
                    }
                case 16:
                    if (q(i8, obj, obj2) && n9.h(obj, j10) == n9.h(obj2, j10)) {
                        continue;
                    }
                case 17:
                    if (q(i8, obj, obj2) && t8.t(n9.j(obj, j10), n9.j(obj2, j10))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z10 = t8.t(n9.j(obj, j10), n9.j(obj2, j10));
                    break;
                case 50:
                    z10 = t8.t(n9.j(obj, j10), n9.j(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j11 = (long) (iArr[i8 + 2] & 1048575);
                    if (n9.g(obj, j11) == n9.g(obj2, j11) && t8.t(n9.j(obj, j10), n9.j(obj2, j10))) {
                        continue;
                    }
            }
            if (!z10) {
                return false;
            }
        }
        d9 d9Var = this.f5374l;
        if (!d9Var.d(obj).equals(d9Var.d(obj2))) {
            return false;
        }
        if (!this.f5368f) {
            return true;
        }
        t6 t6Var = this.m;
        t6Var.a(obj);
        t6Var.a(obj2);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b0, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04b1, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x070e, code lost:
        r15 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x08b7, code lost:
        r6 = r6 + 3;
        r8 = r11;
        r10 = r13;
        r9 = r15;
        r11 = 1048575;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Object r17, com.google.android.gms.internal.measurement.p6 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f5369g
            com.google.android.gms.internal.measurement.d9 r4 = r0.f5374l
            r5 = 0
            com.google.android.gms.internal.measurement.t6 r6 = r0.m
            boolean r7 = r0.f5368f
            r8 = 1
            r9 = 0
            int[] r10 = r0.f5363a
            r11 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 == 0) goto L_0x0478
            if (r7 != 0) goto L_0x0474
            int r3 = r10.length
            r6 = r9
        L_0x001c:
            if (r6 >= r3) goto L_0x046c
            int r7 = r0.E(r6)
            r12 = r10[r6]
            int r13 = r7 >>> 20
            r13 = r13 & 255(0xff, float:3.57E-43)
            switch(r13) {
                case 0: goto L_0x0459;
                case 1: goto L_0x0449;
                case 2: goto L_0x0439;
                case 3: goto L_0x0429;
                case 4: goto L_0x0419;
                case 5: goto L_0x0409;
                case 6: goto L_0x03f9;
                case 7: goto L_0x03e8;
                case 8: goto L_0x03d7;
                case 9: goto L_0x03c2;
                case 10: goto L_0x03af;
                case 11: goto L_0x039e;
                case 12: goto L_0x038d;
                case 13: goto L_0x037c;
                case 14: goto L_0x036b;
                case 15: goto L_0x035a;
                case 16: goto L_0x0349;
                case 17: goto L_0x0334;
                case 18: goto L_0x0327;
                case 19: goto L_0x031a;
                case 20: goto L_0x030d;
                case 21: goto L_0x0300;
                case 22: goto L_0x02f3;
                case 23: goto L_0x02e6;
                case 24: goto L_0x02d9;
                case 25: goto L_0x02cc;
                case 26: goto L_0x02bf;
                case 27: goto L_0x02ae;
                case 28: goto L_0x02a1;
                case 29: goto L_0x0294;
                case 30: goto L_0x0287;
                case 31: goto L_0x027a;
                case 32: goto L_0x026d;
                case 33: goto L_0x0260;
                case 34: goto L_0x0253;
                case 35: goto L_0x0246;
                case 36: goto L_0x0239;
                case 37: goto L_0x022c;
                case 38: goto L_0x021f;
                case 39: goto L_0x0212;
                case 40: goto L_0x0205;
                case 41: goto L_0x01f8;
                case 42: goto L_0x01eb;
                case 43: goto L_0x01de;
                case 44: goto L_0x01d1;
                case 45: goto L_0x01c4;
                case 46: goto L_0x01b7;
                case 47: goto L_0x01aa;
                case 48: goto L_0x019d;
                case 49: goto L_0x018c;
                case 50: goto L_0x017b;
                case 51: goto L_0x0164;
                case 52: goto L_0x014d;
                case 53: goto L_0x013c;
                case 54: goto L_0x012b;
                case 55: goto L_0x011a;
                case 56: goto L_0x0109;
                case 57: goto L_0x00f8;
                case 58: goto L_0x00e1;
                case 59: goto L_0x00d0;
                case 60: goto L_0x00bb;
                case 61: goto L_0x00a8;
                case 62: goto L_0x0097;
                case 63: goto L_0x0086;
                case 64: goto L_0x0075;
                case 65: goto L_0x0064;
                case 66: goto L_0x0053;
                case 67: goto L_0x0042;
                case 68: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0468
        L_0x002d:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            com.google.android.gms.internal.measurement.s8 r13 = r0.e(r6)
            r2.l(r12, r13, r7)
            goto L_0x0468
        L_0x0042:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = F(r1, r13)
            r2.b(r12, r13)
            goto L_0x0468
        L_0x0053:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = z(r1, r13)
            r2.a(r12, r7)
            goto L_0x0468
        L_0x0064:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = F(r1, r13)
            r2.q(r12, r13)
            goto L_0x0468
        L_0x0075:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = z(r1, r13)
            r2.p(r12, r7)
            goto L_0x0468
        L_0x0086:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = z(r1, r13)
            r2.h(r12, r7)
            goto L_0x0468
        L_0x0097:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = z(r1, r13)
            r2.c(r12, r7)
            goto L_0x0468
        L_0x00a8:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            com.google.android.gms.internal.measurement.k6 r7 = (com.google.android.gms.internal.measurement.k6) r7
            r2.f(r12, r7)
            goto L_0x0468
        L_0x00bb:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            com.google.android.gms.internal.measurement.s8 r13 = r0.e(r6)
            r2.o(r12, r13, r7)
            goto L_0x0468
        L_0x00d0:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            u(r12, r7, r2)
            goto L_0x0468
        L_0x00e1:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r2.e(r12, r7)
            goto L_0x0468
        L_0x00f8:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = z(r1, r13)
            r2.i(r12, r7)
            goto L_0x0468
        L_0x0109:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = F(r1, r13)
            r2.j(r12, r13)
            goto L_0x0468
        L_0x011a:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = z(r1, r13)
            r2.m(r12, r7)
            goto L_0x0468
        L_0x012b:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = F(r1, r13)
            r2.d(r12, r13)
            goto L_0x0468
        L_0x013c:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = F(r1, r13)
            r2.n(r12, r13)
            goto L_0x0468
        L_0x014d:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r2.k(r12, r7)
            goto L_0x0468
        L_0x0164:
            boolean r13 = r0.t(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.lang.Double r7 = (java.lang.Double) r7
            double r13 = r7.doubleValue()
            r2.g(r12, r13)
            goto L_0x0468
        L_0x017b:
            r7 = r7 & r11
            long r12 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r12)
            if (r7 != 0) goto L_0x0185
            goto L_0x0468
        L_0x0185:
            java.lang.Object r1 = r0.f(r6)
            com.google.android.gms.internal.measurement.b8 r1 = (com.google.android.gms.internal.measurement.b8) r1
            throw r5
        L_0x018c:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.s8 r13 = r0.e(r6)
            com.google.android.gms.internal.measurement.t8.i(r12, r7, r2, r13)
            goto L_0x0468
        L_0x019d:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.p(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01aa:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.o(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01b7:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.n(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01c4:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.m(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01d1:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.e(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01de:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.r(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01eb:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.b(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01f8:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.f(r12, r7, r2, r8)
            goto L_0x0468
        L_0x0205:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.g(r12, r7, r2, r8)
            goto L_0x0468
        L_0x0212:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.j(r12, r7, r2, r8)
            goto L_0x0468
        L_0x021f:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.s(r12, r7, r2, r8)
            goto L_0x0468
        L_0x022c:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.k(r12, r7, r2, r8)
            goto L_0x0468
        L_0x0239:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.h(r12, r7, r2, r8)
            goto L_0x0468
        L_0x0246:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.d(r12, r7, r2, r8)
            goto L_0x0468
        L_0x0253:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.p(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0260:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.o(r12, r7, r2, r9)
            goto L_0x0468
        L_0x026d:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.n(r12, r7, r2, r9)
            goto L_0x0468
        L_0x027a:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.m(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0287:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.e(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0294:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.r(r12, r7, r2, r9)
            goto L_0x0468
        L_0x02a1:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.c(r12, r7, r2)
            goto L_0x0468
        L_0x02ae:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.s8 r13 = r0.e(r6)
            com.google.android.gms.internal.measurement.t8.l(r12, r7, r2, r13)
            goto L_0x0468
        L_0x02bf:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.q(r12, r7, r2)
            goto L_0x0468
        L_0x02cc:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.b(r12, r7, r2, r9)
            goto L_0x0468
        L_0x02d9:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.f(r12, r7, r2, r9)
            goto L_0x0468
        L_0x02e6:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.g(r12, r7, r2, r9)
            goto L_0x0468
        L_0x02f3:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.j(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0300:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.s(r12, r7, r2, r9)
            goto L_0x0468
        L_0x030d:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.k(r12, r7, r2, r9)
            goto L_0x0468
        L_0x031a:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.h(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0327:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.t8.d(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0334:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            com.google.android.gms.internal.measurement.s8 r13 = r0.e(r6)
            r2.l(r12, r13, r7)
            goto L_0x0468
        L_0x0349:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = com.google.android.gms.internal.measurement.n9.h(r1, r13)
            r2.b(r12, r13)
            goto L_0x0468
        L_0x035a:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.n9.g(r1, r13)
            r2.a(r12, r7)
            goto L_0x0468
        L_0x036b:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = com.google.android.gms.internal.measurement.n9.h(r1, r13)
            r2.q(r12, r13)
            goto L_0x0468
        L_0x037c:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.n9.g(r1, r13)
            r2.p(r12, r7)
            goto L_0x0468
        L_0x038d:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.n9.g(r1, r13)
            r2.h(r12, r7)
            goto L_0x0468
        L_0x039e:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.n9.g(r1, r13)
            r2.c(r12, r7)
            goto L_0x0468
        L_0x03af:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            com.google.android.gms.internal.measurement.k6 r7 = (com.google.android.gms.internal.measurement.k6) r7
            r2.f(r12, r7)
            goto L_0x0468
        L_0x03c2:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            com.google.android.gms.internal.measurement.s8 r13 = r0.e(r6)
            r2.o(r12, r13, r7)
            goto L_0x0468
        L_0x03d7:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.n9.j(r1, r13)
            u(r12, r7, r2)
            goto L_0x0468
        L_0x03e8:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            boolean r7 = com.google.android.gms.internal.measurement.n9.v(r1, r13)
            r2.e(r12, r7)
            goto L_0x0468
        L_0x03f9:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.n9.g(r1, r13)
            r2.i(r12, r7)
            goto L_0x0468
        L_0x0409:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = com.google.android.gms.internal.measurement.n9.h(r1, r13)
            r2.j(r12, r13)
            goto L_0x0468
        L_0x0419:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.n9.g(r1, r13)
            r2.m(r12, r7)
            goto L_0x0468
        L_0x0429:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = com.google.android.gms.internal.measurement.n9.h(r1, r13)
            r2.d(r12, r13)
            goto L_0x0468
        L_0x0439:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = com.google.android.gms.internal.measurement.n9.h(r1, r13)
            r2.n(r12, r13)
            goto L_0x0468
        L_0x0449:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            float r7 = com.google.android.gms.internal.measurement.n9.f(r1, r13)
            r2.k(r12, r7)
            goto L_0x0468
        L_0x0459:
            boolean r13 = r0.r(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            double r13 = com.google.android.gms.internal.measurement.n9.e(r1, r13)
            r2.g(r12, r13)
        L_0x0468:
            int r6 = r6 + 3
            goto L_0x001c
        L_0x046c:
            com.google.android.gms.internal.measurement.e9 r1 = r4.d(r1)
            r4.i(r1, r2)
            return
        L_0x0474:
            r6.a(r1)
            throw r5
        L_0x0478:
            if (r7 != 0) goto L_0x08ca
            int r3 = r10.length
            r6 = r9
            r12 = r6
            r7 = r11
        L_0x047e:
            if (r6 >= r3) goto L_0x08c2
            int r13 = r0.E(r6)
            r14 = r10[r6]
            int r15 = r13 >>> 20
            r15 = r15 & 255(0xff, float:3.57E-43)
            r9 = 17
            sun.misc.Unsafe r5 = f5362o
            if (r15 > r9) goto L_0x04a7
            int r9 = r6 + 2
            r9 = r10[r9]
            r8 = r9 & r11
            if (r8 == r7) goto L_0x049e
            long r11 = (long) r8
            int r12 = r5.getInt(r1, r11)
            r7 = r8
        L_0x049e:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x04a9
        L_0x04a7:
            r9 = r11
            r8 = 0
        L_0x04a9:
            r11 = r13 & r9
            r13 = r10
            long r9 = (long) r11
            switch(r15) {
                case 0: goto L_0x08aa;
                case 1: goto L_0x089c;
                case 2: goto L_0x088f;
                case 3: goto L_0x0882;
                case 4: goto L_0x0875;
                case 5: goto L_0x0868;
                case 6: goto L_0x085b;
                case 7: goto L_0x084d;
                case 8: goto L_0x083f;
                case 9: goto L_0x082d;
                case 10: goto L_0x081d;
                case 11: goto L_0x080f;
                case 12: goto L_0x0801;
                case 13: goto L_0x07f3;
                case 14: goto L_0x07e5;
                case 15: goto L_0x07d7;
                case 16: goto L_0x07c9;
                case 17: goto L_0x07b7;
                case 18: goto L_0x07a8;
                case 19: goto L_0x0799;
                case 20: goto L_0x078a;
                case 21: goto L_0x077b;
                case 22: goto L_0x076c;
                case 23: goto L_0x075d;
                case 24: goto L_0x074e;
                case 25: goto L_0x073f;
                case 26: goto L_0x0731;
                case 27: goto L_0x071f;
                case 28: goto L_0x0711;
                case 29: goto L_0x0701;
                case 30: goto L_0x06f3;
                case 31: goto L_0x06e5;
                case 32: goto L_0x06d7;
                case 33: goto L_0x06c9;
                case 34: goto L_0x06bb;
                case 35: goto L_0x06ad;
                case 36: goto L_0x069f;
                case 37: goto L_0x0691;
                case 38: goto L_0x0683;
                case 39: goto L_0x0675;
                case 40: goto L_0x0667;
                case 41: goto L_0x0659;
                case 42: goto L_0x064b;
                case 43: goto L_0x063d;
                case 44: goto L_0x062f;
                case 45: goto L_0x0621;
                case 46: goto L_0x0613;
                case 47: goto L_0x0605;
                case 48: goto L_0x05f7;
                case 49: goto L_0x05e6;
                case 50: goto L_0x05d6;
                case 51: goto L_0x05c1;
                case 52: goto L_0x05ac;
                case 53: goto L_0x059d;
                case 54: goto L_0x058e;
                case 55: goto L_0x057f;
                case 56: goto L_0x0570;
                case 57: goto L_0x0561;
                case 58: goto L_0x054c;
                case 59: goto L_0x053d;
                case 60: goto L_0x052a;
                case 61: goto L_0x051a;
                case 62: goto L_0x050c;
                case 63: goto L_0x04fe;
                case 64: goto L_0x04f0;
                case 65: goto L_0x04e2;
                case 66: goto L_0x04d4;
                case 67: goto L_0x04c6;
                case 68: goto L_0x04b4;
                default: goto L_0x04b0;
            }
        L_0x04b0:
            r11 = 1
        L_0x04b1:
            r15 = 0
            goto L_0x08b7
        L_0x04b4:
            boolean r8 = r0.t(r1, r14, r6)
            if (r8 == 0) goto L_0x04b0
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.measurement.s8 r8 = r0.e(r6)
            r2.l(r14, r8, r5)
            goto L_0x04b0
        L_0x04c6:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            long r8 = F(r1, r9)
            r2.b(r14, r8)
            goto L_0x04b0
        L_0x04d4:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = z(r1, r9)
            r2.a(r14, r5)
            goto L_0x04b0
        L_0x04e2:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            long r8 = F(r1, r9)
            r2.q(r14, r8)
            goto L_0x04b0
        L_0x04f0:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = z(r1, r9)
            r2.p(r14, r5)
            goto L_0x04b0
        L_0x04fe:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = z(r1, r9)
            r2.h(r14, r5)
            goto L_0x04b0
        L_0x050c:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = z(r1, r9)
            r2.c(r14, r5)
            goto L_0x04b0
        L_0x051a:
            boolean r8 = r0.t(r1, r14, r6)
            if (r8 == 0) goto L_0x04b0
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.measurement.k6 r5 = (com.google.android.gms.internal.measurement.k6) r5
            r2.f(r14, r5)
            goto L_0x04b0
        L_0x052a:
            boolean r8 = r0.t(r1, r14, r6)
            if (r8 == 0) goto L_0x04b0
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.measurement.s8 r8 = r0.e(r6)
            r2.o(r14, r8, r5)
            goto L_0x04b0
        L_0x053d:
            boolean r8 = r0.t(r1, r14, r6)
            if (r8 == 0) goto L_0x04b0
            java.lang.Object r5 = r5.getObject(r1, r9)
            u(r14, r5, r2)
            goto L_0x04b0
        L_0x054c:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            java.lang.Object r5 = com.google.android.gms.internal.measurement.n9.j(r1, r9)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r2.e(r14, r5)
            goto L_0x04b0
        L_0x0561:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = z(r1, r9)
            r2.i(r14, r5)
            goto L_0x04b0
        L_0x0570:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            long r8 = F(r1, r9)
            r2.j(r14, r8)
            goto L_0x04b0
        L_0x057f:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = z(r1, r9)
            r2.m(r14, r5)
            goto L_0x04b0
        L_0x058e:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            long r8 = F(r1, r9)
            r2.d(r14, r8)
            goto L_0x04b0
        L_0x059d:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            long r8 = F(r1, r9)
            r2.n(r14, r8)
            goto L_0x04b0
        L_0x05ac:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            java.lang.Object r5 = com.google.android.gms.internal.measurement.n9.j(r1, r9)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r2.k(r14, r5)
            goto L_0x04b0
        L_0x05c1:
            boolean r5 = r0.t(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            java.lang.Object r5 = com.google.android.gms.internal.measurement.n9.j(r1, r9)
            java.lang.Double r5 = (java.lang.Double) r5
            double r8 = r5.doubleValue()
            r2.g(r14, r8)
            goto L_0x04b0
        L_0x05d6:
            java.lang.Object r5 = r5.getObject(r1, r9)
            if (r5 != 0) goto L_0x05de
            goto L_0x04b0
        L_0x05de:
            java.lang.Object r1 = r0.f(r6)
            com.google.android.gms.internal.measurement.b8 r1 = (com.google.android.gms.internal.measurement.b8) r1
            r1 = 0
            throw r1
        L_0x05e6:
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.s8 r9 = r0.e(r6)
            com.google.android.gms.internal.measurement.t8.i(r8, r5, r2, r9)
            goto L_0x04b0
        L_0x05f7:
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            r11 = 1
            com.google.android.gms.internal.measurement.t8.p(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0605:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.o(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0613:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.n(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0621:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.m(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x062f:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.e(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x063d:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.r(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x064b:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.b(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0659:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.f(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0667:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.g(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0675:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.j(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0683:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.s(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0691:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.k(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x069f:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.h(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x06ad:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.d(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x06bb:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            r14 = 0
            com.google.android.gms.internal.measurement.t8.p(r8, r5, r2, r14)
            goto L_0x070e
        L_0x06c9:
            r11 = 1
            r14 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.o(r8, r5, r2, r14)
            goto L_0x070e
        L_0x06d7:
            r11 = 1
            r14 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.n(r8, r5, r2, r14)
            goto L_0x070e
        L_0x06e5:
            r11 = 1
            r14 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.m(r8, r5, r2, r14)
            goto L_0x070e
        L_0x06f3:
            r11 = 1
            r14 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.e(r8, r5, r2, r14)
            goto L_0x070e
        L_0x0701:
            r11 = 1
            r14 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.r(r8, r5, r2, r14)
        L_0x070e:
            r15 = r14
            goto L_0x08b7
        L_0x0711:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.c(r8, r5, r2)
            goto L_0x04b1
        L_0x071f:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.s8 r9 = r0.e(r6)
            com.google.android.gms.internal.measurement.t8.l(r8, r5, r2, r9)
            goto L_0x04b1
        L_0x0731:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.q(r8, r5, r2)
            goto L_0x04b1
        L_0x073f:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            r15 = 0
            com.google.android.gms.internal.measurement.t8.b(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x074e:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.f(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x075d:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.g(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x076c:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.j(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x077b:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.s(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x078a:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.k(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x0799:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.h(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x07a8:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.t8.d(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x07b7:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.measurement.s8 r8 = r0.e(r6)
            r2.l(r14, r8, r5)
            goto L_0x08b7
        L_0x07c9:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            long r8 = r5.getLong(r1, r9)
            r2.b(r14, r8)
            goto L_0x08b7
        L_0x07d7:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            int r5 = r5.getInt(r1, r9)
            r2.a(r14, r5)
            goto L_0x08b7
        L_0x07e5:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            long r8 = r5.getLong(r1, r9)
            r2.q(r14, r8)
            goto L_0x08b7
        L_0x07f3:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            int r5 = r5.getInt(r1, r9)
            r2.p(r14, r5)
            goto L_0x08b7
        L_0x0801:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            int r5 = r5.getInt(r1, r9)
            r2.h(r14, r5)
            goto L_0x08b7
        L_0x080f:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            int r5 = r5.getInt(r1, r9)
            r2.c(r14, r5)
            goto L_0x08b7
        L_0x081d:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.measurement.k6 r5 = (com.google.android.gms.internal.measurement.k6) r5
            r2.f(r14, r5)
            goto L_0x08b7
        L_0x082d:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.measurement.s8 r8 = r0.e(r6)
            r2.o(r14, r8, r5)
            goto L_0x08b7
        L_0x083f:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            java.lang.Object r5 = r5.getObject(r1, r9)
            u(r14, r5, r2)
            goto L_0x08b7
        L_0x084d:
            r11 = 1
            r15 = 0
            r5 = r8 & r12
            if (r5 == 0) goto L_0x08b7
            boolean r5 = com.google.android.gms.internal.measurement.n9.v(r1, r9)
            r2.e(r14, r5)
            goto L_0x08b7
        L_0x085b:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            int r5 = r5.getInt(r1, r9)
            r2.i(r14, r5)
            goto L_0x08b7
        L_0x0868:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            long r8 = r5.getLong(r1, r9)
            r2.j(r14, r8)
            goto L_0x08b7
        L_0x0875:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            int r5 = r5.getInt(r1, r9)
            r2.m(r14, r5)
            goto L_0x08b7
        L_0x0882:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            long r8 = r5.getLong(r1, r9)
            r2.d(r14, r8)
            goto L_0x08b7
        L_0x088f:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            long r8 = r5.getLong(r1, r9)
            r2.n(r14, r8)
            goto L_0x08b7
        L_0x089c:
            r11 = 1
            r15 = 0
            r5 = r8 & r12
            if (r5 == 0) goto L_0x08b7
            float r5 = com.google.android.gms.internal.measurement.n9.f(r1, r9)
            r2.k(r14, r5)
            goto L_0x08b7
        L_0x08aa:
            r11 = 1
            r15 = 0
            r5 = r8 & r12
            if (r5 == 0) goto L_0x08b7
            double r8 = com.google.android.gms.internal.measurement.n9.e(r1, r9)
            r2.g(r14, r8)
        L_0x08b7:
            int r6 = r6 + 3
            r8 = r11
            r10 = r13
            r9 = r15
            r5 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x047e
        L_0x08c2:
            com.google.android.gms.internal.measurement.e9 r1 = r4.d(r1)
            r4.i(r1, r2)
            return
        L_0x08ca:
            r6.a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k8.c(java.lang.Object, com.google.android.gms.internal.measurement.p6):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0104, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0122, code lost:
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0126, code lost:
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0163, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ed, code lost:
        r4 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ef, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f0, code lost:
        r6 = r17 | r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f3, code lost:
        r5 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f6, code lost:
        r25 = r32;
        r2 = r7;
        r10 = r8;
        r26 = r9;
        r15 = r14;
        r6 = r17;
        r18 = -1;
        r19 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.measurement.c6 r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            boolean r0 = r15.f5369g
            if (r0 == 0) goto L_0x034e
            j(r30)
            sun.misc.Unsafe r9 = f5362o
            r10 = 0
            r7 = -1
            r0 = r32
            r1 = r7
            r2 = r10
            r6 = r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            if (r0 >= r13) goto L_0x0332
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.measurement.d6.j(r0, r12, r3, r11)
            int r3 = r11.f5174a
            r4 = r0
            r16 = r3
            goto L_0x0032
        L_0x002f:
            r16 = r0
            r4 = r3
        L_0x0032:
            int r3 = r16 >>> 3
            int r0 = r15.f5366d
            int r8 = r15.f5365c
            if (r3 <= r1) goto L_0x0045
            int r2 = r2 / 3
            if (r3 < r8) goto L_0x004e
            if (r3 > r0) goto L_0x004e
            int r0 = r15.D(r3, r2)
            goto L_0x004f
        L_0x0045:
            if (r3 < r8) goto L_0x004e
            if (r3 > r0) goto L_0x004e
            int r0 = r15.D(r3, r10)
            goto L_0x004f
        L_0x004e:
            r0 = r7
        L_0x004f:
            r8 = r0
            if (r8 != r7) goto L_0x0060
            r20 = r3
            r2 = r4
            r25 = r5
            r18 = r7
            r26 = r9
            r19 = r10
            r15 = r14
            goto L_0x030c
        L_0x0060:
            r2 = r16 & 7
            int r0 = r8 + 1
            int[] r1 = r15.f5363a
            r0 = r1[r0]
            int r7 = r0 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r0 & r17
            r20 = r3
            r32 = r4
            long r3 = (long) r10
            r10 = 17
            if (r7 > r10) goto L_0x0205
            int r10 = r8 + 2
            r1 = r1[r10]
            int r10 = r1 >>> 20
            r13 = 1
            int r10 = r13 << r10
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r13
            if (r1 == r5) goto L_0x00a0
            if (r5 == r13) goto L_0x0092
            r23 = r3
            long r3 = (long) r5
            r9.putInt(r14, r3, r6)
            goto L_0x0094
        L_0x0092:
            r23 = r3
        L_0x0094:
            if (r1 == r13) goto L_0x009c
            long r3 = (long) r1
            int r3 = r9.getInt(r14, r3)
            r6 = r3
        L_0x009c:
            r17 = r6
            r6 = r1
            goto L_0x00a5
        L_0x00a0:
            r23 = r3
            r17 = r6
            r6 = r5
        L_0x00a5:
            r1 = 5
            switch(r7) {
                case 0: goto L_0x01d9;
                case 1: goto L_0x01c3;
                case 2: goto L_0x01a3;
                case 3: goto L_0x01a3;
                case 4: goto L_0x0191;
                case 5: goto L_0x0179;
                case 6: goto L_0x0166;
                case 7: goto L_0x0147;
                case 8: goto L_0x0129;
                case 9: goto L_0x0106;
                case 10: goto L_0x00f4;
                case 11: goto L_0x0191;
                case 12: goto L_0x00e4;
                case 13: goto L_0x0166;
                case 14: goto L_0x0179;
                case 15: goto L_0x00d0;
                case 16: goto L_0x00af;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            r7 = r32
            r32 = r6
            goto L_0x01f6
        L_0x00af:
            if (r2 != 0) goto L_0x00cd
            r4 = r32
            int r7 = com.google.android.gms.internal.measurement.d6.l(r12, r4, r11)
            long r0 = r11.f5175b
            long r4 = com.google.android.gms.internal.measurement.l6.b(r0)
            r0 = r9
            r1 = r30
            r2 = r23
            r0.putLong(r1, r2, r4)
            r0 = r17 | r10
            r32 = r6
            r6 = r0
            r0 = r7
            goto L_0x01f3
        L_0x00cd:
            r4 = r32
            goto L_0x0126
        L_0x00d0:
            r4 = r32
            if (r2 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.measurement.d6.i(r12, r4, r11)
            int r1 = r11.f5174a
            int r1 = com.google.android.gms.internal.measurement.l6.a(r1)
            r2 = r23
            r9.putInt(r14, r2, r1)
            goto L_0x0122
        L_0x00e4:
            r4 = r32
            r0 = r23
            if (r2 != 0) goto L_0x0126
            int r2 = com.google.android.gms.internal.measurement.d6.i(r12, r4, r11)
            int r3 = r11.f5174a
            r9.putInt(r14, r0, r3)
            goto L_0x0104
        L_0x00f4:
            r4 = r32
            r0 = r23
            r3 = 2
            if (r2 != r3) goto L_0x0126
            int r2 = com.google.android.gms.internal.measurement.d6.a(r12, r4, r11)
            java.lang.Object r3 = r11.f5176c
            r9.putObject(r14, r0, r3)
        L_0x0104:
            r0 = r2
            goto L_0x0122
        L_0x0106:
            r4 = r32
            r3 = 2
            if (r2 != r3) goto L_0x0126
            java.lang.Object r7 = r15.g(r8, r14)
            com.google.android.gms.internal.measurement.s8 r1 = r15.e(r8)
            r0 = r7
            r2 = r31
            r3 = r4
            r4 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.d6.n(r0, r1, r2, r3, r4, r5)
            r15.o(r8, r14, r7)
        L_0x0122:
            r32 = r6
            goto L_0x01f0
        L_0x0126:
            r32 = r6
            goto L_0x0163
        L_0x0129:
            r4 = r32
            r32 = r6
            r5 = r23
            r1 = 2
            if (r2 != r1) goto L_0x0163
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x013c
            int r0 = com.google.android.gms.internal.measurement.d6.f(r12, r4, r11)
            goto L_0x0140
        L_0x013c:
            int r0 = com.google.android.gms.internal.measurement.d6.g(r12, r4, r11)
        L_0x0140:
            java.lang.Object r1 = r11.f5176c
            r9.putObject(r14, r5, r1)
            goto L_0x01f0
        L_0x0147:
            r4 = r32
            r32 = r6
            r5 = r23
            if (r2 != 0) goto L_0x0163
            int r0 = com.google.android.gms.internal.measurement.d6.l(r12, r4, r11)
            long r1 = r11.f5175b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x015d
            r1 = 1
            goto L_0x015e
        L_0x015d:
            r1 = 0
        L_0x015e:
            com.google.android.gms.internal.measurement.n9.m(r14, r5, r1)
            goto L_0x01f0
        L_0x0163:
            r7 = r4
            goto L_0x01f6
        L_0x0166:
            r4 = r32
            r32 = r6
            r5 = r23
            if (r2 != r1) goto L_0x0163
            int r0 = com.google.android.gms.internal.measurement.d6.b(r12, r4)
            r9.putInt(r14, r5, r0)
            int r4 = r4 + 4
            goto L_0x01ef
        L_0x0179:
            r4 = r32
            r32 = r6
            r5 = r23
            r0 = 1
            if (r2 != r0) goto L_0x0163
            long r21 = com.google.android.gms.internal.measurement.d6.o(r12, r4)
            r0 = r9
            r1 = r30
            r2 = r5
            r7 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x01ed
        L_0x0191:
            r7 = r32
            r32 = r6
            r5 = r23
            if (r2 != 0) goto L_0x01f6
            int r0 = com.google.android.gms.internal.measurement.d6.i(r12, r7, r11)
            int r1 = r11.f5174a
            r9.putInt(r14, r5, r1)
            goto L_0x01f0
        L_0x01a3:
            r7 = r32
            r32 = r6
            r5 = r23
            if (r2 != 0) goto L_0x01f6
            int r7 = com.google.android.gms.internal.measurement.d6.l(r12, r7, r11)
            long r2 = r11.f5175b
            r0 = r9
            r1 = r30
            r21 = r2
            r2 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r17 | r10
            r5 = r32
            r0 = r7
            goto L_0x0248
        L_0x01c3:
            r7 = r32
            r32 = r6
            r5 = r23
            if (r2 != r1) goto L_0x01f6
            int r0 = com.google.android.gms.internal.measurement.d6.b(r12, r7)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.n9.o(r14, r5, r0)
            int r4 = r7 + 4
            goto L_0x01ef
        L_0x01d9:
            r7 = r32
            r32 = r6
            r5 = r23
            r0 = 1
            if (r2 != r0) goto L_0x01f6
            long r0 = com.google.android.gms.internal.measurement.d6.o(r12, r7)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.n9.n(r14, r5, r0)
        L_0x01ed:
            int r4 = r7 + 8
        L_0x01ef:
            r0 = r4
        L_0x01f0:
            r1 = r17 | r10
            r6 = r1
        L_0x01f3:
            r5 = r32
            goto L_0x0248
        L_0x01f6:
            r25 = r32
            r2 = r7
            r10 = r8
            r26 = r9
            r15 = r14
            r6 = r17
            r18 = -1
            r19 = 0
            goto L_0x030c
        L_0x0205:
            r17 = r5
            r10 = r6
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3
            r4 = r32
            r1 = 27
            if (r7 != r1) goto L_0x0260
            r1 = 2
            if (r2 != r1) goto L_0x0251
            java.lang.Object r0 = r9.getObject(r14, r5)
            com.google.android.gms.internal.measurement.l7 r0 = (com.google.android.gms.internal.measurement.l7) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0232
            int r1 = r0.size()
            if (r1 != 0) goto L_0x022a
            r1 = 10
            goto L_0x022b
        L_0x022a:
            int r1 = r1 + r1
        L_0x022b:
            com.google.android.gms.internal.measurement.l7 r0 = r0.zzd(r1)
            r9.putObject(r14, r5, r0)
        L_0x0232:
            r5 = r0
            com.google.android.gms.internal.measurement.s8 r0 = r15.e(r8)
            r1 = r16
            r2 = r31
            r3 = r4
            r4 = r33
            r7 = r17
            r6 = r34
            int r0 = com.google.android.gms.internal.measurement.d6.d(r0, r1, r2, r3, r4, r5, r6)
            r5 = r7
            r6 = r10
        L_0x0248:
            r13 = r33
            r2 = r8
            r1 = r20
            r7 = -1
            r10 = 0
            goto L_0x001d
        L_0x0251:
            r15 = r4
            r28 = r8
            r26 = r9
            r27 = r10
            r25 = r17
            r18 = -1
            r19 = 0
            goto L_0x02c7
        L_0x0260:
            r3 = r17
            r1 = 49
            if (r7 > r1) goto L_0x02a9
            long r0 = (long) r0
            r21 = r0
            r0 = r29
            r1 = r30
            r32 = r2
            r2 = r31
            r23 = r5
            r6 = r3
            r3 = r4
            r5 = r4
            r4 = r33
            r15 = r5
            r5 = r16
            r25 = r6
            r6 = r20
            r17 = r7
            r18 = -1
            r7 = r32
            r13 = r8
            r26 = r9
            r27 = r10
            r19 = 0
            r9 = r21
            r11 = r17
            r28 = r13
            r12 = r23
            r14 = r34
            int r0 = r0.C(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02a2
            r15 = r30
            r17 = r28
            goto L_0x02ff
        L_0x02a2:
            r15 = r30
            r4 = r0
            r17 = r28
            goto L_0x0307
        L_0x02a9:
            r32 = r2
            r25 = r3
            r15 = r4
            r23 = r5
            r17 = r7
            r28 = r8
            r26 = r9
            r27 = r10
            r18 = -1
            r19 = 0
            r1 = 50
            r9 = r17
            if (r9 != r1) goto L_0x02da
            r7 = r32
            r1 = 2
            if (r7 == r1) goto L_0x02cd
        L_0x02c7:
            r4 = r15
            r17 = r28
            r15 = r30
            goto L_0x0307
        L_0x02cd:
            r14 = r29
            r15 = r30
            r10 = r23
            r13 = r28
            r14.A(r15, r13, r10)
            r0 = 0
            throw r0
        L_0x02da:
            r14 = r29
            r7 = r32
            r8 = r0
            r12 = r15
            r10 = r23
            r13 = r28
            r15 = r30
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r12
            r4 = r33
            r5 = r16
            r6 = r20
            r14 = r12
            r12 = r13
            r17 = r13
            r13 = r34
            int r0 = r0.B(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x0306
        L_0x02ff:
            r2 = r17
            r5 = r25
            r6 = r27
            goto L_0x031f
        L_0x0306:
            r4 = r0
        L_0x0307:
            r2 = r4
            r10 = r17
            r6 = r27
        L_0x030c:
            com.google.android.gms.internal.measurement.e9 r4 = w(r30)
            r0 = r16
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.d6.h(r0, r1, r2, r3, r4, r5)
            r2 = r10
            r5 = r25
        L_0x031f:
            r12 = r31
            r13 = r33
            r11 = r34
            r14 = r15
            r7 = r18
            r10 = r19
            r1 = r20
            r9 = r26
            r15 = r29
            goto L_0x001d
        L_0x0332:
            r27 = r6
            r26 = r9
            r15 = r14
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r1) goto L_0x0344
            long r1 = (long) r5
            r3 = r26
            r6 = r27
            r3.putInt(r15, r1, r6)
        L_0x0344:
            r4 = r33
            if (r0 != r4) goto L_0x0349
            return
        L_0x0349:
            com.google.android.gms.internal.measurement.o7 r0 = com.google.android.gms.internal.measurement.o7.c()
            throw r0
        L_0x034e:
            r4 = r13
            r15 = r14
            r5 = 0
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r6 = r34
            r0.v(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k8.d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.c6):void");
    }

    public final s8 e(int i8) {
        int i10 = i8 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f5364b;
        s8 s8Var = (s8) objArr[i11];
        if (s8Var != null) {
            return s8Var;
        }
        s8 a10 = p8.f5471c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final Object f(int i8) {
        int i10 = i8 / 3;
        return this.f5364b[i10 + i10];
    }

    public final Object g(int i8, Object obj) {
        s8 e10 = e(i8);
        int E = E(i8) & 1048575;
        if (!r(i8, obj)) {
            return e10.zze();
        }
        Object object = f5362o.getObject(obj, (long) E);
        if (s(object)) {
            return object;
        }
        g7 zze = e10.zze();
        if (object != null) {
            e10.zzg(zze, object);
        }
        return zze;
    }

    public final Object h(Object obj, int i8, int i10) {
        s8 e10 = e(i10);
        if (!t(obj, i8, i10)) {
            return e10.zze();
        }
        Object object = f5362o.getObject(obj, (long) (E(i10) & 1048575));
        if (s(object)) {
            return object;
        }
        g7 zze = e10.zze();
        if (object != null) {
            e10.zzg(zze, object);
        }
        return zze;
    }

    public final void k(int i8, Object obj, Object obj2) {
        if (r(i8, obj2)) {
            long E = (long) (E(i8) & 1048575);
            Unsafe unsafe = f5362o;
            Object object = unsafe.getObject(obj2, E);
            if (object != null) {
                s8 e10 = e(i8);
                if (!r(i8, obj)) {
                    if (!s(object)) {
                        unsafe.putObject(obj, E, object);
                    } else {
                        g7 zze = e10.zze();
                        e10.zzg(zze, object);
                        unsafe.putObject(obj, E, zze);
                    }
                    m(i8, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, E);
                if (!s(object2)) {
                    g7 zze2 = e10.zze();
                    e10.zzg(zze2, object2);
                    unsafe.putObject(obj, E, zze2);
                    object2 = zze2;
                }
                e10.zzg(object2, object);
                return;
            }
            int i10 = this.f5363a[i8];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i10 + " is present but null: " + obj3);
        }
    }

    public final void l(int i8, Object obj, Object obj2) {
        int[] iArr = this.f5363a;
        int i10 = iArr[i8];
        if (t(obj2, i10, i8)) {
            long E = (long) (E(i8) & 1048575);
            Unsafe unsafe = f5362o;
            Object object = unsafe.getObject(obj2, E);
            if (object != null) {
                s8 e10 = e(i8);
                if (!t(obj, i10, i8)) {
                    if (!s(object)) {
                        unsafe.putObject(obj, E, object);
                    } else {
                        g7 zze = e10.zze();
                        e10.zzg(zze, object);
                        unsafe.putObject(obj, E, zze);
                    }
                    n(obj, i10, i8);
                    return;
                }
                Object object2 = unsafe.getObject(obj, E);
                if (!s(object2)) {
                    g7 zze2 = e10.zze();
                    e10.zzg(zze2, object2);
                    unsafe.putObject(obj, E, zze2);
                    object2 = zze2;
                }
                e10.zzg(object2, object);
                return;
            }
            int i11 = iArr[i8];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i11 + " is present but null: " + obj3);
        }
    }

    public final void m(int i8, Object obj) {
        int i10 = this.f5363a[i8 + 2];
        long j10 = (long) (1048575 & i10);
        if (j10 != 1048575) {
            n9.p(obj, j10, (1 << (i10 >>> 20)) | n9.g(obj, j10));
        }
    }

    public final void n(Object obj, int i8, int i10) {
        n9.p(obj, (long) (this.f5363a[i10 + 2] & 1048575), i8);
    }

    public final void o(int i8, Object obj, Object obj2) {
        f5362o.putObject(obj, (long) (E(i8) & 1048575), obj2);
        m(i8, obj);
    }

    public final void p(Object obj, int i8, int i10, Object obj2) {
        f5362o.putObject(obj, (long) (E(i10) & 1048575), obj2);
        n(obj, i8, i10);
    }

    public final boolean q(int i8, Object obj, Object obj2) {
        return r(i8, obj) == r(i8, obj2);
    }

    public final boolean r(int i8, Object obj) {
        int i10 = this.f5363a[i8 + 2];
        long j10 = (long) (i10 & 1048575);
        if (j10 != 1048575) {
            return ((1 << (i10 >>> 20)) & n9.g(obj, j10)) != 0;
        }
        int E = E(i8);
        long j11 = (long) (E & 1048575);
        switch ((E >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(n9.e(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(n9.f(obj, j11)) != 0;
            case 2:
                return n9.h(obj, j11) != 0;
            case 3:
                return n9.h(obj, j11) != 0;
            case 4:
                return n9.g(obj, j11) != 0;
            case 5:
                return n9.h(obj, j11) != 0;
            case 6:
                return n9.g(obj, j11) != 0;
            case 7:
                return n9.v(obj, j11);
            case 8:
                Object j12 = n9.j(obj, j11);
                if (j12 instanceof String) {
                    return !((String) j12).isEmpty();
                }
                if (j12 instanceof k6) {
                    return !k6.f5359b.equals(j12);
                }
                throw new IllegalArgumentException();
            case 9:
                return n9.j(obj, j11) != null;
            case 10:
                return !k6.f5359b.equals(n9.j(obj, j11));
            case ModuleDescriptor.MODULE_VERSION:
                return n9.g(obj, j11) != 0;
            case 12:
                return n9.g(obj, j11) != 0;
            case 13:
                return n9.g(obj, j11) != 0;
            case 14:
                return n9.h(obj, j11) != 0;
            case 15:
                return n9.g(obj, j11) != 0;
            case 16:
                return n9.h(obj, j11) != 0;
            case 17:
                return n9.j(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean t(Object obj, int i8, int i10) {
        return n9.g(obj, (long) (this.f5363a[i10 + 2] & 1048575)) == i8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0391, code lost:
        if (r0 != r15) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03ef, code lost:
        if (r0 != r15) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0403, code lost:
        r6 = r38;
        r2 = r0;
        r7 = r19;
        r10 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0215, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0274, code lost:
        r0 = r18 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0292, code lost:
        r0 = r13 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0295, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02b3, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02b5, code lost:
        r13 = r0;
        r0 = r18 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02b9, code lost:
        r18 = r0;
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02bc, code lost:
        r13 = r37;
        r1 = r38;
        r4 = r10;
        r3 = r11;
        r5 = r16;
        r2 = r24;
        r11 = r6;
        r6 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02cb, code lost:
        r6 = r38;
        r30 = r9;
        r7 = r10;
        r10 = r11;
        r2 = r13;
        r14 = r15;
        r25 = r23;
        r20 = r24;
        r23 = r22;
        r22 = r4;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v7, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.measurement.c6 r39) {
        /*
            r33 = this;
            r15 = r33
            r14 = r34
            r12 = r35
            r13 = r37
            r11 = r39
            j(r34)
            sun.misc.Unsafe r9 = f5362o
            r0 = r36
            r1 = r38
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x001a:
            java.lang.Object[] r7 = r15.f5364b
            r17 = 0
            int[] r8 = r15.f5363a
            if (r0 >= r13) goto L_0x0472
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0033
            int r0 = com.google.android.gms.internal.measurement.d6.j(r0, r12, r4, r11)
            int r4 = r11.f5174a
            r32 = r4
            r4 = r0
            r0 = r32
        L_0x0033:
            int r10 = r0 >>> 3
            r20 = r1
            int r1 = r15.f5366d
            int r13 = r15.f5365c
            r21 = r7
            r7 = 3
            if (r10 <= r2) goto L_0x004f
            int r3 = r3 / r7
            if (r10 < r13) goto L_0x004a
            if (r10 > r1) goto L_0x004a
            int r1 = r15.D(r10, r3)
            goto L_0x004b
        L_0x004a:
            r1 = -1
        L_0x004b:
            r2 = r1
            r3 = -1
            r13 = 0
            goto L_0x005d
        L_0x004f:
            if (r10 < r13) goto L_0x0059
            if (r10 > r1) goto L_0x0059
            r13 = 0
            int r1 = r15.D(r10, r13)
            goto L_0x005b
        L_0x0059:
            r13 = 0
            r1 = -1
        L_0x005b:
            r2 = r1
            r3 = -1
        L_0x005d:
            if (r2 != r3) goto L_0x0078
            r7 = r0
            r23 = r3
            r2 = r4
            r16 = r5
            r18 = r6
            r25 = r8
            r30 = r9
            r24 = r13
            r14 = r15
            r6 = r20
            r22 = 1
            r20 = r10
            r10 = r24
            goto L_0x040a
        L_0x0078:
            r1 = r0 & 7
            int r18 = r2 + 1
            r13 = r8[r18]
            int r3 = r13 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r16 = r0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r13 & r7
            r23 = r8
            long r7 = (long) r0
            r0 = 17
            r24 = r10
            if (r3 > r0) goto L_0x02df
            int r0 = r2 + 2
            r0 = r23[r0]
            int r25 = r0 >>> 20
            r26 = 1
            int r25 = r26 << r25
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r10
            if (r0 == r5) goto L_0x00af
            if (r5 == r10) goto L_0x00a8
            long r10 = (long) r5
            r9.putInt(r14, r10, r6)
        L_0x00a8:
            long r5 = (long) r0
            int r6 = r9.getInt(r14, r5)
            r10 = r0
            goto L_0x00b0
        L_0x00af:
            r10 = r5
        L_0x00b0:
            r11 = r6
            r0 = 5
            switch(r3) {
                case 0: goto L_0x0297;
                case 1: goto L_0x0277;
                case 2: goto L_0x0257;
                case 3: goto L_0x0257;
                case 4: goto L_0x023c;
                case 5: goto L_0x0218;
                case 6: goto L_0x01fc;
                case 7: goto L_0x01d9;
                case 8: goto L_0x01b4;
                case 9: goto L_0x018b;
                case 10: goto L_0x0170;
                case 11: goto L_0x023c;
                case 12: goto L_0x0136;
                case 13: goto L_0x01fc;
                case 14: goto L_0x0218;
                case 15: goto L_0x0118;
                case 16: goto L_0x00e8;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            r6 = r39
            r13 = r4
            r18 = r11
            r0 = 3
            r4 = 1
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != r0) goto L_0x02cb
            java.lang.Object r7 = r15.g(r11, r14)
            int r0 = r24 << 3
            r5 = r0 | 4
            com.google.android.gms.internal.measurement.s8 r1 = r15.e(r11)
            r0 = r7
            r2 = r35
            r3 = r13
            r4 = r37
            r6 = r39
            int r0 = com.google.android.gms.internal.measurement.d6.m(r0, r1, r2, r3, r4, r5, r6)
            r15.o(r11, r14, r7)
            r6 = r18 | r25
            r5 = r16
            goto L_0x0324
        L_0x00e8:
            if (r1 != 0) goto L_0x0109
            r6 = r39
            int r13 = com.google.android.gms.internal.measurement.d6.l(r12, r4, r6)
            long r0 = r6.f5175b
            long r4 = com.google.android.gms.internal.measurement.l6.b(r0)
            r3 = r16
            r0 = r9
            r1 = r34
            r16 = r10
            r18 = r11
            r22 = -1
            r11 = r2
            r10 = r3
            r2 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x0274
        L_0x0109:
            r6 = r39
            r18 = r11
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            goto L_0x0215
        L_0x0118:
            r6 = r39
            r18 = r11
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != 0) goto L_0x0215
            int r0 = com.google.android.gms.internal.measurement.d6.i(r12, r4, r6)
            int r1 = r6.f5174a
            int r1 = com.google.android.gms.internal.measurement.l6.a(r1)
            r9.putInt(r14, r7, r1)
            goto L_0x02b5
        L_0x0136:
            r6 = r39
            r18 = r11
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != 0) goto L_0x0215
            int r0 = com.google.android.gms.internal.measurement.d6.i(r12, r4, r6)
            int r1 = r6.f5174a
            int r2 = r11 / 3
            int r2 = r2 + r2
            r3 = 1
            int r2 = r2 + r3
            r2 = r21[r2]
            com.google.android.gms.internal.measurement.i7 r2 = (com.google.android.gms.internal.measurement.i7) r2
            if (r2 == 0) goto L_0x016b
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x015d
            goto L_0x016b
        L_0x015d:
            com.google.android.gms.internal.measurement.e9 r2 = w(r34)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.c(r10, r1)
            goto L_0x02bc
        L_0x016b:
            r9.putInt(r14, r7, r1)
            goto L_0x02b5
        L_0x0170:
            r6 = r39
            r18 = r11
            r0 = 2
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != r0) goto L_0x0215
            int r0 = com.google.android.gms.internal.measurement.d6.a(r12, r4, r6)
            java.lang.Object r1 = r6.f5176c
            r9.putObject(r14, r7, r1)
            goto L_0x02b5
        L_0x018b:
            r6 = r39
            r18 = r11
            r0 = 2
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != r0) goto L_0x0215
            java.lang.Object r7 = r15.g(r11, r14)
            com.google.android.gms.internal.measurement.s8 r1 = r15.e(r11)
            r0 = r7
            r2 = r35
            r3 = r4
            r4 = r37
            r5 = r39
            int r0 = com.google.android.gms.internal.measurement.d6.n(r0, r1, r2, r3, r4, r5)
            r15.o(r11, r14, r7)
            goto L_0x02b5
        L_0x01b4:
            r6 = r39
            r18 = r11
            r0 = 2
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != r0) goto L_0x0215
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x01ce
            int r0 = com.google.android.gms.internal.measurement.d6.f(r12, r4, r6)
            goto L_0x01d2
        L_0x01ce:
            int r0 = com.google.android.gms.internal.measurement.d6.g(r12, r4, r6)
        L_0x01d2:
            java.lang.Object r1 = r6.f5176c
            r9.putObject(r14, r7, r1)
            goto L_0x02b5
        L_0x01d9:
            r6 = r39
            r18 = r11
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != 0) goto L_0x0215
            int r0 = com.google.android.gms.internal.measurement.d6.l(r12, r4, r6)
            long r1 = r6.f5175b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01f6
            r1 = 1
            goto L_0x01f7
        L_0x01f6:
            r1 = 0
        L_0x01f7:
            com.google.android.gms.internal.measurement.n9.m(r14, r7, r1)
            goto L_0x02b5
        L_0x01fc:
            r6 = r39
            r18 = r11
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != r0) goto L_0x0215
            int r0 = com.google.android.gms.internal.measurement.d6.b(r12, r4)
            r9.putInt(r14, r7, r0)
            r13 = r4
            goto L_0x0292
        L_0x0215:
            r13 = r4
            goto L_0x0295
        L_0x0218:
            r6 = r39
            r18 = r11
            r0 = 1
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != r0) goto L_0x0238
            long r26 = com.google.android.gms.internal.measurement.d6.o(r12, r4)
            r0 = r9
            r1 = r34
            r2 = r7
            r13 = r4
            r4 = r26
            r0.putLong(r1, r2, r4)
            goto L_0x02b3
        L_0x0238:
            r13 = r4
            r4 = r0
            goto L_0x02cb
        L_0x023c:
            r6 = r39
            r13 = r4
            r18 = r11
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != 0) goto L_0x0295
            int r0 = com.google.android.gms.internal.measurement.d6.i(r12, r13, r6)
            int r1 = r6.f5174a
            r9.putInt(r14, r7, r1)
            goto L_0x02b5
        L_0x0257:
            r6 = r39
            r13 = r4
            r18 = r11
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != 0) goto L_0x0295
            int r13 = com.google.android.gms.internal.measurement.d6.l(r12, r13, r6)
            long r4 = r6.f5175b
            r0 = r9
            r1 = r34
            r2 = r7
            r0.putLong(r1, r2, r4)
        L_0x0274:
            r0 = r18 | r25
            goto L_0x02b9
        L_0x0277:
            r6 = r39
            r13 = r4
            r18 = r11
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != r0) goto L_0x0295
            int r0 = com.google.android.gms.internal.measurement.d6.b(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.n9.o(r14, r7, r0)
        L_0x0292:
            int r0 = r13 + 4
            goto L_0x02b5
        L_0x0295:
            r4 = 1
            goto L_0x02cb
        L_0x0297:
            r6 = r39
            r13 = r4
            r18 = r11
            r4 = 1
            r22 = -1
            r11 = r2
            r32 = r16
            r16 = r10
            r10 = r32
            if (r1 != r4) goto L_0x02cb
            long r0 = com.google.android.gms.internal.measurement.d6.o(r12, r13)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.n9.n(r14, r7, r0)
        L_0x02b3:
            int r0 = r13 + 8
        L_0x02b5:
            r1 = r18 | r25
            r13 = r0
            r0 = r1
        L_0x02b9:
            r18 = r0
            r0 = r13
        L_0x02bc:
            r13 = r37
            r1 = r38
            r4 = r10
            r3 = r11
            r5 = r16
            r2 = r24
            r11 = r6
            r6 = r18
            goto L_0x001a
        L_0x02cb:
            r6 = r38
            r30 = r9
            r7 = r10
            r10 = r11
            r2 = r13
            r14 = r15
            r25 = r23
            r20 = r24
            r24 = 0
            r23 = r22
            r22 = r4
            goto L_0x040a
        L_0x02df:
            r11 = r2
            r2 = r4
            r10 = r16
            r4 = 1
            r22 = -1
            r0 = 27
            if (r3 != r0) goto L_0x0347
            r0 = 2
            if (r1 != r0) goto L_0x0330
            java.lang.Object r0 = r9.getObject(r14, r7)
            com.google.android.gms.internal.measurement.l7 r0 = (com.google.android.gms.internal.measurement.l7) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x030a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0302
            r1 = 10
            goto L_0x0303
        L_0x0302:
            int r1 = r1 + r1
        L_0x0303:
            com.google.android.gms.internal.measurement.l7 r0 = r0.zzd(r1)
            r9.putObject(r14, r7, r0)
        L_0x030a:
            r7 = r0
            com.google.android.gms.internal.measurement.s8 r0 = r15.e(r11)
            r1 = r10
            r3 = r2
            r2 = r35
            r4 = r37
            r16 = r5
            r5 = r7
            r18 = r6
            r6 = r39
            int r0 = com.google.android.gms.internal.measurement.d6.d(r0, r1, r2, r3, r4, r5, r6)
            r5 = r16
            r6 = r18
        L_0x0324:
            r13 = r37
            r1 = r38
            r4 = r10
            r3 = r11
            r2 = r24
            r11 = r39
            goto L_0x001a
        L_0x0330:
            r16 = r5
            r18 = r6
            r15 = r2
            r30 = r9
            r19 = r10
            r31 = r11
            r25 = r23
            r20 = r24
            r24 = 0
            r23 = r22
            r22 = r4
            goto L_0x03b7
        L_0x0347:
            r16 = r5
            r18 = r6
            r6 = r2
            r0 = 49
            if (r3 > r0) goto L_0x0395
            long r12 = (long) r13
            r0 = r33
            r5 = r1
            r1 = r34
            r2 = r35
            r36 = r3
            r3 = r6
            r25 = r4
            r4 = r37
            r26 = r5
            r5 = r10
            r15 = r6
            r6 = r24
            r28 = r7
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r26
            r32 = r23
            r23 = r22
            r22 = r25
            r25 = r32
            r8 = r11
            r30 = r9
            r19 = r10
            r20 = r24
            r24 = 0
            r9 = r12
            r12 = r39
            r13 = r11
            r11 = r36
            r31 = r13
            r12 = r28
            r14 = r39
            int r0 = r0.C(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r33
            r26 = r31
            if (r0 == r15) goto L_0x0403
            goto L_0x03f1
        L_0x0395:
            r26 = r1
            r36 = r3
            r15 = r6
            r28 = r7
            r30 = r9
            r19 = r10
            r31 = r11
            r25 = r23
            r20 = r24
            r24 = 0
            r23 = r22
            r22 = r4
            r0 = 50
            r9 = r36
            if (r9 != r0) goto L_0x03cd
            r7 = r26
            r0 = 2
            if (r7 == r0) goto L_0x03c1
        L_0x03b7:
            r14 = r33
            r6 = r38
            r2 = r15
            r7 = r19
            r10 = r31
            goto L_0x040a
        L_0x03c1:
            r14 = r33
            r15 = r34
            r10 = r28
            r12 = r31
            r14.A(r15, r12, r10)
            throw r17
        L_0x03cd:
            r14 = r33
            r8 = r15
            r7 = r26
            r10 = r28
            r12 = r31
            r15 = r34
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r8
            r4 = r37
            r5 = r19
            r6 = r20
            r15 = r8
            r8 = r13
            r26 = r12
            r13 = r39
            int r0 = r0.B(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0403
        L_0x03f1:
            r11 = r34
            r1 = r38
            r8 = r39
            r5 = r16
            r6 = r18
            r7 = r19
            r9 = r20
            r3 = r26
            goto L_0x0465
        L_0x0403:
            r6 = r38
            r2 = r0
            r7 = r19
            r10 = r26
        L_0x040a:
            if (r7 != r6) goto L_0x0419
            if (r6 == 0) goto L_0x0419
            r11 = r34
            r0 = r2
            r1 = r6
            r4 = r7
            r5 = r16
            r6 = r18
            goto L_0x0482
        L_0x0419:
            boolean r0 = r14.f5368f
            if (r0 == 0) goto L_0x044a
            com.google.android.gms.internal.measurement.s6 r0 = com.google.android.gms.internal.measurement.s6.f5517c
            r8 = r39
            com.google.android.gms.internal.measurement.s6 r1 = r8.f5177d
            if (r1 == r0) goto L_0x0447
            com.google.android.gms.internal.measurement.h8 r0 = r14.f5367e
            r9 = r20
            com.google.android.gms.internal.measurement.e7 r0 = r1.a(r0, r9)
            if (r0 != 0) goto L_0x0441
            com.google.android.gms.internal.measurement.e9 r4 = w(r34)
            r0 = r7
            r1 = r35
            r3 = r37
            r5 = r39
            int r0 = com.google.android.gms.internal.measurement.d6.h(r0, r1, r2, r3, r4, r5)
            r11 = r34
            goto L_0x045f
        L_0x0441:
            r11 = r34
            r0 = r11
            com.google.android.gms.internal.measurement.d7 r0 = (com.google.android.gms.internal.measurement.d7) r0
            throw r17
        L_0x0447:
            r11 = r34
            goto L_0x044e
        L_0x044a:
            r11 = r34
            r8 = r39
        L_0x044e:
            r9 = r20
            com.google.android.gms.internal.measurement.e9 r4 = w(r34)
            r0 = r7
            r1 = r35
            r3 = r37
            r5 = r39
            int r0 = com.google.android.gms.internal.measurement.d6.h(r0, r1, r2, r3, r4, r5)
        L_0x045f:
            r1 = r6
            r3 = r10
            r5 = r16
            r6 = r18
        L_0x0465:
            r12 = r35
            r13 = r37
            r4 = r7
            r2 = r9
            r15 = r14
            r9 = r30
            r14 = r11
            r11 = r8
            goto L_0x001a
        L_0x0472:
            r20 = r1
            r16 = r5
            r18 = r6
            r21 = r7
            r25 = r8
            r30 = r9
            r11 = r14
            r14 = r15
            r22 = 1
        L_0x0482:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x048d
            long r7 = (long) r5
            r3 = r30
            r3.putInt(r11, r7, r6)
        L_0x048d:
            int r3 = r14.f5371i
        L_0x048f:
            int r5 = r14.f5372j
            if (r3 >= r5) goto L_0x04bd
            int[] r5 = r14.f5370h
            r5 = r5[r3]
            r6 = r25[r5]
            int r6 = r14.E(r5)
            r6 = r6 & r2
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            if (r6 != 0) goto L_0x04a6
            goto L_0x04b1
        L_0x04a6:
            int r7 = r5 / 3
            int r7 = r7 + r7
            int r7 = r7 + 1
            r7 = r21[r7]
            com.google.android.gms.internal.measurement.i7 r7 = (com.google.android.gms.internal.measurement.i7) r7
            if (r7 != 0) goto L_0x04b4
        L_0x04b1:
            int r3 = r3 + 1
            goto L_0x048f
        L_0x04b4:
            com.google.android.gms.internal.measurement.c8 r6 = (com.google.android.gms.internal.measurement.c8) r6
            java.lang.Object r0 = r14.f(r5)
            com.google.android.gms.internal.measurement.b8 r0 = (com.google.android.gms.internal.measurement.b8) r0
            throw r17
        L_0x04bd:
            if (r1 != 0) goto L_0x04c9
            r2 = r37
            if (r0 != r2) goto L_0x04c4
            goto L_0x04cf
        L_0x04c4:
            com.google.android.gms.internal.measurement.o7 r0 = com.google.android.gms.internal.measurement.o7.c()
            throw r0
        L_0x04c9:
            r2 = r37
            if (r0 > r2) goto L_0x04d0
            if (r4 != r1) goto L_0x04d0
        L_0x04cf:
            return r0
        L_0x04d0:
            com.google.android.gms.internal.measurement.o7 r0 = com.google.android.gms.internal.measurement.o7.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k8.v(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.c6):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0325, code lost:
        r3 = r3 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x043b, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04c6, code lost:
        r2 = r2 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04e0, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x053a, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0547, code lost:
        r2 = r2 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int y(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            r4 = 0
            r5 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f5363a
            int r9 = r8.length
            if (r4 >= r9) goto L_0x0551
            int r9 = r15.E(r4)
            r10 = r8[r4]
            int r11 = r9 >>> 20
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 17
            r13 = 1
            sun.misc.Unsafe r14 = f5362o
            if (r11 > r12) goto L_0x0033
            int r12 = r4 + 2
            r8 = r8[r12]
            r12 = r8 & r2
            int r8 = r8 >>> 20
            if (r12 == r6) goto L_0x0030
            long r6 = (long) r12
            int r7 = r14.getInt(r1, r6)
            r6 = r12
        L_0x0030:
            int r8 = r13 << r8
            goto L_0x0034
        L_0x0033:
            r8 = 0
        L_0x0034:
            r9 = r9 & r2
            long r2 = (long) r9
            r9 = 63
            switch(r11) {
                case 0: goto L_0x053d;
                case 1: goto L_0x0530;
                case 2: goto L_0x051c;
                case 3: goto L_0x050a;
                case 4: goto L_0x04f8;
                case 5: goto L_0x04ed;
                case 6: goto L_0x04e2;
                case 7: goto L_0x04d6;
                case 8: goto L_0x04a8;
                case 9: goto L_0x0497;
                case 10: goto L_0x047c;
                case 11: goto L_0x0469;
                case 12: goto L_0x0456;
                case 13: goto L_0x044a;
                case 14: goto L_0x043e;
                case 15: goto L_0x0425;
                case 16: goto L_0x040e;
                case 17: goto L_0x03fb;
                case 18: goto L_0x03ef;
                case 19: goto L_0x03e3;
                case 20: goto L_0x03d7;
                case 21: goto L_0x03cb;
                case 22: goto L_0x03bf;
                case 23: goto L_0x03b3;
                case 24: goto L_0x03a7;
                case 25: goto L_0x039b;
                case 26: goto L_0x038f;
                case 27: goto L_0x037f;
                case 28: goto L_0x0373;
                case 29: goto L_0x0367;
                case 30: goto L_0x035b;
                case 31: goto L_0x034f;
                case 32: goto L_0x0343;
                case 33: goto L_0x0337;
                case 34: goto L_0x032b;
                case 35: goto L_0x030f;
                case 36: goto L_0x02f8;
                case 37: goto L_0x02e1;
                case 38: goto L_0x02ca;
                case 39: goto L_0x02b3;
                case 40: goto L_0x029b;
                case 41: goto L_0x0283;
                case 42: goto L_0x0269;
                case 43: goto L_0x0251;
                case 44: goto L_0x0239;
                case 45: goto L_0x0221;
                case 46: goto L_0x0209;
                case 47: goto L_0x01f1;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c9;
                case 50: goto L_0x01bc;
                case 51: goto L_0x01ae;
                case 52: goto L_0x01a0;
                case 53: goto L_0x018a;
                case 54: goto L_0x0174;
                case 55: goto L_0x015e;
                case 56: goto L_0x0150;
                case 57: goto L_0x0142;
                case 58: goto L_0x0134;
                case 59: goto L_0x0103;
                case 60: goto L_0x00ef;
                case 61: goto L_0x00d0;
                case 62: goto L_0x00ba;
                case 63: goto L_0x00a4;
                case 64: goto L_0x0096;
                case 65: goto L_0x0088;
                case 66: goto L_0x006d;
                case 67: goto L_0x0053;
                case 68: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x054a
        L_0x003d:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.measurement.h8 r2 = (com.google.android.gms.internal.measurement.h8) r2
            com.google.android.gms.internal.measurement.s8 r3 = r15.e(r4)
            int r2 = com.google.android.gms.internal.measurement.o6.s(r10, r2, r3)
            goto L_0x0549
        L_0x0053:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            long r2 = F(r1, r2)
            int r8 = r10 << 3
            long r10 = r2 + r2
            long r2 = r2 >> r9
            int r8 = com.google.android.gms.internal.measurement.o6.v(r8)
            long r2 = r2 ^ r10
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            goto L_0x04c6
        L_0x006d:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            int r2 = z(r1, r2)
            int r3 = r10 << 3
            int r8 = r2 + r2
            int r2 = r2 >> 31
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            r2 = r2 ^ r8
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x043b
        L_0x0088:
            boolean r2 = r15.t(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0547
        L_0x0096:
            boolean r2 = r15.t(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x053a
        L_0x00a4:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            int r2 = z(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.t(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0326
        L_0x00ba:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            int r2 = z(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0326
        L_0x00d0:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.measurement.k6 r2 = (com.google.android.gms.internal.measurement.k6) r2
            int r3 = r10 << 3
            java.util.logging.Logger r8 = com.google.android.gms.internal.measurement.o6.f5446d
            int r2 = r2.c()
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r8 = r8 + r2
            int r2 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x04c6
        L_0x00ef:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.measurement.s8 r3 = r15.e(r4)
            int r2 = com.google.android.gms.internal.measurement.t8.I(r10, r3, r2)
            goto L_0x0549
        L_0x0103:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.k6
            if (r3 == 0) goto L_0x0126
            com.google.android.gms.internal.measurement.k6 r2 = (com.google.android.gms.internal.measurement.k6) r2
            int r3 = r10 << 3
            java.util.logging.Logger r8 = com.google.android.gms.internal.measurement.o6.f5446d
            int r2 = r2.c()
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r8 = r8 + r2
            int r2 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x04c6
        L_0x0126:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.u(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0326
        L_0x0134:
            boolean r2 = r15.t(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x04e0
        L_0x0142:
            boolean r2 = r15.t(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x053a
        L_0x0150:
            boolean r2 = r15.t(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0547
        L_0x015e:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            int r2 = z(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.t(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0326
        L_0x0174:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            long r2 = F(r1, r2)
            int r8 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r8)
            goto L_0x0326
        L_0x018a:
            boolean r8 = r15.t(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            long r2 = F(r1, r2)
            int r8 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r8)
            goto L_0x0326
        L_0x01a0:
            boolean r2 = r15.t(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x053a
        L_0x01ae:
            boolean r2 = r15.t(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0547
        L_0x01bc:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.lang.Object r3 = r15.f(r4)
            com.google.android.gms.internal.measurement.d8.a(r2, r3)
            goto L_0x054a
        L_0x01c9:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.measurement.s8 r3 = r15.e(r4)
            int r2 = com.google.android.gms.internal.measurement.t8.D(r10, r2, r3)
            goto L_0x0549
        L_0x01d9:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.N(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x01f1:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.L(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x0209:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.C(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x0221:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.A(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x0239:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.y(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x0251:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.Q(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x0269:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r3 = com.google.android.gms.internal.measurement.t8.f5528a
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x0283:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.A(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x029b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.C(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x02b3:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.F(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x02ca:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.S(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x02e1:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.H(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x02f8:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.A(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0325
        L_0x030f:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.C(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
        L_0x0325:
            int r3 = r3 + r8
        L_0x0326:
            int r3 = r3 + r2
            int r3 = r3 + r5
            r5 = r3
            goto L_0x054a
        L_0x032b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.M(r10, r2)
            goto L_0x0549
        L_0x0337:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.K(r10, r2)
            goto L_0x0549
        L_0x0343:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.B(r10, r2)
            goto L_0x0549
        L_0x034f:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.z(r10, r2)
            goto L_0x0549
        L_0x035b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.x(r10, r2)
            goto L_0x0549
        L_0x0367:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.P(r10, r2)
            goto L_0x0549
        L_0x0373:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.w(r10, r2)
            goto L_0x0549
        L_0x037f:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.measurement.s8 r3 = r15.e(r4)
            int r2 = com.google.android.gms.internal.measurement.t8.J(r10, r2, r3)
            goto L_0x0549
        L_0x038f:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.O(r10, r2)
            goto L_0x0549
        L_0x039b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.v(r10, r2)
            goto L_0x0549
        L_0x03a7:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.z(r10, r2)
            goto L_0x0549
        L_0x03b3:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.B(r10, r2)
            goto L_0x0549
        L_0x03bf:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.E(r10, r2)
            goto L_0x0549
        L_0x03cb:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.R(r10, r2)
            goto L_0x0549
        L_0x03d7:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.G(r10, r2)
            goto L_0x0549
        L_0x03e3:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.z(r10, r2)
            goto L_0x0549
        L_0x03ef:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.B(r10, r2)
            goto L_0x0549
        L_0x03fb:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.measurement.h8 r2 = (com.google.android.gms.internal.measurement.h8) r2
            com.google.android.gms.internal.measurement.s8 r3 = r15.e(r4)
            int r2 = com.google.android.gms.internal.measurement.o6.s(r10, r2, r3)
            goto L_0x0549
        L_0x040e:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            long r2 = r14.getLong(r1, r2)
            int r8 = r10 << 3
            long r10 = r2 + r2
            long r2 = r2 >> r9
            int r8 = com.google.android.gms.internal.measurement.o6.v(r8)
            long r2 = r2 ^ r10
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            goto L_0x04c6
        L_0x0425:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r8 = r2 + r2
            int r2 = r2 >> 31
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            r2 = r2 ^ r8
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
        L_0x043b:
            int r2 = r2 + r3
            goto L_0x0549
        L_0x043e:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0547
        L_0x044a:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x053a
        L_0x0456:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.t(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x052d
        L_0x0469:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x052d
        L_0x047c:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.measurement.k6 r2 = (com.google.android.gms.internal.measurement.k6) r2
            int r3 = r10 << 3
            java.util.logging.Logger r8 = com.google.android.gms.internal.measurement.o6.f5446d
            int r2 = r2.c()
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r8 = r8 + r2
            int r2 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x04c6
        L_0x0497:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.measurement.s8 r3 = r15.e(r4)
            int r2 = com.google.android.gms.internal.measurement.t8.I(r10, r3, r2)
            goto L_0x0549
        L_0x04a8:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.k6
            if (r3 == 0) goto L_0x04c9
            com.google.android.gms.internal.measurement.k6 r2 = (com.google.android.gms.internal.measurement.k6) r2
            int r3 = r10 << 3
            java.util.logging.Logger r8 = com.google.android.gms.internal.measurement.o6.f5446d
            int r2 = r2.c()
            int r8 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r8 = r8 + r2
            int r2 = com.google.android.gms.internal.measurement.o6.v(r3)
        L_0x04c6:
            int r2 = r2 + r8
            goto L_0x0549
        L_0x04c9:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.u(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x052d
        L_0x04d6:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
        L_0x04e0:
            int r2 = r2 + r13
            goto L_0x0549
        L_0x04e2:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x053a
        L_0x04ed:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0547
        L_0x04f8:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.t(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x052d
        L_0x050a:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            long r2 = r14.getLong(r1, r2)
            int r8 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r8)
            goto L_0x052d
        L_0x051c:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            long r2 = r14.getLong(r1, r2)
            int r8 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r8)
        L_0x052d:
            int r3 = r3 + r2
            int r5 = r5 + r3
            goto L_0x054a
        L_0x0530:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
        L_0x053a:
            int r2 = r2 + 4
            goto L_0x0549
        L_0x053d:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
        L_0x0547:
            int r2 = r2 + 8
        L_0x0549:
            int r5 = r5 + r2
        L_0x054a:
            int r4 = r4 + 3
            r2 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000a
        L_0x0551:
            com.google.android.gms.internal.measurement.d9 r2 = r0.f5374l
            com.google.android.gms.internal.measurement.e9 r3 = r2.d(r1)
            int r2 = r2.a(r3)
            int r2 = r2 + r5
            boolean r3 = r0.f5368f
            if (r3 != 0) goto L_0x0561
            return r2
        L_0x0561:
            com.google.android.gms.internal.measurement.t6 r2 = r0.m
            r2.a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k8.y(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x031f, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x043b, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04d9, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04f5, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0561, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0570, code lost:
        r2 = r2 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r9.f5369g
            if (r0 == 0) goto L_0x0583
            r0 = 0
            r1 = r0
        L_0x0006:
            int[] r2 = r9.f5363a
            int r3 = r2.length
            if (r0 >= r3) goto L_0x0577
            int r3 = r9.E(r0)
            int r4 = r3 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r2[r0]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r6
            com.google.android.gms.internal.measurement.y6 r6 = com.google.android.gms.internal.measurement.y6.DOUBLE_LIST_PACKED
            int r6 = r6.zza()
            if (r4 < r6) goto L_0x002d
            com.google.android.gms.internal.measurement.y6 r6 = com.google.android.gms.internal.measurement.y6.SINT64_LIST_PACKED
            int r6 = r6.zza()
            if (r4 > r6) goto L_0x002d
            int r6 = r0 + 2
            r2 = r2[r6]
        L_0x002d:
            long r2 = (long) r3
            r6 = 63
            sun.misc.Unsafe r7 = f5362o
            switch(r4) {
                case 0: goto L_0x0564;
                case 1: goto L_0x0555;
                case 2: goto L_0x053d;
                case 3: goto L_0x0528;
                case 4: goto L_0x0513;
                case 5: goto L_0x0506;
                case 6: goto L_0x04f9;
                case 7: goto L_0x04e9;
                case 8: goto L_0x04b8;
                case 9: goto L_0x04a4;
                case 10: goto L_0x0486;
                case 11: goto L_0x0470;
                case 12: goto L_0x045a;
                case 13: goto L_0x044c;
                case 14: goto L_0x043e;
                case 15: goto L_0x0422;
                case 16: goto L_0x0408;
                case 17: goto L_0x03f2;
                case 18: goto L_0x03e6;
                case 19: goto L_0x03da;
                case 20: goto L_0x03ce;
                case 21: goto L_0x03c2;
                case 22: goto L_0x03b6;
                case 23: goto L_0x03aa;
                case 24: goto L_0x039e;
                case 25: goto L_0x0392;
                case 26: goto L_0x0386;
                case 27: goto L_0x0376;
                case 28: goto L_0x036a;
                case 29: goto L_0x035e;
                case 30: goto L_0x0352;
                case 31: goto L_0x0346;
                case 32: goto L_0x033a;
                case 33: goto L_0x032e;
                case 34: goto L_0x0322;
                case 35: goto L_0x0309;
                case 36: goto L_0x02f2;
                case 37: goto L_0x02db;
                case 38: goto L_0x02c4;
                case 39: goto L_0x02ad;
                case 40: goto L_0x0295;
                case 41: goto L_0x027d;
                case 42: goto L_0x0263;
                case 43: goto L_0x024b;
                case 44: goto L_0x0233;
                case 45: goto L_0x021b;
                case 46: goto L_0x0203;
                case 47: goto L_0x01eb;
                case 48: goto L_0x01d3;
                case 49: goto L_0x01c3;
                case 50: goto L_0x01b6;
                case 51: goto L_0x01a8;
                case 52: goto L_0x019a;
                case 53: goto L_0x0184;
                case 54: goto L_0x016e;
                case 55: goto L_0x0158;
                case 56: goto L_0x014a;
                case 57: goto L_0x013c;
                case 58: goto L_0x012e;
                case 59: goto L_0x00fd;
                case 60: goto L_0x00e9;
                case 61: goto L_0x00ca;
                case 62: goto L_0x00b4;
                case 63: goto L_0x009e;
                case 64: goto L_0x0090;
                case 65: goto L_0x0082;
                case 66: goto L_0x0067;
                case 67: goto L_0x004d;
                case 68: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0573
        L_0x0037:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            com.google.android.gms.internal.measurement.h8 r2 = (com.google.android.gms.internal.measurement.h8) r2
            com.google.android.gms.internal.measurement.s8 r3 = r9.e(r0)
            int r2 = com.google.android.gms.internal.measurement.o6.s(r5, r2, r3)
            goto L_0x0572
        L_0x004d:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            long r2 = F(r10, r2)
            int r4 = r5 << 3
            long r7 = r2 + r2
            long r2 = r2 >> r6
            int r4 = com.google.android.gms.internal.measurement.o6.v(r4)
            long r2 = r2 ^ r7
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            goto L_0x04d9
        L_0x0067:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            int r2 = z(r10, r2)
            int r3 = r5 << 3
            int r4 = r2 + r2
            int r2 = r2 >> 31
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            r2 = r2 ^ r4
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x043b
        L_0x0082:
            boolean r2 = r9.t(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0570
        L_0x0090:
            boolean r2 = r9.t(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0561
        L_0x009e:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            int r2 = z(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.t(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0551
        L_0x00b4:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            int r2 = z(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0551
        L_0x00ca:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            com.google.android.gms.internal.measurement.k6 r2 = (com.google.android.gms.internal.measurement.k6) r2
            int r3 = r5 << 3
            java.util.logging.Logger r4 = com.google.android.gms.internal.measurement.o6.f5446d
            int r2 = r2.c()
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r4 = r4 + r2
            int r2 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x04d9
        L_0x00e9:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            com.google.android.gms.internal.measurement.s8 r3 = r9.e(r0)
            int r2 = com.google.android.gms.internal.measurement.t8.I(r5, r3, r2)
            goto L_0x0572
        L_0x00fd:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.k6
            if (r3 == 0) goto L_0x0120
            com.google.android.gms.internal.measurement.k6 r2 = (com.google.android.gms.internal.measurement.k6) r2
            int r3 = r5 << 3
            java.util.logging.Logger r4 = com.google.android.gms.internal.measurement.o6.f5446d
            int r2 = r2.c()
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r4 = r4 + r2
            int r2 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x04d9
        L_0x0120:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.u(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0551
        L_0x012e:
            boolean r2 = r9.t(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x04f5
        L_0x013c:
            boolean r2 = r9.t(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0561
        L_0x014a:
            boolean r2 = r9.t(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0570
        L_0x0158:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            int r2 = z(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.t(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0551
        L_0x016e:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            long r2 = F(r10, r2)
            int r4 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r4)
            goto L_0x0551
        L_0x0184:
            boolean r4 = r9.t(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            long r2 = F(r10, r2)
            int r4 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r4)
            goto L_0x0551
        L_0x019a:
            boolean r2 = r9.t(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0561
        L_0x01a8:
            boolean r2 = r9.t(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0570
        L_0x01b6:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.lang.Object r3 = r9.f(r0)
            com.google.android.gms.internal.measurement.d8.a(r2, r3)
            goto L_0x0573
        L_0x01c3:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.measurement.s8 r3 = r9.e(r0)
            int r2 = com.google.android.gms.internal.measurement.t8.D(r5, r2, r3)
            goto L_0x0572
        L_0x01d3:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.N(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x01eb:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.L(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x0203:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.C(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x021b:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.A(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x0233:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.y(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x024b:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.Q(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x0263:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r3 = com.google.android.gms.internal.measurement.t8.f5528a
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x027d:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.A(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x0295:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.C(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x02ad:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.F(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x02c4:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.S(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x02db:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.H(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x02f2:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.A(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x031f
        L_0x0309:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.C(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
        L_0x031f:
            int r3 = r3 + r4
            goto L_0x0551
        L_0x0322:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.M(r5, r2)
            goto L_0x0572
        L_0x032e:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.K(r5, r2)
            goto L_0x0572
        L_0x033a:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.B(r5, r2)
            goto L_0x0572
        L_0x0346:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.z(r5, r2)
            goto L_0x0572
        L_0x0352:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.x(r5, r2)
            goto L_0x0572
        L_0x035e:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.P(r5, r2)
            goto L_0x0572
        L_0x036a:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.w(r5, r2)
            goto L_0x0572
        L_0x0376:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.measurement.s8 r3 = r9.e(r0)
            int r2 = com.google.android.gms.internal.measurement.t8.J(r5, r2, r3)
            goto L_0x0572
        L_0x0386:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.O(r5, r2)
            goto L_0x0572
        L_0x0392:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.v(r5, r2)
            goto L_0x0572
        L_0x039e:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.z(r5, r2)
            goto L_0x0572
        L_0x03aa:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.B(r5, r2)
            goto L_0x0572
        L_0x03b6:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.E(r5, r2)
            goto L_0x0572
        L_0x03c2:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.R(r5, r2)
            goto L_0x0572
        L_0x03ce:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.G(r5, r2)
            goto L_0x0572
        L_0x03da:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.z(r5, r2)
            goto L_0x0572
        L_0x03e6:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.measurement.t8.B(r5, r2)
            goto L_0x0572
        L_0x03f2:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            com.google.android.gms.internal.measurement.h8 r2 = (com.google.android.gms.internal.measurement.h8) r2
            com.google.android.gms.internal.measurement.s8 r3 = r9.e(r0)
            int r2 = com.google.android.gms.internal.measurement.o6.s(r5, r2, r3)
            goto L_0x0572
        L_0x0408:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            long r2 = com.google.android.gms.internal.measurement.n9.h(r10, r2)
            int r4 = r5 << 3
            long r7 = r2 + r2
            long r2 = r2 >> r6
            int r4 = com.google.android.gms.internal.measurement.o6.v(r4)
            long r2 = r2 ^ r7
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            goto L_0x04d9
        L_0x0422:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            int r2 = com.google.android.gms.internal.measurement.n9.g(r10, r2)
            int r3 = r5 << 3
            int r4 = r2 + r2
            int r2 = r2 >> 31
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            r2 = r2 ^ r4
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
        L_0x043b:
            int r2 = r2 + r3
            goto L_0x0572
        L_0x043e:
            boolean r2 = r9.r(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0570
        L_0x044c:
            boolean r2 = r9.r(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0561
        L_0x045a:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            int r2 = com.google.android.gms.internal.measurement.n9.g(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.t(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0551
        L_0x0470:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            int r2 = com.google.android.gms.internal.measurement.n9.g(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0551
        L_0x0486:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            com.google.android.gms.internal.measurement.k6 r2 = (com.google.android.gms.internal.measurement.k6) r2
            int r3 = r5 << 3
            java.util.logging.Logger r4 = com.google.android.gms.internal.measurement.o6.f5446d
            int r2 = r2.c()
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r4 = r4 + r2
            int r2 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x04d9
        L_0x04a4:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            com.google.android.gms.internal.measurement.s8 r3 = r9.e(r0)
            int r2 = com.google.android.gms.internal.measurement.t8.I(r5, r3, r2)
            goto L_0x0572
        L_0x04b8:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.measurement.n9.j(r10, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.k6
            if (r3 == 0) goto L_0x04dc
            com.google.android.gms.internal.measurement.k6 r2 = (com.google.android.gms.internal.measurement.k6) r2
            int r3 = r5 << 3
            java.util.logging.Logger r4 = com.google.android.gms.internal.measurement.o6.f5446d
            int r2 = r2.c()
            int r4 = com.google.android.gms.internal.measurement.o6.v(r2)
            int r4 = r4 + r2
            int r2 = com.google.android.gms.internal.measurement.o6.v(r3)
        L_0x04d9:
            int r2 = r2 + r4
            goto L_0x0572
        L_0x04dc:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.u(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0551
        L_0x04e9:
            boolean r2 = r9.r(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
        L_0x04f5:
            int r2 = r2 + 1
            goto L_0x0572
        L_0x04f9:
            boolean r2 = r9.r(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0561
        L_0x0506:
            boolean r2 = r9.r(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
            goto L_0x0570
        L_0x0513:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            int r2 = com.google.android.gms.internal.measurement.n9.g(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.t(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r3)
            goto L_0x0551
        L_0x0528:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            long r2 = com.google.android.gms.internal.measurement.n9.h(r10, r2)
            int r4 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r4)
            goto L_0x0551
        L_0x053d:
            boolean r4 = r9.r(r0, r10)
            if (r4 == 0) goto L_0x0573
            long r2 = com.google.android.gms.internal.measurement.n9.h(r10, r2)
            int r4 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.w(r2)
            int r3 = com.google.android.gms.internal.measurement.o6.v(r4)
        L_0x0551:
            int r3 = r3 + r2
            int r3 = r3 + r1
            r1 = r3
            goto L_0x0573
        L_0x0555:
            boolean r2 = r9.r(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
        L_0x0561:
            int r2 = r2 + 4
            goto L_0x0572
        L_0x0564:
            boolean r2 = r9.r(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.measurement.o6.v(r2)
        L_0x0570:
            int r2 = r2 + 8
        L_0x0572:
            int r1 = r1 + r2
        L_0x0573:
            int r0 = r0 + 3
            goto L_0x0006
        L_0x0577:
            com.google.android.gms.internal.measurement.d9 r0 = r9.f5374l
            com.google.android.gms.internal.measurement.e9 r10 = r0.d(r10)
            int r10 = r0.a(r10)
            int r10 = r10 + r1
            goto L_0x0587
        L_0x0583:
            int r10 = r9.y(r10)
        L_0x0587:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k8.zza(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c4, code lost:
        r4 = 37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c6, code lost:
        r3 = r3 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01de, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e1, code lost:
        r8 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e2, code lost:
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0217, code lost:
        r3 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0226, code lost:
        r4 = (int) (r4 ^ (r4 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x022c, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022d, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r11) {
        /*
            r10 = this;
            int[] r0 = r10.f5363a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            if (r2 >= r1) goto L_0x0231
            int r4 = r10.E(r2)
            r5 = r0[r2]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r4
            int r4 = r4 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r6 = (long) r6
            r8 = 1231(0x4cf, float:1.725E-42)
            r9 = 1237(0x4d5, float:1.733E-42)
            switch(r4) {
                case 0: goto L_0x021a;
                case 1: goto L_0x020d;
                case 2: goto L_0x0204;
                case 3: goto L_0x01fb;
                case 4: goto L_0x01f4;
                case 5: goto L_0x01eb;
                case 6: goto L_0x01e4;
                case 7: goto L_0x01d6;
                case 8: goto L_0x01c9;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ae;
                case 11: goto L_0x01a6;
                case 12: goto L_0x019e;
                case 13: goto L_0x0196;
                case 14: goto L_0x018c;
                case 15: goto L_0x0184;
                case 16: goto L_0x017a;
                case 17: goto L_0x016f;
                case 18: goto L_0x0163;
                case 19: goto L_0x0163;
                case 20: goto L_0x0163;
                case 21: goto L_0x0163;
                case 22: goto L_0x0163;
                case 23: goto L_0x0163;
                case 24: goto L_0x0163;
                case 25: goto L_0x0163;
                case 26: goto L_0x0163;
                case 27: goto L_0x0163;
                case 28: goto L_0x0163;
                case 29: goto L_0x0163;
                case 30: goto L_0x0163;
                case 31: goto L_0x0163;
                case 32: goto L_0x0163;
                case 33: goto L_0x0163;
                case 34: goto L_0x0163;
                case 35: goto L_0x0163;
                case 36: goto L_0x0163;
                case 37: goto L_0x0163;
                case 38: goto L_0x0163;
                case 39: goto L_0x0163;
                case 40: goto L_0x0163;
                case 41: goto L_0x0163;
                case 42: goto L_0x0163;
                case 43: goto L_0x0163;
                case 44: goto L_0x0163;
                case 45: goto L_0x0163;
                case 46: goto L_0x0163;
                case 47: goto L_0x0163;
                case 48: goto L_0x0163;
                case 49: goto L_0x0163;
                case 50: goto L_0x0157;
                case 51: goto L_0x013d;
                case 52: goto L_0x0125;
                case 53: goto L_0x0115;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e7;
                case 57: goto L_0x00d9;
                case 58: goto L_0x00c1;
                case 59: goto L_0x00ad;
                case 60: goto L_0x009b;
                case 61: goto L_0x0089;
                case 62: goto L_0x007b;
                case 63: goto L_0x006d;
                case 64: goto L_0x005f;
                case 65: goto L_0x004f;
                case 66: goto L_0x0041;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x022d
        L_0x001f:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            int r3 = r3 * 53
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x0031:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            long r4 = F(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x0041:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = z(r11, r6)
            goto L_0x0217
        L_0x004f:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            long r4 = F(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x005f:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = z(r11, r6)
            goto L_0x0217
        L_0x006d:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = z(r11, r6)
            goto L_0x0217
        L_0x007b:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = z(r11, r6)
            goto L_0x0217
        L_0x0089:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x009b:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            int r3 = r3 * 53
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x00ad:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x00c1:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.nio.charset.Charset r5 = com.google.android.gms.internal.measurement.m7.f5399a
            if (r4 == 0) goto L_0x01e1
            goto L_0x01e2
        L_0x00d9:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = z(r11, r6)
            goto L_0x0217
        L_0x00e7:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            long r4 = F(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x00f7:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = z(r11, r6)
            goto L_0x0217
        L_0x0105:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            long r4 = F(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x0115:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            long r4 = F(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x0125:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x0217
        L_0x013d:
            boolean r4 = r10.t(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            long r4 = java.lang.Double.doubleToLongBits(r4)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x0157:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x0163:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x016f:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            if (r4 == 0) goto L_0x01c4
            int r4 = r4.hashCode()
            goto L_0x01c6
        L_0x017a:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.measurement.n9.h(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x0184:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.measurement.n9.g(r11, r6)
            goto L_0x0217
        L_0x018c:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.measurement.n9.h(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x0196:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.measurement.n9.g(r11, r6)
            goto L_0x0217
        L_0x019e:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.measurement.n9.g(r11, r6)
            goto L_0x0217
        L_0x01a6:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.measurement.n9.g(r11, r6)
            goto L_0x0217
        L_0x01ae:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x01b9:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            if (r4 == 0) goto L_0x01c4
            int r4 = r4.hashCode()
            goto L_0x01c6
        L_0x01c4:
            r4 = 37
        L_0x01c6:
            int r3 = r3 * 53
            goto L_0x022c
        L_0x01c9:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.measurement.n9.j(r11, r6)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x01d6:
            int r3 = r3 * 53
            boolean r4 = com.google.android.gms.internal.measurement.n9.v(r11, r6)
            java.nio.charset.Charset r5 = com.google.android.gms.internal.measurement.m7.f5399a
            if (r4 == 0) goto L_0x01e1
            goto L_0x01e2
        L_0x01e1:
            r8 = r9
        L_0x01e2:
            r4 = r8
            goto L_0x0217
        L_0x01e4:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.measurement.n9.g(r11, r6)
            goto L_0x0217
        L_0x01eb:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.measurement.n9.h(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x01f4:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.measurement.n9.g(r11, r6)
            goto L_0x0217
        L_0x01fb:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.measurement.n9.h(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x0204:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.measurement.n9.h(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
            goto L_0x0226
        L_0x020d:
            int r3 = r3 * 53
            float r4 = com.google.android.gms.internal.measurement.n9.f(r11, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
        L_0x0217:
            int r4 = r4 + r3
            r3 = r4
            goto L_0x022d
        L_0x021a:
            int r3 = r3 * 53
            double r4 = com.google.android.gms.internal.measurement.n9.e(r11, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.m7.f5399a
        L_0x0226:
            r6 = 32
            long r6 = r4 >>> r6
            long r4 = r4 ^ r6
            int r4 = (int) r4
        L_0x022c:
            int r3 = r3 + r4
        L_0x022d:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0231:
            int r3 = r3 * 53
            com.google.android.gms.internal.measurement.d9 r0 = r10.f5374l
            com.google.android.gms.internal.measurement.e9 r0 = r0.d(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r3
            boolean r1 = r10.f5368f
            if (r1 != 0) goto L_0x0243
            return r0
        L_0x0243:
            com.google.android.gms.internal.measurement.t6 r0 = r10.m
            r0.a(r11)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k8.zzb(java.lang.Object):int");
    }

    public final g7 zze() {
        return (g7) ((g7) this.f5367e).s(4);
    }

    public final void zzf(Object obj) {
        if (s(obj)) {
            if (obj instanceof g7) {
                g7 g7Var = (g7) obj;
                g7Var.q();
                g7Var.zzb = 0;
                g7Var.o();
            }
            int[] iArr = this.f5363a;
            int length = iArr.length;
            for (int i8 = 0; i8 < length; i8 += 3) {
                int E = E(i8);
                int i10 = 1048575 & E;
                int i11 = (E >>> 20) & 255;
                long j10 = (long) i10;
                Unsafe unsafe = f5362o;
                if (i11 != 9) {
                    if (i11 == 60 || i11 == 68) {
                        if (t(obj, iArr[i8], i8)) {
                            e(i8).zzf(unsafe.getObject(obj, j10));
                        }
                    } else {
                        switch (i11) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f5373k.a(obj, j10);
                                continue;
                            case 50:
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((c8) object).g();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (r(i8, obj)) {
                    e(i8).zzf(unsafe.getObject(obj, j10));
                }
            }
            this.f5374l.g(obj);
            if (this.f5368f) {
                this.m.b(obj);
            }
        }
    }

    public final void zzg(Object obj, Object obj2) {
        j(obj);
        obj2.getClass();
        int i8 = 0;
        while (true) {
            int[] iArr = this.f5363a;
            if (i8 < iArr.length) {
                int E = E(i8);
                int i10 = iArr[i8];
                long j10 = (long) (1048575 & E);
                switch ((E >>> 20) & 255) {
                    case 0:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.n(obj, j10, n9.e(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 1:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.o(obj, j10, n9.f(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 2:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.q(obj, j10, n9.h(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 3:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.q(obj, j10, n9.h(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 4:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.p(obj, j10, n9.g(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 5:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.q(obj, j10, n9.h(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 6:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.p(obj, j10, n9.g(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 7:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.m(obj, j10, n9.v(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 8:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.r(obj, j10, n9.j(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 9:
                        k(i8, obj, obj2);
                        break;
                    case 10:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.r(obj, j10, n9.j(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.p(obj, j10, n9.g(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 12:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.p(obj, j10, n9.g(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 13:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.p(obj, j10, n9.g(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 14:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.q(obj, j10, n9.h(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 15:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.p(obj, j10, n9.g(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 16:
                        if (!r(i8, obj2)) {
                            break;
                        } else {
                            n9.q(obj, j10, n9.h(obj2, j10));
                            m(i8, obj);
                            break;
                        }
                    case 17:
                        k(i8, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f5373k.b(obj, j10, obj2);
                        break;
                    case 50:
                        Class cls = t8.f5528a;
                        n9.r(obj, j10, d8.b(n9.j(obj, j10), n9.j(obj2, j10)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!t(obj2, i10, i8)) {
                            break;
                        } else {
                            n9.r(obj, j10, n9.j(obj2, j10));
                            n(obj, i10, i8);
                            break;
                        }
                    case 60:
                        l(i8, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!t(obj2, i10, i8)) {
                            break;
                        } else {
                            n9.r(obj, j10, n9.j(obj2, j10));
                            n(obj, i10, i8);
                            break;
                        }
                    case 68:
                        l(i8, obj, obj2);
                        break;
                }
                i8 += 3;
            } else {
                Class cls2 = t8.f5528a;
                d9 d9Var = this.f5374l;
                d9Var.h(obj, d9Var.e(d9Var.d(obj), d9Var.d(obj2)));
                if (this.f5368f) {
                    this.m.a(obj2);
                    throw null;
                }
                return;
            }
        }
    }
}
