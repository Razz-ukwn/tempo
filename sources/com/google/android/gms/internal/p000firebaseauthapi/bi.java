package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.a;
import f3.v;
import r9.r;
import s9.f0;
import s9.k0;
import s9.p0;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.bi  reason: invalid package */
public final class bi extends t {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f4433o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Object f4434p;

    public bi(r rVar) {
        super(2);
        this.f4434p = rVar;
    }

    public final String a() {
        switch (this.f4433o) {
            case 0:
                return "linkPhoneAuthCredential";
            default:
                return "signInWithPhoneNumber";
        }
    }

    public final void b() {
        switch (this.f4433o) {
            case 0:
                p0 b10 = a.b(this.f4928c, this.f4934i);
                ((f0) this.f4930e).a(this.f4933h, b10);
                f(new k0(b10));
                return;
            default:
                p0 b11 = a.b(this.f4928c, this.f4934i);
                ((f0) this.f4930e).a(this.f4933h, b11);
                f(new k0(b11));
                return;
        }
    }

    public final void c(TaskCompletionSource taskCompletionSource, c cVar) {
        int i8 = this.f4433o;
        s sVar = this.f4927b;
        Object obj = this.f4434p;
        switch (i8) {
            case 0:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                j3 j3Var = new j3((Object) this.f4929d.F(), (Object) (r) obj);
                cVar.getClass();
                q.i(sVar);
                r rVar = (r) j3Var.f1339b;
                q.i(rVar);
                String str = (String) j3Var.f1338a;
                q.f(str);
                a1 f10 = g.f(rVar);
                j3 j3Var2 = new j3(sVar, c.f4435b);
                u uVar = cVar.f4436a;
                uVar.getClass();
                q.f(str);
                uVar.f(str, new a(uVar, f10, j3Var2));
                return;
            default:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                cVar.a((v) obj, sVar);
                return;
        }
    }

    public bi(r rVar, String str) {
        super(2);
        q.i(rVar);
        this.f4434p = new v((Object) rVar, (Object) str);
    }
}
