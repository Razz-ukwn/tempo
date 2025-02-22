package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.tasks.TaskCompletionSource;
import t6.d;

public final class w0 extends t0 {

    /* renamed from: c  reason: collision with root package name */
    public final m0 f4336c;

    public w0(m0 m0Var, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f4336c = m0Var;
    }

    public final /* bridge */ /* synthetic */ void d(s sVar, boolean z10) {
    }

    public final boolean f(b0 b0Var) {
        return this.f4336c.f4307a.f4299c;
    }

    public final d[] g(b0 b0Var) {
        return this.f4336c.f4307a.f4298b;
    }

    public final void h(b0 b0Var) {
        l lVar = this.f4336c.f4307a;
        ((o0) lVar).f4311d.f4303a.c(b0Var.f4218b, this.f4333b);
        i.a aVar = this.f4336c.f4307a.f4297a.f4275c;
        if (aVar != null) {
            b0Var.f4222g.put(aVar, this.f4336c);
        }
    }
}
