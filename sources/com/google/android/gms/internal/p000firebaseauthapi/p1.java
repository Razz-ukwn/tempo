package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.activity.result.d;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p1  reason: invalid package */
public class p1 extends o1 {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f4803c;

    public p1(byte[] bArr) {
        bArr.getClass();
        this.f4803c = bArr;
    }

    public byte a(int i8) {
        return this.f4803c[i8];
    }

    public byte b(int i8) {
        return this.f4803c[i8];
    }

    public int c() {
        return this.f4803c.length;
    }

    public void d(byte[] bArr, int i8) {
        System.arraycopy(this.f4803c, 0, bArr, 0, i8);
    }

    public final int e(int i8, int i10) {
        Charset charset = u2.f4974a;
        for (int i11 = 0; i11 < i10; i11++) {
            i8 = (i8 * 31) + this.f4803c[i11];
        }
        return i8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q1) || c() != ((q1) obj).c()) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return obj.equals(this);
        }
        p1 p1Var = (p1) obj;
        int i8 = this.f4831a;
        int i10 = p1Var.f4831a;
        if (i8 != 0 && i10 != 0 && i8 != i10) {
            return false;
        }
        int c3 = c();
        if (c3 > p1Var.c()) {
            throw new IllegalArgumentException("Length too large: " + c3 + c());
        } else if (c3 <= p1Var.c()) {
            p1Var.o();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c3) {
                if (this.f4803c[i11] != p1Var.f4803c[i12]) {
                    return false;
                }
                i11++;
                i12++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(d.a("Ran off end of other: 0, ", c3, ", ", p1Var.c()));
        }
    }

    public final p1 f() {
        int k10 = q1.k(0, 47, c());
        return k10 == 0 ? q1.f4830b : new n1(this.f4803c, k10);
    }

    public final r1 g() {
        int c3 = c();
        r1 r1Var = new r1(this.f4803c, c3);
        try {
            r1Var.j(c3);
            return r1Var;
        } catch (w2 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final String h(Charset charset) {
        return new String(this.f4803c, 0, c(), charset);
    }

    public final void i(y1 y1Var) {
        y1Var.a(this.f4803c, c());
    }

    public final boolean j() {
        return y4.e(this.f4803c, 0, c());
    }

    public void o() {
    }
}
