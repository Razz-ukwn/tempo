package com.google.android.recaptcha.internal;

public enum zzln implements zzhh {
    UNKNOWN(0),
    INIT_NATIVE(1),
    INIT_NETWORK(2),
    INIT_JS(3),
    INIT_TOTAL(4),
    EXECUTE_NATIVE(5),
    EXECUTE_JS(6),
    EXECUTE_TOTAL(7),
    CHALLENGE_ACCOUNT_NATIVE(8),
    CHALLENGE_ACCOUNT_JS(9),
    CHALLENGE_ACCOUNT_TOTAL(10),
    VERIFY_PIN_NATIVE(11),
    VERIFY_PIN_JS(12),
    VERIFY_PIN_TOTAL(13),
    RUN_PROGRAM(14),
    FETCH_ALLOWLIST(15),
    JS_LOAD(16),
    WEB_VIEW_RELOAD_JS(17),
    UNRECOGNIZED(-1);
    
    private static final zzhi zzt = null;
    private final int zzv;

    /* access modifiers changed from: public */
    static {
        zzt = new zzlm();
    }

    private zzln(int i8) {
        this.zzv = i8;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzv;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
