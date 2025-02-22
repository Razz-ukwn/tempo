package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gc  reason: invalid package */
public final class gc {

    /* renamed from: a  reason: collision with root package name */
    public mc f4579a = null;

    /* renamed from: b  reason: collision with root package name */
    public s f4580b = null;

    /* renamed from: c  reason: collision with root package name */
    public Integer f4581c = null;

    public final hc a() {
        s sVar;
        lh lhVar;
        mc mcVar = this.f4579a;
        if (mcVar == null || (sVar = this.f4580b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (mcVar.f4739c == sVar.f()) {
            lc lcVar = lc.f4720e;
            if (!(mcVar.f4741e != lcVar) || this.f4581c != null) {
                lc lcVar2 = this.f4579a.f4741e;
                if ((lcVar2 != lcVar) || this.f4581c == null) {
                    if (lcVar2 == lcVar) {
                        lhVar = lh.a(new byte[0]);
                    } else if (lcVar2 == lc.f4719d || lcVar2 == lc.f4718c) {
                        lhVar = lh.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f4581c.intValue()).array());
                    } else if (lcVar2 == lc.f4717b) {
                        lhVar = lh.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f4581c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f4579a.f4741e)));
                    }
                    return new hc(this.f4579a, lhVar);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
