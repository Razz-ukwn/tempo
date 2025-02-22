package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i1  reason: invalid package */
public final class i1 {
    public static int a(byte[] bArr, int i8, h1 h1Var) {
        int i10 = i(bArr, i8, h1Var);
        int i11 = h1Var.f4604a;
        if (i11 < 0) {
            throw w2.d();
        } else if (i11 > bArr.length - i10) {
            throw w2.f();
        } else if (i11 == 0) {
            h1Var.f4606c = q1.f4830b;
            return i10;
        } else {
            h1Var.f4606c = q1.l(bArr, i10, i11);
            return i10 + i11;
        }
    }

    public static int b(byte[] bArr, int i8) {
        int i10 = (bArr[i8 + 1] & 255) << 8;
        return ((bArr[i8 + 3] & 255) << 24) | i10 | (bArr[i8] & 255) | ((bArr[i8 + 2] & 255) << 16);
    }

    public static int c(z3 z3Var, byte[] bArr, int i8, int i10, int i11, h1 h1Var) {
        p2 zze = z3Var.zze();
        int m = m(zze, z3Var, bArr, i8, i10, i11, h1Var);
        z3Var.zzf(zze);
        h1Var.f4606c = zze;
        return m;
    }

    public static int d(z3 z3Var, int i8, byte[] bArr, int i10, int i11, t2 t2Var, h1 h1Var) {
        p2 zze = z3Var.zze();
        int n2 = n(zze, z3Var, bArr, i10, i11, h1Var);
        z3Var.zzf(zze);
        h1Var.f4606c = zze;
        t2Var.add(zze);
        while (n2 < i11) {
            int i12 = i(bArr, n2, h1Var);
            if (i8 != h1Var.f4604a) {
                break;
            }
            p2 zze2 = z3Var.zze();
            int n10 = n(zze2, z3Var, bArr, i12, i11, h1Var);
            z3Var.zzf(zze2);
            h1Var.f4606c = zze2;
            t2Var.add(zze2);
            n2 = n10;
        }
        return n2;
    }

    public static int e(byte[] bArr, int i8, t2 t2Var, h1 h1Var) {
        q2 q2Var = (q2) t2Var;
        int i10 = i(bArr, i8, h1Var);
        int i11 = h1Var.f4604a + i10;
        while (i10 < i11) {
            i10 = i(bArr, i10, h1Var);
            q2Var.b(h1Var.f4604a);
        }
        if (i10 == i11) {
            return i10;
        }
        throw w2.f();
    }

    public static int f(byte[] bArr, int i8, h1 h1Var) {
        int i10 = i(bArr, i8, h1Var);
        int i11 = h1Var.f4604a;
        if (i11 < 0) {
            throw w2.d();
        } else if (i11 == 0) {
            h1Var.f4606c = "";
            return i10;
        } else {
            h1Var.f4606c = new String(bArr, i10, i11, u2.f4974a);
            return i10 + i11;
        }
    }

    public static int g(byte[] bArr, int i8, h1 h1Var) {
        int i10 = i(bArr, i8, h1Var);
        int i11 = h1Var.f4604a;
        if (i11 < 0) {
            throw w2.d();
        } else if (i11 == 0) {
            h1Var.f4606c = "";
            return i10;
        } else {
            h1Var.f4606c = y4.d(bArr, i10, i11);
            return i10 + i11;
        }
    }

    public static int h(int i8, byte[] bArr, int i10, int i11, l4 l4Var, h1 h1Var) {
        if ((i8 >>> 3) != 0) {
            int i12 = i8 & 7;
            if (i12 == 0) {
                int l10 = l(bArr, i10, h1Var);
                l4Var.c(i8, Long.valueOf(h1Var.f4605b));
                return l10;
            } else if (i12 == 1) {
                l4Var.c(i8, Long.valueOf(o(bArr, i10)));
                return i10 + 8;
            } else if (i12 == 2) {
                int i13 = i(bArr, i10, h1Var);
                int i14 = h1Var.f4604a;
                if (i14 < 0) {
                    throw w2.d();
                } else if (i14 <= bArr.length - i13) {
                    if (i14 == 0) {
                        l4Var.c(i8, q1.f4830b);
                    } else {
                        l4Var.c(i8, q1.l(bArr, i13, i14));
                    }
                    return i13 + i14;
                } else {
                    throw w2.f();
                }
            } else if (i12 == 3) {
                int i15 = (i8 & -8) | 4;
                l4 b10 = l4.b();
                int i16 = 0;
                while (true) {
                    if (i10 >= i11) {
                        break;
                    }
                    int i17 = i(bArr, i10, h1Var);
                    int i18 = h1Var.f4604a;
                    if (i18 == i15) {
                        i16 = i18;
                        i10 = i17;
                        break;
                    }
                    i16 = i18;
                    i10 = h(i18, bArr, i17, i11, b10, h1Var);
                }
                if (i10 > i11 || i16 != i15) {
                    throw w2.e();
                }
                l4Var.c(i8, b10);
                return i10;
            } else if (i12 == 5) {
                l4Var.c(i8, Integer.valueOf(b(bArr, i10)));
                return i10 + 4;
            } else {
                throw new w2("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new w2("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int i(byte[] bArr, int i8, h1 h1Var) {
        int i10 = i8 + 1;
        byte b10 = bArr[i8];
        if (b10 < 0) {
            return j(b10, bArr, i10, h1Var);
        }
        h1Var.f4604a = b10;
        return i10;
    }

    public static int j(int i8, byte[] bArr, int i10, h1 h1Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i8 & 127;
        if (b10 >= 0) {
            h1Var.f4604a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            h1Var.f4604a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            h1Var.f4604a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            h1Var.f4604a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                h1Var.f4604a = i19;
                return i20;
            }
        }
    }

    public static int k(int i8, byte[] bArr, int i10, int i11, t2 t2Var, h1 h1Var) {
        q2 q2Var = (q2) t2Var;
        int i12 = i(bArr, i10, h1Var);
        q2Var.b(h1Var.f4604a);
        while (i12 < i11) {
            int i13 = i(bArr, i12, h1Var);
            if (i8 != h1Var.f4604a) {
                break;
            }
            i12 = i(bArr, i13, h1Var);
            q2Var.b(h1Var.f4604a);
        }
        return i12;
    }

    public static int l(byte[] bArr, int i8, h1 h1Var) {
        long j10 = (long) bArr[i8];
        int i10 = i8 + 1;
        if (j10 >= 0) {
            h1Var.f4605b = j10;
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
        h1Var.f4605b = j11;
        return i11;
    }

    public static int m(Object obj, z3 z3Var, byte[] bArr, int i8, int i10, int i11, h1 h1Var) {
        int A = ((r3) z3Var).A(obj, bArr, i8, i10, i11, h1Var);
        h1Var.f4606c = obj;
        return A;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int n(java.lang.Object r6, com.google.android.gms.internal.p000firebaseauthapi.z3 r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.p000firebaseauthapi.h1 r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = j(r9, r8, r0, r11)
            int r9 = r11.f4604a
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
            r0.e(r1, r2, r3, r4, r5)
            r11.f4606c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.firebase-auth-api.w2 r6 = com.google.android.gms.internal.p000firebaseauthapi.w2.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.i1.n(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.z3, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.h1):int");
    }

    public static long o(byte[] bArr, int i8) {
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((((long) bArr[i8 + 7]) & 255) << 56);
    }
}
