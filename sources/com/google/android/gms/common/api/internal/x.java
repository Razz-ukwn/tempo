package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.b;
import h7.i;

public final class x implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f4337a;

    public x(e eVar) {
        this.f4337a = eVar;
    }

    public final void a(boolean z10) {
        i iVar = this.f4337a.m;
        iVar.sendMessage(iVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
