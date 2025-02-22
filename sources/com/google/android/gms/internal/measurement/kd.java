package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.List;
import java.util.TreeMap;

public final class kd extends i {

    /* renamed from: c  reason: collision with root package name */
    public final od f5378c;

    public kd(od odVar) {
        super("internal.registerCallback");
        this.f5378c = odVar;
    }

    public final o e(c cVar, List list) {
        TreeMap treeMap;
        f4.h(this.f5319a, 3, list);
        cVar.m((o) list.get(0)).zzi();
        o m = cVar.m((o) list.get(1));
        if (m instanceof n) {
            o m10 = cVar.m((o) list.get(2));
            if (m10 instanceof l) {
                l lVar = (l) m10;
                if (lVar.a("type")) {
                    String zzi = lVar.d("type").zzi();
                    int b10 = lVar.a("priority") ? f4.b(lVar.d("priority").zzh().doubleValue()) : 1000;
                    n nVar = (n) m;
                    od odVar = this.f5378c;
                    odVar.getClass();
                    if ("create".equals(zzi)) {
                        treeMap = odVar.f5456b;
                    } else if ("edit".equals(zzi)) {
                        treeMap = odVar.f5455a;
                    } else {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(zzi)));
                    }
                    if (treeMap.containsKey(Integer.valueOf(b10))) {
                        b10 = ((Integer) treeMap.lastKey()).intValue() + 1;
                    }
                    treeMap.put(Integer.valueOf(b10), nVar);
                    return o.f5428j;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
