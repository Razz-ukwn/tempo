package com.google.android.gms.internal.p000firebaseauthapi;

import ag.m;
import com.google.android.gms.common.api.internal.e1;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.sg  reason: invalid package */
public final class sg implements eh {

    /* renamed from: d  reason: collision with root package name */
    public static final e1 f4917d = new e1(1);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f4918a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4919b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4920c;

    public sg(byte[] bArr, int i8) {
        if (m.y(2)) {
            kh.b(bArr.length);
            this.f4918a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f4917d.get()).getBlockSize();
            this.f4920c = blockSize;
            if (i8 < 12 || i8 > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f4919b = i8;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr) {
        int length = bArr.length;
        int i8 = this.f4919b;
        if (length >= i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, 0, bArr2, 0, i8);
            int i10 = this.f4919b;
            int i11 = length - i10;
            byte[] bArr3 = new byte[i11];
            Cipher cipher = (Cipher) f4917d.get();
            byte[] bArr4 = new byte[this.f4920c];
            System.arraycopy(bArr2, 0, bArr4, 0, i8);
            cipher.init(2, this.f4918a, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i10, i11, bArr3, 0) == i11) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
