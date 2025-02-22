package wg;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import sf.j;

public class j0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f16769d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f16770a;

    /* renamed from: b  reason: collision with root package name */
    public long f16771b;

    /* renamed from: c  reason: collision with root package name */
    public long f16772c;

    public static final class a extends j0 {
        public final j0 d(long j10) {
            return this;
        }

        public final void f() {
        }

        public final j0 g(long j10, TimeUnit timeUnit) {
            j.f(timeUnit, "unit");
            return this;
        }
    }

    public j0 a() {
        this.f16770a = false;
        return this;
    }

    public j0 b() {
        this.f16772c = 0;
        return this;
    }

    public long c() {
        if (this.f16770a) {
            return this.f16771b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public j0 d(long j10) {
        this.f16770a = true;
        this.f16771b = j10;
        return this;
    }

    public boolean e() {
        return this.f16770a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f16770a && this.f16771b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public j0 g(long j10, TimeUnit timeUnit) {
        j.f(timeUnit, "unit");
        if (j10 >= 0) {
            this.f16772c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }
}
