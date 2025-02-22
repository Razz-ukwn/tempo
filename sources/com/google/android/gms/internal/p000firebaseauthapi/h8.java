package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.q;
import b2.c;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h8  reason: invalid package */
public final class h8 extends l6 {
    public static h8 o(i8 i8Var, s sVar, Integer num) {
        i8 i8Var2 = i8.f4645d;
        String str = i8Var.f4646a;
        if (i8Var != i8Var2 && num == null) {
            throw new GeneralSecurityException(c.a("For given Variant ", str, " the value of idRequirement must be non-null"));
        } else if (i8Var == i8Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (sVar.f() == 32) {
            if (i8Var == i8Var2) {
                lh.a(new byte[0]);
            } else if (i8Var == i8.f4644c) {
                lh.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (i8Var == i8.f4643b) {
                lh.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            return new h8();
        } else {
            throw new GeneralSecurityException(q.a("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", sVar.f()));
        }
    }
}
