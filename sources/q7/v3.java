package q7;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import u6.q;

public final class v3 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13380a;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue f13381b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13382c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ w3 f13383d;

    public v3(w3 w3Var, String str, BlockingQueue blockingQueue) {
        this.f13383d = w3Var;
        q.i(blockingQueue);
        this.f13380a = new Object();
        this.f13381b = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f13383d.E) {
            try {
                if (!this.f13382c) {
                    this.f13383d.F.release();
                    this.f13383d.E.notifyAll();
                    w3 w3Var = this.f13383d;
                    if (this == w3Var.f13398c) {
                        w3Var.f13398c = null;
                    } else if (this == w3Var.f13399d) {
                        w3Var.f13399d = null;
                    } else {
                        s2 s2Var = ((x3) w3Var.f13121a).E;
                        x3.l(s2Var);
                        s2Var.B.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f13382c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterruptedException interruptedException) {
        s2 s2Var = ((x3) this.f13383d.f13121a).E;
        x3.l(s2Var);
        s2Var.E.c(interruptedException, String.valueOf(getName()).concat(" was interrupted"));
    }

    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f13383d.F.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                u3 u3Var = (u3) this.f13381b.poll();
                if (u3Var != null) {
                    Process.setThreadPriority(true != u3Var.f13357b ? 10 : threadPriority);
                    u3Var.run();
                } else {
                    synchronized (this.f13380a) {
                        try {
                            if (this.f13381b.peek() == null) {
                                this.f13383d.getClass();
                                this.f13380a.wait(30000);
                            }
                        } catch (InterruptedException e11) {
                            b(e11);
                        } catch (Throwable th) {
                            while (true) {
                            }
                            throw th;
                        }
                    }
                    synchronized (this.f13383d.E) {
                        if (this.f13381b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
