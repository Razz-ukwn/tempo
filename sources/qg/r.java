package qg;

import ff.m;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import jg.q;
import sf.j;
import wg.e;
import wg.g0;
import wg.i0;
import wg.j0;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f13717a;

    /* renamed from: b  reason: collision with root package name */
    public final f f13718b;

    /* renamed from: c  reason: collision with root package name */
    public long f13719c;

    /* renamed from: d  reason: collision with root package name */
    public long f13720d;

    /* renamed from: e  reason: collision with root package name */
    public long f13721e;

    /* renamed from: f  reason: collision with root package name */
    public long f13722f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<q> f13723g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13724h;

    /* renamed from: i  reason: collision with root package name */
    public final b f13725i;

    /* renamed from: j  reason: collision with root package name */
    public final a f13726j;

    /* renamed from: k  reason: collision with root package name */
    public final c f13727k = new c(this);

    /* renamed from: l  reason: collision with root package name */
    public final c f13728l = new c(this);
    public b m;

    /* renamed from: n  reason: collision with root package name */
    public IOException f13729n;

    public final class a implements g0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13730a;

        /* renamed from: b  reason: collision with root package name */
        public final e f13731b = new e();

        /* renamed from: c  reason: collision with root package name */
        public boolean f13732c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ r f13733d;

        public a(r rVar, boolean z10) {
            j.f(rVar, "this$0");
            this.f13733d = rVar;
            this.f13730a = z10;
        }

        public final void B(e eVar, long j10) {
            j.f(eVar, "source");
            byte[] bArr = kg.b.f10474a;
            e eVar2 = this.f13731b;
            eVar2.B(eVar, j10);
            while (eVar2.f16752b >= 16384) {
                c(false);
            }
        }

        public final j0 b() {
            return this.f13733d.f13728l;
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void c(boolean r12) {
            /*
                r11 = this;
                qg.r r0 = r11.f13733d
                monitor-enter(r0)
                qg.r$c r1 = r0.f13728l     // Catch:{ all -> 0x007b }
                r1.h()     // Catch:{ all -> 0x007b }
            L_0x0008:
                long r1 = r0.f13721e     // Catch:{ all -> 0x0025 }
                long r3 = r0.f13722f     // Catch:{ all -> 0x0025 }
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L_0x0027
                boolean r1 = r11.f13730a     // Catch:{ all -> 0x0025 }
                if (r1 != 0) goto L_0x0027
                boolean r1 = r11.f13732c     // Catch:{ all -> 0x0025 }
                if (r1 != 0) goto L_0x0027
                monitor-enter(r0)     // Catch:{ all -> 0x0025 }
                qg.b r1 = r0.m     // Catch:{ all -> 0x0022 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 != 0) goto L_0x0027
                r0.j()     // Catch:{ all -> 0x0025 }
                goto L_0x0008
            L_0x0022:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r12     // Catch:{ all -> 0x0025 }
            L_0x0025:
                r12 = move-exception
                goto L_0x0075
            L_0x0027:
                qg.r$c r1 = r0.f13728l     // Catch:{ all -> 0x007b }
                r1.l()     // Catch:{ all -> 0x007b }
                r0.b()     // Catch:{ all -> 0x007b }
                long r1 = r0.f13722f     // Catch:{ all -> 0x007b }
                long r3 = r0.f13721e     // Catch:{ all -> 0x007b }
                long r1 = r1 - r3
                wg.e r3 = r11.f13731b     // Catch:{ all -> 0x007b }
                long r3 = r3.f16752b     // Catch:{ all -> 0x007b }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007b }
                long r1 = r0.f13721e     // Catch:{ all -> 0x007b }
                long r1 = r1 + r9
                r0.f13721e = r1     // Catch:{ all -> 0x007b }
                if (r12 == 0) goto L_0x004d
                wg.e r12 = r11.f13731b     // Catch:{ all -> 0x007b }
                long r1 = r12.f16752b     // Catch:{ all -> 0x007b }
                int r12 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r12 != 0) goto L_0x004d
                r12 = 1
                goto L_0x004e
            L_0x004d:
                r12 = 0
            L_0x004e:
                r7 = r12
                ff.m r12 = ff.m.f8717a     // Catch:{ all -> 0x007b }
                monitor-exit(r0)
                qg.r r12 = r11.f13733d
                qg.r$c r12 = r12.f13728l
                r12.h()
                qg.r r12 = r11.f13733d     // Catch:{ all -> 0x006c }
                qg.f r5 = r12.f13718b     // Catch:{ all -> 0x006c }
                int r6 = r12.f13717a     // Catch:{ all -> 0x006c }
                wg.e r8 = r11.f13731b     // Catch:{ all -> 0x006c }
                r5.s(r6, r7, r8, r9)     // Catch:{ all -> 0x006c }
                qg.r r12 = r11.f13733d
                qg.r$c r12 = r12.f13728l
                r12.l()
                return
            L_0x006c:
                r12 = move-exception
                qg.r r0 = r11.f13733d
                qg.r$c r0 = r0.f13728l
                r0.l()
                throw r12
            L_0x0075:
                qg.r$c r1 = r0.f13728l     // Catch:{ all -> 0x007b }
                r1.l()     // Catch:{ all -> 0x007b }
                throw r12     // Catch:{ all -> 0x007b }
            L_0x007b:
                r12 = move-exception
                monitor-exit(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.r.a.c(boolean):void");
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void close() {
            /*
                r14 = this;
                qg.r r0 = r14.f13733d
                byte[] r1 = kg.b.f10474a
                monitor-enter(r0)
                boolean r1 = r14.f13732c     // Catch:{ all -> 0x0062 }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                monitor-enter(r0)     // Catch:{ all -> 0x0062 }
                qg.b r1 = r0.m     // Catch:{ all -> 0x005f }
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0015
                r1 = r3
                goto L_0x0016
            L_0x0015:
                r1 = r2
            L_0x0016:
                ff.m r4 = ff.m.f8717a     // Catch:{ all -> 0x0062 }
                monitor-exit(r0)
                qg.r r0 = r14.f13733d
                qg.r$a r4 = r0.f13726j
                boolean r4 = r4.f13730a
                if (r4 != 0) goto L_0x0047
                wg.e r4 = r14.f13731b
                long r4 = r4.f16752b
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x002c
                r2 = r3
            L_0x002c:
                if (r2 == 0) goto L_0x003a
            L_0x002e:
                wg.e r0 = r14.f13731b
                long r0 = r0.f16752b
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0047
                r14.c(r3)
                goto L_0x002e
            L_0x003a:
                if (r1 == 0) goto L_0x0047
                qg.f r8 = r0.f13718b
                int r9 = r0.f13717a
                r10 = 1
                r11 = 0
                r12 = 0
                r8.s(r9, r10, r11, r12)
            L_0x0047:
                qg.r r0 = r14.f13733d
                monitor-enter(r0)
                r14.f13732c = r3     // Catch:{ all -> 0x005c }
                ff.m r1 = ff.m.f8717a     // Catch:{ all -> 0x005c }
                monitor-exit(r0)
                qg.r r0 = r14.f13733d
                qg.f r0 = r0.f13718b
                r0.flush()
                qg.r r0 = r14.f13733d
                r0.a()
                return
            L_0x005c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x005f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                throw r1     // Catch:{ all -> 0x0062 }
            L_0x0062:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.r.a.close():void");
        }

        public final void flush() {
            r rVar = this.f13733d;
            byte[] bArr = kg.b.f10474a;
            synchronized (rVar) {
                rVar.b();
                m mVar = m.f8717a;
            }
            while (this.f13731b.f16752b > 0) {
                c(false);
                this.f13733d.f13718b.flush();
            }
        }
    }

    public final class b implements i0 {
        public final /* synthetic */ r B;

        /* renamed from: a  reason: collision with root package name */
        public final long f13734a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f13735b;

        /* renamed from: c  reason: collision with root package name */
        public final e f13736c = new e();

        /* renamed from: d  reason: collision with root package name */
        public final e f13737d = new e();

        /* renamed from: e  reason: collision with root package name */
        public boolean f13738e;

        public b(r rVar, long j10, boolean z10) {
            j.f(rVar, "this$0");
            this.B = rVar;
            this.f13734a = j10;
            this.f13735b = z10;
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final long a0(wg.e r17, long r18) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                java.lang.String r4 = "sink"
                sf.j.f(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r7 = 1
                r8 = 0
                if (r6 < 0) goto L_0x0015
                r6 = r7
                goto L_0x0016
            L_0x0015:
                r6 = r8
            L_0x0016:
                if (r6 == 0) goto L_0x00b6
            L_0x0018:
                qg.r r6 = r1.B
                monitor-enter(r6)
                qg.r$c r9 = r6.f13727k     // Catch:{ all -> 0x00b3 }
                r9.h()     // Catch:{ all -> 0x00b3 }
                monitor-enter(r6)     // Catch:{ all -> 0x003b }
                qg.b r9 = r6.m     // Catch:{ all -> 0x00a9 }
                monitor-exit(r6)     // Catch:{ all -> 0x003b }
                if (r9 == 0) goto L_0x003e
                java.io.IOException r9 = r6.f13729n     // Catch:{ all -> 0x003b }
                if (r9 != 0) goto L_0x003f
                qg.w r9 = new qg.w     // Catch:{ all -> 0x003b }
                monitor-enter(r6)     // Catch:{ all -> 0x003b }
                qg.b r10 = r6.m     // Catch:{ all -> 0x0037 }
                monitor-exit(r6)     // Catch:{ all -> 0x003b }
                sf.j.c(r10)     // Catch:{ all -> 0x003b }
                r9.<init>(r10)     // Catch:{ all -> 0x003b }
                goto L_0x003f
            L_0x0037:
                r0 = move-exception
                r2 = r0
                monitor-exit(r6)     // Catch:{ all -> 0x003b }
                throw r2     // Catch:{ all -> 0x003b }
            L_0x003b:
                r0 = move-exception
                goto L_0x00ad
            L_0x003e:
                r9 = 0
            L_0x003f:
                boolean r10 = r1.f13738e     // Catch:{ all -> 0x003b }
                if (r10 != 0) goto L_0x00a1
                wg.e r10 = r1.f13737d     // Catch:{ all -> 0x003b }
                long r11 = r10.f16752b     // Catch:{ all -> 0x003b }
                int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                r14 = -1
                if (r13 <= 0) goto L_0x007b
                long r11 = java.lang.Math.min(r2, r11)     // Catch:{ all -> 0x003b }
                long r10 = r10.a0(r0, r11)     // Catch:{ all -> 0x003b }
                long r12 = r6.f13719c     // Catch:{ all -> 0x003b }
                long r12 = r12 + r10
                r6.f13719c = r12     // Catch:{ all -> 0x003b }
                long r4 = r6.f13720d     // Catch:{ all -> 0x003b }
                long r12 = r12 - r4
                if (r9 != 0) goto L_0x0079
                qg.f r4 = r6.f13718b     // Catch:{ all -> 0x003b }
                qg.v r4 = r4.N     // Catch:{ all -> 0x003b }
                int r4 = r4.a()     // Catch:{ all -> 0x003b }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x003b }
                int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r4 < 0) goto L_0x0079
                qg.f r4 = r6.f13718b     // Catch:{ all -> 0x003b }
                int r5 = r6.f13717a     // Catch:{ all -> 0x003b }
                r4.z(r5, r12)     // Catch:{ all -> 0x003b }
                long r4 = r6.f13719c     // Catch:{ all -> 0x003b }
                r6.f13720d = r4     // Catch:{ all -> 0x003b }
            L_0x0079:
                r4 = r8
                goto L_0x0088
            L_0x007b:
                boolean r4 = r1.f13735b     // Catch:{ all -> 0x003b }
                if (r4 != 0) goto L_0x0086
                if (r9 != 0) goto L_0x0086
                r6.j()     // Catch:{ all -> 0x003b }
                r4 = r7
                goto L_0x0087
            L_0x0086:
                r4 = r8
            L_0x0087:
                r10 = r14
            L_0x0088:
                qg.r$c r5 = r6.f13727k     // Catch:{ all -> 0x00b3 }
                r5.l()     // Catch:{ all -> 0x00b3 }
                ff.m r5 = ff.m.f8717a     // Catch:{ all -> 0x00b3 }
                monitor-exit(r6)
                if (r4 == 0) goto L_0x0095
                r4 = 0
                goto L_0x0018
            L_0x0095:
                int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
                if (r0 == 0) goto L_0x009d
                r1.c(r10)
                return r10
            L_0x009d:
                if (r9 != 0) goto L_0x00a0
                return r14
            L_0x00a0:
                throw r9
            L_0x00a1:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x003b }
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch:{ all -> 0x003b }
                throw r0     // Catch:{ all -> 0x003b }
            L_0x00a9:
                r0 = move-exception
                r2 = r0
                monitor-exit(r6)     // Catch:{ all -> 0x003b }
                throw r2     // Catch:{ all -> 0x003b }
            L_0x00ad:
                qg.r$c r2 = r6.f13727k     // Catch:{ all -> 0x00b3 }
                r2.l()     // Catch:{ all -> 0x00b3 }
                throw r0     // Catch:{ all -> 0x00b3 }
            L_0x00b3:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            L_0x00b6:
                java.lang.String r0 = "byteCount < 0: "
                java.lang.Long r2 = java.lang.Long.valueOf(r18)
                java.lang.String r0 = sf.j.k(r2, r0)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.r.b.a0(wg.e, long):long");
        }

        public final j0 b() {
            return this.B.f13727k;
        }

        public final void c(long j10) {
            byte[] bArr = kg.b.f10474a;
            this.B.f13718b.q(j10);
        }

        public final void close() {
            long j10;
            r rVar = this.B;
            synchronized (rVar) {
                this.f13738e = true;
                e eVar = this.f13737d;
                j10 = eVar.f16752b;
                eVar.j();
                rVar.notifyAll();
                m mVar = m.f8717a;
            }
            if (j10 > 0) {
                c(j10);
            }
            this.B.a();
        }
    }

    public final class c extends wg.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ r f13739k;

        public c(r rVar) {
            j.f(rVar, "this$0");
            this.f13739k = rVar;
        }

        public final IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void k() {
            this.f13739k.e(b.CANCEL);
            f fVar = this.f13739k.f13718b;
            synchronized (fVar) {
                long j10 = fVar.L;
                long j11 = fVar.K;
                if (j10 >= j11) {
                    fVar.K = j11 + 1;
                    fVar.M = System.nanoTime() + ((long) 1000000000);
                    m mVar = m.f8717a;
                    fVar.E.c(new o(j.k(" ping", fVar.f13653d), fVar), 0);
                }
            }
        }

        public final void l() {
            if (i()) {
                throw j((IOException) null);
            }
        }
    }

    public r(int i8, f fVar, boolean z10, boolean z11, q qVar) {
        this.f13717a = i8;
        this.f13718b = fVar;
        this.f13722f = (long) fVar.O.a();
        ArrayDeque<q> arrayDeque = new ArrayDeque<>();
        this.f13723g = arrayDeque;
        this.f13725i = new b(this, (long) fVar.N.a(), z11);
        this.f13726j = new a(this, z10);
        if (qVar != null) {
            if (!g()) {
                arrayDeque.add(qVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!g()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z10;
        boolean h3;
        byte[] bArr = kg.b.f10474a;
        synchronized (this) {
            b bVar = this.f13725i;
            if (!bVar.f13735b && bVar.f13738e) {
                a aVar = this.f13726j;
                if (aVar.f13730a || aVar.f13732c) {
                    z10 = true;
                    h3 = h();
                    m mVar = m.f8717a;
                }
            }
            z10 = false;
            h3 = h();
            m mVar2 = m.f8717a;
        }
        if (z10) {
            c(b.CANCEL, (IOException) null);
        } else if (!h3) {
            this.f13718b.j(this.f13717a);
        }
    }

    public final void b() {
        a aVar = this.f13726j;
        if (aVar.f13732c) {
            throw new IOException("stream closed");
        } else if (aVar.f13730a) {
            throw new IOException("stream finished");
        } else if (this.m != null) {
            Throwable th = this.f13729n;
            if (th == null) {
                b bVar = this.m;
                j.c(bVar);
                th = new w(bVar);
            }
            throw th;
        }
    }

    public final void c(b bVar, IOException iOException) {
        if (d(bVar, iOException)) {
            f fVar = this.f13718b;
            fVar.getClass();
            fVar.U.q(this.f13717a, bVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean d(qg.b r3, java.io.IOException r4) {
        /*
            r2 = this;
            byte[] r0 = kg.b.f10474a
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x002d }
            qg.b r0 = r2.m     // Catch:{ all -> 0x002f }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 == 0) goto L_0x000c
            monitor-exit(r2)
            return r1
        L_0x000c:
            qg.r$b r0 = r2.f13725i     // Catch:{ all -> 0x002d }
            boolean r0 = r0.f13735b     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x001a
            qg.r$a r0 = r2.f13726j     // Catch:{ all -> 0x002d }
            boolean r0 = r0.f13730a     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x001a
            monitor-exit(r2)
            return r1
        L_0x001a:
            r2.m = r3     // Catch:{ all -> 0x002d }
            r2.f13729n = r4     // Catch:{ all -> 0x002d }
            r2.notifyAll()     // Catch:{ all -> 0x002d }
            ff.m r3 = ff.m.f8717a     // Catch:{ all -> 0x002d }
            monitor-exit(r2)
            qg.f r3 = r2.f13718b
            int r4 = r2.f13717a
            r3.j(r4)
            r3 = 1
            return r3
        L_0x002d:
            r3 = move-exception
            goto L_0x0032
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r3     // Catch:{ all -> 0x002d }
        L_0x0032:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.r.d(qg.b, java.io.IOException):boolean");
    }

    public final void e(b bVar) {
        if (d(bVar, (IOException) null)) {
            this.f13718b.u(this.f13717a, bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final qg.r.a f() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f13724h     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.g()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            qg.r$a r0 = r2.f13726j
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.r.f():qg.r$a");
    }

    public final boolean g() {
        return this.f13718b.f13650a == ((this.f13717a & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean h() {
        /*
            r3 = this;
            monitor-enter(r3)
            qg.b r0 = r3.m     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            qg.r$b r0 = r3.f13725i     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f13735b     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0012
            boolean r0 = r0.f13738e     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x0012:
            qg.r$a r0 = r3.f13726j     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f13730a     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x001c
            boolean r0 = r0.f13732c     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x001c:
            boolean r0 = r3.f13724h     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.r.h():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(jg.q r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            sf.j.f(r3, r0)
            byte[] r0 = kg.b.f10474a
            monitor-enter(r2)
            boolean r0 = r2.f13724h     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            qg.r$b r3 = r2.f13725i     // Catch:{ all -> 0x0037 }
            r3.getClass()     // Catch:{ all -> 0x0037 }
            goto L_0x001d
        L_0x0016:
            r2.f13724h = r1     // Catch:{ all -> 0x0037 }
            java.util.ArrayDeque<jg.q> r0 = r2.f13723g     // Catch:{ all -> 0x0037 }
            r0.add(r3)     // Catch:{ all -> 0x0037 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            qg.r$b r3 = r2.f13725i     // Catch:{ all -> 0x0037 }
            r3.f13735b = r1     // Catch:{ all -> 0x0037 }
        L_0x0023:
            boolean r3 = r2.h()     // Catch:{ all -> 0x0037 }
            r2.notifyAll()     // Catch:{ all -> 0x0037 }
            ff.m r4 = ff.m.f8717a     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0036
            qg.f r3 = r2.f13718b
            int r4 = r2.f13717a
            r3.j(r4)
        L_0x0036:
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.r.i(jg.q, boolean):void");
    }

    public final void j() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
