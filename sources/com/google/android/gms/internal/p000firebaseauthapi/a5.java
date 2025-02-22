package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a5  reason: invalid package */
public enum a5 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(q1.f4830b),
    ENUM((String) null),
    MESSAGE((String) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f4379a;

    /* access modifiers changed from: public */
    a5(Serializable serializable) {
        this.f4379a = serializable;
    }
}
