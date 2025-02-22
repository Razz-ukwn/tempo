package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o8  reason: invalid package */
public final class o8 extends p8 {
    public o8(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    public final int a() {
        return 12;
    }

    public final int[] b(int[] iArr, int i8) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            int[] iArr3 = l8.f4709a;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            System.arraycopy(this.f4813a, 0, iArr2, iArr3.length, 8);
            iArr2[12] = i8;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
