package wg;

import ag.d;
import androidx.appcompat.widget.a1;
import androidx.fragment.app.q;
import cb.b;
import com.google.android.recaptcha.RecaptchaDefinitions;
import gf.l;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import sf.j;

public final class e implements h, g, Cloneable, ByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public d0 f16751a;

    /* renamed from: b  reason: collision with root package name */
    public long f16752b;

    public final void B(e eVar, long j10) {
        int i8;
        d0 d0Var;
        j.f(eVar, "source");
        if (eVar != this) {
            d.d(eVar.f16752b, 0, j10);
            while (j10 > 0) {
                d0 d0Var2 = eVar.f16751a;
                j.c(d0Var2);
                int i10 = d0Var2.f16746c;
                d0 d0Var3 = eVar.f16751a;
                j.c(d0Var3);
                if (j10 < ((long) (i10 - d0Var3.f16745b))) {
                    d0 d0Var4 = this.f16751a;
                    d0 d0Var5 = d0Var4 != null ? d0Var4.f16750g : null;
                    if (d0Var5 != null && d0Var5.f16748e) {
                        if ((((long) d0Var5.f16746c) + j10) - ((long) (d0Var5.f16747d ? 0 : d0Var5.f16745b)) <= 8192) {
                            d0 d0Var6 = eVar.f16751a;
                            j.c(d0Var6);
                            d0Var6.d(d0Var5, (int) j10);
                            eVar.f16752b -= j10;
                            this.f16752b += j10;
                            return;
                        }
                    }
                    d0 d0Var7 = eVar.f16751a;
                    j.c(d0Var7);
                    int i11 = (int) j10;
                    if (i11 > 0 && i11 <= d0Var7.f16746c - d0Var7.f16745b) {
                        if (i11 >= 1024) {
                            d0Var = d0Var7.c();
                        } else {
                            d0Var = e0.b();
                            int i12 = d0Var7.f16745b;
                            l.T(0, i12, i12 + i11, d0Var7.f16744a, d0Var.f16744a);
                        }
                        d0Var.f16746c = d0Var.f16745b + i11;
                        d0Var7.f16745b += i11;
                        d0 d0Var8 = d0Var7.f16750g;
                        j.c(d0Var8);
                        d0Var8.b(d0Var);
                        eVar.f16751a = d0Var;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                d0 d0Var9 = eVar.f16751a;
                j.c(d0Var9);
                long j11 = (long) (d0Var9.f16746c - d0Var9.f16745b);
                eVar.f16751a = d0Var9.a();
                d0 d0Var10 = this.f16751a;
                if (d0Var10 == null) {
                    this.f16751a = d0Var9;
                    d0Var9.f16750g = d0Var9;
                    d0Var9.f16749f = d0Var9;
                } else {
                    d0 d0Var11 = d0Var10.f16750g;
                    j.c(d0Var11);
                    d0Var11.b(d0Var9);
                    d0 d0Var12 = d0Var9.f16750g;
                    if (d0Var12 != d0Var9) {
                        j.c(d0Var12);
                        if (d0Var12.f16748e) {
                            int i13 = d0Var9.f16746c - d0Var9.f16745b;
                            d0 d0Var13 = d0Var9.f16750g;
                            j.c(d0Var13);
                            int i14 = 8192 - d0Var13.f16746c;
                            d0 d0Var14 = d0Var9.f16750g;
                            j.c(d0Var14);
                            if (d0Var14.f16747d) {
                                i8 = 0;
                            } else {
                                d0 d0Var15 = d0Var9.f16750g;
                                j.c(d0Var15);
                                i8 = d0Var15.f16745b;
                            }
                            if (i13 <= i14 + i8) {
                                d0 d0Var16 = d0Var9.f16750g;
                                j.c(d0Var16);
                                d0Var9.d(d0Var16, i13);
                                d0Var9.a();
                                e0.a(d0Var9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                eVar.f16752b -= j11;
                this.f16752b += j11;
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0070 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094 A[EDGE_INSN: B:42:0x0094->B:28:0x0094 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long C0() {
        /*
            r14 = this;
            long r0 = r14.f16752b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00af
            r0 = 0
            r1 = r0
            r4 = r1
            r5 = r2
        L_0x000c:
            wg.d0 r7 = r14.f16751a
            sf.j.c(r7)
            int r8 = r7.f16745b
            int r9 = r7.f16746c
        L_0x0015:
            if (r8 >= r9) goto L_0x0094
            byte[] r10 = r7.f16744a
            byte r10 = r10[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0028
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0028
            int r11 = r10 - r11
            goto L_0x0041
        L_0x0028:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0033
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0033
            goto L_0x003d
        L_0x0033:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x006c
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x006c
        L_0x003d:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L_0x0041:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r5
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0051
            r10 = 4
            long r5 = r5 << r10
            long r10 = (long) r11
            long r5 = r5 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0051:
            wg.e r0 = new wg.e
            r0.<init>()
            r0.m0(r5)
            r0.g0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.X()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x006c:
            r4 = 1
            if (r1 == 0) goto L_0x0070
            goto L_0x0094
        L_0x0070:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 2
            char[] r2 = new char[r2]
            char[] r3 = cb.b.D
            int r5 = r10 >> 4
            r5 = r5 & 15
            char r5 = r3[r5]
            r2[r0] = r5
            r0 = r10 & 15
            char r0 = r3[r0]
            r2[r4] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0094:
            if (r8 != r9) goto L_0x00a0
            wg.d0 r8 = r7.a()
            r14.f16751a = r8
            wg.e0.a(r7)
            goto L_0x00a2
        L_0x00a0:
            r7.f16745b = r8
        L_0x00a2:
            if (r4 != 0) goto L_0x00a8
            wg.d0 r7 = r14.f16751a
            if (r7 != 0) goto L_0x000c
        L_0x00a8:
            long r2 = r14.f16752b
            long r0 = (long) r1
            long r2 = r2 - r0
            r14.f16752b = r2
            return r5
        L_0x00af:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.e.C0():long");
    }

    public final long D(byte b10, long j10, long j11) {
        d0 d0Var;
        long j12 = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (z10) {
            long j13 = this.f16752b;
            if (j11 > j13) {
                j11 = j13;
            }
            if (j10 == j11 || (d0Var = this.f16751a) == null) {
                return -1;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    d0Var = d0Var.f16750g;
                    j.c(d0Var);
                    j13 -= (long) (d0Var.f16746c - d0Var.f16745b);
                }
                while (j13 < j11) {
                    int min = (int) Math.min((long) d0Var.f16746c, (((long) d0Var.f16745b) + j11) - j13);
                    for (int i8 = (int) ((((long) d0Var.f16745b) + j10) - j13); i8 < min; i8++) {
                        if (d0Var.f16744a[i8] == b10) {
                            return ((long) (i8 - d0Var.f16745b)) + j13;
                        }
                    }
                    j13 += (long) (d0Var.f16746c - d0Var.f16745b);
                    d0Var = d0Var.f16749f;
                    j.c(d0Var);
                    j10 = j13;
                }
                return -1;
            }
            while (true) {
                long j14 = ((long) (d0Var.f16746c - d0Var.f16745b)) + j12;
                if (j14 > j10) {
                    break;
                }
                d0Var = d0Var.f16749f;
                j.c(d0Var);
                j12 = j14;
            }
            while (j12 < j11) {
                int min2 = (int) Math.min((long) d0Var.f16746c, (((long) d0Var.f16745b) + j11) - j12);
                for (int i10 = (int) ((((long) d0Var.f16745b) + j10) - j12); i10 < min2; i10++) {
                    if (d0Var.f16744a[i10] == b10) {
                        return ((long) (i10 - d0Var.f16745b)) + j12;
                    }
                }
                j12 += (long) (d0Var.f16746c - d0Var.f16745b);
                d0Var = d0Var.f16749f;
                j.c(d0Var);
                j10 = j12;
            }
            return -1;
        }
        throw new IllegalArgumentException(("size=" + this.f16752b + " fromIndex=" + j10 + " toIndex=" + j11).toString());
    }

    public final InputStream D0() {
        return new a(this);
    }

    public final long F(i iVar) {
        int i8;
        int i10;
        long j10;
        int i11;
        j.f(iVar, "targetBytes");
        d0 d0Var = this.f16751a;
        if (d0Var != null) {
            long j11 = this.f16752b;
            long j12 = 0;
            int i12 = ((j11 - 0) > 0 ? 1 : ((j11 - 0) == 0 ? 0 : -1));
            byte[] bArr = iVar.f16761a;
            if (i12 < 0) {
                while (j11 > 0) {
                    d0Var = d0Var.f16750g;
                    j.c(d0Var);
                    j11 -= (long) (d0Var.f16746c - d0Var.f16745b);
                }
                if (bArr.length == 2) {
                    byte b10 = bArr[0];
                    byte b11 = bArr[1];
                    while (j10 < this.f16752b) {
                        i10 = (int) ((((long) d0Var.f16745b) + j12) - j10);
                        int i13 = d0Var.f16746c;
                        while (i10 < i13) {
                            byte b12 = d0Var.f16744a[i10];
                            if (!(b12 == b10 || b12 == b11)) {
                                i10++;
                            }
                        }
                        j12 = ((long) (d0Var.f16746c - d0Var.f16745b)) + j10;
                        d0Var = d0Var.f16749f;
                        j.c(d0Var);
                        j11 = j12;
                    }
                } else {
                    while (j10 < this.f16752b) {
                        i11 = (int) ((((long) d0Var.f16745b) + j12) - j10);
                        int i14 = d0Var.f16746c;
                        while (i11 < i14) {
                            byte b13 = d0Var.f16744a[i11];
                            for (byte b14 : bArr) {
                                if (b13 == b14) {
                                    i8 = d0Var.f16745b;
                                    return ((long) (i10 - i8)) + j10;
                                }
                            }
                            i11++;
                        }
                        j12 = ((long) (d0Var.f16746c - d0Var.f16745b)) + j10;
                        d0Var = d0Var.f16749f;
                        j.c(d0Var);
                        j11 = j12;
                    }
                }
            } else {
                j10 = 0;
                while (true) {
                    long j13 = ((long) (d0Var.f16746c - d0Var.f16745b)) + j10;
                    if (j13 > 0) {
                        break;
                    }
                    d0Var = d0Var.f16749f;
                    j.c(d0Var);
                    j10 = j13;
                }
                if (bArr.length == 2) {
                    byte b15 = bArr[0];
                    byte b16 = bArr[1];
                    while (j10 < this.f16752b) {
                        int i15 = (int) ((((long) d0Var.f16745b) + j12) - j10);
                        int i16 = d0Var.f16746c;
                        while (i10 < i16) {
                            byte b17 = d0Var.f16744a[i10];
                            if (!(b17 == b15 || b17 == b16)) {
                                i15 = i10 + 1;
                            }
                        }
                        j12 = ((long) (d0Var.f16746c - d0Var.f16745b)) + j10;
                        d0Var = d0Var.f16749f;
                        j.c(d0Var);
                        j10 = j12;
                    }
                } else {
                    while (j10 < this.f16752b) {
                        int i17 = (int) ((((long) d0Var.f16745b) + j12) - j10);
                        int i18 = d0Var.f16746c;
                        while (i11 < i18) {
                            byte b18 = d0Var.f16744a[i11];
                            for (byte b19 : bArr) {
                                if (b18 == b19) {
                                    i8 = d0Var.f16745b;
                                    return ((long) (i10 - i8)) + j10;
                                }
                            }
                            i17 = i11 + 1;
                        }
                        j12 = ((long) (d0Var.f16746c - d0Var.f16745b)) + j10;
                        d0Var = d0Var.f16749f;
                        j.c(d0Var);
                        j10 = j12;
                    }
                }
            }
            i8 = d0Var.f16745b;
            return ((long) (i10 - i8)) + j10;
        }
        return -1;
    }

    public final String G(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long D = D(b10, 0, j11);
            if (D != -1) {
                return xg.j.a(this, D);
            }
            if (j11 < this.f16752b && z(j11 - 1) == ((byte) 13) && z(j11) == b10) {
                return xg.j.a(this, j11);
            }
            e eVar = new e();
            u(0, Math.min((long) 32, this.f16752b), eVar);
            throw new EOFException("\\n not found: limit=" + Math.min(this.f16752b, j10) + " content=" + eVar.Q().e() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    public final boolean K(i iVar) {
        j.f(iVar, "bytes");
        byte[] bArr = iVar.f16761a;
        int length = bArr.length;
        if (length < 0 || this.f16752b - 0 < ((long) length) || bArr.length - 0 < length) {
            return false;
        }
        for (int i8 = 0; i8 < length; i8++) {
            if (z(((long) i8) + 0) != bArr[0 + i8]) {
                return false;
            }
        }
        return true;
    }

    public final byte[] L(long j10) {
        int i8 = 0;
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (this.f16752b >= j10) {
            int i10 = (int) j10;
            byte[] bArr = new byte[i10];
            while (i8 < i10) {
                int read = read(bArr, i8, i10 - i8);
                if (read != -1) {
                    i8 += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final /* bridge */ /* synthetic */ g M(String str) {
        v0(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ g O(i iVar) {
        f0(iVar);
        return this;
    }

    public final String P(Charset charset) {
        return T(this.f16752b, charset);
    }

    public final i Q() {
        return k(this.f16752b);
    }

    public final short R() {
        short readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final String T(long j10, Charset charset) {
        j.f(charset, "charset");
        int i8 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (!(i8 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (this.f16752b < j10) {
            throw new EOFException();
        } else if (i8 == 0) {
            return "";
        } else {
            d0 d0Var = this.f16751a;
            j.c(d0Var);
            int i10 = d0Var.f16745b;
            if (((long) i10) + j10 > ((long) d0Var.f16746c)) {
                return new String(L(j10), charset);
            }
            int i11 = (int) j10;
            String str = new String(d0Var.f16744a, i10, i11, charset);
            int i12 = d0Var.f16745b + i11;
            d0Var.f16745b = i12;
            this.f16752b -= j10;
            if (i12 == d0Var.f16746c) {
                this.f16751a = d0Var.a();
                e0.a(d0Var);
            }
            return str;
        }
    }

    public final /* bridge */ /* synthetic */ g W(long j10) {
        m0(j10);
        return this;
    }

    public final String X() {
        return T(this.f16752b, zf.a.f17962b);
    }

    public final String Y(long j10) {
        return T(j10, zf.a.f17962b);
    }

    public final e a() {
        return this;
    }

    public final long a0(e eVar, long j10) {
        j.f(eVar, "sink");
        if (j10 >= 0) {
            long j11 = this.f16752b;
            if (j11 == 0) {
                return -1;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            eVar.B(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    public final j0 b() {
        return j0.f16769d;
    }

    public final int b0() {
        byte b10;
        int i8;
        byte b11;
        if (this.f16752b != 0) {
            byte z10 = z(0);
            boolean z11 = false;
            if ((z10 & 128) == 0) {
                b11 = z10 & Byte.MAX_VALUE;
                b10 = 0;
                i8 = 1;
            } else if ((z10 & 224) == 192) {
                b11 = z10 & 31;
                i8 = 2;
                b10 = 128;
            } else if ((z10 & 240) == 224) {
                b11 = z10 & 15;
                i8 = 3;
                b10 = 2048;
            } else if ((z10 & 248) == 240) {
                b11 = z10 & 7;
                i8 = 4;
                b10 = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j10 = (long) i8;
            if (this.f16752b >= j10) {
                int i10 = 1;
                while (true) {
                    if (i10 < i8) {
                        long j11 = (long) i10;
                        byte z12 = z(j11);
                        if ((z12 & 192) != 128) {
                            skip(j11);
                            break;
                        }
                        b11 = (b11 << 6) | (z12 & 63);
                        i10++;
                    } else {
                        skip(j10);
                        if (b11 <= 1114111) {
                            if (55296 <= b11 && b11 < 57344) {
                                z11 = true;
                            }
                            if (!z11 && b11 >= b10) {
                                return b11;
                            }
                        }
                    }
                }
                return 65533;
            }
            StringBuilder b12 = a1.b("size < ", i8, ": ");
            b12.append(this.f16752b);
            b12.append(" (to read code point prefixed 0x");
            char[] cArr = b.D;
            b12.append(new String(new char[]{cArr[(z10 >> 4) & 15], cArr[z10 & 15]}));
            b12.append(')');
            throw new EOFException(b12.toString());
        }
        throw new EOFException();
    }

    public final boolean c0(long j10) {
        return this.f16752b >= j10;
    }

    public final void close() {
    }

    public final i d0(int i8) {
        if (i8 == 0) {
            return i.f16760d;
        }
        d.d(this.f16752b, 0, (long) i8);
        d0 d0Var = this.f16751a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i8) {
            j.c(d0Var);
            int i13 = d0Var.f16746c;
            int i14 = d0Var.f16745b;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                d0Var = d0Var.f16749f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[(i12 * 2)];
        d0 d0Var2 = this.f16751a;
        int i15 = 0;
        while (i10 < i8) {
            j.c(d0Var2);
            bArr[i15] = d0Var2.f16744a;
            i10 += d0Var2.f16746c - d0Var2.f16745b;
            iArr[i15] = Math.min(i10, i8);
            iArr[i15 + i12] = d0Var2.f16745b;
            d0Var2.f16747d = true;
            i15++;
            d0Var2 = d0Var2.f16749f;
        }
        return new f0(bArr, iArr);
    }

    public final d0 e0(int i8) {
        boolean z10 = true;
        if (i8 < 1 || i8 > 8192) {
            z10 = false;
        }
        if (z10) {
            d0 d0Var = this.f16751a;
            if (d0Var == null) {
                d0 b10 = e0.b();
                this.f16751a = b10;
                b10.f16750g = b10;
                b10.f16749f = b10;
                return b10;
            }
            d0 d0Var2 = d0Var.f16750g;
            j.c(d0Var2);
            if (d0Var2.f16746c + i8 <= 8192 && d0Var2.f16748e) {
                return d0Var2;
            }
            d0 b11 = e0.b();
            d0Var2.b(b11);
            return b11;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r0 != r1) goto L_0x0009
        L_0x0006:
            r2 = 1
            goto L_0x0078
        L_0x0009:
            boolean r3 = r1 instanceof wg.e
            if (r3 != 0) goto L_0x0010
        L_0x000d:
            r2 = 0
            goto L_0x0078
        L_0x0010:
            long r5 = r0.f16752b
            wg.e r1 = (wg.e) r1
            long r7 = r1.f16752b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            goto L_0x000d
        L_0x001b:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            goto L_0x0006
        L_0x0022:
            wg.d0 r3 = r0.f16751a
            sf.j.c(r3)
            wg.d0 r1 = r1.f16751a
            sf.j.c(r1)
            int r5 = r3.f16745b
            int r6 = r1.f16745b
            r9 = r7
        L_0x0031:
            long r11 = r0.f16752b
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0006
            int r11 = r3.f16746c
            int r11 = r11 - r5
            int r12 = r1.f16746c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x0043:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x005d
            int r15 = r5 + 1
            byte[] r2 = r3.f16744a
            byte r2 = r2[r5]
            int r5 = r6 + 1
            byte[] r4 = r1.f16744a
            byte r4 = r4[r6]
            if (r2 == r4) goto L_0x0056
            goto L_0x000d
        L_0x0056:
            r16 = 1
            long r13 = r13 + r16
            r6 = r5
            r5 = r15
            goto L_0x0043
        L_0x005d:
            int r2 = r3.f16746c
            if (r5 != r2) goto L_0x006a
            wg.d0 r2 = r3.f16749f
            sf.j.c(r2)
            int r3 = r2.f16745b
            r5 = r3
            r3 = r2
        L_0x006a:
            int r2 = r1.f16746c
            if (r6 != r2) goto L_0x0076
            wg.d0 r1 = r1.f16749f
            sf.j.c(r1)
            int r2 = r1.f16745b
            r6 = r2
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0031
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.e.equals(java.lang.Object):boolean");
    }

    public final void f0(i iVar) {
        j.f(iVar, "byteString");
        iVar.r(this, iVar.d());
    }

    public final void flush() {
    }

    public final void g0(int i8) {
        d0 e02 = e0(1);
        int i10 = e02.f16746c;
        e02.f16746c = i10 + 1;
        e02.f16744a[i10] = (byte) i8;
        this.f16752b++;
    }

    public final int hashCode() {
        d0 d0Var = this.f16751a;
        if (d0Var == null) {
            return 0;
        }
        int i8 = 1;
        do {
            int i10 = d0Var.f16746c;
            for (int i11 = d0Var.f16745b; i11 < i10; i11++) {
                i8 = (i8 * 31) + d0Var.f16744a[i11];
            }
            d0Var = d0Var.f16749f;
            j.c(d0Var);
        } while (d0Var != this.f16751a);
        return i8;
    }

    public final boolean isOpen() {
        return true;
    }

    public final void j() {
        skip(this.f16752b);
    }

    public final String j0() {
        return G(Long.MAX_VALUE);
    }

    public final i k(long j10) {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (this.f16752b < j10) {
            throw new EOFException();
        } else if (j10 < 4096) {
            return new i(L(j10));
        } else {
            i d02 = d0((int) j10);
            skip(j10);
            return d02;
        }
    }

    /* renamed from: k0 */
    public final e A0(long j10) {
        boolean z10;
        byte[] bArr;
        int i8 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i8 == 0) {
            g0(48);
        } else {
            int i10 = 1;
            if (i8 < 0) {
                j10 = -j10;
                if (j10 < 0) {
                    v0("-9223372036854775808");
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (j10 >= 100000000) {
                i10 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
            } else if (j10 >= RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT) {
                i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
            } else if (j10 >= 100) {
                i10 = j10 < 1000 ? 3 : 4;
            } else if (j10 >= 10) {
                i10 = 2;
            }
            if (z10) {
                i10++;
            }
            d0 e02 = e0(i10);
            int i11 = e02.f16746c + i10;
            while (true) {
                int i12 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
                bArr = e02.f16744a;
                if (i12 == 0) {
                    break;
                }
                long j11 = (long) 10;
                i11--;
                bArr[i11] = xg.j.f17097a[(int) (j10 % j11)];
                j10 /= j11;
            }
            if (z10) {
                bArr[i11 - 1] = (byte) 45;
            }
            e02.f16746c += i10;
            this.f16752b += (long) i10;
        }
        return this;
    }

    public final int l0() {
        int readInt = readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final e m0(long j10) {
        if (j10 == 0) {
            g0(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i8 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            d0 e02 = e0(i8);
            int i10 = e02.f16746c;
            for (int i11 = (i10 + i8) - 1; i11 >= i10; i11--) {
                e02.f16744a[i11] = xg.j.f17097a[(int) (15 & j10)];
                j10 >>>= 4;
            }
            e02.f16746c += i8;
            this.f16752b += (long) i8;
        }
        return this;
    }

    public final void n0(int i8) {
        d0 e02 = e0(4);
        int i10 = e02.f16746c;
        int i11 = i10 + 1;
        byte[] bArr = e02.f16744a;
        bArr[i10] = (byte) ((i8 >>> 24) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i8 >>> 16) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i8 >>> 8) & 255);
        bArr[i13] = (byte) (i8 & 255);
        e02.f16746c = i13 + 1;
        this.f16752b += 4;
    }

    /* renamed from: p */
    public final e clone() {
        e eVar = new e();
        if (this.f16752b != 0) {
            d0 d0Var = this.f16751a;
            j.c(d0Var);
            d0 c3 = d0Var.c();
            eVar.f16751a = c3;
            c3.f16750g = c3;
            c3.f16749f = c3;
            for (d0 d0Var2 = d0Var.f16749f; d0Var2 != d0Var; d0Var2 = d0Var2.f16749f) {
                d0 d0Var3 = c3.f16750g;
                j.c(d0Var3);
                j.c(d0Var2);
                d0Var3.b(d0Var2.c());
            }
            eVar.f16752b = this.f16752b;
        }
        return eVar;
    }

    public final void p0(int i8) {
        d0 e02 = e0(2);
        int i10 = e02.f16746c;
        int i11 = i10 + 1;
        byte[] bArr = e02.f16744a;
        bArr[i10] = (byte) ((i8 >>> 8) & 255);
        bArr[i11] = (byte) (i8 & 255);
        e02.f16746c = i11 + 1;
        this.f16752b += 2;
    }

    public final long q() {
        long j10 = this.f16752b;
        if (j10 == 0) {
            return 0;
        }
        d0 d0Var = this.f16751a;
        j.c(d0Var);
        d0 d0Var2 = d0Var.f16750g;
        j.c(d0Var2);
        int i8 = d0Var2.f16746c;
        if (i8 < 8192 && d0Var2.f16748e) {
            j10 -= (long) (i8 - d0Var2.f16745b);
        }
        return j10;
    }

    public final void q0(int i8, int i10, String str) {
        char charAt;
        j.f(str, "string");
        if (i8 >= 0) {
            if (i10 >= i8) {
                if (i10 <= str.length()) {
                    while (i8 < i10) {
                        char charAt2 = str.charAt(i8);
                        if (charAt2 < 128) {
                            d0 e02 = e0(1);
                            int i11 = e02.f16746c - i8;
                            int min = Math.min(i10, 8192 - i11);
                            int i12 = i8 + 1;
                            byte[] bArr = e02.f16744a;
                            bArr[i8 + i11] = (byte) charAt2;
                            while (true) {
                                i8 = i12;
                                if (i8 >= min || (charAt = str.charAt(i8)) >= 128) {
                                    int i13 = e02.f16746c;
                                    int i14 = (i11 + i8) - i13;
                                    e02.f16746c = i13 + i14;
                                    this.f16752b += (long) i14;
                                } else {
                                    i12 = i8 + 1;
                                    bArr[i8 + i11] = (byte) charAt;
                                }
                            }
                            int i132 = e02.f16746c;
                            int i142 = (i11 + i8) - i132;
                            e02.f16746c = i132 + i142;
                            this.f16752b += (long) i142;
                        } else {
                            if (charAt2 < 2048) {
                                d0 e03 = e0(2);
                                int i15 = e03.f16746c;
                                byte[] bArr2 = e03.f16744a;
                                bArr2[i15] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                                e03.f16746c = i15 + 2;
                                this.f16752b += 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                d0 e04 = e0(3);
                                int i16 = e04.f16746c;
                                byte[] bArr3 = e04.f16744a;
                                bArr3[i16] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i16 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i16 + 2] = (byte) ((charAt2 & '?') | 128);
                                e04.f16746c = i16 + 3;
                                this.f16752b += 3;
                            } else {
                                int i17 = i8 + 1;
                                char charAt3 = i17 < i10 ? str.charAt(i17) : 0;
                                if (charAt2 <= 56319) {
                                    if (56320 <= charAt3 && charAt3 < 57344) {
                                        int i18 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 0;
                                        d0 e05 = e0(4);
                                        int i19 = e05.f16746c;
                                        byte[] bArr4 = e05.f16744a;
                                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                                        e05.f16746c = i19 + 4;
                                        this.f16752b += 4;
                                        i8 += 2;
                                    }
                                }
                                g0(63);
                                i8 = i17;
                            }
                            i8++;
                        }
                    }
                    return;
                }
                StringBuilder b10 = a1.b("endIndex > string.length: ", i10, " > ");
                b10.append(str.length());
                throw new IllegalArgumentException(b10.toString().toString());
            }
            throw new IllegalArgumentException(androidx.activity.result.d.a("endIndex < beginIndex: ", i10, " < ", i8).toString());
        }
        throw new IllegalArgumentException(q.a("beginIndex < 0: ", i8).toString());
    }

    public final long r(g gVar) {
        long j10 = this.f16752b;
        if (j10 > 0) {
            gVar.B(this, j10);
        }
        return j10;
    }

    public final int read(ByteBuffer byteBuffer) {
        j.f(byteBuffer, "sink");
        d0 d0Var = this.f16751a;
        if (d0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), d0Var.f16746c - d0Var.f16745b);
        byteBuffer.put(d0Var.f16744a, d0Var.f16745b, min);
        int i8 = d0Var.f16745b + min;
        d0Var.f16745b = i8;
        this.f16752b -= (long) min;
        if (i8 == d0Var.f16746c) {
            this.f16751a = d0Var.a();
            e0.a(d0Var);
        }
        return min;
    }

    public final byte readByte() {
        if (this.f16752b != 0) {
            d0 d0Var = this.f16751a;
            j.c(d0Var);
            int i8 = d0Var.f16745b;
            int i10 = d0Var.f16746c;
            int i11 = i8 + 1;
            byte b10 = d0Var.f16744a[i8];
            this.f16752b--;
            if (i11 == i10) {
                this.f16751a = d0Var.a();
                e0.a(d0Var);
            } else {
                d0Var.f16745b = i11;
            }
            return b10;
        }
        throw new EOFException();
    }

    public final int readInt() {
        if (this.f16752b >= 4) {
            d0 d0Var = this.f16751a;
            j.c(d0Var);
            int i8 = d0Var.f16745b;
            int i10 = d0Var.f16746c;
            if (((long) (i10 - i8)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            int i11 = i8 + 1;
            byte[] bArr = d0Var.f16744a;
            int i12 = i11 + 1;
            byte b10 = ((bArr[i8] & 255) << 24) | ((bArr[i11] & 255) << 16);
            int i13 = i12 + 1;
            byte b11 = b10 | ((bArr[i12] & 255) << 8);
            int i14 = i13 + 1;
            byte b12 = b11 | (bArr[i13] & 255);
            this.f16752b -= 4;
            if (i14 == i10) {
                this.f16751a = d0Var.a();
                e0.a(d0Var);
            } else {
                d0Var.f16745b = i14;
            }
            return b12;
        }
        throw new EOFException();
    }

    public final short readShort() {
        if (this.f16752b >= 2) {
            d0 d0Var = this.f16751a;
            j.c(d0Var);
            int i8 = d0Var.f16745b;
            int i10 = d0Var.f16746c;
            if (i10 - i8 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i11 = i8 + 1;
            byte[] bArr = d0Var.f16744a;
            int i12 = i11 + 1;
            byte b10 = ((bArr[i8] & 255) << 8) | (bArr[i11] & 255);
            this.f16752b -= 2;
            if (i12 == i10) {
                this.f16751a = d0Var.a();
                e0.a(d0Var);
            } else {
                d0Var.f16745b = i12;
            }
            return (short) b10;
        }
        throw new EOFException();
    }

    public final void skip(long j10) {
        while (j10 > 0) {
            d0 d0Var = this.f16751a;
            if (d0Var != null) {
                int min = (int) Math.min(j10, (long) (d0Var.f16746c - d0Var.f16745b));
                long j11 = (long) min;
                this.f16752b -= j11;
                j10 -= j11;
                int i8 = d0Var.f16745b + min;
                d0Var.f16745b = i8;
                if (i8 == d0Var.f16746c) {
                    this.f16751a = d0Var.a();
                    e0.a(d0Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final long t0() {
        long j10;
        if (this.f16752b >= 8) {
            d0 d0Var = this.f16751a;
            j.c(d0Var);
            int i8 = d0Var.f16745b;
            int i10 = d0Var.f16746c;
            if (((long) (i10 - i8)) < 8) {
                j10 = ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            } else {
                int i11 = i8 + 1;
                byte[] bArr = d0Var.f16744a;
                int i12 = i11 + 1;
                long j11 = ((((long) bArr[i8]) & 255) << 56) | ((((long) bArr[i11]) & 255) << 48);
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                long j12 = j11 | ((((long) bArr[i12]) & 255) << 40) | ((((long) bArr[i13]) & 255) << 32);
                int i15 = i14 + 1;
                int i16 = i15 + 1;
                long j13 = j12 | ((((long) bArr[i14]) & 255) << 24) | ((((long) bArr[i15]) & 255) << 16);
                int i17 = i16 + 1;
                int i18 = i17 + 1;
                long j14 = j13 | ((((long) bArr[i16]) & 255) << 8) | (((long) bArr[i17]) & 255);
                this.f16752b -= 8;
                if (i18 == i10) {
                    this.f16751a = d0Var.a();
                    e0.a(d0Var);
                } else {
                    d0Var.f16745b = i18;
                }
                j10 = j14;
            }
            return ((j10 & 255) << 56) | ((-72057594037927936L & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
        }
        throw new EOFException();
    }

    public final String toString() {
        long j10 = this.f16752b;
        if (j10 <= 2147483647L) {
            return d0((int) j10).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f16752b).toString());
    }

    public final void u(long j10, long j11, e eVar) {
        j.f(eVar, "out");
        d.d(this.f16752b, j10, j11);
        if (j11 != 0) {
            eVar.f16752b += j11;
            d0 d0Var = this.f16751a;
            while (true) {
                j.c(d0Var);
                long j12 = (long) (d0Var.f16746c - d0Var.f16745b);
                if (j10 < j12) {
                    break;
                }
                j10 -= j12;
                d0Var = d0Var.f16749f;
            }
            while (j11 > 0) {
                j.c(d0Var);
                d0 c3 = d0Var.c();
                int i8 = c3.f16745b + ((int) j10);
                c3.f16745b = i8;
                c3.f16746c = Math.min(i8 + ((int) j11), c3.f16746c);
                d0 d0Var2 = eVar.f16751a;
                if (d0Var2 == null) {
                    c3.f16750g = c3;
                    c3.f16749f = c3;
                    eVar.f16751a = c3;
                } else {
                    d0 d0Var3 = d0Var2.f16750g;
                    j.c(d0Var3);
                    d0Var3.b(c3);
                }
                j11 -= (long) (c3.f16746c - c3.f16745b);
                d0Var = d0Var.f16749f;
                j10 = 0;
            }
        }
    }

    public final void v0(String str) {
        j.f(str, "string");
        q0(0, str.length(), str);
    }

    public final int w(x xVar) {
        j.f(xVar, "options");
        int b10 = xg.j.b(this, xVar, false);
        if (b10 == -1) {
            return -1;
        }
        skip((long) xVar.f16804a[b10].d());
        return b10;
    }

    public final void w0(int i8) {
        String str;
        if (i8 < 128) {
            g0(i8);
        } else if (i8 < 2048) {
            d0 e02 = e0(2);
            int i10 = e02.f16746c;
            byte[] bArr = e02.f16744a;
            bArr[i10] = (byte) ((i8 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i8 & 63) | 128);
            e02.f16746c = i10 + 2;
            this.f16752b += 2;
        } else {
            int i11 = 0;
            if (55296 <= i8 && i8 < 57344) {
                g0(63);
            } else if (i8 < 65536) {
                d0 e03 = e0(3);
                int i12 = e03.f16746c;
                byte[] bArr2 = e03.f16744a;
                bArr2[i12] = (byte) ((i8 >> 12) | 224);
                bArr2[i12 + 1] = (byte) (((i8 >> 6) & 63) | 128);
                bArr2[i12 + 2] = (byte) ((i8 & 63) | 128);
                e03.f16746c = i12 + 3;
                this.f16752b += 3;
            } else if (i8 <= 1114111) {
                d0 e04 = e0(4);
                int i13 = e04.f16746c;
                byte[] bArr3 = e04.f16744a;
                bArr3[i13] = (byte) ((i8 >> 18) | 240);
                bArr3[i13 + 1] = (byte) (((i8 >> 12) & 63) | 128);
                bArr3[i13 + 2] = (byte) (((i8 >> 6) & 63) | 128);
                bArr3[i13 + 3] = (byte) ((i8 & 63) | 128);
                e04.f16746c = i13 + 4;
                this.f16752b += 4;
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
                if (i8 != 0) {
                    char[] cArr = b.D;
                    char[] cArr2 = {cArr[(i8 >> 28) & 15], cArr[(i8 >> 24) & 15], cArr[(i8 >> 20) & 15], cArr[(i8 >> 16) & 15], cArr[(i8 >> 12) & 15], cArr[(i8 >> 8) & 15], cArr[(i8 >> 4) & 15], cArr[i8 & 15]};
                    while (i11 < 8 && cArr2[i11] == '0') {
                        i11++;
                    }
                    if (i11 < 0) {
                        throw new IndexOutOfBoundsException(d.a.a("startIndex: ", i11, ", endIndex: 8, size: 8"));
                    } else if (i11 <= 8) {
                        str = new String(cArr2, i11, 8 - i11);
                    } else {
                        throw new IllegalArgumentException(d.a.a("startIndex: ", i11, " > endIndex: 8"));
                    }
                } else {
                    str = "0";
                }
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    public final g write(byte[] bArr) {
        j.f(bArr, "source");
        write(bArr, 0, bArr.length);
        return this;
    }

    public final /* bridge */ /* synthetic */ g writeByte(int i8) {
        g0(i8);
        return this;
    }

    public final /* bridge */ /* synthetic */ g writeInt(int i8) {
        n0(i8);
        return this;
    }

    public final /* bridge */ /* synthetic */ g writeShort(int i8) {
        p0(i8);
        return this;
    }

    public final long x(i0 i0Var) {
        j.f(i0Var, "source");
        long j10 = 0;
        while (true) {
            long a02 = i0Var.a0(this, 8192);
            if (a02 == -1) {
                return j10;
            }
            j10 += a02;
        }
    }

    public final boolean y() {
        return this.f16752b == 0;
    }

    public final byte z(long j10) {
        d.d(this.f16752b, j10, 1);
        d0 d0Var = this.f16751a;
        if (d0Var != null) {
            long j11 = this.f16752b;
            if (j11 - j10 < j10) {
                while (j11 > j10) {
                    d0Var = d0Var.f16750g;
                    j.c(d0Var);
                    j11 -= (long) (d0Var.f16746c - d0Var.f16745b);
                }
                return d0Var.f16744a[(int) ((((long) d0Var.f16745b) + j10) - j11)];
            }
            long j12 = 0;
            while (true) {
                int i8 = d0Var.f16746c;
                int i10 = d0Var.f16745b;
                long j13 = ((long) (i8 - i10)) + j12;
                if (j13 <= j10) {
                    d0Var = d0Var.f16749f;
                    j.c(d0Var);
                    j12 = j13;
                } else {
                    return d0Var.f16744a[(int) ((((long) i10) + j10) - j12)];
                }
            }
        } else {
            j.c((Object) null);
            throw null;
        }
    }

    public final void z0(long j10) {
        if (this.f16752b < j10) {
            throw new EOFException();
        }
    }

    public static final class a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f16753a;

        public a(e eVar) {
            this.f16753a = eVar;
        }

        public final int available() {
            return (int) Math.min(this.f16753a.f16752b, (long) Integer.MAX_VALUE);
        }

        public final void close() {
        }

        public final int read() {
            e eVar = this.f16753a;
            if (eVar.f16752b > 0) {
                return eVar.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return this.f16753a + ".inputStream()";
        }

        public final int read(byte[] bArr, int i8, int i10) {
            j.f(bArr, "sink");
            return this.f16753a.read(bArr, i8, i10);
        }
    }

    public final int write(ByteBuffer byteBuffer) {
        j.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i8 = remaining;
        while (i8 > 0) {
            d0 e02 = e0(1);
            int min = Math.min(i8, 8192 - e02.f16746c);
            byteBuffer.get(e02.f16744a, e02.f16746c, min);
            i8 -= min;
            e02.f16746c += min;
        }
        this.f16752b += (long) remaining;
        return remaining;
    }

    public final int read(byte[] bArr, int i8, int i10) {
        j.f(bArr, "sink");
        d.d((long) bArr.length, (long) i8, (long) i10);
        d0 d0Var = this.f16751a;
        if (d0Var == null) {
            return -1;
        }
        int min = Math.min(i10, d0Var.f16746c - d0Var.f16745b);
        int i11 = d0Var.f16745b;
        l.T(i8, i11, i11 + min, d0Var.f16744a, bArr);
        int i12 = d0Var.f16745b + min;
        d0Var.f16745b = i12;
        this.f16752b -= (long) min;
        if (i12 == d0Var.f16746c) {
            this.f16751a = d0Var.a();
            e0.a(d0Var);
        }
        return min;
    }

    public final void write(byte[] bArr, int i8, int i10) {
        j.f(bArr, "source");
        long j10 = (long) i10;
        d.d((long) bArr.length, (long) i8, j10);
        int i11 = i10 + i8;
        while (i8 < i11) {
            d0 e02 = e0(1);
            int min = Math.min(i11 - i8, 8192 - e02.f16746c);
            int i12 = i8 + min;
            l.T(e02.f16746c, i8, i12, bArr, e02.f16744a);
            e02.f16746c += min;
            i8 = i12;
        }
        this.f16752b += j10;
    }
}
