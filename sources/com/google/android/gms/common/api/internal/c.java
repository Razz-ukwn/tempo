package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import u6.q;

public abstract class c<R extends h, A> extends BasePendingResult<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(a aVar, f0 f0Var) {
        super(f0Var);
        if (f0Var != null) {
            if (aVar == null) {
                throw new NullPointerException("Api must not be null");
            }
            return;
        }
        throw new NullPointerException("GoogleApiClient must not be null");
    }

    public abstract void i(a.e eVar);

    public final void j(Status status) {
        q.b(!(status.f4176b <= 0), "Failed result must not be success");
        e(b(status));
    }
}
