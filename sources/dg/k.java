package dg;

import java.util.concurrent.CancellationException;

public final class k extends CancellationException {
    public k() {
        super("Child of the scoped flow was cancelled");
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
