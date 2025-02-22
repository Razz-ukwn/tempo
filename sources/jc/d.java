package jc;

import ee.e;

public final class d extends c0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f9903a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9904b = this;

    /* renamed from: c  reason: collision with root package name */
    public ef.a<ae.a> f9905c;

    public static final class a<T> implements ef.a<T> {
        public final T get() {
            return new e();
        }
    }

    public d(g gVar) {
        this.f9903a = gVar;
        this.f9905c = ie.a.a(new a());
    }

    public final ae.a a() {
        return this.f9905c.get();
    }

    public final a b() {
        return new a(this.f9903a, this.f9904b);
    }
}
