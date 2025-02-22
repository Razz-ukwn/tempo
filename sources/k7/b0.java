package k7;

import ag.m;

public final class b0 extends c0 {

    /* renamed from: c  reason: collision with root package name */
    public final transient int f10350c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f10351d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c0 f10352e;

    public b0(c0 c0Var, int i8, int i10) {
        this.f10352e = c0Var;
        this.f10350c = i8;
        this.f10351d = i10;
    }

    public final int b() {
        return this.f10352e.c() + this.f10350c + this.f10351d;
    }

    public final int c() {
        return this.f10352e.c() + this.f10350c;
    }

    public final boolean f() {
        return true;
    }

    public final Object[] g() {
        return this.f10352e.g();
    }

    public final Object get(int i8) {
        m.w(i8, this.f10351d);
        return this.f10352e.get(i8 + this.f10350c);
    }

    /* renamed from: h */
    public final c0 subList(int i8, int i10) {
        m.G(i8, i10, this.f10351d);
        int i11 = this.f10350c;
        return this.f10352e.subList(i8 + i11, i10 + i11);
    }

    public final int size() {
        return this.f10351d;
    }
}
