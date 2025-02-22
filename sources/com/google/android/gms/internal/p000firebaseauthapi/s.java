package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.q;
import com.google.android.gms.common.api.Status;
import q1.a;
import r9.g0;
import r9.r;
import s9.j;
import s9.l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s  reason: invalid package */
public final class s implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f4888a;

    public s(t tVar) {
        this.f4888a = tVar;
    }

    public final void a(m0 m0Var) {
        t tVar = this.f4888a;
        int i8 = tVar.f4926a;
        String a10 = q.a("Unexpected response type: ", i8);
        boolean z10 = true;
        if (i8 != 1) {
            z10 = false;
        }
        u6.q.k(z10, a10);
        tVar.f4933h = m0Var;
        tVar.b();
        u6.q.k(tVar.m, "no success or failure set on method implementation");
    }

    public final void b(qh qhVar) {
        t tVar = this.f4888a;
        tVar.f4936k = qhVar;
        tVar.e(j.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void c(Status status) {
        String str = status.f4177c;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, (String) null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, (String) null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, (String) null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, (String) null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, (String) null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, (String) null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, (String) null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, (String) null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, (String) null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, (String) null);
            }
        }
        t tVar = this.f4888a;
        if (tVar.f4926a != 8) {
            l lVar = tVar.f4931f;
            if (lVar != null) {
                lVar.b(status);
            }
            tVar.e(status);
            return;
        }
        tVar.m = true;
        throw null;
    }

    public final void d(m0 m0Var, h0 h0Var) {
        t tVar = this.f4888a;
        int i8 = tVar.f4926a;
        u6.q.k(i8 == 2, q.a("Unexpected response type: ", i8));
        tVar.f4933h = m0Var;
        tVar.f4934i = h0Var;
        tVar.b();
        u6.q.k(tVar.m, "no success or failure set on method implementation");
    }

    public final void e(l0 l0Var) {
        t tVar = this.f4888a;
        tVar.f4937l = l0Var;
        tVar.b();
        u6.q.k(tVar.m, "no success or failure set on method implementation");
    }

    public final void f(Status status, r rVar) {
        t tVar = this.f4888a;
        int i8 = tVar.f4926a;
        u6.q.k(i8 == 2, q.a("Unexpected response type ", i8));
        l lVar = tVar.f4931f;
        if (lVar != null) {
            lVar.b(status);
        }
        tVar.f4935j = rVar;
        l lVar2 = tVar.f4931f;
        if (lVar2 != null) {
            lVar2.b(status);
        }
        tVar.e(status);
    }

    public final void g(a aVar) {
        Status status = (Status) aVar.f12824a;
        g0 g0Var = (g0) aVar.f12825b;
        t tVar = this.f4888a;
        l lVar = tVar.f4931f;
        if (lVar != null) {
            lVar.b(status);
        }
        tVar.f4935j = g0Var;
        l lVar2 = tVar.f4931f;
        if (lVar2 != null) {
            lVar2.b(status);
        }
        tVar.e(status);
    }
}
