package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.hb  reason: invalid package */
public final class hb {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4622a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4623b;

    public hb() {
        this.f4622a = new HashMap();
        this.f4623b = new HashMap();
    }

    public final void a(db dbVar) {
        ib ibVar = new ib(dbVar.f4549a, dbVar.f4550b);
        HashMap hashMap = this.f4622a;
        if (hashMap.containsKey(ibVar)) {
            fb fbVar = (fb) hashMap.get(ibVar);
            if (!fbVar.equals(dbVar) || !dbVar.equals(fbVar)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(ibVar.toString()));
            }
            return;
        }
        hashMap.put(ibVar, dbVar);
    }

    public final void b(f6 f6Var) {
        if (f6Var != null) {
            Class zzb = f6Var.zzb();
            HashMap hashMap = this.f4623b;
            if (hashMap.containsKey(zzb)) {
                f6 f6Var2 = (f6) hashMap.get(zzb);
                if (!f6Var2.equals(f6Var) || !f6Var.equals(f6Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
                }
                return;
            }
            hashMap.put(zzb, f6Var);
            return;
        }
        throw new NullPointerException("wrapper must be non-null");
    }

    public hb(jb jbVar) {
        this.f4622a = new HashMap(jbVar.f4669a);
        this.f4623b = new HashMap(jbVar.f4670b);
    }
}
