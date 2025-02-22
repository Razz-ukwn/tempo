package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public enum t9 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(k6.f5359b),
    ENUM((String) null),
    MESSAGE((String) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f5536a;

    /* access modifiers changed from: public */
    t9(Serializable serializable) {
        this.f5536a = serializable;
    }
}
