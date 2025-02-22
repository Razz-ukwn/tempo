package af;

import java.util.concurrent.ThreadFactory;
import se.a;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    public static final e f350c = new e("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f351b = f350c;

    public final a.b a() {
        return new d(this.f351b);
    }
}
