package com.google.android.recaptcha.internal;

final class zzew {
    public static int zza(byte[] bArr, int i8, zzev zzev) {
        int zzj = zzj(bArr, i8, zzev);
        int i10 = zzev.zza;
        if (i10 < 0) {
            throw zzhp.zzf();
        } else if (i10 > bArr.length - zzj) {
            throw zzhp.zzj();
        } else if (i10 == 0) {
            zzev.zzc = zzfi.zzb;
            return zzj;
        } else {
            zzev.zzc = zzfi.zzm(bArr, zzj, i10);
            return zzj + i10;
        }
    }

    public static int zzb(byte[] bArr, int i8) {
        int i10 = (bArr[i8 + 1] & 255) << 8;
        return ((bArr[i8 + 3] & 255) << 24) | i10 | (bArr[i8] & 255) | ((bArr[i8 + 2] & 255) << 16);
    }

    public static int zzc(zzjc zzjc, byte[] bArr, int i8, int i10, int i11, zzev zzev) {
        Object zze = zzjc.zze();
        int zzn = zzn(zze, zzjc, bArr, i8, i10, i11, zzev);
        zzjc.zzf(zze);
        zzev.zzc = zze;
        return zzn;
    }

    public static int zzd(zzjc zzjc, byte[] bArr, int i8, int i10, zzev zzev) {
        Object zze = zzjc.zze();
        int zzo = zzo(zze, zzjc, bArr, i8, i10, zzev);
        zzjc.zzf(zze);
        zzev.zzc = zze;
        return zzo;
    }

    public static int zze(zzjc zzjc, int i8, byte[] bArr, int i10, int i11, zzhm zzhm, zzev zzev) {
        int zzd = zzd(zzjc, bArr, i10, i11, zzev);
        zzhm.add(zzev.zzc);
        while (zzd < i11) {
            int zzj = zzj(bArr, zzd, zzev);
            if (i8 != zzev.zza) {
                break;
            }
            zzd = zzd(zzjc, bArr, zzj, i11, zzev);
            zzhm.add(zzev.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i8, zzhm zzhm, zzev zzev) {
        zzhg zzhg = (zzhg) zzhm;
        int zzj = zzj(bArr, i8, zzev);
        int i10 = zzev.zza + zzj;
        while (zzj < i10) {
            zzj = zzj(bArr, zzj, zzev);
            zzhg.zzg(zzev.zza);
        }
        if (zzj == i10) {
            return zzj;
        }
        throw zzhp.zzj();
    }

    public static int zzg(byte[] bArr, int i8, zzev zzev) {
        int zzj = zzj(bArr, i8, zzev);
        int i10 = zzev.zza;
        if (i10 < 0) {
            throw zzhp.zzf();
        } else if (i10 == 0) {
            zzev.zzc = "";
            return zzj;
        } else {
            zzev.zzc = new String(bArr, zzj, i10, zzhn.zzb);
            return zzj + i10;
        }
    }

    public static int zzh(byte[] bArr, int i8, zzev zzev) {
        int zzj = zzj(bArr, i8, zzev);
        int i10 = zzev.zza;
        if (i10 < 0) {
            throw zzhp.zzf();
        } else if (i10 == 0) {
            zzev.zzc = "";
            return zzj;
        } else {
            zzev.zzc = zzkl.zzd(bArr, zzj, i10);
            return zzj + i10;
        }
    }

    public static int zzi(int i8, byte[] bArr, int i10, int i11, zzjx zzjx, zzev zzev) {
        if ((i8 >>> 3) != 0) {
            int i12 = i8 & 7;
            if (i12 == 0) {
                int zzm = zzm(bArr, i10, zzev);
                zzjx.zzj(i8, Long.valueOf(zzev.zzb));
                return zzm;
            } else if (i12 == 1) {
                zzjx.zzj(i8, Long.valueOf(zzq(bArr, i10)));
                return i10 + 8;
            } else if (i12 == 2) {
                int zzj = zzj(bArr, i10, zzev);
                int i13 = zzev.zza;
                if (i13 < 0) {
                    throw zzhp.zzf();
                } else if (i13 <= bArr.length - zzj) {
                    if (i13 == 0) {
                        zzjx.zzj(i8, zzfi.zzb);
                    } else {
                        zzjx.zzj(i8, zzfi.zzm(bArr, zzj, i13));
                    }
                    return zzj + i13;
                } else {
                    throw zzhp.zzj();
                }
            } else if (i12 == 3) {
                int i14 = (i8 & -8) | 4;
                zzjx zzf = zzjx.zzf();
                int i15 = 0;
                while (true) {
                    if (i10 >= i11) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i10, zzev);
                    int i16 = zzev.zza;
                    i15 = i16;
                    if (i16 == i14) {
                        i10 = zzj2;
                        break;
                    }
                    int zzi = zzi(i15, bArr, zzj2, i11, zzf, zzev);
                    i15 = i16;
                    i10 = zzi;
                }
                if (i10 > i11 || i15 != i14) {
                    throw zzhp.zzg();
                }
                zzjx.zzj(i8, zzf);
                return i10;
            } else if (i12 == 5) {
                zzjx.zzj(i8, Integer.valueOf(zzb(bArr, i10)));
                return i10 + 4;
            } else {
                throw zzhp.zzc();
            }
        } else {
            throw zzhp.zzc();
        }
    }

    public static int zzj(byte[] bArr, int i8, zzev zzev) {
        int i10 = i8 + 1;
        byte b10 = bArr[i8];
        if (b10 < 0) {
            return zzk(b10, bArr, i10, zzev);
        }
        zzev.zza = b10;
        return i10;
    }

    public static int zzk(int i8, byte[] bArr, int i10, zzev zzev) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i8 & 127;
        if (b10 >= 0) {
            zzev.zza = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzev.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzev.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzev.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                zzev.zza = i19;
                return i20;
            }
        }
    }

    public static int zzl(int i8, byte[] bArr, int i10, int i11, zzhm zzhm, zzev zzev) {
        zzhg zzhg = (zzhg) zzhm;
        int zzj = zzj(bArr, i10, zzev);
        zzhg.zzg(zzev.zza);
        while (zzj < i11) {
            int zzj2 = zzj(bArr, zzj, zzev);
            if (i8 != zzev.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzev);
            zzhg.zzg(zzev.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i8, zzev zzev) {
        long j10 = (long) bArr[i8];
        int i10 = i8 + 1;
        if (j10 >= 0) {
            zzev.zzb = j10;
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
        zzev.zzb = j11;
        return i11;
    }

    public static int zzn(Object obj, zzjc zzjc, byte[] bArr, int i8, int i10, int i11, zzev zzev) {
        int zzc = ((zzis) zzjc).zzc(obj, bArr, i8, i10, i11, zzev);
        zzev.zzc = obj;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzo(java.lang.Object r6, com.google.android.recaptcha.internal.zzjc r7, byte[] r8, int r9, int r10, com.google.android.recaptcha.internal.zzev r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zzk(r9, r8, r0, r11)
            int r9 = r11.zza
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
            r0.zzi(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L_0x001e:
            com.google.android.recaptcha.internal.zzhp r6 = com.google.android.recaptcha.internal.zzhp.zzj()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzew.zzo(java.lang.Object, com.google.android.recaptcha.internal.zzjc, byte[], int, int, com.google.android.recaptcha.internal.zzev):int");
    }

    public static int zzp(int i8, byte[] bArr, int i10, int i11, zzev zzev) {
        if ((i8 >>> 3) != 0) {
            int i12 = i8 & 7;
            if (i12 == 0) {
                return zzm(bArr, i10, zzev);
            }
            if (i12 == 1) {
                return i10 + 8;
            }
            if (i12 == 2) {
                return zzj(bArr, i10, zzev) + zzev.zza;
            }
            if (i12 == 3) {
                int i13 = (i8 & -8) | 4;
                int i14 = 0;
                while (i10 < i11) {
                    i10 = zzj(bArr, i10, zzev);
                    i14 = zzev.zza;
                    if (i14 == i13) {
                        break;
                    }
                    i10 = zzp(i14, bArr, i10, i11, zzev);
                }
                if (i10 <= i11 && i14 == i13) {
                    return i10;
                }
                throw zzhp.zzg();
            } else if (i12 == 5) {
                return i10 + 4;
            } else {
                throw zzhp.zzc();
            }
        } else {
            throw zzhp.zzc();
        }
    }

    public static long zzq(byte[] bArr, int i8) {
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((((long) bArr[i8 + 7]) & 255) << 56);
    }
}
