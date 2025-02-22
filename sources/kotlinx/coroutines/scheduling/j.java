package kotlinx.coroutines.scheduling;

import ag.i0;

public final class j extends g {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f10766c;

    public j(Runnable runnable, long j10, h hVar) {
        super(j10, hVar);
        this.f10766c = runnable;
    }

    public final void run() {
        try {
            this.f10766c.run();
        } finally {
            this.f10764b.a();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f10766c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(i0.d(runnable));
        sb2.append(", ");
        sb2.append(this.f10763a);
        sb2.append(", ");
        sb2.append(this.f10764b);
        sb2.append(']');
        return sb2.toString();
    }
}
