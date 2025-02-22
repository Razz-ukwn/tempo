package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s8  reason: invalid package */
public final class s8 extends p8 {
    public s8(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    public final int a() {
        return 24;
    }

    public final int[] b(int[] iArr, int i8) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            int[] iArr4 = l8.f4709a;
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            System.arraycopy(this.f4813a, 0, iArr3, iArr4.length, 8);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            l8.b(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            int[] copyOf = Arrays.copyOf(iArr3, 8);
            System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
            System.arraycopy(copyOf, 0, iArr2, iArr4.length, 8);
            iArr2[12] = i8;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
