package com.google.android.gms.internal.measurement;

public final class hb implements gb {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5314a;

    /* renamed from: b  reason: collision with root package name */
    public static final t4 f5315b;

    static {
        w4 w4Var = new w4(q4.a(), true, true);
        f5314a = w4Var.c("measurement.item_scoped_custom_parameters.client", true);
        f5315b = w4Var.c("measurement.item_scoped_custom_parameters.service", false);
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f5314a.b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f5315b.b()).booleanValue();
    }
}
