package t9;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import qa.b;

public final class q<T> implements b<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    public volatile Set<b<T>> f15489a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b  reason: collision with root package name */
    public volatile Set<T> f15490b = null;

    public q(Collection<b<T>> collection) {
        this.f15489a.addAll(collection);
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
    public final java.lang.Object get() {
        /*
            r3 = this;
            java.util.Set<T> r0 = r3.f15490b
            if (r0 != 0) goto L_0x003e
            monitor-enter(r3)
            java.util.Set<T> r0 = r3.f15490b     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0039
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)     // Catch:{ all -> 0x003b }
            r3.f15490b = r0     // Catch:{ all -> 0x003b }
            monitor-enter(r3)     // Catch:{ all -> 0x003b }
            java.util.Set<qa.b<T>> r0 = r3.f15489a     // Catch:{ all -> 0x0036 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0036 }
        L_0x001b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0036 }
            qa.b r1 = (qa.b) r1     // Catch:{ all -> 0x0036 }
            java.util.Set<T> r2 = r3.f15490b     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0036 }
            r2.add(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x001b
        L_0x0031:
            r0 = 0
            r3.f15489a = r0     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            goto L_0x003e
        L_0x003b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            java.util.Set<T> r0 = r3.f15490b
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.q.get():java.lang.Object");
    }
}
