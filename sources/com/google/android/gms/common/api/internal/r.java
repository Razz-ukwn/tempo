package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;

public final class r implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f4320a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f4321b;

    public r(s sVar, c cVar) {
        this.f4321b = sVar;
        this.f4320a = cVar;
    }

    public final void a(Status status) {
        this.f4321b.f4330a.remove(this.f4320a);
    }
}
