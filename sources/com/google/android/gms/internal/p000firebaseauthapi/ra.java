package com.google.android.gms.internal.p000firebaseauthapi;

import b2.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ra  reason: invalid package */
public abstract class ra {

    /* renamed from: a  reason: collision with root package name */
    public final Class f4878a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f4879b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f4880c;

    @SafeVarargs
    public ra(Class cls, gb... gbVarArr) {
        this.f4878a = cls;
        HashMap hashMap = new HashMap();
        int i8 = 0;
        while (i8 <= 0) {
            gb gbVar = gbVarArr[i8];
            boolean containsKey = hashMap.containsKey(gbVar.f4578a);
            Class cls2 = gbVar.f4578a;
            if (!containsKey) {
                hashMap.put(cls2, gbVar);
                i8++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls2.getCanonicalName())));
            }
        }
        this.f4880c = gbVarArr[0].f4578a;
        this.f4879b = Collections.unmodifiableMap(hashMap);
    }

    public abstract qa a();

    public abstract int b();

    public abstract o3 c(q1 q1Var);

    public abstract String d();

    public abstract void e(o3 o3Var);

    public int f() {
        return 1;
    }

    public final Object g(o3 o3Var, Class cls) {
        gb gbVar = (gb) this.f4879b.get(cls);
        if (gbVar != null) {
            return gbVar.a(o3Var);
        }
        throw new IllegalArgumentException(c.a("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }
}
