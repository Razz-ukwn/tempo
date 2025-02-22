package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.z0;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t9  reason: invalid package */
public final class t9 implements k5 {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f4946f = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final w9 f4947a;

    /* renamed from: b  reason: collision with root package name */
    public final u9 f4948b;

    /* renamed from: c  reason: collision with root package name */
    public final r9 f4949c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4950d;

    /* renamed from: e  reason: collision with root package name */
    public final q9 f4951e;

    public t9(w9 w9Var, u9 u9Var, q9 q9Var, r9 r9Var, int i8) {
        this.f4947a = w9Var;
        this.f4948b = u9Var;
        this.f4951e = q9Var;
        this.f4949c = r9Var;
        this.f4950d = i8;
    }

    public final byte[] zza(byte[] bArr) {
        byte[] m;
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int i8 = this.f4950d;
        if (length >= i8) {
            byte[] copyOf = Arrays.copyOf(bArr2, i8);
            byte[] copyOfRange = Arrays.copyOfRange(bArr2, this.f4950d, length);
            w9 w9Var = this.f4947a;
            u9 u9Var = this.f4948b;
            q9 q9Var = this.f4951e;
            r9 r9Var = this.f4949c;
            byte[] c3 = u9Var.c(copyOf, w9Var);
            byte[] l10 = z0.l(aa.f4398n, u9Var.zzb(), q9Var.a(), r9Var.zzb());
            byte[] bArr3 = aa.f4397l;
            byte[] bArr4 = s9.f4910d;
            byte[] bArr5 = aa.f4399o;
            Charset charset = tb.f4952a;
            byte[] l11 = z0.l(aa.f4386a, q9Var.c(z0.l(bArr5, l10, "psk_id_hash".getBytes(charset), bArr4), bArr3), q9Var.c(z0.l(bArr5, l10, "info_hash".getBytes(charset), new byte[0]), bArr3));
            byte[] c10 = q9Var.c(z0.l(bArr5, l10, "secret".getBytes(charset), bArr4), c3);
            int zza = r9Var.zza();
            byte[] b10 = q9Var.b(c10, aa.c("key", l11, l10, zza), zza);
            byte[] b11 = q9Var.b(c10, aa.c("base_nonce", l11, l10, 12), 12);
            BigInteger bigInteger = BigInteger.ONE;
            s9 s9Var = new s9(b10, b11, bigInteger.shiftLeft(96).subtract(bigInteger), r9Var);
            byte[] bArr6 = f4946f;
            synchronized (s9Var) {
                BigInteger bigInteger2 = s9Var.f4913c;
                if (bigInteger2.signum() != -1) {
                    byte[] byteArray = bigInteger2.toByteArray();
                    int length2 = byteArray.length;
                    if (length2 != 12) {
                        if (length2 > 13) {
                            throw new GeneralSecurityException("integer too large");
                        } else if (length2 != 13) {
                            byte[] bArr7 = new byte[12];
                            System.arraycopy(byteArray, 0, bArr7, 12 - length2, length2);
                            byteArray = bArr7;
                        } else if (byteArray[0] == 0) {
                            byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                        } else {
                            throw new GeneralSecurityException("integer too large");
                        }
                    }
                    m = z0.m(b11, byteArray);
                    if (s9Var.f4913c.compareTo(s9Var.f4912b) < 0) {
                        s9Var.f4913c = s9Var.f4913c.add(bigInteger);
                    } else {
                        throw new GeneralSecurityException("message limit reached");
                    }
                } else {
                    throw new IllegalArgumentException("integer must be nonnegative");
                }
            }
            return s9Var.f4911a.a(b10, m, copyOfRange, bArr6);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
