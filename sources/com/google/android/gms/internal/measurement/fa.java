package com.google.android.gms.internal.measurement;

public final class fa implements ea {

    /* renamed from: a  reason: collision with root package name */
    public static final s4 f5275a;

    static {
        w4 w4Var = new w4(q4.a(), false, true);
        w4Var.c("measurement.client.consent_state_v1", true);
        w4Var.c("measurement.client.3p_consent_state_v1", true);
        w4Var.c("measurement.service.consent_state_v1_W36", true);
        f5275a = w4Var.a("measurement.service.storage_consent_support_version", 203600);
    }

    public final long zza() {
        return ((Long) f5275a.b()).longValue();
    }
}
