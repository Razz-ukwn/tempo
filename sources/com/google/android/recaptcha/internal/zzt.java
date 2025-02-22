package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import t6.f;

public final class zzt {
    public static final zzt zza = new zzt();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final f zzc = f.f15396b;

    private zzt() {
    }

    public static final String zza(Context context) {
        int b10 = zzc.b(context);
        return (b10 == 1 || b10 == 3 || b10 == 9) ? "ANDROID_OFFPLAY" : "ANDROID_ONPLAY";
    }

    public static final String zzb() {
        return zzb;
    }
}
