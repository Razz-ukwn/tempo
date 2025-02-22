package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public enum p7 {
    VOID(Void.class, (int) null),
    INT(r7, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(k6.class, k6.f5359b),
    ENUM(r7, (int) null),
    MESSAGE(Object.class, (int) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f5470a;

    /* access modifiers changed from: public */
    p7(Class cls, Serializable serializable) {
        this.f5470a = serializable;
    }
}
