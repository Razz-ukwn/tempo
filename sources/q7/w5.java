package q7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import s6.m;
import s6.o;
import u6.b;
import u6.q;

public final class w5 implements ServiceConnection, b.a, b.C0293b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f13406a;

    /* renamed from: b  reason: collision with root package name */
    public volatile o2 f13407b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x5 f13408c;

    public w5(x5 x5Var) {
        this.f13408c = x5Var;
    }

    public final void a(t6.b bVar) {
        q.e("MeasurementServiceConnection.onConnectionFailed");
        s2 s2Var = ((x3) this.f13408c.f13121a).E;
        if (s2Var == null || !s2Var.f13137b) {
            s2Var = null;
        }
        if (s2Var != null) {
            s2Var.E.c(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f13406a = false;
            this.f13407b = null;
        }
        w3 w3Var = ((x3) this.f13408c.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new m(this, 3));
    }

    public final void b(int i8) {
        q.e("MeasurementServiceConnection.onConnectionSuspended");
        x5 x5Var = this.f13408c;
        s2 s2Var = ((x3) x5Var.f13121a).E;
        x3.l(s2Var);
        s2Var.I.b("Service connection suspended");
        w3 w3Var = ((x3) x5Var.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new v5(this));
    }

    public final void c() {
        q.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                q.i(this.f13407b);
                w3 w3Var = ((x3) this.f13408c.f13121a).F;
                x3.l(w3Var);
                w3Var.q(new t4(4, this, (j2) this.f13407b.x()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f13407b = null;
                this.f13406a = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5 = ((q7.x3) r3.f13408c.f13121a).E;
        q7.x3.l(r5);
        r5.B.b("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            u6.q.e(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x0022
            r3.f13406a = r4     // Catch:{ all -> 0x001f }
            q7.x5 r4 = r3.f13408c     // Catch:{ all -> 0x001f }
            q7.k4 r4 = r4.f13121a     // Catch:{ all -> 0x001f }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ all -> 0x001f }
            q7.s2 r4 = r4.E     // Catch:{ all -> 0x001f }
            q7.x3.l(r4)     // Catch:{ all -> 0x001f }
            q7.q2 r4 = r4.B     // Catch:{ all -> 0x001f }
            java.lang.String r5 = "Service connected with null binder"
            r4.b(r5)     // Catch:{ all -> 0x001f }
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r4 = move-exception
            goto L_0x00a7
        L_0x0022:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0068 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0068 }
            if (r2 == 0) goto L_0x0055
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0068 }
            boolean r2 = r1 instanceof q7.j2     // Catch:{ RemoteException -> 0x0068 }
            if (r2 == 0) goto L_0x003c
            q7.j2 r1 = (q7.j2) r1     // Catch:{ RemoteException -> 0x0068 }
            goto L_0x0041
        L_0x003c:
            q7.h2 r1 = new q7.h2     // Catch:{ RemoteException -> 0x0068 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0068 }
        L_0x0041:
            r0 = r1
            q7.x5 r5 = r3.f13408c     // Catch:{ RemoteException -> 0x0068 }
            q7.k4 r5 = r5.f13121a     // Catch:{ RemoteException -> 0x0068 }
            q7.x3 r5 = (q7.x3) r5     // Catch:{ RemoteException -> 0x0068 }
            q7.s2 r5 = r5.E     // Catch:{ RemoteException -> 0x0068 }
            q7.x3.l(r5)     // Catch:{ RemoteException -> 0x0068 }
            q7.q2 r5 = r5.J     // Catch:{ RemoteException -> 0x0068 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.b(r1)     // Catch:{ RemoteException -> 0x0068 }
            goto L_0x007a
        L_0x0055:
            q7.x5 r5 = r3.f13408c     // Catch:{ RemoteException -> 0x0068 }
            q7.k4 r5 = r5.f13121a     // Catch:{ RemoteException -> 0x0068 }
            q7.x3 r5 = (q7.x3) r5     // Catch:{ RemoteException -> 0x0068 }
            q7.s2 r5 = r5.E     // Catch:{ RemoteException -> 0x0068 }
            q7.x3.l(r5)     // Catch:{ RemoteException -> 0x0068 }
            q7.q2 r5 = r5.B     // Catch:{ RemoteException -> 0x0068 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.c(r1, r2)     // Catch:{ RemoteException -> 0x0068 }
            goto L_0x007a
        L_0x0068:
            q7.x5 r5 = r3.f13408c     // Catch:{ all -> 0x001f }
            q7.k4 r5 = r5.f13121a     // Catch:{ all -> 0x001f }
            q7.x3 r5 = (q7.x3) r5     // Catch:{ all -> 0x001f }
            q7.s2 r5 = r5.E     // Catch:{ all -> 0x001f }
            q7.x3.l(r5)     // Catch:{ all -> 0x001f }
            q7.q2 r5 = r5.B     // Catch:{ all -> 0x001f }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.b(r1)     // Catch:{ all -> 0x001f }
        L_0x007a:
            if (r0 != 0) goto L_0x0090
            r3.f13406a = r4     // Catch:{ all -> 0x001f }
            y6.a r4 = y6.a.b()     // Catch:{ IllegalArgumentException -> 0x00a5 }
            q7.x5 r5 = r3.f13408c     // Catch:{ IllegalArgumentException -> 0x00a5 }
            q7.k4 r0 = r5.f13121a     // Catch:{ IllegalArgumentException -> 0x00a5 }
            q7.x3 r0 = (q7.x3) r0     // Catch:{ IllegalArgumentException -> 0x00a5 }
            android.content.Context r0 = r0.f13419a     // Catch:{ IllegalArgumentException -> 0x00a5 }
            q7.w5 r5 = r5.f13432c     // Catch:{ IllegalArgumentException -> 0x00a5 }
            r4.c(r0, r5)     // Catch:{ IllegalArgumentException -> 0x00a5 }
            goto L_0x00a5
        L_0x0090:
            q7.x5 r4 = r3.f13408c     // Catch:{ all -> 0x001f }
            q7.k4 r4 = r4.f13121a     // Catch:{ all -> 0x001f }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ all -> 0x001f }
            q7.w3 r4 = r4.F     // Catch:{ all -> 0x001f }
            q7.x3.l(r4)     // Catch:{ all -> 0x001f }
            s6.n r5 = new s6.n     // Catch:{ all -> 0x001f }
            r1 = 8
            r5.<init>((java.lang.Object) r3, (java.lang.Object) r0, (int) r1)     // Catch:{ all -> 0x001f }
            r4.q(r5)     // Catch:{ all -> 0x001f }
        L_0x00a5:
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            return
        L_0x00a7:
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.w5.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        q.e("MeasurementServiceConnection.onServiceDisconnected");
        x5 x5Var = this.f13408c;
        s2 s2Var = ((x3) x5Var.f13121a).E;
        x3.l(s2Var);
        s2Var.I.b("Service disconnected");
        w3 w3Var = ((x3) x5Var.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new o(4, this, componentName));
    }
}
