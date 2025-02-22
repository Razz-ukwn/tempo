package ra;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f14161a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f14162b;

    public /* synthetic */ c(e eVar, boolean z10) {
        this.f14161a = eVar;
        this.f14162b = z10;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r9 = this;
            ra.e r0 = r9.f14161a
            boolean r1 = r9.f14162b
            r0.getClass()
            java.lang.Object r2 = ra.e.m
            monitor-enter(r2)
            m9.f r3 = r0.f14165a     // Catch:{ all -> 0x00f0 }
            r3.a()     // Catch:{ all -> 0x00f0 }
            android.content.Context r3 = r3.f11331a     // Catch:{ all -> 0x00f0 }
            f3.v r3 = f3.v.b(r3)     // Catch:{ all -> 0x00f0 }
            ta.c r4 = r0.f14167c     // Catch:{ all -> 0x00e9 }
            ta.a r4 = r4.c()     // Catch:{ all -> 0x00e9 }
            if (r3 == 0) goto L_0x0020
            r3.c()     // Catch:{ all -> 0x00f0 }
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x00f0 }
            int r3 = r4.f()     // Catch:{ g -> 0x0047 }
            r5 = 5
            r6 = 1
            r7 = 0
            if (r3 != r5) goto L_0x002c
            r3 = r6
            goto L_0x002d
        L_0x002c:
            r3 = r7
        L_0x002d:
            if (r3 != 0) goto L_0x004f
            int r3 = r4.f()     // Catch:{ g -> 0x0047 }
            r8 = 3
            if (r3 != r8) goto L_0x0038
            r3 = r6
            goto L_0x0039
        L_0x0038:
            r3 = r7
        L_0x0039:
            if (r3 == 0) goto L_0x003c
            goto L_0x004f
        L_0x003c:
            if (r1 != 0) goto L_0x004a
            ra.m r1 = r0.f14168d     // Catch:{ g -> 0x0047 }
            boolean r1 = r1.b(r4)     // Catch:{ g -> 0x0047 }
            if (r1 == 0) goto L_0x00e8
            goto L_0x004a
        L_0x0047:
            r1 = move-exception
            goto L_0x00e5
        L_0x004a:
            ta.a r1 = r0.c(r4)     // Catch:{ g -> 0x0047 }
            goto L_0x0053
        L_0x004f:
            ta.a r1 = r0.f(r4)     // Catch:{ g -> 0x0047 }
        L_0x0053:
            monitor-enter(r2)
            m9.f r3 = r0.f14165a     // Catch:{ all -> 0x00e2 }
            r3.a()     // Catch:{ all -> 0x00e2 }
            android.content.Context r3 = r3.f11331a     // Catch:{ all -> 0x00e2 }
            f3.v r3 = f3.v.b(r3)     // Catch:{ all -> 0x00e2 }
            ta.c r8 = r0.f14167c     // Catch:{ all -> 0x00db }
            r8.b(r1)     // Catch:{ all -> 0x00db }
            if (r3 == 0) goto L_0x0069
            r3.c()     // Catch:{ all -> 0x00e2 }
        L_0x0069:
            monitor-exit(r2)     // Catch:{ all -> 0x00e2 }
            monitor-enter(r0)
            java.util.HashSet r2 = r0.f14175k     // Catch:{ all -> 0x00d8 }
            int r2 = r2.size()     // Catch:{ all -> 0x00d8 }
            if (r2 == 0) goto L_0x0093
            java.lang.String r2 = r4.f15506b     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = r1.f15506b     // Catch:{ all -> 0x00d8 }
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ all -> 0x00d8 }
            if (r2 != 0) goto L_0x0093
            java.util.HashSet r2 = r0.f14175k     // Catch:{ all -> 0x00d8 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d8 }
        L_0x0083:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00d8 }
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00d8 }
            sa.a r3 = (sa.a) r3     // Catch:{ all -> 0x00d8 }
            r3.a()     // Catch:{ all -> 0x00d8 }
            goto L_0x0083
        L_0x0093:
            monitor-exit(r0)
            int r2 = r1.f()
            r3 = 4
            if (r2 != r3) goto L_0x009d
            r2 = r6
            goto L_0x009e
        L_0x009d:
            r2 = r7
        L_0x009e:
            if (r2 == 0) goto L_0x00aa
            java.lang.String r2 = r1.f15506b
            monitor-enter(r0)
            r0.f14174j = r2     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)
            goto L_0x00aa
        L_0x00a7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00aa:
            int r2 = r1.f()
            if (r2 != r5) goto L_0x00b2
            r2 = r6
            goto L_0x00b3
        L_0x00b2:
            r2 = r7
        L_0x00b3:
            if (r2 == 0) goto L_0x00be
            ra.g r1 = new ra.g
            r1.<init>()
            r0.g(r1)
            goto L_0x00e8
        L_0x00be:
            int r2 = r1.f15507c
            r3 = 2
            if (r2 == r3) goto L_0x00c7
            if (r2 != r6) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r6 = r7
        L_0x00c7:
            if (r6 == 0) goto L_0x00d4
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.g(r1)
            goto L_0x00e8
        L_0x00d4:
            r0.h(r1)
            goto L_0x00e8
        L_0x00d8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00db:
            r0 = move-exception
            if (r3 == 0) goto L_0x00e1
            r3.c()     // Catch:{ all -> 0x00e2 }
        L_0x00e1:
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e2 }
            throw r0
        L_0x00e5:
            r0.g(r1)
        L_0x00e8:
            return
        L_0x00e9:
            r0 = move-exception
            if (r3 == 0) goto L_0x00ef
            r3.c()     // Catch:{ all -> 0x00f0 }
        L_0x00ef:
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00f0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.c.run():void");
    }
}
