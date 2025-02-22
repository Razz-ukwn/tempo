package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.v;
import s9.f0;
import s9.k0;
import s9.p0;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ei  reason: invalid package */
public final class ei extends t {

    /* renamed from: o  reason: collision with root package name */
    public final String f4519o;

    /* renamed from: p  reason: collision with root package name */
    public final String f4520p;

    /* renamed from: q  reason: collision with root package name */
    public final String f4521q;

    /* renamed from: r  reason: collision with root package name */
    public final String f4522r;

    public ei(String str, String str2, String str3, String str4) {
        super(2);
        q.g("email cannot be null or empty", str);
        q.g("password cannot be null or empty", str2);
        this.f4519o = str;
        this.f4520p = str2;
        this.f4521q = str3;
        this.f4522r = str4;
    }

    public final String a() {
        return "reauthenticateWithEmailPasswordWithData";
    }

    public final void b() {
        p0 b10 = a.b(this.f4928c, this.f4934i);
        if (this.f4929d.z().equalsIgnoreCase(b10.f14858b.f14848a)) {
            ((f0) this.f4930e).a(this.f4933h, b10);
            f(new k0(b10));
            return;
        }
        e(new Status(17024, (String) null));
    }

    public final void c(TaskCompletionSource taskCompletionSource, c cVar) {
        this.f4932g = new v((Object) this, (Object) taskCompletionSource);
        cVar.c(this.f4519o, this.f4520p, this.f4521q, this.f4522r, this.f4927b);
    }
}
