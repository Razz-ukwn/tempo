package com.google.android.gms.internal.p000firebaseauthapi;

import d.a;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s1  reason: invalid package */
public final class s1 extends t1 {

    /* renamed from: c  reason: collision with root package name */
    public final InputStream f4889c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f4890d;

    /* renamed from: e  reason: collision with root package name */
    public int f4891e;

    /* renamed from: f  reason: collision with root package name */
    public int f4892f;

    /* renamed from: g  reason: collision with root package name */
    public int f4893g;

    /* renamed from: h  reason: collision with root package name */
    public int f4894h;

    /* renamed from: i  reason: collision with root package name */
    public int f4895i;

    /* renamed from: j  reason: collision with root package name */
    public int f4896j = Integer.MAX_VALUE;

    public /* synthetic */ s1(InputStream inputStream) {
        Charset charset = u2.f4974a;
        this.f4889c = inputStream;
        this.f4890d = new byte[4096];
        this.f4891e = 0;
        this.f4893g = 0;
        this.f4895i = 0;
    }

    public final void A(int i8) {
        InputStream inputStream = this.f4889c;
        int i10 = this.f4891e;
        int i11 = this.f4893g;
        int i12 = i10 - i11;
        if (i8 <= i12 && i8 >= 0) {
            this.f4893g = i11 + i8;
        } else if (i8 >= 0) {
            int i13 = this.f4895i;
            int i14 = i13 + i11;
            int i15 = this.f4896j;
            if (i14 + i8 <= i15) {
                this.f4895i = i14;
                this.f4891e = 0;
                this.f4893g = 0;
                while (i12 < i8) {
                    long j10 = (long) (i8 - i12);
                    try {
                        long skip = inputStream.skip(j10);
                        int i16 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i16 < 0 || skip > j10) {
                            throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (i16 == 0) {
                            break;
                        } else {
                            i12 += (int) skip;
                        }
                    } catch (w2 e10) {
                        e10.f5029a = true;
                        throw e10;
                    } catch (Throwable th) {
                        this.f4895i += i12;
                        C();
                        throw th;
                    }
                }
                this.f4895i += i12;
                C();
                if (i12 < i8) {
                    int i17 = this.f4891e;
                    int i18 = i17 - this.f4893g;
                    this.f4893g = i17;
                    D(1);
                    while (true) {
                        int i19 = i8 - i18;
                        int i20 = this.f4891e;
                        if (i19 > i20) {
                            i18 += i20;
                            this.f4893g = i20;
                            D(1);
                        } else {
                            this.f4893g = i19;
                            return;
                        }
                    }
                }
            } else {
                A((i15 - i13) - i11);
                throw w2.f();
            }
        } else {
            throw w2.d();
        }
    }

    public final ArrayList B(int i8) {
        ArrayList arrayList = new ArrayList();
        while (i8 > 0) {
            int min = Math.min(i8, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.f4889c.read(bArr, i10, min - i10);
                if (read != -1) {
                    this.f4895i += read;
                    i10 += read;
                } else {
                    throw w2.f();
                }
            }
            i8 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void C() {
        int i8 = this.f4891e + this.f4892f;
        this.f4891e = i8;
        int i10 = this.f4895i + i8;
        int i11 = this.f4896j;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f4892f = i12;
            this.f4891e = i8 - i12;
            return;
        }
        this.f4892f = 0;
    }

    public final void D(int i8) {
        if (E(i8)) {
            return;
        }
        if (i8 > (Integer.MAX_VALUE - this.f4895i) - this.f4893g) {
            throw new w2("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw w2.f();
    }

    public final boolean E(int i8) {
        InputStream inputStream = this.f4889c;
        int i10 = this.f4893g;
        int i11 = i10 + i8;
        int i12 = this.f4891e;
        if (i11 > i12) {
            int i13 = this.f4895i;
            if (i8 > (Integer.MAX_VALUE - i13) - i10 || i13 + i10 + i8 > this.f4896j) {
                return false;
            }
            byte[] bArr = this.f4890d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                i13 = this.f4895i + i10;
                this.f4895i = i13;
                i12 = this.f4891e - i10;
                this.f4891e = i12;
                this.f4893g = 0;
            }
            try {
                int read = inputStream.read(bArr, i12, Math.min(4096 - i12, (Integer.MAX_VALUE - i13) - i12));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f4891e += read;
                    C();
                    if (this.f4891e >= i8) {
                        return true;
                    }
                    return E(i8);
                }
            } catch (w2 e10) {
                e10.f5029a = true;
                throw e10;
            }
        } else {
            throw new IllegalStateException(a.a("refillBuffer() called when ", i8, " bytes were already available in buffer"));
        }
    }

    public final byte[] F(int i8) {
        byte[] G = G(i8);
        if (G != null) {
            return G;
        }
        int i10 = this.f4893g;
        int i11 = this.f4891e;
        int i12 = i11 - i10;
        this.f4895i += i11;
        this.f4893g = 0;
        this.f4891e = 0;
        ArrayList B = B(i8 - i12);
        byte[] bArr = new byte[i8];
        System.arraycopy(this.f4890d, i10, bArr, 0, i12);
        Iterator it = B.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    public final byte[] G(int i8) {
        if (i8 == 0) {
            return u2.f4975b;
        }
        if (i8 >= 0) {
            int i10 = this.f4895i;
            int i11 = this.f4893g;
            int i12 = i10 + i11 + i8;
            if (-2147483647 + i12 <= 0) {
                int i13 = this.f4896j;
                if (i12 <= i13) {
                    int i14 = this.f4891e - i11;
                    int i15 = i8 - i14;
                    InputStream inputStream = this.f4889c;
                    if (i15 >= 4096) {
                        try {
                            if (i15 > inputStream.available()) {
                                return null;
                            }
                        } catch (w2 e10) {
                            e10.f5029a = true;
                            throw e10;
                        }
                    }
                    byte[] bArr = new byte[i8];
                    System.arraycopy(this.f4890d, this.f4893g, bArr, 0, i14);
                    this.f4895i += this.f4891e;
                    this.f4893g = 0;
                    this.f4891e = 0;
                    while (i14 < i8) {
                        try {
                            int read = inputStream.read(bArr, i14, i8 - i14);
                            if (read != -1) {
                                this.f4895i += read;
                                i14 += read;
                            } else {
                                throw w2.f();
                            }
                        } catch (w2 e11) {
                            e11.f5029a = true;
                            throw e11;
                        }
                    }
                    return bArr;
                }
                A((i13 - i10) - i11);
                throw w2.f();
            }
            throw new w2("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw w2.d();
    }

    public final int H() {
        int i8 = this.f4893g;
        if (this.f4891e - i8 < 4) {
            D(4);
            i8 = this.f4893g;
        }
        this.f4893g = i8 + 4;
        byte[] bArr = this.f4890d;
        int i10 = (bArr[i8 + 1] & 255) << 8;
        return ((bArr[i8 + 3] & 255) << 24) | i10 | (bArr[i8] & 255) | ((bArr[i8 + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r3[r2] < 0) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int I() {
        /*
            r5 = this;
            int r0 = r5.f4893g
            int r1 = r5.f4891e
            if (r1 != r0) goto L_0x0007
            goto L_0x006d
        L_0x0007:
            int r2 = r0 + 1
            byte[] r3 = r5.f4890d
            byte r0 = r3[r0]
            if (r0 < 0) goto L_0x0012
            r5.f4893g = r2
            return r0
        L_0x0012:
            int r1 = r1 - r2
            r4 = 9
            if (r1 < r4) goto L_0x006d
            int r1 = r2 + 1
            byte r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006a
        L_0x0023:
            int r2 = r1 + 1
            byte r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r2
            goto L_0x006a
        L_0x0030:
            int r1 = r2 + 1
            byte r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x006a
        L_0x003e:
            int r2 = r1 + 1
            byte r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r2 + 1
            byte r2 = r3[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r1 + 1
            byte r1 = r3[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r2 + 1
            byte r2 = r3[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r1 + 1
            byte r1 = r3[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r2 + 1
            byte r2 = r3[r2]
            if (r2 >= 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            r5.f4893g = r1
            return r0
        L_0x006d:
            long r0 = r5.L()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.s1.I():int");
    }

    public final long J() {
        int i8 = this.f4893g;
        if (this.f4891e - i8 < 8) {
            D(8);
            i8 = this.f4893g;
        }
        this.f4893g = i8 + 8;
        byte[] bArr = this.f4890d;
        long j10 = (long) bArr[i8 + 2];
        long j11 = (long) bArr[i8 + 3];
        long j12 = (long) bArr[i8 + 4];
        long j13 = (long) bArr[i8 + 5];
        long j14 = (long) bArr[i8 + 6];
        long j15 = (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24);
        return ((((long) bArr[i8 + 7]) & 255) << 56) | j15 | ((j12 & 255) << 32) | ((j13 & 255) << 40) | ((j14 & 255) << 48);
    }

    public final long K() {
        long j10;
        long j11;
        long j12;
        long j13;
        byte b10;
        int i8 = this.f4893g;
        int i10 = this.f4891e;
        if (i10 != i8) {
            int i11 = i8 + 1;
            byte[] bArr = this.f4890d;
            byte b11 = bArr[i8];
            if (b11 >= 0) {
                this.f4893g = i11;
                return (long) b11;
            } else if (i10 - i11 >= 9) {
                int i12 = i11 + 1;
                byte b12 = b11 ^ (bArr[i11] << 7);
                if (b12 < 0) {
                    b10 = b12 ^ Byte.MIN_VALUE;
                } else {
                    int i13 = i12 + 1;
                    byte b13 = b12 ^ (bArr[i12] << 14);
                    if (b13 >= 0) {
                        j11 = (long) (b13 ^ 16256);
                    } else {
                        i12 = i13 + 1;
                        byte b14 = b13 ^ (bArr[i13] << 21);
                        if (b14 < 0) {
                            b10 = b14 ^ -2080896;
                        } else {
                            i13 = i12 + 1;
                            long j14 = ((long) b14) ^ (((long) bArr[i12]) << 28);
                            if (j14 >= 0) {
                                j13 = 266354560;
                            } else {
                                int i14 = i13 + 1;
                                long j15 = j14 ^ (((long) bArr[i13]) << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i13 = i14 + 1;
                                    j14 = j15 ^ (((long) bArr[i14]) << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i14 = i13 + 1;
                                        j15 = j14 ^ (((long) bArr[i13]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i13 = i14 + 1;
                                            j11 = (j15 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                i14 = i13 + 1;
                                                if (((long) bArr[i13]) >= 0) {
                                                    j10 = j11;
                                                    i12 = i14;
                                                    this.f4893g = i12;
                                                    return j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j12 ^ j15;
                                i12 = i14;
                                this.f4893g = i12;
                                return j10;
                            }
                            j11 = j14 ^ j13;
                        }
                    }
                    i12 = i13;
                    j10 = j11;
                    this.f4893g = i12;
                    return j10;
                }
                j10 = (long) b10;
                this.f4893g = i12;
                return j10;
            }
        }
        return L();
    }

    public final long L() {
        long j10 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            if (this.f4893g == this.f4891e) {
                D(1);
            }
            int i10 = this.f4893g;
            this.f4893g = i10 + 1;
            byte b10 = this.f4890d[i10];
            j10 |= ((long) (b10 & Byte.MAX_VALUE)) << i8;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw w2.c();
    }

    public final void a(int i8) {
        this.f4896j = i8;
        C();
    }

    public final boolean b() {
        return this.f4893g == this.f4891e && !E(1);
    }

    public final boolean c() {
        return K() != 0;
    }

    public final boolean d(int i8) {
        int p10;
        int i10 = i8 & 7;
        int i11 = 0;
        if (i10 == 0) {
            int i12 = this.f4891e - this.f4893g;
            byte[] bArr = this.f4890d;
            if (i12 >= 10) {
                while (i11 < 10) {
                    int i13 = this.f4893g;
                    this.f4893g = i13 + 1;
                    if (bArr[i13] < 0) {
                        i11++;
                    }
                }
                throw w2.c();
            }
            while (i11 < 10) {
                if (this.f4893g == this.f4891e) {
                    D(1);
                }
                int i14 = this.f4893g;
                this.f4893g = i14 + 1;
                if (bArr[i14] < 0) {
                    i11++;
                }
            }
            throw w2.c();
            return true;
        } else if (i10 == 1) {
            A(8);
            return true;
        } else if (i10 == 2) {
            A(I());
            return true;
        } else if (i10 == 3) {
            do {
                p10 = p();
                if (p10 == 0 || !d(p10)) {
                    z(((i8 >>> 3) << 3) | 4);
                }
                p10 = p();
                break;
            } while (!d(p10));
            z(((i8 >>> 3) << 3) | 4);
            return true;
        } else if (i10 == 4) {
            return false;
        } else {
            if (i10 == 5) {
                A(4);
                return true;
            }
            int i15 = w2.f5028b;
            throw new v2();
        }
    }

    public final double g() {
        return Double.longBitsToDouble(J());
    }

    public final float h() {
        return Float.intBitsToFloat(H());
    }

    public final int i() {
        return this.f4895i + this.f4893g;
    }

    public final int j(int i8) {
        if (i8 >= 0) {
            int i10 = this.f4895i + this.f4893g;
            int i11 = this.f4896j;
            int i12 = i8 + i10;
            if (i12 <= i11) {
                this.f4896j = i12;
                C();
                return i11;
            }
            throw w2.f();
        }
        throw w2.d();
    }

    public final int k() {
        return I();
    }

    public final int l() {
        return H();
    }

    public final int m() {
        return I();
    }

    public final int n() {
        return H();
    }

    public final int o() {
        return t1.e(I());
    }

    public final int p() {
        if (b()) {
            this.f4894h = 0;
            return 0;
        }
        int I = I();
        this.f4894h = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw new w2("Protocol message contained an invalid tag (zero).");
    }

    public final int q() {
        return I();
    }

    public final long r() {
        return J();
    }

    public final long s() {
        return K();
    }

    public final long t() {
        return J();
    }

    public final long u() {
        return t1.f(K());
    }

    public final long v() {
        return K();
    }

    public final p1 w() {
        int I = I();
        int i8 = this.f4891e;
        int i10 = this.f4893g;
        int i11 = i8 - i10;
        byte[] bArr = this.f4890d;
        if (I <= i11 && I > 0) {
            p1 l10 = q1.l(bArr, i10, I);
            this.f4893g += I;
            return l10;
        } else if (I == 0) {
            return q1.f4830b;
        } else {
            byte[] G = G(I);
            if (G != null) {
                return q1.l(G, 0, G.length);
            }
            int i12 = this.f4893g;
            int i13 = this.f4891e;
            int i14 = i13 - i12;
            this.f4895i += i13;
            this.f4893g = 0;
            this.f4891e = 0;
            ArrayList B = B(I - i14);
            byte[] bArr2 = new byte[I];
            System.arraycopy(bArr, i12, bArr2, 0, i14);
            Iterator it = B.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i14, length);
                i14 += length;
            }
            return new p1(bArr2);
        }
    }

    public final String x() {
        int I = I();
        byte[] bArr = this.f4890d;
        if (I > 0) {
            int i8 = this.f4891e;
            int i10 = this.f4893g;
            if (I <= i8 - i10) {
                String str = new String(bArr, i10, I, u2.f4974a);
                this.f4893g += I;
                return str;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I > this.f4891e) {
            return new String(F(I), u2.f4974a);
        }
        D(I);
        String str2 = new String(bArr, this.f4893g, I, u2.f4974a);
        this.f4893g += I;
        return str2;
    }

    public final String y() {
        int I = I();
        int i8 = this.f4893g;
        int i10 = this.f4891e;
        int i11 = i10 - i8;
        byte[] bArr = this.f4890d;
        if (I <= i11 && I > 0) {
            this.f4893g = i8 + I;
        } else if (I == 0) {
            return "";
        } else {
            i8 = 0;
            if (I <= i10) {
                D(I);
                this.f4893g = I;
            } else {
                bArr = F(I);
            }
        }
        return y4.d(bArr, i8, I);
    }

    public final void z(int i8) {
        if (this.f4894h != i8) {
            throw new w2("Protocol message end-group tag did not match expected tag.");
        }
    }
}
