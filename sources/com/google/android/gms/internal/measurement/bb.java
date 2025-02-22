package com.google.android.gms.internal.measurement;

public final class bb implements ab {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5166a;

    static {
        w4 w4Var = new w4(q4.a(), true, true);
        w4Var.c("measurement.client.global_params", true);
        w4Var.c("measurement.service.global_params_in_payload", true);
        f5166a = w4Var.c("measurement.service.clear_global_params_on_uninstall", true);
        w4Var.c("measurement.service.global_params", true);
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f5166a.b()).booleanValue();
    }
}
