package com.google.android.gms.internal.measurement;

public final class u5 extends r5 {

    /* renamed from: e  reason: collision with root package name */
    public static final u5 f5542e = new u5(0, new Object[0]);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f5543c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f5544d;

    public u5(int i8, Object[] objArr) {
        this.f5543c = objArr;
        this.f5544d = i8;
    }

    public final void a(Object[] objArr) {
        System.arraycopy(this.f5543c, 0, objArr, 0, this.f5544d);
    }

    public final int b() {
        return this.f5544d;
    }

    public final int c() {
        return 0;
    }

    public final Object[] d() {
        return this.f5543c;
    }

    public final Object get(int i8) {
        d5.a(i8, this.f5544d);
        Object obj = this.f5543c[i8];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f5544d;
    }
}
