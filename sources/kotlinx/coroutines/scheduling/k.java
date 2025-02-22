package kotlinx.coroutines.scheduling;

import d2.f1;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.w;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final long f10767a = f1.L("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final int f10768b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10769c = f1.M("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: d  reason: collision with root package name */
    public static final long f10770d = TimeUnit.SECONDS.toNanos(f1.L("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: e  reason: collision with root package name */
    public static final e f10771e = e.f10761b;

    /* renamed from: f  reason: collision with root package name */
    public static final i f10772f = new i(0);

    /* renamed from: g  reason: collision with root package name */
    public static final i f10773g = new i(1);

    static {
        int i8 = w.f10739a;
        if (i8 < 2) {
            i8 = 2;
        }
        f10768b = f1.M("kotlinx.coroutines.scheduler.core.pool.size", i8, 1, 0, 8);
    }
}
