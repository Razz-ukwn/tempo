package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p5  reason: invalid package */
public final class p5 implements q5 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kb f4805a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ra f4806b;

    public p5(kb kbVar, ra raVar) {
        this.f4805a = kbVar;
        this.f4806b = raVar;
    }

    public final m5 zza(Class cls) {
        try {
            return new h6(this.f4805a, this.f4806b, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final m5 zzb() {
        kb kbVar = this.f4805a;
        return new h6(kbVar, this.f4806b, kbVar.f4880c);
    }

    public final Class zzc() {
        return this.f4805a.getClass();
    }

    public final Class zzd() {
        return this.f4806b.getClass();
    }

    public final Set zze() {
        return this.f4805a.f4879b.keySet();
    }
}
