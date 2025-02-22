package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.activity.result.d;
import androidx.fragment.app.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n1  reason: invalid package */
public final class n1 extends p1 {

    /* renamed from: d  reason: collision with root package name */
    public final int f4747d;

    public n1(byte[] bArr, int i8) {
        super(bArr);
        q1.k(0, i8, bArr.length);
        this.f4747d = i8;
    }

    public final byte a(int i8) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
        int i10 = this.f4747d;
        if (((i10 - (i8 + 1)) | i8) >= 0) {
            return this.f4803c[i8];
        }
        if (i8 < 0) {
            String a10 = q.a("Index < 0: ", i8);
            throw arrayIndexOutOfBoundsException;
        }
        arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(d.a("Index > length: ", i8, ", ", i10));
        throw arrayIndexOutOfBoundsException;
    }

    public final byte b(int i8) {
        return this.f4803c[i8];
    }

    public final int c() {
        return this.f4747d;
    }

    public final void d(byte[] bArr, int i8) {
        System.arraycopy(this.f4803c, 0, bArr, 0, i8);
    }

    public final void o() {
    }
}
