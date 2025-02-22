package q6;

import ag.i0;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import cb.f;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.TaskCompletionSource;
import r6.i;
import r6.m;
import t6.e;
import u6.g0;
import u6.q;

public final class a extends c<GoogleSignInOptions> {

    /* renamed from: k  reason: collision with root package name */
    public static int f12882k = 1;

    public a(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, p6.a.f12467a, googleSignInOptions, new c.a(new i0(), Looper.getMainLooper()));
    }

    public final Intent d() {
        int f10 = f();
        int i8 = f10 - 1;
        if (f10 != 0) {
            a.c cVar = this.f4186d;
            Context context = this.f4183a;
            if (i8 == 2) {
                m.f14081a.a("getFallbackSignInIntent()", new Object[0]);
                Intent a10 = m.a(context, (GoogleSignInOptions) cVar);
                a10.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
                return a10;
            } else if (i8 == 3) {
                return m.a(context, (GoogleSignInOptions) cVar);
            } else {
                m.f14081a.a("getNoImplementationSignInIntent()", new Object[0]);
                Intent a11 = m.a(context, (GoogleSignInOptions) cVar);
                a11.setAction("com.google.android.gms.auth.NO_IMPL");
                return a11;
            }
        } else {
            throw null;
        }
    }

    public final void e() {
        o oVar;
        boolean z10 = f() == 3;
        m.f14081a.a("Signing out", new Object[0]);
        m.b(this.f4183a);
        f0 f0Var = this.f4190h;
        if (z10) {
            Status status = Status.B;
            q.j(status, "Result must not be null");
            o oVar2 = new o(f0Var);
            oVar2.e(status);
            oVar = oVar2;
        } else {
            i iVar = new i(f0Var);
            f0Var.a(iVar);
            oVar = iVar;
        }
        f fVar = new f();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        oVar.a(new g0(oVar, taskCompletionSource, fVar));
        taskCompletionSource.getTask();
    }

    public final synchronized int f() {
        int i8;
        i8 = f12882k;
        if (i8 == 1) {
            Context context = this.f4183a;
            e eVar = e.f15393d;
            int c3 = eVar.c(context, 12451000);
            if (c3 == 0) {
                i8 = 4;
                f12882k = 4;
            } else if (eVar.a(c3, context, (String) null) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                i8 = 2;
                f12882k = 2;
            } else {
                i8 = 3;
                f12882k = 3;
            }
        }
        return i8;
    }
}
