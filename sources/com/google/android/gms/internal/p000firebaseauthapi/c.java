package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import androidx.appcompat.widget.l;
import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import f3.v;
import m9.f;
import r9.r;
import u6.q;
import x6.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c  reason: invalid package */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4435b = new a("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a  reason: collision with root package name */
    public final u f4436a;

    public c(f fVar) {
        q.i(fVar);
        fVar.a();
        Context context = fVar.f11331a;
        q.i(context);
        this.f4436a = new u(new p(fVar, o.b()));
        new a0(context);
    }

    public final void a(v vVar, s sVar) {
        q.i(sVar);
        q.i(vVar);
        r rVar = (r) vVar.f8516a;
        q.i(rVar);
        a1 f10 = g.f(rVar);
        j3 j3Var = new j3(sVar, f4435b);
        u uVar = this.f4436a;
        uVar.getClass();
        ((x) uVar.f2324b).i(f10, new rh(uVar, j3Var, 1));
    }

    public final void b(v0 v0Var, s sVar) {
        q.i(v0Var);
        q.i(sVar);
        j3 j3Var = new j3(sVar, f4435b);
        u uVar = this.f4436a;
        uVar.getClass();
        v0Var.K = true;
        ((x) uVar.f2324b).g(v0Var, new l((Object) uVar, (Object) j3Var, 9));
    }

    public final void c(String str, String str2, String str3, String str4, s sVar) {
        q.f(str);
        q.f(str2);
        q.i(sVar);
        j3 j3Var = new j3(sVar, f4435b);
        u uVar = this.f4436a;
        uVar.getClass();
        q.f(str);
        q.f(str2);
        ((x) uVar.f2324b).h(new y0(str, str2, str3, str4), new j3(uVar, j3Var, 0));
    }

    public final void d(ph phVar, s sVar) {
        q.i(phVar);
        r9.c cVar = (r9.c) phVar.f4819a;
        q.i(cVar);
        q.i(sVar);
        String str = (String) phVar.f4820b;
        j3 j3Var = new j3(sVar, f4435b);
        u uVar = this.f4436a;
        uVar.getClass();
        q.i(cVar);
        if (cVar.f14117e) {
            uVar.f(cVar.f14116d, new j1.c(uVar, cVar, str, j3Var));
            return;
        }
        ((x) uVar.f2324b).b(new e0(cVar, (String) null, str), new rh(uVar, j3Var, 0));
    }
}
