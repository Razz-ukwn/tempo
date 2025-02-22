package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;

public final class j0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final e f4284a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4285b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4286c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4287d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4288e;

    public j0(e eVar, int i8, a aVar, long j10, long j11) {
        this.f4284a = eVar;
        this.f4285b = i8;
        this.f4286c = aVar;
        this.f4287d = j10;
        this.f4288e = j11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r2 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0037, code lost:
        if (r2 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static u6.e a(com.google.android.gms.common.api.internal.b0 r6, u6.b r7, int r8) {
        /*
            u6.a1 r7 = r7.f15763v
            r0 = 0
            if (r7 != 0) goto L_0x0007
            r7 = r0
            goto L_0x0009
        L_0x0007:
            u6.e r7 = r7.f15741d
        L_0x0009:
            if (r7 == 0) goto L_0x0041
            boolean r1 = r7.f15783b
            if (r1 == 0) goto L_0x0041
            int[] r1 = r7.f15785d
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x002a
            int[] r1 = r7.B
            if (r1 != 0) goto L_0x001a
            goto L_0x003a
        L_0x001a:
            r4 = r2
        L_0x001b:
            int r5 = r1.length
            if (r4 >= r5) goto L_0x0027
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0024
            r2 = r3
            goto L_0x0027
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x0027:
            if (r2 == 0) goto L_0x003a
            goto L_0x0041
        L_0x002a:
            r4 = r2
        L_0x002b:
            int r5 = r1.length
            if (r4 >= r5) goto L_0x0037
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0034
            r2 = r3
            goto L_0x0037
        L_0x0034:
            int r4 = r4 + 1
            goto L_0x002b
        L_0x0037:
            if (r2 != 0) goto L_0x003a
            goto L_0x0041
        L_0x003a:
            int r6 = r6.m
            int r8 = r7.f15786e
            if (r6 >= r8) goto L_0x0041
            return r7
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.j0.a(com.google.android.gms.common.api.internal.b0, u6.b, int):u6.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(com.google.android.gms.tasks.Task r26) {
        /*
            r25 = this;
            r0 = r25
            com.google.android.gms.common.api.internal.e r1 = r0.f4284a
            boolean r2 = r1.a()
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            u6.r r2 = u6.r.a()
            u6.s r2 = r2.f15854a
            if (r2 == 0) goto L_0x0019
            boolean r3 = r2.f15856b
            if (r3 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            com.google.android.gms.common.api.internal.a r3 = r0.f4286c
            java.util.concurrent.ConcurrentHashMap r4 = r1.f4249j
            java.lang.Object r3 = r4.get(r3)
            com.google.android.gms.common.api.internal.b0 r3 = (com.google.android.gms.common.api.internal.b0) r3
            if (r3 == 0) goto L_0x00eb
            com.google.android.gms.common.api.a$e r4 = r3.f4218b
            boolean r5 = r4 instanceof u6.b
            if (r5 != 0) goto L_0x002d
            goto L_0x00eb
        L_0x002d:
            u6.b r4 = (u6.b) r4
            long r5 = r0.f4287d
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r10 = 0
            r11 = 1
            if (r9 <= 0) goto L_0x003b
            r12 = r11
            goto L_0x003c
        L_0x003b:
            r12 = r10
        L_0x003c:
            int r15 = r4.f15758q
            r13 = 100
            if (r2 == 0) goto L_0x006f
            boolean r14 = r2.f15857c
            r12 = r12 & r14
            u6.a1 r14 = r4.f15763v
            if (r14 == 0) goto L_0x004b
            r14 = r11
            goto L_0x004c
        L_0x004b:
            r14 = r10
        L_0x004c:
            int r7 = r2.f15858d
            int r8 = r2.f15855a
            if (r14 == 0) goto L_0x006c
            boolean r14 = r4.e()
            if (r14 != 0) goto L_0x006c
            int r2 = r0.f4285b
            u6.e r2 = a(r3, r4, r2)
            if (r2 != 0) goto L_0x0061
            return
        L_0x0061:
            boolean r3 = r2.f15784c
            if (r3 == 0) goto L_0x0068
            if (r9 <= 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r11 = r10
        L_0x0069:
            int r2 = r2.f15786e
            goto L_0x0074
        L_0x006c:
            int r2 = r2.f15859e
            goto L_0x0073
        L_0x006f:
            r7 = 5000(0x1388, float:7.006E-42)
            r8 = r10
            r2 = r13
        L_0x0073:
            r11 = r12
        L_0x0074:
            boolean r3 = r26.isSuccessful()
            r4 = -1
            if (r3 == 0) goto L_0x007d
            r3 = r10
            goto L_0x00a1
        L_0x007d:
            boolean r3 = r26.isCanceled()
            if (r3 == 0) goto L_0x0085
            r10 = r13
            goto L_0x00a0
        L_0x0085:
            java.lang.Exception r3 = r26.getException()
            boolean r9 = r3 instanceof com.google.android.gms.common.api.b
            if (r9 == 0) goto L_0x009d
            com.google.android.gms.common.api.b r3 = (com.google.android.gms.common.api.b) r3
            com.google.android.gms.common.api.Status r3 = r3.getStatus()
            int r10 = r3.f4176b
            t6.b r3 = r3.f4179e
            if (r3 != 0) goto L_0x009a
            goto L_0x00a0
        L_0x009a:
            int r3 = r3.f15379b
            goto L_0x00a1
        L_0x009d:
            r3 = 101(0x65, float:1.42E-43)
            r10 = r3
        L_0x00a0:
            r3 = r4
        L_0x00a1:
            if (r11 == 0) goto L_0x00b8
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = android.os.SystemClock.elapsedRealtime()
            r18 = r5
            long r4 = r0.f4288e
            long r13 = r13 - r4
            int r4 = (int) r13
            r24 = r4
            r17 = r18
            r19 = r11
            goto L_0x00be
        L_0x00b8:
            r24 = r4
            r17 = 0
            r19 = 0
        L_0x00be:
            u6.n r4 = new u6.n
            int r14 = r0.f4285b
            r21 = 0
            r22 = 0
            r13 = r4
            r5 = r15
            r15 = r10
            r16 = r3
            r23 = r5
            r13.<init>(r14, r15, r16, r17, r19, r21, r22, r23, r24)
            long r5 = (long) r7
            h7.i r1 = r1.m
            com.google.android.gms.common.api.internal.k0 r3 = new com.google.android.gms.common.api.internal.k0
            r18 = r3
            r19 = r4
            r20 = r8
            r21 = r5
            r23 = r2
            r18.<init>(r19, r20, r21, r23)
            r2 = 18
            android.os.Message r2 = r1.obtainMessage(r2, r3)
            r1.sendMessage(r2)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.j0.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
