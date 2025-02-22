package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.tb  reason: invalid package */
public final class tb {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f4952a = Charset.forName("UTF-8");

    public static int a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b10 = 0;
        while (b10 == 0) {
            secureRandom.nextBytes(bArr);
            b10 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b10;
    }

    public static final lh b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (charAt < '!' || charAt > '~') {
                throw new sb("Not a printable ASCII character: " + charAt);
            }
            bArr[i8] = (byte) charAt;
        }
        return lh.a(bArr);
    }
}
