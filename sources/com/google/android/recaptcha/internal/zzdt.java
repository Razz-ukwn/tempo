package com.google.android.recaptcha.internal;

import h0.e;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzdt {
    private final zzdw zza = zzdw.zza();
    private boolean zzb;
    private long zzc;
    private long zzd;

    public static zzdt zzb() {
        zzdt zzdt = new zzdt();
        zzdt.zze();
        return zzdt;
    }

    public static zzdt zzc() {
        return new zzdt();
    }

    private final long zzg() {
        return this.zzb ? (System.nanoTime() - this.zzd) + this.zzc : this.zzc;
    }

    public final String toString() {
        String str;
        long zzg = zzg();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(zzg, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(((double) zzg) / ((double) timeUnit2.convert(1, timeUnit)))});
        switch (zzds.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return e.b(format, " ", str);
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zzdt zzd() {
        this.zzc = 0;
        this.zzb = false;
        return this;
    }

    public final zzdt zze() {
        zzdr.zze(!this.zzb, "This stopwatch is already running.");
        this.zzb = true;
        this.zzd = System.nanoTime();
        return this;
    }

    public final zzdt zzf() {
        long nanoTime = System.nanoTime();
        zzdr.zze(this.zzb, "This stopwatch is already stopped.");
        this.zzb = false;
        this.zzc = (nanoTime - this.zzd) + this.zzc;
        return this;
    }
}
