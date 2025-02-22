package com.google.android.gms.internal.measurement;

public final class ub implements tb {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f5547a;

    /* renamed from: b  reason: collision with root package name */
    public static final u4 f5548b;

    /* renamed from: c  reason: collision with root package name */
    public static final s4 f5549c;

    /* renamed from: d  reason: collision with root package name */
    public static final s4 f5550d;

    /* renamed from: e  reason: collision with root package name */
    public static final v4 f5551e;

    static {
        w4 w4Var = new w4(q4.a(), false, true);
        f5547a = w4Var.c("measurement.test.boolean_flag", false);
        f5548b = new u4(w4Var, Double.valueOf(-3.0d));
        f5549c = w4Var.a("measurement.test.int_flag", -2);
        f5550d = w4Var.a("measurement.test.long_flag", -1);
        f5551e = new v4(w4Var, "measurement.test.string_flag", "---");
    }

    public final double zza() {
        return ((Double) f5548b.b()).doubleValue();
    }

    public final long zzb() {
        return ((Long) f5549c.b()).longValue();
    }

    public final long zzc() {
        return ((Long) f5550d.b()).longValue();
    }

    public final String zzd() {
        return (String) f5551e.b();
    }

    public final boolean zze() {
        return ((Boolean) f5547a.b()).booleanValue();
    }
}
