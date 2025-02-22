package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

final class zzit implements zzjc {
    private final zzip zza;
    private final zzjw zzb;
    private final boolean zzc;
    private final zzgr zzd;

    private zzit(zzjw zzjw, zzgr zzgr, zzip zzip) {
        this.zzb = zzjw;
        this.zzc = zzgr.zzj(zzip);
        this.zzd = zzgr;
        this.zza = zzip;
    }

    public static zzit zzc(zzjw zzjw, zzgr zzgr, zzip zzip) {
        return new zzit(zzjw, zzgr, zzip);
    }

    public final int zza(Object obj) {
        zzjw zzjw = this.zzb;
        int zzb2 = zzjw.zzb(zzjw.zzd(obj));
        return this.zzc ? zzb2 + this.zzd.zzb(obj).zzb() : zzb2;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : hashCode;
    }

    public final Object zze() {
        zzip zzip = this.zza;
        return zzip instanceof zzhf ? ((zzhf) zzip).zzs() : zzip.zzV().zzk();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzje.zzD(this.zzb, obj, obj2);
        if (this.zzc) {
            zzje.zzC(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzjb zzjb, zzgq zzgq) {
        boolean z10;
        zzjw zzjw = this.zzb;
        zzgr zzgr = this.zzd;
        Object zzc2 = zzjw.zzc(obj);
        zzgv zzc3 = zzgr.zzc(obj);
        while (zzjb.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzjb.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzd3 = zzgr.zzd(zzgq, this.zza, zzd2 >>> 3);
                    if (zzd3 != null) {
                        zzgr.zzg(zzjb, zzd3, zzgq, zzc3);
                    } else {
                        z10 = zzjw.zzr(zzc2, zzjb);
                    }
                } else {
                    z10 = zzjb.zzO();
                }
                if (!z10) {
                    zzjw.zzn(obj, zzc2);
                    return;
                }
            } else {
                Object obj2 = null;
                int i8 = 0;
                zzfi zzfi = null;
                while (true) {
                    try {
                        if (zzjb.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd4 = zzjb.zzd();
                        if (zzd4 == 16) {
                            i8 = zzjb.zzj();
                            obj2 = zzgr.zzd(zzgq, this.zza, i8);
                        } else if (zzd4 == 26) {
                            if (obj2 != null) {
                                zzgr.zzg(zzjb, obj2, zzgq, zzc3);
                            } else {
                                zzfi = zzjb.zzp();
                            }
                        } else if (!zzjb.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzjw.zzn(obj, zzc2);
                        throw th;
                    }
                }
                if (zzjb.zzd() != 12) {
                    throw zzhp.zzb();
                } else if (zzfi != null) {
                    if (obj2 != null) {
                        zzgr.zzh(zzfi, obj2, zzgq, zzc3);
                    } else {
                        zzjw.zzk(zzc2, i8, zzfi);
                    }
                }
            }
        }
        zzjw.zzn(obj, zzc2);
    }

    public final void zzi(Object obj, byte[] bArr, int i8, int i10, zzev zzev) {
        zzhf zzhf = (zzhf) obj;
        zzjx zzjx = zzhf.zzc;
        if (zzjx == zzjx.zzc()) {
            zzjx = zzjx.zzf();
            zzhf.zzc = zzjx;
        }
        ((zzhb) obj).zzi();
        Object obj2 = null;
        while (i8 < i10) {
            int zzj = zzew.zzj(bArr, i8, zzev);
            int i11 = zzev.zza;
            if (i11 == 11) {
                int i12 = 0;
                zzfi zzfi = null;
                while (zzj < i10) {
                    zzj = zzew.zzj(bArr, zzj, zzev);
                    int i13 = zzev.zza;
                    int i14 = i13 >>> 3;
                    int i15 = i13 & 7;
                    if (i14 != 2) {
                        if (i14 == 3) {
                            if (obj2 != null) {
                                int i16 = zziy.zza;
                                throw null;
                            } else if (i15 == 2) {
                                zzj = zzew.zza(bArr, zzj, zzev);
                                zzfi = (zzfi) zzev.zzc;
                            }
                        }
                    } else if (i15 == 0) {
                        zzj = zzew.zzj(bArr, zzj, zzev);
                        i12 = zzev.zza;
                        obj2 = this.zzd.zzd(zzev.zzd, this.zza, i12);
                    }
                    if (i13 == 12) {
                        break;
                    }
                    zzj = zzew.zzp(i13, bArr, zzj, i10, zzev);
                }
                if (zzfi != null) {
                    zzjx.zzj((i12 << 3) | 2, zzfi);
                }
                i8 = zzj;
            } else if ((i11 & 7) == 2) {
                obj2 = this.zzd.zzd(zzev.zzd, this.zza, i11 >>> 3);
                if (obj2 == null) {
                    i8 = zzew.zzi(i11, bArr, zzj, i10, zzjx, zzev);
                } else {
                    int i17 = zziy.zza;
                    throw null;
                }
            } else {
                i8 = zzew.zzp(i11, bArr, zzj, i10, zzev);
            }
        }
        if (i8 != i10) {
            throw zzhp.zzg();
        }
    }

    public final void zzj(Object obj, zzko zzko) {
        Iterator zzf = this.zzd.zzb(obj).zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzgu zzgu = (zzgu) entry.getKey();
            if (zzgu.zze() == zzkn.MESSAGE) {
                zzgu.zzg();
                zzgu.zzf();
                if (entry instanceof zzhs) {
                    zzko.zzw(zzgu.zza(), ((zzhs) entry).zza().zzb());
                } else {
                    zzko.zzw(zzgu.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzjw zzjw = this.zzb;
        zzjw.zzp(zzjw.zzd(obj), zzko);
    }

    public final boolean zzk(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzk();
    }
}
