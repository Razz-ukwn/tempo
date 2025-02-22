package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.q;
import b2.c;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v7  reason: invalid package */
public final class v7 extends l6 {
    public static v7 o(w7 w7Var, s sVar, Integer num) {
        w7 w7Var2 = w7.f5044d;
        String str = w7Var.f5045a;
        if (w7Var != w7Var2 && num == null) {
            throw new GeneralSecurityException(c.a("For given Variant ", str, " the value of idRequirement must be non-null"));
        } else if (w7Var == w7Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (sVar.f() == 32) {
            if (w7Var == w7Var2) {
                lh.a(new byte[0]);
            } else if (w7Var == w7.f5043c) {
                lh.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (w7Var == w7.f5042b) {
                lh.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            return new v7();
        } else {
            throw new GeneralSecurityException(q.a("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", sVar.f()));
        }
    }
}
