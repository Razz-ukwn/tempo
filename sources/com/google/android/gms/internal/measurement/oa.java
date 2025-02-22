package com.google.android.gms.internal.measurement;

public final class oa implements na {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5450a;

    /* renamed from: b  reason: collision with root package name */
    public static final t4 f5451b;

    /* renamed from: c  reason: collision with root package name */
    public static final t4 f5452c;

    static {
        w4 w4Var = new w4(q4.a(), false, true);
        w4Var.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f5450a = w4Var.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        f5451b = w4Var.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f5452c = w4Var.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f5450a.b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f5451b.b()).booleanValue();
    }

    public final boolean zzd() {
        return ((Boolean) f5452c.b()).booleanValue();
    }
}
