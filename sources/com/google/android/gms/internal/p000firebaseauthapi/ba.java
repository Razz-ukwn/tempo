package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.z0;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ba  reason: invalid package */
public final class ba implements u9 {

    /* renamed from: a  reason: collision with root package name */
    public final q9 f4426a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4427b;

    public ba(q9 q9Var, int i8) {
        this.f4426a = q9Var;
        this.f4427b = i8;
    }

    public static ba a(int i8) {
        int i10 = i8 - 1;
        return i10 != 0 ? i10 != 1 ? new ba(new q9("HmacSha512"), 3) : new ba(new q9("HmacSha384"), 2) : new ba(new q9("HmacSha256"), 1);
    }

    public final byte[] c(byte[] bArr, w9 w9Var) {
        byte[] bArr2 = w9Var.zza().f4722a;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        int i8 = this.f4427b;
        byte[] d10 = zg.d(zg.e(bArr3, i8), zg.f(zg.g(i8), 1, bArr));
        byte[] bArr4 = w9Var.zzb().f4722a;
        int length2 = bArr4.length;
        byte[] bArr5 = new byte[length2];
        System.arraycopy(bArr4, 0, bArr5, 0, length2);
        byte[] l10 = z0.l(bArr, bArr5);
        byte[] l11 = z0.l(aa.m, zzb());
        q9 q9Var = this.f4426a;
        int macLength = Mac.getInstance(q9Var.f4842a).getMacLength();
        return q9Var.b(q9Var.c(z0.l(aa.f4399o, l11, "eae_prk".getBytes(tb.f4952a), d10), (byte[]) null), aa.c("shared_secret", l10, l11, macLength), macLength);
    }

    public final byte[] zzb() {
        int i8 = this.f4427b - 1;
        return i8 != 0 ? i8 != 1 ? aa.f4390e : aa.f4389d : aa.f4388c;
    }
}
