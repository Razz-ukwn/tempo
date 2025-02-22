package p7;

import com.google.android.gms.internal.measurement.y1;
import q7.m4;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final y1 f12474a;

    /* renamed from: p7.a$a  reason: collision with other inner class name */
    public interface C0244a extends m4 {
    }

    public a(y1 y1Var) {
        this.f12474a = y1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r0.f5600h == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.f5600h.registerOnMeasurementEventListener(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        android.util.Log.w(r0.f5593a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(p7.a.C0244a r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.y1 r0 = r5.f12474a
            r0.getClass()
            java.util.ArrayList r1 = r0.f5597e
            monitor-enter(r1)
            r2 = 0
        L_0x0009:
            java.util.ArrayList r3 = r0.f5597e     // Catch:{ all -> 0x0058 }
            int r3 = r3.size()     // Catch:{ all -> 0x0058 }
            if (r2 >= r3) goto L_0x002d
            java.util.ArrayList r3 = r0.f5597e     // Catch:{ all -> 0x0058 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0058 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0058 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0058 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x002a
            java.lang.String r6 = r0.f5593a     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "OnEventListener already registered."
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x0058 }
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0057
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x002d:
            com.google.android.gms.internal.measurement.t1 r2 = new com.google.android.gms.internal.measurement.t1     // Catch:{ all -> 0x0058 }
            r2.<init>(r6)     // Catch:{ all -> 0x0058 }
            java.util.ArrayList r3 = r0.f5597e     // Catch:{ all -> 0x0058 }
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0058 }
            r4.<init>(r6, r2)     // Catch:{ all -> 0x0058 }
            r3.add(r4)     // Catch:{ all -> 0x0058 }
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            com.google.android.gms.internal.measurement.r0 r6 = r0.f5600h
            if (r6 == 0) goto L_0x004e
            com.google.android.gms.internal.measurement.r0 r6 = r0.f5600h     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            r6.registerOnMeasurementEventListener(r2)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            goto L_0x0057
        L_0x0047:
            java.lang.String r6 = r0.f5593a
            java.lang.String r1 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r6, r1)
        L_0x004e:
            com.google.android.gms.internal.measurement.j1 r6 = new com.google.android.gms.internal.measurement.j1
            r1 = 1
            r6.<init>(r0, r2, r1)
            r0.b(r6)
        L_0x0057:
            return
        L_0x0058:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a.a(p7.a$a):void");
    }
}
