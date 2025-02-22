package ng;

import ff.m;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jg.e;
import jg.l;
import jg.n;
import jg.v;
import jg.x;
import rg.h;
import sf.j;

public final class d implements jg.d {
    public final c B;
    public final AtomicBoolean C = new AtomicBoolean();
    public Object D;
    public c E;
    public e F;
    public boolean G;
    public b H;
    public boolean I;
    public boolean J;
    public boolean K = true;
    public volatile boolean L;
    public volatile b M;
    public volatile e N;

    /* renamed from: a  reason: collision with root package name */
    public final v f11947a;

    /* renamed from: b  reason: collision with root package name */
    public final x f11948b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11949c;

    /* renamed from: d  reason: collision with root package name */
    public final i f11950d;

    /* renamed from: e  reason: collision with root package name */
    public final n f11951e;

    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final e f11952a;

        /* renamed from: b  reason: collision with root package name */
        public volatile AtomicInteger f11953b = new AtomicInteger(0);

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f11954c;

        public a(d dVar, e eVar) {
            j.f(dVar, "this$0");
            this.f11954c = dVar;
            this.f11952a = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[Catch:{ all -> 0x0056, all -> 0x0089 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005c A[Catch:{ all -> 0x0056, all -> 0x0089 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0072 A[Catch:{ all -> 0x0056, all -> 0x0089 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                ng.d r0 = r8.f11954c
                jg.x r0 = r0.f11948b
                jg.r r0 = r0.f10219a
                java.lang.String r0 = r0.f()
                java.lang.String r1 = "OkHttp "
                java.lang.String r0 = sf.j.k(r0, r1)
                ng.d r1 = r8.f11954c
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r3 = r2.getName()
                r2.setName(r0)
                ng.d$c r0 = r1.B     // Catch:{ all -> 0x0089 }
                r0.h()     // Catch:{ all -> 0x0089 }
                r0 = 0
                jg.c0 r0 = r1.i()     // Catch:{ IOException -> 0x0059, all -> 0x003c }
                r4 = 1
                jg.e r5 = r8.f11952a     // Catch:{ IOException -> 0x0037, all -> 0x0032 }
                r5.a(r0)     // Catch:{ IOException -> 0x0037, all -> 0x0032 }
                jg.v r0 = r1.f11947a     // Catch:{ all -> 0x0089 }
            L_0x002f:
                jg.l r0 = r0.f10190a     // Catch:{ all -> 0x0089 }
                goto L_0x007a
            L_0x0032:
                r0 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
                goto L_0x003d
            L_0x0037:
                r0 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
                goto L_0x005a
            L_0x003c:
                r4 = move-exception
            L_0x003d:
                r1.cancel()     // Catch:{ all -> 0x0056 }
                if (r0 != 0) goto L_0x0058
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0056 }
                java.lang.String r5 = "canceled due to "
                java.lang.String r5 = sf.j.k(r4, r5)     // Catch:{ all -> 0x0056 }
                r0.<init>(r5)     // Catch:{ all -> 0x0056 }
                androidx.fragment.app.z0.c(r0, r4)     // Catch:{ all -> 0x0056 }
                jg.e r5 = r8.f11952a     // Catch:{ all -> 0x0056 }
                r5.b(r1, r0)     // Catch:{ all -> 0x0056 }
                goto L_0x0058
            L_0x0056:
                r0 = move-exception
                goto L_0x0081
            L_0x0058:
                throw r4     // Catch:{ all -> 0x0056 }
            L_0x0059:
                r4 = move-exception
            L_0x005a:
                if (r0 == 0) goto L_0x0072
                rg.h r0 = rg.h.f14273a     // Catch:{ all -> 0x0056 }
                rg.h r0 = rg.h.f14273a     // Catch:{ all -> 0x0056 }
                java.lang.String r5 = "Callback failure for "
                java.lang.String r6 = ng.d.a(r1)     // Catch:{ all -> 0x0056 }
                java.lang.String r5 = sf.j.k(r6, r5)     // Catch:{ all -> 0x0056 }
                r0.getClass()     // Catch:{ all -> 0x0056 }
                r0 = 4
                rg.h.i(r0, r5, r4)     // Catch:{ all -> 0x0056 }
                goto L_0x0077
            L_0x0072:
                jg.e r0 = r8.f11952a     // Catch:{ all -> 0x0056 }
                r0.b(r1, r4)     // Catch:{ all -> 0x0056 }
            L_0x0077:
                jg.v r0 = r1.f11947a     // Catch:{ all -> 0x0089 }
                goto L_0x002f
            L_0x007a:
                r0.a(r8)     // Catch:{ all -> 0x0089 }
                r2.setName(r3)
                return
            L_0x0081:
                jg.v r1 = r1.f11947a     // Catch:{ all -> 0x0089 }
                jg.l r1 = r1.f10190a     // Catch:{ all -> 0x0089 }
                r1.a(r8)     // Catch:{ all -> 0x0089 }
                throw r0     // Catch:{ all -> 0x0089 }
            L_0x0089:
                r0 = move-exception
                r2.setName(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ng.d.a.run():void");
        }
    }

    public static final class b extends WeakReference<d> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f11955a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, Object obj) {
            super(dVar);
            j.f(dVar, "referent");
            this.f11955a = obj;
        }
    }

    public static final class c extends wg.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ d f11956k;

        public c(d dVar) {
            this.f11956k = dVar;
        }

        public final void k() {
            this.f11956k.cancel();
        }
    }

    public d(v vVar, x xVar, boolean z10) {
        j.f(vVar, "client");
        j.f(xVar, "originalRequest");
        this.f11947a = vVar;
        this.f11948b = xVar;
        this.f11949c = z10;
        this.f11950d = (i) vVar.f10191b.f13862a;
        n nVar = (n) vVar.f10194e.f9713b;
        byte[] bArr = kg.b.f10474a;
        j.f(nVar, "$this_asFactory");
        this.f11951e = nVar;
        c cVar = new c(this);
        cVar.g((long) 0, TimeUnit.MILLISECONDS);
        this.B = cVar;
    }

    public static final String a(d dVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.L ? "canceled " : "");
        sb2.append(dVar.f11949c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(dVar.f11948b.f10219a.f());
        return sb2.toString();
    }

    public final void b(e eVar) {
        byte[] bArr = kg.b.f10474a;
        if (this.F == null) {
            this.F = eVar;
            eVar.f11970p.add(new b(this, this.D));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean c() {
        return this.L;
    }

    public final void cancel() {
        Socket socket;
        if (!this.L) {
            this.L = true;
            b bVar = this.M;
            if (bVar != null) {
                bVar.f11926d.cancel();
            }
            e eVar = this.N;
            if (!(eVar == null || (socket = eVar.f11958c) == null)) {
                kg.b.e(socket);
            }
            this.f11951e.getClass();
        }
    }

    public final Object clone() {
        return new d(this.f11947a, this.f11948b, this.f11949c);
    }

    public final x d() {
        return this.f11948b;
    }

    public final <E extends IOException> E f(E e10) {
        E e11;
        Socket l10;
        byte[] bArr = kg.b.f10474a;
        e eVar = this.F;
        if (eVar != null) {
            synchronized (eVar) {
                l10 = l();
            }
            if (this.F == null) {
                if (l10 != null) {
                    kg.b.e(l10);
                }
                this.f11951e.getClass();
            } else {
                if (!(l10 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.G && this.B.i()) {
            e11 = new InterruptedIOException("timeout");
            if (e10 != null) {
                e11.initCause(e10);
            }
        } else {
            e11 = e10;
        }
        if (e10 != null) {
            n nVar = this.f11951e;
            j.c(e11);
            nVar.getClass();
        } else {
            this.f11951e.getClass();
        }
        return e11;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final jg.c0 g() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.C
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0079
            ng.d$c r0 = r3.B
            r0.h()
            rg.h r0 = rg.h.f14273a
            rg.h r0 = rg.h.f14273a
            java.lang.Object r0 = r0.g()
            r3.D = r0
            jg.n r0 = r3.f11951e
            r0.getClass()
            jg.v r0 = r3.f11947a     // Catch:{ all -> 0x0054 }
            jg.l r0 = r0.f10190a     // Catch:{ all -> 0x0054 }
            monitor-enter(r0)     // Catch:{ all -> 0x0054 }
            java.util.ArrayDeque<ng.d> r1 = r0.f10135d     // Catch:{ all -> 0x0051 }
            r1.add(r3)     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            jg.c0 r0 = r3.i()     // Catch:{ all -> 0x0054 }
            jg.v r1 = r3.f11947a
            jg.l r1 = r1.f10190a
            r1.getClass()
            java.util.ArrayDeque<ng.d> r2 = r1.f10135d
            monitor-enter(r1)
            boolean r2 = r2.remove(r3)     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x0046
            monitor-enter(r1)     // Catch:{ all -> 0x004e }
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x004e }
            monitor-exit(r1)
            r1.b()
            return r0
        L_0x0046:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "Call wasn't in-flight!"
            r0.<init>(r2)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0051:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            jg.v r1 = r3.f11947a
            jg.l r1 = r1.f10190a
            r1.getClass()
            java.util.ArrayDeque<ng.d> r2 = r1.f10135d
            monitor-enter(r1)
            boolean r2 = r2.remove(r3)     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x006e
            monitor-enter(r1)     // Catch:{ all -> 0x0076 }
            monitor-exit(r1)     // Catch:{ all -> 0x0076 }
            ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x0076 }
            monitor-exit(r1)
            r1.b()
            throw r0
        L_0x006e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "Call wasn't in-flight!"
            r0.<init>(r2)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0079:
            java.lang.String r0 = "Already Executed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.d.g():jg.c0");
    }

    public final void h(boolean z10) {
        b bVar;
        synchronized (this) {
            if (this.K) {
                m mVar = m.f8717a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (bVar = this.M) != null) {
            bVar.f11926d.cancel();
            bVar.f11923a.j(bVar, true, true, (IOException) null);
        }
        this.H = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final jg.c0 i() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            jg.v r0 = r10.f11947a
            java.util.List<jg.s> r0 = r0.f10192c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            gf.o.p0(r0, r2)
            og.h r0 = new og.h
            jg.v r1 = r10.f11947a
            r0.<init>(r1)
            r2.add(r0)
            og.a r0 = new og.a
            jg.v r1 = r10.f11947a
            cb.d r1 = r1.F
            r0.<init>(r1)
            r2.add(r0)
            lg.a r0 = new lg.a
            jg.v r1 = r10.f11947a
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            ng.a r0 = ng.a.f11922a
            r2.add(r0)
            boolean r0 = r10.f11949c
            if (r0 != 0) goto L_0x0043
            jg.v r0 = r10.f11947a
            java.util.List<jg.s> r0 = r0.f10193d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            gf.o.p0(r0, r2)
        L_0x0043:
            og.b r0 = new og.b
            boolean r1 = r10.f11949c
            r0.<init>(r1)
            r2.add(r0)
            og.f r9 = new og.f
            r3 = 0
            r4 = 0
            jg.x r5 = r10.f11948b
            jg.v r0 = r10.f11947a
            int r6 = r0.R
            int r7 = r0.S
            int r8 = r0.T
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            jg.x r1 = r10.f11948b     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            jg.c0 r1 = r9.c(r1)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            boolean r2 = r10.L     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            if (r2 != 0) goto L_0x006f
            r10.k(r0)
            return r1
        L_0x006f:
            kg.b.d(r1)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            throw r1     // Catch:{ IOException -> 0x007d, all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            r2 = 0
            goto L_0x008f
        L_0x007d:
            r1 = move-exception
            java.io.IOException r1 = r10.k(r1)     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x008c
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r2)     // Catch:{ all -> 0x008d }
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008c:
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r1 = move-exception
            r2 = 1
        L_0x008f:
            if (r2 != 0) goto L_0x0094
            r10.k(r0)
        L_0x0094:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.d.i():jg.c0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0022 A[Catch:{ all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0026 A[Catch:{ all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[Catch:{ all -> 0x0018 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E j(ng.b r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            sf.j.f(r3, r0)
            ng.b r0 = r2.M
            boolean r3 = sf.j.a(r3, r0)
            if (r3 != 0) goto L_0x000e
            return r6
        L_0x000e:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L_0x001a
            boolean r1 = r2.I     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0020
            goto L_0x001a
        L_0x0018:
            r3 = move-exception
            goto L_0x0062
        L_0x001a:
            if (r5 == 0) goto L_0x0041
            boolean r1 = r2.J     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0041
        L_0x0020:
            if (r4 == 0) goto L_0x0024
            r2.I = r0     // Catch:{ all -> 0x0018 }
        L_0x0024:
            if (r5 == 0) goto L_0x0028
            r2.J = r0     // Catch:{ all -> 0x0018 }
        L_0x0028:
            boolean r4 = r2.I     // Catch:{ all -> 0x0018 }
            if (r4 != 0) goto L_0x0032
            boolean r5 = r2.J     // Catch:{ all -> 0x0018 }
            if (r5 != 0) goto L_0x0032
            r5 = r3
            goto L_0x0033
        L_0x0032:
            r5 = r0
        L_0x0033:
            if (r4 != 0) goto L_0x003e
            boolean r4 = r2.J     // Catch:{ all -> 0x0018 }
            if (r4 != 0) goto L_0x003e
            boolean r4 = r2.K     // Catch:{ all -> 0x0018 }
            if (r4 != 0) goto L_0x003e
            r0 = r3
        L_0x003e:
            r4 = r0
            r0 = r5
            goto L_0x0042
        L_0x0041:
            r4 = r0
        L_0x0042:
            ff.m r5 = ff.m.f8717a     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x005a
            r5 = 0
            r2.M = r5
            ng.e r5 = r2.F
            if (r5 != 0) goto L_0x004f
            goto L_0x005a
        L_0x004f:
            monitor-enter(r5)
            int r0 = r5.m     // Catch:{ all -> 0x0057 }
            int r0 = r0 + r3
            r5.m = r0     // Catch:{ all -> 0x0057 }
            monitor-exit(r5)
            goto L_0x005a
        L_0x0057:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            java.io.IOException r3 = r2.f(r6)
            return r3
        L_0x0061:
            return r6
        L_0x0062:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.d.j(ng.b, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException k(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.K) {
                this.K = false;
                if (!this.I && !this.J) {
                    z10 = true;
                }
            }
            m mVar = m.f8717a;
        }
        return z10 ? f(iOException) : iOException;
    }

    public final Socket l() {
        e eVar = this.F;
        j.c(eVar);
        byte[] bArr = kg.b.f10474a;
        ArrayList arrayList = eVar.f11970p;
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            } else if (j.a(((Reference) it.next()).get(), this)) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 != -1) {
            arrayList.remove(i8);
            this.F = null;
            if (arrayList.isEmpty()) {
                eVar.f11971q = System.nanoTime();
                i iVar = this.f11950d;
                iVar.getClass();
                byte[] bArr2 = kg.b.f10474a;
                boolean z11 = eVar.f11965j;
                mg.c cVar = iVar.f11980c;
                if (z11 || iVar.f11978a == 0) {
                    eVar.f11965j = true;
                    ConcurrentLinkedQueue<e> concurrentLinkedQueue = iVar.f11982e;
                    concurrentLinkedQueue.remove(eVar);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar.a();
                    }
                    z10 = true;
                } else {
                    cVar.c(iVar.f11981d, 0);
                }
                if (z10) {
                    Socket socket = eVar.f11959d;
                    j.c(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void s(e eVar) {
        a aVar;
        if (this.C.compareAndSet(false, true)) {
            h hVar = h.f14273a;
            this.D = h.f14273a.g();
            this.f11951e.getClass();
            l lVar = this.f11947a.f10190a;
            a aVar2 = new a(this, eVar);
            lVar.getClass();
            synchronized (lVar) {
                lVar.f10133b.add(aVar2);
                d dVar = aVar2.f11954c;
                if (!dVar.f11949c) {
                    String str = dVar.f11948b.f10219a.f10156d;
                    Iterator<a> it = lVar.f10134c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<a> it2 = lVar.f10133b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                }
                                aVar = it2.next();
                                if (j.a(aVar.f11954c.f11948b.f10219a.f10156d, str)) {
                                    break;
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (j.a(aVar.f11954c.f11948b.f10219a.f10156d, str)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar2.f11953b = aVar.f11953b;
                    }
                }
                m mVar = m.f8717a;
            }
            lVar.b();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }
}
