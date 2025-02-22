package d6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class q implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f7357a;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f7358a;

        public a(Runnable runnable) {
            this.f7358a = runnable;
        }

        public final void run() {
            try {
                this.f7358a.run();
            } catch (Exception e10) {
                h6.a.b("Executor", "Background execution failure.", e10);
            }
        }
    }

    public q(ExecutorService executorService) {
        this.f7357a = executorService;
    }

    public final void execute(Runnable runnable) {
        this.f7357a.execute(new a(runnable));
    }
}
