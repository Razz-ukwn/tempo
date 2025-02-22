package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mb  reason: invalid package */
public final class mb implements nb, dh {
    public final /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
