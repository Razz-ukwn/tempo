package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<e0> f5875a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar d10 = d((Calendar) null);
        d10.setTimeInMillis(j10);
        return b(d10).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar d10 = d(calendar);
        Calendar d11 = d((Calendar) null);
        d11.set(d10.get(1), d10.get(2), d10.get(5));
        return d11;
    }

    public static Calendar c() {
        e0 e0Var = f5875a.get();
        if (e0Var == null) {
            e0Var = e0.f5872c;
        }
        TimeZone timeZone = e0Var.f5874b;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = e0Var.f5873a;
        if (l10 != null) {
            instance.setTimeInMillis(l10.longValue());
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar d(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
