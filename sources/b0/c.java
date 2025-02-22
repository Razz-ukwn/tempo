package b0;

import ff.m;
import rf.l;
import sf.j;

public final class c extends b {

    /* renamed from: l  reason: collision with root package name */
    public final b f2897l;
    public boolean m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(int i8, k kVar, l<Object, m> lVar, l<Object, m> lVar2, b bVar) {
        super(i8, kVar, lVar, lVar2);
        j.f(kVar, "invalid");
        j.f(bVar, "parent");
        this.f2897l = bVar;
        bVar.j(this);
    }

    public final void c() {
        if (!this.f2912c) {
            super.c();
            if (!this.m) {
                this.m = true;
                this.f2897l.k(this);
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final b0.i t() {
        /*
            r9 = this;
            b0.b r0 = r9.f2897l
            boolean r1 = r0.f2893k
            if (r1 != 0) goto L_0x0107
            boolean r1 = r0.f2912c
            if (r1 == 0) goto L_0x000c
            goto L_0x0107
        L_0x000c:
            java.util.Set<b0.g0> r1 = r9.f2889g
            int r2 = r9.f2911b
            if (r1 == 0) goto L_0x001b
            b0.k r3 = r0.e()
            java.util.HashMap r0 = b0.m.c(r0, r9, r3)
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            java.lang.Object r3 = b0.m.f2942c
            monitor-enter(r3)
            b0.m.d(r9)     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x005b
            int r4 = r1.size()     // Catch:{ all -> 0x0104 }
            if (r4 != 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            b0.b r4 = r9.f2897l     // Catch:{ all -> 0x0104 }
            int r4 = r4.d()     // Catch:{ all -> 0x0104 }
            b0.b r5 = r9.f2897l     // Catch:{ all -> 0x0104 }
            b0.k r5 = r5.e()     // Catch:{ all -> 0x0104 }
            b0.i r0 = r9.v(r4, r0, r5)     // Catch:{ all -> 0x0104 }
            b0.i$b r4 = b0.i.b.f2916a     // Catch:{ all -> 0x0104 }
            boolean r4 = sf.j.a(r0, r4)     // Catch:{ all -> 0x0104 }
            if (r4 != 0) goto L_0x0045
            monitor-exit(r3)
            return r0
        L_0x0045:
            b0.b r0 = r9.f2897l     // Catch:{ all -> 0x0104 }
            java.util.Set r0 = r0.u()     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x0057
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0104 }
            r0.<init>()     // Catch:{ all -> 0x0104 }
            b0.b r4 = r9.f2897l     // Catch:{ all -> 0x0104 }
            r4.x(r0)     // Catch:{ all -> 0x0104 }
        L_0x0057:
            r0.addAll(r1)     // Catch:{ all -> 0x0104 }
            goto L_0x005e
        L_0x005b:
            r9.a()     // Catch:{ all -> 0x0104 }
        L_0x005e:
            b0.b r0 = r9.f2897l     // Catch:{ all -> 0x0104 }
            int r0 = r0.d()     // Catch:{ all -> 0x0104 }
            if (r0 >= r2) goto L_0x006b
            b0.b r0 = r9.f2897l     // Catch:{ all -> 0x0104 }
            r0.s()     // Catch:{ all -> 0x0104 }
        L_0x006b:
            b0.b r0 = r9.f2897l     // Catch:{ all -> 0x0104 }
            b0.k r1 = r0.e()     // Catch:{ all -> 0x0104 }
            b0.k r1 = r1.b(r2)     // Catch:{ all -> 0x0104 }
            b0.k r4 = r9.f2890h     // Catch:{ all -> 0x0104 }
            b0.k r1 = r1.a(r4)     // Catch:{ all -> 0x0104 }
            r0.q(r1)     // Catch:{ all -> 0x0104 }
            b0.b r0 = r9.f2897l     // Catch:{ all -> 0x0104 }
            r0.w(r2)     // Catch:{ all -> 0x0104 }
            b0.b r0 = r9.f2897l     // Catch:{ all -> 0x0104 }
            int r1 = r9.f2913d     // Catch:{ all -> 0x0104 }
            r2 = -1
            r9.f2913d = r2     // Catch:{ all -> 0x0104 }
            if (r1 < 0) goto L_0x009f
            int[] r2 = r0.f2891i     // Catch:{ all -> 0x0104 }
            java.lang.String r4 = "<this>"
            sf.j.f(r2, r4)     // Catch:{ all -> 0x0104 }
            int r4 = r2.length     // Catch:{ all -> 0x0104 }
            int r5 = r4 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ all -> 0x0104 }
            r2[r4] = r1     // Catch:{ all -> 0x0104 }
            r0.f2891i = r2     // Catch:{ all -> 0x0104 }
            goto L_0x00a2
        L_0x009f:
            r0.getClass()     // Catch:{ all -> 0x0104 }
        L_0x00a2:
            b0.b r0 = r9.f2897l     // Catch:{ all -> 0x0104 }
            b0.k r1 = r9.f2890h     // Catch:{ all -> 0x0104 }
            r0.getClass()     // Catch:{ all -> 0x0104 }
            java.lang.String r2 = "snapshots"
            sf.j.f(r1, r2)     // Catch:{ all -> 0x0104 }
            monitor-enter(r3)     // Catch:{ all -> 0x0104 }
            b0.k r2 = r0.f2890h     // Catch:{ all -> 0x0101 }
            b0.k r1 = r2.d(r1)     // Catch:{ all -> 0x0101 }
            r0.f2890h = r1     // Catch:{ all -> 0x0101 }
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x0101 }
            monitor-exit(r3)     // Catch:{ all -> 0x0104 }
            b0.b r0 = r9.f2897l     // Catch:{ all -> 0x0104 }
            int[] r1 = r9.f2891i     // Catch:{ all -> 0x0104 }
            r0.getClass()     // Catch:{ all -> 0x0104 }
            java.lang.String r2 = "handles"
            sf.j.f(r1, r2)     // Catch:{ all -> 0x0104 }
            int r2 = r1.length     // Catch:{ all -> 0x0104 }
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x00cd
            r2 = r4
            goto L_0x00ce
        L_0x00cd:
            r2 = r5
        L_0x00ce:
            if (r2 == 0) goto L_0x00d1
            goto L_0x00f0
        L_0x00d1:
            int[] r2 = r0.f2891i     // Catch:{ all -> 0x0104 }
            int r6 = r2.length     // Catch:{ all -> 0x0104 }
            if (r6 != 0) goto L_0x00d8
            r6 = r4
            goto L_0x00d9
        L_0x00d8:
            r6 = r5
        L_0x00d9:
            if (r6 == 0) goto L_0x00de
            r0.f2891i = r1     // Catch:{ all -> 0x0104 }
            goto L_0x00f0
        L_0x00de:
            int r6 = r2.length     // Catch:{ all -> 0x0104 }
            int r7 = r1.length     // Catch:{ all -> 0x0104 }
            int r8 = r6 + r7
            int[] r2 = java.util.Arrays.copyOf(r2, r8)     // Catch:{ all -> 0x0104 }
            java.lang.System.arraycopy(r1, r5, r2, r6, r7)     // Catch:{ all -> 0x0104 }
            java.lang.String r1 = "result"
            sf.j.e(r2, r1)     // Catch:{ all -> 0x0104 }
            r0.f2891i = r2     // Catch:{ all -> 0x0104 }
        L_0x00f0:
            monitor-exit(r3)
            r9.f2893k = r4
            boolean r0 = r9.m
            if (r0 != 0) goto L_0x00fe
            r9.m = r4
            b0.b r0 = r9.f2897l
            r0.k(r9)
        L_0x00fe:
            b0.i$b r0 = b0.i.b.f2916a
            return r0
        L_0x0101:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0104 }
            throw r0     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0107:
            b0.i$a r0 = new b0.i$a
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c.t():b0.i");
    }
}
