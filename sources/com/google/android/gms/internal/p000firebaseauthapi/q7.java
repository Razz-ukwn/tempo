package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q7  reason: invalid package */
public final class q7 {

    /* renamed from: a  reason: collision with root package name */
    public t7 f4839a = null;

    /* renamed from: b  reason: collision with root package name */
    public s f4840b = null;

    /* renamed from: c  reason: collision with root package name */
    public Integer f4841c = null;

    public final r7 a() {
        s sVar;
        t7 t7Var = this.f4839a;
        if (t7Var == null || (sVar = this.f4840b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (t7Var.f4944c == sVar.f()) {
            s7 s7Var = s7.f4908d;
            if (!(t7Var.f4945d != s7Var) || this.f4841c != null) {
                s7 s7Var2 = this.f4839a.f4945d;
                if ((s7Var2 != s7Var) || this.f4841c == null) {
                    if (s7Var2 == s7Var) {
                        lh.a(new byte[0]);
                    } else if (s7Var2 == s7.f4907c) {
                        lh.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f4841c.intValue()).array());
                    } else if (s7Var2 == s7.f4906b) {
                        lh.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f4841c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f4839a.f4945d)));
                    }
                    return new r7();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
