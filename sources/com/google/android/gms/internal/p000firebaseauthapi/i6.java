package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.lifecycle.u;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i6  reason: invalid package */
public final class i6 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f4636a = new AtomicReference(new r5());

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f4637b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap f4638c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f4639d = new ConcurrentHashMap();

    static {
        Logger.getLogger(i6.class.getName());
        new ConcurrentHashMap();
    }

    public static m5 a(String str) {
        return ((r5) f4636a.get()).d(str).zzb();
    }

    public static synchronized rf b(tf tfVar) {
        rf e10;
        synchronized (i6.class) {
            m5 a10 = a(tfVar.y());
            if (((Boolean) f4638c.get(tfVar.y())).booleanValue()) {
                e10 = a10.e(tfVar.x());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(tfVar.y())));
            }
        }
        return e10;
    }

    public static synchronized o3 c(tf tfVar) {
        o3 d10;
        synchronized (i6.class) {
            m5 a10 = a(tfVar.y());
            if (((Boolean) f4638c.get(tfVar.y())).booleanValue()) {
                d10 = a10.d(tfVar.x());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(tfVar.y())));
            }
        }
        return d10;
    }

    public static Object d(String str, p2 p2Var, Class cls) {
        return ((r5) f4636a.get()).a(cls, str).b(p2Var);
    }

    public static synchronized void e(kb kbVar, ra raVar) {
        synchronized (i6.class) {
            AtomicReference atomicReference = f4636a;
            r5 r5Var = new r5((r5) atomicReference.get());
            r5Var.b(kbVar, raVar);
            Map c3 = kbVar.a().c();
            String d10 = kbVar.d();
            h(d10, c3, true);
            String d11 = raVar.d();
            h(d11, Collections.emptyMap(), false);
            if (!((r5) atomicReference.get()).f4875a.containsKey(d10)) {
                f4637b.put(d10, new u(kbVar, 4));
                i(kbVar.d(), kbVar.a().c());
            }
            ConcurrentHashMap concurrentHashMap = f4638c;
            concurrentHashMap.put(d10, Boolean.TRUE);
            concurrentHashMap.put(d11, Boolean.FALSE);
            atomicReference.set(r5Var);
        }
    }

    public static synchronized void f(ra raVar) {
        synchronized (i6.class) {
            AtomicReference atomicReference = f4636a;
            r5 r5Var = new r5((r5) atomicReference.get());
            r5Var.c(raVar);
            Map c3 = raVar.a().c();
            String d10 = raVar.d();
            h(d10, c3, true);
            if (!((r5) atomicReference.get()).f4875a.containsKey(d10)) {
                f4637b.put(d10, new u(raVar, 4));
                i(d10, raVar.a().c());
            }
            f4638c.put(d10, Boolean.TRUE);
            atomicReference.set(r5Var);
        }
    }

    public static synchronized void g(f6 f6Var) {
        synchronized (i6.class) {
            wa waVar = wa.f5049b;
            synchronized (waVar) {
                hb hbVar = new hb((jb) waVar.f5050a.get());
                hbVar.b(f6Var);
                waVar.f5050a.set(new jb(hbVar));
            }
        }
    }

    public static synchronized void h(String str, Map map, boolean z10) {
        synchronized (i6.class) {
            if (z10) {
                ConcurrentHashMap concurrentHashMap = f4638c;
                if (concurrentHashMap.containsKey(str)) {
                    if (!((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (((r5) f4636a.get()).f4875a.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f4639d.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f4639d.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.google.android.gms.internal.firebase-auth-api.o3, java.lang.Object] */
    public static void i(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f4639d.put((String) entry.getKey(), t5.a(str, ((pa) entry.getValue()).f4815a.a(), ((pa) entry.getValue()).f4816b));
        }
    }
}
