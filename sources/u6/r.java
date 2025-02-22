package u6;

public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static r f15852b;

    /* renamed from: c  reason: collision with root package name */
    public static final s f15853c = new s(0, 0, 0, false, false);

    /* renamed from: a  reason: collision with root package name */
    public s f15854a;

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            if (f15852b == null) {
                f15852b = new r();
            }
            rVar = f15852b;
        }
        return rVar;
    }
}
