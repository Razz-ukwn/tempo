package com.google.android.gms.internal.measurement;

public final class qb implements pb {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5490a;

    /* renamed from: b  reason: collision with root package name */
    public static final t4 f5491b;

    static {
        w4 w4Var = new w4(q4.a(), true, true);
        f5490a = w4Var.c("measurement.collection.client.log_target_api_version", true);
        f5491b = w4Var.c("measurement.collection.service.log_target_api_version", true);
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f5490a.b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f5491b.b()).booleanValue();
    }
}
