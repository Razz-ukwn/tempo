package com.google.android.gms.internal.measurement;

public final class ia implements ha {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5328a;

    /* renamed from: b  reason: collision with root package name */
    public static final t4 f5329b;

    static {
        w4 w4Var = new w4(q4.a(), true, true);
        w4Var.c("measurement.collection.event_safelist", true);
        f5328a = w4Var.c("measurement.service.store_null_safelist", true);
        f5329b = w4Var.c("measurement.service.store_safelist", true);
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f5328a.b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f5329b.b()).booleanValue();
    }
}
