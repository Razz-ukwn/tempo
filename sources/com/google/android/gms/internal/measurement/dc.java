package com.google.android.gms.internal.measurement;

public final class dc implements cc {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5247a;

    /* renamed from: b  reason: collision with root package name */
    public static final t4 f5248b;

    static {
        w4 w4Var = new w4(q4.a(), true, true);
        w4Var.c("measurement.redaction.app_instance_id", true);
        w4Var.c("measurement.redaction.client_ephemeral_aiid_generation", true);
        w4Var.c("measurement.redaction.config_redacted_fields", true);
        w4Var.c("measurement.redaction.device_info", true);
        w4Var.c("measurement.redaction.e_tag", true);
        w4Var.c("measurement.redaction.enhanced_uid", true);
        w4Var.c("measurement.redaction.populate_ephemeral_app_instance_id", true);
        w4Var.c("measurement.redaction.google_signals", true);
        w4Var.c("measurement.redaction.no_aiid_in_config_request", true);
        f5247a = w4Var.c("measurement.redaction.retain_major_os_version", true);
        f5248b = w4Var.c("measurement.redaction.scion_payload_generator", true);
        w4Var.c("measurement.redaction.upload_redacted_fields", true);
        w4Var.c("measurement.redaction.upload_subdomain_override", true);
        w4Var.c("measurement.redaction.user_id", true);
    }

    public final boolean zza() {
        return ((Boolean) f5247a.b()).booleanValue();
    }

    public final boolean zzb() {
        return ((Boolean) f5248b.b()).booleanValue();
    }
}
