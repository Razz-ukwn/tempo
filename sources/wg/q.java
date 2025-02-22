package wg;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import sf.j;

public final class q implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public byte f16791a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f16792b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f16793c;

    /* renamed from: d  reason: collision with root package name */
    public final r f16794d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f16795e = new CRC32();

    public q(i0 i0Var) {
        j.f(i0Var, "source");
        c0 c0Var = new c0(i0Var);
        this.f16792b = c0Var;
        Inflater inflater = new Inflater(true);
        this.f16793c = inflater;
        this.f16794d = new r(c0Var, inflater);
    }

    public static void c(int i8, int i10, String str) {
        if (i10 != i8) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i8)}, 3));
            j.e(format, "format(this, *args)");
            throw new IOException(format);
        }
    }

    public final long a0(e eVar, long j10) {
        c0 c0Var;
        e eVar2;
        long j11;
        e eVar3 = eVar;
        long j12 = j10;
        j.f(eVar3, "sink");
        int i8 = (j12 > 0 ? 1 : (j12 == 0 ? 0 : -1));
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j12).toString());
        } else if (i8 == 0) {
            return 0;
        } else {
            byte b10 = this.f16791a;
            CRC32 crc32 = this.f16795e;
            c0 c0Var2 = this.f16792b;
            if (b10 == 0) {
                c0Var2.z0(10);
                e eVar4 = c0Var2.f16741b;
                byte z10 = eVar4.z(3);
                boolean z11 = ((z10 >> 1) & 1) == 1;
                if (z11) {
                    eVar2 = eVar4;
                    d(0, 10, c0Var2.f16741b);
                } else {
                    eVar2 = eVar4;
                }
                c(8075, c0Var2.readShort(), "ID1ID2");
                c0Var2.skip(8);
                if (((z10 >> 2) & 1) == 1) {
                    c0Var2.z0(2);
                    if (z11) {
                        d(0, 2, c0Var2.f16741b);
                    }
                    long R = (long) eVar2.R();
                    c0Var2.z0(R);
                    if (z11) {
                        d(0, R, c0Var2.f16741b);
                        j11 = R;
                    } else {
                        j11 = R;
                    }
                    c0Var2.skip(j11);
                }
                if (((z10 >> 3) & 1) == 1) {
                    c0 c0Var3 = c0Var2;
                    long c3 = c0Var2.c((byte) 0, 0, Long.MAX_VALUE);
                    if (c3 != -1) {
                        if (z11) {
                            c0Var = c0Var3;
                            d(0, c3 + 1, c0Var3.f16741b);
                        } else {
                            c0Var = c0Var3;
                        }
                        c0Var.skip(c3 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    c0Var = c0Var2;
                }
                if (((z10 >> 4) & 1) == 1) {
                    long c10 = c0Var.c((byte) 0, 0, Long.MAX_VALUE);
                    if (c10 != -1) {
                        if (z11) {
                            d(0, c10 + 1, c0Var.f16741b);
                        }
                        c0Var.skip(c10 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z11) {
                    c(c0Var.d(), (short) ((int) crc32.getValue()), "FHCRC");
                    crc32.reset();
                }
                this.f16791a = 1;
            } else {
                c0Var = c0Var2;
            }
            if (this.f16791a == 1) {
                long j13 = eVar3.f16752b;
                long a02 = this.f16794d.a0(eVar3, j12);
                if (a02 != -1) {
                    d(j13, a02, eVar);
                    return a02;
                }
                this.f16791a = 2;
            }
            if (this.f16791a == 2) {
                c(c0Var.l0(), (int) crc32.getValue(), "CRC");
                c(c0Var.l0(), (int) this.f16793c.getBytesWritten(), "ISIZE");
                this.f16791a = 3;
                if (!c0Var.y()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final j0 b() {
        return this.f16792b.b();
    }

    public final void close() {
        this.f16794d.close();
    }

    public final void d(long j10, long j11, e eVar) {
        d0 d0Var = eVar.f16751a;
        j.c(d0Var);
        while (true) {
            int i8 = d0Var.f16746c;
            int i10 = d0Var.f16745b;
            if (j10 < ((long) (i8 - i10))) {
                break;
            }
            j10 -= (long) (i8 - i10);
            d0Var = d0Var.f16749f;
            j.c(d0Var);
        }
        while (j11 > 0) {
            int i11 = (int) (((long) d0Var.f16745b) + j10);
            int min = (int) Math.min((long) (d0Var.f16746c - i11), j11);
            this.f16795e.update(d0Var.f16744a, i11, min);
            j11 -= (long) min;
            d0Var = d0Var.f16749f;
            j.c(d0Var);
            j10 = 0;
        }
    }
}
