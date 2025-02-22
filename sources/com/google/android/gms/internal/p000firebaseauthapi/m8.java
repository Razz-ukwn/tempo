package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m8  reason: invalid package */
public final class m8 extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4736a;

    public /* synthetic */ m8(int i8) {
        this.f4736a = i8;
    }

    public final Object initialValue() {
        switch (this.f4736a) {
            case 0:
                try {
                    return (Cipher) ch.f4470b.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                try {
                    return (Cipher) ch.f4470b.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
        }
    }
}
