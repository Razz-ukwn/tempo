package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.c;
import h7.i;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import r6.l;

public final class f0 extends v {
    @NotOnlyInitialized

    /* renamed from: b  reason: collision with root package name */
    public final c f4260b;

    public f0(c cVar) {
        this.f4260b = cVar;
    }

    public final c a(l lVar) {
        c cVar = this.f4260b;
        cVar.getClass();
        lVar.f4206i = lVar.f4206i || ((Boolean) BasePendingResult.f4197j.get()).booleanValue();
        e eVar = cVar.f4192j;
        eVar.getClass();
        v0 v0Var = new v0(lVar);
        i iVar = eVar.m;
        iVar.sendMessage(iVar.obtainMessage(4, new l0(v0Var, eVar.f4248i.get(), cVar)));
        return lVar;
    }
}
