package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l2  reason: invalid package */
public final class l2 implements n3 {

    /* renamed from: a  reason: collision with root package name */
    public static final l2 f4701a = new l2();

    public final m3 zzb(Class cls) {
        Class<p2> cls2 = p2.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (m3) p2.p(cls.asSubclass(cls2)).n(3);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return p2.class.isAssignableFrom(cls);
    }
}
