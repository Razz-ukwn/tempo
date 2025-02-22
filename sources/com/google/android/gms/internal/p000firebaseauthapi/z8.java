package com.google.android.gms.internal.p000firebaseauthapi;

import d.a;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z8  reason: invalid package */
public final class z8 extends ra {
    public z8() {
        super(fe.class, new a8(1, j5.class));
    }

    public final qa a() {
        return new y8();
    }

    public final int b() {
        return 2;
    }

    public final o3 c(q1 q1Var) {
        return fe.w(q1Var, c2.f4439b);
    }

    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void e(o3 o3Var) {
        fe feVar = (fe) o3Var;
        kh.c(feVar.t());
        if (feVar.x().c() != 64) {
            throw new InvalidKeyException(a.a("invalid key size: ", feVar.x().c(), ". Valid keys must have 64 bytes."));
        }
    }
}
