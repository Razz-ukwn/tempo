package f9;

public final class b implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f8610c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile c f8611a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f8612b = f8610c;

    public b(c cVar) {
        this.f8611a = cVar;
    }

    public static c a(c cVar) {
        return cVar instanceof b ? cVar : new b(cVar);
    }

    public final Object zza() {
        Object obj = this.f8612b;
        Object obj2 = f8610c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f8612b;
                if (obj == obj2) {
                    obj = this.f8611a.zza();
                    Object obj3 = this.f8612b;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f8612b = obj;
                    this.f8611a = null;
                }
            }
        }
        return obj;
    }
}
