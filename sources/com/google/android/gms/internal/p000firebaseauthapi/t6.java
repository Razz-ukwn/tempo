package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t6  reason: invalid package */
public final class t6 extends qa {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4943b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(Class cls, int i8) {
        super(cls);
        this.f4943b = i8;
    }

    public final o3 a(o3 o3Var) {
        switch (this.f4943b) {
            case 0:
                id idVar = (id) o3Var;
                new u6(1);
                kd e10 = b7.e(idVar.w());
                o3 a10 = new jc().a().a(idVar.x());
                fd u7 = gd.u();
                u7.j();
                ((gd) u7.f4729b).zze = e10;
                u7.j();
                gd.B((gd) u7.f4729b, (bf) a10);
                u7.j();
                ((gd) u7.f4729b).zzd = 0;
                return (gd) u7.h();
            case 1:
                zd u10 = ae.u();
                byte[] a11 = jh.a(((ce) o3Var).t());
                p1 l10 = q1.l(a11, 0, a11.length);
                u10.j();
                ((ae) u10.f4729b).zze = l10;
                u10.j();
                ((ae) u10.f4729b).zzd = 0;
                return (ae) u10.h();
            case 2:
                rg rgVar = (rg) o3Var;
                pg u11 = qg.u();
                u11.j();
                ((qg) u11.f4729b).zzd = 0;
                byte[] a12 = jh.a(32);
                p1 l11 = q1.l(a12, 0, a12.length);
                u11.j();
                ((qg) u11.f4729b).zze = l11;
                return (qg) u11.h();
            default:
                pe peVar = (pe) o3Var;
                ECParameterSpec g10 = zg.g(m9.c(peVar.w().x().y()));
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) ch.f4473e.a("EC");
                keyPairGenerator.initialize(g10);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                ECPoint w10 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
                ue v3 = ve.v();
                v3.j();
                ((ve) v3.f4729b).zzd = 0;
                re w11 = peVar.w();
                v3.j();
                ve.C((ve) v3.f4729b, w11);
                byte[] byteArray = w10.getAffineX().toByteArray();
                p1 p1Var = q1.f4830b;
                p1 l12 = q1.l(byteArray, 0, byteArray.length);
                v3.j();
                ((ve) v3.f4729b).zzf = l12;
                byte[] byteArray2 = w10.getAffineY().toByteArray();
                p1 l13 = q1.l(byteArray2, 0, byteArray2.length);
                v3.j();
                ((ve) v3.f4729b).zzg = l13;
                se u12 = te.u();
                u12.j();
                ((te) u12.f4729b).zzd = 0;
                u12.j();
                ((te) u12.f4729b).zze = (ve) v3.h();
                byte[] byteArray3 = ((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray();
                p1 l14 = q1.l(byteArray3, 0, byteArray3.length);
                u12.j();
                ((te) u12.f4729b).zzf = l14;
                return (te) u12.h();
        }
    }

    public final o3 b(q1 q1Var) {
        switch (this.f4943b) {
            case 0:
                return id.v(q1Var, c2.f4439b);
            case 1:
                return ce.w(q1Var, c2.f4439b);
            case 2:
                return rg.v(q1Var, c2.f4439b);
            default:
                return pe.v(q1Var, c2.f4439b);
        }
    }

    public final Map c() {
        switch (this.f4943b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_CTR_HMAC_SHA256", u6.h(16, 16, 1));
                hashMap.put("AES128_CTR_HMAC_SHA256_RAW", u6.h(16, 16, 3));
                hashMap.put("AES256_CTR_HMAC_SHA256", u6.h(32, 32, 1));
                hashMap.put("AES256_CTR_HMAC_SHA256_RAW", u6.h(32, 32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 1:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_GCM_SIV", u6.i(16, 1));
                hashMap2.put("AES128_GCM_SIV_RAW", u6.i(16, 3));
                hashMap2.put("AES256_GCM_SIV", u6.i(32, 1));
                hashMap2.put("AES256_GCM_SIV_RAW", u6.i(32, 3));
                return Collections.unmodifiableMap(hashMap2);
            case 2:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("XCHACHA20_POLY1305", new pa(rg.u(), 1));
                hashMap3.put("XCHACHA20_POLY1305_RAW", new pa(rg.u(), 3));
                return Collections.unmodifiableMap(hashMap3);
            default:
                HashMap hashMap4 = new HashMap();
                t5 a10 = u5.a("AES128_GCM");
                byte[] bArr = g9.f4575d;
                hashMap4.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", g9.i(3, a10, bArr, 1));
                hashMap4.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", g9.i(3, u5.a("AES128_GCM"), bArr, 3));
                hashMap4.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", g9.i(4, u5.a("AES128_GCM"), bArr, 1));
                hashMap4.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", g9.i(4, u5.a("AES128_GCM"), bArr, 3));
                hashMap4.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", g9.i(4, u5.a("AES128_GCM"), bArr, 3));
                hashMap4.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", g9.i(3, u5.a("AES128_CTR_HMAC_SHA256"), bArr, 1));
                hashMap4.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", g9.i(3, u5.a("AES128_CTR_HMAC_SHA256"), bArr, 3));
                hashMap4.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", g9.i(4, u5.a("AES128_CTR_HMAC_SHA256"), bArr, 1));
                hashMap4.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", g9.i(4, u5.a("AES128_CTR_HMAC_SHA256"), bArr, 3));
                return Collections.unmodifiableMap(hashMap4);
        }
    }

    public final void d(o3 o3Var) {
        switch (this.f4943b) {
            case 0:
                id idVar = (id) o3Var;
                qa a10 = new u6(1).a();
                md w10 = idVar.w();
                b7 b7Var = (b7) a10;
                kh.b(w10.t());
                od y10 = w10.y();
                if (y10.t() < 12 || y10.t() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                new jc().a().d(idVar.x());
                kh.b(idVar.w().t());
                return;
            case 1:
                kh.b(((ce) o3Var).t());
                return;
            case 2:
                rg rgVar = (rg) o3Var;
                return;
            default:
                m9.a(((pe) o3Var).w());
                return;
        }
    }
}
