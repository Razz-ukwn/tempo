package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h6  reason: invalid package */
public final class h6 extends n5 implements g6 {

    /* renamed from: c  reason: collision with root package name */
    public final kb f4615c;

    /* renamed from: d  reason: collision with root package name */
    public final ra f4616d;

    public h6(kb kbVar, ra raVar, Class cls) {
        super(kbVar, cls);
        this.f4615c = kbVar;
        this.f4616d = raVar;
    }

    public final rf a(q1 q1Var) {
        ra raVar = this.f4616d;
        kb kbVar = this.f4615c;
        try {
            o3 c3 = kbVar.c(q1Var);
            kbVar.e(c3);
            o3 h3 = kbVar.h(c3);
            raVar.e(h3);
            qf t2 = rf.t();
            String d10 = raVar.d();
            t2.j();
            ((rf) t2.f4729b).zzd = d10;
            p1 zzo = h3.zzo();
            t2.j();
            ((rf) t2.f4729b).zze = zzo;
            int b10 = raVar.b();
            t2.j();
            rf.B((rf) t2.f4729b, b10);
            return (rf) t2.h();
        } catch (w2 e10) {
            throw new GeneralSecurityException("expected serialized proto of type ", e10);
        }
    }
}
