package jg;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import ng.d;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f10132a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<d.a> f10133b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<d.a> f10134c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<d> f10135d = new ArrayDeque<>();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
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
    public final void a(ng.d.a r2) {
        /*
            r1 = this;
            java.lang.String r0 = "call"
            sf.j.f(r2, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f11953b
            r0.decrementAndGet()
            java.util.ArrayDeque<ng.d$a> r0 = r1.f10134c
            monitor-enter(r1)
            boolean r2 = r0.remove(r2)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x001c
            monitor-enter(r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            r1.b()
            return
        L_0x001c:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "Call wasn't in-flight!"
            r2.<init>(r0)     // Catch:{ all -> 0x0024 }
            throw r2     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.l.a(ng.d$a):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void b() {
        /*
            r14 = this;
            byte[] r0 = kg.b.f10474a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque<ng.d$a> r1 = r14.f10133b     // Catch:{ all -> 0x00d8 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            sf.j.e(r1, r2)     // Catch:{ all -> 0x00d8 }
        L_0x0013:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d8 }
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d8 }
            ng.d$a r2 = (ng.d.a) r2     // Catch:{ all -> 0x00d8 }
            java.util.ArrayDeque<ng.d$a> r3 = r14.f10134c     // Catch:{ all -> 0x00d8 }
            int r3 = r3.size()     // Catch:{ all -> 0x00d8 }
            monitor-enter(r14)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r14)     // Catch:{ all -> 0x00d8 }
            r4 = 64
            if (r3 < r4) goto L_0x002c
            goto L_0x0049
        L_0x002c:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f11953b     // Catch:{ all -> 0x00d8 }
            int r3 = r3.get()     // Catch:{ all -> 0x00d8 }
            monitor-enter(r14)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r14)     // Catch:{ all -> 0x00d8 }
            r4 = 5
            if (r3 < r4) goto L_0x0038
            goto L_0x0013
        L_0x0038:
            r1.remove()     // Catch:{ all -> 0x00d8 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f11953b     // Catch:{ all -> 0x00d8 }
            r3.incrementAndGet()     // Catch:{ all -> 0x00d8 }
            r0.add(r2)     // Catch:{ all -> 0x00d8 }
            java.util.ArrayDeque<ng.d$a> r3 = r14.f10134c     // Catch:{ all -> 0x00d8 }
            r3.add(r2)     // Catch:{ all -> 0x00d8 }
            goto L_0x0013
        L_0x0049:
            monitor-enter(r14)     // Catch:{ all -> 0x00d8 }
            java.util.ArrayDeque<ng.d$a> r1 = r14.f10134c     // Catch:{ all -> 0x00d5 }
            int r1 = r1.size()     // Catch:{ all -> 0x00d5 }
            java.util.ArrayDeque<ng.d> r2 = r14.f10135d     // Catch:{ all -> 0x00d5 }
            int r2 = r2.size()     // Catch:{ all -> 0x00d5 }
            int r1 = r1 + r2
            monitor-exit(r14)     // Catch:{ all -> 0x00d8 }
            ff.m r1 = ff.m.f8717a     // Catch:{ all -> 0x00d8 }
            monitor-exit(r14)
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L_0x0061:
            if (r3 >= r1) goto L_0x00d4
            int r4 = r3 + 1
            java.lang.Object r3 = r0.get(r3)
            ng.d$a r3 = (ng.d.a) r3
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f10132a     // Catch:{ all -> 0x00d1 }
            if (r5 != 0) goto L_0x0097
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00d1 }
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00d1 }
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00d1 }
            r12.<init>()     // Catch:{ all -> 0x00d1 }
            java.lang.String r6 = kg.b.f10480g     // Catch:{ all -> 0x00d1 }
            java.lang.String r13 = " Dispatcher"
            java.lang.String r6 = sf.j.k(r13, r6)     // Catch:{ all -> 0x00d1 }
            java.lang.String r13 = "name"
            sf.j.f(r6, r13)     // Catch:{ all -> 0x00d1 }
            kg.a r13 = new kg.a     // Catch:{ all -> 0x00d1 }
            r13.<init>(r6, r2)     // Catch:{ all -> 0x00d1 }
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch:{ all -> 0x00d1 }
            r14.f10132a = r5     // Catch:{ all -> 0x00d1 }
        L_0x0097:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f10132a     // Catch:{ all -> 0x00d1 }
            sf.j.c(r5)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r14)
            r3.getClass()
            ng.d r6 = r3.f11954c
            jg.v r7 = r6.f11947a
            jg.l r7 = r7.f10190a
            byte[] r7 = kg.b.f10474a
            r5.execute(r3)     // Catch:{ RejectedExecutionException -> 0x00ac }
            goto L_0x00c6
        L_0x00ac:
            r5 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00c8 }
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch:{ all -> 0x00c8 }
            r7.initCause(r5)     // Catch:{ all -> 0x00c8 }
            r6.k(r7)     // Catch:{ all -> 0x00c8 }
            jg.e r5 = r3.f11952a     // Catch:{ all -> 0x00c8 }
            r5.b(r6, r7)     // Catch:{ all -> 0x00c8 }
            jg.v r5 = r6.f11947a
            jg.l r5 = r5.f10190a
            r5.a(r3)
        L_0x00c6:
            r3 = r4
            goto L_0x0061
        L_0x00c8:
            r0 = move-exception
            jg.v r1 = r6.f11947a
            jg.l r1 = r1.f10190a
            r1.a(r3)
            throw r0
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00d4:
            return
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00d8 }
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.l.b():void");
    }
}
