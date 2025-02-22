package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.tasks.TaskCompletionSource;
import t6.d;

public final class y0 extends t0 {

    /* renamed from: c  reason: collision with root package name */
    public final i.a f4343c;

    public y0(i.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f4343c = aVar;
    }

    public final /* bridge */ /* synthetic */ void d(s sVar, boolean z10) {
    }

    public final boolean f(b0 b0Var) {
        m0 m0Var = (m0) b0Var.f4222g.get(this.f4343c);
        return m0Var != null && m0Var.f4307a.f4299c;
    }

    public final d[] g(b0 b0Var) {
        m0 m0Var = (m0) b0Var.f4222g.get(this.f4343c);
        if (m0Var == null) {
            return null;
        }
        return m0Var.f4307a.f4298b;
    }

    public final void h(b0 b0Var) {
        m0 m0Var = (m0) b0Var.f4222g.remove(this.f4343c);
        TaskCompletionSource taskCompletionSource = this.f4333b;
        if (m0Var != null) {
            ((p0) m0Var.f4308b).f4319a.f4304b.c(b0Var.f4218b, taskCompletionSource);
            i iVar = m0Var.f4307a.f4297a;
            iVar.f4274b = null;
            iVar.f4275c = null;
            return;
        }
        taskCompletionSource.trySetResult(Boolean.FALSE);
    }
}
