package ie;

public final class a<T> implements ef.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f9660c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile ef.a<T> f9661a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f9662b = f9660c;

    public a(ef.a<T> aVar) {
        this.f9661a = aVar;
    }

    public static <P extends ef.a<T>, T> ef.a<T> a(P p10) {
        return p10 instanceof a ? p10 : new a(p10);
    }

    public final T get() {
        T t2 = this.f9662b;
        T t10 = f9660c;
        if (t2 == t10) {
            synchronized (this) {
                t2 = this.f9662b;
                if (t2 == t10) {
                    t2 = this.f9661a.get();
                    T t11 = this.f9662b;
                    if (t11 != t10) {
                        if (t11 != t2) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + t11 + " & " + t2 + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f9662b = t2;
                    this.f9661a = null;
                }
            }
        }
        return t2;
    }
}
