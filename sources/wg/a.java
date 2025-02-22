package wg;

import ff.m;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import sf.j;

public class a extends j0 {

    /* renamed from: h  reason: collision with root package name */
    public static final long f16722h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f16723i;

    /* renamed from: j  reason: collision with root package name */
    public static a f16724j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16725e;

    /* renamed from: f  reason: collision with root package name */
    public a f16726f;

    /* renamed from: g  reason: collision with root package name */
    public long f16727g;

    /* renamed from: wg.a$a  reason: collision with other inner class name */
    public static final class C0308a {
        public static a a() {
            a aVar = a.f16724j;
            j.c(aVar);
            a aVar2 = aVar.f16726f;
            Class<a> cls = a.class;
            if (aVar2 == null) {
                long nanoTime = System.nanoTime();
                cls.wait(a.f16722h);
                a aVar3 = a.f16724j;
                j.c(aVar3);
                if (aVar3.f16726f != null || System.nanoTime() - nanoTime < a.f16723i) {
                    return null;
                }
                return a.f16724j;
            }
            long nanoTime2 = aVar2.f16727g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j10 = nanoTime2 / 1000000;
                cls.wait(j10, (int) (nanoTime2 - (1000000 * j10)));
                return null;
            }
            a aVar4 = a.f16724j;
            j.c(aVar4);
            aVar4.f16726f = aVar2.f16726f;
            aVar2.f16726f = null;
            return aVar2;
        }
    }

    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0017, code lost:
            r1.k();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<wg.a> r0 = wg.a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                wg.a r1 = wg.a.f16724j     // Catch:{ all -> 0x001b }
                wg.a r1 = wg.a.C0308a.a()     // Catch:{ all -> 0x001b }
                wg.a r2 = wg.a.f16724j     // Catch:{ all -> 0x001b }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                wg.a.f16724j = r1     // Catch:{ all -> 0x001b }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x001b }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: wg.a.b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f16722h = millis;
        f16723i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        a aVar;
        long j10 = this.f16772c;
        boolean z10 = this.f16770a;
        int i8 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i8 != 0 || z10) {
            synchronized (a.class) {
                if (!this.f16725e) {
                    this.f16725e = true;
                    if (f16724j == null) {
                        f16724j = new a();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (i8 != 0 && z10) {
                        this.f16727g = Math.min(j10, c() - nanoTime) + nanoTime;
                    } else if (i8 != 0) {
                        this.f16727g = j10 + nanoTime;
                    } else if (z10) {
                        this.f16727g = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j11 = this.f16727g - nanoTime;
                    a aVar2 = f16724j;
                    j.c(aVar2);
                    while (true) {
                        aVar = aVar2.f16726f;
                        if (aVar == null) {
                            break;
                        } else if (j11 < aVar.f16727g - nanoTime) {
                            break;
                        } else {
                            aVar2 = aVar;
                        }
                    }
                    this.f16726f = aVar;
                    aVar2.f16726f = this;
                    if (aVar2 == f16724j) {
                        a.class.notify();
                    }
                    m mVar = m.f8717a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }
    }

    public final boolean i() {
        synchronized (a.class) {
            if (!this.f16725e) {
                return false;
            }
            this.f16725e = false;
            a aVar = f16724j;
            while (aVar != null) {
                a aVar2 = aVar.f16726f;
                if (aVar2 == this) {
                    aVar.f16726f = this.f16726f;
                    this.f16726f = null;
                    return false;
                }
                aVar = aVar2;
            }
            return true;
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
