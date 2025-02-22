package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c7  reason: invalid package */
public final class c7 {

    /* renamed from: a  reason: collision with root package name */
    public i7 f4452a = null;

    /* renamed from: b  reason: collision with root package name */
    public s f4453b = null;

    /* renamed from: c  reason: collision with root package name */
    public Integer f4454c = null;

    public final d7 a() {
        s sVar;
        i7 i7Var = this.f4452a;
        if (i7Var == null || (sVar = this.f4453b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (i7Var.f4640c == sVar.f()) {
            h7 h7Var = h7.f4619d;
            if (!(i7Var.f4642e != h7Var) || this.f4454c != null) {
                h7 h7Var2 = this.f4452a.f4642e;
                if ((h7Var2 != h7Var) || this.f4454c == null) {
                    if (h7Var2 == h7Var) {
                        lh.a(new byte[0]);
                    } else if (h7Var2 == h7.f4618c) {
                        lh.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f4454c.intValue()).array());
                    } else if (h7Var2 == h7.f4617b) {
                        lh.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f4454c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f4452a.f4642e)));
                    }
                    return new d7();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
