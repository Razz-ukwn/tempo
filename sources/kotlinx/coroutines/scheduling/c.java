package kotlinx.coroutines.scheduling;

public final class c extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final c f10760d = new c();

    public c() {
        super(k.f10768b, k.f10769c, k.f10770d);
    }

    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final String toString() {
        return "Dispatchers.Default";
    }
}
