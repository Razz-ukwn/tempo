package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m7  reason: invalid package */
public final class m7 {

    /* renamed from: a  reason: collision with root package name */
    public Integer f4732a = null;

    /* renamed from: b  reason: collision with root package name */
    public Integer f4733b = null;

    /* renamed from: c  reason: collision with root package name */
    public Object f4734c = null;

    /* renamed from: d  reason: collision with root package name */
    public Object f4735d = lc.f4720e;

    public /* synthetic */ m7(int i8) {
    }

    public final mc a() {
        Integer num = this.f4732a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        } else if (this.f4733b == null) {
            throw new GeneralSecurityException("tag size is not set");
        } else if (((kc) this.f4734c) == null) {
            throw new GeneralSecurityException("hash type is not set");
        } else if (((lc) this.f4735d) == null) {
            throw new GeneralSecurityException("variant is not set");
        } else if (num.intValue() >= 16) {
            int intValue = this.f4733b.intValue();
            kc kcVar = (kc) this.f4734c;
            if (intValue >= 10) {
                if (kcVar == kc.f4691b) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (kcVar == kc.f4692c) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (kcVar == kc.f4693d) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (kcVar == kc.f4694e) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (kcVar != kc.f4695f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                } else if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                }
                return new mc(this.f4732a.intValue(), this.f4733b.intValue(), (lc) this.f4735d, (kc) this.f4734c);
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(intValue)}));
        } else {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.f4732a}));
        }
    }
}
