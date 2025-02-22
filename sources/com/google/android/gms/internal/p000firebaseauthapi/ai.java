package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.v;
import r9.b;
import r9.c;
import s9.f0;
import s9.k0;
import s9.p0;
import u6.q;
import v6.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ai  reason: invalid package */
public final class ai extends t {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f4408o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final a f4409p;

    public ai(b bVar, String str) {
        super(2);
        if (bVar != null) {
            v0 n2 = b1.b.n(bVar, str);
            n2.F = false;
            this.f4409p = n2;
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    public final String a() {
        switch (this.f4408o) {
            case 0:
                return "linkEmailAuthCredential";
            default:
                return "reauthenticateWithCredentialWithData";
        }
    }

    public final void b() {
        switch (this.f4408o) {
            case 0:
                p0 b10 = a.b(this.f4928c, this.f4934i);
                ((f0) this.f4930e).a(this.f4933h, b10);
                f(new k0(b10));
                return;
            default:
                p0 b11 = a.b(this.f4928c, this.f4934i);
                if (this.f4929d.z().equalsIgnoreCase(b11.f14858b.f14848a)) {
                    ((f0) this.f4930e).a(this.f4933h, b11);
                    f(new k0(b11));
                    return;
                }
                e(new Status(17024, (String) null));
                return;
        }
    }

    public final void c(TaskCompletionSource taskCompletionSource, c cVar) {
        int i8 = this.f4408o;
        s sVar = this.f4927b;
        a aVar = this.f4409p;
        switch (i8) {
            case 0:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                c cVar2 = (c) aVar;
                String str = cVar2.f14113a;
                String str2 = cVar2.f14114b;
                q.f(str2);
                String F = this.f4929d.F();
                cVar.getClass();
                q.f(str);
                q.f(str2);
                q.f(F);
                q.i(sVar);
                j3 j3Var = new j3(sVar, c.f4435b);
                u uVar = cVar.f4436a;
                uVar.getClass();
                q.f(str);
                q.f(str2);
                q.f(F);
                uVar.f(F, new q1.a(uVar, str, str2, j3Var));
                return;
            default:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                cVar.b((v0) aVar, sVar);
                return;
        }
    }

    public ai(c cVar) {
        super(2);
        this.f4409p = cVar;
        q.g("email cannot be null", cVar.f14113a);
        q.g("password cannot be null", cVar.f14114b);
    }
}
