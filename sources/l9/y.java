package l9;

public final class y implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f11037c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile c f11038a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f11039b = f11037c;

    public y(a aVar) {
        this.f11038a = aVar;
    }

    public final Object a() {
        Object obj = this.f11039b;
        Object obj2 = f11037c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f11039b;
                if (obj == obj2) {
                    obj = this.f11038a.a();
                    Object obj3 = this.f11039b;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f11039b = obj;
                    this.f11038a = null;
                }
            }
        }
        return obj;
    }
}
