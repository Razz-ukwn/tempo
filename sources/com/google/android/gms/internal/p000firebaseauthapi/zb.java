package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.q;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zb  reason: invalid package */
public final class zb {

    /* renamed from: a  reason: collision with root package name */
    public Integer f5134a = null;

    /* renamed from: b  reason: collision with root package name */
    public Integer f5135b = null;

    /* renamed from: c  reason: collision with root package name */
    public ac f5136c = ac.f4403e;

    public final void a(int i8) {
        if (i8 == 16 || i8 == 32) {
            this.f5134a = Integer.valueOf(i8);
        } else {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i8 * 8)}));
        }
    }

    public final void b(int i8) {
        if (i8 < 10 || i8 > 16) {
            throw new GeneralSecurityException(q.a("Invalid tag size for AesCmacParameters: ", i8));
        }
        this.f5135b = Integer.valueOf(i8);
    }

    public final bc c() {
        Integer num = this.f5134a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        } else if (this.f5135b == null) {
            throw new GeneralSecurityException("tag size not set");
        } else if (this.f5136c != null) {
            return new bc(num.intValue(), this.f5135b.intValue(), this.f5136c);
        } else {
            throw new GeneralSecurityException("variant not set");
        }
    }
}
