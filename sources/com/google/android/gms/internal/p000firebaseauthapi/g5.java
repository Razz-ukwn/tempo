package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g5  reason: invalid package */
public final class g5 extends e5 {

    /* renamed from: e  reason: collision with root package name */
    public static final g5 f4568e = new g5(0, new Object[0]);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f4569c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f4570d;

    public g5(int i8, Object[] objArr) {
        this.f4569c = objArr;
        this.f4570d = i8;
    }

    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f4569c;
        int i8 = this.f4570d;
        System.arraycopy(objArr2, 0, objArr, 0, i8);
        return i8;
    }

    public final int b() {
        return this.f4570d;
    }

    public final int c() {
        return 0;
    }

    public final Object[] d() {
        return this.f4569c;
    }

    public final Object get(int i8) {
        wh.a(i8, this.f4570d);
        Object obj = this.f4569c[i8];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f4570d;
    }
}
