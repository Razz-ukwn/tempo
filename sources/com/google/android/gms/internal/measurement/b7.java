package com.google.android.gms.internal.measurement;

public final class b7 implements g8 {

    /* renamed from: a  reason: collision with root package name */
    public static final b7 f5165a = new b7();

    public final f8 zzb(Class cls) {
        Class<g7> cls2 = g7.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (f8) g7.k(cls.asSubclass(cls2)).s(3);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return g7.class.isAssignableFrom(cls);
    }
}
