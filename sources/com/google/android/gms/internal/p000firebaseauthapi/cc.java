package com.google.android.gms.internal.p000firebaseauthapi;

import cb.c;
import com.google.android.gms.internal.measurement.ma;
import com.google.android.gms.internal.measurement.na;
import java.security.GeneralSecurityException;
import java.util.List;
import q7.e2;
import q7.g2;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.cc  reason: invalid package */
public final /* synthetic */ class cc implements ka, e2 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ cc f4468a = new cc();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ cc f4469b = new cc();

    public c a(nb nbVar) {
        ac acVar;
        ab abVar = dc.f4492a;
        if (((lb) nbVar).f4712a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                ad w10 = ad.w(((lb) nbVar).f4714c, c2.f4439b);
                if (w10.t() == 0) {
                    zb zbVar = new zb();
                    zbVar.a(w10.y().c());
                    zbVar.b(w10.x().t());
                    mg mgVar = ((lb) nbVar).f4716e;
                    int ordinal = mgVar.ordinal();
                    if (ordinal == 1) {
                        acVar = ac.f4400b;
                    } else if (ordinal == 2) {
                        acVar = ac.f4402d;
                    } else if (ordinal == 3) {
                        acVar = ac.f4403e;
                    } else if (ordinal == 4) {
                        acVar = ac.f4401c;
                    } else {
                        int zza = mgVar.zza();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                    }
                    zbVar.f5136c = acVar;
                    bc c3 = zbVar.c();
                    ub ubVar = new ub();
                    ubVar.f4992a = c3;
                    ubVar.f4993b = s.i(w10.y().m());
                    ubVar.f4994c = ((lb) nbVar).B;
                    return ubVar.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w2 | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }

    public Object zza() {
        List list = g2.f13022a;
        return Boolean.valueOf(((na) ma.f5402b.f5403a.zza()).zzb());
    }
}
