package com.google.android.gms.internal.measurement;

import android.util.Log;

public final class t4 extends z4 {
    public t4(w4 w4Var, String str, Boolean bool) {
        super(w4Var, str, bool);
    }

    public final /* synthetic */ Object a(String str) {
        if (g4.f5285b.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (g4.f5286c.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f5621b + ": " + str);
        return null;
    }
}
