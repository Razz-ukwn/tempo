package com.google.android.gms.common.api;

import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.f0;

public final class k<R extends h> extends BasePendingResult<R> {

    /* renamed from: k  reason: collision with root package name */
    public final h f4347k;

    public k(Status status) {
        super((f0) null);
        this.f4347k = status;
    }

    public final R b(Status status) {
        return this.f4347k;
    }
}
