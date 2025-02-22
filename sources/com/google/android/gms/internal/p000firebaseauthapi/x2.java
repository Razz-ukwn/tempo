package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x2  reason: invalid package */
public enum x2 {
    VOID(Void.class, (int) null),
    INT(r7, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(q1.class, q1.f4830b),
    ENUM(r7, (int) null),
    MESSAGE(Object.class, (int) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f5070a;

    /* access modifiers changed from: public */
    x2(Class cls, Serializable serializable) {
        this.f5070a = serializable;
    }
}
