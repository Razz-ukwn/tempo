package dg;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.g;

public final class a extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient g<?> f7525a;

    public a(g<?> gVar) {
        super("Flow was aborted, no more elements needed");
        this.f7525a = gVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
