package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import h0.e;
import java.util.Map;
import r6.l;

public final class v0 extends z0 {

    /* renamed from: b  reason: collision with root package name */
    public final c f4334b;

    public v0(l lVar) {
        super(1);
        this.f4334b = lVar;
    }

    public final void a(Status status) {
        try {
            this.f4334b.j(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void b(RuntimeException runtimeException) {
        try {
            this.f4334b.j(new Status(10, e.b(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage())));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.google.android.gms.common.api.internal.b0 r9) {
        /*
            r8 = this;
            com.google.android.gms.common.api.internal.c r0 = r8.f4334b     // Catch:{ RuntimeException -> 0x0037 }
            com.google.android.gms.common.api.a$e r9 = r9.f4218b     // Catch:{ RuntimeException -> 0x0037 }
            r0.getClass()     // Catch:{ RuntimeException -> 0x0037 }
            com.google.android.gms.common.api.a$e r9 = (com.google.android.gms.common.api.a.e) r9     // Catch:{ DeadObjectException -> 0x000f, RemoteException -> 0x000d }
            r0.i(r9)     // Catch:{ DeadObjectException -> 0x000f, RemoteException -> 0x000d }
            goto L_0x0023
        L_0x000d:
            r9 = move-exception
            goto L_0x0011
        L_0x000f:
            r9 = move-exception
            goto L_0x0024
        L_0x0011:
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x0037 }
            r3 = 8
            java.lang.String r4 = r9.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x0037 }
            r5 = 0
            r2 = 1
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x0037 }
            r0.j(r7)     // Catch:{ RuntimeException -> 0x0037 }
        L_0x0023:
            return
        L_0x0024:
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x0037 }
            r3 = 8
            java.lang.String r4 = r9.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x0037 }
            r5 = 0
            r2 = 1
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x0037 }
            r0.j(r7)     // Catch:{ RuntimeException -> 0x0037 }
            throw r9     // Catch:{ RuntimeException -> 0x0037 }
        L_0x0037:
            r9 = move-exception
            r8.b(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.v0.c(com.google.android.gms.common.api.internal.b0):void");
    }

    public final void d(s sVar, boolean z10) {
        Map map = sVar.f4330a;
        Boolean valueOf = Boolean.valueOf(z10);
        c cVar = this.f4334b;
        map.put(cVar, valueOf);
        cVar.a(new r(sVar, cVar));
    }
}
