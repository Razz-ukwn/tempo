package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k7  reason: invalid package */
public final class k7 {

    /* renamed from: a  reason: collision with root package name */
    public o7 f4683a = null;

    /* renamed from: b  reason: collision with root package name */
    public s f4684b = null;

    /* renamed from: c  reason: collision with root package name */
    public Integer f4685c = null;

    public final l7 a() {
        s sVar;
        o7 o7Var = this.f4683a;
        if (o7Var == null || (sVar = this.f4684b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (o7Var.f4775c == sVar.f()) {
            n7 n7Var = n7.f4753d;
            if (!(o7Var.f4776d != n7Var) || this.f4685c != null) {
                n7 n7Var2 = this.f4683a.f4776d;
                if ((n7Var2 != n7Var) || this.f4685c == null) {
                    if (n7Var2 == n7Var) {
                        lh.a(new byte[0]);
                    } else if (n7Var2 == n7.f4752c) {
                        lh.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f4685c.intValue()).array());
                    } else if (n7Var2 == n7.f4751b) {
                        lh.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f4685c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f4683a.f4776d)));
                    }
                    return new l7();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
