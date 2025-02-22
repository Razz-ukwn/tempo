package z5;

import z5.d;

public final class b extends d.a {

    /* renamed from: d  reason: collision with root package name */
    public static final d<b> f17725d;

    /* renamed from: b  reason: collision with root package name */
    public double f17726b = 0.0d;

    /* renamed from: c  reason: collision with root package name */
    public double f17727c = 0.0d;

    static {
        d<b> a10 = d.a(64, new b());
        f17725d = a10;
        a10.f17737f = 0.5f;
    }

    public static b b(double d10, double d11) {
        b b10 = f17725d.b();
        b10.f17726b = d10;
        b10.f17727c = d11;
        return b10;
    }

    public static void c(b bVar) {
        f17725d.c(bVar);
    }

    public final d.a a() {
        return new b();
    }

    public final String toString() {
        return "MPPointD, x: " + this.f17726b + ", y: " + this.f17727c;
    }
}
