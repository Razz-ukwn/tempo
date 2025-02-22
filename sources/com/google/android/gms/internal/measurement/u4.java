package com.google.android.gms.internal.measurement;

import android.util.Log;

public final class u4 extends z4 {
    public u4(w4 w4Var, Double d10) {
        super(w4Var, "measurement.test.double_flag", d10);
    }

    public final /* synthetic */ Object a(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.f5621b + ": " + str);
            return null;
        }
    }
}
