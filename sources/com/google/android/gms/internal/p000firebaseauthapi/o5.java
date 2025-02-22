package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o5  reason: invalid package */
public final class o5 implements q5 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ra f4773a;

    public o5(ra raVar) {
        this.f4773a = raVar;
    }

    public final m5 zza(Class cls) {
        try {
            return new n5(this.f4773a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final m5 zzb() {
        ra raVar = this.f4773a;
        return new n5(raVar, raVar.f4880c);
    }

    public final Class zzc() {
        return this.f4773a.getClass();
    }

    public final Class zzd() {
        return null;
    }

    public final Set zze() {
        return this.f4773a.f4879b.keySet();
    }
}
