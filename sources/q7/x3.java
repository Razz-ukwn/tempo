package q7;

import ag.m;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;
import q2.d;
import u6.q;
import z6.b;

public final class x3 implements k4 {

    /* renamed from: d0  reason: collision with root package name */
    public static volatile x3 f13418d0;
    public final d B;
    public final f C;
    public final g3 D;
    public final s2 E;
    public final w3 F;
    public final i6 G;
    public final a7 H;
    public final n2 I;
    public final m J;
    public final j5 K;
    public final a5 L;
    public final z0 M;
    public final e5 N;
    public final String O;
    public m2 P;
    public x5 Q;
    public n R;
    public k2 S;
    public boolean T = false;
    public Boolean U;
    public long V;
    public volatile Boolean W;
    public final Boolean X;
    public final Boolean Y;
    public volatile boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13419a;

    /* renamed from: a0  reason: collision with root package name */
    public int f13420a0;

    /* renamed from: b  reason: collision with root package name */
    public final String f13421b;

    /* renamed from: b0  reason: collision with root package name */
    public final AtomicInteger f13422b0 = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public final String f13423c;

    /* renamed from: c0  reason: collision with root package name */
    public final long f13424c0;

    /* renamed from: d  reason: collision with root package name */
    public final String f13425d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13426e;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public x3(q7.n4 r11) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.T = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r10.f13422b0 = r1
            android.content.Context r1 = r11.f13220a
            q2.d r2 = new q2.d
            r3 = 12
            r2.<init>(r3, r0)
            r10.B = r2
            ag.m.B = r2
            r10.f13419a = r1
            java.lang.String r2 = r11.f13221b
            r10.f13421b = r2
            java.lang.String r2 = r11.f13222c
            r10.f13423c = r2
            java.lang.String r2 = r11.f13223d
            r10.f13425d = r2
            boolean r2 = r11.f13227h
            r10.f13426e = r2
            java.lang.Boolean r2 = r11.f13224e
            r10.W = r2
            java.lang.String r2 = r11.f13229j
            r10.O = r2
            r2 = 1
            r10.Z = r2
            com.google.android.gms.internal.measurement.a1 r3 = r11.f13226g
            if (r3 == 0) goto L_0x005d
            android.os.Bundle r4 = r3.C
            if (r4 == 0) goto L_0x005d
            java.lang.String r5 = "measurementEnabled"
            java.lang.Object r4 = r4.get(r5)
            boolean r5 = r4 instanceof java.lang.Boolean
            if (r5 == 0) goto L_0x004d
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r10.X = r4
        L_0x004d:
            android.os.Bundle r3 = r3.C
            java.lang.String r4 = "measurementDeactivated"
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x005d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r10.Y = r3
        L_0x005d:
            com.google.android.gms.internal.measurement.i4 r3 = com.google.android.gms.internal.measurement.z4.f5618g
            if (r3 != 0) goto L_0x00c4
            if (r1 != 0) goto L_0x0064
            goto L_0x00c4
        L_0x0064:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.z4.f5617f
            monitor-enter(r3)
            com.google.android.gms.internal.measurement.i4 r4 = com.google.android.gms.internal.measurement.z4.f5618g     // Catch:{ all -> 0x00c1 }
            if (r4 != 0) goto L_0x00bf
            monitor-enter(r3)     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.internal.measurement.i4 r4 = com.google.android.gms.internal.measurement.z4.f5618g     // Catch:{ all -> 0x00bc }
            android.content.Context r5 = r1.getApplicationContext()     // Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r5 = r1
        L_0x0076:
            if (r4 == 0) goto L_0x007c
            android.content.Context r4 = r4.f5322a     // Catch:{ all -> 0x00bc }
            if (r4 == r5) goto L_0x00b7
        L_0x007c:
            com.google.android.gms.internal.measurement.k4.c()     // Catch:{ all -> 0x00bc }
            com.google.android.gms.internal.measurement.a5.a()     // Catch:{ all -> 0x00bc }
            java.lang.Class<com.google.android.gms.internal.measurement.n4> r4 = com.google.android.gms.internal.measurement.n4.class
            monitor-enter(r4)     // Catch:{ all -> 0x00bc }
            com.google.android.gms.internal.measurement.n4 r6 = com.google.android.gms.internal.measurement.n4.f5414c     // Catch:{ all -> 0x00b9 }
            if (r6 == 0) goto L_0x009c
            android.content.Context r7 = r6.f5415a     // Catch:{ all -> 0x00b9 }
            if (r7 == 0) goto L_0x009c
            com.google.android.gms.internal.measurement.e4 r6 = r6.f5416b     // Catch:{ all -> 0x00b9 }
            if (r6 == 0) goto L_0x009c
            android.content.ContentResolver r6 = r7.getContentResolver()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.internal.measurement.n4 r7 = com.google.android.gms.internal.measurement.n4.f5414c     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.internal.measurement.e4 r7 = r7.f5416b     // Catch:{ all -> 0x00b9 }
            r6.unregisterContentObserver(r7)     // Catch:{ all -> 0x00b9 }
        L_0x009c:
            r6 = 0
            com.google.android.gms.internal.measurement.n4.f5414c = r6     // Catch:{ all -> 0x00b9 }
            monitor-exit(r4)     // Catch:{ all -> 0x00bc }
            t.x2 r4 = new t.x2     // Catch:{ all -> 0x00bc }
            r6 = 8
            r4.<init>(r5, r6)     // Catch:{ all -> 0x00bc }
            com.google.android.gms.internal.measurement.g5 r4 = ag.b1.i(r4)     // Catch:{ all -> 0x00bc }
            com.google.android.gms.internal.measurement.i4 r6 = new com.google.android.gms.internal.measurement.i4     // Catch:{ all -> 0x00bc }
            r6.<init>(r5, r4)     // Catch:{ all -> 0x00bc }
            com.google.android.gms.internal.measurement.z4.f5618g = r6     // Catch:{ all -> 0x00bc }
            java.util.concurrent.atomic.AtomicInteger r4 = com.google.android.gms.internal.measurement.z4.f5619h     // Catch:{ all -> 0x00bc }
            r4.incrementAndGet()     // Catch:{ all -> 0x00bc }
        L_0x00b7:
            monitor-exit(r3)     // Catch:{ all -> 0x00bc }
            goto L_0x00bf
        L_0x00b9:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00bc }
            throw r11     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00bc }
            throw r11     // Catch:{ all -> 0x00c1 }
        L_0x00bf:
            monitor-exit(r3)     // Catch:{ all -> 0x00c1 }
            goto L_0x00c4
        L_0x00c1:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c1 }
            throw r11
        L_0x00c4:
            ag.m r3 = ag.m.D
            r10.J = r3
            java.lang.Long r3 = r11.f13228i
            if (r3 == 0) goto L_0x00d1
            long r3 = r3.longValue()
            goto L_0x00d5
        L_0x00d1:
            long r3 = java.lang.System.currentTimeMillis()
        L_0x00d5:
            r10.f13424c0 = r3
            q7.f r3 = new q7.f
            r3.<init>(r10)
            r10.C = r3
            q7.g3 r3 = new q7.g3
            r3.<init>(r10)
            r3.l()
            r10.D = r3
            q7.s2 r3 = new q7.s2
            r3.<init>(r10)
            r3.l()
            r10.E = r3
            q7.a7 r4 = new q7.a7
            r4.<init>(r10)
            r4.l()
            r10.H = r4
            r3.s r4 = new r3.s
            r4.<init>((q7.x3) r10)
            q7.n2 r5 = new q7.n2
            r5.<init>(r4)
            r10.I = r5
            q7.z0 r4 = new q7.z0
            r4.<init>(r10)
            r10.M = r4
            q7.j5 r4 = new q7.j5
            r4.<init>(r10)
            r4.k()
            r10.K = r4
            q7.a5 r4 = new q7.a5
            r4.<init>(r10)
            r4.k()
            r10.L = r4
            q7.i6 r5 = new q7.i6
            r5.<init>(r10)
            r5.k()
            r10.G = r5
            q7.e5 r5 = new q7.e5
            r5.<init>(r10)
            r5.l()
            r10.N = r5
            q7.w3 r5 = new q7.w3
            r5.<init>(r10)
            r5.l()
            r10.F = r5
            com.google.android.gms.internal.measurement.a1 r6 = r11.f13226g
            if (r6 == 0) goto L_0x014e
            long r6 = r6.f5142b
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r0 = r2
        L_0x014f:
            android.content.Context r1 = r1.getApplicationContext()
            boolean r1 = r1 instanceof android.app.Application
            if (r1 == 0) goto L_0x019c
            k(r4)
            q7.k4 r1 = r4.f13121a
            q7.x3 r1 = (q7.x3) r1
            android.content.Context r1 = r1.f13419a
            android.content.Context r1 = r1.getApplicationContext()
            boolean r1 = r1 instanceof android.app.Application
            if (r1 == 0) goto L_0x01a6
            q7.k4 r1 = r4.f13121a
            q7.x3 r1 = (q7.x3) r1
            android.content.Context r1 = r1.f13419a
            android.content.Context r1 = r1.getApplicationContext()
            android.app.Application r1 = (android.app.Application) r1
            q7.z4 r2 = r4.f12898c
            if (r2 != 0) goto L_0x017f
            q7.z4 r2 = new q7.z4
            r2.<init>(r4)
            r4.f12898c = r2
        L_0x017f:
            if (r0 == 0) goto L_0x01a6
            q7.z4 r0 = r4.f12898c
            r1.unregisterActivityLifecycleCallbacks(r0)
            q7.z4 r0 = r4.f12898c
            r1.registerActivityLifecycleCallbacks(r0)
            q7.k4 r0 = r4.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            l(r0)
            q7.q2 r0 = r0.J
            java.lang.String r1 = "Registered activity lifecycle callback"
            r0.b(r1)
            goto L_0x01a6
        L_0x019c:
            l(r3)
            q7.q2 r0 = r3.E
            java.lang.String r1 = "Application context is not an Application"
            r0.b(r1)
        L_0x01a6:
            s6.n r0 = new s6.n
            r1 = 3
            r0.<init>((java.lang.Object) r10, (java.lang.Object) r11, (int) r1)
            r5.q(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.x3.<init>(q7.n4):void");
    }

    public static final void j(j4 j4Var) {
        if (j4Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void k(x2 x2Var) {
        if (x2Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!x2Var.f13417b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(x2Var.getClass())));
        }
    }

    public static final void l(j4 j4Var) {
        if (j4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!j4Var.f13137b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(j4Var.getClass())));
        }
    }

    public static x3 t(Context context, a1 a1Var, Long l10) {
        Bundle bundle;
        if (a1Var != null && (a1Var.f5145e == null || a1Var.B == null)) {
            a1Var = new a1(a1Var.f5141a, a1Var.f5142b, a1Var.f5143c, a1Var.f5144d, (String) null, (String) null, a1Var.C, (String) null);
        }
        q.i(context);
        q.i(context.getApplicationContext());
        if (f13418d0 == null) {
            synchronized (x3.class) {
                if (f13418d0 == null) {
                    f13418d0 = new x3(new n4(context, a1Var, l10));
                }
            }
        } else if (!(a1Var == null || (bundle = a1Var.C) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            q.i(f13418d0);
            f13418d0.W = Boolean.valueOf(a1Var.C.getBoolean("dataCollectionDefaultEnabled"));
        }
        q.i(f13418d0);
        return f13418d0;
    }

    @Pure
    public final b a() {
        return this.J;
    }

    public final void b() {
        this.f13422b0.incrementAndGet();
    }

    @Pure
    public final d c() {
        return this.B;
    }

    @Pure
    public final Context d() {
        return this.f13419a;
    }

    @Pure
    public final s2 e() {
        s2 s2Var = this.E;
        l(s2Var);
        return s2Var;
    }

    public final void f() {
        this.f13420a0++;
    }

    public final boolean g() {
        return m() == 0;
    }

    @Pure
    public final w3 h() {
        w3 w3Var = this.F;
        l(w3Var);
        return w3Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        if (r1 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
        if (android.text.TextUtils.isEmpty(r0.I) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.V) > 1000) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i() {
        /*
            r7 = this;
            boolean r0 = r7.T
            if (r0 == 0) goto L_0x00ce
            q7.w3 r0 = r7.F
            l(r0)
            r0.i()
            java.lang.Boolean r0 = r7.U
            ag.m r1 = r7.J
            if (r0 == 0) goto L_0x0034
            long r2 = r7.V
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0034
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c7
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r7.V
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c7
        L_0x0034:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.V = r0
            q7.a7 r0 = r7.H
            j(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.R(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.R(r1)
            if (r1 == 0) goto L_0x008d
            android.content.Context r1 = r7.f13419a
            b7.b r4 = b7.c.a(r1)
            boolean r4 = r4.c()
            if (r4 != 0) goto L_0x008b
            q7.f r4 = r7.C
            boolean r4 = r4.v()
            if (r4 != 0) goto L_0x008b
            boolean r4 = q7.a7.Y(r1)
            if (r4 == 0) goto L_0x008d
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementJobService"
            android.content.pm.PackageManager r5 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0088 }
            if (r5 != 0) goto L_0x0077
            goto L_0x0088
        L_0x0077:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0088 }
            r6.<init>(r1, r4)     // Catch:{ NameNotFoundException -> 0x0088 }
            android.content.pm.ServiceInfo r1 = r5.getServiceInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x0088 }
            if (r1 == 0) goto L_0x0088
            boolean r1 = r1.enabled     // Catch:{ NameNotFoundException -> 0x0088 }
            if (r1 == 0) goto L_0x0088
            r1 = r3
            goto L_0x0089
        L_0x0088:
            r1 = r2
        L_0x0089:
            if (r1 == 0) goto L_0x008d
        L_0x008b:
            r1 = r3
            goto L_0x008e
        L_0x008d:
            r1 = r2
        L_0x008e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.U = r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00c7
            q7.k2 r1 = r7.q()
            java.lang.String r1 = r1.o()
            q7.k2 r4 = r7.q()
            r4.j()
            java.lang.String r4 = r4.I
            boolean r0 = r0.J(r1, r4)
            if (r0 != 0) goto L_0x00c0
            q7.k2 r0 = r7.q()
            r0.j()
            java.lang.String r0 = r0.I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c1
        L_0x00c0:
            r2 = r3
        L_0x00c1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r7.U = r0
        L_0x00c7:
            java.lang.Boolean r0 = r7.U
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.x3.i():boolean");
    }

    public final int m() {
        w3 w3Var = this.F;
        l(w3Var);
        w3Var.i();
        if (this.C.t()) {
            return 1;
        }
        Boolean bool = this.Y;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        w3 w3Var2 = this.F;
        l(w3Var2);
        w3Var2.i();
        if (!this.Z) {
            return 8;
        }
        g3 g3Var = this.D;
        j(g3Var);
        Boolean p10 = g3Var.p();
        if (p10 != null) {
            return p10.booleanValue() ? 0 : 3;
        }
        f fVar = this.C;
        d dVar = ((x3) fVar.f13121a).B;
        Boolean q10 = fVar.q("firebase_analytics_collection_enabled");
        if (q10 != null) {
            return q10.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.X;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.W == null || this.W.booleanValue()) ? 0 : 7;
    }

    @Pure
    public final z0 n() {
        z0 z0Var = this.M;
        if (z0Var != null) {
            return z0Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final f o() {
        return this.C;
    }

    @Pure
    public final n p() {
        l(this.R);
        return this.R;
    }

    @Pure
    public final k2 q() {
        k(this.S);
        return this.S;
    }

    @Pure
    public final m2 r() {
        k(this.P);
        return this.P;
    }

    @Pure
    public final n2 s() {
        return this.I;
    }

    @Pure
    public final x5 u() {
        k(this.Q);
        return this.Q;
    }
}
