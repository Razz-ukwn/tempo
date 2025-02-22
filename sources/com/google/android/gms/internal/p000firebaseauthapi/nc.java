package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.compose.ui.platform.b3;
import cb.c;
import com.google.android.gms.internal.measurement.ad;
import com.google.android.gms.internal.measurement.zc;
import java.security.GeneralSecurityException;
import java.util.List;
import q7.e2;
import q7.g2;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.nc  reason: invalid package */
public final /* synthetic */ class nc implements ka, e2 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ nc f4764a = new nc();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ nc f4765b = new nc();

    public c a(nb nbVar) {
        kc kcVar;
        lc lcVar;
        ab abVar = oc.f4784a;
        if (((lb) nbVar).f4712a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                bf x10 = bf.x(((lb) nbVar).f4714c, c2.f4439b);
                if (x10.t() == 0) {
                    m7 m7Var = new m7(0);
                    m7Var.f4732a = Integer.valueOf(x10.z().c());
                    m7Var.f4733b = Integer.valueOf(x10.y().t());
                    int y10 = x10.y().y();
                    int i8 = y10 - 2;
                    if (i8 == 1) {
                        kcVar = kc.f4691b;
                    } else if (i8 == 2) {
                        kcVar = kc.f4694e;
                    } else if (i8 == 3) {
                        kcVar = kc.f4693d;
                    } else if (i8 == 4) {
                        kcVar = kc.f4695f;
                    } else if (i8 == 5) {
                        kcVar = kc.f4692c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse HashType: " + b3.b(y10));
                    }
                    m7Var.f4734c = kcVar;
                    mg mgVar = ((lb) nbVar).f4716e;
                    int ordinal = mgVar.ordinal();
                    if (ordinal == 1) {
                        lcVar = lc.f4717b;
                    } else if (ordinal == 2) {
                        lcVar = lc.f4719d;
                    } else if (ordinal == 3) {
                        lcVar = lc.f4720e;
                    } else if (ordinal == 4) {
                        lcVar = lc.f4718c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + mgVar.zza());
                    }
                    m7Var.f4735d = lcVar;
                    mc a10 = m7Var.a();
                    gc gcVar = new gc();
                    gcVar.f4579a = a10;
                    gcVar.f4580b = s.i(x10.z().m());
                    gcVar.f4581c = ((lb) nbVar).B;
                    return gcVar.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w2 | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }

    public Object zza() {
        List list = g2.f13022a;
        return Boolean.valueOf(((ad) zc.f5633b.f5634a.zza()).zzb());
    }
}
