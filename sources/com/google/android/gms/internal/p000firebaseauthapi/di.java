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

/* renamed from: com.google.android.gms.internal.firebase-auth-api.di  reason: invalid package */
public final class di extends t {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f4496o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f4497p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public di(b bVar) {
        super(2);
        this.f4496o = 2;
        this.f4497p = b1.b.n(bVar, (String) null);
    }

    public final String a() {
        switch (this.f4496o) {
            case 0:
                return "reauthenticateWithEmailLinkWithData";
            case 1:
                return "sendSignInLinkToEmail";
            default:
                return "linkFederatedCredential";
        }
    }

    public final void b() {
        switch (this.f4496o) {
            case 0:
                p0 b10 = a.b(this.f4928c, this.f4934i);
                if (this.f4929d.z().equalsIgnoreCase(b10.f14858b.f14848a)) {
                    ((f0) this.f4930e).a(this.f4933h, b10);
                    f(new k0(b10));
                    return;
                }
                e(new Status(17024, (String) null));
                return;
            case 1:
                p0 b11 = a.b(this.f4928c, this.f4934i);
                ((f0) this.f4930e).a(this.f4933h, b11);
                f(new k0(b11));
                return;
            default:
                p0 b12 = a.b(this.f4928c, this.f4934i);
                ((f0) this.f4930e).a(this.f4933h, b12);
                f(new k0(b12));
                return;
        }
    }

    public final void c(TaskCompletionSource taskCompletionSource, c cVar) {
        int i8 = this.f4496o;
        s sVar = this.f4927b;
        Object obj = this.f4497p;
        switch (i8) {
            case 0:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                cVar.d((ph) obj, sVar);
                return;
            case 1:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                cVar.d((ph) obj, sVar);
                return;
            default:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                String F = this.f4929d.F();
                v0 v0Var = (v0) obj;
                cVar.getClass();
                q.f(F);
                q.i(v0Var);
                q.i(sVar);
                j3 j3Var = new j3(sVar, c.f4435b);
                u uVar = cVar.f4436a;
                uVar.getClass();
                q.f(F);
                uVar.f(F, new vh(uVar, v0Var, j3Var));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public di(c cVar, String str, int i8) {
        super(2);
        this.f4496o = i8;
        if (i8 != 1) {
            if (cVar != null) {
                this.f4497p = new ph(cVar, str);
                return;
            }
            throw new NullPointerException("credential cannot be null or empty");
        }
        super(2);
        if (cVar != null) {
            this.f4497p = new ph(cVar, str);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }
}
