package com.google.android.gms.internal.measurement;

import b3.w;
import j1.c;
import java.util.HashMap;
import java.util.List;
import t.w2;

public final class j6 extends i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5339c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5340d;

    public j6(w wVar) {
        super("internal.eventLogger");
        this.f5340d = wVar;
    }

    public final o e(c cVar, List list) {
        t tVar = o.f5428j;
        switch (this.f5339c) {
            case 0:
                f4.h(this.f5319a, 3, list);
                String zzi = cVar.m((o) list.get(0)).zzi();
                long a10 = (long) f4.a(cVar.m((o) list.get(1)).zzh().doubleValue());
                o m = cVar.m((o) list.get(2));
                ((List) ((w) this.f5340d).f3199d).add(new b(zzi, a10, m instanceof l ? f4.g((l) m) : new HashMap()));
                return tVar;
            default:
                return tVar;
        }
    }

    public j6(w2 w2Var) {
        super("internal.remoteConfig");
        this.f5340d = w2Var;
        this.f5320b.put("getValue", new z7(w2Var));
    }
}
