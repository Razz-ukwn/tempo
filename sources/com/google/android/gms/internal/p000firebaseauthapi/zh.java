package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.appcompat.widget.l;
import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import com.google.android.gms.tasks.TaskCompletionSource;
import e.s;
import f3.v;
import r9.b;
import r9.c;
import r9.m;
import s9.f0;
import s9.k0;
import s9.p0;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zh  reason: invalid package */
public final class zh extends t {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5138o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Object f5139p;

    public zh(String str) {
        super(10);
        q.f("RECAPTCHA_ENTERPRISE");
        this.f5139p = new l(str);
    }

    public final String a() {
        switch (this.f5138o) {
            case 0:
                return "getRecaptchaConfig";
            case 1:
                return "linkEmailAuthCredential";
            default:
                return "signInWithCredential";
        }
    }

    public final void b() {
        switch (this.f5138o) {
            case 0:
                f(this.f4937l);
                return;
            case 1:
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
        int i8 = this.f5138o;
        s sVar = this.f4927b;
        Object obj = this.f5139p;
        switch (i8) {
            case 0:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                l lVar = (l) obj;
                cVar.getClass();
                q.i(lVar);
                k0 k0Var = new k0((String) lVar.f1058b);
                j3 j3Var = new j3(sVar, c.f4435b);
                u uVar = cVar.f4436a;
                uVar.getClass();
                ((x) uVar.f2324b).e(k0Var, new s(j3Var));
                return;
            case 1:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                c cVar2 = (c) obj;
                m mVar = this.f4929d;
                cVar2.getClass();
                cVar2.f14116d = mVar.F();
                cVar2.f14117e = true;
                cVar.d(new ph(cVar2, (String) null), sVar);
                return;
            default:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                cVar.b((v0) obj, sVar);
                return;
        }
    }

    public zh(b bVar, String str) {
        super(2);
        if (bVar != null) {
            this.f5139p = b1.b.n(bVar, str);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    public zh(c cVar) {
        super(2);
        this.f5139p = cVar;
    }
}
