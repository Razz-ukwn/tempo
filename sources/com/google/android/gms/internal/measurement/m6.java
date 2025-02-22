package com.google.android.gms.internal.measurement;

import java.util.logging.Level;

public final class m6 extends o6 {
    public final byte[] B;
    public final int C;
    public int D;

    public m6(byte[] bArr, int i8) {
        super(0);
        int length = bArr.length;
        if (((length - i8) | i8) >= 0) {
            this.B = bArr;
            this.D = 0;
            this.C = i8;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i8)}));
    }

    public final void d(byte b10) {
        try {
            byte[] bArr = this.B;
            int i8 = this.D;
            this.D = i8 + 1;
            bArr[i8] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new n6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.D), Integer.valueOf(this.C), 1}), e10);
        }
    }

    public final void e(int i8, boolean z10) {
        p(i8 << 3);
        d(z10 ? (byte) 1 : 0);
    }

    public final void f(int i8, k6 k6Var) {
        p((i8 << 3) | 2);
        p(k6Var.c());
        k6Var.g(this);
    }

    public final void g(int i8, int i10) {
        p((i8 << 3) | 5);
        h(i10);
    }

    public final void h(int i8) {
        try {
            byte[] bArr = this.B;
            int i10 = this.D;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (i8 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i8 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i8 >> 16) & 255);
            this.D = i13 + 1;
            bArr[i13] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new n6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.D), Integer.valueOf(this.C), 1}), e10);
        }
    }

    public final void i(int i8, long j10) {
        p((i8 << 3) | 1);
        j(j10);
    }

    public final void j(long j10) {
        try {
            byte[] bArr = this.B;
            int i8 = this.D;
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
            this.D = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new n6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.D), Integer.valueOf(this.C), 1}), e10);
        }
    }

    public final void k(int i8, int i10) {
        p(i8 << 3);
        l(i10);
    }

    public final void l(int i8) {
        if (i8 >= 0) {
            p(i8);
        } else {
            r((long) i8);
        }
    }

    public final void m(int i8, String str) {
        p((i8 << 3) | 2);
        int i10 = this.D;
        try {
            int v3 = o6.v(str.length() * 3);
            int v10 = o6.v(str.length());
            int i11 = this.C;
            byte[] bArr = this.B;
            if (v10 == v3) {
                int i12 = i10 + v10;
                this.D = i12;
                int b10 = r9.b(str, bArr, i12, i11 - i12);
                this.D = i10;
                p((b10 - i10) - v10);
                this.D = b10;
                return;
            }
            p(r9.c(str));
            int i13 = this.D;
            this.D = r9.b(str, bArr, i13, i11 - i13);
        } catch (q9 e10) {
            this.D = i10;
            o6.f5446d.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e10);
            byte[] bytes = str.getBytes(m7.f5399a);
            try {
                int length = bytes.length;
                p(length);
                x(bytes, length);
            } catch (IndexOutOfBoundsException e11) {
                throw new n6(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new n6(e12);
        }
    }

    public final void n(int i8, int i10) {
        p((i8 << 3) | i10);
    }

    public final void o(int i8, int i10) {
        p(i8 << 3);
        p(i10);
    }

    public final void p(int i8) {
        while (true) {
            int i10 = i8 & -128;
            byte[] bArr = this.B;
            if (i10 == 0) {
                try {
                    int i11 = this.D;
                    this.D = i11 + 1;
                    bArr[i11] = (byte) i8;
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw new n6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.D), Integer.valueOf(this.C), 1}), e10);
                }
            } else {
                int i12 = this.D;
                this.D = i12 + 1;
                bArr[i12] = (byte) ((i8 & 127) | 128);
                i8 >>>= 7;
            }
        }
    }

    public final void q(int i8, long j10) {
        p(i8 << 3);
        r(j10);
    }

    public final void r(long j10) {
        boolean z10 = o6.f5447e;
        int i8 = this.C;
        byte[] bArr = this.B;
        if (!z10 || i8 - this.D < 10) {
            while ((j10 & -128) != 0) {
                int i10 = this.D;
                this.D = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            try {
                int i11 = this.D;
                this.D = i11 + 1;
                bArr[i11] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new n6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.D), Integer.valueOf(i8), 1}), e10);
            }
        } else {
            while ((j10 & -128) != 0) {
                int i12 = this.D;
                this.D = i12 + 1;
                long j11 = n9.f5423f + ((long) i12);
                n9.f5420c.d(bArr, j11, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i13 = this.D;
            this.D = i13 + 1;
            m9 m9Var = n9.f5420c;
            m9Var.d(bArr, n9.f5423f + ((long) i13), (byte) ((int) j10));
        }
    }

    public final void x(byte[] bArr, int i8) {
        try {
            System.arraycopy(bArr, 0, this.B, this.D, i8);
            this.D += i8;
        } catch (IndexOutOfBoundsException e10) {
            throw new n6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.D), Integer.valueOf(this.C), Integer.valueOf(i8)}), e10);
        }
    }
}
