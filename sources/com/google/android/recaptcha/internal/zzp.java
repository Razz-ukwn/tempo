package com.google.android.recaptcha.internal;

import ag.e1;
import ag.g0;
import ag.g2;
import ag.j2;
import ag.s0;
import cb.b;
import cb.d;
import d2.f1;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import jf.f;
import kotlinx.coroutines.internal.e;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.scheduling.c;

public final class zzp {
    public static final zzp zza = new zzp();
    private static final g0 zzb;
    private static final g0 zzc;
    private static final g0 zzd = f1.e(s0.f481b);

    static {
        g2 f10 = d.f();
        c cVar = s0.f480a;
        zzb = new e(f10.n0(m.f10728a));
        e e10 = f1.e(new e1(Executors.newScheduledThreadPool(1, new j2(new AtomicInteger()))));
        b.D(e10, (f.b) null, 0, new zzo((jf.d) null), 3);
        zzc = e10;
    }

    private zzp() {
    }

    public static final g0 zza() {
        return zzd;
    }

    public static final g0 zzb() {
        return zzb;
    }

    public static final g0 zzc() {
        return zzc;
    }
}
