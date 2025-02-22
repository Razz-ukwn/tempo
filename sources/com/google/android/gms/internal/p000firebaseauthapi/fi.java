package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import f3.v;
import s9.f0;
import s9.k0;
import s9.p0;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fi  reason: invalid package */
public final class fi extends t {

    /* renamed from: o  reason: collision with root package name */
    public final String f4553o;

    /* renamed from: p  reason: collision with root package name */
    public final String f4554p;

    /* renamed from: q  reason: collision with root package name */
    public final String f4555q;

    /* renamed from: r  reason: collision with root package name */
    public final String f4556r;

    public fi(String str, String str2, String str3, String str4) {
        super(2);
        q.g("email cannot be null or empty", str);
        q.g("password cannot be null or empty", str2);
        this.f4553o = str;
        this.f4554p = str2;
        this.f4555q = str3;
        this.f4556r = str4;
    }

    public final String a() {
        return "signInWithEmailAndPassword";
    }

    public final void b() {
        p0 b10 = a.b(this.f4928c, this.f4934i);
        ((f0) this.f4930e).a(this.f4933h, b10);
        f(new k0(b10));
    }

    public final void c(TaskCompletionSource taskCompletionSource, c cVar) {
        this.f4932g = new v((Object) this, (Object) taskCompletionSource);
        cVar.c(this.f4553o, this.f4554p, this.f4555q, this.f4556r, this.f4927b);
    }
}
