package d6;

import f6.b;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class o implements b<Executor> {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final o f7355a = new o();
    }

    public final Object get() {
        return new q(Executors.newSingleThreadExecutor());
    }
}
