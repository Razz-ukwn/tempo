package com.google.android.gms.internal.measurement;

public final class mc implements lc {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5404a;

    /* renamed from: b  reason: collision with root package name */
    public static final t4 f5405b;

    /* renamed from: c  reason: collision with root package name */
    public static final t4 f5406c;

    /* renamed from: d  reason: collision with root package name */
    public static final t4 f5407d;

    static {
        w4 w4Var = new w4(q4.a(), true, true);
        f5404a = w4Var.c("measurement.collection.enable_session_stitching_token.client.dev", true);
        f5405b = w4Var.c("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f5406c = w4Var.c("measurement.session_stitching_token_enabled", false);
        f5407d = w4Var.c("measurement.link_sst_to_sid", false);
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f5404a.b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f5405b.b()).booleanValue();
    }

    public final boolean zzd() {
        return ((Boolean) f5406c.b()).booleanValue();
    }

    public final boolean zze() {
        return ((Boolean) f5407d.b()).booleanValue();
    }
}
