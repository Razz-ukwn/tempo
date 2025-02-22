package com.google.android.recaptcha.internal;

final class zzkl {
    private static final zzki zza = new zzkj();

    static {
        if (zzkg.zzx() && zzkg.zzy()) {
            int i8 = zzeu.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i8, int i10) {
        int i11 = i10 - i8;
        byte b10 = bArr[i8 - 1];
        if (i11 != 0) {
            if (i11 == 1) {
                byte b11 = bArr[i8];
                if (b10 <= -12 && b11 <= -65) {
                    return b10 ^ (b11 << 8);
                }
            } else if (i11 == 2) {
                byte b12 = bArr[i8];
                byte b13 = bArr[i8 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    return ((b12 << 8) ^ b10) ^ (b13 << 16);
                }
            } else {
                throw new AssertionError();
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            int r0 = r7.length()
            r1 = 0
        L_0x0005:
            int r2 = r9 + r10
            r3 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L_0x001b
            int r4 = r1 + r9
            if (r4 >= r2) goto L_0x001b
            char r5 = r7.charAt(r1)
            if (r5 >= r3) goto L_0x001b
            byte r2 = (byte) r5
            r8[r4] = r2
            int r1 = r1 + 1
            goto L_0x0005
        L_0x001b:
            if (r1 != r0) goto L_0x0020
            int r9 = r9 + r0
            goto L_0x00fc
        L_0x0020:
            int r9 = r9 + r1
        L_0x0021:
            if (r1 >= r0) goto L_0x00fc
            char r10 = r7.charAt(r1)
            if (r10 >= r3) goto L_0x0033
            if (r9 >= r2) goto L_0x0033
            int r4 = r9 + 1
            byte r10 = (byte) r10
            r8[r9] = r10
        L_0x0030:
            r9 = r4
            goto L_0x00b7
        L_0x0033:
            r4 = 2048(0x800, float:2.87E-42)
            if (r10 >= r4) goto L_0x004d
            int r4 = r2 + -2
            if (r9 > r4) goto L_0x004d
            int r4 = r9 + 1
            int r5 = r10 >>> 6
            r5 = r5 | 960(0x3c0, float:1.345E-42)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r4 + 1
            r10 = r10 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r8[r4] = r10
            goto L_0x00b7
        L_0x004d:
            r4 = 57343(0xdfff, float:8.0355E-41)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r5) goto L_0x0057
            if (r10 <= r4) goto L_0x0077
        L_0x0057:
            int r6 = r2 + -3
            if (r9 > r6) goto L_0x0077
            int r4 = r9 + 1
            int r5 = r10 >>> 12
            r5 = r5 | 480(0x1e0, float:6.73E-43)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r4 + 1
            int r5 = r10 >>> 6
            r5 = r5 & 63
            r5 = r5 | r3
            byte r5 = (byte) r5
            r8[r4] = r5
            int r4 = r9 + 1
            r10 = r10 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r8[r9] = r10
            goto L_0x0030
        L_0x0077:
            int r6 = r2 + -4
            if (r9 > r6) goto L_0x00c4
            int r4 = r1 + 1
            int r5 = r7.length()
            if (r4 == r5) goto L_0x00bc
            char r1 = r7.charAt(r4)
            boolean r5 = java.lang.Character.isSurrogatePair(r10, r1)
            if (r5 == 0) goto L_0x00bb
            int r10 = java.lang.Character.toCodePoint(r10, r1)
            int r1 = r9 + 1
            int r5 = r10 >>> 18
            r5 = r5 | 240(0xf0, float:3.36E-43)
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r1 + 1
            int r5 = r10 >>> 12
            r5 = r5 & 63
            r5 = r5 | r3
            byte r5 = (byte) r5
            r8[r1] = r5
            int r1 = r9 + 1
            int r5 = r10 >>> 6
            r5 = r5 & 63
            r5 = r5 | r3
            byte r5 = (byte) r5
            r8[r9] = r5
            int r9 = r1 + 1
            r10 = r10 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r8[r1] = r10
            r1 = r4
        L_0x00b7:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x00bb:
            r1 = r4
        L_0x00bc:
            com.google.android.recaptcha.internal.zzkk r7 = new com.google.android.recaptcha.internal.zzkk
            int r1 = r1 + -1
            r7.<init>(r1, r0)
            throw r7
        L_0x00c4:
            if (r10 < r5) goto L_0x00e0
            if (r10 > r4) goto L_0x00e0
            int r8 = r1 + 1
            int r2 = r7.length()
            if (r8 == r2) goto L_0x00da
            char r7 = r7.charAt(r8)
            boolean r7 = java.lang.Character.isSurrogatePair(r10, r7)
            if (r7 != 0) goto L_0x00e0
        L_0x00da:
            com.google.android.recaptcha.internal.zzkk r7 = new com.google.android.recaptcha.internal.zzkk
            r7.<init>(r1, r0)
            throw r7
        L_0x00e0:
            java.lang.ArrayIndexOutOfBoundsException r7 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed writing "
            r8.<init>(r0)
            r8.append(r10)
            java.lang.String r10 = " at index "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x00fc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkl.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i8 += (127 - charAt2) >>> 31;
                    } else {
                        i8 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new zzkk(i10, length2);
                            }
                        }
                    }
                    i10++;
                }
                i11 += i8;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i11) + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i8, int i10) {
        int i11;
        int length = bArr.length;
        if ((((length - i8) - i10) | i8 | i10) >= 0) {
            int i12 = i8 + i10;
            char[] cArr = new char[i10];
            int i13 = 0;
            while (r11 < i12) {
                byte b10 = bArr[r11];
                if (!zzkh.zzd(b10)) {
                    break;
                }
                i8 = r11 + 1;
                cArr[i11] = (char) b10;
                i13 = i11 + 1;
            }
            while (r11 < i12) {
                int i14 = r11 + 1;
                byte b11 = bArr[r11];
                if (zzkh.zzd(b11)) {
                    int i15 = i11 + 1;
                    cArr[i11] = (char) b11;
                    r11 = i14;
                    while (true) {
                        i11 = i15;
                        if (r11 >= i12) {
                            break;
                        }
                        byte b12 = bArr[r11];
                        if (!zzkh.zzd(b12)) {
                            break;
                        }
                        r11++;
                        i15 = i11 + 1;
                        cArr[i11] = (char) b12;
                    }
                } else if (b11 < -32) {
                    if (i14 < i12) {
                        zzkh.zzc(b11, bArr[i14], cArr, i11);
                        r11 = i14 + 1;
                        i11++;
                    } else {
                        throw zzhp.zzd();
                    }
                } else if (b11 < -16) {
                    if (i14 < i12 - 1) {
                        int i16 = i14 + 1;
                        zzkh.zzb(b11, bArr[i14], bArr[i16], cArr, i11);
                        r11 = i16 + 1;
                        i11++;
                    } else {
                        throw zzhp.zzd();
                    }
                } else if (i14 < i12 - 2) {
                    int i17 = i14 + 1;
                    byte b13 = bArr[i14];
                    int i18 = i17 + 1;
                    zzkh.zza(b11, b13, bArr[i17], bArr[i18], cArr, i11);
                    i11 += 2;
                    r11 = i18 + 1;
                } else {
                    throw zzhp.zzd();
                }
            }
            return new String(cArr, 0, i11);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i8), Integer.valueOf(i10)}));
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i8, int i10) {
        return zza.zzb(bArr, i8, i10);
    }
}
