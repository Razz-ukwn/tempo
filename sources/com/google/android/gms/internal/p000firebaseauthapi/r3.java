package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r3  reason: invalid package */
public final class r3<T> implements z3<T> {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f4859o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Unsafe f4860p = u4.k();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f4861a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f4862b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4863c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4864d;

    /* renamed from: e  reason: collision with root package name */
    public final o3 f4865e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4866f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4867g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4868h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f4869i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4870j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4871k;

    /* renamed from: l  reason: collision with root package name */
    public final d3 f4872l;
    public final k4 m;

    /* renamed from: n  reason: collision with root package name */
    public final d2 f4873n;

    public r3(int[] iArr, Object[] objArr, int i8, int i10, o3 o3Var, boolean z10, int[] iArr2, int i11, int i12, d3 d3Var, k4 k4Var, d2 d2Var) {
        this.f4861a = iArr;
        this.f4862b = objArr;
        this.f4863c = i8;
        this.f4864d = i10;
        this.f4867g = o3Var instanceof p2;
        this.f4868h = z10;
        this.f4866f = d2Var != null && d2Var.h(o3Var);
        this.f4869i = iArr2;
        this.f4870j = i11;
        this.f4871k = i12;
        this.f4872l = d3Var;
        this.m = k4Var;
        this.f4873n = d2Var;
        this.f4865e = o3Var;
    }

    public static l4 B(Object obj) {
        p2 p2Var = (p2) obj;
        l4 l4Var = p2Var.zzc;
        if (l4Var != l4.f4703f) {
            return l4Var;
        }
        l4 b10 = l4.b();
        p2Var.zzc = b10;
        return b10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0281  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.p000firebaseauthapi.r3 C(com.google.android.gms.internal.p000firebaseauthapi.m3 r34, com.google.android.gms.internal.p000firebaseauthapi.d3 r35, com.google.android.gms.internal.p000firebaseauthapi.k4 r36, com.google.android.gms.internal.p000firebaseauthapi.d2 r37) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof com.google.android.gms.internal.p000firebaseauthapi.y3
            if (r1 == 0) goto L_0x03cf
            com.google.android.gms.internal.firebase-auth-api.y3 r0 = (com.google.android.gms.internal.p000firebaseauthapi.y3) r0
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
            int[] r8 = f4859o
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
            com.google.android.gms.internal.firebase-auth-api.o3 r8 = r0.zza()
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
            sun.misc.Unsafe r1 = f4860p
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
            java.lang.reflect.Field r3 = m(r8, r3)
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
            java.lang.reflect.Field r13 = m(r8, r13)
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
            java.lang.reflect.Field r13 = m(r8, r13)
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
            java.lang.reflect.Field r3 = m(r8, r3)
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
            com.google.android.gms.internal.firebase-auth-api.r3 r1 = new com.google.android.gms.internal.firebase-auth-api.r3
            com.google.android.gms.internal.firebase-auth-api.o3 r22 = r0.zza()
            r17 = r1
            r18 = r11
            r19 = r10
            r27 = r35
            r28 = r36
            r29 = r37
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x03cf:
            com.google.android.gms.internal.firebase-auth-api.i4 r0 = (com.google.android.gms.internal.p000firebaseauthapi.i4) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.r3.C(com.google.android.gms.internal.firebase-auth-api.m3, com.google.android.gms.internal.firebase-auth-api.d3, com.google.android.gms.internal.firebase-auth-api.k4, com.google.android.gms.internal.firebase-auth-api.d2):com.google.android.gms.internal.firebase-auth-api.r3");
    }

    public static int E(Object obj, long j10) {
        return ((Integer) u4.j(obj, j10)).intValue();
    }

    public static long f(Object obj, long j10) {
        return ((Long) u4.j(obj, j10)).longValue();
    }

    public static Field m(Class cls, String str) {
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

    public static void n(Object obj) {
        if (!x(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean x(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof p2) {
            return ((p2) obj).k();
        }
        return true;
    }

    public static final void z(int i8, Object obj, z1 z1Var) {
        if (obj instanceof String) {
            z1Var.f5119a.w(i8, (String) obj);
            return;
        }
        z1Var.f(i8, (q1) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0329, code lost:
        if (r0 != r15) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x038f, code lost:
        if (r0 != r15) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03a3, code lost:
        r6 = r34;
        r2 = r0;
        r9 = r19;
        r8 = r20;
        r7 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018b, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0203, code lost:
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0204, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x021b, code lost:
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0235, code lost:
        r1 = r24 | r23;
        r4 = r6;
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0252, code lost:
        r0 = r5 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026b, code lost:
        r0 = r5 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026d, code lost:
        r1 = r24 | r23;
        r13 = r4;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0272, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0274, code lost:
        r6 = r7;
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0278, code lost:
        r6 = r34;
        r2 = r5;
        r18 = r7;
        r9 = r8;
        r27 = r11;
        r8 = r13;
        r14 = r15;
        r17 = r16;
        r32 = r22;
        r7 = r24;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.p000firebaseauthapi.h1 r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            n(r30)
            sun.misc.Unsafe r11 = f4860p
            r0 = r32
            r1 = r34
            r4 = r35
            r2 = 0
            r3 = -1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
        L_0x001a:
            if (r0 >= r13) goto L_0x0413
            int r2 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.j(r0, r12, r2, r4)
            int r2 = r4.f4604a
            goto L_0x002e
        L_0x0029:
            r28 = r2
            r2 = r0
            r0 = r28
        L_0x002e:
            int r10 = r2 >>> 3
            int r8 = r15.f4864d
            int r9 = r15.f4863c
            r19 = r1
            r1 = 3
            if (r10 <= r3) goto L_0x0048
            int r5 = r5 / r1
            if (r10 < r9) goto L_0x0043
            if (r10 > r8) goto L_0x0043
            int r3 = r15.I(r10, r5)
            goto L_0x0044
        L_0x0043:
            r3 = -1
        L_0x0044:
            r8 = r3
            r5 = -1
            r9 = 0
            goto L_0x0056
        L_0x0048:
            if (r10 < r9) goto L_0x0052
            if (r10 > r8) goto L_0x0052
            r9 = 0
            int r3 = r15.I(r10, r9)
            goto L_0x0054
        L_0x0052:
            r9 = 0
            r3 = -1
        L_0x0054:
            r8 = r3
            r5 = -1
        L_0x0056:
            if (r8 != r5) goto L_0x0069
            r8 = r2
            r17 = r5
            r18 = r6
            r16 = r9
            r32 = r10
            r27 = r11
            r14 = r15
            r6 = r19
            r2 = r0
            goto L_0x03ac
        L_0x0069:
            r3 = r2 & 7
            int r17 = r8 + 1
            int[] r5 = r15.f4861a
            r9 = r5[r17]
            int r1 = r9 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            r21 = r2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r9 & r16
            r19 = r9
            r22 = r10
            long r9 = (long) r2
            r2 = 17
            if (r1 > r2) goto L_0x028c
            int r2 = r8 + 2
            r2 = r5[r2]
            int r5 = r2 >>> 20
            r13 = 1
            int r23 = r13 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r5
            if (r2 == r6) goto L_0x00a3
            if (r6 == r5) goto L_0x009a
            long r5 = (long) r6
            r11.putInt(r14, r5, r7)
        L_0x009a:
            long r5 = (long) r2
            int r7 = r11.getInt(r14, r5)
            r24 = r7
            r7 = r2
            goto L_0x00a6
        L_0x00a3:
            r24 = r7
            r7 = r6
        L_0x00a6:
            r2 = 5
            switch(r1) {
                case 0: goto L_0x0255;
                case 1: goto L_0x023c;
                case 2: goto L_0x021d;
                case 3: goto L_0x021d;
                case 4: goto L_0x0207;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01cf;
                case 7: goto L_0x01b0;
                case 8: goto L_0x018e;
                case 9: goto L_0x0166;
                case 10: goto L_0x0150;
                case 11: goto L_0x0207;
                case 12: goto L_0x011d;
                case 13: goto L_0x01cf;
                case 14: goto L_0x01e5;
                case 15: goto L_0x0104;
                case 16: goto L_0x00d8;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            r5 = r0
            r4 = r21
            r0 = 3
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 != r0) goto L_0x0272
            java.lang.Object r9 = r15.k(r14, r8)
            int r0 = r22 << 3
            r6 = r0 | 4
            com.google.android.gms.internal.firebase-auth-api.z3 r1 = r15.h(r8)
            r0 = r9
            r2 = r31
            r3 = r5
            r13 = r4
            r4 = r33
            r5 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.m(r0, r1, r2, r3, r4, r5, r6)
            r15.t(r14, r8, r9)
            r1 = r24 | r23
            r4 = r35
            goto L_0x0274
        L_0x00d8:
            if (r3 != 0) goto L_0x00fa
            int r6 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r12, r0, r4)
            long r0 = r4.f4605b
            long r25 = com.google.android.gms.internal.p000firebaseauthapi.t1.f(r0)
            r0 = r11
            r1 = r30
            r13 = r21
            r2 = r9
            r9 = r4
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r25
            r0.putLong(r1, r2, r4)
            r18 = r6
            r6 = r9
            goto L_0x0235
        L_0x00fa:
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r0
            r13 = r21
            goto L_0x0278
        L_0x0104:
            r6 = r4
            r13 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 != 0) goto L_0x018b
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r12, r0, r6)
            int r1 = r6.f4604a
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.t1.e(r1)
            r11.putInt(r14, r9, r1)
            goto L_0x021b
        L_0x011d:
            r6 = r4
            r13 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 != 0) goto L_0x018b
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r12, r0, r6)
            int r1 = r6.f4604a
            com.google.android.gms.internal.firebase-auth-api.s2 r2 = r15.g(r8)
            if (r2 == 0) goto L_0x014b
            boolean r2 = r2.zza()
            if (r2 == 0) goto L_0x013a
            goto L_0x014b
        L_0x013a:
            com.google.android.gms.internal.firebase-auth-api.l4 r2 = B(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.c(r13, r1)
            r4 = r6
            r1 = r24
            goto L_0x0274
        L_0x014b:
            r11.putInt(r14, r9, r1)
            goto L_0x021b
        L_0x0150:
            r6 = r4
            r13 = r21
            r1 = 2
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 != r1) goto L_0x018b
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.a(r12, r0, r6)
            java.lang.Object r1 = r6.f4606c
            r11.putObject(r14, r9, r1)
            goto L_0x021b
        L_0x0166:
            r6 = r4
            r13 = r21
            r1 = 2
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 != r1) goto L_0x018b
            java.lang.Object r9 = r15.k(r14, r8)
            com.google.android.gms.internal.firebase-auth-api.z3 r1 = r15.h(r8)
            r4 = r0
            r0 = r9
            r2 = r31
            r3 = r4
            r4 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.n(r0, r1, r2, r3, r4, r5)
            r15.t(r14, r8, r9)
            goto L_0x021b
        L_0x018b:
            r5 = r0
            goto L_0x0278
        L_0x018e:
            r6 = r4
            r13 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r0
            r0 = 2
            if (r3 != r0) goto L_0x0204
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x01a5
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.f(r12, r4, r6)
            goto L_0x01a9
        L_0x01a5:
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.g(r12, r4, r6)
        L_0x01a9:
            java.lang.Object r1 = r6.f4606c
            r11.putObject(r14, r9, r1)
            goto L_0x021b
        L_0x01b0:
            r6 = r4
            r5 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r0
            if (r3 != 0) goto L_0x0203
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r12, r4, r6)
            long r1 = r6.f4605b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01c8
            goto L_0x01c9
        L_0x01c8:
            r13 = 0
        L_0x01c9:
            com.google.android.gms.internal.p000firebaseauthapi.u4.m(r14, r9, r13)
            r4 = r5
            goto L_0x026d
        L_0x01cf:
            r6 = r4
            r5 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r0
            if (r3 != r2) goto L_0x0203
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.b(r12, r4)
            r11.putInt(r14, r9, r0)
            r13 = r5
            r5 = r4
            goto L_0x0252
        L_0x01e5:
            r6 = r4
            r5 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r0
            if (r3 != r13) goto L_0x0203
            long r18 = com.google.android.gms.internal.p000firebaseauthapi.i1.o(r12, r4)
            r0 = r11
            r1 = r30
            r2 = r9
            r9 = r4
            r13 = r5
            r4 = r18
            r0.putLong(r1, r2, r4)
            r5 = r9
            r4 = r13
            goto L_0x026b
        L_0x0203:
            r13 = r5
        L_0x0204:
            r5 = r4
            goto L_0x0278
        L_0x0207:
            r5 = r0
            r6 = r4
            r13 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 != 0) goto L_0x0278
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r12, r5, r6)
            int r1 = r6.f4604a
            r11.putInt(r14, r9, r1)
        L_0x021b:
            r4 = r13
            goto L_0x026d
        L_0x021d:
            r5 = r0
            r6 = r4
            r13 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 != 0) goto L_0x0278
            int r18 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r12, r5, r6)
            long r4 = r6.f4605b
            r0 = r11
            r1 = r30
            r2 = r9
            r0.putLong(r1, r2, r4)
        L_0x0235:
            r0 = r24 | r23
            r1 = r0
            r4 = r6
            r0 = r18
            goto L_0x0274
        L_0x023c:
            r5 = r0
            r6 = r4
            r13 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 != r2) goto L_0x0278
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.b(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.p000firebaseauthapi.u4.p(r14, r9, r0)
        L_0x0252:
            int r0 = r5 + 4
            goto L_0x021b
        L_0x0255:
            r5 = r0
            r6 = r4
            r4 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 != r13) goto L_0x0272
            long r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.o(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.p000firebaseauthapi.u4.o(r14, r9, r0)
        L_0x026b:
            int r0 = r5 + 8
        L_0x026d:
            r1 = r24 | r23
            r13 = r4
            r4 = r6
            goto L_0x0274
        L_0x0272:
            r13 = r4
            goto L_0x0278
        L_0x0274:
            r6 = r7
            r7 = r1
            goto L_0x02d0
        L_0x0278:
            r6 = r34
            r2 = r5
            r18 = r7
            r9 = r8
            r27 = r11
            r8 = r13
            r14 = r15
            r17 = r16
            r32 = r22
            r7 = r24
            r16 = 0
            goto L_0x03ac
        L_0x028c:
            r5 = r0
            r13 = r21
            r16 = -1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r1 != r0) goto L_0x02ed
            r0 = 2
            if (r3 != r0) goto L_0x02da
            java.lang.Object r0 = r11.getObject(r14, r9)
            com.google.android.gms.internal.firebase-auth-api.t2 r0 = (com.google.android.gms.internal.p000firebaseauthapi.t2) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x02b8
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02b0
            r1 = 10
            goto L_0x02b1
        L_0x02b0:
            int r1 = r1 + r1
        L_0x02b1:
            com.google.android.gms.internal.firebase-auth-api.t2 r0 = r0.zzd(r1)
            r11.putObject(r14, r9, r0)
        L_0x02b8:
            r9 = r0
            com.google.android.gms.internal.firebase-auth-api.z3 r0 = r15.h(r8)
            r1 = r13
            r2 = r31
            r3 = r5
            r4 = r33
            r5 = r9
            r18 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.d(r0, r1, r2, r3, r4, r5, r6)
            r4 = r35
            r6 = r18
        L_0x02d0:
            r1 = r34
            r5 = r8
            r2 = r13
            r3 = r22
            r13 = r33
            goto L_0x001a
        L_0x02da:
            r18 = r6
            r15 = r5
            r25 = r7
            r26 = r8
            r27 = r11
            r20 = r13
            r17 = r16
            r32 = r22
            r16 = 0
            goto L_0x034f
        L_0x02ed:
            r18 = r6
            r0 = 49
            if (r1 > r0) goto L_0x032d
            r23 = r9
            r6 = r19
            long r9 = (long) r6
            r0 = r29
            r6 = r1
            r1 = r30
            r2 = r31
            r4 = r3
            r3 = r5
            r19 = r4
            r4 = r33
            r15 = r5
            r5 = r13
            r21 = r6
            r6 = r22
            r25 = r7
            r7 = r19
            r26 = r8
            r17 = r16
            r32 = r22
            r16 = 0
            r27 = r11
            r11 = r21
            r20 = r13
            r12 = r23
            r14 = r35
            int r0 = r0.H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r29
            r19 = r26
            if (r0 == r15) goto L_0x03a3
            goto L_0x0391
        L_0x032d:
            r21 = r1
            r15 = r5
            r25 = r7
            r26 = r8
            r23 = r9
            r27 = r11
            r20 = r13
            r17 = r16
            r6 = r19
            r32 = r22
            r16 = 0
            r19 = r3
            r0 = 50
            r9 = r21
            if (r9 != r0) goto L_0x0368
            r7 = r19
            r0 = 2
            if (r7 == r0) goto L_0x035b
        L_0x034f:
            r14 = r29
            r6 = r34
            r2 = r15
            r8 = r20
            r7 = r25
            r9 = r26
            goto L_0x03ac
        L_0x035b:
            r14 = r29
            r15 = r30
            r10 = r23
            r13 = r26
            r14.F(r15, r13, r10)
            r12 = 0
            throw r12
        L_0x0368:
            r12 = 0
            r14 = r29
            r8 = r15
            r7 = r19
            r10 = r23
            r13 = r26
            r15 = r30
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r8
            r4 = r33
            r5 = r20
            r19 = r6
            r6 = r32
            r15 = r8
            r8 = r19
            r12 = r13
            r19 = r13
            r13 = r35
            int r0 = r0.G(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03a3
        L_0x0391:
            r12 = r30
            r11 = r32
            r1 = r34
            r10 = r35
            r6 = r18
            r5 = r19
            r8 = r20
            r7 = r25
            goto L_0x0406
        L_0x03a3:
            r6 = r34
            r2 = r0
            r9 = r19
            r8 = r20
            r7 = r25
        L_0x03ac:
            if (r8 != r6) goto L_0x03b9
            if (r6 == 0) goto L_0x03b9
            r12 = r30
            r0 = r2
            r2 = r8
            r3 = r18
            r1 = 0
            goto L_0x0422
        L_0x03b9:
            boolean r0 = r14.f4866f
            if (r0 == 0) goto L_0x03ed
            com.google.android.gms.internal.firebase-auth-api.c2 r0 = com.google.android.gms.internal.p000firebaseauthapi.c2.f4439b
            r10 = r35
            com.google.android.gms.internal.firebase-auth-api.c2 r1 = r10.f4607d
            if (r1 == r0) goto L_0x03e8
            com.google.android.gms.internal.firebase-auth-api.o3 r0 = r14.f4865e
            r11 = r32
            com.google.android.gms.internal.firebase-auth-api.o2 r0 = r1.a(r0, r11)
            if (r0 != 0) goto L_0x03e1
            com.google.android.gms.internal.firebase-auth-api.l4 r4 = B(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.h(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x0402
        L_0x03e1:
            r12 = r30
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.n2 r0 = (com.google.android.gms.internal.p000firebaseauthapi.n2) r0
            r1 = 0
            throw r1
        L_0x03e8:
            r12 = r30
            r11 = r32
            goto L_0x03f3
        L_0x03ed:
            r12 = r30
            r11 = r32
            r10 = r35
        L_0x03f3:
            com.google.android.gms.internal.firebase-auth-api.l4 r4 = B(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.h(r0, r1, r2, r3, r4, r5)
        L_0x0402:
            r1 = r6
            r5 = r9
            r6 = r18
        L_0x0406:
            r13 = r33
            r2 = r8
            r4 = r10
            r3 = r11
            r15 = r14
            r11 = r27
            r14 = r12
            r12 = r31
            goto L_0x001a
        L_0x0413:
            r19 = r1
            r18 = r6
            r25 = r7
            r27 = r11
            r12 = r14
            r14 = r15
            r1 = 0
            r3 = r18
            r6 = r19
        L_0x0422:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 == r4) goto L_0x042d
            long r3 = (long) r3
            r5 = r27
            r5.putInt(r12, r3, r7)
        L_0x042d:
            int r3 = r14.f4870j
        L_0x042f:
            int r4 = r14.f4871k
            if (r3 >= r4) goto L_0x043d
            int[] r4 = r14.f4869i
            r4 = r4[r3]
            r14.i(r12, r4, r1)
            int r3 = r3 + 1
            goto L_0x042f
        L_0x043d:
            if (r6 != 0) goto L_0x0449
            r1 = r33
            if (r0 != r1) goto L_0x0444
            goto L_0x044f
        L_0x0444:
            com.google.android.gms.internal.firebase-auth-api.w2 r0 = com.google.android.gms.internal.p000firebaseauthapi.w2.e()
            throw r0
        L_0x0449:
            r1 = r33
            if (r0 > r1) goto L_0x0450
            if (r2 != r6) goto L_0x0450
        L_0x044f:
            return r0
        L_0x0450:
            com.google.android.gms.internal.firebase-auth-api.w2 r0 = com.google.android.gms.internal.p000firebaseauthapi.w2.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.r3.A(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.h1):int");
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
    public final int D(java.lang.Object r16) {
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
            int[] r8 = r0.f4861a
            int r9 = r8.length
            if (r4 >= r9) goto L_0x0551
            int r9 = r15.J(r4)
            r10 = r8[r4]
            int r11 = r9 >>> 20
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 17
            r13 = 1
            sun.misc.Unsafe r14 = f4860p
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
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.firebase-auth-api.o3 r2 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r2
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r15.h(r4)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.C(r10, r2, r3)
            goto L_0x0549
        L_0x0053:
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            long r2 = f(r1, r2)
            int r8 = r10 << 3
            long r10 = r2 + r2
            long r2 = r2 >> r9
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r8)
            long r2 = r2 ^ r10
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            goto L_0x04c6
        L_0x006d:
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            int r2 = E(r1, r2)
            int r3 = r10 << 3
            int r8 = r2 + r2
            int r2 = r2 >> 31
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            r2 = r2 ^ r8
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x043b
        L_0x0088:
            boolean r2 = r15.y(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0547
        L_0x0096:
            boolean r2 = r15.y(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x053a
        L_0x00a4:
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            int r2 = E(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.D(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0326
        L_0x00ba:
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            int r2 = E(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0326
        L_0x00d0:
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.firebase-auth-api.q1 r2 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r2
            int r3 = r10 << 3
            java.util.logging.Logger r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.f5090b
            int r2 = r2.c()
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r8 = r8 + r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x04c6
        L_0x00ef:
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r15.h(r4)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.I(r10, r3, r2)
            goto L_0x0549
        L_0x0103:
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.p000firebaseauthapi.q1
            if (r3 == 0) goto L_0x0126
            com.google.android.gms.internal.firebase-auth-api.q1 r2 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r2
            int r3 = r10 << 3
            java.util.logging.Logger r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.f5090b
            int r2 = r2.c()
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r8 = r8 + r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x04c6
        L_0x0126:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.E(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0326
        L_0x0134:
            boolean r2 = r15.y(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x04e0
        L_0x0142:
            boolean r2 = r15.y(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x053a
        L_0x0150:
            boolean r2 = r15.y(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0547
        L_0x015e:
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            int r2 = E(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.D(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0326
        L_0x0174:
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            long r2 = f(r1, r2)
            int r8 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r8)
            goto L_0x0326
        L_0x018a:
            boolean r8 = r15.y(r1, r10, r4)
            if (r8 == 0) goto L_0x054a
            long r2 = f(r1, r2)
            int r8 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r8)
            goto L_0x0326
        L_0x01a0:
            boolean r2 = r15.y(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x053a
        L_0x01ae:
            boolean r2 = r15.y(r1, r10, r4)
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0547
        L_0x01bc:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.lang.Object r3 = r15.j(r4)
            com.google.android.gms.internal.p000firebaseauthapi.k3.a(r2, r3)
            goto L_0x054a
        L_0x01c9:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r15.h(r4)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.D(r10, r2, r3)
            goto L_0x0549
        L_0x01d9:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.N(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x01f1:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.L(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x0209:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.C(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x0221:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.A(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x0239:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.y(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x0251:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.Q(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x0269:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r3 = com.google.android.gms.internal.p000firebaseauthapi.a4.f4371a
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x0283:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.A(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x029b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.C(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x02b3:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.F(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x02ca:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.S(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x02e1:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.H(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x02f8:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.A(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0325
        L_0x030f:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.C(r2)
            if (r2 <= 0) goto L_0x054a
            int r3 = r10 << 3
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
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
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.M(r10, r2)
            goto L_0x0549
        L_0x0337:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.K(r10, r2)
            goto L_0x0549
        L_0x0343:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.B(r10, r2)
            goto L_0x0549
        L_0x034f:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.z(r10, r2)
            goto L_0x0549
        L_0x035b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.x(r10, r2)
            goto L_0x0549
        L_0x0367:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.P(r10, r2)
            goto L_0x0549
        L_0x0373:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.w(r10, r2)
            goto L_0x0549
        L_0x037f:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r15.h(r4)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.J(r10, r2, r3)
            goto L_0x0549
        L_0x038f:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.O(r10, r2)
            goto L_0x0549
        L_0x039b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.v(r10, r2)
            goto L_0x0549
        L_0x03a7:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.z(r10, r2)
            goto L_0x0549
        L_0x03b3:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.B(r10, r2)
            goto L_0x0549
        L_0x03bf:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.E(r10, r2)
            goto L_0x0549
        L_0x03cb:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.R(r10, r2)
            goto L_0x0549
        L_0x03d7:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.G(r10, r2)
            goto L_0x0549
        L_0x03e3:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.z(r10, r2)
            goto L_0x0549
        L_0x03ef:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.B(r10, r2)
            goto L_0x0549
        L_0x03fb:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.firebase-auth-api.o3 r2 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r2
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r15.h(r4)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.C(r10, r2, r3)
            goto L_0x0549
        L_0x040e:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            long r2 = r14.getLong(r1, r2)
            int r8 = r10 << 3
            long r10 = r2 + r2
            long r2 = r2 >> r9
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r8)
            long r2 = r2 ^ r10
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            goto L_0x04c6
        L_0x0425:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r8 = r2 + r2
            int r2 = r2 >> 31
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            r2 = r2 ^ r8
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
        L_0x043b:
            int r2 = r2 + r3
            goto L_0x0549
        L_0x043e:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0547
        L_0x044a:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x053a
        L_0x0456:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.D(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x052d
        L_0x0469:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x052d
        L_0x047c:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.firebase-auth-api.q1 r2 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r2
            int r3 = r10 << 3
            java.util.logging.Logger r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.f5090b
            int r2 = r2.c()
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r8 = r8 + r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x04c6
        L_0x0497:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r15.h(r4)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.I(r10, r3, r2)
            goto L_0x0549
        L_0x04a8:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            java.lang.Object r2 = r14.getObject(r1, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.p000firebaseauthapi.q1
            if (r3 == 0) goto L_0x04c9
            com.google.android.gms.internal.firebase-auth-api.q1 r2 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r2
            int r3 = r10 << 3
            java.util.logging.Logger r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.f5090b
            int r2 = r2.c()
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r8 = r8 + r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
        L_0x04c6:
            int r2 = r2 + r8
            goto L_0x0549
        L_0x04c9:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.E(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x052d
        L_0x04d6:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
        L_0x04e0:
            int r2 = r2 + r13
            goto L_0x0549
        L_0x04e2:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x053a
        L_0x04ed:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0547
        L_0x04f8:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            int r2 = r14.getInt(r1, r2)
            int r3 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.D(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x052d
        L_0x050a:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            long r2 = r14.getLong(r1, r2)
            int r8 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r8)
            goto L_0x052d
        L_0x051c:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x054a
            long r2 = r14.getLong(r1, r2)
            int r8 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r8)
        L_0x052d:
            int r3 = r3 + r2
            int r5 = r5 + r3
            goto L_0x054a
        L_0x0530:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
        L_0x053a:
            int r2 = r2 + 4
            goto L_0x0549
        L_0x053d:
            r2 = r7 & r8
            if (r2 == 0) goto L_0x054a
            int r2 = r10 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
        L_0x0547:
            int r2 = r2 + 8
        L_0x0549:
            int r5 = r5 + r2
        L_0x054a:
            int r4 = r4 + 3
            r2 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000a
        L_0x0551:
            com.google.android.gms.internal.firebase-auth-api.k4 r2 = r0.m
            com.google.android.gms.internal.firebase-auth-api.l4 r3 = r2.d(r1)
            int r2 = r2.a(r3)
            int r2 = r2 + r5
            boolean r3 = r0.f4866f
            if (r3 != 0) goto L_0x0561
            return r2
        L_0x0561:
            com.google.android.gms.internal.firebase-auth-api.d2 r2 = r0.f4873n
            r2.a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.r3.D(java.lang.Object):int");
    }

    public final void F(Object obj, int i8, long j10) {
        Object j11 = j(i8);
        Unsafe unsafe = f4860p;
        Object object = unsafe.getObject(obj, j10);
        if (k3.b(object)) {
            j3 b10 = j3.a().b();
            k3.c(b10, object);
            unsafe.putObject(obj, j10, b10);
        }
        i3 i3Var = (i3) j11;
        throw null;
    }

    public final int G(Object obj, byte[] bArr, int i8, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, h1 h1Var) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i17 = i8;
        int i18 = i11;
        int i19 = i12;
        int i20 = i13;
        long j11 = j10;
        int i21 = i16;
        h1 h1Var2 = h1Var;
        long j12 = (long) (this.f4861a[i21 + 2] & 1048575);
        Unsafe unsafe = f4860p;
        switch (i15) {
            case 51:
                if (i20 == 1) {
                    unsafe.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(i1.o(bArr, i8))));
                    int i22 = i17 + 8;
                    unsafe.putInt(obj2, j12, i19);
                    return i22;
                }
                break;
            case 52:
                if (i20 == 5) {
                    unsafe.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(i1.b(bArr, i8))));
                    int i23 = i17 + 4;
                    unsafe.putInt(obj2, j12, i19);
                    return i23;
                }
                break;
            case 53:
            case 54:
                if (i20 == 0) {
                    int l10 = i1.l(bArr2, i17, h1Var2);
                    unsafe.putObject(obj2, j11, Long.valueOf(h1Var2.f4605b));
                    unsafe.putInt(obj2, j12, i19);
                    return l10;
                }
                break;
            case 55:
            case 62:
                if (i20 == 0) {
                    int i24 = i1.i(bArr2, i17, h1Var2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(h1Var2.f4604a));
                    unsafe.putInt(obj2, j12, i19);
                    return i24;
                }
                break;
            case 56:
            case 65:
                if (i20 == 1) {
                    unsafe.putObject(obj2, j11, Long.valueOf(i1.o(bArr, i8)));
                    int i25 = i17 + 8;
                    unsafe.putInt(obj2, j12, i19);
                    return i25;
                }
                break;
            case 57:
            case 64:
                if (i20 == 5) {
                    unsafe.putObject(obj2, j11, Integer.valueOf(i1.b(bArr, i8)));
                    int i26 = i17 + 4;
                    unsafe.putInt(obj2, j12, i19);
                    return i26;
                }
                break;
            case 58:
                if (i20 == 0) {
                    int l11 = i1.l(bArr2, i17, h1Var2);
                    unsafe.putObject(obj2, j11, Boolean.valueOf(h1Var2.f4605b != 0));
                    unsafe.putInt(obj2, j12, i19);
                    return l11;
                }
                break;
            case 59:
                if (i20 == 2) {
                    int i27 = i1.i(bArr2, i17, h1Var2);
                    int i28 = h1Var2.f4604a;
                    if (i28 == 0) {
                        unsafe.putObject(obj2, j11, "");
                    } else if ((i14 & 536870912) == 0 || y4.e(bArr2, i27, i27 + i28)) {
                        unsafe.putObject(obj2, j11, new String(bArr2, i27, i28, u2.f4974a));
                        i27 += i28;
                    } else {
                        throw w2.b();
                    }
                    unsafe.putInt(obj2, j12, i19);
                    return i27;
                }
                break;
            case 60:
                if (i20 == 2) {
                    Object l12 = l(obj2, i19, i21);
                    int n2 = i1.n(l12, h(i21), bArr, i8, i10, h1Var);
                    u(obj2, i19, i21, l12);
                    return n2;
                }
                break;
            case 61:
                if (i20 == 2) {
                    int a10 = i1.a(bArr2, i17, h1Var2);
                    unsafe.putObject(obj2, j11, h1Var2.f4606c);
                    unsafe.putInt(obj2, j12, i19);
                    return a10;
                }
                break;
            case 63:
                if (i20 == 0) {
                    int i29 = i1.i(bArr2, i17, h1Var2);
                    int i30 = h1Var2.f4604a;
                    s2 g10 = g(i21);
                    if (g10 == null || g10.zza()) {
                        unsafe.putObject(obj2, j11, Integer.valueOf(i30));
                        unsafe.putInt(obj2, j12, i19);
                    } else {
                        B(obj).c(i18, Long.valueOf((long) i30));
                    }
                    return i29;
                }
                break;
            case 66:
                if (i20 == 0) {
                    int i31 = i1.i(bArr2, i17, h1Var2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(t1.e(h1Var2.f4604a)));
                    unsafe.putInt(obj2, j12, i19);
                    return i31;
                }
                break;
            case 67:
                if (i20 == 0) {
                    int l13 = i1.l(bArr2, i17, h1Var2);
                    unsafe.putObject(obj2, j11, Long.valueOf(t1.f(h1Var2.f4605b)));
                    unsafe.putInt(obj2, j12, i19);
                    return l13;
                }
                break;
            case 68:
                if (i20 == 3) {
                    Object l14 = l(obj2, i19, i21);
                    int m10 = i1.m(l14, h(i21), bArr, i8, i10, (i18 & -8) | 4, h1Var);
                    u(obj2, i19, i21, l14);
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
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0448 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c5  */
    public final int H(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.p000firebaseauthapi.h1 r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f4860p
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.firebase-auth-api.t2 r12 = (com.google.android.gms.internal.p000firebaseauthapi.t2) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.firebase-auth-api.t2 r12 = r12.zzd(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03d8;
                case 19: goto L_0x038a;
                case 20: goto L_0x0347;
                case 21: goto L_0x0347;
                case 22: goto L_0x032e;
                case 23: goto L_0x02ec;
                case 24: goto L_0x02aa;
                case 25: goto L_0x0250;
                case 26: goto L_0x019d;
                case 27: goto L_0x0184;
                case 28: goto L_0x012a;
                case 29: goto L_0x032e;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02aa;
                case 32: goto L_0x02ec;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03d8;
                case 36: goto L_0x038a;
                case 37: goto L_0x0347;
                case 38: goto L_0x0347;
                case 39: goto L_0x032e;
                case 40: goto L_0x02ec;
                case 41: goto L_0x02aa;
                case 42: goto L_0x0250;
                case 43: goto L_0x032e;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02aa;
                case 46: goto L_0x02ec;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.z3 r1 = r15.h(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f4606c
            r12.add(r8)
            goto L_0x0425
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.firebase-auth-api.e3 r12 = (com.google.android.gms.internal.p000firebaseauthapi.e3) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r2 = r7.f4604a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r3, r1, r7)
            long r4 = r7.f4605b
            long r4 = com.google.android.gms.internal.p000firebaseauthapi.t1.f(r4)
            r12.b(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0448
        L_0x007b:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.e3 r12 = (com.google.android.gms.internal.p000firebaseauthapi.e3) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r3, r4, r7)
            long r8 = r7.f4605b
            long r8 = com.google.android.gms.internal.p000firebaseauthapi.t1.f(r8)
            r12.b(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r1, r7)
            int r6 = r7.f4604a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r3, r4, r7)
            long r8 = r7.f4605b
            long r8 = com.google.android.gms.internal.p000firebaseauthapi.t1.f(r8)
            r12.b(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.firebase-auth-api.q2 r12 = (com.google.android.gms.internal.p000firebaseauthapi.q2) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r2 = r7.f4604a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r1, r7)
            int r4 = r7.f4604a
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.t1.e(r4)
            r12.b(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0448
        L_0x00ca:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.q2 r12 = (com.google.android.gms.internal.p000firebaseauthapi.q2) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r4 = r7.f4604a
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.t1.e(r4)
            r12.b(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r1, r7)
            int r6 = r7.f4604a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r4 = r7.f4604a
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.t1.e(r4)
            r12.b(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.i1.e(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x0447
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.i1.k(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.firebase-auth-api.s2 r3 = r15.g(r8)
            r4 = 0
            com.google.android.gms.internal.firebase-auth-api.k4 r5 = r0.m
            r22 = r16
            r23 = r21
            r24 = r12
            r25 = r3
            r26 = r4
            r27 = r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.a(r22, r23, r24, r25, r26, r27)
            goto L_0x0271
        L_0x012a:
            if (r6 != r14) goto L_0x0447
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r4 = r7.f4604a
            if (r4 < 0) goto L_0x017f
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x017a
            if (r4 != 0) goto L_0x0140
            com.google.android.gms.internal.firebase-auth-api.p1 r4 = com.google.android.gms.internal.p000firebaseauthapi.q1.f4830b
            r12.add(r4)
            goto L_0x0148
        L_0x0140:
            com.google.android.gms.internal.firebase-auth-api.p1 r6 = com.google.android.gms.internal.p000firebaseauthapi.q1.l(r3, r1, r4)
            r12.add(r6)
        L_0x0147:
            int r1 = r1 + r4
        L_0x0148:
            if (r1 >= r5) goto L_0x0179
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r1, r7)
            int r6 = r7.f4604a
            if (r2 == r6) goto L_0x0153
            goto L_0x0179
        L_0x0153:
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r4 = r7.f4604a
            if (r4 < 0) goto L_0x0174
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x016f
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.firebase-auth-api.p1 r4 = com.google.android.gms.internal.p000firebaseauthapi.q1.f4830b
            r12.add(r4)
            goto L_0x0148
        L_0x0167:
            com.google.android.gms.internal.firebase-auth-api.p1 r6 = com.google.android.gms.internal.p000firebaseauthapi.q1.l(r3, r1, r4)
            r12.add(r6)
            goto L_0x0147
        L_0x016f:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r1
        L_0x0174:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.d()
            throw r1
        L_0x0179:
            return r1
        L_0x017a:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r1
        L_0x017f:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.d()
            throw r1
        L_0x0184:
            if (r6 != r14) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.z3 r1 = r15.h(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.d(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x019d:
            if (r6 != r14) goto L_0x0447
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01f0
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r4 = r7.f4604a
            if (r4 < 0) goto L_0x01eb
            if (r4 != 0) goto L_0x01b8
            r12.add(r6)
            goto L_0x01c3
        L_0x01b8:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01c2:
            int r1 = r1 + r4
        L_0x01c3:
            if (r1 >= r5) goto L_0x0448
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r1, r7)
            int r8 = r7.f4604a
            if (r2 != r8) goto L_0x0448
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r4 = r7.f4604a
            if (r4 < 0) goto L_0x01e6
            if (r4 != 0) goto L_0x01db
            r12.add(r6)
            goto L_0x01c3
        L_0x01db:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01c2
        L_0x01e6:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.d()
            throw r1
        L_0x01eb:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.d()
            throw r1
        L_0x01f0:
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r4 = r7.f4604a
            if (r4 < 0) goto L_0x024b
            if (r4 != 0) goto L_0x01fe
            r12.add(r6)
            goto L_0x0211
        L_0x01fe:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.p000firebaseauthapi.y4.e(r3, r1, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x0210:
            r1 = r8
        L_0x0211:
            if (r1 >= r5) goto L_0x0448
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r1, r7)
            int r8 = r7.f4604a
            if (r2 != r8) goto L_0x0448
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r4 = r7.f4604a
            if (r4 < 0) goto L_0x0241
            if (r4 != 0) goto L_0x0229
            r12.add(r6)
            goto L_0x0211
        L_0x0229:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.p000firebaseauthapi.y4.e(r3, r1, r8)
            if (r9 == 0) goto L_0x023c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x0210
        L_0x023c:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.b()
            throw r1
        L_0x0241:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.d()
            throw r1
        L_0x0246:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.b()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.d()
            throw r1
        L_0x0250:
            r1 = 0
            if (r6 != r14) goto L_0x0279
            com.google.android.gms.internal.firebase-auth-api.k1 r12 = (com.google.android.gms.internal.p000firebaseauthapi.k1) r12
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r4 = r7.f4604a
            int r4 = r4 + r2
        L_0x025c:
            if (r2 >= r4) goto L_0x026f
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r3, r2, r7)
            long r5 = r7.f4605b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x026a
            r5 = r13
            goto L_0x026b
        L_0x026a:
            r5 = r1
        L_0x026b:
            r12.b(r5)
            goto L_0x025c
        L_0x026f:
            if (r2 != r4) goto L_0x0274
        L_0x0271:
            r1 = r2
            goto L_0x0448
        L_0x0274:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r1
        L_0x0279:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.k1 r12 = (com.google.android.gms.internal.p000firebaseauthapi.k1) r12
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r3, r4, r7)
            long r8 = r7.f4605b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0289
            r6 = r13
            goto L_0x028a
        L_0x0289:
            r6 = r1
        L_0x028a:
            r12.b(r6)
        L_0x028d:
            if (r4 >= r5) goto L_0x02a9
            int r6 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r8 = r7.f4604a
            if (r2 == r8) goto L_0x0298
            goto L_0x02a9
        L_0x0298:
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r3, r6, r7)
            long r8 = r7.f4605b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02a4
            r6 = r13
            goto L_0x02a5
        L_0x02a4:
            r6 = r1
        L_0x02a5:
            r12.b(r6)
            goto L_0x028d
        L_0x02a9:
            return r4
        L_0x02aa:
            if (r6 != r14) goto L_0x02ca
            com.google.android.gms.internal.firebase-auth-api.q2 r12 = (com.google.android.gms.internal.p000firebaseauthapi.q2) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r2 = r7.f4604a
            int r2 = r2 + r1
        L_0x02b5:
            if (r1 >= r2) goto L_0x02c1
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.b(r3, r1)
            r12.b(r4)
            int r1 = r1 + 4
            goto L_0x02b5
        L_0x02c1:
            if (r1 != r2) goto L_0x02c5
            goto L_0x0448
        L_0x02c5:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r1
        L_0x02ca:
            if (r6 != r9) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.q2 r12 = (com.google.android.gms.internal.p000firebaseauthapi.q2) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.b(r17, r18)
            r12.b(r1)
        L_0x02d5:
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x02eb
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r6 = r7.f4604a
            if (r2 == r6) goto L_0x02e2
            goto L_0x02eb
        L_0x02e2:
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.b(r3, r1)
            r12.b(r4)
            r4 = r1
            goto L_0x02d5
        L_0x02eb:
            return r4
        L_0x02ec:
            if (r6 != r14) goto L_0x030c
            com.google.android.gms.internal.firebase-auth-api.e3 r12 = (com.google.android.gms.internal.p000firebaseauthapi.e3) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r2 = r7.f4604a
            int r2 = r2 + r1
        L_0x02f7:
            if (r1 >= r2) goto L_0x0303
            long r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.o(r3, r1)
            r12.b(r4)
            int r1 = r1 + 8
            goto L_0x02f7
        L_0x0303:
            if (r1 != r2) goto L_0x0307
            goto L_0x0448
        L_0x0307:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r1
        L_0x030c:
            if (r6 != r13) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.e3 r12 = (com.google.android.gms.internal.p000firebaseauthapi.e3) r12
            long r8 = com.google.android.gms.internal.p000firebaseauthapi.i1.o(r17, r18)
            r12.b(r8)
        L_0x0317:
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x032d
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r6 = r7.f4604a
            if (r2 == r6) goto L_0x0324
            goto L_0x032d
        L_0x0324:
            long r8 = com.google.android.gms.internal.p000firebaseauthapi.i1.o(r3, r1)
            r12.b(r8)
            r4 = r1
            goto L_0x0317
        L_0x032d:
            return r4
        L_0x032e:
            if (r6 != r14) goto L_0x0336
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.e(r3, r4, r12, r7)
            goto L_0x0448
        L_0x0336:
            if (r6 != 0) goto L_0x0447
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.k(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0347:
            if (r6 != r14) goto L_0x0367
            com.google.android.gms.internal.firebase-auth-api.e3 r12 = (com.google.android.gms.internal.p000firebaseauthapi.e3) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r2 = r7.f4604a
            int r2 = r2 + r1
        L_0x0352:
            if (r1 >= r2) goto L_0x035e
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r3, r1, r7)
            long r4 = r7.f4605b
            r12.b(r4)
            goto L_0x0352
        L_0x035e:
            if (r1 != r2) goto L_0x0362
            goto L_0x0448
        L_0x0362:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r1
        L_0x0367:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.e3 r12 = (com.google.android.gms.internal.p000firebaseauthapi.e3) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r3, r4, r7)
            long r8 = r7.f4605b
            r12.b(r8)
        L_0x0374:
            if (r1 >= r5) goto L_0x0389
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r1, r7)
            int r6 = r7.f4604a
            if (r2 == r6) goto L_0x037f
            goto L_0x0389
        L_0x037f:
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r3, r4, r7)
            long r8 = r7.f4605b
            r12.b(r8)
            goto L_0x0374
        L_0x0389:
            return r1
        L_0x038a:
            if (r6 != r14) goto L_0x03ae
            com.google.android.gms.internal.firebase-auth-api.k2 r12 = (com.google.android.gms.internal.p000firebaseauthapi.k2) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r2 = r7.f4604a
            int r2 = r2 + r1
        L_0x0395:
            if (r1 >= r2) goto L_0x03a5
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.b(r4)
            int r1 = r1 + 4
            goto L_0x0395
        L_0x03a5:
            if (r1 != r2) goto L_0x03a9
            goto L_0x0448
        L_0x03a9:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r1
        L_0x03ae:
            if (r6 != r9) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.k2 r12 = (com.google.android.gms.internal.p000firebaseauthapi.k2) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.b(r1)
        L_0x03bd:
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x03d7
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r6 = r7.f4604a
            if (r2 == r6) goto L_0x03ca
            goto L_0x03d7
        L_0x03ca:
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.b(r4)
            r4 = r1
            goto L_0x03bd
        L_0x03d7:
            return r4
        L_0x03d8:
            if (r6 != r14) goto L_0x03fb
            com.google.android.gms.internal.firebase-auth-api.a2 r12 = (com.google.android.gms.internal.p000firebaseauthapi.a2) r12
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r2 = r7.f4604a
            int r2 = r2 + r1
        L_0x03e3:
            if (r1 >= r2) goto L_0x03f3
            long r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.o(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.b(r4)
            int r1 = r1 + 8
            goto L_0x03e3
        L_0x03f3:
            if (r1 != r2) goto L_0x03f6
            goto L_0x0448
        L_0x03f6:
            com.google.android.gms.internal.firebase-auth-api.w2 r1 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r1
        L_0x03fb:
            if (r6 != r13) goto L_0x0447
            com.google.android.gms.internal.firebase-auth-api.a2 r12 = (com.google.android.gms.internal.p000firebaseauthapi.a2) r12
            long r8 = com.google.android.gms.internal.p000firebaseauthapi.i1.o(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.b(r8)
        L_0x040a:
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x0424
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r6 = r7.f4604a
            if (r2 == r6) goto L_0x0417
            goto L_0x0424
        L_0x0417:
            long r8 = com.google.android.gms.internal.p000firebaseauthapi.i1.o(r3, r1)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.b(r8)
            r4 = r1
            goto L_0x040a
        L_0x0424:
            return r4
        L_0x0425:
            if (r4 >= r5) goto L_0x0446
            int r8 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r3, r4, r7)
            int r9 = r7.f4604a
            if (r2 == r9) goto L_0x0430
            goto L_0x0446
        L_0x0430:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.i1.c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f4606c
            r12.add(r8)
            goto L_0x0425
        L_0x0446:
            return r4
        L_0x0447:
            r1 = r4
        L_0x0448:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.r3.H(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.firebase-auth-api.h1):int");
    }

    public final int I(int i8, int i10) {
        int[] iArr = this.f4861a;
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

    public final int J(int i8) {
        return this.f4861a[i8 + 1];
    }

    public final boolean a(Object obj) {
        int i8 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            boolean z10 = true;
            if (i8 < this.f4870j) {
                int i12 = this.f4869i[i8];
                int[] iArr = this.f4861a;
                int i13 = iArr[i12];
                int J = J(i12);
                int i14 = iArr[i12 + 2];
                int i15 = i14 & 1048575;
                int i16 = 1 << (i14 >>> 20);
                if (i15 != i11) {
                    if (i15 != 1048575) {
                        i10 = f4860p.getInt(obj, (long) i15);
                    }
                    i11 = i15;
                }
                if ((268435456 & J) != 0) {
                    if (!(i11 == 1048575 ? w(i12, obj) : (i10 & i16) != 0)) {
                        return false;
                    }
                }
                int i17 = (J >>> 20) & 255;
                if (i17 == 9 || i17 == 17) {
                    if (i11 == 1048575) {
                        z10 = w(i12, obj);
                    } else if ((i10 & i16) == 0) {
                        z10 = false;
                    }
                    if (z10 && !h(i12).a(u4.j(obj, (long) (J & 1048575)))) {
                        return false;
                    }
                } else {
                    if (i17 != 27) {
                        if (i17 == 60 || i17 == 68) {
                            if (y(obj, i13, i12) && !h(i12).a(u4.j(obj, (long) (J & 1048575)))) {
                                return false;
                            }
                        } else if (i17 != 49) {
                            if (i17 == 50 && !((j3) u4.j(obj, (long) (J & 1048575))).isEmpty()) {
                                i3 i3Var = (i3) j(i12);
                                throw null;
                            }
                        }
                    }
                    List list = (List) u4.j(obj, (long) (J & 1048575));
                    if (!list.isEmpty()) {
                        z3 h3 = h(i12);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (!h3.a(list.get(i18))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                i8++;
            } else if (!this.f4866f) {
                return true;
            } else {
                this.f4873n.a(obj);
                throw null;
            }
        }
    }

    public final boolean b(Object obj, Object obj2) {
        boolean z10;
        int[] iArr = this.f4861a;
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int J = J(i8);
            long j10 = (long) (J & 1048575);
            switch ((J >>> 20) & 255) {
                case 0:
                    if (v(i8, obj, obj2) && Double.doubleToLongBits(u4.e(obj, j10)) == Double.doubleToLongBits(u4.e(obj2, j10))) {
                        continue;
                    }
                case 1:
                    if (v(i8, obj, obj2) && Float.floatToIntBits(u4.f(obj, j10)) == Float.floatToIntBits(u4.f(obj2, j10))) {
                        continue;
                    }
                case 2:
                    if (v(i8, obj, obj2) && u4.h(obj, j10) == u4.h(obj2, j10)) {
                        continue;
                    }
                case 3:
                    if (v(i8, obj, obj2) && u4.h(obj, j10) == u4.h(obj2, j10)) {
                        continue;
                    }
                case 4:
                    if (v(i8, obj, obj2) && u4.g(obj, j10) == u4.g(obj2, j10)) {
                        continue;
                    }
                case 5:
                    if (v(i8, obj, obj2) && u4.h(obj, j10) == u4.h(obj2, j10)) {
                        continue;
                    }
                case 6:
                    if (v(i8, obj, obj2) && u4.g(obj, j10) == u4.g(obj2, j10)) {
                        continue;
                    }
                case 7:
                    if (v(i8, obj, obj2) && u4.w(obj, j10) == u4.w(obj2, j10)) {
                        continue;
                    }
                case 8:
                    if (v(i8, obj, obj2) && a4.b(u4.j(obj, j10), u4.j(obj2, j10))) {
                        continue;
                    }
                case 9:
                    if (v(i8, obj, obj2) && a4.b(u4.j(obj, j10), u4.j(obj2, j10))) {
                        continue;
                    }
                case 10:
                    if (v(i8, obj, obj2) && a4.b(u4.j(obj, j10), u4.j(obj2, j10))) {
                        continue;
                    }
                case ModuleDescriptor.MODULE_VERSION:
                    if (v(i8, obj, obj2) && u4.g(obj, j10) == u4.g(obj2, j10)) {
                        continue;
                    }
                case 12:
                    if (v(i8, obj, obj2) && u4.g(obj, j10) == u4.g(obj2, j10)) {
                        continue;
                    }
                case 13:
                    if (v(i8, obj, obj2) && u4.g(obj, j10) == u4.g(obj2, j10)) {
                        continue;
                    }
                case 14:
                    if (v(i8, obj, obj2) && u4.h(obj, j10) == u4.h(obj2, j10)) {
                        continue;
                    }
                case 15:
                    if (v(i8, obj, obj2) && u4.g(obj, j10) == u4.g(obj2, j10)) {
                        continue;
                    }
                case 16:
                    if (v(i8, obj, obj2) && u4.h(obj, j10) == u4.h(obj2, j10)) {
                        continue;
                    }
                case 17:
                    if (v(i8, obj, obj2) && a4.b(u4.j(obj, j10), u4.j(obj2, j10))) {
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
                    z10 = a4.b(u4.j(obj, j10), u4.j(obj2, j10));
                    break;
                case 50:
                    z10 = a4.b(u4.j(obj, j10), u4.j(obj2, j10));
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
                    if (u4.g(obj, j11) == u4.g(obj2, j11) && a4.b(u4.j(obj, j10), u4.j(obj2, j10))) {
                        continue;
                    }
            }
            if (!z10) {
                return false;
            }
        }
        k4 k4Var = this.m;
        if (!k4Var.d(obj).equals(k4Var.d(obj2))) {
            return false;
        }
        if (!this.f4866f) {
            return true;
        }
        d2 d2Var = this.f4873n;
        d2Var.a(obj);
        d2Var.a(obj2);
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
    public final void c(java.lang.Object r17, com.google.android.gms.internal.p000firebaseauthapi.z1 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f4868h
            com.google.android.gms.internal.firebase-auth-api.k4 r4 = r0.m
            r5 = 0
            com.google.android.gms.internal.firebase-auth-api.d2 r6 = r0.f4873n
            boolean r7 = r0.f4866f
            r8 = 1
            r9 = 0
            int[] r10 = r0.f4861a
            r11 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 == 0) goto L_0x0478
            if (r7 != 0) goto L_0x0474
            int r3 = r10.length
            r6 = r9
        L_0x001c:
            if (r6 >= r3) goto L_0x046c
            int r7 = r0.J(r6)
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
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            com.google.android.gms.internal.firebase-auth-api.z3 r13 = r0.h(r6)
            r2.l(r12, r13, r7)
            goto L_0x0468
        L_0x0042:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = f(r1, r13)
            r2.b(r12, r13)
            goto L_0x0468
        L_0x0053:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = E(r1, r13)
            r2.a(r12, r7)
            goto L_0x0468
        L_0x0064:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = f(r1, r13)
            r2.q(r12, r13)
            goto L_0x0468
        L_0x0075:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = E(r1, r13)
            r2.p(r12, r7)
            goto L_0x0468
        L_0x0086:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = E(r1, r13)
            r2.h(r12, r7)
            goto L_0x0468
        L_0x0097:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = E(r1, r13)
            r2.c(r12, r7)
            goto L_0x0468
        L_0x00a8:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            com.google.android.gms.internal.firebase-auth-api.q1 r7 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r7
            r2.f(r12, r7)
            goto L_0x0468
        L_0x00bb:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            com.google.android.gms.internal.firebase-auth-api.z3 r13 = r0.h(r6)
            r2.o(r12, r13, r7)
            goto L_0x0468
        L_0x00d0:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            z(r12, r7, r2)
            goto L_0x0468
        L_0x00e1:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r2.e(r12, r7)
            goto L_0x0468
        L_0x00f8:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = E(r1, r13)
            r2.i(r12, r7)
            goto L_0x0468
        L_0x0109:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = f(r1, r13)
            r2.j(r12, r13)
            goto L_0x0468
        L_0x011a:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = E(r1, r13)
            r2.m(r12, r7)
            goto L_0x0468
        L_0x012b:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = f(r1, r13)
            r2.d(r12, r13)
            goto L_0x0468
        L_0x013c:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = f(r1, r13)
            r2.n(r12, r13)
            goto L_0x0468
        L_0x014d:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r2.k(r12, r7)
            goto L_0x0468
        L_0x0164:
            boolean r13 = r0.y(r1, r12, r6)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.lang.Double r7 = (java.lang.Double) r7
            double r13 = r7.doubleValue()
            r2.g(r12, r13)
            goto L_0x0468
        L_0x017b:
            r7 = r7 & r11
            long r12 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r12)
            if (r7 != 0) goto L_0x0185
            goto L_0x0468
        L_0x0185:
            java.lang.Object r1 = r0.j(r6)
            com.google.android.gms.internal.firebase-auth-api.i3 r1 = (com.google.android.gms.internal.p000firebaseauthapi.i3) r1
            throw r5
        L_0x018c:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.firebase-auth-api.z3 r13 = r0.h(r6)
            com.google.android.gms.internal.p000firebaseauthapi.a4.j(r12, r7, r2, r13)
            goto L_0x0468
        L_0x019d:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.q(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01aa:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.p(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01b7:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.o(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01c4:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.n(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01d1:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.f(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01de:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.s(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01eb:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.c(r12, r7, r2, r8)
            goto L_0x0468
        L_0x01f8:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.g(r12, r7, r2, r8)
            goto L_0x0468
        L_0x0205:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.h(r12, r7, r2, r8)
            goto L_0x0468
        L_0x0212:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.k(r12, r7, r2, r8)
            goto L_0x0468
        L_0x021f:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.t(r12, r7, r2, r8)
            goto L_0x0468
        L_0x022c:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.l(r12, r7, r2, r8)
            goto L_0x0468
        L_0x0239:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.i(r12, r7, r2, r8)
            goto L_0x0468
        L_0x0246:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.e(r12, r7, r2, r8)
            goto L_0x0468
        L_0x0253:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.q(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0260:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.p(r12, r7, r2, r9)
            goto L_0x0468
        L_0x026d:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.o(r12, r7, r2, r9)
            goto L_0x0468
        L_0x027a:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.n(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0287:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.f(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0294:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.s(r12, r7, r2, r9)
            goto L_0x0468
        L_0x02a1:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.d(r12, r7, r2)
            goto L_0x0468
        L_0x02ae:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.firebase-auth-api.z3 r13 = r0.h(r6)
            com.google.android.gms.internal.p000firebaseauthapi.a4.m(r12, r7, r2, r13)
            goto L_0x0468
        L_0x02bf:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.r(r12, r7, r2)
            goto L_0x0468
        L_0x02cc:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.c(r12, r7, r2, r9)
            goto L_0x0468
        L_0x02d9:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.g(r12, r7, r2, r9)
            goto L_0x0468
        L_0x02e6:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.h(r12, r7, r2, r9)
            goto L_0x0468
        L_0x02f3:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.k(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0300:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.t(r12, r7, r2, r9)
            goto L_0x0468
        L_0x030d:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.l(r12, r7, r2, r9)
            goto L_0x0468
        L_0x031a:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.i(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0327:
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.p000firebaseauthapi.a4.e(r12, r7, r2, r9)
            goto L_0x0468
        L_0x0334:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            com.google.android.gms.internal.firebase-auth-api.z3 r13 = r0.h(r6)
            r2.l(r12, r13, r7)
            goto L_0x0468
        L_0x0349:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r1, r13)
            r2.b(r12, r13)
            goto L_0x0468
        L_0x035a:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r1, r13)
            r2.a(r12, r7)
            goto L_0x0468
        L_0x036b:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r1, r13)
            r2.q(r12, r13)
            goto L_0x0468
        L_0x037c:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r1, r13)
            r2.p(r12, r7)
            goto L_0x0468
        L_0x038d:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r1, r13)
            r2.h(r12, r7)
            goto L_0x0468
        L_0x039e:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r1, r13)
            r2.c(r12, r7)
            goto L_0x0468
        L_0x03af:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            com.google.android.gms.internal.firebase-auth-api.q1 r7 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r7
            r2.f(r12, r7)
            goto L_0x0468
        L_0x03c2:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            com.google.android.gms.internal.firebase-auth-api.z3 r13 = r0.h(r6)
            r2.o(r12, r13, r7)
            goto L_0x0468
        L_0x03d7:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r13)
            z(r12, r7, r2)
            goto L_0x0468
        L_0x03e8:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            boolean r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.w(r1, r13)
            r2.e(r12, r7)
            goto L_0x0468
        L_0x03f9:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r1, r13)
            r2.i(r12, r7)
            goto L_0x0468
        L_0x0409:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r1, r13)
            r2.j(r12, r13)
            goto L_0x0468
        L_0x0419:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            int r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r1, r13)
            r2.m(r12, r7)
            goto L_0x0468
        L_0x0429:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r1, r13)
            r2.d(r12, r13)
            goto L_0x0468
        L_0x0439:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            long r13 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r1, r13)
            r2.n(r12, r13)
            goto L_0x0468
        L_0x0449:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            float r7 = com.google.android.gms.internal.p000firebaseauthapi.u4.f(r1, r13)
            r2.k(r12, r7)
            goto L_0x0468
        L_0x0459:
            boolean r13 = r0.w(r6, r1)
            if (r13 == 0) goto L_0x0468
            r7 = r7 & r11
            long r13 = (long) r7
            double r13 = com.google.android.gms.internal.p000firebaseauthapi.u4.e(r1, r13)
            r2.g(r12, r13)
        L_0x0468:
            int r6 = r6 + 3
            goto L_0x001c
        L_0x046c:
            com.google.android.gms.internal.firebase-auth-api.l4 r1 = r4.d(r1)
            r4.r(r1, r2)
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
            int r13 = r0.J(r6)
            r14 = r10[r6]
            int r15 = r13 >>> 20
            r15 = r15 & 255(0xff, float:3.57E-43)
            r9 = 17
            sun.misc.Unsafe r5 = f4860p
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
            boolean r8 = r0.y(r1, r14, r6)
            if (r8 == 0) goto L_0x04b0
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.firebase-auth-api.z3 r8 = r0.h(r6)
            r2.l(r14, r8, r5)
            goto L_0x04b0
        L_0x04c6:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            long r8 = f(r1, r9)
            r2.b(r14, r8)
            goto L_0x04b0
        L_0x04d4:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = E(r1, r9)
            r2.a(r14, r5)
            goto L_0x04b0
        L_0x04e2:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            long r8 = f(r1, r9)
            r2.q(r14, r8)
            goto L_0x04b0
        L_0x04f0:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = E(r1, r9)
            r2.p(r14, r5)
            goto L_0x04b0
        L_0x04fe:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = E(r1, r9)
            r2.h(r14, r5)
            goto L_0x04b0
        L_0x050c:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = E(r1, r9)
            r2.c(r14, r5)
            goto L_0x04b0
        L_0x051a:
            boolean r8 = r0.y(r1, r14, r6)
            if (r8 == 0) goto L_0x04b0
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.firebase-auth-api.q1 r5 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r5
            r2.f(r14, r5)
            goto L_0x04b0
        L_0x052a:
            boolean r8 = r0.y(r1, r14, r6)
            if (r8 == 0) goto L_0x04b0
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.firebase-auth-api.z3 r8 = r0.h(r6)
            r2.o(r14, r8, r5)
            goto L_0x04b0
        L_0x053d:
            boolean r8 = r0.y(r1, r14, r6)
            if (r8 == 0) goto L_0x04b0
            java.lang.Object r5 = r5.getObject(r1, r9)
            z(r14, r5, r2)
            goto L_0x04b0
        L_0x054c:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            java.lang.Object r5 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r9)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r2.e(r14, r5)
            goto L_0x04b0
        L_0x0561:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = E(r1, r9)
            r2.i(r14, r5)
            goto L_0x04b0
        L_0x0570:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            long r8 = f(r1, r9)
            r2.j(r14, r8)
            goto L_0x04b0
        L_0x057f:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            int r5 = E(r1, r9)
            r2.m(r14, r5)
            goto L_0x04b0
        L_0x058e:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            long r8 = f(r1, r9)
            r2.d(r14, r8)
            goto L_0x04b0
        L_0x059d:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            long r8 = f(r1, r9)
            r2.n(r14, r8)
            goto L_0x04b0
        L_0x05ac:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            java.lang.Object r5 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r9)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r2.k(r14, r5)
            goto L_0x04b0
        L_0x05c1:
            boolean r5 = r0.y(r1, r14, r6)
            if (r5 == 0) goto L_0x04b0
            java.lang.Object r5 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r1, r9)
            java.lang.Double r5 = (java.lang.Double) r5
            double r8 = r5.doubleValue()
            r2.g(r14, r8)
            goto L_0x04b0
        L_0x05d6:
            java.lang.Object r5 = r5.getObject(r1, r9)
            if (r5 != 0) goto L_0x05de
            goto L_0x04b0
        L_0x05de:
            java.lang.Object r1 = r0.j(r6)
            com.google.android.gms.internal.firebase-auth-api.i3 r1 = (com.google.android.gms.internal.p000firebaseauthapi.i3) r1
            r1 = 0
            throw r1
        L_0x05e6:
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.firebase-auth-api.z3 r9 = r0.h(r6)
            com.google.android.gms.internal.p000firebaseauthapi.a4.j(r8, r5, r2, r9)
            goto L_0x04b0
        L_0x05f7:
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            r11 = 1
            com.google.android.gms.internal.p000firebaseauthapi.a4.q(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0605:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.p(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0613:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.o(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0621:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.n(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x062f:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.f(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x063d:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.s(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x064b:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.c(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0659:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.g(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0667:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.h(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0675:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.k(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0683:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.t(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x0691:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.l(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x069f:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.i(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x06ad:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.e(r8, r5, r2, r11)
            goto L_0x04b1
        L_0x06bb:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            r14 = 0
            com.google.android.gms.internal.p000firebaseauthapi.a4.q(r8, r5, r2, r14)
            goto L_0x070e
        L_0x06c9:
            r11 = 1
            r14 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.p(r8, r5, r2, r14)
            goto L_0x070e
        L_0x06d7:
            r11 = 1
            r14 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.o(r8, r5, r2, r14)
            goto L_0x070e
        L_0x06e5:
            r11 = 1
            r14 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.n(r8, r5, r2, r14)
            goto L_0x070e
        L_0x06f3:
            r11 = 1
            r14 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.f(r8, r5, r2, r14)
            goto L_0x070e
        L_0x0701:
            r11 = 1
            r14 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.s(r8, r5, r2, r14)
        L_0x070e:
            r15 = r14
            goto L_0x08b7
        L_0x0711:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.d(r8, r5, r2)
            goto L_0x04b1
        L_0x071f:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.firebase-auth-api.z3 r9 = r0.h(r6)
            com.google.android.gms.internal.p000firebaseauthapi.a4.m(r8, r5, r2, r9)
            goto L_0x04b1
        L_0x0731:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.r(r8, r5, r2)
            goto L_0x04b1
        L_0x073f:
            r11 = 1
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            r15 = 0
            com.google.android.gms.internal.p000firebaseauthapi.a4.c(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x074e:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.g(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x075d:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.h(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x076c:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.k(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x077b:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.t(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x078a:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.l(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x0799:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.i(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x07a8:
            r11 = 1
            r15 = 0
            r8 = r13[r6]
            java.lang.Object r5 = r5.getObject(r1, r9)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.p000firebaseauthapi.a4.e(r8, r5, r2, r15)
            goto L_0x08b7
        L_0x07b7:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.firebase-auth-api.z3 r8 = r0.h(r6)
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
            com.google.android.gms.internal.firebase-auth-api.q1 r5 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r5
            r2.f(r14, r5)
            goto L_0x08b7
        L_0x082d:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            java.lang.Object r5 = r5.getObject(r1, r9)
            com.google.android.gms.internal.firebase-auth-api.z3 r8 = r0.h(r6)
            r2.o(r14, r8, r5)
            goto L_0x08b7
        L_0x083f:
            r11 = 1
            r15 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x08b7
            java.lang.Object r5 = r5.getObject(r1, r9)
            z(r14, r5, r2)
            goto L_0x08b7
        L_0x084d:
            r11 = 1
            r15 = 0
            r5 = r8 & r12
            if (r5 == 0) goto L_0x08b7
            boolean r5 = com.google.android.gms.internal.p000firebaseauthapi.u4.w(r1, r9)
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
            float r5 = com.google.android.gms.internal.p000firebaseauthapi.u4.f(r1, r9)
            r2.k(r14, r5)
            goto L_0x08b7
        L_0x08aa:
            r11 = 1
            r15 = 0
            r5 = r8 & r12
            if (r5 == 0) goto L_0x08b7
            double r8 = com.google.android.gms.internal.p000firebaseauthapi.u4.e(r1, r9)
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
            com.google.android.gms.internal.firebase-auth-api.l4 r1 = r4.d(r1)
            r4.r(r1, r2)
            return
        L_0x08ca:
            r6.a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.r3.c(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.z1):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void d(java.lang.Object r20, com.google.android.gms.internal.p000firebaseauthapi.u1 r21, com.google.android.gms.internal.p000firebaseauthapi.c2 r22) {
        /*
            r19 = this;
            r1 = r19
            r8 = r20
            r0 = r21
            r9 = r22
            int[] r10 = r1.f4869i
            int r11 = r1.f4871k
            int r12 = r1.f4870j
            r22.getClass()
            n(r20)
            com.google.android.gms.internal.firebase-auth-api.k4 r13 = r1.m
            r15 = 0
            r16 = 0
        L_0x0019:
            int r3 = r21.t()     // Catch:{ all -> 0x002b }
            int r2 = r1.f4863c     // Catch:{ all -> 0x002b }
            r4 = 0
            if (r3 < r2) goto L_0x002e
            int r2 = r1.f4864d     // Catch:{ all -> 0x002b }
            if (r3 > r2) goto L_0x002e
            int r2 = r1.I(r3, r4)     // Catch:{ all -> 0x002b }
            goto L_0x002f
        L_0x002b:
            r0 = move-exception
            goto L_0x0641
        L_0x002e:
            r2 = -1
        L_0x002f:
            if (r2 >= 0) goto L_0x0083
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x0046
        L_0x0036:
            if (r12 >= r11) goto L_0x0040
            r0 = r10[r12]
            r1.i(r8, r0, r15)
            int r12 = r12 + 1
            goto L_0x0036
        L_0x0040:
            if (r15 == 0) goto L_0x0640
            r13.n(r8, r15)
            return
        L_0x0046:
            boolean r2 = r1.f4866f     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.firebase-auth-api.d2 r4 = r1.f4873n
            if (r2 != 0) goto L_0x004e
            r2 = 0
            goto L_0x0054
        L_0x004e:
            com.google.android.gms.internal.firebase-auth-api.o3 r2 = r1.f4865e     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.firebase-auth-api.o2 r2 = r4.c(r9, r2, r3)     // Catch:{ all -> 0x002b }
        L_0x0054:
            if (r2 == 0) goto L_0x0064
            if (r16 != 0) goto L_0x005e
            com.google.android.gms.internal.firebase-auth-api.i2 r2 = r4.b(r8)     // Catch:{ all -> 0x002b }
            r16 = r2
        L_0x005e:
            java.lang.Object r2 = r4.d()     // Catch:{ all -> 0x002b }
        L_0x0062:
            r15 = r2
            goto L_0x0019
        L_0x0064:
            r13.q()     // Catch:{ all -> 0x002b }
            if (r15 != 0) goto L_0x006d
            com.google.android.gms.internal.firebase-auth-api.l4 r15 = r13.c(r8)     // Catch:{ all -> 0x002b }
        L_0x006d:
            boolean r2 = r13.p(r15, r0)     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0019
        L_0x0073:
            if (r12 >= r11) goto L_0x007d
            r0 = r10[r12]
            r1.i(r8, r0, r15)
            int r12 = r12 + 1
            goto L_0x0073
        L_0x007d:
            if (r15 == 0) goto L_0x0640
            r13.n(r8, r15)
            return
        L_0x0083:
            int r5 = r1.J(r2)     // Catch:{ all -> 0x002b }
            int r6 = r5 >>> 20
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 3
            com.google.android.gms.internal.firebase-auth-api.t1 r14 = r0.f4970a
            com.google.android.gms.internal.firebase-auth-api.d3 r4 = r1.f4872l
            r18 = 1048575(0xfffff, float:1.469367E-39)
            switch(r6) {
                case 0: goto L_0x05f5;
                case 1: goto L_0x05e0;
                case 2: goto L_0x05cb;
                case 3: goto L_0x05b6;
                case 4: goto L_0x05a1;
                case 5: goto L_0x058c;
                case 6: goto L_0x0577;
                case 7: goto L_0x0562;
                case 8: goto L_0x0558;
                case 9: goto L_0x053d;
                case 10: goto L_0x052c;
                case 11: goto L_0x0517;
                case 12: goto L_0x04e5;
                case 13: goto L_0x04d0;
                case 14: goto L_0x04bb;
                case 15: goto L_0x04a6;
                case 16: goto L_0x0491;
                case 17: goto L_0x0477;
                case 18: goto L_0x0469;
                case 19: goto L_0x045b;
                case 20: goto L_0x044d;
                case 21: goto L_0x043f;
                case 22: goto L_0x0431;
                case 23: goto L_0x0423;
                case 24: goto L_0x0415;
                case 25: goto L_0x0407;
                case 26: goto L_0x03e1;
                case 27: goto L_0x03cf;
                case 28: goto L_0x03c1;
                case 29: goto L_0x03b3;
                case 30: goto L_0x0399;
                case 31: goto L_0x038b;
                case 32: goto L_0x037d;
                case 33: goto L_0x036f;
                case 34: goto L_0x0361;
                case 35: goto L_0x0353;
                case 36: goto L_0x0345;
                case 37: goto L_0x0337;
                case 38: goto L_0x0329;
                case 39: goto L_0x031b;
                case 40: goto L_0x030d;
                case 41: goto L_0x02ff;
                case 42: goto L_0x02f1;
                case 43: goto L_0x02e3;
                case 44: goto L_0x02c9;
                case 45: goto L_0x02bb;
                case 46: goto L_0x02ad;
                case 47: goto L_0x029f;
                case 48: goto L_0x0291;
                case 49: goto L_0x027f;
                case 50: goto L_0x0246;
                case 51: goto L_0x022d;
                case 52: goto L_0x0217;
                case 53: goto L_0x0201;
                case 54: goto L_0x01eb;
                case 55: goto L_0x01d5;
                case 56: goto L_0x01bf;
                case 57: goto L_0x01a8;
                case 58: goto L_0x0191;
                case 59: goto L_0x0189;
                case 60: goto L_0x0170;
                case 61: goto L_0x0161;
                case 62: goto L_0x014a;
                case 63: goto L_0x0114;
                case 64: goto L_0x00fd;
                case 65: goto L_0x00e6;
                case 66: goto L_0x00cf;
                case 67: goto L_0x00b8;
                case 68: goto L_0x00a0;
                default: goto L_0x0096;
            }
        L_0x0096:
            r17 = 0
            if (r15 != 0) goto L_0x060b
            com.google.android.gms.internal.firebase-auth-api.l4 r2 = r13.c(r8)     // Catch:{ v2 -> 0x0621 }
            goto L_0x060a
        L_0x00a0:
            java.lang.Object r4 = r1.l(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.firebase-auth-api.o3 r4 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.firebase-auth-api.z3 r5 = r1.h(r2)     // Catch:{ v2 -> 0x027b }
            r6 = r4
            com.google.android.gms.internal.firebase-auth-api.o3 r6 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r6     // Catch:{ v2 -> 0x027b }
            r0.q(r7)     // Catch:{ v2 -> 0x027b }
            r0.n(r6, r5, r9)     // Catch:{ v2 -> 0x027b }
            r1.u(r8, r3, r2, r4)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x00b8:
            r4 = r5 & r18
            r5 = 0
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            long r5 = r14.u()     // Catch:{ v2 -> 0x027b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x00cf:
            r4 = r5 & r18
            r5 = 0
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            int r5 = r14.o()     // Catch:{ v2 -> 0x027b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x00e6:
            r4 = r5 & r18
            r5 = 1
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            long r5 = r14.t()     // Catch:{ v2 -> 0x027b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x00fd:
            r4 = r5 & r18
            r5 = 5
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            int r5 = r14.n()     // Catch:{ v2 -> 0x027b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x0114:
            r4 = 0
            r0.q(r4)     // Catch:{ v2 -> 0x027b }
            int r4 = r14.k()     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.firebase-auth-api.s2 r6 = r1.g(r2)     // Catch:{ v2 -> 0x027b }
            if (r6 == 0) goto L_0x013b
            boolean r6 = r6.zza()     // Catch:{ v2 -> 0x027b }
            if (r6 == 0) goto L_0x0129
            goto L_0x013b
        L_0x0129:
            java.lang.Class r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.f4371a     // Catch:{ v2 -> 0x027b }
            if (r15 != 0) goto L_0x0132
            com.google.android.gms.internal.firebase-auth-api.l4 r2 = r13.c(r8)     // Catch:{ v2 -> 0x027b }
            goto L_0x0133
        L_0x0132:
            r2 = r15
        L_0x0133:
            long r4 = (long) r4     // Catch:{ v2 -> 0x027b }
            r13.l(r2, r3, r4)     // Catch:{ v2 -> 0x027b }
            r17 = 0
            goto L_0x0062
        L_0x013b:
            r5 = r5 & r18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ v2 -> 0x027b }
            long r5 = (long) r5     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r5, r4)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x014a:
            r4 = r5 & r18
            r5 = 0
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            int r5 = r14.q()     // Catch:{ v2 -> 0x027b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x0161:
            r4 = r5 & r18
            com.google.android.gms.internal.firebase-auth-api.q1 r5 = r21.u()     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x0170:
            java.lang.Object r4 = r1.l(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.firebase-auth-api.o3 r4 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.firebase-auth-api.z3 r5 = r1.h(r2)     // Catch:{ v2 -> 0x027b }
            r6 = r4
            com.google.android.gms.internal.firebase-auth-api.o3 r6 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r6     // Catch:{ v2 -> 0x027b }
            r7 = 2
            r0.q(r7)     // Catch:{ v2 -> 0x027b }
            r0.o(r6, r5, r9)     // Catch:{ v2 -> 0x027b }
            r1.u(r8, r3, r2, r4)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x0189:
            r1.q(r8, r5, r0)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x0191:
            r4 = r5 & r18
            r5 = 0
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            boolean r5 = r14.c()     // Catch:{ v2 -> 0x027b }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x01a8:
            r4 = r5 & r18
            r5 = 5
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            int r5 = r14.l()     // Catch:{ v2 -> 0x027b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x01bf:
            r4 = r5 & r18
            r5 = 1
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            long r5 = r14.r()     // Catch:{ v2 -> 0x027b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x01d5:
            r4 = r5 & r18
            r5 = 0
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            int r5 = r14.m()     // Catch:{ v2 -> 0x027b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x01eb:
            r4 = r5 & r18
            r5 = 0
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            long r5 = r14.v()     // Catch:{ v2 -> 0x027b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x0201:
            r4 = r5 & r18
            r5 = 0
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            long r5 = r14.s()     // Catch:{ v2 -> 0x027b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x0217:
            r4 = r5 & r18
            r5 = 5
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            float r5 = r14.h()     // Catch:{ v2 -> 0x027b }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
            goto L_0x0242
        L_0x022d:
            r4 = r5 & r18
            r5 = 1
            r0.q(r5)     // Catch:{ v2 -> 0x027b }
            double r5 = r14.g()     // Catch:{ v2 -> 0x027b }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ v2 -> 0x027b }
            long r6 = (long) r4     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r6, r5)     // Catch:{ v2 -> 0x027b }
            r1.s(r8, r3, r2)     // Catch:{ v2 -> 0x027b }
        L_0x0242:
            r17 = 0
            goto L_0x0019
        L_0x0246:
            java.lang.Object r3 = r1.j(r2)     // Catch:{ v2 -> 0x027b }
            int r2 = r1.J(r2)     // Catch:{ v2 -> 0x027b }
            r2 = r2 & r18
            long r4 = (long) r2     // Catch:{ v2 -> 0x027b }
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r8, r4)     // Catch:{ v2 -> 0x027b }
            if (r2 == 0) goto L_0x026b
            boolean r6 = com.google.android.gms.internal.p000firebaseauthapi.k3.b(r2)     // Catch:{ v2 -> 0x027b }
            if (r6 == 0) goto L_0x0274
            com.google.android.gms.internal.firebase-auth-api.j3 r6 = com.google.android.gms.internal.p000firebaseauthapi.j3.f4659b     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.firebase-auth-api.j3 r6 = r6.b()     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.k3.c(r6, r2)     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r4, r6)     // Catch:{ v2 -> 0x027b }
            r2 = r6
            goto L_0x0274
        L_0x026b:
            com.google.android.gms.internal.firebase-auth-api.j3 r2 = com.google.android.gms.internal.p000firebaseauthapi.j3.f4659b     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.firebase-auth-api.j3 r2 = r2.b()     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r4, r2)     // Catch:{ v2 -> 0x027b }
        L_0x0274:
            com.google.android.gms.internal.firebase-auth-api.j3 r2 = (com.google.android.gms.internal.p000firebaseauthapi.j3) r2     // Catch:{ v2 -> 0x027b }
            com.google.android.gms.internal.firebase-auth-api.i3 r3 = (com.google.android.gms.internal.p000firebaseauthapi.i3) r3     // Catch:{ v2 -> 0x027b }
            r17 = 0
            throw r17     // Catch:{ v2 -> 0x0621 }
        L_0x027b:
            r17 = 0
            goto L_0x0621
        L_0x027f:
            r17 = 0
            r3 = r5 & r18
            com.google.android.gms.internal.firebase-auth-api.z3 r2 = r1.h(r2)     // Catch:{ v2 -> 0x0621 }
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            java.util.List r3 = r4.a(r8, r5)     // Catch:{ v2 -> 0x0621 }
            r0.c(r3, r2, r9)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0291:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.j(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x029f:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.i(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x02ad:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.h(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x02bb:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.g(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x02c9:
            r17 = 0
            r5 = r5 & r18
            long r5 = (long) r5     // Catch:{ v2 -> 0x0621 }
            java.util.List r4 = r4.a(r8, r5)     // Catch:{ v2 -> 0x0621 }
            r0.y(r4)     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.firebase-auth-api.s2 r5 = r1.g(r2)     // Catch:{ v2 -> 0x0621 }
            r2 = r20
            r6 = r15
            r7 = r13
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.a(r2, r3, r4, r5, r6, r7)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0062
        L_0x02e3:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.l(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x02f1:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.v(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x02ff:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.z(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x030d:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.a(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x031b:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.d(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0329:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.m(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0337:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.e(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0345:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.b(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0353:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.x(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0361:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.j(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x036f:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.i(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x037d:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.h(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x038b:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.g(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0399:
            r17 = 0
            r5 = r5 & r18
            long r5 = (long) r5     // Catch:{ v2 -> 0x0621 }
            java.util.List r4 = r4.a(r8, r5)     // Catch:{ v2 -> 0x0621 }
            r0.y(r4)     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.firebase-auth-api.s2 r5 = r1.g(r2)     // Catch:{ v2 -> 0x0621 }
            r2 = r20
            r6 = r15
            r7 = r13
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.a(r2, r3, r4, r5, r6, r7)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0062
        L_0x03b3:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.l(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x03c1:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.w(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x03cf:
            r17 = 0
            com.google.android.gms.internal.firebase-auth-api.z3 r2 = r1.h(r2)     // Catch:{ v2 -> 0x0621 }
            r3 = r5 & r18
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            java.util.List r3 = r4.a(r8, r5)     // Catch:{ v2 -> 0x0621 }
            r0.f(r3, r2, r9)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x03e1:
            r17 = 0
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r5
            if (r2 == 0) goto L_0x03ea
            r2 = 1
            goto L_0x03eb
        L_0x03ea:
            r2 = 0
        L_0x03eb:
            if (r2 == 0) goto L_0x03fa
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r3 = 1
            r0.k(r2, r3)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x03fa:
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r3 = 0
            r0.k(r2, r3)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0407:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.v(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0415:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.z(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0423:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.a(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0431:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.d(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x043f:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.m(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x044d:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.e(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x045b:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.b(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0469:
            r17 = 0
            r2 = r5 & r18
            long r2 = (long) r2     // Catch:{ v2 -> 0x0621 }
            java.util.List r2 = r4.a(r8, r2)     // Catch:{ v2 -> 0x0621 }
            r0.x(r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0477:
            r17 = 0
            java.lang.Object r3 = r1.k(r8, r2)     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.firebase-auth-api.o3 r3 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.firebase-auth-api.z3 r4 = r1.h(r2)     // Catch:{ v2 -> 0x0621 }
            r5 = r3
            com.google.android.gms.internal.firebase-auth-api.o3 r5 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r5     // Catch:{ v2 -> 0x0621 }
            r0.q(r7)     // Catch:{ v2 -> 0x0621 }
            r0.n(r5, r4, r9)     // Catch:{ v2 -> 0x0621 }
            r1.t(r8, r2, r3)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0491:
            r17 = 0
            r3 = r5 & r18
            r4 = 0
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            long r4 = r14.u()     // Catch:{ v2 -> 0x0621 }
            long r6 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.r(r8, r6, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x04a6:
            r17 = 0
            r3 = r5 & r18
            r4 = 0
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            int r4 = r14.o()     // Catch:{ v2 -> 0x0621 }
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.q(r8, r5, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x04bb:
            r17 = 0
            r3 = r5 & r18
            r4 = 1
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            long r4 = r14.t()     // Catch:{ v2 -> 0x0621 }
            long r6 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.r(r8, r6, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x04d0:
            r17 = 0
            r3 = r5 & r18
            r4 = 5
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            int r4 = r14.n()     // Catch:{ v2 -> 0x0621 }
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.q(r8, r5, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x04e5:
            r17 = 0
            r4 = 0
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            int r4 = r14.k()     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.firebase-auth-api.s2 r6 = r1.g(r2)     // Catch:{ v2 -> 0x0621 }
            if (r6 == 0) goto L_0x050c
            boolean r6 = r6.zza()     // Catch:{ v2 -> 0x0621 }
            if (r6 == 0) goto L_0x04fc
            goto L_0x050c
        L_0x04fc:
            java.lang.Class r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.f4371a     // Catch:{ v2 -> 0x0621 }
            if (r15 != 0) goto L_0x0505
            com.google.android.gms.internal.firebase-auth-api.l4 r2 = r13.c(r8)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0506
        L_0x0505:
            r2 = r15
        L_0x0506:
            long r4 = (long) r4     // Catch:{ v2 -> 0x0621 }
            r13.l(r2, r3, r4)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0062
        L_0x050c:
            r3 = r5 & r18
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.q(r8, r5, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0517:
            r17 = 0
            r3 = r5 & r18
            r4 = 0
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            int r4 = r14.q()     // Catch:{ v2 -> 0x0621 }
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.q(r8, r5, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x052c:
            r17 = 0
            r3 = r5 & r18
            com.google.android.gms.internal.firebase-auth-api.q1 r4 = r21.u()     // Catch:{ v2 -> 0x0621 }
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r8, r5, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x053d:
            r17 = 0
            java.lang.Object r3 = r1.k(r8, r2)     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.firebase-auth-api.o3 r3 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.firebase-auth-api.z3 r4 = r1.h(r2)     // Catch:{ v2 -> 0x0621 }
            r5 = r3
            com.google.android.gms.internal.firebase-auth-api.o3 r5 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r5     // Catch:{ v2 -> 0x0621 }
            r6 = 2
            r0.q(r6)     // Catch:{ v2 -> 0x0621 }
            r0.o(r5, r4, r9)     // Catch:{ v2 -> 0x0621 }
            r1.t(r8, r2, r3)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0558:
            r17 = 0
            r1.q(r8, r5, r0)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0562:
            r17 = 0
            r3 = r5 & r18
            r4 = 0
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            boolean r4 = r14.c()     // Catch:{ v2 -> 0x0621 }
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.m(r8, r5, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x0577:
            r17 = 0
            r3 = r5 & r18
            r4 = 5
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            int r4 = r14.l()     // Catch:{ v2 -> 0x0621 }
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.q(r8, r5, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x058c:
            r17 = 0
            r3 = r5 & r18
            r4 = 1
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            long r4 = r14.r()     // Catch:{ v2 -> 0x0621 }
            long r6 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.r(r8, r6, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x05a1:
            r17 = 0
            r3 = r5 & r18
            r4 = 0
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            int r4 = r14.m()     // Catch:{ v2 -> 0x0621 }
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.q(r8, r5, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x05b6:
            r17 = 0
            r3 = r5 & r18
            r4 = 0
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            long r4 = r14.v()     // Catch:{ v2 -> 0x0621 }
            long r6 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.r(r8, r6, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x05cb:
            r17 = 0
            r3 = r5 & r18
            r4 = 0
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            long r4 = r14.s()     // Catch:{ v2 -> 0x0621 }
            long r6 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.r(r8, r6, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x05e0:
            r17 = 0
            r3 = r5 & r18
            r4 = 5
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            float r4 = r14.h()     // Catch:{ v2 -> 0x0621 }
            long r5 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.p(r8, r5, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x05f5:
            r17 = 0
            r3 = r5 & r18
            r4 = 1
            r0.q(r4)     // Catch:{ v2 -> 0x0621 }
            double r4 = r14.g()     // Catch:{ v2 -> 0x0621 }
            long r6 = (long) r3     // Catch:{ v2 -> 0x0621 }
            com.google.android.gms.internal.p000firebaseauthapi.u4.o(r8, r6, r4)     // Catch:{ v2 -> 0x0621 }
            r1.r(r8, r2)     // Catch:{ v2 -> 0x0621 }
            goto L_0x0019
        L_0x060a:
            r15 = r2
        L_0x060b:
            boolean r2 = r13.p(r15, r0)     // Catch:{ v2 -> 0x0621 }
            if (r2 != 0) goto L_0x0019
        L_0x0611:
            if (r12 >= r11) goto L_0x061b
            r0 = r10[r12]
            r1.i(r8, r0, r15)
            int r12 = r12 + 1
            goto L_0x0611
        L_0x061b:
            if (r15 == 0) goto L_0x0640
            r13.n(r8, r15)
            return
        L_0x0621:
            r13.q()     // Catch:{ all -> 0x002b }
            if (r15 != 0) goto L_0x062b
            com.google.android.gms.internal.firebase-auth-api.l4 r2 = r13.c(r8)     // Catch:{ all -> 0x002b }
            r15 = r2
        L_0x062b:
            boolean r2 = r13.p(r15, r0)     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0019
        L_0x0631:
            if (r12 >= r11) goto L_0x063b
            r0 = r10[r12]
            r1.i(r8, r0, r15)
            int r12 = r12 + 1
            goto L_0x0631
        L_0x063b:
            if (r15 == 0) goto L_0x0640
            r13.n(r8, r15)
        L_0x0640:
            return
        L_0x0641:
            if (r12 >= r11) goto L_0x064b
            r2 = r10[r12]
            r1.i(r8, r2, r15)
            int r12 = r12 + 1
            goto L_0x0641
        L_0x064b:
            if (r15 == 0) goto L_0x0650
            r13.n(r8, r15)
        L_0x0650:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.r3.d(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.u1, com.google.android.gms.internal.firebase-auth-api.c2):void");
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
    public final void e(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.p000firebaseauthapi.h1 r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            boolean r0 = r15.f4868h
            if (r0 == 0) goto L_0x034e
            n(r30)
            sun.misc.Unsafe r9 = f4860p
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
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.j(r0, r12, r3, r11)
            int r3 = r11.f4604a
            r4 = r0
            r16 = r3
            goto L_0x0032
        L_0x002f:
            r16 = r0
            r4 = r3
        L_0x0032:
            int r3 = r16 >>> 3
            int r0 = r15.f4864d
            int r8 = r15.f4863c
            if (r3 <= r1) goto L_0x0045
            int r2 = r2 / 3
            if (r3 < r8) goto L_0x004e
            if (r3 > r0) goto L_0x004e
            int r0 = r15.I(r3, r2)
            goto L_0x004f
        L_0x0045:
            if (r3 < r8) goto L_0x004e
            if (r3 > r0) goto L_0x004e
            int r0 = r15.I(r3, r10)
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
            int[] r1 = r15.f4861a
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
            int r7 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r12, r4, r11)
            long r0 = r11.f4605b
            long r4 = com.google.android.gms.internal.p000firebaseauthapi.t1.f(r0)
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
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r12, r4, r11)
            int r1 = r11.f4604a
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.t1.e(r1)
            r2 = r23
            r9.putInt(r14, r2, r1)
            goto L_0x0122
        L_0x00e4:
            r4 = r32
            r0 = r23
            if (r2 != 0) goto L_0x0126
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r12, r4, r11)
            int r3 = r11.f4604a
            r9.putInt(r14, r0, r3)
            goto L_0x0104
        L_0x00f4:
            r4 = r32
            r0 = r23
            r3 = 2
            if (r2 != r3) goto L_0x0126
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.i1.a(r12, r4, r11)
            java.lang.Object r3 = r11.f4606c
            r9.putObject(r14, r0, r3)
        L_0x0104:
            r0 = r2
            goto L_0x0122
        L_0x0106:
            r4 = r32
            r3 = 2
            if (r2 != r3) goto L_0x0126
            java.lang.Object r7 = r15.k(r14, r8)
            com.google.android.gms.internal.firebase-auth-api.z3 r1 = r15.h(r8)
            r0 = r7
            r2 = r31
            r3 = r4
            r4 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.n(r0, r1, r2, r3, r4, r5)
            r15.t(r14, r8, r7)
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
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.f(r12, r4, r11)
            goto L_0x0140
        L_0x013c:
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.g(r12, r4, r11)
        L_0x0140:
            java.lang.Object r1 = r11.f4606c
            r9.putObject(r14, r5, r1)
            goto L_0x01f0
        L_0x0147:
            r4 = r32
            r32 = r6
            r5 = r23
            if (r2 != 0) goto L_0x0163
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r12, r4, r11)
            long r1 = r11.f4605b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x015d
            r1 = 1
            goto L_0x015e
        L_0x015d:
            r1 = 0
        L_0x015e:
            com.google.android.gms.internal.p000firebaseauthapi.u4.m(r14, r5, r1)
            goto L_0x01f0
        L_0x0163:
            r7 = r4
            goto L_0x01f6
        L_0x0166:
            r4 = r32
            r32 = r6
            r5 = r23
            if (r2 != r1) goto L_0x0163
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.b(r12, r4)
            r9.putInt(r14, r5, r0)
            int r4 = r4 + 4
            goto L_0x01ef
        L_0x0179:
            r4 = r32
            r32 = r6
            r5 = r23
            r0 = 1
            if (r2 != r0) goto L_0x0163
            long r21 = com.google.android.gms.internal.p000firebaseauthapi.i1.o(r12, r4)
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
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.i(r12, r7, r11)
            int r1 = r11.f4604a
            r9.putInt(r14, r5, r1)
            goto L_0x01f0
        L_0x01a3:
            r7 = r32
            r32 = r6
            r5 = r23
            if (r2 != 0) goto L_0x01f6
            int r7 = com.google.android.gms.internal.p000firebaseauthapi.i1.l(r12, r7, r11)
            long r2 = r11.f4605b
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
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.b(r12, r7)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.p000firebaseauthapi.u4.p(r14, r5, r0)
            int r4 = r7 + 4
            goto L_0x01ef
        L_0x01d9:
            r7 = r32
            r32 = r6
            r5 = r23
            r0 = 1
            if (r2 != r0) goto L_0x01f6
            long r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.o(r12, r7)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.p000firebaseauthapi.u4.o(r14, r5, r0)
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
            com.google.android.gms.internal.firebase-auth-api.t2 r0 = (com.google.android.gms.internal.p000firebaseauthapi.t2) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0232
            int r1 = r0.size()
            if (r1 != 0) goto L_0x022a
            r1 = 10
            goto L_0x022b
        L_0x022a:
            int r1 = r1 + r1
        L_0x022b:
            com.google.android.gms.internal.firebase-auth-api.t2 r0 = r0.zzd(r1)
            r9.putObject(r14, r5, r0)
        L_0x0232:
            r5 = r0
            com.google.android.gms.internal.firebase-auth-api.z3 r0 = r15.h(r8)
            r1 = r16
            r2 = r31
            r3 = r4
            r4 = r33
            r7 = r17
            r6 = r34
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.d(r0, r1, r2, r3, r4, r5, r6)
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
            int r0 = r0.H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
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
            r14.F(r15, r13, r10)
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
            int r0 = r0.G(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
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
            com.google.android.gms.internal.firebase-auth-api.l4 r4 = B(r30)
            r0 = r16
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.i1.h(r0, r1, r2, r3, r4, r5)
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
            com.google.android.gms.internal.firebase-auth-api.w2 r0 = com.google.android.gms.internal.p000firebaseauthapi.w2.e()
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
            r0.A(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.r3.e(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.h1):void");
    }

    public final s2 g(int i8) {
        int i10 = i8 / 3;
        return (s2) this.f4862b[i10 + i10 + 1];
    }

    public final z3 h(int i8) {
        int i10 = i8 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f4862b;
        z3 z3Var = (z3) objArr[i11];
        if (z3Var != null) {
            return z3Var;
        }
        z3 a10 = w3.f5030c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final void i(Object obj, int i8, Object obj2) {
        int i10 = this.f4861a[i8];
        Object j10 = u4.j(obj, (long) (J(i8) & 1048575));
        if (j10 != null && g(i8) != null) {
            j3 j3Var = (j3) j10;
            i3 i3Var = (i3) j(i8);
            throw null;
        }
    }

    public final Object j(int i8) {
        int i10 = i8 / 3;
        return this.f4862b[i10 + i10];
    }

    public final Object k(Object obj, int i8) {
        z3 h3 = h(i8);
        int J = J(i8) & 1048575;
        if (!w(i8, obj)) {
            return h3.zze();
        }
        Object object = f4860p.getObject(obj, (long) J);
        if (x(object)) {
            return object;
        }
        p2 zze = h3.zze();
        if (object != null) {
            h3.zzg(zze, object);
        }
        return zze;
    }

    public final Object l(Object obj, int i8, int i10) {
        z3 h3 = h(i10);
        if (!y(obj, i8, i10)) {
            return h3.zze();
        }
        Object object = f4860p.getObject(obj, (long) (J(i10) & 1048575));
        if (x(object)) {
            return object;
        }
        p2 zze = h3.zze();
        if (object != null) {
            h3.zzg(zze, object);
        }
        return zze;
    }

    public final void o(Object obj, Object obj2, int i8) {
        if (w(i8, obj2)) {
            long J = (long) (J(i8) & 1048575);
            Unsafe unsafe = f4860p;
            Object object = unsafe.getObject(obj2, J);
            if (object != null) {
                z3 h3 = h(i8);
                if (!w(i8, obj)) {
                    if (!x(object)) {
                        unsafe.putObject(obj, J, object);
                    } else {
                        p2 zze = h3.zze();
                        h3.zzg(zze, object);
                        unsafe.putObject(obj, J, zze);
                    }
                    r(obj, i8);
                    return;
                }
                Object object2 = unsafe.getObject(obj, J);
                if (!x(object2)) {
                    p2 zze2 = h3.zze();
                    h3.zzg(zze2, object2);
                    unsafe.putObject(obj, J, zze2);
                    object2 = zze2;
                }
                h3.zzg(object2, object);
                return;
            }
            int i10 = this.f4861a[i8];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i10 + " is present but null: " + obj3);
        }
    }

    public final void p(Object obj, Object obj2, int i8) {
        int[] iArr = this.f4861a;
        int i10 = iArr[i8];
        if (y(obj2, i10, i8)) {
            long J = (long) (J(i8) & 1048575);
            Unsafe unsafe = f4860p;
            Object object = unsafe.getObject(obj2, J);
            if (object != null) {
                z3 h3 = h(i8);
                if (!y(obj, i10, i8)) {
                    if (!x(object)) {
                        unsafe.putObject(obj, J, object);
                    } else {
                        p2 zze = h3.zze();
                        h3.zzg(zze, object);
                        unsafe.putObject(obj, J, zze);
                    }
                    s(obj, i10, i8);
                    return;
                }
                Object object2 = unsafe.getObject(obj, J);
                if (!x(object2)) {
                    p2 zze2 = h3.zze();
                    h3.zzg(zze2, object2);
                    unsafe.putObject(obj, J, zze2);
                    object2 = zze2;
                }
                h3.zzg(object2, object);
                return;
            }
            int i11 = iArr[i8];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i11 + " is present but null: " + obj3);
        }
    }

    public final void q(Object obj, int i8, u1 u1Var) {
        if ((536870912 & i8) != 0) {
            u1Var.q(2);
            u4.s(obj, (long) (i8 & 1048575), u1Var.f4970a.y());
        } else if (this.f4867g) {
            u1Var.q(2);
            u4.s(obj, (long) (i8 & 1048575), u1Var.f4970a.x());
        } else {
            u4.s(obj, (long) (i8 & 1048575), u1Var.u());
        }
    }

    public final void r(Object obj, int i8) {
        int i10 = this.f4861a[i8 + 2];
        long j10 = (long) (1048575 & i10);
        if (j10 != 1048575) {
            u4.q(obj, j10, (1 << (i10 >>> 20)) | u4.g(obj, j10));
        }
    }

    public final void s(Object obj, int i8, int i10) {
        u4.q(obj, (long) (this.f4861a[i10 + 2] & 1048575), i8);
    }

    public final void t(Object obj, int i8, Object obj2) {
        f4860p.putObject(obj, (long) (J(i8) & 1048575), obj2);
        r(obj, i8);
    }

    public final void u(Object obj, int i8, int i10, Object obj2) {
        f4860p.putObject(obj, (long) (J(i10) & 1048575), obj2);
        s(obj, i8, i10);
    }

    public final boolean v(int i8, Object obj, Object obj2) {
        return w(i8, obj) == w(i8, obj2);
    }

    public final boolean w(int i8, Object obj) {
        int i10 = this.f4861a[i8 + 2];
        long j10 = (long) (i10 & 1048575);
        if (j10 != 1048575) {
            return ((1 << (i10 >>> 20)) & u4.g(obj, j10)) != 0;
        }
        int J = J(i8);
        long j11 = (long) (J & 1048575);
        switch ((J >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(u4.e(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(u4.f(obj, j11)) != 0;
            case 2:
                return u4.h(obj, j11) != 0;
            case 3:
                return u4.h(obj, j11) != 0;
            case 4:
                return u4.g(obj, j11) != 0;
            case 5:
                return u4.h(obj, j11) != 0;
            case 6:
                return u4.g(obj, j11) != 0;
            case 7:
                return u4.w(obj, j11);
            case 8:
                Object j12 = u4.j(obj, j11);
                if (j12 instanceof String) {
                    return !((String) j12).isEmpty();
                }
                if (j12 instanceof q1) {
                    return !q1.f4830b.equals(j12);
                }
                throw new IllegalArgumentException();
            case 9:
                return u4.j(obj, j11) != null;
            case 10:
                return !q1.f4830b.equals(u4.j(obj, j11));
            case ModuleDescriptor.MODULE_VERSION:
                return u4.g(obj, j11) != 0;
            case 12:
                return u4.g(obj, j11) != 0;
            case 13:
                return u4.g(obj, j11) != 0;
            case 14:
                return u4.h(obj, j11) != 0;
            case 15:
                return u4.g(obj, j11) != 0;
            case 16:
                return u4.h(obj, j11) != 0;
            case 17:
                return u4.j(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean y(Object obj, int i8, int i10) {
        return u4.g(obj, (long) (this.f4861a[i10 + 2] & 1048575)) == i8;
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
            boolean r0 = r9.f4868h
            if (r0 == 0) goto L_0x0583
            r0 = 0
            r1 = r0
        L_0x0006:
            int[] r2 = r9.f4861a
            int r3 = r2.length
            if (r0 >= r3) goto L_0x0577
            int r3 = r9.J(r0)
            int r4 = r3 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r2[r0]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r6
            com.google.android.gms.internal.firebase-auth-api.j2 r6 = com.google.android.gms.internal.p000firebaseauthapi.j2.DOUBLE_LIST_PACKED
            int r6 = r6.zza()
            if (r4 < r6) goto L_0x002d
            com.google.android.gms.internal.firebase-auth-api.j2 r6 = com.google.android.gms.internal.p000firebaseauthapi.j2.SINT64_LIST_PACKED
            int r6 = r6.zza()
            if (r4 > r6) goto L_0x002d
            int r6 = r0 + 2
            r2 = r2[r6]
        L_0x002d:
            long r2 = (long) r3
            r6 = 63
            sun.misc.Unsafe r7 = f4860p
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
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            com.google.android.gms.internal.firebase-auth-api.o3 r2 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r2
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r9.h(r0)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.C(r5, r2, r3)
            goto L_0x0572
        L_0x004d:
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            long r2 = f(r10, r2)
            int r4 = r5 << 3
            long r7 = r2 + r2
            long r2 = r2 >> r6
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r4)
            long r2 = r2 ^ r7
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            goto L_0x04d9
        L_0x0067:
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            int r2 = E(r10, r2)
            int r3 = r5 << 3
            int r4 = r2 + r2
            int r2 = r2 >> 31
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            r2 = r2 ^ r4
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x043b
        L_0x0082:
            boolean r2 = r9.y(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0570
        L_0x0090:
            boolean r2 = r9.y(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0561
        L_0x009e:
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            int r2 = E(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.D(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0551
        L_0x00b4:
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            int r2 = E(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0551
        L_0x00ca:
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            com.google.android.gms.internal.firebase-auth-api.q1 r2 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r2
            int r3 = r5 << 3
            java.util.logging.Logger r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.f5090b
            int r2 = r2.c()
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r4 = r4 + r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x04d9
        L_0x00e9:
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r9.h(r0)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.I(r5, r3, r2)
            goto L_0x0572
        L_0x00fd:
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.p000firebaseauthapi.q1
            if (r3 == 0) goto L_0x0120
            com.google.android.gms.internal.firebase-auth-api.q1 r2 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r2
            int r3 = r5 << 3
            java.util.logging.Logger r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.f5090b
            int r2 = r2.c()
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r4 = r4 + r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x04d9
        L_0x0120:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.E(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0551
        L_0x012e:
            boolean r2 = r9.y(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x04f5
        L_0x013c:
            boolean r2 = r9.y(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0561
        L_0x014a:
            boolean r2 = r9.y(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0570
        L_0x0158:
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            int r2 = E(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.D(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0551
        L_0x016e:
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            long r2 = f(r10, r2)
            int r4 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r4)
            goto L_0x0551
        L_0x0184:
            boolean r4 = r9.y(r10, r5, r0)
            if (r4 == 0) goto L_0x0573
            long r2 = f(r10, r2)
            int r4 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r4)
            goto L_0x0551
        L_0x019a:
            boolean r2 = r9.y(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0561
        L_0x01a8:
            boolean r2 = r9.y(r10, r5, r0)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0570
        L_0x01b6:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.lang.Object r3 = r9.j(r0)
            com.google.android.gms.internal.p000firebaseauthapi.k3.a(r2, r3)
            goto L_0x0573
        L_0x01c3:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r9.h(r0)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.D(r5, r2, r3)
            goto L_0x0572
        L_0x01d3:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.N(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x01eb:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.L(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x0203:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.C(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x021b:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.A(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x0233:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.y(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x024b:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.Q(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x0263:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Class r3 = com.google.android.gms.internal.p000firebaseauthapi.a4.f4371a
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x027d:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.A(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x0295:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.C(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x02ad:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.F(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x02c4:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.S(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x02db:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.H(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x02f2:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.A(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x031f
        L_0x0309:
            java.lang.Object r2 = r7.getObject(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.C(r2)
            if (r2 <= 0) goto L_0x0573
            int r3 = r5 << 3
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
        L_0x031f:
            int r3 = r3 + r4
            goto L_0x0551
        L_0x0322:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.M(r5, r2)
            goto L_0x0572
        L_0x032e:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.K(r5, r2)
            goto L_0x0572
        L_0x033a:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.B(r5, r2)
            goto L_0x0572
        L_0x0346:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.z(r5, r2)
            goto L_0x0572
        L_0x0352:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.x(r5, r2)
            goto L_0x0572
        L_0x035e:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.P(r5, r2)
            goto L_0x0572
        L_0x036a:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.w(r5, r2)
            goto L_0x0572
        L_0x0376:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r9.h(r0)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.J(r5, r2, r3)
            goto L_0x0572
        L_0x0386:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.O(r5, r2)
            goto L_0x0572
        L_0x0392:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.v(r5, r2)
            goto L_0x0572
        L_0x039e:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.z(r5, r2)
            goto L_0x0572
        L_0x03aa:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.B(r5, r2)
            goto L_0x0572
        L_0x03b6:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.E(r5, r2)
            goto L_0x0572
        L_0x03c2:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.R(r5, r2)
            goto L_0x0572
        L_0x03ce:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.G(r5, r2)
            goto L_0x0572
        L_0x03da:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.z(r5, r2)
            goto L_0x0572
        L_0x03e6:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.B(r5, r2)
            goto L_0x0572
        L_0x03f2:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            com.google.android.gms.internal.firebase-auth-api.o3 r2 = (com.google.android.gms.internal.p000firebaseauthapi.o3) r2
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r9.h(r0)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.C(r5, r2, r3)
            goto L_0x0572
        L_0x0408:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            long r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r10, r2)
            int r4 = r5 << 3
            long r7 = r2 + r2
            long r2 = r2 >> r6
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r4)
            long r2 = r2 ^ r7
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            goto L_0x04d9
        L_0x0422:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r10, r2)
            int r3 = r5 << 3
            int r4 = r2 + r2
            int r2 = r2 >> 31
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            r2 = r2 ^ r4
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
        L_0x043b:
            int r2 = r2 + r3
            goto L_0x0572
        L_0x043e:
            boolean r2 = r9.w(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0570
        L_0x044c:
            boolean r2 = r9.w(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0561
        L_0x045a:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.D(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0551
        L_0x0470:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0551
        L_0x0486:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            com.google.android.gms.internal.firebase-auth-api.q1 r2 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r2
            int r3 = r5 << 3
            java.util.logging.Logger r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.f5090b
            int r2 = r2.c()
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r4 = r4 + r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x04d9
        L_0x04a4:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            com.google.android.gms.internal.firebase-auth-api.z3 r3 = r9.h(r0)
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.a4.I(r5, r3, r2)
            goto L_0x0572
        L_0x04b8:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r10, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.p000firebaseauthapi.q1
            if (r3 == 0) goto L_0x04dc
            com.google.android.gms.internal.firebase-auth-api.q1 r2 = (com.google.android.gms.internal.p000firebaseauthapi.q1) r2
            int r3 = r5 << 3
            java.util.logging.Logger r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.f5090b
            int r2 = r2.c()
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            int r4 = r4 + r2
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
        L_0x04d9:
            int r2 = r2 + r4
            goto L_0x0572
        L_0x04dc:
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.E(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0551
        L_0x04e9:
            boolean r2 = r9.w(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
        L_0x04f5:
            int r2 = r2 + 1
            goto L_0x0572
        L_0x04f9:
            boolean r2 = r9.w(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0561
        L_0x0506:
            boolean r2 = r9.w(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
            goto L_0x0570
        L_0x0513:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r10, r2)
            int r3 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.D(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r3)
            goto L_0x0551
        L_0x0528:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            long r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r10, r2)
            int r4 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r4)
            goto L_0x0551
        L_0x053d:
            boolean r4 = r9.w(r0, r10)
            if (r4 == 0) goto L_0x0573
            long r2 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r10, r2)
            int r4 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.k(r2)
            int r3 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r4)
        L_0x0551:
            int r3 = r3 + r2
            int r3 = r3 + r1
            r1 = r3
            goto L_0x0573
        L_0x0555:
            boolean r2 = r9.w(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
        L_0x0561:
            int r2 = r2 + 4
            goto L_0x0572
        L_0x0564:
            boolean r2 = r9.w(r0, r10)
            if (r2 == 0) goto L_0x0573
            int r2 = r5 << 3
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.y1.j(r2)
        L_0x0570:
            int r2 = r2 + 8
        L_0x0572:
            int r1 = r1 + r2
        L_0x0573:
            int r0 = r0 + 3
            goto L_0x0006
        L_0x0577:
            com.google.android.gms.internal.firebase-auth-api.k4 r0 = r9.m
            com.google.android.gms.internal.firebase-auth-api.l4 r10 = r0.d(r10)
            int r10 = r0.a(r10)
            int r10 = r10 + r1
            goto L_0x0587
        L_0x0583:
            int r10 = r9.D(r10)
        L_0x0587:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.r3.zza(java.lang.Object):int");
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
            int[] r0 = r10.f4861a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            if (r2 >= r1) goto L_0x0231
            int r4 = r10.J(r2)
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
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            int r3 = r3 * 53
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x0031:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            long r4 = f(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x0041:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = E(r11, r6)
            goto L_0x0217
        L_0x004f:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            long r4 = f(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x005f:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = E(r11, r6)
            goto L_0x0217
        L_0x006d:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = E(r11, r6)
            goto L_0x0217
        L_0x007b:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = E(r11, r6)
            goto L_0x0217
        L_0x0089:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x009b:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            int r3 = r3 * 53
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x00ad:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x00c1:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.nio.charset.Charset r5 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            if (r4 == 0) goto L_0x01e1
            goto L_0x01e2
        L_0x00d9:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = E(r11, r6)
            goto L_0x0217
        L_0x00e7:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            long r4 = f(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x00f7:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            int r4 = E(r11, r6)
            goto L_0x0217
        L_0x0105:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            long r4 = f(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x0115:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            long r4 = f(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x0125:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x0217
        L_0x013d:
            boolean r4 = r10.y(r11, r5, r2)
            if (r4 == 0) goto L_0x022d
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            long r4 = java.lang.Double.doubleToLongBits(r4)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x0157:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x0163:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x016f:
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            if (r4 == 0) goto L_0x01c4
            int r4 = r4.hashCode()
            goto L_0x01c6
        L_0x017a:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x0184:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r11, r6)
            goto L_0x0217
        L_0x018c:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x0196:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r11, r6)
            goto L_0x0217
        L_0x019e:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r11, r6)
            goto L_0x0217
        L_0x01a6:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r11, r6)
            goto L_0x0217
        L_0x01ae:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x01b9:
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
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
            java.lang.Object r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r11, r6)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x0217
        L_0x01d6:
            int r3 = r3 * 53
            boolean r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.w(r11, r6)
            java.nio.charset.Charset r5 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            if (r4 == 0) goto L_0x01e1
            goto L_0x01e2
        L_0x01e1:
            r8 = r9
        L_0x01e2:
            r4 = r8
            goto L_0x0217
        L_0x01e4:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r11, r6)
            goto L_0x0217
        L_0x01eb:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x01f4:
            int r3 = r3 * 53
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.g(r11, r6)
            goto L_0x0217
        L_0x01fb:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x0204:
            int r3 = r3 * 53
            long r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.h(r11, r6)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
            goto L_0x0226
        L_0x020d:
            int r3 = r3 * 53
            float r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.f(r11, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
        L_0x0217:
            int r4 = r4 + r3
            r3 = r4
            goto L_0x022d
        L_0x021a:
            int r3 = r3 * 53
            double r4 = com.google.android.gms.internal.p000firebaseauthapi.u4.e(r11, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p000firebaseauthapi.u2.f4974a
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
            com.google.android.gms.internal.firebase-auth-api.k4 r0 = r10.m
            com.google.android.gms.internal.firebase-auth-api.l4 r0 = r0.d(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r3
            boolean r1 = r10.f4866f
            if (r1 != 0) goto L_0x0243
            return r0
        L_0x0243:
            com.google.android.gms.internal.firebase-auth-api.d2 r0 = r10.f4873n
            r0.a(r11)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.r3.zzb(java.lang.Object):int");
    }

    public final p2 zze() {
        return ((p2) this.f4865e).q();
    }

    public final void zzf(Object obj) {
        if (x(obj)) {
            if (obj instanceof p2) {
                p2 p2Var = (p2) obj;
                p2Var.h();
                p2Var.zza = 0;
                p2Var.e();
            }
            int[] iArr = this.f4861a;
            int length = iArr.length;
            for (int i8 = 0; i8 < length; i8 += 3) {
                int J = J(i8);
                int i10 = 1048575 & J;
                int i11 = (J >>> 20) & 255;
                long j10 = (long) i10;
                Unsafe unsafe = f4860p;
                if (i11 != 9) {
                    if (i11 == 60 || i11 == 68) {
                        if (y(obj, iArr[i8], i8)) {
                            h(i8).zzf(unsafe.getObject(obj, j10));
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
                                this.f4872l.b(obj, j10);
                                continue;
                            case 50:
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((j3) object).g();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (w(i8, obj)) {
                    h(i8).zzf(unsafe.getObject(obj, j10));
                }
            }
            this.m.m(obj);
            if (this.f4866f) {
                this.f4873n.e(obj);
            }
        }
    }

    public final void zzg(Object obj, Object obj2) {
        n(obj);
        obj2.getClass();
        int i8 = 0;
        while (true) {
            int[] iArr = this.f4861a;
            if (i8 < iArr.length) {
                int J = J(i8);
                int i10 = iArr[i8];
                long j10 = (long) (1048575 & J);
                switch ((J >>> 20) & 255) {
                    case 0:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.o(obj, j10, u4.e(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 1:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.p(obj, j10, u4.f(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 2:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.r(obj, j10, u4.h(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 3:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.r(obj, j10, u4.h(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 4:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.q(obj, j10, u4.g(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 5:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.r(obj, j10, u4.h(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 6:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.q(obj, j10, u4.g(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 7:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.m(obj, j10, u4.w(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 8:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.s(obj, j10, u4.j(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 9:
                        o(obj, obj2, i8);
                        break;
                    case 10:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.s(obj, j10, u4.j(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.q(obj, j10, u4.g(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 12:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.q(obj, j10, u4.g(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 13:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.q(obj, j10, u4.g(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 14:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.r(obj, j10, u4.h(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 15:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.q(obj, j10, u4.g(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 16:
                        if (!w(i8, obj2)) {
                            break;
                        } else {
                            u4.r(obj, j10, u4.h(obj2, j10));
                            r(obj, i8);
                            break;
                        }
                    case 17:
                        o(obj, obj2, i8);
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
                        this.f4872l.c(obj, obj2, j10);
                        break;
                    case 50:
                        Class cls = a4.f4371a;
                        u4.s(obj, j10, k3.c(u4.j(obj, j10), u4.j(obj2, j10)));
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
                        if (!y(obj2, i10, i8)) {
                            break;
                        } else {
                            u4.s(obj, j10, u4.j(obj2, j10));
                            s(obj, i10, i8);
                            break;
                        }
                    case 60:
                        p(obj, obj2, i8);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!y(obj2, i10, i8)) {
                            break;
                        } else {
                            u4.s(obj, j10, u4.j(obj2, j10));
                            s(obj, i10, i8);
                            break;
                        }
                    case 68:
                        p(obj, obj2, i8);
                        break;
                }
                i8 += 3;
            } else {
                Class cls2 = a4.f4371a;
                k4 k4Var = this.m;
                k4Var.o(obj, k4Var.e(k4Var.d(obj), k4Var.d(obj2)));
                if (this.f4866f) {
                    this.f4873n.a(obj2);
                    throw null;
                }
                return;
            }
        }
    }
}
