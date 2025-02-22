package com.google.android.gms.internal.measurement;

import j1.c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public final class h implements o {

    /* renamed from: a  reason: collision with root package name */
    public final Double f5300a;

    public h(Double d10) {
        if (d10 == null) {
            this.f5300a = Double.valueOf(Double.NaN);
        } else {
            this.f5300a = d10;
        }
    }

    public final o c(String str, c cVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new s(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{zzi(), str}));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f5300a.equals(((h) obj).f5300a);
    }

    public final int hashCode() {
        return this.f5300a.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    public final o zzd() {
        return new h(this.f5300a);
    }

    public final Boolean zzg() {
        Double d10 = this.f5300a;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public final Double zzh() {
        return this.f5300a;
    }

    public final String zzi() {
        Double d10 = this.f5300a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(d10.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
    }

    public final Iterator zzl() {
        return null;
    }
}
