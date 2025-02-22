package com.google.android.gms.internal.p000firebaseauthapi;

import e.s;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fc  reason: invalid package */
public final class fc implements f6 {

    /* renamed from: a  reason: collision with root package name */
    public static final fc f4551a = new fc();

    public final Object a(e6 e6Var) {
        if (((c6) e6Var.f4512c) != null) {
            for (List<c6> it : ((ConcurrentMap) e6Var.f4510a).values()) {
                for (c6 c6Var : it) {
                    c6Var.getClass();
                }
            }
            return new s(e6Var);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }

    public final Class zza() {
        return ec.class;
    }

    public final Class zzb() {
        return ec.class;
    }
}
