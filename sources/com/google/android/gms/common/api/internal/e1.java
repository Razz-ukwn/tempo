package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.p000firebaseauthapi.ch;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public final class e1 extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4259a;

    public /* synthetic */ e1(int i8) {
        this.f4259a = i8;
    }

    public final Object initialValue() {
        switch (this.f4259a) {
            case 0:
                return Boolean.FALSE;
            default:
                try {
                    return (Cipher) ch.f4470b.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
