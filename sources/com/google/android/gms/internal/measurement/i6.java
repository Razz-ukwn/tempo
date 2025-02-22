package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import java.nio.charset.Charset;

public class i6 extends h6 {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5326c;

    public i6(byte[] bArr) {
        bArr.getClass();
        this.f5326c = bArr;
    }

    public byte a(int i8) {
        return this.f5326c[i8];
    }

    public byte b(int i8) {
        return this.f5326c[i8];
    }

    public int c() {
        return this.f5326c.length;
    }

    public final int d(int i8, int i10) {
        Charset charset = m7.f5399a;
        for (int i11 = 0; i11 < i10; i11++) {
            i8 = (i8 * 31) + this.f5326c[i11];
        }
        return i8;
    }

    public final i6 e() {
        int i8 = k6.i(0, 47, c());
        return i8 == 0 ? k6.f5359b : new g6(this.f5326c, i8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k6) || c() != ((k6) obj).c()) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return obj.equals(this);
        }
        i6 i6Var = (i6) obj;
        int i8 = this.f5360a;
        int i10 = i6Var.f5360a;
        if (i8 != 0 && i10 != 0 && i8 != i10) {
            return false;
        }
        int c3 = c();
        if (c3 > i6Var.c()) {
            throw new IllegalArgumentException("Length too large: " + c3 + c());
        } else if (c3 <= i6Var.c()) {
            i6Var.k();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c3) {
                if (this.f5326c[i11] != i6Var.f5326c[i12]) {
                    return false;
                }
                i11++;
                i12++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(d.a("Ran off end of other: 0, ", c3, ", ", i6Var.c()));
        }
    }

    public final String f(Charset charset) {
        return new String(this.f5326c, 0, c(), charset);
    }

    public final void g(o6 o6Var) {
        ((m6) o6Var).x(this.f5326c, c());
    }

    public final boolean h() {
        return r9.d(this.f5326c, 0, c());
    }

    public void k() {
    }
}
