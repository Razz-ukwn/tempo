package com.google.android.recaptcha.internal;

import java.util.List;

final class zzfp implements zzjb {
    private final zzfo zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzfp(zzfo zzfo) {
        byte[] bArr = zzhn.zzd;
        this.zza = zzfo;
        zzfo.zzc = this;
    }

    private final void zzP(Object obj, zzjc zzjc, zzgq zzgq) {
        int i8 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzjc.zzh(obj, this, zzgq);
            if (this.zzb != this.zzc) {
                throw zzhp.zzg();
            }
        } finally {
            this.zzc = i8;
        }
    }

    private final void zzQ(Object obj, zzjc zzjc, zzgq zzgq) {
        int zzn = this.zza.zzn();
        zzfo zzfo = this.zza;
        if (zzfo.zza < zzfo.zzb) {
            int zze = zzfo.zze(zzn);
            this.zza.zza++;
            zzjc.zzh(obj, this, zzgq);
            this.zza.zzz(0);
            zzfo zzfo2 = this.zza;
            zzfo2.zza--;
            zzfo2.zzA(zze);
            return;
        }
        throw new zzhp("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i8) {
        if (this.zza.zzd() != i8) {
            throw zzhp.zzj();
        }
    }

    private final void zzS(int i8) {
        if ((this.zzb & 7) != i8) {
            throw zzhp.zza();
        }
    }

    private static final void zzT(int i8) {
        if ((i8 & 3) != 0) {
            throw zzhp.zzg();
        }
    }

    private static final void zzU(int i8) {
        if ((i8 & 7) != 0) {
            throw zzhp.zzg();
        }
    }

    public static zzfp zzq(zzfo zzfo) {
        zzfp zzfp = zzfo.zzc;
        return zzfp != null ? zzfp : new zzfp(zzfo);
    }

    public final void zzA(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzie) {
            zzie zzie = (zzie) list;
            int i8 = this.zzb & 7;
            if (i8 == 1) {
                do {
                    zzie.zzf(this.zza.zzo());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzie.zzf(this.zza.zzo());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzB(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgx) {
            zzgx zzgx = (zzgx) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgx.zze(this.zza.zzc());
                } while (this.zza.zzd() < zzd2);
            } else if (i8 == 5) {
                do {
                    zzgx.zze(this.zza.zzc());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd3);
            } else if (i10 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzhp.zza();
            }
        }
    }

    @Deprecated
    public final void zzC(List list, zzjc zzjc, zzgq zzgq) {
        int zzm;
        int i8 = this.zzb;
        if ((i8 & 7) == 3) {
            do {
                Object zze = zzjc.zze();
                zzP(zze, zzjc, zzgq);
                zzjc.zzf(zze);
                list.add(zze);
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i8);
            this.zzd = zzm;
            return;
        }
        throw zzhp.zza();
    }

    public final void zzD(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            int i8 = this.zzb & 7;
            if (i8 == 0) {
                do {
                    zzhg.zzg(this.zza.zzh());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzhg.zzg(this.zza.zzh());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzE(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzie) {
            zzie zzie = (zzie) list;
            int i8 = this.zzb & 7;
            if (i8 == 0) {
                do {
                    zzie.zzf(this.zza.zzp());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzie.zzf(this.zza.zzp());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzF(List list, zzjc zzjc, zzgq zzgq) {
        int zzm;
        int i8 = this.zzb;
        if ((i8 & 7) == 2) {
            do {
                Object zze = zzjc.zze();
                zzQ(zze, zzjc, zzgq);
                zzjc.zzf(zze);
                list.add(zze);
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i8);
            this.zzd = zzm;
            return;
        }
        throw zzhp.zza();
    }

    public final void zzG(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzhg.zzg(this.zza.zzk());
                } while (this.zza.zzd() < zzd2);
            } else if (i8 == 5) {
                do {
                    zzhg.zzg(this.zza.zzk());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd3);
            } else if (i10 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzH(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzie) {
            zzie zzie = (zzie) list;
            int i8 = this.zzb & 7;
            if (i8 == 1) {
                do {
                    zzie.zzf(this.zza.zzt());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzie.zzf(this.zza.zzt());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzI(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            int i8 = this.zzb & 7;
            if (i8 == 0) {
                do {
                    zzhg.zzg(this.zza.zzl());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzhg.zzg(this.zza.zzl());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzJ(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzie) {
            zzie zzie = (zzie) list;
            int i8 = this.zzb & 7;
            if (i8 == 0) {
                do {
                    zzie.zzf(this.zza.zzu());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzie.zzf(this.zza.zzu());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzK(List list, boolean z10) {
        int zzm;
        int zzm2;
        if ((this.zzb & 7) != 2) {
            throw zzhp.zza();
        } else if ((list instanceof zzhx) && !z10) {
            zzhx zzhx = (zzhx) list;
            do {
                zzhx.zzi(zzp());
                if (!this.zza.zzC()) {
                    zzm2 = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
        } else {
            do {
                list.add(z10 ? zzs() : zzr());
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
        }
    }

    public final void zzL(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            int i8 = this.zzb & 7;
            if (i8 == 0) {
                do {
                    zzhg.zzg(this.zza.zzn());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzhg.zzg(this.zza.zzn());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzM(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzie) {
            zzie zzie = (zzie) list;
            int i8 = this.zzb & 7;
            if (i8 == 0) {
                do {
                    zzie.zzf(this.zza.zzv());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzie.zzf(this.zza.zzv());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    public final boolean zzO() {
        int i8;
        if (this.zza.zzC() || (i8 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i8);
    }

    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    public final int zzc() {
        int i8 = this.zzd;
        if (i8 != 0) {
            this.zzb = i8;
            this.zzd = 0;
        } else {
            i8 = this.zza.zzm();
            this.zzb = i8;
        }
        if (i8 == 0 || i8 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i8 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    public final int zzj() {
        zzS(0);
        return this.zza.zzn();
    }

    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    public final zzfi zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    public final void zzt(Object obj, zzjc zzjc, zzgq zzgq) {
        zzS(3);
        zzP(obj, zzjc, zzgq);
    }

    public final void zzu(Object obj, zzjc zzjc, zzgq zzgq) {
        zzS(2);
        zzQ(obj, zzjc, zzgq);
    }

    public final void zzv(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzex) {
            zzex zzex = (zzex) list;
            int i8 = this.zzb & 7;
            if (i8 == 0) {
                do {
                    zzex.zze(this.zza.zzD());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzex.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzw(List list) {
        int zzm;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        throw zzhp.zza();
    }

    public final void zzx(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzgk) {
            zzgk zzgk = (zzgk) list;
            int i8 = this.zzb & 7;
            if (i8 == 1) {
                do {
                    zzgk.zze(this.zza.zzb());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgk.zze(this.zza.zzb());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzy(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            int i8 = this.zzb & 7;
            if (i8 == 0) {
                do {
                    zzhg.zzg(this.zza.zzf());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i8 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzhg.zzg(this.zza.zzf());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i10 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzhp.zza();
            }
        }
    }

    public final void zzz(List list) {
        int zzm;
        int zzm2;
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzhg.zzg(this.zza.zzg());
                } while (this.zza.zzd() < zzd2);
            } else if (i8 == 5) {
                do {
                    zzhg.zzg(this.zza.zzg());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzhp.zza();
            }
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd3);
            } else if (i10 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzhp.zza();
            }
        }
    }
}
