package c2;

public final class f<T> extends e {

    /* renamed from: c  reason: collision with root package name */
    public final Object f3661c = new Object();

    public f(int i8) {
        super(i8);
    }

    public final boolean a(T t2) {
        boolean a10;
        synchronized (this.f3661c) {
            a10 = super.a(t2);
        }
        return a10;
    }

    public final T b() {
        T b10;
        synchronized (this.f3661c) {
            b10 = super.b();
        }
        return b10;
    }
}
