package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import java.util.Set;
import u6.b;
import u6.j;
import u6.q;

public final class e0 implements b.c, q0 {

    /* renamed from: a  reason: collision with root package name */
    public final a.e f4253a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4254b;

    /* renamed from: c  reason: collision with root package name */
    public j f4255c = null;

    /* renamed from: d  reason: collision with root package name */
    public Set f4256d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4257e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f4258f;

    public e0(e eVar, a.e eVar2, a aVar) {
        this.f4258f = eVar;
        this.f4253a = eVar2;
        this.f4254b = aVar;
    }

    public final void a(t6.b bVar) {
        this.f4258f.m.post(new d0(this, bVar));
    }

    public final void b(t6.b bVar) {
        b0 b0Var = (b0) this.f4258f.f4249j.get(this.f4254b);
        if (b0Var != null) {
            q.d(b0Var.f4228n.m);
            a.e eVar = b0Var.f4218b;
            String name = eVar.getClass().getName();
            String valueOf = String.valueOf(bVar);
            eVar.b("onSignInFailed for " + name + " with " + valueOf);
            b0Var.q(bVar, (RuntimeException) null);
        }
    }
}
