package com.google.android.gms.internal.measurement;

public class q7 {

    /* renamed from: a  reason: collision with root package name */
    public volatile h8 f5485a;

    /* renamed from: b  reason: collision with root package name */
    public volatile k6 f5486b;

    static {
        s6 s6Var = s6.f5516b;
    }

    public final k6 a() {
        if (this.f5486b != null) {
            return this.f5486b;
        }
        synchronized (this) {
            if (this.f5486b != null) {
                k6 k6Var = this.f5486b;
                return k6Var;
            }
            if (this.f5485a == null) {
                this.f5486b = k6.f5359b;
            } else {
                this.f5486b = this.f5485a.g();
            }
            k6 k6Var2 = this.f5486b;
            return k6Var2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.internal.measurement.h8 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.h8 r0 = r1.f5485a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.h8 r0 = r1.f5485a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f5485a = r2     // Catch:{ o7 -> 0x0011 }
            com.google.android.gms.internal.measurement.i6 r0 = com.google.android.gms.internal.measurement.k6.f5359b     // Catch:{ o7 -> 0x0011 }
            r1.f5486b = r0     // Catch:{ o7 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f5485a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.i6 r2 = com.google.android.gms.internal.measurement.k6.f5359b     // Catch:{ all -> 0x001b }
            r1.f5486b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q7.b(com.google.android.gms.internal.measurement.h8):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        h8 h8Var = this.f5485a;
        h8 h8Var2 = q7Var.f5485a;
        if (h8Var == null && h8Var2 == null) {
            return a().equals(q7Var.a());
        }
        if (h8Var != null && h8Var2 != null) {
            return h8Var.equals(h8Var2);
        }
        if (h8Var != null) {
            q7Var.b(h8Var.b());
            return h8Var.equals(q7Var.f5485a);
        }
        b(h8Var2.b());
        return this.f5485a.equals(h8Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
