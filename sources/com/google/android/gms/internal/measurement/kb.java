package com.google.android.gms.internal.measurement;

public final class kb implements jb {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5375a;

    static {
        w4 w4Var = new w4(q4.a(), false, true);
        w4Var.c("measurement.sdk.collection.enable_extend_user_property_size", true);
        w4Var.c("measurement.sdk.collection.last_deep_link_referrer2", true);
        f5375a = w4Var.c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        w4Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return ((Boolean) f5375a.b()).booleanValue();
    }
}
