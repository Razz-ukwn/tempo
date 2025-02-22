package com.google.android.gms.internal.p000firebaseauthapi;

import cb.c;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xa  reason: invalid package */
public final class xa {

    /* renamed from: b  reason: collision with root package name */
    public static final xa f5079b = new xa();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f5080a = new AtomicReference(new rb(new ob()));

    public final c a(lb lbVar) {
        AtomicReference atomicReference = this.f5080a;
        rb rbVar = (rb) atomicReference.get();
        rbVar.getClass();
        Class<lb> cls = lb.class;
        lh lhVar = lbVar.f4713b;
        if (!rbVar.f4882b.containsKey(new pb(cls, lhVar))) {
            try {
                return new ta(lbVar);
            } catch (GeneralSecurityException e10) {
                throw new sb("Creating a LegacyProtoKey failed", e10);
            }
        } else {
            rb rbVar2 = (rb) atomicReference.get();
            rbVar2.getClass();
            pb pbVar = new pb(cls, lhVar);
            HashMap hashMap = rbVar2.f4882b;
            if (hashMap.containsKey(pbVar)) {
                return ((ma) hashMap.get(pbVar)).a(lbVar);
            }
            throw new GeneralSecurityException(b2.c.a("No Key Parser for requested key type ", pbVar.toString(), " available"));
        }
    }

    public final synchronized void b(ja jaVar) {
        ob obVar = new ob((rb) this.f5080a.get());
        obVar.a(jaVar);
        this.f5080a.set(new rb(obVar));
    }

    public final synchronized void c(na naVar) {
        ob obVar = new ob((rb) this.f5080a.get());
        obVar.b(naVar);
        this.f5080a.set(new rb(obVar));
    }

    public final synchronized void d(ya yaVar) {
        ob obVar = new ob((rb) this.f5080a.get());
        obVar.c(yaVar);
        this.f5080a.set(new rb(obVar));
    }

    public final synchronized void e(ab abVar) {
        ob obVar = new ob((rb) this.f5080a.get());
        obVar.d(abVar);
        this.f5080a.set(new rb(obVar));
    }
}
