package t9;

import qa.b;

public final class p<T> implements b<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f15486c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f15487a = f15486c;

    /* renamed from: b  reason: collision with root package name */
    public volatile b<T> f15488b;

    public p(b<T> bVar) {
        this.f15488b = bVar;
    }

    public final T get() {
        T t2 = this.f15487a;
        T t10 = f15486c;
        if (t2 == t10) {
            synchronized (this) {
                t2 = this.f15487a;
                if (t2 == t10) {
                    t2 = this.f15488b.get();
                    this.f15487a = t2;
                    this.f15488b = null;
                }
            }
        }
        return t2;
    }
}
