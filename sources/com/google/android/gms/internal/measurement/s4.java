package com.google.android.gms.internal.measurement;

import android.util.Log;

public final class s4 extends z4 {
    public s4(w4 w4Var, String str, Long l10) {
        super(w4Var, str, l10);
    }

    public final /* synthetic */ Object a(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + this.f5621b + ": " + str);
            return null;
        }
    }
}
