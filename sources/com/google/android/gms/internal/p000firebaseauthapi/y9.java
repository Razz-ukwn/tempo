package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.z0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y9  reason: invalid package */
public final class y9 extends qa {
    public y9() {
        super(Cif.class);
    }

    public final o3 a(o3 o3Var) {
        byte[] bArr;
        byte[] bArr2;
        Cif ifVar = (Cif) o3Var;
        int y10 = ifVar.w().y() - 2;
        if (y10 != 1) {
            int i8 = 3;
            if (y10 == 2 || y10 == 3 || y10 == 4) {
                int y11 = ifVar.w().y();
                byte[] bArr3 = aa.f4386a;
                int i10 = y11 - 2;
                if (i10 == 2) {
                    i8 = 1;
                } else if (i10 == 3) {
                    i8 = 2;
                } else if (i10 != 4) {
                    throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                }
                ECParameterSpec g10 = zg.g(i8);
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) ch.f4473e.a("EC");
                keyPairGenerator.initialize(g10);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                ECPoint w10 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
                EllipticCurve curve = zg.g(i8).getCurve();
                ia.b(w10, curve);
                int a10 = zg.a(curve);
                int i11 = a10 + a10 + 1;
                bArr = new byte[i11];
                BigInteger affineX = w10.getAffineX();
                if (affineX.signum() != -1) {
                    byte[] byteArray = affineX.toByteArray();
                    BigInteger affineY = w10.getAffineY();
                    if (affineY.signum() != -1) {
                        byte[] byteArray2 = affineY.toByteArray();
                        int length = byteArray2.length;
                        System.arraycopy(byteArray2, 0, bArr, i11 - length, length);
                        int length2 = byteArray.length;
                        System.arraycopy(byteArray, 0, bArr, (a10 + 1) - length2, length2);
                        bArr[0] = 4;
                        bArr2 = ((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray();
                    } else {
                        throw new IllegalArgumentException("n must not be negative");
                    }
                } else {
                    throw new IllegalArgumentException("n must not be negative");
                }
            } else {
                throw new GeneralSecurityException("Invalid KEM");
            }
        } else {
            byte[] a11 = jh.a(32);
            a11[0] = (byte) (a11[0] | 7);
            byte b10 = a11[31] & 63;
            a11[31] = (byte) b10;
            a11[31] = (byte) (b10 | 128);
            if (a11.length == 32) {
                byte[] bArr4 = new byte[32];
                bArr4[0] = 9;
                bArr = z0.k(a11, bArr4);
                bArr2 = a11;
            } else {
                throw new InvalidKeyException("Private key must have 32 bytes.");
            }
        }
        of v3 = pf.v();
        v3.j();
        ((pf) v3.f4729b).zzd = 0;
        lf w11 = ifVar.w();
        v3.j();
        pf.B((pf) v3.f4729b, w11);
        p1 l10 = q1.l(bArr, 0, bArr.length);
        v3.j();
        ((pf) v3.f4729b).zzf = l10;
        mf u7 = nf.u();
        u7.j();
        ((nf) u7.f4729b).zzd = 0;
        u7.j();
        ((nf) u7.f4729b).zze = (pf) v3.h();
        p1 l11 = q1.l(bArr2, 0, bArr2.length);
        u7.j();
        ((nf) u7.f4729b).zzf = l11;
        return (nf) u7.h();
    }

    public final o3 b(q1 q1Var) {
        return Cif.v(q1Var, c2.f4439b);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", z9.i(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", z9.i(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", z9.i(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", z9.i(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", z9.i(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", z9.i(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", z9.i(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", z9.i(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", z9.i(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", z9.i(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", z9.i(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", z9.i(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", z9.i(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", z9.i(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", z9.i(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", z9.i(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", z9.i(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", z9.i(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void d(o3 o3Var) {
        aa.a(((Cif) o3Var).w());
    }
}
