package com.google.android.gms.internal.p000firebaseauthapi;

import e.s;
import java.security.interfaces.ECPrivateKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yg  reason: invalid package */
public final class yg implements k5 {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f5104g = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final ECPrivateKey f5105a;

    /* renamed from: b  reason: collision with root package name */
    public final s f5106b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5107c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5108d;

    /* renamed from: e  reason: collision with root package name */
    public final xg f5109e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5110f;

    public yg(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i8, n9 n9Var) {
        this.f5105a = eCPrivateKey;
        this.f5106b = new s((Object) eCPrivateKey);
        this.f5108d = bArr;
        this.f5107c = str;
        this.f5110f = i8;
        this.f5109e = n9Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zza(byte[] r13) {
        /*
            r12 = this;
            java.security.interfaces.ECPrivateKey r0 = r12.f5105a
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.zg.a(r0)
            int r1 = r12.f5110f
            int r2 = r1 + -1
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x001b
            if (r2 == r3) goto L_0x0019
            goto L_0x001c
        L_0x0019:
            int r0 = r0 + r0
            goto L_0x001d
        L_0x001b:
            int r0 = r0 + r0
        L_0x001c:
            int r0 = r0 + r4
        L_0x001d:
            int r2 = r13.length
            if (r2 < r0) goto L_0x01d8
            r5 = 0
            byte[] r6 = java.util.Arrays.copyOfRange(r13, r5, r0)
            com.google.android.gms.internal.firebase-auth-api.xg r7 = r12.f5109e
            com.google.android.gms.internal.firebase-auth-api.n9 r7 = (com.google.android.gms.internal.p000firebaseauthapi.n9) r7
            int r8 = r7.f4759b
            e.s r9 = r12.f5106b
            java.lang.Object r9 = r9.f7705a
            java.security.interfaces.ECPrivateKey r9 = (java.security.interfaces.ECPrivateKey) r9
            java.security.spec.ECParameterSpec r10 = r9.getParams()
            java.security.interfaces.ECPublicKey r1 = com.google.android.gms.internal.p000firebaseauthapi.zg.f(r10, r1, r6)
            byte[] r1 = com.google.android.gms.internal.p000firebaseauthapi.zg.d(r9, r1)
            byte[][] r3 = new byte[r3][]
            r3[r5] = r6
            r3[r4] = r1
            byte[] r1 = androidx.fragment.app.z0.l(r3)
            com.google.android.gms.internal.firebase-auth-api.ch r3 = com.google.android.gms.internal.p000firebaseauthapi.ch.f4471c
            java.lang.String r6 = r12.f5107c
            java.lang.Object r3 = r3.a(r6)
            javax.crypto.Mac r3 = (javax.crypto.Mac) r3
            int r9 = r3.getMacLength()
            int r9 = r9 * 255
            if (r8 > r9) goto L_0x01d0
            byte[] r9 = r12.f5108d
            if (r9 == 0) goto L_0x006a
            int r10 = r9.length
            if (r10 != 0) goto L_0x0061
            goto L_0x006a
        L_0x0061:
            javax.crypto.spec.SecretKeySpec r10 = new javax.crypto.spec.SecretKeySpec
            r10.<init>(r9, r6)
            r3.init(r10)
            goto L_0x0078
        L_0x006a:
            javax.crypto.spec.SecretKeySpec r9 = new javax.crypto.spec.SecretKeySpec
            int r10 = r3.getMacLength()
            byte[] r10 = new byte[r10]
            r9.<init>(r10, r6)
            r3.init(r9)
        L_0x0078:
            byte[] r1 = r3.doFinal(r1)
            byte[] r9 = new byte[r8]
            javax.crypto.spec.SecretKeySpec r10 = new javax.crypto.spec.SecretKeySpec
            r10.<init>(r1, r6)
            r3.init(r10)
            byte[] r1 = new byte[r5]
            r6 = r5
        L_0x0089:
            r3.update(r1)
            r1 = 0
            r3.update(r1)
            byte r1 = (byte) r4
            r3.update(r1)
            byte[] r1 = r3.doFinal()
            int r10 = r1.length
            int r11 = r6 + r10
            if (r11 >= r8) goto L_0x00a4
            java.lang.System.arraycopy(r1, r5, r9, r6, r10)
            int r4 = r4 + 1
            r6 = r11
            goto L_0x0089
        L_0x00a4:
            int r3 = r8 - r6
            java.lang.System.arraycopy(r1, r5, r9, r6, r3)
            r7.getClass()
            int r1 = r7.f4759b
            if (r8 != r1) goto L_0x01c8
            java.lang.String r3 = com.google.android.gms.internal.p000firebaseauthapi.k6.f4682b
            java.lang.String r4 = r7.f4758a
            boolean r3 = r4.equals(r3)
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.i5> r6 = com.google.android.gms.internal.p000firebaseauthapi.i5.class
            if (r3 == 0) goto L_0x00e6
            com.google.android.gms.internal.firebase-auth-api.vd r3 = com.google.android.gms.internal.p000firebaseauthapi.wd.u()
            com.google.android.gms.internal.firebase-auth-api.wd r7 = r7.f4760c
            r3.g(r7)
            com.google.android.gms.internal.firebase-auth-api.p1 r1 = com.google.android.gms.internal.p000firebaseauthapi.q1.l(r9, r5, r1)
            r3.j()
            com.google.android.gms.internal.firebase-auth-api.p2 r5 = r3.f4729b
            com.google.android.gms.internal.firebase-auth-api.wd r5 = (com.google.android.gms.internal.p000firebaseauthapi.wd) r5
            r5.zze = r1
            com.google.android.gms.internal.firebase-auth-api.p2 r1 = r3.h()
            com.google.android.gms.internal.firebase-auth-api.wd r1 = (com.google.android.gms.internal.p000firebaseauthapi.wd) r1
            androidx.compose.ui.platform.j3 r3 = new androidx.compose.ui.platform.j3
            java.lang.Object r1 = com.google.android.gms.internal.p000firebaseauthapi.i6.d(r4, r1, r6)
            com.google.android.gms.internal.firebase-auth-api.i5 r1 = (com.google.android.gms.internal.p000firebaseauthapi.i5) r1
            r3.<init>((com.google.android.gms.internal.p000firebaseauthapi.i5) r1)
            goto L_0x01a6
        L_0x00e6:
            java.lang.String r3 = com.google.android.gms.internal.p000firebaseauthapi.k6.f4681a
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0174
            int r3 = r7.f4762e
            byte[] r8 = java.util.Arrays.copyOfRange(r9, r5, r3)
            byte[] r1 = java.util.Arrays.copyOfRange(r9, r3, r1)
            com.google.android.gms.internal.firebase-auth-api.jd r3 = com.google.android.gms.internal.p000firebaseauthapi.kd.u()
            com.google.android.gms.internal.firebase-auth-api.gd r7 = r7.f4761d
            com.google.android.gms.internal.firebase-auth-api.kd r9 = r7.x()
            r3.g(r9)
            com.google.android.gms.internal.firebase-auth-api.p1 r9 = com.google.android.gms.internal.p000firebaseauthapi.q1.f4830b
            int r9 = r8.length
            com.google.android.gms.internal.firebase-auth-api.p1 r8 = com.google.android.gms.internal.p000firebaseauthapi.q1.l(r8, r5, r9)
            r3.j()
            com.google.android.gms.internal.firebase-auth-api.p2 r9 = r3.f4729b
            com.google.android.gms.internal.firebase-auth-api.kd r9 = (com.google.android.gms.internal.p000firebaseauthapi.kd) r9
            r9.zzf = r8
            com.google.android.gms.internal.firebase-auth-api.p2 r3 = r3.h()
            com.google.android.gms.internal.firebase-auth-api.kd r3 = (com.google.android.gms.internal.p000firebaseauthapi.kd) r3
            com.google.android.gms.internal.firebase-auth-api.af r8 = com.google.android.gms.internal.p000firebaseauthapi.bf.u()
            com.google.android.gms.internal.firebase-auth-api.bf r9 = r7.y()
            r8.g(r9)
            int r9 = r1.length
            com.google.android.gms.internal.firebase-auth-api.p1 r1 = com.google.android.gms.internal.p000firebaseauthapi.q1.l(r1, r5, r9)
            r8.j()
            com.google.android.gms.internal.firebase-auth-api.p2 r5 = r8.f4729b
            com.google.android.gms.internal.firebase-auth-api.bf r5 = (com.google.android.gms.internal.p000firebaseauthapi.bf) r5
            r5.zzf = r1
            com.google.android.gms.internal.firebase-auth-api.p2 r1 = r8.h()
            com.google.android.gms.internal.firebase-auth-api.bf r1 = (com.google.android.gms.internal.p000firebaseauthapi.bf) r1
            com.google.android.gms.internal.firebase-auth-api.fd r5 = com.google.android.gms.internal.p000firebaseauthapi.gd.u()
            int r7 = r7.t()
            r5.j()
            com.google.android.gms.internal.firebase-auth-api.p2 r8 = r5.f4729b
            com.google.android.gms.internal.firebase-auth-api.gd r8 = (com.google.android.gms.internal.p000firebaseauthapi.gd) r8
            r8.zzd = r7
            r5.j()
            com.google.android.gms.internal.firebase-auth-api.p2 r7 = r5.f4729b
            com.google.android.gms.internal.firebase-auth-api.gd r7 = (com.google.android.gms.internal.p000firebaseauthapi.gd) r7
            r7.zze = r3
            r5.j()
            com.google.android.gms.internal.firebase-auth-api.p2 r3 = r5.f4729b
            com.google.android.gms.internal.firebase-auth-api.gd r3 = (com.google.android.gms.internal.p000firebaseauthapi.gd) r3
            com.google.android.gms.internal.p000firebaseauthapi.gd.B(r3, r1)
            com.google.android.gms.internal.firebase-auth-api.p2 r1 = r5.h()
            com.google.android.gms.internal.firebase-auth-api.gd r1 = (com.google.android.gms.internal.p000firebaseauthapi.gd) r1
            androidx.compose.ui.platform.j3 r3 = new androidx.compose.ui.platform.j3
            java.lang.Object r1 = com.google.android.gms.internal.p000firebaseauthapi.i6.d(r4, r1, r6)
            com.google.android.gms.internal.firebase-auth-api.i5 r1 = (com.google.android.gms.internal.p000firebaseauthapi.i5) r1
            r3.<init>((com.google.android.gms.internal.p000firebaseauthapi.i5) r1)
            goto L_0x01a6
        L_0x0174:
            java.lang.String r3 = com.google.android.gms.internal.p000firebaseauthapi.d9.f4487a
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x01c0
            com.google.android.gms.internal.firebase-auth-api.ee r3 = com.google.android.gms.internal.p000firebaseauthapi.fe.u()
            com.google.android.gms.internal.firebase-auth-api.fe r6 = r7.f4763f
            r3.g(r6)
            com.google.android.gms.internal.firebase-auth-api.p1 r1 = com.google.android.gms.internal.p000firebaseauthapi.q1.l(r9, r5, r1)
            r3.j()
            com.google.android.gms.internal.firebase-auth-api.p2 r5 = r3.f4729b
            com.google.android.gms.internal.firebase-auth-api.fe r5 = (com.google.android.gms.internal.p000firebaseauthapi.fe) r5
            r5.zze = r1
            com.google.android.gms.internal.firebase-auth-api.p2 r1 = r3.h()
            com.google.android.gms.internal.firebase-auth-api.fe r1 = (com.google.android.gms.internal.p000firebaseauthapi.fe) r1
            androidx.compose.ui.platform.j3 r3 = new androidx.compose.ui.platform.j3
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.j5> r5 = com.google.android.gms.internal.p000firebaseauthapi.j5.class
            java.lang.Object r1 = com.google.android.gms.internal.p000firebaseauthapi.i6.d(r4, r1, r5)
            com.google.android.gms.internal.firebase-auth-api.j5 r1 = (com.google.android.gms.internal.p000firebaseauthapi.j5) r1
            r3.<init>((com.google.android.gms.internal.p000firebaseauthapi.j5) r1)
        L_0x01a6:
            byte[] r13 = java.util.Arrays.copyOfRange(r13, r0, r2)
            byte[] r0 = f5104g
            java.lang.Object r1 = r3.f1338a
            com.google.android.gms.internal.firebase-auth-api.i5 r1 = (com.google.android.gms.internal.p000firebaseauthapi.i5) r1
            if (r1 == 0) goto L_0x01b7
            byte[] r13 = r1.a(r13, r0)
            goto L_0x01bf
        L_0x01b7:
            java.lang.Object r1 = r3.f1339b
            com.google.android.gms.internal.firebase-auth-api.j5 r1 = (com.google.android.gms.internal.p000firebaseauthapi.j5) r1
            byte[] r13 = r1.a(r13, r0)
        L_0x01bf:
            return r13
        L_0x01c0:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown DEM key type"
            r13.<init>(r0)
            throw r13
        L_0x01c8:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Symmetric key has incorrect length"
            r13.<init>(r0)
            throw r13
        L_0x01d0:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r0 = "size too large"
            r13.<init>(r0)
            throw r13
        L_0x01d8:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.yg.zza(byte[]):byte[]");
    }
}
