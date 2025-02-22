package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r1  reason: invalid package */
public final class r1 extends t1 {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f4853c;

    /* renamed from: d  reason: collision with root package name */
    public int f4854d;

    /* renamed from: e  reason: collision with root package name */
    public int f4855e;

    /* renamed from: f  reason: collision with root package name */
    public int f4856f;

    /* renamed from: g  reason: collision with root package name */
    public int f4857g;

    /* renamed from: h  reason: collision with root package name */
    public int f4858h = Integer.MAX_VALUE;

    public /* synthetic */ r1(byte[] bArr, int i8) {
        this.f4853c = bArr;
        this.f4854d = i8;
        this.f4856f = 0;
    }

    public final void A(int i8) {
        if (i8 >= 0) {
            int i10 = this.f4854d;
            int i11 = this.f4856f;
            if (i8 <= i10 - i11) {
                this.f4856f = i11 + i8;
                return;
            }
        }
        if (i8 < 0) {
            throw w2.d();
        }
        throw w2.f();
    }

    public final int B() {
        int i8 = this.f4856f;
        if (this.f4854d - i8 >= 4) {
            this.f4856f = i8 + 4;
            byte[] bArr = this.f4853c;
            int i10 = (bArr[i8 + 1] & 255) << 8;
            return ((bArr[i8 + 3] & 255) << 24) | i10 | (bArr[i8] & 255) | ((bArr[i8 + 2] & 255) << 16);
        }
        throw w2.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r3[r2] < 0) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int C() {
        /*
            r5 = this;
            int r0 = r5.f4856f
            int r1 = r5.f4854d
            if (r1 != r0) goto L_0x0007
            goto L_0x006d
        L_0x0007:
            int r2 = r0 + 1
            byte[] r3 = r5.f4853c
            byte r0 = r3[r0]
            if (r0 < 0) goto L_0x0012
            r5.f4856f = r2
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
            r5.f4856f = r1
            return r0
        L_0x006d:
            long r0 = r5.F()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.r1.C():int");
    }

    public final long D() {
        int i8 = this.f4856f;
        if (this.f4854d - i8 >= 8) {
            this.f4856f = i8 + 8;
            byte[] bArr = this.f4853c;
            long j10 = (long) bArr[i8 + 2];
            long j11 = (long) bArr[i8 + 3];
            long j12 = (long) bArr[i8 + 4];
            long j13 = (long) bArr[i8 + 5];
            long j14 = (long) bArr[i8 + 6];
            long j15 = (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24);
            return ((((long) bArr[i8 + 7]) & 255) << 56) | j15 | ((j12 & 255) << 32) | ((j13 & 255) << 40) | ((j14 & 255) << 48);
        }
        throw w2.f();
    }

    public final long E() {
        long j10;
        long j11;
        long j12;
        long j13;
        byte b10;
        int i8 = this.f4856f;
        int i10 = this.f4854d;
        if (i10 != i8) {
            int i11 = i8 + 1;
            byte[] bArr = this.f4853c;
            byte b11 = bArr[i8];
            if (b11 >= 0) {
                this.f4856f = i11;
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
                                                    this.f4856f = i12;
                                                    return j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j12 ^ j15;
                                i12 = i14;
                                this.f4856f = i12;
                                return j10;
                            }
                            j11 = j14 ^ j13;
                        }
                    }
                    i12 = i13;
                    j10 = j11;
                    this.f4856f = i12;
                    return j10;
                }
                j10 = (long) b10;
                this.f4856f = i12;
                return j10;
            }
        }
        return F();
    }

    public final long F() {
        int i8 = 0;
        long j10 = 0;
        while (i8 < 64) {
            int i10 = this.f4856f;
            if (i10 != this.f4854d) {
                this.f4856f = i10 + 1;
                byte b10 = this.f4853c[i10];
                j10 |= ((long) (b10 & Byte.MAX_VALUE)) << i8;
                if ((b10 & 128) == 0) {
                    return j10;
                }
                i8 += 7;
            } else {
                throw w2.f();
            }
        }
        throw w2.c();
    }

    public final void a(int i8) {
        this.f4858h = i8;
        int i10 = this.f4854d + this.f4855e;
        this.f4854d = i10;
        if (i10 > i8) {
            int i11 = i10 - i8;
            this.f4855e = i11;
            this.f4854d = i10 - i11;
            return;
        }
        this.f4855e = 0;
    }

    public final boolean b() {
        return this.f4856f == this.f4854d;
    }

    public final boolean c() {
        return E() != 0;
    }

    public final boolean d(int i8) {
        int p10;
        int i10 = i8 & 7;
        int i11 = 0;
        if (i10 == 0) {
            int i12 = this.f4854d - this.f4856f;
            byte[] bArr = this.f4853c;
            if (i12 >= 10) {
                while (i11 < 10) {
                    int i13 = this.f4856f;
                    this.f4856f = i13 + 1;
                    if (bArr[i13] < 0) {
                        i11++;
                    }
                }
                throw w2.c();
            }
            while (i11 < 10) {
                int i14 = this.f4856f;
                if (i14 != this.f4854d) {
                    this.f4856f = i14 + 1;
                    if (bArr[i14] < 0) {
                        i11++;
                    }
                } else {
                    throw w2.f();
                }
            }
            throw w2.c();
            return true;
        } else if (i10 == 1) {
            A(8);
            return true;
        } else if (i10 == 2) {
            A(C());
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
        return Double.longBitsToDouble(D());
    }

    public final float h() {
        return Float.intBitsToFloat(B());
    }

    public final int i() {
        return this.f4856f;
    }

    public final int j(int i8) {
        if (i8 >= 0) {
            int i10 = i8 + this.f4856f;
            if (i10 >= 0) {
                int i11 = this.f4858h;
                if (i10 <= i11) {
                    this.f4858h = i10;
                    int i12 = this.f4854d + this.f4855e;
                    this.f4854d = i12;
                    if (i12 > i10) {
                        int i13 = i12 - i10;
                        this.f4855e = i13;
                        this.f4854d = i12 - i13;
                    } else {
                        this.f4855e = 0;
                    }
                    return i11;
                }
                throw w2.f();
            }
            throw w2.e();
        }
        throw w2.d();
    }

    public final int k() {
        return C();
    }

    public final int l() {
        return B();
    }

    public final int m() {
        return C();
    }

    public final int n() {
        return B();
    }

    public final int o() {
        return t1.e(C());
    }

    public final int p() {
        if (b()) {
            this.f4857g = 0;
            return 0;
        }
        int C = C();
        this.f4857g = C;
        if ((C >>> 3) != 0) {
            return C;
        }
        throw new w2("Protocol message contained an invalid tag (zero).");
    }

    public final int q() {
        return C();
    }

    public final long r() {
        return D();
    }

    public final long s() {
        return E();
    }

    public final long t() {
        return D();
    }

    public final long u() {
        return t1.f(E());
    }

    public final long v() {
        return E();
    }

    public final p1 w() {
        int C = C();
        byte[] bArr = this.f4853c;
        if (C > 0) {
            int i8 = this.f4854d;
            int i10 = this.f4856f;
            if (C <= i8 - i10) {
                p1 l10 = q1.l(bArr, i10, C);
                this.f4856f += C;
                return l10;
            }
        }
        if (C == 0) {
            return q1.f4830b;
        }
        if (C > 0) {
            int i11 = this.f4854d;
            int i12 = this.f4856f;
            if (C <= i11 - i12) {
                int i13 = C + i12;
                this.f4856f = i13;
                return new p1(Arrays.copyOfRange(bArr, i12, i13));
            }
        }
        if (C <= 0) {
            throw w2.d();
        }
        throw w2.f();
    }

    public final String x() {
        int C = C();
        if (C > 0) {
            int i8 = this.f4854d;
            int i10 = this.f4856f;
            if (C <= i8 - i10) {
                String str = new String(this.f4853c, i10, C, u2.f4974a);
                this.f4856f += C;
                return str;
            }
        }
        if (C == 0) {
            return "";
        }
        if (C < 0) {
            throw w2.d();
        }
        throw w2.f();
    }

    public final String y() {
        int C = C();
        if (C > 0) {
            int i8 = this.f4854d;
            int i10 = this.f4856f;
            if (C <= i8 - i10) {
                String d10 = y4.d(this.f4853c, i10, C);
                this.f4856f += C;
                return d10;
            }
        }
        if (C == 0) {
            return "";
        }
        if (C <= 0) {
            throw w2.d();
        }
        throw w2.f();
    }

    public final void z(int i8) {
        if (this.f4857g != i8) {
            throw new w2("Protocol message end-group tag did not match expected tag.");
        }
    }
}
