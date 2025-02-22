package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y2  reason: invalid package */
public class y2 {

    /* renamed from: a  reason: collision with root package name */
    public volatile o3 f5093a;

    /* renamed from: b  reason: collision with root package name */
    public volatile q1 f5094b;

    static {
        c2 c2Var = c2.f4439b;
    }

    public final q1 a() {
        if (this.f5094b != null) {
            return this.f5094b;
        }
        synchronized (this) {
            if (this.f5094b != null) {
                q1 q1Var = this.f5094b;
                return q1Var;
            }
            if (this.f5093a == null) {
                this.f5094b = q1.f4830b;
            } else {
                this.f5094b = this.f5093a.zzo();
            }
            q1 q1Var2 = this.f5094b;
            return q1Var2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.internal.p000firebaseauthapi.o3 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.firebase-auth-api.o3 r0 = r1.f5093a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.firebase-auth-api.o3 r0 = r1.f5093a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f5093a = r2     // Catch:{ w2 -> 0x0011 }
            com.google.android.gms.internal.firebase-auth-api.p1 r0 = com.google.android.gms.internal.p000firebaseauthapi.q1.f4830b     // Catch:{ w2 -> 0x0011 }
            r1.f5094b = r0     // Catch:{ w2 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f5093a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.firebase-auth-api.p1 r2 = com.google.android.gms.internal.p000firebaseauthapi.q1.f4830b     // Catch:{ all -> 0x001b }
            r1.f5094b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.y2.b(com.google.android.gms.internal.firebase-auth-api.o3):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        o3 o3Var = this.f5093a;
        o3 o3Var2 = y2Var.f5093a;
        if (o3Var == null && o3Var2 == null) {
            return a().equals(y2Var.a());
        }
        if (o3Var != null && o3Var2 != null) {
            return o3Var.equals(o3Var2);
        }
        if (o3Var != null) {
            y2Var.b(o3Var.f());
            return o3Var.equals(y2Var.f5093a);
        }
        b(o3Var2.f());
        return this.f5093a.equals(o3Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
