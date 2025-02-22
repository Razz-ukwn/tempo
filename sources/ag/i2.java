package ag;

public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<y0> f422a = new ThreadLocal<>();

    public static y0 a() {
        ThreadLocal<y0> threadLocal = f422a;
        y0 y0Var = threadLocal.get();
        if (y0Var != null) {
            return y0Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
