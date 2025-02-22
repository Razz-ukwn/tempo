package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e8  reason: invalid package */
public final class e8 extends gb {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4516b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8(int i8, Class cls) {
        super(cls);
        this.f4516b = i8;
    }

    public final /* bridge */ /* synthetic */ Object a(o3 o3Var) {
        switch (this.f4516b) {
            case 0:
                jg jgVar = (jg) o3Var;
                String x10 = jgVar.x().x();
                return new d8(jgVar.x().t(), z5.a(x10).zza(x10));
            case 1:
                ve veVar = (ve) o3Var;
                re u7 = veVar.u();
                xe x11 = u7.x();
                int c3 = m9.c(x11.y());
                byte[] m = veVar.z().m();
                byte[] m10 = veVar.A().m();
                ECParameterSpec g10 = zg.g(c3);
                ECPoint eCPoint = new ECPoint(new BigInteger(1, m), new BigInteger(1, m10));
                ia.b(eCPoint, g10.getCurve());
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, g10);
                n9 n9Var = new n9(u7.t().w());
                byte[] m11 = x11.w().m();
                String b10 = m9.b(x11.z());
                m9.d(u7.A());
                return new y0((ECPublicKey) ((KeyFactory) ch.f4474f.a("EC")).generatePublic(eCPublicKeySpec), m11, b10, n9Var);
            default:
                bf bfVar = (bf) o3Var;
                int y10 = bfVar.y().y();
                SecretKeySpec secretKeySpec = new SecretKeySpec(bfVar.z().m(), "HMAC");
                int t2 = bfVar.y().t();
                int i8 = y10 - 2;
                if (i8 == 1) {
                    return new hh(new gh("HMACSHA1", secretKeySpec), t2);
                }
                if (i8 == 2) {
                    return new hh(new gh("HMACSHA384", secretKeySpec), t2);
                }
                if (i8 == 3) {
                    return new hh(new gh("HMACSHA256", secretKeySpec), t2);
                }
                if (i8 == 4) {
                    return new hh(new gh("HMACSHA512", secretKeySpec), t2);
                }
                if (i8 == 5) {
                    return new hh(new gh("HMACSHA224", secretKeySpec), t2);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
