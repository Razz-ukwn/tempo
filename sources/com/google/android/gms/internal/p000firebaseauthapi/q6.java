package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q6  reason: invalid package */
public final class q6 {

    /* renamed from: a  reason: collision with root package name */
    public y6 f4835a = null;

    /* renamed from: b  reason: collision with root package name */
    public s f4836b = null;

    /* renamed from: c  reason: collision with root package name */
    public s f4837c = null;

    /* renamed from: d  reason: collision with root package name */
    public Integer f4838d = null;

    public final r6 a() {
        y6 y6Var = this.f4835a;
        if (y6Var != null) {
            s sVar = this.f4836b;
            if (sVar == null || this.f4837c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (y6Var.f5100c == sVar.f()) {
                if (y6Var.f5101d == this.f4837c.f()) {
                    y6 y6Var2 = this.f4835a;
                    x6 x6Var = x6.f5077d;
                    x6 x6Var2 = y6Var2.B;
                    if (!(x6Var2 != x6Var) || this.f4838d != null) {
                        if ((x6Var2 != x6Var) || this.f4838d == null) {
                            if (x6Var2 == x6Var) {
                                lh.a(new byte[0]);
                            } else if (x6Var2 == x6.f5076c) {
                                lh.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f4838d.intValue()).array());
                            } else if (x6Var2 == x6.f5075b) {
                                lh.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f4838d.intValue()).array());
                            } else {
                                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f4835a.B)));
                            }
                            return new r6();
                        }
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            throw new GeneralSecurityException("AES key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }
}
