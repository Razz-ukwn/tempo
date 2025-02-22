package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p8  reason: invalid package */
public abstract class p8 {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f4813a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4814b;

    public p8(byte[] bArr, int i8) {
        if (bArr.length == 32) {
            this.f4813a = l8.c(bArr);
            this.f4814b = i8;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i8);

    public final ByteBuffer c(byte[] bArr, int i8) {
        int[] b10 = b(l8.c(bArr), i8);
        int[] iArr = (int[]) b10.clone();
        l8.b(iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            b10[i10] = b10[i10] + iArr[i10];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b10, 0, 16);
        return order;
    }
}
