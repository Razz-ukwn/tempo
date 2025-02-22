package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

public final class d8 {
    public static final void a(Object obj, Object obj2) {
        c8 c8Var = (c8) obj;
        b8 b8Var = (b8) obj2;
        if (!c8Var.isEmpty()) {
            Iterator it = c8Var.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public static final c8 b(Object obj, Object obj2) {
        c8 c8Var = (c8) obj;
        c8 c8Var2 = (c8) obj2;
        if (!c8Var2.isEmpty()) {
            if (!c8Var.f5181a) {
                c8Var = c8Var.b();
            }
            c8Var.i();
            if (!c8Var2.isEmpty()) {
                c8Var.putAll(c8Var2);
            }
        }
        return c8Var;
    }
}
