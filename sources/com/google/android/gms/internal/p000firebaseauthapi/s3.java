package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s3  reason: invalid package */
public final class s3 implements z3 {

    /* renamed from: a  reason: collision with root package name */
    public final o3 f4897a;

    /* renamed from: b  reason: collision with root package name */
    public final k4 f4898b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4899c;

    /* renamed from: d  reason: collision with root package name */
    public final d2 f4900d;

    public s3(k4 k4Var, d2 d2Var, o3 o3Var) {
        this.f4898b = k4Var;
        this.f4899c = d2Var.h(o3Var);
        this.f4900d = d2Var;
        this.f4897a = o3Var;
    }

    public final boolean a(Object obj) {
        this.f4900d.a(obj);
        throw null;
    }

    public final boolean b(Object obj, Object obj2) {
        k4 k4Var = this.f4898b;
        if (!k4Var.d(obj).equals(k4Var.d(obj2))) {
            return false;
        }
        if (!this.f4899c) {
            return true;
        }
        d2 d2Var = this.f4900d;
        d2Var.a(obj);
        d2Var.a(obj2);
        throw null;
    }

    public final void c(Object obj, z1 z1Var) {
        this.f4900d.a(obj);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x008d A[EDGE_INSN: B:69:0x008d->B:46:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0050 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.Object r13, com.google.android.gms.internal.p000firebaseauthapi.u1 r14, com.google.android.gms.internal.p000firebaseauthapi.c2 r15) {
        /*
            r12 = this;
            com.google.android.gms.internal.firebase-auth-api.k4 r0 = r12.f4898b
            com.google.android.gms.internal.firebase-auth-api.l4 r1 = r0.c(r13)
            com.google.android.gms.internal.firebase-auth-api.d2 r2 = r12.f4900d
            r2.b(r13)
        L_0x000b:
            int r3 = r14.t()     // Catch:{ all -> 0x00ad }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x00a9
            int r3 = r14.f4971b     // Catch:{ all -> 0x00ad }
            r5 = 0
            com.google.android.gms.internal.firebase-auth-api.t1 r6 = r14.f4970a
            r7 = 11
            com.google.android.gms.internal.firebase-auth-api.o3 r8 = r12.f4897a
            if (r3 == r7) goto L_0x004d
            r4 = r3 & 7
            r7 = 2
            if (r4 != r7) goto L_0x0035
            int r3 = r3 >>> 3
            com.google.android.gms.internal.firebase-auth-api.o2 r3 = r2.c(r15, r8, r3)     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x0030
            r2.f()     // Catch:{ all -> 0x00ad }
            goto L_0x000b
        L_0x0030:
            boolean r3 = r0.p(r1, r14)     // Catch:{ all -> 0x00ad }
            goto L_0x0047
        L_0x0035:
            boolean r3 = r6.b()     // Catch:{ all -> 0x00ad }
            if (r3 != 0) goto L_0x0046
            int r3 = r14.f4971b     // Catch:{ all -> 0x00ad }
            int r4 = r14.f4972c     // Catch:{ all -> 0x00ad }
            if (r3 != r4) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            boolean r5 = r6.d(r3)     // Catch:{ all -> 0x00ad }
        L_0x0046:
            r3 = r5
        L_0x0047:
            if (r3 != 0) goto L_0x000b
            r0.n(r13, r1)
            return
        L_0x004d:
            r3 = 0
            r7 = r3
            r9 = r5
        L_0x0050:
            int r10 = r14.t()     // Catch:{ all -> 0x00ad }
            if (r10 != r4) goto L_0x0057
            goto L_0x008d
        L_0x0057:
            int r10 = r14.f4971b     // Catch:{ all -> 0x00ad }
            r11 = 16
            if (r10 != r11) goto L_0x0069
            r14.q(r5)     // Catch:{ all -> 0x00ad }
            int r9 = r6.q()     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.firebase-auth-api.o2 r3 = r2.c(r15, r8, r9)     // Catch:{ all -> 0x00ad }
            goto L_0x0050
        L_0x0069:
            r11 = 26
            if (r10 != r11) goto L_0x0078
            if (r3 == 0) goto L_0x0073
            r2.f()     // Catch:{ all -> 0x00ad }
            goto L_0x0050
        L_0x0073:
            com.google.android.gms.internal.firebase-auth-api.q1 r7 = r14.u()     // Catch:{ all -> 0x00ad }
            goto L_0x0050
        L_0x0078:
            boolean r10 = r6.b()     // Catch:{ all -> 0x00ad }
            if (r10 != 0) goto L_0x008a
            int r10 = r14.f4971b     // Catch:{ all -> 0x00ad }
            int r11 = r14.f4972c     // Catch:{ all -> 0x00ad }
            if (r10 != r11) goto L_0x0085
            goto L_0x008a
        L_0x0085:
            boolean r10 = r6.d(r10)     // Catch:{ all -> 0x00ad }
            goto L_0x008b
        L_0x008a:
            r10 = r5
        L_0x008b:
            if (r10 != 0) goto L_0x0050
        L_0x008d:
            int r4 = r14.f4971b     // Catch:{ all -> 0x00ad }
            r5 = 12
            if (r4 != r5) goto L_0x00a1
            if (r7 == 0) goto L_0x000b
            if (r3 == 0) goto L_0x009c
            r2.g()     // Catch:{ all -> 0x00ad }
            goto L_0x000b
        L_0x009c:
            r0.k(r1, r9, r7)     // Catch:{ all -> 0x00ad }
            goto L_0x000b
        L_0x00a1:
            com.google.android.gms.internal.firebase-auth-api.w2 r14 = new com.google.android.gms.internal.firebase-auth-api.w2     // Catch:{ all -> 0x00ad }
            java.lang.String r15 = "Protocol message end-group tag did not match expected tag."
            r14.<init>((java.lang.String) r15)     // Catch:{ all -> 0x00ad }
            throw r14     // Catch:{ all -> 0x00ad }
        L_0x00a9:
            r0.n(r13, r1)
            return
        L_0x00ad:
            r14 = move-exception
            r0.n(r13, r1)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.s3.d(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.u1, com.google.android.gms.internal.firebase-auth-api.c2):void");
    }

    public final void e(Object obj, byte[] bArr, int i8, int i10, h1 h1Var) {
        p2 p2Var = (p2) obj;
        if (p2Var.zzc == l4.f4703f) {
            p2Var.zzc = l4.b();
        }
        n2 n2Var = (n2) obj;
        throw null;
    }

    public final int zza(Object obj) {
        k4 k4Var = this.f4898b;
        int b10 = k4Var.b(k4Var.d(obj));
        if (!this.f4899c) {
            return b10;
        }
        this.f4900d.a(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.f4898b.d(obj).hashCode();
        if (!this.f4899c) {
            return hashCode;
        }
        this.f4900d.a(obj);
        throw null;
    }

    public final p2 zze() {
        o3 o3Var = this.f4897a;
        return o3Var instanceof p2 ? ((p2) o3Var).q() : o3Var.b().i();
    }

    public final void zzf(Object obj) {
        this.f4898b.m(obj);
        this.f4900d.e(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        Class cls = a4.f4371a;
        k4 k4Var = this.f4898b;
        k4Var.o(obj, k4Var.e(k4Var.d(obj), k4Var.d(obj2)));
        if (this.f4899c) {
            this.f4900d.a(obj2);
            throw null;
        }
    }
}
