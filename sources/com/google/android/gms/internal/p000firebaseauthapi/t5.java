package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t5  reason: invalid package */
public final class t5 {

    /* renamed from: a  reason: collision with root package name */
    public final tf f4942a;

    public t5(tf tfVar) {
        this.f4942a = tfVar;
    }

    public static t5 a(String str, byte[] bArr, int i8) {
        sf t2 = tf.t();
        t2.l(str);
        p1 p1Var = q1.f4830b;
        t2.m(q1.l(bArr, 0, bArr.length));
        int i10 = i8 - 1;
        t2.k(i10 != 0 ? i10 != 1 ? i10 != 2 ? mg.CRUNCHY : mg.RAW : mg.LEGACY : mg.TINK);
        return new t5((tf) t2.h());
    }
}
