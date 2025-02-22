package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u5  reason: invalid package */
public final class u5 {
    public static t5 a(String str) {
        Map unmodifiableMap;
        AtomicReference atomicReference = i6.f4636a;
        synchronized (i6.class) {
            unmodifiableMap = Collections.unmodifiableMap(i6.f4639d);
        }
        t5 t5Var = (t5) unmodifiableMap.get(str);
        if (t5Var != null) {
            return t5Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
