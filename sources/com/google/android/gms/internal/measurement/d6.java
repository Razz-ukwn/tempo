package com.google.android.gms.internal.measurement;

import ag.m;

public final class d6 {
    public static int a(byte[] bArr, int i8, c6 c6Var) {
        int i10 = i(bArr, i8, c6Var);
        int i11 = c6Var.f5174a;
        if (i11 < 0) {
            throw o7.b();
        } else if (i11 > bArr.length - i10) {
            throw o7.d();
        } else if (i11 == 0) {
            c6Var.f5176c = k6.f5359b;
            return i10;
        } else {
            c6Var.f5176c = k6.j(bArr, i10, i11);
            return i10 + i11;
        }
    }

    public static int b(byte[] bArr, int i8) {
        int i10 = (bArr[i8 + 1] & 255) << 8;
        return ((bArr[i8 + 3] & 255) << 24) | i10 | (bArr[i8] & 255) | ((bArr[i8 + 2] & 255) << 16);
    }

    public static int c(s8 s8Var, byte[] bArr, int i8, int i10, int i11, c6 c6Var) {
        g7 zze = s8Var.zze();
        int m = m(zze, s8Var, bArr, i8, i10, i11, c6Var);
        s8Var.zzf(zze);
        c6Var.f5176c = zze;
        return m;
    }

    public static int d(s8 s8Var, int i8, byte[] bArr, int i10, int i11, l7 l7Var, c6 c6Var) {
        g7 zze = s8Var.zze();
        int n2 = n(zze, s8Var, bArr, i10, i11, c6Var);
        s8Var.zzf(zze);
        c6Var.f5176c = zze;
        l7Var.add(zze);
        while (n2 < i11) {
            int i12 = i(bArr, n2, c6Var);
            if (i8 != c6Var.f5174a) {
                break;
            }
            g7 zze2 = s8Var.zze();
            int n10 = n(zze2, s8Var, bArr, i12, i11, c6Var);
            s8Var.zzf(zze2);
            c6Var.f5176c = zze2;
            l7Var.add(zze2);
            n2 = n10;
        }
        return n2;
    }

    public static int e(byte[] bArr, int i8, l7 l7Var, c6 c6Var) {
        h7 h7Var = (h7) l7Var;
        int i10 = i(bArr, i8, c6Var);
        int i11 = c6Var.f5174a + i10;
        while (i10 < i11) {
            i10 = i(bArr, i10, c6Var);
            h7Var.b(c6Var.f5174a);
        }
        if (i10 == i11) {
            return i10;
        }
        throw o7.d();
    }

    public static int f(byte[] bArr, int i8, c6 c6Var) {
        int i10 = i(bArr, i8, c6Var);
        int i11 = c6Var.f5174a;
        if (i11 < 0) {
            throw o7.b();
        } else if (i11 == 0) {
            c6Var.f5176c = "";
            return i10;
        } else {
            c6Var.f5176c = new String(bArr, i10, i11, m7.f5399a);
            return i10 + i11;
        }
    }

    public static int g(byte[] bArr, int i8, c6 c6Var) {
        int i10;
        int i11;
        int i12 = i(bArr, i8, c6Var);
        int i13 = c6Var.f5174a;
        if (i13 < 0) {
            throw o7.b();
        } else if (i13 == 0) {
            c6Var.f5176c = "";
            return i12;
        } else {
            p9 p9Var = r9.f5506a;
            int length = bArr.length;
            if ((((length - i12) - i13) | i12 | i13) >= 0) {
                int i14 = i12 + i13;
                char[] cArr = new char[i13];
                int i15 = 0;
                while (i10 < i14) {
                    byte b10 = bArr[i10];
                    if (!(b10 >= 0)) {
                        break;
                    }
                    i12 = i10 + 1;
                    cArr[i11] = (char) b10;
                    i15 = i11 + 1;
                }
                while (i10 < i14) {
                    int i16 = i10 + 1;
                    byte b11 = bArr[i10];
                    if (b11 >= 0) {
                        int i17 = i11 + 1;
                        cArr[i11] = (char) b11;
                        i10 = i16;
                        while (true) {
                            i11 = i17;
                            if (i10 < i14) {
                                byte b12 = bArr[i10];
                                if (!(b12 >= 0)) {
                                    break;
                                }
                                i10++;
                                i17 = i11 + 1;
                                cArr[i11] = (char) b12;
                            } else {
                                break;
                            }
                        }
                    } else if (b11 < -32) {
                        if (i16 < i14) {
                            int i18 = i16 + 1;
                            byte b13 = bArr[i16];
                            int i19 = i11 + 1;
                            if (b11 < -62 || m.L(b13)) {
                                throw o7.a();
                            }
                            cArr[i11] = (char) (((b11 & 31) << 6) | (b13 & 63));
                            i10 = i18;
                            i11 = i19;
                        } else {
                            throw o7.a();
                        }
                    } else if (b11 < -16) {
                        if (i16 < i14 - 1) {
                            int i20 = i16 + 1;
                            byte b14 = bArr[i16];
                            int i21 = i20 + 1;
                            byte b15 = bArr[i20];
                            int i22 = i11 + 1;
                            if (!m.L(b14)) {
                                if (b11 == -32) {
                                    if (b14 >= -96) {
                                        b11 = -32;
                                    }
                                }
                                if (b11 == -19) {
                                    if (b14 < -96) {
                                        b11 = -19;
                                    }
                                }
                                if (!m.L(b15)) {
                                    cArr[i11] = (char) (((b11 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                                    i10 = i21;
                                    i11 = i22;
                                }
                            }
                            throw o7.a();
                        }
                        throw o7.a();
                    } else if (i16 < i14 - 2) {
                        int i23 = i16 + 1;
                        byte b16 = bArr[i16];
                        int i24 = i23 + 1;
                        byte b17 = bArr[i23];
                        int i25 = i24 + 1;
                        byte b18 = bArr[i24];
                        if (!m.L(b16)) {
                            if ((((b16 + 112) + (b11 << 28)) >> 30) == 0 && !m.L(b17) && !m.L(b18)) {
                                byte b19 = ((b11 & 7) << 18) | ((b16 & 63) << 12) | ((b17 & 63) << 6) | (b18 & 63);
                                cArr[i11] = (char) ((b19 >>> 10) + 55232);
                                cArr[i11 + 1] = (char) ((b19 & 1023) + 56320);
                                i11 += 2;
                                i10 = i25;
                            }
                        }
                        throw o7.a();
                    } else {
                        throw o7.a();
                    }
                }
                c6Var.f5176c = new String(cArr, 0, i11);
                return i14;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i12), Integer.valueOf(i13)}));
        }
    }

    public static int h(int i8, byte[] bArr, int i10, int i11, e9 e9Var, c6 c6Var) {
        if ((i8 >>> 3) != 0) {
            int i12 = i8 & 7;
            if (i12 == 0) {
                int l10 = l(bArr, i10, c6Var);
                e9Var.c(i8, Long.valueOf(c6Var.f5175b));
                return l10;
            } else if (i12 == 1) {
                e9Var.c(i8, Long.valueOf(o(bArr, i10)));
                return i10 + 8;
            } else if (i12 == 2) {
                int i13 = i(bArr, i10, c6Var);
                int i14 = c6Var.f5174a;
                if (i14 < 0) {
                    throw o7.b();
                } else if (i14 <= bArr.length - i13) {
                    if (i14 == 0) {
                        e9Var.c(i8, k6.f5359b);
                    } else {
                        e9Var.c(i8, k6.j(bArr, i13, i14));
                    }
                    return i13 + i14;
                } else {
                    throw o7.d();
                }
            } else if (i12 == 3) {
                int i15 = (i8 & -8) | 4;
                e9 b10 = e9.b();
                int i16 = 0;
                while (true) {
                    if (i10 >= i11) {
                        break;
                    }
                    int i17 = i(bArr, i10, c6Var);
                    int i18 = c6Var.f5174a;
                    if (i18 == i15) {
                        i16 = i18;
                        i10 = i17;
                        break;
                    }
                    i16 = i18;
                    i10 = h(i18, bArr, i17, i11, b10, c6Var);
                }
                if (i10 > i11 || i16 != i15) {
                    throw o7.c();
                }
                e9Var.c(i8, b10);
                return i10;
            } else if (i12 == 5) {
                e9Var.c(i8, Integer.valueOf(b(bArr, i10)));
                return i10 + 4;
            } else {
                throw new o7("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new o7("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int i(byte[] bArr, int i8, c6 c6Var) {
        int i10 = i8 + 1;
        byte b10 = bArr[i8];
        if (b10 < 0) {
            return j(b10, bArr, i10, c6Var);
        }
        c6Var.f5174a = b10;
        return i10;
    }

    public static int j(int i8, byte[] bArr, int i10, c6 c6Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i8 & 127;
        if (b10 >= 0) {
            c6Var.f5174a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            c6Var.f5174a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            c6Var.f5174a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            c6Var.f5174a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                c6Var.f5174a = i19;
                return i20;
            }
        }
    }

    public static int k(int i8, byte[] bArr, int i10, int i11, l7 l7Var, c6 c6Var) {
        h7 h7Var = (h7) l7Var;
        int i12 = i(bArr, i10, c6Var);
        h7Var.b(c6Var.f5174a);
        while (i12 < i11) {
            int i13 = i(bArr, i12, c6Var);
            if (i8 != c6Var.f5174a) {
                break;
            }
            i12 = i(bArr, i13, c6Var);
            h7Var.b(c6Var.f5174a);
        }
        return i12;
    }

    public static int l(byte[] bArr, int i8, c6 c6Var) {
        long j10 = (long) bArr[i8];
        int i10 = i8 + 1;
        if (j10 >= 0) {
            c6Var.f5175b = j10;
            return i10;
        }
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i12;
            byte b12 = b11;
            i11 = i13;
            b10 = b12;
        }
        c6Var.f5175b = j11;
        return i11;
    }

    public static int m(Object obj, s8 s8Var, byte[] bArr, int i8, int i10, int i11, c6 c6Var) {
        int v3 = ((k8) s8Var).v(obj, bArr, i8, i10, i11, c6Var);
        c6Var.f5176c = obj;
        return v3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int n(java.lang.Object r6, com.google.android.gms.internal.measurement.s8 r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.c6 r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = j(r9, r8, r0, r11)
            int r9 = r11.f5174a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.d(r1, r2, r3, r4, r5)
            r11.f5176c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.measurement.o7 r6 = com.google.android.gms.internal.measurement.o7.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d6.n(java.lang.Object, com.google.android.gms.internal.measurement.s8, byte[], int, int, com.google.android.gms.internal.measurement.c6):int");
    }

    public static long o(byte[] bArr, int i8) {
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((((long) bArr[i8 + 7]) & 255) << 56);
    }
}
