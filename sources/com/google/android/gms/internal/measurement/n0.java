package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class n0 extends t0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f5411a = new AtomicReference();

    /* renamed from: b  reason: collision with root package name */
    public boolean f5412b;

    public static final Object L(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e10);
            throw e10;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle b(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f5411a
            monitor-enter(r0)
            boolean r1 = r2.f5412b     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f5411a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f5411a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n0.b(long):android.os.Bundle");
    }

    public final String c(long j10) {
        return (String) L(b(j10), String.class);
    }

    public final void q(Bundle bundle) {
        synchronized (this.f5411a) {
            try {
                this.f5411a.set(bundle);
                this.f5412b = true;
                this.f5411a.notify();
            } catch (Throwable th) {
                this.f5411a.notify();
                throw th;
            }
        }
    }
}
