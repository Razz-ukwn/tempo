package com.google.android.gms.internal.measurement;

import android.content.Context;

public final class i4 extends x4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5322a;

    /* renamed from: b  reason: collision with root package name */
    public final g5 f5323b;

    public i4(Context context, g5 g5Var) {
        this.f5322a = context;
        this.f5323b = g5Var;
    }

    public final Context a() {
        return this.f5322a;
    }

    public final g5 b() {
        return this.f5323b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f5323b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.x4
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.x4 r5 = (com.google.android.gms.internal.measurement.x4) r5
            android.content.Context r1 = r5.a()
            android.content.Context r3 = r4.f5322a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.g5 r1 = r4.f5323b
            if (r1 != 0) goto L_0x0022
            com.google.android.gms.internal.measurement.g5 r5 = r5.b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.android.gms.internal.measurement.g5 r5 = r5.b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.f5322a.hashCode() ^ 1000003;
        g5 g5Var = this.f5323b;
        return (hashCode * 1000003) ^ (g5Var == null ? 0 : g5Var.hashCode());
    }

    public final String toString() {
        String obj = this.f5322a.toString();
        String valueOf = String.valueOf(this.f5323b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
