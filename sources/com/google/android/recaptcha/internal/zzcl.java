package com.google.android.recaptcha.internal;

import java.util.ArrayList;

public final class zzcl implements zzca {
    public static final zzcl zza = new zzcl();

    private zzcl() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        Object obj;
        if (zznlArr.length == 2) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzbh.zze().zza(zznlArr[1]);
                if (true != (zza3 instanceof Integer)) {
                    zza3 = null;
                }
                Integer num = (Integer) zza3;
                if (num != null) {
                    int intValue = num.intValue();
                    if (zza2 instanceof Integer) {
                        obj = Integer.valueOf(((Number) zza2).intValue() * intValue);
                    } else if (zza2 instanceof int[]) {
                        ArrayList arrayList = new ArrayList(r2);
                        for (int i10 : (int[]) zza2) {
                            arrayList.add(Integer.valueOf(i10 * intValue));
                        }
                        obj = arrayList.toArray(new Integer[0]);
                    } else {
                        throw new zzs(4, 5, (Throwable) null);
                    }
                    zzbh.zze().zzf(i8, obj);
                    return;
                }
                throw new zzs(4, 5, (Throwable) null);
            }
            throw new zzs(4, 5, (Throwable) null);
        }
        throw new zzs(4, 3, (Throwable) null);
    }
}
