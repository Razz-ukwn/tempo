package q7;

import android.os.Parcelable;
import com.google.android.gms.internal.measurement.u0;

public final /* synthetic */ class y3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13439b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13440c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f13441d;

    public /* synthetic */ y3(h4 h4Var, Object obj, Parcelable parcelable, int i8) {
        this.f13438a = i8;
        this.f13439b = h4Var;
        this.f13440c = obj;
        this.f13441d = parcelable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.gms.internal.measurement.o0} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.f13438a
            r1 = 0
            java.lang.Object r2 = r14.f13441d
            java.lang.Object r3 = r14.f13440c
            java.lang.Object r4 = r14.f13439b
            switch(r0) {
                case 0: goto L_0x0154;
                case 1: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0292
        L_0x000e:
            q7.h4 r4 = (q7.h4) r4
            q7.s r3 = (q7.s) r3
            r4.getClass()
            java.lang.String r0 = r3.f13311a
            java.lang.String r5 = "_cmp"
            boolean r0 = r5.equals(r0)
            q7.t6 r5 = r4.f13101a
            if (r0 == 0) goto L_0x0062
            q7.q r0 = r3.f13312b
            if (r0 == 0) goto L_0x0062
            android.os.Bundle r0 = r0.f13275a
            int r6 = r0.size()
            if (r6 != 0) goto L_0x002e
            goto L_0x0062
        L_0x002e:
            java.lang.String r6 = "_cis"
            java.lang.String r0 = r0.getString(r6)
            java.lang.String r6 = "referrer broadcast"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0044
            java.lang.String r6 = "referrer API"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0062
        L_0x0044:
            q7.s2 r0 = r5.e()
            java.lang.String r6 = r3.toString()
            java.lang.String r7 = "Event has been filtered "
            q7.q2 r0 = r0.H
            r0.c(r6, r7)
            q7.s r0 = new q7.s
            q7.q r10 = r3.f13312b
            java.lang.String r11 = r3.f13313c
            long r12 = r3.f13314d
            java.lang.String r9 = "_cmpx"
            r8 = r0
            r8.<init>(r9, r10, r11, r12)
            r3 = r0
        L_0x0062:
            java.lang.String r0 = r3.f13311a
            q7.c7 r2 = (q7.c7) r2
            q7.r3 r6 = r5.f13347a
            q7.v6 r7 = r5.C
            q7.t6.H(r6)
            java.lang.String r8 = r2.f12948a
            boolean r6 = r6.t(r8)
            if (r6 != 0) goto L_0x007a
            r4.b(r3, r2)
            goto L_0x0153
        L_0x007a:
            q7.s2 r6 = r5.e()
            q7.q2 r6 = r6.J
            java.lang.String r8 = r2.f12948a
            java.lang.String r9 = "EES config found for"
            r6.c(r8, r9)
            q7.r3 r6 = r5.f13347a
            q7.t6.H(r6)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 == 0) goto L_0x0093
            goto L_0x009b
        L_0x0093:
            q7.q3 r1 = r6.F
            java.lang.Object r1 = r1.c(r8)
            com.google.android.gms.internal.measurement.o0 r1 = (com.google.android.gms.internal.measurement.o0) r1
        L_0x009b:
            if (r1 == 0) goto L_0x0145
            b3.w r6 = r1.f5437c     // Catch:{ i1 -> 0x0129 }
            q7.t6.H(r7)     // Catch:{ i1 -> 0x0129 }
            q7.q r8 = r3.f13312b     // Catch:{ i1 -> 0x0129 }
            android.os.Bundle r8 = r8.w()     // Catch:{ i1 -> 0x0129 }
            r9 = 1
            java.util.HashMap r8 = q7.v6.F(r8, r9)     // Catch:{ i1 -> 0x0129 }
            java.lang.String[] r10 = cb.e.f3894a0     // Catch:{ i1 -> 0x0129 }
            java.lang.String[] r11 = cb.e.Y     // Catch:{ i1 -> 0x0129 }
            java.lang.String r10 = b1.b.p(r0, r10, r11)     // Catch:{ i1 -> 0x0129 }
            if (r10 != 0) goto L_0x00b8
            r10 = r0
        L_0x00b8:
            com.google.android.gms.internal.measurement.b r11 = new com.google.android.gms.internal.measurement.b     // Catch:{ i1 -> 0x0129 }
            long r12 = r3.f13314d     // Catch:{ i1 -> 0x0129 }
            r11.<init>(r10, r12, r8)     // Catch:{ i1 -> 0x0129 }
            boolean r1 = r1.b(r11)     // Catch:{ i1 -> 0x0129 }
            if (r1 != 0) goto L_0x00c6
            goto L_0x0136
        L_0x00c6:
            java.lang.Object r1 = r6.f3198c
            com.google.android.gms.internal.measurement.b r1 = (com.google.android.gms.internal.measurement.b) r1
            java.lang.Object r8 = r6.f3197b
            com.google.android.gms.internal.measurement.b r8 = (com.google.android.gms.internal.measurement.b) r8
            boolean r1 = r1.equals(r8)
            r1 = r1 ^ r9
            if (r1 == 0) goto L_0x00ef
            q7.s2 r1 = r5.e()
            java.lang.String r3 = "EES edited event"
            q7.q2 r1 = r1.J
            r1.c(r0, r3)
            q7.t6.H(r7)
            java.lang.Object r0 = r6.f3198c
            com.google.android.gms.internal.measurement.b r0 = (com.google.android.gms.internal.measurement.b) r0
            q7.s r0 = q7.v6.z(r0)
            r4.b(r0, r2)
            goto L_0x00f2
        L_0x00ef:
            r4.b(r3, r2)
        L_0x00f2:
            java.lang.Object r0 = r6.f3199d
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r9
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r6.f3199d
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0105:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0153
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.b r1 = (com.google.android.gms.internal.measurement.b) r1
            q7.s2 r3 = r5.e()
            java.lang.String r6 = r1.f5160a
            java.lang.String r8 = "EES logging created event"
            q7.q2 r3 = r3.J
            r3.c(r6, r8)
            q7.t6.H(r7)
            q7.s r1 = q7.v6.z(r1)
            r4.b(r1, r2)
            goto L_0x0105
        L_0x0129:
            q7.s2 r1 = r5.e()
            java.lang.String r6 = "EES error. appId, eventName"
            q7.q2 r1 = r1.B
            java.lang.String r7 = r2.f12949b
            r1.d(r7, r0, r6)
        L_0x0136:
            q7.s2 r1 = r5.e()
            java.lang.String r5 = "EES was not applied to event"
            q7.q2 r1 = r1.J
            r1.c(r0, r5)
            r4.b(r3, r2)
            goto L_0x0153
        L_0x0145:
            q7.s2 r0 = r5.e()
            java.lang.String r1 = "EES not loaded for"
            q7.q2 r0 = r0.J
            r0.c(r8, r1)
            r4.b(r3, r2)
        L_0x0153:
            return
        L_0x0154:
            q7.h4 r4 = (q7.h4) r4
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r2 = (android.os.Bundle) r2
            q7.t6 r0 = r4.f13101a
            q7.k r0 = r0.f13350c
            q7.t6.H(r0)
            r0.i()
            r0.j()
            q7.k4 r4 = r0.f13121a
            r5 = r4
            q7.x3 r5 = (q7.x3) r5
            u6.q.f(r3)
            java.lang.String r6 = "dep"
            u6.q.f(r6)
            java.lang.String r6 = ""
            android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x01e0
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x01e0
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>(r2)
            java.util.Set r2 = r6.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x018e:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01da
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x01ac
            q7.s2 r7 = r5.E
            q7.x3.l(r7)
            java.lang.String r8 = "Param name can't be null"
            q7.q2 r7 = r7.B
            r7.b(r8)
            r2.remove()
            goto L_0x018e
        L_0x01ac:
            q7.a7 r8 = r5.H
            q7.x3.j(r8)
            java.lang.Object r9 = r6.get(r7)
            java.lang.Object r8 = r8.m(r9, r7)
            if (r8 != 0) goto L_0x01d1
            q7.s2 r8 = r5.E
            q7.x3.l(r8)
            q7.n2 r9 = r5.I
            java.lang.String r7 = r9.e(r7)
            java.lang.String r9 = "Param value can't be null"
            q7.q2 r8 = r8.E
            r8.c(r7, r9)
            r2.remove()
            goto L_0x018e
        L_0x01d1:
            q7.a7 r9 = r5.H
            q7.x3.j(r9)
            r9.A(r6, r7, r8)
            goto L_0x018e
        L_0x01da:
            q7.q r2 = new q7.q
            r2.<init>(r6)
            goto L_0x01ea
        L_0x01e0:
            q7.q r2 = new q7.q
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r2.<init>(r6)
        L_0x01ea:
            q7.t6 r6 = r0.f13208b
            q7.v6 r6 = r6.C
            q7.t6.H(r6)
            com.google.android.gms.internal.measurement.e3 r7 = com.google.android.gms.internal.measurement.f3.x()
            r7.l()
            com.google.android.gms.internal.measurement.g7 r8 = r7.f5179b
            com.google.android.gms.internal.measurement.f3 r8 = (com.google.android.gms.internal.measurement.f3) r8
            r9 = 0
            com.google.android.gms.internal.measurement.f3.J(r9, r8)
            android.os.Bundle r2 = r2.f13275a
            java.util.Set r8 = r2.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x020b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x022c
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.gms.internal.measurement.i3 r10 = com.google.android.gms.internal.measurement.j3.x()
            r10.n(r9)
            java.lang.Object r9 = r2.get(r9)
            u6.q.i(r9)
            r6.G(r10, r9)
            r7.o(r10)
            goto L_0x020b
        L_0x022c:
            com.google.android.gms.internal.measurement.g7 r2 = r7.j()
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.f3) r2
            byte[] r2 = r2.e()
            q7.s2 r6 = r5.E
            q7.x3.l(r6)
            q7.n2 r7 = r5.I
            java.lang.String r7 = r7.d(r3)
            int r8 = r2.length
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Saving default event parameters, appId, data size"
            q7.q2 r6 = r6.J
            r6.d(r7, r8, r9)
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r3)
            java.lang.String r7 = "parameters"
            r6.put(r7, r2)
            android.database.sqlite.SQLiteDatabase r0 = r0.B()     // Catch:{ SQLiteException -> 0x0280 }
            java.lang.String r2 = "default_event_params"
            r7 = 5
            long r0 = r0.insertWithOnConflict(r2, r1, r6, r7)     // Catch:{ SQLiteException -> 0x0280 }
            r6 = -1
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0291
            q7.x3 r4 = (q7.x3) r4     // Catch:{ SQLiteException -> 0x0280 }
            q7.s2 r0 = r4.E     // Catch:{ SQLiteException -> 0x0280 }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x0280 }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteException -> 0x0280 }
            java.lang.String r1 = "Failed to insert default event parameters (got -1). appId"
            q7.r2 r2 = q7.s2.r(r3)     // Catch:{ SQLiteException -> 0x0280 }
            r0.c(r2, r1)     // Catch:{ SQLiteException -> 0x0280 }
            goto L_0x0291
        L_0x0280:
            r0 = move-exception
            q7.s2 r1 = r5.E
            q7.x3.l(r1)
            q7.r2 r2 = q7.s2.r(r3)
            java.lang.String r3 = "Error storing default event parameters. appId"
            q7.q2 r1 = r1.B
            r1.d(r2, r0, r3)
        L_0x0291:
            return
        L_0x0292:
            java.lang.String r0 = "Failed to get app instance id"
            r5 = r2
            q7.x5 r5 = (q7.x5) r5     // Catch:{ RemoteException -> 0x02ec }
            q7.k4 r5 = r5.f13121a     // Catch:{ RemoteException -> 0x02ec }
            q7.x3 r5 = (q7.x3) r5     // Catch:{ RemoteException -> 0x02ec }
            q7.g3 r5 = r5.D     // Catch:{ RemoteException -> 0x02ec }
            q7.x3.j(r5)     // Catch:{ RemoteException -> 0x02ec }
            q7.h r5 = r5.o()     // Catch:{ RemoteException -> 0x02ec }
            q7.g r6 = q7.g.f13016c     // Catch:{ RemoteException -> 0x02ec }
            boolean r5 = r5.f(r6)     // Catch:{ RemoteException -> 0x02ec }
            if (r5 != 0) goto L_0x02ee
            r4 = r2
            q7.x5 r4 = (q7.x5) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.k4 r4 = r4.f13121a     // Catch:{ RemoteException -> 0x02ec }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.s2 r4 = r4.E     // Catch:{ RemoteException -> 0x02ec }
            q7.x3.l(r4)     // Catch:{ RemoteException -> 0x02ec }
            q7.q2 r4 = r4.G     // Catch:{ RemoteException -> 0x02ec }
            java.lang.String r5 = "Analytics storage consent denied; will not get app instance id"
            r4.b(r5)     // Catch:{ RemoteException -> 0x02ec }
            r4 = r2
            q7.x5 r4 = (q7.x5) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.k4 r4 = r4.f13121a     // Catch:{ RemoteException -> 0x02ec }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.a5 r4 = r4.L     // Catch:{ RemoteException -> 0x02ec }
            q7.x3.k(r4)     // Catch:{ RemoteException -> 0x02ec }
            java.util.concurrent.atomic.AtomicReference r4 = r4.C     // Catch:{ RemoteException -> 0x02ec }
            r4.set(r1)     // Catch:{ RemoteException -> 0x02ec }
            r4 = r2
            q7.x5 r4 = (q7.x5) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.k4 r4 = r4.f13121a     // Catch:{ RemoteException -> 0x02ec }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.g3 r4 = r4.D     // Catch:{ RemoteException -> 0x02ec }
            q7.x3.j(r4)     // Catch:{ RemoteException -> 0x02ec }
            q7.f3 r4 = r4.B     // Catch:{ RemoteException -> 0x02ec }
            r4.b(r1)     // Catch:{ RemoteException -> 0x02ec }
            q7.x5 r2 = (q7.x5) r2
            q7.k4 r0 = r2.f13121a
            q7.x3 r0 = (q7.x3) r0
            goto L_0x035e
        L_0x02e9:
            r0 = move-exception
            goto L_0x0369
        L_0x02ec:
            r4 = move-exception
            goto L_0x0347
        L_0x02ee:
            r5 = r2
            q7.x5 r5 = (q7.x5) r5     // Catch:{ RemoteException -> 0x02ec }
            q7.j2 r6 = r5.f13433d     // Catch:{ RemoteException -> 0x02ec }
            if (r6 != 0) goto L_0x030a
            q7.k4 r4 = r5.f13121a     // Catch:{ RemoteException -> 0x02ec }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.s2 r4 = r4.E     // Catch:{ RemoteException -> 0x02ec }
            q7.x3.l(r4)     // Catch:{ RemoteException -> 0x02ec }
            q7.q2 r4 = r4.B     // Catch:{ RemoteException -> 0x02ec }
            r4.b(r0)     // Catch:{ RemoteException -> 0x02ec }
            q7.x5 r2 = (q7.x5) r2
            q7.k4 r0 = r2.f13121a
            q7.x3 r0 = (q7.x3) r0
            goto L_0x035e
        L_0x030a:
            r5 = r4
            q7.c7 r5 = (q7.c7) r5     // Catch:{ RemoteException -> 0x02ec }
            u6.q.i(r5)     // Catch:{ RemoteException -> 0x02ec }
            q7.c7 r4 = (q7.c7) r4     // Catch:{ RemoteException -> 0x02ec }
            java.lang.String r1 = r6.G(r4)     // Catch:{ RemoteException -> 0x02ec }
            if (r1 == 0) goto L_0x033a
            r4 = r2
            q7.x5 r4 = (q7.x5) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.k4 r4 = r4.f13121a     // Catch:{ RemoteException -> 0x02ec }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.a5 r4 = r4.L     // Catch:{ RemoteException -> 0x02ec }
            q7.x3.k(r4)     // Catch:{ RemoteException -> 0x02ec }
            java.util.concurrent.atomic.AtomicReference r4 = r4.C     // Catch:{ RemoteException -> 0x02ec }
            r4.set(r1)     // Catch:{ RemoteException -> 0x02ec }
            r4 = r2
            q7.x5 r4 = (q7.x5) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.k4 r4 = r4.f13121a     // Catch:{ RemoteException -> 0x02ec }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ RemoteException -> 0x02ec }
            q7.g3 r4 = r4.D     // Catch:{ RemoteException -> 0x02ec }
            q7.x3.j(r4)     // Catch:{ RemoteException -> 0x02ec }
            q7.f3 r4 = r4.B     // Catch:{ RemoteException -> 0x02ec }
            r4.b(r1)     // Catch:{ RemoteException -> 0x02ec }
        L_0x033a:
            r4 = r2
            q7.x5 r4 = (q7.x5) r4     // Catch:{ RemoteException -> 0x02ec }
            r4.t()     // Catch:{ RemoteException -> 0x02ec }
            q7.x5 r2 = (q7.x5) r2
            q7.k4 r0 = r2.f13121a
            q7.x3 r0 = (q7.x3) r0
            goto L_0x035e
        L_0x0347:
            r5 = r2
            q7.x5 r5 = (q7.x5) r5     // Catch:{ all -> 0x02e9 }
            q7.k4 r5 = r5.f13121a     // Catch:{ all -> 0x02e9 }
            q7.x3 r5 = (q7.x3) r5     // Catch:{ all -> 0x02e9 }
            q7.s2 r5 = r5.E     // Catch:{ all -> 0x02e9 }
            q7.x3.l(r5)     // Catch:{ all -> 0x02e9 }
            q7.q2 r5 = r5.B     // Catch:{ all -> 0x02e9 }
            r5.c(r4, r0)     // Catch:{ all -> 0x02e9 }
            q7.x5 r2 = (q7.x5) r2
            q7.k4 r0 = r2.f13121a
            q7.x3 r0 = (q7.x3) r0
        L_0x035e:
            q7.a7 r0 = r0.H
            q7.x3.j(r0)
            com.google.android.gms.internal.measurement.u0 r3 = (com.google.android.gms.internal.measurement.u0) r3
            r0.H(r1, r3)
            return
        L_0x0369:
            q7.x5 r2 = (q7.x5) r2
            q7.k4 r2 = r2.f13121a
            q7.x3 r2 = (q7.x3) r2
            q7.a7 r2 = r2.H
            q7.x3.j(r2)
            com.google.android.gms.internal.measurement.u0 r3 = (com.google.android.gms.internal.measurement.u0) r3
            r2.H(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.y3.run():void");
    }

    public y3(x5 x5Var, c7 c7Var, u0 u0Var) {
        this.f13438a = 2;
        this.f13441d = x5Var;
        this.f13439b = c7Var;
        this.f13440c = u0Var;
    }
}
