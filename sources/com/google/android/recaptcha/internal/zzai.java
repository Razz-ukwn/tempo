package com.google.android.recaptcha.internal;

import ag.g0;
import android.content.Context;
import java.util.HashMap;
import sf.e;

public final class zzai {
    public static final zzai zza = new zzai();
    private static final HashMap zzb = new HashMap();

    private zzai() {
    }

    public static final void zza(zzaf zzaf, Long l10, int i8) {
        zzah zzah;
        if (l10 != null && (zzah = (zzah) zzb.get(zzaf)) != null) {
            zzll zzb2 = zzah.zzb();
            zzkt zzf = zzku.zzf();
            zzf.zze(i8);
            zzf.zzd(zzkp.zza(l10.longValue() - zzah.zza()));
            zzb2.zzd((zzku) zzf.zzj());
        }
    }

    public static final void zzb(zzaf zzaf, String str, zzr zzr) {
        zzb.put(zzaf, new zzah(zzaf, str, zzr));
    }

    public static final void zzc(zzaf zzaf, Context context, zzq zzq) {
        zze(zzaf, 3, (zzla) null, context, zzq);
    }

    public static final void zzd(zzaf zzaf, String str, int i8, Context context, zzq zzq, String str2) {
        zzkz zzg = zzla.zzg();
        zzg.zzp(str);
        zzg.zzd(i8);
        if (str2 != null) {
            zzg.zze(str2);
        }
        zze(zzaf, 4, (zzla) zzg.zzj(), context, zzq);
    }

    private static final void zze(zzaf zzaf, int i8, zzla zzla, Context context, zzq zzq) {
        zzl zzl;
        HashMap hashMap = zzb;
        zzah zzah = (zzah) hashMap.get(zzaf);
        if (zzah != null) {
            zzlo zzc = zzah.zzc(i8, zzla, context);
            zzmx zzi = zzmy.zzi();
            zzi.zzd(zzc);
            zzmy zzmy = (zzmy) zzi.zzj();
            zzj zzj = zzj.zza;
            zzln zza2 = zzaf.zza();
            long zzf = zzc.zzf() * 1000;
            zzln zzln = zzln.UNKNOWN;
            int ordinal = zza2.ordinal();
            if (ordinal != 14) {
                switch (ordinal) {
                    case 1:
                        zzl = zzl.zzd;
                        break;
                    case 2:
                        zzl = zzl.zze;
                        break;
                    case 3:
                        zzl = zzl.zzf;
                        break;
                    case 4:
                        zzl = zzl.zzg;
                        break;
                    case 5:
                        zzl = zzl.zzh;
                        break;
                    case 6:
                        zzl = zzl.zzi;
                        break;
                    case 7:
                        zzl = zzl.zzj;
                        break;
                    default:
                        zzl = zzl.zzb;
                        break;
                }
            } else {
                zzl = zzl.zzk;
            }
            zzj.zza(zzl.zza(), zzf);
            new zzao(context, new zzaq(zzq.zzc()), (g0) null, 4, (e) null).zzf(zzmy);
            zzah zzah2 = (zzah) hashMap.remove(zzaf);
        }
    }
}
