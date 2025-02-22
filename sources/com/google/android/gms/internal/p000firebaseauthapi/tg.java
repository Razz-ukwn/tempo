package com.google.android.gms.internal.p000firebaseauthapi;

import ag.m;
import d7.d;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.tg  reason: invalid package */
public final class tg implements i5 {

    /* renamed from: e  reason: collision with root package name */
    public static final m8 f4956e = new m8(1);

    /* renamed from: f  reason: collision with root package name */
    public static final d f4957f = new d(2);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4958a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4959b;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f4960c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4961d;

    public tg(byte[] bArr, int i8) {
        if (!m.y(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i8 == 12 || i8 == 16) {
            this.f4961d = i8;
            kh.b(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f4960c = secretKeySpec;
            Cipher cipher = (Cipher) f4956e.get();
            cipher.init(1, secretKeySpec);
            byte[] c3 = c(cipher.doFinal(new byte[16]));
            this.f4958a = c3;
            this.f4959b = c(c3);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i8 = 0;
        while (i8 < 15) {
            byte b10 = bArr[i8];
            int i10 = i8 + 1;
            bArr2[i8] = (byte) (((b10 + b10) ^ ((bArr[i10] & 255) >>> 7)) & 255);
            i8 = i10;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr3[i8] = (byte) (bArr[i8] ^ bArr2[i8]);
        }
        return bArr3;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i8 = this.f4961d;
        int i10 = (length - i8) - 16;
        if (i10 >= 0) {
            Cipher cipher = (Cipher) f4956e.get();
            SecretKeySpec secretKeySpec = this.f4960c;
            cipher.init(1, secretKeySpec);
            Cipher cipher2 = cipher;
            byte[] d10 = d(cipher2, 0, bArr, 0, this.f4961d);
            byte[] d11 = d(cipher2, 1, bArr2, 0, 0);
            byte[] d12 = d(cipher2, 2, bArr, this.f4961d, i10);
            int i11 = length - 16;
            byte b10 = 0;
            for (int i12 = 0; i12 < 16; i12++) {
                b10 = (byte) (b10 | (((bArr3[i11 + i12] ^ d11[i12]) ^ d10[i12]) ^ d12[i12]));
            }
            if (b10 == 0) {
                Cipher cipher3 = (Cipher) f4957f.get();
                cipher3.init(1, secretKeySpec, new IvParameterSpec(d10));
                return cipher3.doFinal(bArr3, i8, i10);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] d(Cipher cipher, int i8, byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i8;
        byte[] bArr4 = this.f4958a;
        if (i11 == 0) {
            return cipher.doFinal(e(bArr3, bArr4));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i12 = 0;
        int i13 = 0;
        while (i11 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                doFinal[i14] = (byte) (doFinal[i14] ^ bArr[(i10 + i13) + i14]);
            }
            doFinal = cipher.doFinal(doFinal);
            i13 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i13 + i10, i10 + i11);
        if (copyOfRange.length == 16) {
            bArr2 = e(copyOfRange, bArr4);
        } else {
            bArr2 = Arrays.copyOf(this.f4959b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i12 >= length) {
                    break;
                }
                bArr2[i12] = (byte) (bArr2[i12] ^ copyOfRange[i12]);
                i12++;
            }
            bArr2[length] = (byte) (bArr2[length] ^ 128);
        }
        return cipher.doFinal(e(doFinal, bArr2));
    }
}
