package ua;

import java.util.concurrent.TimeUnit;
import ra.m;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final long f15955d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    public static final long f15956e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final m f15957a = m.a();

    /* renamed from: b  reason: collision with root package name */
    public long f15958b;

    /* renamed from: c  reason: collision with root package name */
    public int f15959c;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void a(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            r2 = 1
            if (r7 < r0) goto L_0x000b
            r0 = 300(0x12c, float:4.2E-43)
            if (r7 < r0) goto L_0x0016
        L_0x000b:
            r0 = 401(0x191, float:5.62E-43)
            if (r7 == r0) goto L_0x0016
            r0 = 404(0x194, float:5.66E-43)
            if (r7 != r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = r1
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 == 0) goto L_0x0022
            monitor-enter(r6)     // Catch:{ all -> 0x0072 }
            r6.f15959c = r1     // Catch:{ all -> 0x001f }
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            monitor-exit(r6)
            return
        L_0x001f:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            throw r7     // Catch:{ all -> 0x0072 }
        L_0x0022:
            int r0 = r6.f15959c     // Catch:{ all -> 0x0072 }
            int r0 = r0 + r2
            r6.f15959c = r0     // Catch:{ all -> 0x0072 }
            monitor-enter(r6)     // Catch:{ all -> 0x0072 }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r7 == r0) goto L_0x0034
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 < r0) goto L_0x0035
            r0 = 600(0x258, float:8.41E-43)
            if (r7 >= r0) goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            if (r1 != 0) goto L_0x003b
            long r0 = f15955d     // Catch:{ all -> 0x006f }
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            goto L_0x005f
        L_0x003b:
            int r7 = r6.f15959c     // Catch:{ all -> 0x006f }
            double r0 = (double) r7     // Catch:{ all -> 0x006f }
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r2, r0)     // Catch:{ all -> 0x006f }
            ra.m r7 = r6.f15957a     // Catch:{ all -> 0x006f }
            r7.getClass()     // Catch:{ all -> 0x006f }
            double r2 = java.lang.Math.random()     // Catch:{ all -> 0x006f }
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            long r2 = (long) r2     // Catch:{ all -> 0x006f }
            double r2 = (double) r2     // Catch:{ all -> 0x006f }
            double r0 = r0 + r2
            long r2 = f15956e     // Catch:{ all -> 0x006f }
            double r2 = (double) r2     // Catch:{ all -> 0x006f }
            double r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x006f }
            long r0 = (long) r0
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
        L_0x005f:
            ra.m r7 = r6.f15957a     // Catch:{ all -> 0x0072 }
            q4.a r7 = r7.f14185a     // Catch:{ all -> 0x0072 }
            r7.getClass()     // Catch:{ all -> 0x0072 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0072 }
            long r2 = r2 + r0
            r6.f15958b = r2     // Catch:{ all -> 0x0072 }
            monitor-exit(r6)
            return
        L_0x006f:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            throw r7     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.e.a(int):void");
    }
}
