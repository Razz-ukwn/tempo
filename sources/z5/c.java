package z5;

import z5.d;

public final class c extends d.a {

    /* renamed from: d  reason: collision with root package name */
    public static final d<c> f17728d;

    /* renamed from: b  reason: collision with root package name */
    public float f17729b;

    /* renamed from: c  reason: collision with root package name */
    public float f17730c;

    static {
        d<c> a10 = d.a(32, new c(0));
        f17728d = a10;
        a10.f17737f = 0.5f;
    }

    public c() {
    }

    public static c b(float f10, float f11) {
        c b10 = f17728d.b();
        b10.f17729b = f10;
        b10.f17730c = f11;
        return b10;
    }

    public static c c(c cVar) {
        c b10 = f17728d.b();
        b10.f17729b = cVar.f17729b;
        b10.f17730c = cVar.f17730c;
        return b10;
    }

    public static void d(c cVar) {
        f17728d.c(cVar);
    }

    public final d.a a() {
        return new c(0);
    }

    public c(int i8) {
        this.f17729b = 0.0f;
        this.f17730c = 0.0f;
    }
}
