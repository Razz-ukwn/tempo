package com.google.android.recaptcha.internal;

public abstract class zzdy implements Iterable {
    private final zzdn zza = zzdn.zza();

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        boolean z10 = true;
        for (Object append : this) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(append);
            z10 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
