package com.google.android.gms.internal.measurement;

public final class pc implements oc {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5476a;

    static {
        w4 w4Var = new w4(q4.a(), true, true);
        w4Var.c("measurement.client.sessions.background_sessions_enabled", true);
        f5476a = w4Var.c("measurement.client.sessions.enable_fix_background_engagement", false);
        w4Var.c("measurement.client.sessions.immediate_start_enabled_foreground", true);
        w4Var.c("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        w4Var.c("measurement.client.sessions.session_id_enabled", true);
    }

    public final boolean zza() {
        return ((Boolean) f5476a.b()).booleanValue();
    }
}
