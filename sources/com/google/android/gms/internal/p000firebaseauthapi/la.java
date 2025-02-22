package com.google.android.gms.internal.p000firebaseauthapi;

import b2.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.la  reason: invalid package */
public final class la extends v9 {

    /* renamed from: a  reason: collision with root package name */
    public final char f4711a;

    public la(char c3) {
        this.f4711a = c3;
    }

    public final boolean a(char c3) {
        return c3 == this.f4711a;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i8 = this.f4711a;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i8 & 15);
            i8 >>= 4;
        }
        return c.a("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
