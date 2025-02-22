package wg;

import gf.l;
import sf.j;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f16744a;

    /* renamed from: b  reason: collision with root package name */
    public int f16745b;

    /* renamed from: c  reason: collision with root package name */
    public int f16746c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16747d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16748e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f16749f;

    /* renamed from: g  reason: collision with root package name */
    public d0 f16750g;

    public d0() {
        this.f16744a = new byte[8192];
        this.f16748e = true;
        this.f16747d = false;
    }

    public final d0 a() {
        d0 d0Var = this.f16749f;
        if (d0Var == this) {
            d0Var = null;
        }
        d0 d0Var2 = this.f16750g;
        j.c(d0Var2);
        d0Var2.f16749f = this.f16749f;
        d0 d0Var3 = this.f16749f;
        j.c(d0Var3);
        d0Var3.f16750g = this.f16750g;
        this.f16749f = null;
        this.f16750g = null;
        return d0Var;
    }

    public final void b(d0 d0Var) {
        d0Var.f16750g = this;
        d0Var.f16749f = this.f16749f;
        d0 d0Var2 = this.f16749f;
        j.c(d0Var2);
        d0Var2.f16750g = d0Var;
        this.f16749f = d0Var;
    }

    public final d0 c() {
        this.f16747d = true;
        return new d0(this.f16744a, this.f16745b, this.f16746c, true);
    }

    public final void d(d0 d0Var, int i8) {
        if (d0Var.f16748e) {
            int i10 = d0Var.f16746c;
            int i11 = i10 + i8;
            byte[] bArr = d0Var.f16744a;
            if (i11 > 8192) {
                if (!d0Var.f16747d) {
                    int i12 = d0Var.f16745b;
                    if (i11 - i12 <= 8192) {
                        l.T(0, i12, i10, bArr, bArr);
                        d0Var.f16746c -= d0Var.f16745b;
                        d0Var.f16745b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i13 = d0Var.f16746c;
            int i14 = this.f16745b;
            l.T(i13, i14, i14 + i8, this.f16744a, bArr);
            d0Var.f16746c += i8;
            this.f16745b += i8;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public d0(byte[] bArr, int i8, int i10, boolean z10) {
        j.f(bArr, "data");
        this.f16744a = bArr;
        this.f16745b = i8;
        this.f16746c = i10;
        this.f16747d = z10;
        this.f16748e = false;
    }
}
