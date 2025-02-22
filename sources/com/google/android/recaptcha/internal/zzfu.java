package com.google.android.recaptcha.internal;

import java.util.List;

final class zzfu implements zzko {
    private final zzft zza;

    private zzfu(zzft zzft) {
        byte[] bArr = zzhn.zzd;
        this.zza = zzft;
        zzft.zza = this;
    }

    public static zzfu zza(zzft zzft) {
        zzfu zzfu = zzft.zza;
        return zzfu != null ? zzfu : new zzfu(zzft);
    }

    public final void zzA(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).longValue();
                i11 += 8;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i8, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public final void zzB(int i8, int i10) {
        this.zza.zzp(i8, (i10 >> 31) ^ (i10 + i10));
    }

    public final void zzC(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                i11 += zzft.zzy((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                zzft zzft = this.zza;
                int intValue2 = ((Integer) list.get(i10)).intValue();
                zzft.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            zzft zzft2 = this.zza;
            int intValue3 = ((Integer) list.get(i10)).intValue();
            zzft2.zzp(i8, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i10++;
        }
    }

    public final void zzD(int i8, long j10) {
        this.zza.zzr(i8, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzE(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long longValue = ((Long) list.get(i12)).longValue();
                i11 += zzft.zzz((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                zzft zzft = this.zza;
                long longValue2 = ((Long) list.get(i10)).longValue();
                zzft.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            zzft zzft2 = this.zza;
            long longValue3 = ((Long) list.get(i10)).longValue();
            zzft2.zzr(i8, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i10++;
        }
    }

    @Deprecated
    public final void zzF(int i8) {
        this.zza.zzo(i8, 3);
    }

    public final void zzG(int i8, String str) {
        this.zza.zzm(i8, str);
    }

    public final void zzH(int i8, List list) {
        int i10 = 0;
        if (list instanceof zzhx) {
            zzhx zzhx = (zzhx) list;
            while (i10 < list.size()) {
                Object zzf = zzhx.zzf(i10);
                if (zzf instanceof String) {
                    this.zza.zzm(i8, (String) zzf);
                } else {
                    this.zza.zze(i8, (zzfi) zzf);
                }
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzm(i8, (String) list.get(i10));
            i10++;
        }
    }

    public final void zzI(int i8, int i10) {
        this.zza.zzp(i8, i10);
    }

    public final void zzJ(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzft.zzy(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzp(i8, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzK(int i8, long j10) {
        this.zza.zzr(i8, j10);
    }

    public final void zzL(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzft.zzz(((Long) list.get(i12)).longValue());
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzs(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzr(i8, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public final void zzb(int i8, boolean z10) {
        this.zza.zzd(i8, z10);
    }

    public final void zzc(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).booleanValue();
                i11++;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : 0);
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzd(i8, ((Boolean) list.get(i10)).booleanValue());
            i10++;
        }
    }

    public final void zzd(int i8, zzfi zzfi) {
        this.zza.zze(i8, zzfi);
    }

    public final void zze(int i8, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i8, (zzfi) list.get(i10));
        }
    }

    public final void zzf(int i8, double d10) {
        this.zza.zzh(i8, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).doubleValue();
                i11 += 8;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i8, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Deprecated
    public final void zzh(int i8) {
        this.zza.zzo(i8, 4);
    }

    public final void zzi(int i8, int i10) {
        this.zza.zzj(i8, i10);
    }

    public final void zzj(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzft.zzu(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzj(i8, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzk(int i8, int i10) {
        this.zza.zzf(i8, i10);
    }

    public final void zzl(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).intValue();
                i11 += 4;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzf(i8, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzm(int i8, long j10) {
        this.zza.zzh(i8, j10);
    }

    public final void zzn(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).longValue();
                i11 += 8;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i8, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public final void zzo(int i8, float f10) {
        this.zza.zzf(i8, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).floatValue();
                i11 += 4;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzf(i8, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public final void zzq(int i8, Object obj, zzjc zzjc) {
        zzft zzft = this.zza;
        zzft.zzo(i8, 3);
        zzjc.zzj((zzip) obj, zzft.zza);
        zzft.zzo(i8, 4);
    }

    public final void zzr(int i8, int i10) {
        this.zza.zzj(i8, i10);
    }

    public final void zzs(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzft.zzu(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzj(i8, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzt(int i8, long j10) {
        this.zza.zzr(i8, j10);
    }

    public final void zzu(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzft.zzz(((Long) list.get(i12)).longValue());
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzs(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzr(i8, ((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public final void zzv(int i8, Object obj, zzjc zzjc) {
        zzip zzip = (zzip) obj;
        zzfq zzfq = (zzfq) this.zza;
        zzfq.zzq((i8 << 3) | 2);
        zzfq.zzq(((zzer) zzip).zza(zzjc));
        zzjc.zzj(zzip, zzfq.zza);
    }

    public final void zzw(int i8, Object obj) {
        if (obj instanceof zzfi) {
            zzfq zzfq = (zzfq) this.zza;
            zzfq.zzq(11);
            zzfq.zzp(2, i8);
            zzfq.zze(3, (zzfi) obj);
            zzfq.zzq(12);
            return;
        }
        zzft zzft = this.zza;
        zzip zzip = (zzip) obj;
        zzfq zzfq2 = (zzfq) zzft;
        zzfq2.zzq(11);
        zzfq2.zzp(2, i8);
        zzfq2.zzq(26);
        zzfq2.zzq(zzip.zzn());
        zzip.zze(zzft);
        zzfq2.zzq(12);
    }

    public final void zzx(int i8, int i10) {
        this.zza.zzf(i8, i10);
    }

    public final void zzy(int i8, List list, boolean z10) {
        int i10 = 0;
        if (z10) {
            this.zza.zzo(i8, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).intValue();
                i11 += 4;
            }
            this.zza.zzq(i11);
            while (i10 < list.size()) {
                this.zza.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzf(i8, ((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzz(int i8, long j10) {
        this.zza.zzh(i8, j10);
    }
}
