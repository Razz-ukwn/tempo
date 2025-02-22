package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d5  reason: invalid package */
public final class d5 extends e5 {

    /* renamed from: c  reason: collision with root package name */
    public final transient int f4480c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f4481d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e5 f4482e;

    public d5(e5 e5Var, int i8, int i10) {
        this.f4482e = e5Var;
        this.f4480c = i8;
        this.f4481d = i10;
    }

    public final int b() {
        return this.f4482e.c() + this.f4480c + this.f4481d;
    }

    public final int c() {
        return this.f4482e.c() + this.f4480c;
    }

    public final Object[] d() {
        return this.f4482e.d();
    }

    /* renamed from: e */
    public final e5 subList(int i8, int i10) {
        wh.c(i8, i10, this.f4481d);
        int i11 = this.f4480c;
        return this.f4482e.subList(i8 + i11, i10 + i11);
    }

    public final Object get(int i8) {
        wh.a(i8, this.f4481d);
        return this.f4482e.get(i8 + this.f4480c);
    }

    public final int size() {
        return this.f4481d;
    }
}
