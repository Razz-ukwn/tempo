package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z9  reason: invalid package */
public final class z9 extends kb {
    public z9() {
        super(nf.class, new x9());
    }

    public static pa i(int i8, int i10, int i11, int i12) {
        kf t2 = lf.t();
        t2.j();
        ((lf) t2.f4729b).zzd = i8 - 2;
        t2.j();
        ((lf) t2.f4729b).zze = i10 - 2;
        t2.j();
        ((lf) t2.f4729b).zzf = i11 - 2;
        hf t10 = Cif.t();
        t10.j();
        ((Cif) t10.f4729b).zzd = (lf) t2.h();
        return new pa((Cif) t10.h(), i12);
    }

    public final qa a() {
        return new y9();
    }

    public final int b() {
        return 3;
    }

    public final o3 c(q1 q1Var) {
        return nf.w(q1Var, c2.f4439b);
    }

    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public final void e(o3 o3Var) {
        nf nfVar = (nf) o3Var;
        if (nfVar.y().c() == 0) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (nfVar.C()) {
            kh.c(nfVar.t());
            aa.a(nfVar.x().u());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    public final /* synthetic */ o3 h(o3 o3Var) {
        return ((nf) o3Var).x();
    }
}
