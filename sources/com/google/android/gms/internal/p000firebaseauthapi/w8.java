package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w8  reason: invalid package */
public final class w8 {

    /* renamed from: a  reason: collision with root package name */
    public b9 f5046a = null;

    /* renamed from: b  reason: collision with root package name */
    public s f5047b = null;

    /* renamed from: c  reason: collision with root package name */
    public Integer f5048c = null;

    public final x8 a() {
        s sVar;
        b9 b9Var = this.f5046a;
        if (b9Var == null || (sVar = this.f5047b) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (b9Var.f4424c == sVar.f()) {
            a9 a9Var = a9.f4384d;
            if (!(b9Var.f4425d != a9Var) || this.f5048c != null) {
                a9 a9Var2 = this.f5046a.f4425d;
                if ((a9Var2 != a9Var) || this.f5048c == null) {
                    if (a9Var2 == a9Var) {
                        lh.a(new byte[0]);
                    } else if (a9Var2 == a9.f4383c) {
                        lh.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f5048c.intValue()).array());
                    } else if (a9Var2 == a9.f4382b) {
                        lh.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f5048c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(this.f5046a.f4425d)));
                    }
                    return new x8();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
