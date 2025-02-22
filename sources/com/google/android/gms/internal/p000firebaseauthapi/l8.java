package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l8  reason: invalid package */
public final class l8 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f4709a = c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int i8, int i10, int i11, int i12, int[] iArr) {
        int i13 = iArr[i8] + iArr[i10];
        iArr[i8] = i13;
        int i14 = i13 ^ iArr[i12];
        int i15 = (i14 >>> -16) | (i14 << 16);
        iArr[i12] = i15;
        int i16 = iArr[i11] + i15;
        iArr[i11] = i16;
        int i17 = iArr[i10] ^ i16;
        int i18 = (i17 >>> -12) | (i17 << 12);
        iArr[i10] = i18;
        int i19 = iArr[i8] + i18;
        iArr[i8] = i19;
        int i20 = iArr[i12] ^ i19;
        int i21 = (i20 >>> -8) | (i20 << 8);
        iArr[i12] = i21;
        int i22 = iArr[i11] + i21;
        iArr[i11] = i22;
        int i23 = iArr[i10] ^ i22;
        iArr[i10] = (i23 >>> -7) | (i23 << 7);
    }

    public static void b(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i8 = 0; i8 < 10; i8++) {
            a(0, 4, 8, 12, iArr2);
            a(1, 5, 9, 13, iArr2);
            a(2, 6, 10, 14, iArr2);
            a(3, 7, 11, 15, iArr2);
            a(0, 5, 10, 15, iArr2);
            a(1, 6, 11, 12, iArr2);
            a(2, 7, 8, 13, iArr2);
            a(3, 4, 9, 14, iArr2);
        }
    }

    public static int[] c(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
