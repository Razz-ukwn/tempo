package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x1  reason: invalid package */
public final class x1 extends y1 {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5062d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5063e;

    /* renamed from: f  reason: collision with root package name */
    public int f5064f;

    /* renamed from: g  reason: collision with root package name */
    public final OutputStream f5065g;

    public x1(OutputStream outputStream, int i8) {
        super(0);
        if (i8 >= 0) {
            int max = Math.max(i8, 20);
            this.f5062d = new byte[max];
            this.f5063e = max;
            this.f5065g = outputStream;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final void A(int i8, long j10) {
        G(20);
        J(i8 << 3);
        K(j10);
    }

    public final void B(long j10) {
        G(10);
        K(j10);
    }

    public final void F() {
        this.f5065g.write(this.f5062d, 0, this.f5064f);
        this.f5064f = 0;
    }

    public final void G(int i8) {
        if (this.f5063e - this.f5064f < i8) {
            F();
        }
    }

    public final void H(int i8) {
        int i10 = this.f5064f;
        int i11 = i10 + 1;
        byte[] bArr = this.f5062d;
        bArr[i10] = (byte) (i8 & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i8 >> 8) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i8 >> 16) & 255);
        this.f5064f = i13 + 1;
        bArr[i13] = (byte) ((i8 >> 24) & 255);
    }

    public final void I(long j10) {
        int i8 = this.f5064f;
        int i10 = i8 + 1;
        byte[] bArr = this.f5062d;
        bArr[i8] = (byte) ((int) (j10 & 255));
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((int) ((j10 >> 8) & 255));
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((int) ((j10 >> 16) & 255));
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((int) (255 & (j10 >> 24)));
        int i14 = i13 + 1;
        bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
        this.f5064f = i16 + 1;
        bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
    }

    public final void J(int i8) {
        boolean z10 = y1.f5091c;
        byte[] bArr = this.f5062d;
        if (z10) {
            while ((i8 & -128) != 0) {
                int i10 = this.f5064f;
                this.f5064f = i10 + 1;
                u4.n(bArr, (long) i10, (byte) ((i8 & 127) | 128));
                i8 >>>= 7;
            }
            int i11 = this.f5064f;
            this.f5064f = i11 + 1;
            u4.n(bArr, (long) i11, (byte) i8);
            return;
        }
        while ((i8 & -128) != 0) {
            int i12 = this.f5064f;
            this.f5064f = i12 + 1;
            bArr[i12] = (byte) ((i8 & 127) | 128);
            i8 >>>= 7;
        }
        int i13 = this.f5064f;
        this.f5064f = i13 + 1;
        bArr[i13] = (byte) i8;
    }

    public final void K(long j10) {
        boolean z10 = y1.f5091c;
        byte[] bArr = this.f5062d;
        if (z10) {
            while ((j10 & -128) != 0) {
                int i8 = this.f5064f;
                this.f5064f = i8 + 1;
                u4.n(bArr, (long) i8, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i10 = this.f5064f;
            this.f5064f = i10 + 1;
            u4.n(bArr, (long) i10, (byte) ((int) j10));
            return;
        }
        while ((j10 & -128) != 0) {
            int i11 = this.f5064f;
            this.f5064f = i11 + 1;
            bArr[i11] = (byte) ((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        int i12 = this.f5064f;
        this.f5064f = i12 + 1;
        bArr[i12] = (byte) ((int) j10);
    }

    public final void L(byte[] bArr, int i8) {
        int i10 = this.f5064f;
        int i11 = this.f5063e;
        int i12 = i11 - i10;
        byte[] bArr2 = this.f5062d;
        if (i12 >= i8) {
            System.arraycopy(bArr, 0, bArr2, i10, i8);
            this.f5064f += i8;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i12);
        this.f5064f = i11;
        F();
        int i13 = i8 - i12;
        if (i13 <= i11) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f5064f = i13;
            return;
        }
        this.f5065g.write(bArr, i12, i13);
    }

    public final void a(byte[] bArr, int i8) {
        L(bArr, i8);
    }

    public final void m(byte b10) {
        if (this.f5064f == this.f5063e) {
            F();
        }
        int i8 = this.f5064f;
        this.f5064f = i8 + 1;
        this.f5062d[i8] = b10;
    }

    public final void n(int i8, boolean z10) {
        G(11);
        J(i8 << 3);
        int i10 = this.f5064f;
        this.f5064f = i10 + 1;
        this.f5062d[i10] = z10 ? (byte) 1 : 0;
    }

    public final void o(int i8, q1 q1Var) {
        z((i8 << 3) | 2);
        z(q1Var.c());
        q1Var.i(this);
    }

    public final void p(int i8, int i10) {
        G(14);
        J((i8 << 3) | 5);
        H(i10);
    }

    public final void q(int i8) {
        G(4);
        H(i8);
    }

    public final void r(int i8, long j10) {
        G(18);
        J((i8 << 3) | 1);
        I(j10);
    }

    public final void s(long j10) {
        G(8);
        I(j10);
    }

    public final void t(int i8, int i10) {
        G(20);
        J(i8 << 3);
        if (i10 >= 0) {
            J(i10);
        } else {
            K((long) i10);
        }
    }

    public final void u(int i8) {
        if (i8 >= 0) {
            z(i8);
        } else {
            B((long) i8);
        }
    }

    public final void v(int i8, o3 o3Var, z3 z3Var) {
        z((i8 << 3) | 2);
        z(((e1) o3Var).c(z3Var));
        z3Var.c(o3Var, this.f5092a);
    }

    public final void w(int i8, String str) {
        int i10;
        z((i8 << 3) | 2);
        try {
            int length = str.length() * 3;
            int j10 = y1.j(length);
            int i11 = j10 + length;
            int i12 = this.f5063e;
            if (i11 > i12) {
                byte[] bArr = new byte[length];
                int b10 = y4.b(str, bArr, 0, length);
                z(b10);
                L(bArr, b10);
                return;
            }
            if (i11 > i12 - this.f5064f) {
                F();
            }
            int j11 = y1.j(str.length());
            i10 = this.f5064f;
            byte[] bArr2 = this.f5062d;
            if (j11 == j10) {
                int i13 = i10 + j11;
                this.f5064f = i13;
                int b11 = y4.b(str, bArr2, i13, i12 - i13);
                this.f5064f = i10;
                J((b11 - i10) - j11);
                this.f5064f = b11;
                return;
            }
            int c3 = y4.c(str);
            J(c3);
            this.f5064f = y4.b(str, bArr2, this.f5064f, c3);
        } catch (x4 e10) {
            this.f5064f = i10;
            throw e10;
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw new w1(e11);
        } catch (x4 e12) {
            l(str, e12);
        }
    }

    public final void x(int i8, int i10) {
        z((i8 << 3) | i10);
    }

    public final void y(int i8, int i10) {
        G(20);
        J(i8 << 3);
        J(i10);
    }

    public final void z(int i8) {
        G(5);
        J(i8);
    }
}
