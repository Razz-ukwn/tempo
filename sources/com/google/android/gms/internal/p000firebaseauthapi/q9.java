package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q9  reason: invalid package */
public final class q9 {

    /* renamed from: a  reason: collision with root package name */
    public String f4842a;

    public /* synthetic */ q9() {
    }

    public /* synthetic */ q9(String str) {
        this.f4842a = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f4842a
            int r1 = r0.hashCode()
            r2 = 984523022(0x3aaea10e, float:0.0013323145)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 984524074(0x3aaea52a, float:0.0013324369)
            if (r1 == r2) goto L_0x0022
            r2 = 984525777(0x3aaeabd1, float:0.0013326352)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = r3
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = r4
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x004b
            if (r0 == r4) goto L_0x0048
            if (r0 != r3) goto L_0x0040
            byte[] r0 = com.google.android.gms.internal.p000firebaseauthapi.aa.f4393h
            return r0
        L_0x0040:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            byte[] r0 = com.google.android.gms.internal.p000firebaseauthapi.aa.f4392g
            return r0
        L_0x004b:
            byte[] r0 = com.google.android.gms.internal.p000firebaseauthapi.aa.f4391f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.q9.a():byte[]");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2, int i8) {
        Mac mac = (Mac) ch.f4471c.a(this.f4842a);
        if (i8 <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i8];
            mac.init(new SecretKeySpec(bArr, this.f4842a));
            byte[] bArr4 = new byte[0];
            int i10 = 1;
            int i11 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i10);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i12 = i11 + length;
                if (i12 < i8) {
                    System.arraycopy(bArr4, 0, bArr3, i11, length);
                    i10++;
                    i11 = i12;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i11, i8 - i11);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) ch.f4471c.a(this.f4842a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f4842a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.f4842a));
        }
        return mac.doFinal(bArr);
    }
}
