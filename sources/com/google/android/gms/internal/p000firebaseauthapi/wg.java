package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wg  reason: invalid package */
public final class wg implements i5 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5055a;

    /* renamed from: b  reason: collision with root package name */
    public final r8 f5056b;

    public wg(byte[] bArr, int i8) {
        this.f5055a = i8;
        if (i8 != 1) {
            this.f5056b = new q8(bArr);
        } else {
            this.f5056b = new t8(bArr);
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i8 = this.f5055a;
        r8 r8Var = this.f5056b;
        switch (i8) {
            case 0:
                int length = bArr.length;
                if (length >= 28) {
                    return ((q8) r8Var).b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
            default:
                int length2 = bArr.length;
                if (length2 >= 40) {
                    return ((t8) r8Var).b(ByteBuffer.wrap(bArr, 24, length2 - 24), Arrays.copyOf(bArr, 24), bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        switch (this.f5055a) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }
}
