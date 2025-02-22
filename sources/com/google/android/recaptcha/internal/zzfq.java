package com.google.android.recaptcha.internal;

final class zzfq extends zzft {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzfq(byte[] bArr, int i8, int i10) {
        super((zzfs) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i10) | i10) >= 0) {
                this.zzc = bArr;
                this.zze = 0;
                this.zzd = i10;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i10)}));
        }
        throw new NullPointerException("buffer");
    }

    public final int zza() {
        return this.zzd - this.zze;
    }

    public final void zzb(byte b10) {
        try {
            byte[] bArr = this.zzc;
            int i8 = this.zze;
            this.zze = i8 + 1;
            bArr[i8] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfr(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
        }
    }

    public final void zzc(byte[] bArr, int i8, int i10) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i10);
            this.zze += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfr(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i10)}), e10);
        }
    }

    public final void zzd(int i8, boolean z10) {
        zzq(i8 << 3);
        zzb(z10 ? (byte) 1 : 0);
    }

    public final void zze(int i8, zzfi zzfi) {
        zzq((i8 << 3) | 2);
        zzq(zzfi.zzd());
        zzfi.zzi(this);
    }

    public final void zzf(int i8, int i10) {
        zzq((i8 << 3) | 5);
        zzg(i10);
    }

    public final void zzg(int i8) {
        try {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (i8 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i8 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i8 >> 16) & 255);
            this.zze = i13 + 1;
            bArr[i13] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfr(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
        }
    }

    public final void zzh(int i8, long j10) {
        zzq((i8 << 3) | 1);
        zzi(j10);
    }

    public final void zzi(long j10) {
        try {
            byte[] bArr = this.zzc;
            int i8 = this.zze;
            int i10 = i8 + 1;
            bArr[i8] = (byte) (((int) j10) & 255);
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) (j10 >> 8)) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 16)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 24)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
            this.zze = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfr(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
        }
    }

    public final void zzj(int i8, int i10) {
        zzq(i8 << 3);
        zzk(i10);
    }

    public final void zzk(int i8) {
        if (i8 >= 0) {
            zzq(i8);
        } else {
            zzs((long) i8);
        }
    }

    public final void zzl(byte[] bArr, int i8, int i10) {
        zzc(bArr, 0, i10);
    }

    public final void zzm(int i8, String str) {
        zzq((i8 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i8 = this.zze;
        try {
            int zzy = zzft.zzy(str.length() * 3);
            int zzy2 = zzft.zzy(str.length());
            if (zzy2 == zzy) {
                int i10 = i8 + zzy2;
                this.zze = i10;
                int zzb = zzkl.zzb(str, this.zzc, i10, this.zzd - i10);
                this.zze = i8;
                zzq((zzb - i8) - zzy2);
                this.zze = zzb;
                return;
            }
            zzq(zzkl.zzc(str));
            byte[] bArr = this.zzc;
            int i11 = this.zze;
            this.zze = zzkl.zzb(str, bArr, i11, this.zzd - i11);
        } catch (zzkk e10) {
            this.zze = i8;
            zzC(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzfr(e11);
        }
    }

    public final void zzo(int i8, int i10) {
        zzq((i8 << 3) | i10);
    }

    public final void zzp(int i8, int i10) {
        zzq(i8 << 3);
        zzq(i10);
    }

    public final void zzq(int i8) {
        while ((i8 & -128) != 0) {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
            this.zze = i10 + 1;
            bArr[i10] = (byte) ((i8 & 127) | 128);
            i8 >>>= 7;
        }
        try {
            byte[] bArr2 = this.zzc;
            int i11 = this.zze;
            this.zze = i11 + 1;
            bArr2[i11] = (byte) i8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfr(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
        }
    }

    public final void zzr(int i8, long j10) {
        zzq(i8 << 3);
        zzs(j10);
    }

    public final void zzs(long j10) {
        if (!zzft.zzd || this.zzd - this.zze < 10) {
            while ((j10 & -128) != 0) {
                byte[] bArr = this.zzc;
                int i8 = this.zze;
                this.zze = i8 + 1;
                bArr[i8] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zzc;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr2[i10] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzfr(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1}), e10);
            }
        } else {
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.zzc;
                int i11 = this.zze;
                this.zze = i11 + 1;
                zzkg.zzn(bArr3, (long) i11, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.zzc;
            int i12 = this.zze;
            this.zze = i12 + 1;
            zzkg.zzn(bArr4, (long) i12, (byte) ((int) j10));
        }
    }
}
