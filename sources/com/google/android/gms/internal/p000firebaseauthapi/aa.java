package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.z0;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.aa  reason: invalid package */
public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4386a = b(1, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4387b = b(2, 32);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4388c = b(2, 16);

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f4389d = b(2, 17);

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f4390e = b(2, 18);

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f4391f = b(2, 1);

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f4392g = b(2, 2);

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f4393h = b(2, 3);

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f4394i = b(2, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f4395j = b(2, 2);

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f4396k = b(2, 3);

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f4397l = new byte[0];
    public static final byte[] m;

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f4398n;

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f4399o;

    static {
        Charset charset = tb.f4952a;
        m = "KEM".getBytes(charset);
        f4398n = "HPKE".getBytes(charset);
        f4399o = "HPKE-v1".getBytes(charset);
    }

    public static void a(lf lfVar) {
        if (lfVar.y() == 2 || lfVar.y() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(gf.n(lfVar.y())));
        }
        String str = "UNRECOGNIZED";
        if (lfVar.x() == 2 || lfVar.x() == 1) {
            int x10 = lfVar.x();
            if (x10 == 2) {
                str = "KDF_UNKNOWN";
            } else if (x10 == 3) {
                str = "HKDF_SHA256";
            } else if (x10 == 4) {
                str = "HKDF_SHA384";
            } else if (x10 == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (lfVar.w() == 2 || lfVar.w() == 1) {
            int w10 = lfVar.w();
            if (w10 == 2) {
                str = "AEAD_UNKNOWN";
            } else if (w10 == 3) {
                str = "AES_128_GCM";
            } else if (w10 == 4) {
                str = "AES_256_GCM";
            } else if (w10 == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    public static byte[] b(int i8, int i10) {
        byte[] bArr = new byte[i8];
        for (int i11 = 0; i11 < i8; i11++) {
            bArr[i11] = (byte) ((i10 >> (((i8 - i11) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] c(String str, byte[] bArr, byte[] bArr2, int i8) {
        return z0.l(b(2, i8), f4399o, bArr2, str.getBytes(tb.f4952a), bArr);
    }
}
