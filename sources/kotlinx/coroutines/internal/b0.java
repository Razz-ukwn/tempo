package kotlinx.coroutines.internal;

public final class b0 extends RuntimeException {
    public /* synthetic */ b0() {
        super("Failed to bind to the service.");
    }

    public /* synthetic */ b0(int i8) {
        super("Context cannot be null");
    }

    public /* synthetic */ b0(Throwable th) {
        super(th);
    }

    public /* synthetic */ b0(String str, Throwable th) {
        super(str, th);
    }
}
