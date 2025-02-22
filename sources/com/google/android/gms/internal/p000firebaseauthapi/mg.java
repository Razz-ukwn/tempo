package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mg  reason: invalid package */
public enum mg implements r2 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f4746a;

    /* access modifiers changed from: public */
    mg(int i8) {
        this.f4746a = i8;
    }

    public static mg a(int i8) {
        if (i8 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i8 == 1) {
            return TINK;
        }
        if (i8 == 2) {
            return LEGACY;
        }
        if (i8 == 3) {
            return RAW;
        }
        if (i8 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f4746a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
