package f6;

public final class a<T> implements ef.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f8596c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile ef.a<T> f8597a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f8598b = f8596c;

    public a(b bVar) {
        this.f8597a = bVar;
    }

    public static ef.a a(b bVar) {
        return bVar instanceof a ? bVar : new a(bVar);
    }

    public final T get() {
        T t2 = this.f8598b;
        T t10 = f8596c;
        if (t2 == t10) {
            synchronized (this) {
                t2 = this.f8598b;
                if (t2 == t10) {
                    t2 = this.f8597a.get();
                    T t11 = this.f8598b;
                    if (t11 != t10) {
                        if (t11 != t2) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + t11 + " & " + t2 + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f8598b = t2;
                    this.f8597a = null;
                }
            }
        }
        return t2;
    }
}
