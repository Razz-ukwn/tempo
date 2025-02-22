package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.List;
import r3.s;

public final class jd extends i {

    /* renamed from: c  reason: collision with root package name */
    public final s f5345c;

    public jd(s sVar) {
        super("internal.logger");
        this.f5345c = sVar;
        this.f5320b.put("log", new id(this, false, true));
        this.f5320b.put("silent", new ra());
        ((i) this.f5320b.get("silent")).b("log", new id(this, true, true));
        this.f5320b.put("unmonitored", new sb());
        ((i) this.f5320b.get("unmonitored")).b("log", new id(this, false, false));
    }

    public final o e(c cVar, List list) {
        return o.f5428j;
    }
}
