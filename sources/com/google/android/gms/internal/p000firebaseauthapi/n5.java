package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n5  reason: invalid package */
public class n5 implements m5 {

    /* renamed from: a  reason: collision with root package name */
    public final ra f4749a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f4750b;

    public n5(ra raVar, Class cls) {
        if (raVar.f4879b.keySet().contains(cls) || Void.class.equals(cls)) {
            this.f4749a = raVar;
            this.f4750b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{raVar.toString(), cls.getName()}));
    }

    public final Object b(p2 p2Var) {
        ra raVar = this.f4749a;
        String name = raVar.f4878a.getName();
        if (raVar.f4878a.isInstance(p2Var)) {
            Class cls = this.f4750b;
            if (!Void.class.equals(cls)) {
                raVar.e(p2Var);
                return raVar.g(p2Var, cls);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        throw new GeneralSecurityException("Expected proto of type ".concat(name));
    }

    public final Object c(q1 q1Var) {
        ra raVar = this.f4749a;
        try {
            o3 c3 = raVar.c(q1Var);
            Class cls = this.f4750b;
            if (!Void.class.equals(cls)) {
                raVar.e(c3);
                return raVar.g(c3, cls);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (w2 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(raVar.f4878a.getName()), e10);
        }
    }

    public final o3 d(q1 q1Var) {
        ra raVar = this.f4749a;
        try {
            qa a10 = raVar.a();
            o3 b10 = a10.b(q1Var);
            a10.d(b10);
            return a10.a(b10);
        } catch (w2 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(raVar.a().f4843a.getName()), e10);
        }
    }

    public final rf e(q1 q1Var) {
        ra raVar = this.f4749a;
        try {
            qa a10 = raVar.a();
            o3 b10 = a10.b(q1Var);
            a10.d(b10);
            o3 a11 = a10.a(b10);
            qf t2 = rf.t();
            String d10 = raVar.d();
            t2.j();
            ((rf) t2.f4729b).zzd = d10;
            p1 zzo = a11.zzo();
            t2.j();
            ((rf) t2.f4729b).zze = zzo;
            int b11 = raVar.b();
            t2.j();
            rf.B((rf) t2.f4729b, b11);
            return (rf) t2.h();
        } catch (w2 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public final String zze() {
        return this.f4749a.d();
    }
}
