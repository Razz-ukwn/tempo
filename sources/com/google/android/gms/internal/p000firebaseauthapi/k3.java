package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k3  reason: invalid package */
public final class k3 {
    public static final void a(Object obj, Object obj2) {
        j3 j3Var = (j3) obj;
        i3 i3Var = (i3) obj2;
        if (!j3Var.isEmpty()) {
            Iterator it = j3Var.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public static final boolean b(Object obj) {
        return !((j3) obj).f4660a;
    }

    public static final j3 c(Object obj, Object obj2) {
        j3 j3Var = (j3) obj;
        j3 j3Var2 = (j3) obj2;
        if (!j3Var2.isEmpty()) {
            if (!j3Var.f4660a) {
                j3Var = j3Var.b();
            }
            j3Var.i();
            if (!j3Var2.isEmpty()) {
                j3Var.putAll(j3Var2);
            }
        }
        return j3Var;
    }
}
