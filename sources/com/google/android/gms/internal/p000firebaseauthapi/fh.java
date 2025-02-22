package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fh  reason: invalid package */
public final class fh extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ gh f4552a;

    public fh(gh ghVar) {
        this.f4552a = ghVar;
    }

    public final Object initialValue() {
        gh ghVar = this.f4552a;
        try {
            Mac mac = (Mac) ch.f4471c.a(ghVar.f4588b);
            mac.init(ghVar.f4589c);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
