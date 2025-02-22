package com.google.android.recaptcha.internal;

import java.util.Arrays;

public final class zzjx {
    private static final zzjx zza = new zzjx(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzjx() {
        this(0, new int[8], new Object[8], true);
    }

    private zzjx(int i8, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i8;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzjx zzc() {
        return zza;
    }

    public static zzjx zze(zzjx zzjx, zzjx zzjx2) {
        int i8 = zzjx.zzb + zzjx2.zzb;
        int[] copyOf = Arrays.copyOf(zzjx.zzc, i8);
        System.arraycopy(zzjx2.zzc, 0, copyOf, zzjx.zzb, zzjx2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzjx.zzd, i8);
        System.arraycopy(zzjx2.zzd, 0, copyOf2, zzjx.zzb, zzjx2.zzb);
        return new zzjx(i8, copyOf, copyOf2, true);
    }

    public static zzjx zzf() {
        return new zzjx(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i8) {
        int[] iArr = this.zzc;
        if (i8 > iArr.length) {
            int i10 = this.zzb;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i8) {
                i8 = i11;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i8);
            this.zzd = Arrays.copyOf(this.zzd, i8);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzjx)) {
            return false;
        }
        zzjx zzjx = (zzjx) obj;
        int i8 = this.zzb;
        if (i8 == zzjx.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzjx.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i8) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzjx.zzd;
                    int i11 = this.zzb;
                    int i12 = 0;
                    while (i12 < i11) {
                        if (objArr[i12].equals(objArr2[i12])) {
                            i12++;
                        }
                    }
                    return true;
                } else if (iArr[i10] != iArr2[i10]) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.zzb;
        int i10 = i8 + 527;
        int[] iArr = this.zzc;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i8; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 * 31) + i12;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + i11;
    }

    public final int zza() {
        int i8;
        int i10;
        int i11;
        int i12 = this.zze;
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzb; i14++) {
            int i15 = this.zzc[i14];
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i17 != 0) {
                if (i17 == 1) {
                    ((Long) this.zzd[i14]).longValue();
                    i8 = zzft.zzy(i16 << 3) + 8;
                } else if (i17 == 2) {
                    int i18 = zzft.zzb;
                    int zzd2 = ((zzfi) this.zzd[i14]).zzd();
                    i8 = zzft.zzy(i16 << 3) + zzft.zzy(zzd2) + zzd2;
                } else if (i17 == 3) {
                    int i19 = i16 << 3;
                    int i20 = zzft.zzb;
                    i10 = ((zzjx) this.zzd[i14]).zza();
                    int zzy = zzft.zzy(i19);
                    i11 = zzy + zzy;
                } else if (i17 == 5) {
                    ((Integer) this.zzd[i14]).intValue();
                    i8 = zzft.zzy(i16 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzhp.zza());
                }
                i13 += i8;
            } else {
                int i21 = i16 << 3;
                i10 = zzft.zzz(((Long) this.zzd[i14]).longValue());
                i11 = zzft.zzy(i21);
            }
            i8 = i11 + i10;
            i13 += i8;
        }
        this.zze = i13;
        return i13;
    }

    public final int zzb() {
        int i8 = this.zze;
        if (i8 != -1) {
            return i8;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = zzft.zzb;
            int zzd2 = ((zzfi) this.zzd[i11]).zzd();
            int zzy = zzft.zzy(zzd2) + zzd2;
            int zzy2 = zzft.zzy(16);
            int zzy3 = zzft.zzy(this.zzc[i11] >>> 3);
            int zzy4 = zzft.zzy(8);
            i10 += zzft.zzy(24) + zzy + zzy2 + zzy3 + zzy4 + zzy4;
        }
        this.zze = i10;
        return i10;
    }

    public final zzjx zzd(zzjx zzjx) {
        if (zzjx.equals(zza)) {
            return this;
        }
        zzg();
        int i8 = this.zzb + zzjx.zzb;
        zzm(i8);
        System.arraycopy(zzjx.zzc, 0, this.zzc, this.zzb, zzjx.zzb);
        System.arraycopy(zzjx.zzd, 0, this.zzd, this.zzb, zzjx.zzb);
        this.zzb = i8;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i8) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzir.zzb(sb2, i8, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i8, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i8;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzko zzko) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzko.zzw(this.zzc[i8] >>> 3, this.zzd[i8]);
        }
    }

    public final void zzl(zzko zzko) {
        if (this.zzb != 0) {
            for (int i8 = 0; i8 < this.zzb; i8++) {
                int i10 = this.zzc[i8];
                Object obj = this.zzd[i8];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzko.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzko.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzko.zzd(i12, (zzfi) obj);
                } else if (i11 == 3) {
                    zzko.zzF(i12);
                    ((zzjx) obj).zzl(zzko);
                    zzko.zzh(i12);
                } else if (i11 == 5) {
                    zzko.zzk(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzhp.zza());
                }
            }
        }
    }
}
