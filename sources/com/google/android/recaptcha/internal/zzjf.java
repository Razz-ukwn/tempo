package com.google.android.recaptcha.internal;

import java.util.Map;

final class zzjf extends zzjp {
    public zzjf(int i8) {
        super(i8, (zzjo) null);
    }

    public final void zza() {
        if (!zzj()) {
            for (int i8 = 0; i8 < zzb(); i8++) {
                ((zzgu) zzg(i8).getKey()).zzg();
            }
            for (Map.Entry key : zzc()) {
                ((zzgu) key.getKey()).zzg();
            }
        }
        super.zza();
    }
}
