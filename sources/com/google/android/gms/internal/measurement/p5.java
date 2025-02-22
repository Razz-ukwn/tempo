package com.google.android.gms.internal.measurement;

public final class p5 extends r5 {

    /* renamed from: c  reason: collision with root package name */
    public final transient int f5462c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f5463d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r5 f5464e;

    public p5(r5 r5Var, int i8, int i10) {
        this.f5464e = r5Var;
        this.f5462c = i8;
        this.f5463d = i10;
    }

    public final int b() {
        return this.f5464e.c() + this.f5462c + this.f5463d;
    }

    public final int c() {
        return this.f5464e.c() + this.f5462c;
    }

    public final Object[] d() {
        return this.f5464e.d();
    }

    /* renamed from: e */
    public final r5 subList(int i8, int i10) {
        d5.b(i8, i10, this.f5463d);
        int i11 = this.f5462c;
        return this.f5464e.subList(i8 + i11, i10 + i11);
    }

    public final Object get(int i8) {
        d5.a(i8, this.f5463d);
        return this.f5464e.get(i8 + this.f5462c);
    }

    public final int size() {
        return this.f5463d;
    }
}
