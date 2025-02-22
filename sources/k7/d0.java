package k7;

import ag.m;

public final class d0 extends c0 {

    /* renamed from: e  reason: collision with root package name */
    public static final d0 f10358e = new d0(0, new Object[0]);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f10359c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f10360d;

    public d0(int i8, Object[] objArr) {
        this.f10359c = objArr;
        this.f10360d = i8;
    }

    public final void a(Object[] objArr) {
        System.arraycopy(this.f10359c, 0, objArr, 0, this.f10360d);
    }

    public final int b() {
        return this.f10360d;
    }

    public final int c() {
        return 0;
    }

    public final boolean f() {
        return false;
    }

    public final Object[] g() {
        return this.f10359c;
    }

    public final Object get(int i8) {
        m.w(i8, this.f10360d);
        Object obj = this.f10359c[i8];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f10360d;
    }
}
