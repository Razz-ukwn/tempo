package com.google.android.gms.internal.p000firebaseauthapi;

import ag.d;
import ag.m;
import androidx.fragment.app.z0;
import d.a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import w3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.vg  reason: invalid package */
public final class vg implements j5 {

    /* renamed from: c  reason: collision with root package name */
    public static final List f5021c = Arrays.asList(new Integer[]{64});

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f5022d = new byte[16];

    /* renamed from: a  reason: collision with root package name */
    public final c f5023a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5024b;

    public vg(byte[] bArr) {
        if (m.y(1)) {
            int length = bArr.length;
            if (f5021c.contains(Integer.valueOf(length))) {
                int i8 = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i8);
                this.f5024b = Arrays.copyOfRange(bArr, i8, length);
                this.f5023a = new c(copyOfRange);
                return;
            }
            throw new InvalidKeyException(a.a("invalid key size: ", length, " bytes; key must have 64 bytes"));
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length >= 16) {
            Cipher cipher = (Cipher) ch.f4470b.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr4 = (byte[]) copyOfRange.clone();
            bArr4[8] = (byte) (bArr4[8] & Byte.MAX_VALUE);
            bArr4[12] = (byte) (bArr4[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f5024b, "AES"), new IvParameterSpec(bArr4));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                doFinal = new byte[0];
            }
            byte[][] bArr5 = {bArr2, doFinal};
            c cVar = this.f5023a;
            byte[] a10 = cVar.a(f5022d, 16);
            for (int i8 = 0; i8 <= 0; i8++) {
                byte[] bArr6 = bArr5[i8];
                if (bArr6 == null) {
                    bArr6 = new byte[0];
                }
                a10 = z0.m(d.n(a10), cVar.a(bArr6, 16));
            }
            byte[] bArr7 = bArr5[1];
            int length2 = bArr7.length;
            if (length2 >= 16) {
                int length3 = a10.length;
                if (length2 >= length3) {
                    bArr3 = Arrays.copyOf(bArr7, length2);
                    for (int i10 = 0; i10 < a10.length; i10++) {
                        int i11 = (length2 - length3) + i10;
                        bArr3[i11] = (byte) (bArr3[i11] ^ a10[i10]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                int length4 = bArr7.length;
                if (length4 < 16) {
                    byte[] copyOf = Arrays.copyOf(bArr7, 16);
                    copyOf[length4] = Byte.MIN_VALUE;
                    bArr3 = z0.m(copyOf, d.n(a10));
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            if (MessageDigest.isEqual(copyOfRange, cVar.a(bArr3, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
