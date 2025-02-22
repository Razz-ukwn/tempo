package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ub  reason: invalid package */
public final class ub {

    /* renamed from: a  reason: collision with root package name */
    public bc f4992a = null;

    /* renamed from: b  reason: collision with root package name */
    public s f4993b = null;

    /* renamed from: c  reason: collision with root package name */
    public Integer f4994c = null;

    public final wb a() {
        s sVar;
        lh lhVar;
        bc bcVar = this.f4992a;
        if (bcVar == null || (sVar = this.f4993b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (bcVar.f4430c == sVar.f()) {
            ac acVar = ac.f4403e;
            if (!(bcVar.f4432e != acVar) || this.f4994c != null) {
                ac acVar2 = this.f4992a.f4432e;
                if ((acVar2 != acVar) || this.f4994c == null) {
                    if (acVar2 == acVar) {
                        lhVar = lh.a(new byte[0]);
                    } else if (acVar2 == ac.f4402d || acVar2 == ac.f4401c) {
                        lhVar = lh.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f4994c.intValue()).array());
                    } else if (acVar2 == ac.f4400b) {
                        lhVar = lh.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f4994c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f4992a.f4432e)));
                    }
                    return new wb(this.f4992a, lhVar);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
