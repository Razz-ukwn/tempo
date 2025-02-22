package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v1  reason: invalid package */
public final class v1 extends y1 {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5006d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5007e;

    /* renamed from: f  reason: collision with root package name */
    public int f5008f;

    public v1(byte[] bArr, int i8) {
        super(0);
        int length = bArr.length;
        if (((length - i8) | i8) >= 0) {
            this.f5006d = bArr;
            this.f5008f = 0;
            this.f5007e = i8;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i8)}));
    }

    public final void A(int i8, long j10) {
        z(i8 << 3);
        B(j10);
    }

    public final void B(long j10) {
        boolean z10 = y1.f5091c;
        int i8 = this.f5007e;
        byte[] bArr = this.f5006d;
        if (!z10 || i8 - this.f5008f < 10) {
            while ((j10 & -128) != 0) {
                int i10 = this.f5008f;
                this.f5008f = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            try {
                int i11 = this.f5008f;
                this.f5008f = i11 + 1;
                bArr[i11] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new w1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5008f), Integer.valueOf(i8), 1}), e10);
            }
        } else {
            while ((j10 & -128) != 0) {
                int i12 = this.f5008f;
                this.f5008f = i12 + 1;
                u4.n(bArr, (long) i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i13 = this.f5008f;
            this.f5008f = i13 + 1;
            u4.n(bArr, (long) i13, (byte) ((int) j10));
        }
    }

    public final void a(byte[] bArr, int i8) {
        try {
            System.arraycopy(bArr, 0, this.f5006d, this.f5008f, i8);
            this.f5008f += i8;
        } catch (IndexOutOfBoundsException e10) {
            throw new w1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5008f), Integer.valueOf(this.f5007e), Integer.valueOf(i8)}), e10);
        }
    }

    public final void m(byte b10) {
        try {
            byte[] bArr = this.f5006d;
            int i8 = this.f5008f;
            this.f5008f = i8 + 1;
            bArr[i8] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new w1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5008f), Integer.valueOf(this.f5007e), 1}), e10);
        }
    }

    public final void n(int i8, boolean z10) {
        z(i8 << 3);
        m(z10 ? (byte) 1 : 0);
    }

    public final void o(int i8, q1 q1Var) {
        z((i8 << 3) | 2);
        z(q1Var.c());
        q1Var.i(this);
    }

    public final void p(int i8, int i10) {
        z((i8 << 3) | 5);
        q(i10);
    }

    public final void q(int i8) {
        try {
            byte[] bArr = this.f5006d;
            int i10 = this.f5008f;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (i8 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i8 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i8 >> 16) & 255);
            this.f5008f = i13 + 1;
            bArr[i13] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new w1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5008f), Integer.valueOf(this.f5007e), 1}), e10);
        }
    }

    public final void r(int i8, long j10) {
        z((i8 << 3) | 1);
        s(j10);
    }

    public final void s(long j10) {
        try {
            byte[] bArr = this.f5006d;
            int i8 = this.f5008f;
            int i10 = i8 + 1;
            bArr[i8] = (byte) (((int) j10) & 255);
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) (j10 >> 8)) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 16)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 24)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
            this.f5008f = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new w1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5008f), Integer.valueOf(this.f5007e), 1}), e10);
        }
    }

    public final void t(int i8, int i10) {
        z(i8 << 3);
        u(i10);
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
        z((i8 << 3) | 2);
        int i10 = this.f5008f;
        try {
            int j10 = y1.j(str.length() * 3);
            int j11 = y1.j(str.length());
            int i11 = this.f5007e;
            byte[] bArr = this.f5006d;
            if (j11 == j10) {
                int i12 = i10 + j11;
                this.f5008f = i12;
                int b10 = y4.b(str, bArr, i12, i11 - i12);
                this.f5008f = i10;
                z((b10 - i10) - j11);
                this.f5008f = b10;
                return;
            }
            z(y4.c(str));
            int i13 = this.f5008f;
            this.f5008f = y4.b(str, bArr, i13, i11 - i13);
        } catch (x4 e10) {
            this.f5008f = i10;
            l(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new w1(e11);
        }
    }

    public final void x(int i8, int i10) {
        z((i8 << 3) | i10);
    }

    public final void y(int i8, int i10) {
        z(i8 << 3);
        z(i10);
    }

    public final void z(int i8) {
        while (true) {
            int i10 = i8 & -128;
            byte[] bArr = this.f5006d;
            if (i10 == 0) {
                try {
                    int i11 = this.f5008f;
                    this.f5008f = i11 + 1;
                    bArr[i11] = (byte) i8;
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw new w1(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5008f), Integer.valueOf(this.f5007e), 1}), e10);
                }
            } else {
                int i12 = this.f5008f;
                this.f5008f = i12 + 1;
                bArr[i12] = (byte) ((i8 & 127) | 128);
                i8 >>>= 7;
            }
        }
    }
}
