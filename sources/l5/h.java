package l5;

import android.os.SystemClock;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final double f10996a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f10997b = 0;

    public static double a(long j10) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j10)) * f10996a;
    }
}
