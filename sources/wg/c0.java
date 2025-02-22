package wg;

import ag.d;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import sf.j;

public final class c0 implements h {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f16740a;

    /* renamed from: b  reason: collision with root package name */
    public final e f16741b = new e();

    /* renamed from: c  reason: collision with root package name */
    public boolean f16742c;

    public c0(i0 i0Var) {
        j.f(i0Var, "source");
        this.f16740a = i0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long C0() {
        /*
            r6 = this;
            r0 = 1
            r6.z0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.c0(r2)
            wg.e r3 = r6.f16741b
            if (r2 == 0) goto L_0x0057
            long r4 = (long) r0
            byte r2 = r3.z(r4)
            r4 = 48
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0020
            r4 = 57
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x0020:
            r4 = 97
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x002a
            r4 = 102(0x66, float:1.43E-43)
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x002a:
            r4 = 65
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0037
            r4 = 70
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0057
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            cb.b.s(r1)
            cb.b.s(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            sf.j.e(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0057:
            long r0 = r3.C0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.c0.C0():long");
    }

    public final InputStream D0() {
        return new a(this);
    }

    public final String G(long j10) {
        long j11 = j10;
        if (j11 >= 0) {
            long j12 = j11 == Long.MAX_VALUE ? Long.MAX_VALUE : j11 + 1;
            byte b10 = (byte) 10;
            long c3 = c(b10, 0, j12);
            int i8 = (c3 > -1 ? 1 : (c3 == -1 ? 0 : -1));
            e eVar = this.f16741b;
            if (i8 != 0) {
                return xg.j.a(eVar, c3);
            }
            if (j12 < Long.MAX_VALUE && c0(j12) && eVar.z(j12 - 1) == ((byte) 13) && c0(1 + j12) && eVar.z(j12) == b10) {
                return xg.j.a(eVar, j12);
            }
            e eVar2 = new e();
            eVar.u(0, Math.min((long) 32, eVar.f16752b), eVar2);
            throw new EOFException("\\n not found: limit=" + Math.min(eVar.f16752b, j11) + " content=" + eVar2.Q().e() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j11).toString());
    }

    public final String P(Charset charset) {
        e eVar = this.f16741b;
        eVar.x(this.f16740a);
        return eVar.T(eVar.f16752b, charset);
    }

    public final e a() {
        return this.f16741b;
    }

    public final long a0(e eVar, long j10) {
        j.f(eVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!this.f16742c) {
            e eVar2 = this.f16741b;
            if (eVar2.f16752b == 0 && this.f16740a.a0(eVar2, 8192) == -1) {
                return -1;
            }
            return eVar2.a0(eVar, Math.min(j10, eVar2.f16752b));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final j0 b() {
        return this.f16740a.b();
    }

    public final long c(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f16742c) {
            long j12 = 0;
            if (0 > j11) {
                z10 = false;
            }
            if (z10) {
                while (j12 < j11) {
                    long D = this.f16741b.D(b10, j12, j11);
                    if (D != -1) {
                        return D;
                    }
                    e eVar = this.f16741b;
                    long j13 = eVar.f16752b;
                    if (j13 >= j11 || this.f16740a.a0(eVar, 8192) == -1) {
                        return -1;
                    }
                    j12 = Math.max(j12, j13);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean c0(long j10) {
        e eVar;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!this.f16742c) {
            do {
                eVar = this.f16741b;
                if (eVar.f16752b >= j10) {
                    return true;
                }
            } while (this.f16740a.a0(eVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void close() {
        if (!this.f16742c) {
            this.f16742c = true;
            this.f16740a.close();
            this.f16741b.j();
        }
    }

    public final short d() {
        z0(2);
        return this.f16741b.R();
    }

    public final String e(long j10) {
        z0(j10);
        return this.f16741b.Y(j10);
    }

    public final boolean isOpen() {
        return !this.f16742c;
    }

    public final String j0() {
        return G(Long.MAX_VALUE);
    }

    public final i k(long j10) {
        z0(j10);
        return this.f16741b.k(j10);
    }

    public final int l0() {
        z0(4);
        return this.f16741b.l0();
    }

    public final long r(g gVar) {
        e eVar;
        long j10 = 0;
        while (true) {
            i0 i0Var = this.f16740a;
            eVar = this.f16741b;
            if (i0Var.a0(eVar, 8192) == -1) {
                break;
            }
            long q10 = eVar.q();
            if (q10 > 0) {
                j10 += q10;
                gVar.B(eVar, q10);
            }
        }
        long j11 = eVar.f16752b;
        if (j11 <= 0) {
            return j10;
        }
        long j12 = j10 + j11;
        gVar.B(eVar, j11);
        return j12;
    }

    public final int read(ByteBuffer byteBuffer) {
        j.f(byteBuffer, "sink");
        e eVar = this.f16741b;
        if (eVar.f16752b == 0 && this.f16740a.a0(eVar, 8192) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    public final byte readByte() {
        z0(1);
        return this.f16741b.readByte();
    }

    public final int readInt() {
        z0(4);
        return this.f16741b.readInt();
    }

    public final short readShort() {
        z0(2);
        return this.f16741b.readShort();
    }

    public final void skip(long j10) {
        if (!this.f16742c) {
            while (j10 > 0) {
                e eVar = this.f16741b;
                if (eVar.f16752b == 0 && this.f16740a.a0(eVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, eVar.f16752b);
                eVar.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long t0() {
        z0(8);
        return this.f16741b.t0();
    }

    public final String toString() {
        return "buffer(" + this.f16740a + ')';
    }

    public final int w(x xVar) {
        j.f(xVar, "options");
        if (!this.f16742c) {
            while (true) {
                e eVar = this.f16741b;
                int b10 = xg.j.b(eVar, xVar, true);
                if (b10 == -2) {
                    if (this.f16740a.a0(eVar, 8192) == -1) {
                        break;
                    }
                } else if (b10 != -1) {
                    eVar.skip((long) xVar.f16804a[b10].d());
                    return b10;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean y() {
        if (!this.f16742c) {
            e eVar = this.f16741b;
            return eVar.y() && this.f16740a.a0(eVar, 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void z0(long j10) {
        if (!c0(j10)) {
            throw new EOFException();
        }
    }

    public static final class a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f16743a;

        public a(c0 c0Var) {
            this.f16743a = c0Var;
        }

        public final int available() {
            c0 c0Var = this.f16743a;
            if (!c0Var.f16742c) {
                return (int) Math.min(c0Var.f16741b.f16752b, (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public final void close() {
            this.f16743a.close();
        }

        public final int read() {
            c0 c0Var = this.f16743a;
            if (!c0Var.f16742c) {
                e eVar = c0Var.f16741b;
                if (eVar.f16752b == 0 && c0Var.f16740a.a0(eVar, 8192) == -1) {
                    return -1;
                }
                return c0Var.f16741b.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return this.f16743a + ".inputStream()";
        }

        public final int read(byte[] bArr, int i8, int i10) {
            j.f(bArr, "data");
            c0 c0Var = this.f16743a;
            if (!c0Var.f16742c) {
                d.d((long) bArr.length, (long) i8, (long) i10);
                e eVar = c0Var.f16741b;
                if (eVar.f16752b == 0 && c0Var.f16740a.a0(eVar, 8192) == -1) {
                    return -1;
                }
                return c0Var.f16741b.read(bArr, i8, i10);
            }
            throw new IOException("closed");
        }
    }
}
