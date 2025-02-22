package com.google.android.recaptcha.internal;

import d.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class zzfm extends zzfo {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl = Integer.MAX_VALUE;

    public /* synthetic */ zzfm(InputStream inputStream, int i8, zzfl zzfl) {
        super((zzfn) null);
        byte[] bArr = zzhn.zzd;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i8) {
        ArrayList arrayList = new ArrayList();
        while (i8 > 0) {
            int min = Math.min(i8, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.zze.read(bArr, i10, min - i10);
                if (read != -1) {
                    this.zzk += read;
                    i10 += read;
                } else {
                    throw zzhp.zzj();
                }
            }
            i8 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i8 = this.zzg + this.zzh;
        this.zzg = i8;
        int i10 = this.zzk + i8;
        int i11 = this.zzl;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.zzh = i12;
            this.zzg = i8 - i12;
            return;
        }
        this.zzh = 0;
    }

    private final void zzK(int i8) {
        if (zzL(i8)) {
            return;
        }
        if (i8 > (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw zzhp.zzi();
        }
        throw zzhp.zzj();
    }

    private final boolean zzL(int i8) {
        int i10 = this.zzi;
        int i11 = i10 + i8;
        int i12 = this.zzg;
        if (i11 > i12) {
            int i13 = this.zzk;
            if (i8 > (Integer.MAX_VALUE - i13) - i10 || i13 + i10 + i8 > this.zzl) {
                return false;
            }
            if (i10 > 0) {
                if (i12 > i10) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                i13 = this.zzk + i10;
                this.zzk = i13;
                i12 = this.zzg - i10;
                this.zzg = i12;
                this.zzi = 0;
            }
            try {
                int read = this.zze.read(this.zzf, i12, Math.min(4096 - i12, (Integer.MAX_VALUE - i13) - i12));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.zzg += read;
                    zzJ();
                    if (this.zzg >= i8) {
                        return true;
                    }
                    return zzL(i8);
                }
            } catch (zzhp e10) {
                e10.zzk();
                throw e10;
            }
        } else {
            throw new IllegalStateException(a.a("refillBuffer() called when ", i8, " bytes were already available in buffer"));
        }
    }

    private final byte[] zzM(int i8, boolean z10) {
        byte[] zzN = zzN(i8);
        if (zzN != null) {
            return zzN;
        }
        int i10 = this.zzi;
        int i11 = this.zzg;
        int i12 = i11 - i10;
        this.zzk += i11;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzI = zzI(i8 - i12);
        byte[] bArr = new byte[i8];
        System.arraycopy(this.zzf, i10, bArr, 0, i12);
        for (byte[] bArr2 : zzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i8) {
        if (i8 == 0) {
            return zzhn.zzd;
        }
        if (i8 >= 0) {
            int i10 = this.zzk;
            int i11 = this.zzi;
            int i12 = i10 + i11 + i8;
            if (-2147483647 + i12 <= 0) {
                int i13 = this.zzl;
                if (i12 <= i13) {
                    int i14 = this.zzg - i11;
                    int i15 = i8 - i14;
                    if (i15 >= 4096) {
                        try {
                            if (i15 > this.zze.available()) {
                                return null;
                            }
                        } catch (zzhp e10) {
                            e10.zzk();
                            throw e10;
                        }
                    }
                    byte[] bArr = new byte[i8];
                    System.arraycopy(this.zzf, this.zzi, bArr, 0, i14);
                    this.zzk += this.zzg;
                    this.zzi = 0;
                    this.zzg = 0;
                    while (i14 < i8) {
                        try {
                            int read = this.zze.read(bArr, i14, i8 - i14);
                            if (read != -1) {
                                this.zzk += read;
                                i14 += read;
                            } else {
                                throw zzhp.zzj();
                            }
                        } catch (zzhp e11) {
                            e11.zzk();
                            throw e11;
                        }
                    }
                    return bArr;
                }
                zzB((i13 - i10) - i11);
                throw zzhp.zzj();
            }
            throw zzhp.zzi();
        }
        throw zzhp.zzf();
    }

    public final void zzA(int i8) {
        this.zzl = i8;
        zzJ();
    }

    public final void zzB(int i8) {
        int i10 = this.zzg;
        int i11 = this.zzi;
        int i12 = i10 - i11;
        if (i8 <= i12 && i8 >= 0) {
            this.zzi = i11 + i8;
        } else if (i8 >= 0) {
            int i13 = this.zzk;
            int i14 = i13 + i11;
            int i15 = this.zzl;
            if (i14 + i8 <= i15) {
                this.zzk = i14;
                this.zzg = 0;
                this.zzi = 0;
                while (i12 < i8) {
                    try {
                        long j10 = (long) (i8 - i12);
                        long skip = this.zze.skip(j10);
                        int i16 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i16 < 0 || skip > j10) {
                            throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (i16 == 0) {
                            break;
                        } else {
                            i12 += (int) skip;
                        }
                    } catch (zzhp e10) {
                        e10.zzk();
                        throw e10;
                    } catch (Throwable th) {
                        this.zzk += i12;
                        zzJ();
                        throw th;
                    }
                }
                this.zzk += i12;
                zzJ();
                if (i12 < i8) {
                    int i17 = this.zzg;
                    int i18 = i17 - this.zzi;
                    this.zzi = i17;
                    zzK(1);
                    while (true) {
                        int i19 = i8 - i18;
                        int i20 = this.zzg;
                        if (i19 > i20) {
                            i18 += i20;
                            this.zzi = i20;
                            zzK(1);
                        } else {
                            this.zzi = i19;
                            return;
                        }
                    }
                }
            } else {
                zzB((i15 - i13) - i11);
                throw zzhp.zzj();
            }
        } else {
            throw zzhp.zzf();
        }
    }

    public final boolean zzC() {
        return this.zzi == this.zzg && !zzL(1);
    }

    public final boolean zzD() {
        return zzr() != 0;
    }

    public final boolean zzE(int i8) {
        int zzm;
        int i10 = i8 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzg - this.zzi >= 10) {
                while (i11 < 10) {
                    byte[] bArr = this.zzf;
                    int i12 = this.zzi;
                    this.zzi = i12 + 1;
                    if (bArr[i12] < 0) {
                        i11++;
                    }
                }
                throw zzhp.zze();
            }
            while (i11 < 10) {
                if (zza() < 0) {
                    i11++;
                }
            }
            throw zzhp.zze();
            return true;
        } else if (i10 == 1) {
            zzB(8);
            return true;
        } else if (i10 == 2) {
            zzB(zzj());
            return true;
        } else if (i10 == 3) {
            do {
                zzm = zzm();
                if (zzm == 0 || !zzE(zzm)) {
                    zzz(((i8 >>> 3) << 3) | 4);
                }
                zzm = zzm();
                break;
            } while (!zzE(zzm));
            zzz(((i8 >>> 3) << 3) | 4);
            return true;
        } else if (i10 == 4) {
            return false;
        } else {
            if (i10 == 5) {
                zzB(4);
                return true;
            }
            throw zzhp.zza();
        }
    }

    public final byte zza() {
        if (this.zzi == this.zzg) {
            zzK(1);
        }
        byte[] bArr = this.zzf;
        int i8 = this.zzi;
        this.zzi = i8 + 1;
        return bArr[i8];
    }

    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    public final int zzd() {
        return this.zzk + this.zzi;
    }

    public final int zze(int i8) {
        if (i8 >= 0) {
            int i10 = this.zzk + this.zzi;
            int i11 = this.zzl;
            int i12 = i8 + i10;
            if (i12 <= i11) {
                this.zzl = i12;
                zzJ();
                return i11;
            }
            throw zzhp.zzj();
        }
        throw zzhp.zzf();
    }

    public final int zzf() {
        return zzj();
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        int i8 = this.zzi;
        if (this.zzg - i8 < 4) {
            zzK(4);
            i8 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i8 + 4;
        int i10 = (bArr[i8 + 1] & 255) << 8;
        return ((bArr[i8 + 3] & 255) << 24) | i10 | (bArr[i8] & 255) | ((bArr[i8 + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] < 0) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzj() {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L_0x0007
            goto L_0x006d
        L_0x0007:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.zzi = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006a
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x006a
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x006a
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x006a
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x006a
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            r5.zzi = r1
            return r0
        L_0x006d:
            long r0 = r5.zzs()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfm.zzj():int");
    }

    public final int zzk() {
        return zzi();
    }

    public final int zzl() {
        return zzfo.zzF(zzj());
    }

    public final int zzm() {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj2 = zzj();
        this.zzj = zzj2;
        if ((zzj2 >>> 3) != 0) {
            return zzj2;
        }
        throw zzhp.zzc();
    }

    public final int zzn() {
        return zzj();
    }

    public final long zzo() {
        return zzq();
    }

    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        int i8 = this.zzi;
        if (this.zzg - i8 < 8) {
            zzK(8);
            i8 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i8 + 8;
        long j10 = (long) bArr[i8 + 2];
        long j11 = (long) bArr[i8 + 3];
        long j12 = (long) bArr[i8 + 4];
        long j13 = (long) bArr[i8 + 5];
        long j14 = (long) bArr[i8 + 6];
        long j15 = (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24);
        return ((((long) bArr[i8 + 7]) & 255) << 56) | j15 | ((j12 & 255) << 32) | ((j13 & 255) << 40) | ((j14 & 255) << 48);
    }

    public final long zzr() {
        long j10;
        long j11;
        long j12;
        long j13;
        byte b10;
        int i8 = this.zzi;
        int i10 = this.zzg;
        if (i10 != i8) {
            byte[] bArr = this.zzf;
            int i11 = i8 + 1;
            byte b11 = bArr[i8];
            if (b11 >= 0) {
                this.zzi = i11;
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
                                                    this.zzi = i12;
                                                    return j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j12 ^ j15;
                                i12 = i14;
                                this.zzi = i12;
                                return j10;
                            }
                            j11 = j14 ^ j13;
                        }
                    }
                    i12 = i13;
                    j10 = j11;
                    this.zzi = i12;
                    return j10;
                }
                j10 = (long) b10;
                this.zzi = i12;
                return j10;
            }
        }
        return zzs();
    }

    public final long zzs() {
        long j10 = 0;
        for (int i8 = 0; i8 < 64; i8 += 7) {
            byte zza = zza();
            j10 |= ((long) (zza & Byte.MAX_VALUE)) << i8;
            if ((zza & 128) == 0) {
                return j10;
            }
        }
        throw zzhp.zze();
    }

    public final long zzt() {
        return zzq();
    }

    public final long zzu() {
        return zzfo.zzG(zzr());
    }

    public final long zzv() {
        return zzr();
    }

    public final zzfi zzw() {
        int zzj2 = zzj();
        int i8 = this.zzg;
        int i10 = this.zzi;
        if (zzj2 <= i8 - i10 && zzj2 > 0) {
            zzfi zzm = zzfi.zzm(this.zzf, i10, zzj2);
            this.zzi += zzj2;
            return zzm;
        } else if (zzj2 == 0) {
            return zzfi.zzb;
        } else {
            byte[] zzN = zzN(zzj2);
            if (zzN != null) {
                return zzfi.zzm(zzN, 0, zzN.length);
            }
            int i11 = this.zzi;
            int i12 = this.zzg;
            int i13 = i12 - i11;
            this.zzk += i12;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzI = zzI(zzj2 - i13);
            byte[] bArr = new byte[zzj2];
            System.arraycopy(this.zzf, i11, bArr, 0, i13);
            for (byte[] bArr2 : zzI) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i13, length);
                i13 += length;
            }
            return new zzff(bArr);
        }
    }

    public final String zzx() {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i8 = this.zzg;
            int i10 = this.zzi;
            if (zzj2 <= i8 - i10) {
                String str = new String(this.zzf, i10, zzj2, zzhn.zzb);
                this.zzi += zzj2;
                return str;
            }
        }
        if (zzj2 == 0) {
            return "";
        }
        if (zzj2 > this.zzg) {
            return new String(zzM(zzj2, false), zzhn.zzb);
        }
        zzK(zzj2);
        String str2 = new String(this.zzf, this.zzi, zzj2, zzhn.zzb);
        this.zzi += zzj2;
        return str2;
    }

    public final String zzy() {
        byte[] bArr;
        int zzj2 = zzj();
        int i8 = this.zzi;
        int i10 = this.zzg;
        if (zzj2 <= i10 - i8 && zzj2 > 0) {
            bArr = this.zzf;
            this.zzi = i8 + zzj2;
        } else if (zzj2 == 0) {
            return "";
        } else {
            i8 = 0;
            if (zzj2 <= i10) {
                zzK(zzj2);
                bArr = this.zzf;
                this.zzi = zzj2;
            } else {
                bArr = zzM(zzj2, false);
            }
        }
        return zzkl.zzd(bArr, i8, zzj2);
    }

    public final void zzz(int i8) {
        if (this.zzj != i8) {
            throw zzhp.zzb();
        }
    }
}
