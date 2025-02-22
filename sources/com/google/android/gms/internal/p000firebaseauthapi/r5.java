package com.google.android.gms.internal.p000firebaseauthapi;

import ag.m;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r5  reason: invalid package */
public final class r5 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f4874b = Logger.getLogger(r5.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f4875a;

    public r5() {
        this.f4875a = new ConcurrentHashMap();
    }

    public final m5 a(Class cls, String str) {
        q5 d10 = d(str);
        if (d10.zze().contains(cls)) {
            return d10.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(d10.zzc());
        Set<Class> zze = d10.zze();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : zze) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        String sb3 = sb2.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb3);
    }

    public final synchronized void b(kb kbVar, ra raVar) {
        Class zzd;
        if (!m.y(1)) {
            String valueOf = String.valueOf(kbVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (m.y(raVar.f())) {
            String d10 = kbVar.d();
            String d11 = raVar.d();
            if (!(!this.f4875a.containsKey(d10) || ((q5) this.f4875a.get(d10)).zzd() == null || (zzd = ((q5) this.f4875a.get(d10)).zzd()) == null)) {
                if (!zzd.getName().equals(raVar.getClass().getName())) {
                    Logger logger = f4874b;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d10 + " with inconsistent public key type " + d11);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{kbVar.getClass().getName(), zzd.getName(), raVar.getClass().getName()}));
                }
            }
            e(new p5(kbVar, raVar), true);
            e(new o5(raVar), false);
        } else {
            String valueOf2 = String.valueOf(raVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void c(ra raVar) {
        if (m.y(raVar.f())) {
            e(new o5(raVar), false);
        } else {
            String valueOf = String.valueOf(raVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    public final synchronized q5 d(String str) {
        if (this.f4875a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (q5) this.f4875a.get(str);
    }

    public final synchronized void e(q5 q5Var, boolean z10) {
        String zze = q5Var.zzb().zze();
        q5 q5Var2 = (q5) this.f4875a.get(zze);
        if (q5Var2 != null) {
            if (!q5Var2.zzc().equals(q5Var.zzc())) {
                f4874b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zze));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zze, q5Var2.zzc().getName(), q5Var.zzc().getName()}));
            }
        }
        if (!z10) {
            this.f4875a.putIfAbsent(zze, q5Var);
        } else {
            this.f4875a.put(zze, q5Var);
        }
    }

    public r5(r5 r5Var) {
        this.f4875a = new ConcurrentHashMap(r5Var.f4875a);
    }
}
