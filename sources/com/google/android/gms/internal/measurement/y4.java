package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class y4 {
    public static o a(d4 d4Var) {
        if (d4Var == null) {
            return o.f5428j;
        }
        int C = d4Var.C() - 1;
        if (C == 1) {
            return d4Var.B() ? new s(d4Var.w()) : o.f5434q;
        }
        if (C == 2) {
            return d4Var.A() ? new h(Double.valueOf(d4Var.t())) : new h((Double) null);
        }
        if (C == 3) {
            return d4Var.z() ? new f(Boolean.valueOf(d4Var.y())) : new f((Boolean) null);
        }
        if (C == 4) {
            l7<d4> x10 = d4Var.x();
            ArrayList arrayList = new ArrayList();
            for (d4 a10 : x10) {
                arrayList.add(a(a10));
            }
            return new p(d4Var.v(), arrayList);
        }
        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
    }

    public static o b(Object obj) {
        if (obj == null) {
            return o.f5429k;
        }
        if (obj instanceof String) {
            return new s((String) obj);
        }
        if (obj instanceof Double) {
            return new h((Double) obj);
        }
        if (obj instanceof Long) {
            return new h(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new h(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new f((Boolean) obj);
        }
        if (obj instanceof Map) {
            l lVar = new l();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                o b10 = b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    lVar.b((String) next, b10);
                }
            }
            return lVar;
        } else if (obj instanceof List) {
            e eVar = new e();
            for (Object b11 : (List) obj) {
                eVar.k(eVar.e(), b(b11));
            }
            return eVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
