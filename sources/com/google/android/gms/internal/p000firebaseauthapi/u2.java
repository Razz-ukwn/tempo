package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u2  reason: invalid package */
public final class u2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f4974a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4975b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4975b = bArr;
        ByteBuffer.wrap(bArr);
        int i8 = 0 + 0;
        if (i8 < 0) {
            throw w2.e();
        } else if (i8 > Integer.MAX_VALUE) {
            try {
                throw w2.f();
            } catch (w2 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }
}
