package k7;

import java.util.concurrent.Executor;

public enum f0 implements Executor {
    ;

    /* access modifiers changed from: public */
    f0() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
