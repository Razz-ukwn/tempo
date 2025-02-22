package com.google.android.gms.internal.measurement;

public final class nb implements mb {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5425a;

    static {
        w4 w4Var = new w4(q4.a(), false, true);
        w4Var.a("measurement.id.lifecycle.app_in_background_parameter", 0);
        w4Var.c("measurement.lifecycle.app_backgrounded_tracking", true);
        f5425a = w4Var.c("measurement.lifecycle.app_in_background_parameter", false);
    }

    public final boolean zza() {
        return ((Boolean) f5425a.b()).booleanValue();
    }
}
