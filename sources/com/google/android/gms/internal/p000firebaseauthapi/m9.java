package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.compose.ui.platform.b3;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m9  reason: invalid package */
public final class m9 {
    public static void a(re reVar) {
        zg.g(c(reVar.x().y()));
        b(reVar.x().z());
        if (reVar.A() != 2) {
            i6.b(reVar.t().w());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String b(int i8) {
        int i10 = i8 - 2;
        if (i10 == 1) {
            return "HmacSha1";
        }
        if (i10 == 2) {
            return "HmacSha384";
        }
        if (i10 == 3) {
            return "HmacSha256";
        }
        if (i10 == 4) {
            return "HmacSha512";
        }
        if (i10 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(b3.b(i8))));
    }

    public static int c(int i8) {
        int i10 = i8 - 2;
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i8 != 1) {
            throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(i10)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int d(int i8) {
        int i10 = i8 - 2;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        if (i8 != 1) {
            throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(i10)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
