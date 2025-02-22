package com.google.android.recaptcha.internal;

import gf.l;
import gf.s;
import java.lang.reflect.Method;
import sf.j;

public final class zzbf extends zzbc {
    private final zzbe zza;
    private final String zzb;

    public zzbf(zzbe zzbe, String str, Object obj) {
        super(obj);
        this.zza = zzbe;
        this.zzb = str;
    }

    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!j.a(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? l.R(objArr) : s.f8978a);
        return true;
    }
}
