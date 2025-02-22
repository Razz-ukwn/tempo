package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zg  reason: invalid package */
public final class zg {
    public static int a(EllipticCurve ellipticCurve) {
        return (ia.a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger b(BigInteger bigInteger, boolean z10, EllipticCurve ellipticCurve) {
        BigInteger bigInteger2;
        BigInteger a10 = ia.a(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(a10);
        if (a10.signum() == 1) {
            BigInteger mod2 = mod.mod(a10);
            BigInteger bigInteger3 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger3)) {
                if (!a10.testBit(0) || !a10.testBit(1)) {
                    if (a10.testBit(0) && !a10.testBit(1)) {
                        bigInteger3 = BigInteger.ONE;
                        BigInteger shiftRight = a10.subtract(bigInteger3).shiftRight(1);
                        int i8 = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(a10);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, a10);
                            BigInteger bigInteger4 = BigInteger.ONE;
                            if (modPow.add(bigInteger4).equals(a10)) {
                                BigInteger shiftRight2 = a10.add(bigInteger4).shiftRight(1);
                                BigInteger bigInteger5 = bigInteger3;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                    bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(a10).multiply(mod3)).mod(a10);
                                    BigInteger mod4 = multiply.add(multiply).mod(a10);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod5 = bigInteger5.multiply(bigInteger3).add(mod4.multiply(mod3)).mod(a10);
                                        bigInteger4 = bigInteger3.multiply(mod4).add(bigInteger5).mod(a10);
                                        bigInteger5 = mod5;
                                    } else {
                                        bigInteger4 = mod4;
                                    }
                                }
                                bigInteger2 = bigInteger5;
                            } else if (modPow.equals(bigInteger4)) {
                                bigInteger3 = bigInteger3.add(bigInteger4);
                                i8++;
                                if (i8 == 128 && !a10.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    } else {
                        bigInteger2 = null;
                    }
                } else {
                    bigInteger2 = mod2.modPow(a10.add(BigInteger.ONE).shiftRight(2), a10);
                }
                if (bigInteger3 != null && bigInteger3.multiply(bigInteger3).mod(a10).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z10 != bigInteger3.testBit(0) ? a10.subtract(bigInteger3).mod(a10) : bigInteger3;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static void c(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            ECParameterSpec eCParameterSpec = ia.f4648a;
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static byte[] d(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        c(eCPrivateKey, eCPublicKey);
        ECPoint w10 = eCPublicKey.getW();
        ia.b(w10, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) ch.f4474f.a("EC")).generatePublic(new ECPublicKeySpec(w10, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) ch.f4472d.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(ia.a(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            b(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static ECPrivateKey e(byte[] bArr, int i8) {
        return (ECPrivateKey) ((KeyFactory) ch.f4474f.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), g(i8)));
    }

    public static ECPublicKey f(ECParameterSpec eCParameterSpec, int i8, byte[] bArr) {
        ECPoint eCPoint;
        EllipticCurve curve = eCParameterSpec.getCurve();
        int a10 = a(curve);
        int i10 = i8 - 1;
        boolean z10 = false;
        if (i10 == 0) {
            int length = bArr.length;
            if (length != a10 + a10 + 1) {
                throw new GeneralSecurityException("invalid point size");
            } else if (bArr[0] == 4) {
                int i11 = a10 + 1;
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i11)), new BigInteger(1, Arrays.copyOfRange(bArr, i11, length)));
                ia.b(eCPoint, curve);
            } else {
                throw new GeneralSecurityException("invalid point format");
            }
        } else if (i10 != 2) {
            BigInteger a11 = ia.a(curve);
            int length2 = bArr.length;
            if (length2 == a10 + 1) {
                byte b10 = bArr[0];
                if (b10 != 2) {
                    if (b10 == 3) {
                        z10 = true;
                    } else {
                        throw new GeneralSecurityException("invalid format");
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length2));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(a11) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                eCPoint = new ECPoint(bigInteger, b(bigInteger, z10, curve));
            } else {
                throw new GeneralSecurityException("compressed point has wrong length");
            }
        } else {
            int length3 = bArr.length;
            if (length3 == a10 + a10) {
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, a10)), new BigInteger(1, Arrays.copyOfRange(bArr, a10, length3)));
                ia.b(eCPoint, curve);
            } else {
                throw new GeneralSecurityException("invalid point size");
            }
        }
        return (ECPublicKey) ((KeyFactory) ch.f4474f.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
    }

    public static ECParameterSpec g(int i8) {
        int i10 = i8 - 1;
        return i10 != 0 ? i10 != 1 ? ia.f4650c : ia.f4649b : ia.f4648a;
    }
}
