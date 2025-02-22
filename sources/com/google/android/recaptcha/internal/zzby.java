package com.google.android.recaptcha.internal;

import java.util.ArrayList;

public final class zzby implements zzca {
    public static final zzby zza = new zzby();

    private zzby() {
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
                    try {
                        if (zza2 instanceof Integer) {
                            obj = Integer.valueOf(((Number) zza2).intValue() / intValue);
                        } else if (zza2 instanceof int[]) {
                            ArrayList arrayList = new ArrayList(r4);
                            for (int i10 : (int[]) zza2) {
                                arrayList.add(Integer.valueOf(i10 / intValue));
                            }
                            obj = arrayList.toArray(new Integer[0]);
                        } else {
                            throw new zzs(4, 5, (Throwable) null);
                        }
                        zzbh.zze().zzf(i8, obj);
                    } catch (ArithmeticException e10) {
                        throw new zzs(4, 6, e10);
                    }
                } else {
                    throw new zzs(4, 5, (Throwable) null);
                }
            } else {
                throw new zzs(4, 5, (Throwable) null);
            }
        } else {
            throw new zzs(4, 3, (Throwable) null);
        }
    }
}
