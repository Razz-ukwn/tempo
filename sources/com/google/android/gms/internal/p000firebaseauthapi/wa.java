package com.google.android.gms.internal.p000firebaseauthapi;

import b2.c;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wa  reason: invalid package */
public final class wa {

    /* renamed from: b  reason: collision with root package name */
    public static final wa f5049b = new wa();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f5050a = new AtomicReference(new jb(new hb()));

    public final Class a() {
        HashMap hashMap = ((jb) this.f5050a.get()).f4670b;
        Class<k5> cls = k5.class;
        if (hashMap.containsKey(cls)) {
            return ((f6) hashMap.get(cls)).zza();
        }
        throw new GeneralSecurityException(c.a("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object b(cb.c cVar, Class cls) {
        jb jbVar = (jb) this.f5050a.get();
        jbVar.getClass();
        ib ibVar = new ib(cVar.getClass(), cls);
        HashMap hashMap = jbVar.f4669a;
        if (hashMap.containsKey(ibVar)) {
            return ((fb) hashMap.get(ibVar)).a(cVar);
        }
        throw new GeneralSecurityException(c.a("No PrimitiveConstructor for ", ibVar.toString(), " available"));
    }

    public final synchronized void c(db dbVar) {
        hb hbVar = new hb((jb) this.f5050a.get());
        hbVar.a(dbVar);
        this.f5050a.set(new jb(hbVar));
    }
}
