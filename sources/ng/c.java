package ng;

import java.io.IOException;
import jg.a;
import jg.f0;
import jg.n;
import jg.r;
import ng.k;
import qg.b;
import qg.w;
import sf.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final i f11937a;

    /* renamed from: b  reason: collision with root package name */
    public final a f11938b;

    /* renamed from: c  reason: collision with root package name */
    public final d f11939c;

    /* renamed from: d  reason: collision with root package name */
    public final n f11940d;

    /* renamed from: e  reason: collision with root package name */
    public k.a f11941e;

    /* renamed from: f  reason: collision with root package name */
    public k f11942f;

    /* renamed from: g  reason: collision with root package name */
    public int f11943g;

    /* renamed from: h  reason: collision with root package name */
    public int f11944h;

    /* renamed from: i  reason: collision with root package name */
    public int f11945i;

    /* renamed from: j  reason: collision with root package name */
    public f0 f11946j;

    public c(i iVar, a aVar, d dVar, n nVar) {
        j.f(iVar, "connectionPool");
        j.f(nVar, "eventListener");
        this.f11937a = iVar;
        this.f11938b = aVar;
        this.f11939c = dVar;
        this.f11940d = nVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: jg.f0} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0333 A[SYNTHETIC] */
    public final ng.e a(int r15, int r16, int r17, boolean r18, boolean r19) {
        /*
            r14 = this;
            r1 = r14
        L_0x0001:
            ng.d r0 = r1.f11939c
            boolean r0 = r0.L
            if (r0 != 0) goto L_0x0380
            ng.d r0 = r1.f11939c
            ng.e r2 = r0.F
            r0 = 0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x005b
            monitor-enter(r2)
            boolean r5 = r2.f11965j     // Catch:{ all -> 0x0058 }
            if (r5 != 0) goto L_0x0024
            jg.f0 r5 = r2.f11957b     // Catch:{ all -> 0x0058 }
            jg.a r5 = r5.f10079a     // Catch:{ all -> 0x0058 }
            jg.r r5 = r5.f10023i     // Catch:{ all -> 0x0058 }
            boolean r5 = r14.b(r5)     // Catch:{ all -> 0x0058 }
            if (r5 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r4
            goto L_0x002a
        L_0x0024:
            ng.d r5 = r1.f11939c     // Catch:{ all -> 0x0058 }
            java.net.Socket r5 = r5.l()     // Catch:{ all -> 0x0058 }
        L_0x002a:
            ff.m r6 = ff.m.f8717a     // Catch:{ all -> 0x0058 }
            monitor-exit(r2)
            ng.d r6 = r1.f11939c
            ng.e r6 = r6.F
            if (r6 == 0) goto L_0x0045
            if (r5 != 0) goto L_0x0036
            r0 = r3
        L_0x0036:
            if (r0 == 0) goto L_0x0039
            goto L_0x0080
        L_0x0039:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0045:
            if (r5 != 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            kg.b.e(r5)
        L_0x004b:
            jg.n r2 = r1.f11940d
            ng.d r5 = r1.f11939c
            r2.getClass()
            java.lang.String r2 = "call"
            sf.j.f(r5, r2)
            goto L_0x005b
        L_0x0058:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x005b:
            r1.f11943g = r0
            r1.f11944h = r0
            r1.f11945i = r0
            ng.i r2 = r1.f11937a
            jg.a r5 = r1.f11938b
            ng.d r6 = r1.f11939c
            boolean r2 = r2.a(r5, r6, r4, r0)
            if (r2 == 0) goto L_0x0084
            ng.d r0 = r1.f11939c
            ng.e r2 = r0.F
            sf.j.c(r2)
            jg.n r0 = r1.f11940d
            ng.d r4 = r1.f11939c
            r0.getClass()
            java.lang.String r0 = "call"
            sf.j.f(r4, r0)
        L_0x0080:
            r0 = r19
            goto L_0x032d
        L_0x0084:
            jg.f0 r2 = r1.f11946j
            if (r2 == 0) goto L_0x008b
            r1.f11946j = r4
            goto L_0x00af
        L_0x008b:
            ng.k$a r2 = r1.f11941e
            if (r2 == 0) goto L_0x00b8
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x00b8
            ng.k$a r0 = r1.f11941e
            sf.j.c(r0)
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x00b2
            int r2 = r0.f11994b
            int r5 = r2 + 1
            r0.f11994b = r5
            java.util.List<jg.f0> r0 = r0.f11993a
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            jg.f0 r2 = (jg.f0) r2
        L_0x00af:
            r5 = r4
            goto L_0x02a0
        L_0x00b2:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x00b8:
            ng.k r2 = r1.f11942f
            if (r2 != 0) goto L_0x00cd
            ng.k r2 = new ng.k
            jg.a r5 = r1.f11938b
            ng.d r6 = r1.f11939c
            jg.v r7 = r6.f11947a
            androidx.lifecycle.u r7 = r7.U
            jg.n r8 = r1.f11940d
            r2.<init>(r5, r7, r6, r8)
            r1.f11942f = r2
        L_0x00cd:
            boolean r5 = r2.a()
            if (r5 == 0) goto L_0x037a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00d8:
            int r6 = r2.f11990f
            java.util.List<? extends java.net.Proxy> r7 = r2.f11989e
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00e4
            r6 = r3
            goto L_0x00e5
        L_0x00e4:
            r6 = r0
        L_0x00e5:
            if (r6 == 0) goto L_0x024f
            int r6 = r2.f11990f
            java.util.List<? extends java.net.Proxy> r7 = r2.f11989e
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00f3
            r6 = r3
            goto L_0x00f4
        L_0x00f3:
            r6 = r0
        L_0x00f4:
            java.lang.String r7 = "No route to "
            jg.a r8 = r2.f11985a
            if (r6 == 0) goto L_0x022f
            java.util.List<? extends java.net.Proxy> r6 = r2.f11989e
            int r9 = r2.f11990f
            int r10 = r9 + 1
            r2.f11990f = r10
            java.lang.Object r6 = r6.get(r9)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r2.f11991g = r9
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.DIRECT
            if (r10 == r11) goto L_0x0161
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r10 != r11) goto L_0x0120
            goto L_0x0161
        L_0x0120:
            java.net.SocketAddress r10 = r6.address()
            boolean r11 = r10 instanceof java.net.InetSocketAddress
            if (r11 == 0) goto L_0x014d
            java.lang.String r11 = "proxyAddress"
            sf.j.e(r10, r11)
            java.net.InetSocketAddress r10 = (java.net.InetSocketAddress) r10
            java.net.InetAddress r11 = r10.getAddress()
            if (r11 != 0) goto L_0x013f
            java.lang.String r11 = r10.getHostName()
            java.lang.String r12 = "hostName"
            sf.j.e(r11, r12)
            goto L_0x0148
        L_0x013f:
            java.lang.String r11 = r11.getHostAddress()
            java.lang.String r12 = "address.hostAddress"
            sf.j.e(r11, r12)
        L_0x0148:
            int r10 = r10.getPort()
            goto L_0x0167
        L_0x014d:
            java.lang.Class r0 = r10.getClass()
            java.lang.String r2 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.String r0 = sf.j.k(r0, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0161:
            jg.r r10 = r8.f10023i
            java.lang.String r11 = r10.f10156d
            int r10 = r10.f10157e
        L_0x0167:
            if (r3 > r10) goto L_0x016f
            r12 = 65536(0x10000, float:9.18355E-41)
            if (r10 >= r12) goto L_0x016f
            r12 = r3
            goto L_0x0170
        L_0x016f:
            r12 = r0
        L_0x0170:
            if (r12 == 0) goto L_0x0210
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.SOCKS
            if (r7 != r12) goto L_0x0182
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r11, r10)
            r9.add(r7)
            goto L_0x01b8
        L_0x0182:
            jg.n r7 = r2.f11988d
            r7.getClass()
            jg.d r7 = r2.f11987c
            java.lang.String r12 = "call"
            sf.j.f(r7, r12)
            java.lang.String r7 = "domainName"
            sf.j.f(r11, r7)
            jg.m r7 = r8.f10015a
            java.util.List r7 = r7.b(r11)
            boolean r12 = r7.isEmpty()
            if (r12 != 0) goto L_0x01f4
            java.util.Iterator r7 = r7.iterator()
        L_0x01a3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01b8
            java.lang.Object r8 = r7.next()
            java.net.InetAddress r8 = (java.net.InetAddress) r8
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r8, r10)
            r9.add(r11)
            goto L_0x01a3
        L_0x01b8:
            java.util.List<? extends java.net.InetSocketAddress> r7 = r2.f11991g
            java.util.Iterator r7 = r7.iterator()
        L_0x01be:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01ec
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            jg.f0 r9 = new jg.f0
            jg.a r10 = r2.f11985a
            r9.<init>(r10, r6, r8)
            androidx.lifecycle.u r8 = r2.f11986b
            monitor-enter(r8)
            java.lang.Object r10 = r8.f2324b     // Catch:{ all -> 0x01e9 }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x01e9 }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x01e9 }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x01e5
            java.util.ArrayList r8 = r2.f11992h
            r8.add(r9)
            goto L_0x01be
        L_0x01e5:
            r5.add(r9)
            goto L_0x01be
        L_0x01e9:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01ec:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x00d8
            goto L_0x024f
        L_0x01f4:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            jg.m r3 = r8.f10015a
            r2.append(r3)
            java.lang.String r3 = " returned no addresses for "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0210:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r2.append(r11)
            r3 = 58
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x022f:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            jg.r r4 = r8.f10023i
            java.lang.String r4 = r4.f10156d
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.f11989e
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x024f:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x025f
            java.util.ArrayList r6 = r2.f11992h
            gf.o.p0(r6, r5)
            java.util.ArrayList r2 = r2.f11992h
            r2.clear()
        L_0x025f:
            ng.k$a r2 = new ng.k$a
            r2.<init>(r5)
            r1.f11941e = r2
            ng.d r6 = r1.f11939c
            boolean r6 = r6.L
            if (r6 != 0) goto L_0x0372
            ng.i r6 = r1.f11937a
            jg.a r7 = r1.f11938b
            ng.d r8 = r1.f11939c
            boolean r0 = r6.a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x028d
            ng.d r0 = r1.f11939c
            ng.e r2 = r0.F
            sf.j.c(r2)
            jg.n r0 = r1.f11940d
            ng.d r4 = r1.f11939c
            r0.getClass()
            java.lang.String r0 = "call"
            sf.j.f(r4, r0)
            goto L_0x0080
        L_0x028d:
            boolean r0 = r2.a()
            if (r0 == 0) goto L_0x036c
            int r0 = r2.f11994b
            int r6 = r0 + 1
            r2.f11994b = r6
            java.lang.Object r0 = r5.get(r0)
            r2 = r0
            jg.f0 r2 = (jg.f0) r2
        L_0x02a0:
            ng.e r13 = new ng.e
            ng.i r0 = r1.f11937a
            r13.<init>(r0, r2)
            ng.d r0 = r1.f11939c
            r0.N = r13
            ng.d r11 = r1.f11939c     // Catch:{ all -> 0x0366 }
            jg.n r12 = r1.f11940d     // Catch:{ all -> 0x0366 }
            r6 = r13
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r6.c(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0366 }
            ng.d r0 = r1.f11939c
            r0.N = r4
            ng.d r0 = r1.f11939c
            jg.v r0 = r0.f11947a
            androidx.lifecycle.u r4 = r0.U
            jg.f0 r0 = r13.f11957b
            monitor-enter(r4)
            java.lang.String r6 = "route"
            sf.j.f(r0, r6)     // Catch:{ all -> 0x0363 }
            java.lang.Object r6 = r4.f2324b     // Catch:{ all -> 0x0363 }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x0363 }
            r6.remove(r0)     // Catch:{ all -> 0x0363 }
            monitor-exit(r4)
            ng.i r0 = r1.f11937a
            jg.a r4 = r1.f11938b
            ng.d r6 = r1.f11939c
            boolean r0 = r0.a(r4, r6, r5, r3)
            if (r0 == 0) goto L_0x0300
            ng.d r0 = r1.f11939c
            ng.e r0 = r0.F
            sf.j.c(r0)
            r1.f11946j = r2
            java.net.Socket r2 = r13.f11959d
            sf.j.c(r2)
            kg.b.e(r2)
            jg.n r2 = r1.f11940d
            ng.d r4 = r1.f11939c
            r2.getClass()
            java.lang.String r2 = "call"
            sf.j.f(r4, r2)
            r2 = r0
            goto L_0x0080
        L_0x0300:
            monitor-enter(r13)
            ng.i r0 = r1.f11937a     // Catch:{ all -> 0x0360 }
            r0.getClass()     // Catch:{ all -> 0x0360 }
            byte[] r2 = kg.b.f10474a     // Catch:{ all -> 0x0360 }
            java.util.concurrent.ConcurrentLinkedQueue<ng.e> r2 = r0.f11982e     // Catch:{ all -> 0x0360 }
            r2.add(r13)     // Catch:{ all -> 0x0360 }
            mg.c r2 = r0.f11980c     // Catch:{ all -> 0x0360 }
            ng.h r0 = r0.f11981d     // Catch:{ all -> 0x0360 }
            r4 = 0
            r2.c(r0, r4)     // Catch:{ all -> 0x0360 }
            ng.d r0 = r1.f11939c     // Catch:{ all -> 0x0360 }
            r0.b(r13)     // Catch:{ all -> 0x0360 }
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x0360 }
            monitor-exit(r13)
            jg.n r0 = r1.f11940d
            ng.d r2 = r1.f11939c
            r0.getClass()
            java.lang.String r0 = "call"
            sf.j.f(r2, r0)
            r0 = r19
            r2 = r13
        L_0x032d:
            boolean r4 = r2.i(r0)
            if (r4 == 0) goto L_0x0334
            return r2
        L_0x0334:
            r2.k()
            jg.f0 r2 = r1.f11946j
            if (r2 == 0) goto L_0x033d
            goto L_0x0001
        L_0x033d:
            ng.k$a r2 = r1.f11941e
            if (r2 != 0) goto L_0x0343
            r2 = r3
            goto L_0x0347
        L_0x0343:
            boolean r2 = r2.a()
        L_0x0347:
            if (r2 == 0) goto L_0x034b
            goto L_0x0001
        L_0x034b:
            ng.k r2 = r1.f11942f
            if (r2 != 0) goto L_0x0350
            goto L_0x0354
        L_0x0350:
            boolean r3 = r2.a()
        L_0x0354:
            if (r3 == 0) goto L_0x0358
            goto L_0x0001
        L_0x0358:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x0360:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0363:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0366:
            r0 = move-exception
            ng.d r2 = r1.f11939c
            r2.N = r4
            throw r0
        L_0x036c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0372:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x037a:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0380:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.c.a(int, int, int, boolean, boolean):ng.e");
    }

    public final boolean b(r rVar) {
        j.f(rVar, "url");
        r rVar2 = this.f11938b.f10023i;
        return rVar.f10157e == rVar2.f10157e && j.a(rVar.f10156d, rVar2.f10156d);
    }

    public final void c(IOException iOException) {
        j.f(iOException, "e");
        this.f11946j = null;
        if ((iOException instanceof w) && ((w) iOException).f13754a == b.REFUSED_STREAM) {
            this.f11943g++;
        } else if (iOException instanceof qg.a) {
            this.f11944h++;
        } else {
            this.f11945i++;
        }
    }
}
