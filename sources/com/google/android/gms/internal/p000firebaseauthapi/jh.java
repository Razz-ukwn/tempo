package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jh  reason: invalid package */
public final class jh {

    /* renamed from: a  reason: collision with root package name */
    public static final ih f4673a = new ih();

    public static byte[] a(int i8) {
        byte[] bArr = new byte[i8];
        ((SecureRandom) f4673a.get()).nextBytes(bArr);
        return bArr;
    }
}
