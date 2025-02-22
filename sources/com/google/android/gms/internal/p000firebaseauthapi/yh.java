package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.v;
import r9.r;
import s9.f0;
import s9.k0;
import s9.n;
import s9.p0;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yh  reason: invalid package */
public final class yh extends t {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5111o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Object f5112p;

    public yh(String str) {
        super(1);
        q.g("refresh token cannot be null", str);
        this.f5112p = str;
    }

    public final String a() {
        switch (this.f5111o) {
            case 0:
                return "getAccessToken";
            default:
                return "reauthenticateWithPhoneCredentialWithData";
        }
    }

    public final void b() {
        switch (this.f5111o) {
            case 0:
                if (TextUtils.isEmpty(this.f4933h.f4723a)) {
                    m0 m0Var = this.f4933h;
                    String str = (String) this.f5112p;
                    m0Var.getClass();
                    q.f(str);
                    m0Var.f4723a = str;
                }
                ((f0) this.f4930e).a(this.f4933h, this.f4929d);
                f(n.a(this.f4933h.f4724b));
                return;
            default:
                p0 b10 = a.b(this.f4928c, this.f4934i);
                if (this.f4929d.z().equalsIgnoreCase(b10.f14858b.f14848a)) {
                    ((f0) this.f4930e).a(this.f4933h, b10);
                    f(new k0(b10));
                    return;
                }
                e(new Status(17024, (String) null));
                return;
        }
    }

    public final void c(TaskCompletionSource taskCompletionSource, c cVar) {
        int i8 = this.f5111o;
        s sVar = this.f4927b;
        Object obj = this.f5112p;
        switch (i8) {
            case 0:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                String str = (String) obj;
                cVar.getClass();
                q.f(str);
                q.i(sVar);
                j3 j3Var = new j3(sVar, c.f4435b);
                u uVar = cVar.f4436a;
                uVar.getClass();
                q.f(str);
                ((x) uVar.f2324b).c(new j3(str), new u(j3Var));
                return;
            default:
                this.f4932g = new v((Object) this, (Object) taskCompletionSource);
                cVar.a((v) obj, sVar);
                return;
        }
    }

    public yh(r rVar, String str) {
        super(2);
        if (rVar != null) {
            rVar.f14147e = false;
            this.f5112p = new v((Object) rVar, (Object) str);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }
}
