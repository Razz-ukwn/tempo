package com.google.android.recaptcha.internal;

import android.os.Build;
import ff.g;
import gf.y;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzdj {
    public static final zzdj zza = new zzdj();

    private zzdj() {
    }

    public static final Map zza() {
        LinkedHashMap T = y.T(new g(-4, zzd.zzA), new g(-12, zzd.zzB), new g(-6, zzd.zzw), new g(-11, zzd.zzy), new g(-13, zzd.zzC), new g(-14, zzd.zzD), new g(-2, zzd.zzx), new g(-7, zzd.zzE), new g(-5, zzd.zzF), new g(-9, zzd.zzG), new g(-8, zzd.zzQ), new g(-15, zzd.zzz), new g(-1, zzd.zzH), new g(-3, zzd.zzJ), new g(-10, zzd.zzK));
        int i8 = Build.VERSION.SDK_INT;
        T.put(-16, zzd.zzI);
        if (i8 >= 27) {
            T.put(1, zzd.zzM);
            T.put(2, zzd.zzN);
            T.put(0, zzd.zzO);
            T.put(3, zzd.zzP);
        }
        if (i8 >= 29) {
            T.put(4, zzd.zzL);
        }
        return T;
    }
}
