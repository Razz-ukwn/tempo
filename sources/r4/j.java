package r4;

import ag.b1;
import android.os.SystemClock;
import android.util.Log;
import f3.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import m5.a;
import m5.d;
import p4.f;
import p4.g;
import p4.k;
import r4.h;
import r4.n;
import r4.o;
import y4.l;

public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public final c<?> B = new c<>();
    public final e C = new e();
    public com.bumptech.glide.h D;
    public f E;
    public com.bumptech.glide.j F;
    public q G;
    public int H;
    public int I;
    public m J;
    public p4.h K;
    public a<R> L;
    public int M;
    public int N;
    public int O;
    public long P;
    public boolean Q;
    public Object R;
    public Thread S;
    public f T;
    public f U;
    public Object V;
    public p4.a W;
    public com.bumptech.glide.load.data.d<?> X;
    public volatile h Y;
    public volatile boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final i<R> f13910a = new i<>();

    /* renamed from: a0  reason: collision with root package name */
    public volatile boolean f13911a0;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f13912b = new ArrayList();

    /* renamed from: b0  reason: collision with root package name */
    public boolean f13913b0;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f13914c = new d.a();

    /* renamed from: d  reason: collision with root package name */
    public final d f13915d;

    /* renamed from: e  reason: collision with root package name */
    public final c2.d<j<?>> f13916e;

    public interface a<R> {
    }

    public final class b<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final p4.a f13917a;

        public b(p4.a aVar) {
            this.f13917a = aVar;
        }
    }

    public static class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        public f f13919a;

        /* renamed from: b  reason: collision with root package name */
        public k<Z> f13920b;

        /* renamed from: c  reason: collision with root package name */
        public v<Z> f13921c;
    }

    public interface d {
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f13922a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f13923b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f13924c;

        public final boolean a() {
            return (this.f13924c || this.f13923b) && this.f13922a;
        }
    }

    public j(d dVar, a.c cVar) {
        this.f13915d = dVar;
        this.f13916e = cVar;
    }

    public final void a(f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, p4.a aVar, f fVar2) {
        this.T = fVar;
        this.V = obj;
        this.X = dVar;
        this.W = aVar;
        this.U = fVar2;
        boolean z10 = false;
        if (fVar != this.f13910a.a().get(0)) {
            z10 = true;
        }
        this.f13913b0 = z10;
        if (Thread.currentThread() != this.S) {
            this.O = 3;
            o oVar = (o) this.L;
            (oVar.J ? oVar.E : oVar.K ? oVar.F : oVar.D).execute(this);
            return;
        }
        g();
    }

    public final d.a b() {
        return this.f13914c;
    }

    public final void c() {
        this.O = 2;
        o oVar = (o) this.L;
        (oVar.J ? oVar.E : oVar.K ? oVar.F : oVar.D).execute(this);
    }

    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int ordinal = this.F.ordinal() - jVar.F.ordinal();
        return ordinal == 0 ? this.M - jVar.M : ordinal;
    }

    public final void d(f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, p4.a aVar) {
        dVar.b();
        s sVar = new s("Fetching data failed", Collections.singletonList(exc));
        Class<?> a10 = dVar.a();
        sVar.f13985b = fVar;
        sVar.f13986c = aVar;
        sVar.f13987d = a10;
        this.f13912b.add(sVar);
        if (Thread.currentThread() != this.S) {
            this.O = 2;
            o oVar = (o) this.L;
            (oVar.J ? oVar.E : oVar.K ? oVar.F : oVar.D).execute(this);
            return;
        }
        n();
    }

    public final <Data> w<R> e(com.bumptech.glide.load.data.d<?> dVar, Data data, p4.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i8 = l5.h.f10997b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w<R> f10 = f(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j(elapsedRealtimeNanos, "Decoded result " + f10, (String) null);
            }
            return f10;
        } finally {
            dVar.b();
        }
    }

    public final <Data> w<R> f(Data data, p4.a aVar) {
        Class<?> cls = data.getClass();
        i<R> iVar = this.f13910a;
        u<Data, ?, R> c3 = iVar.c(cls);
        p4.h hVar = this.K;
        boolean z10 = aVar == p4.a.f12449d || iVar.f13909r;
        g gVar = l.f17202i;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool == null || (bool.booleanValue() && !z10)) {
            hVar = new p4.h();
            l5.b bVar = this.K.f12464b;
            l5.b bVar2 = hVar.f12464b;
            bVar2.j(bVar);
            bVar2.put(gVar, Boolean.valueOf(z10));
        }
        p4.h hVar2 = hVar;
        com.bumptech.glide.load.data.e f10 = this.D.f4061b.f(data);
        try {
            return c3.a(this.H, this.I, hVar2, f10, new b(aVar));
        } finally {
            f10.b();
        }
    }

    public final void g() {
        w<R> wVar;
        c<?> cVar;
        boolean a10;
        if (Log.isLoggable("DecodeJob", 2)) {
            j(this.P, "Retrieved data", "data: " + this.V + ", cache key: " + this.T + ", fetcher: " + this.X);
        }
        v vVar = null;
        try {
            wVar = e(this.X, this.V, this.W);
        } catch (s e10) {
            f fVar = this.U;
            p4.a aVar = this.W;
            e10.f13985b = fVar;
            e10.f13986c = aVar;
            e10.f13987d = null;
            this.f13912b.add(e10);
            wVar = null;
        }
        if (wVar != null) {
            p4.a aVar2 = this.W;
            boolean z10 = this.f13913b0;
            if (wVar instanceof t) {
                ((t) wVar).b();
            }
            boolean z11 = false;
            if (this.B.f13921c != null) {
                vVar = (v) v.f13994e.b();
                b1.b(vVar);
                vVar.f13998d = false;
                vVar.f13997c = true;
                vVar.f13996b = wVar;
                wVar = vVar;
            }
            k(wVar, aVar2, z10);
            this.N = 5;
            try {
                cVar = this.B;
                if (cVar.f13921c != null) {
                    z11 = true;
                }
                if (z11) {
                    d dVar = this.f13915d;
                    p4.h hVar = this.K;
                    cVar.getClass();
                    ((n.c) dVar).a().c(cVar.f13919a, new g(cVar.f13920b, cVar.f13921c, hVar));
                    cVar.f13921c.e();
                }
                if (vVar != null) {
                    vVar.e();
                }
                e eVar = this.C;
                synchronized (eVar) {
                    eVar.f13923b = true;
                    a10 = eVar.a();
                }
                if (a10) {
                    m();
                }
            } catch (Throwable th) {
                if (vVar != null) {
                    vVar.e();
                }
                throw th;
            }
        } else {
            n();
        }
    }

    public final h h() {
        int c3 = q.g.c(this.N);
        i<R> iVar = this.f13910a;
        if (c3 == 1) {
            return new x(iVar, this);
        }
        if (c3 == 2) {
            return new e(iVar.a(), iVar, this);
        }
        if (c3 == 3) {
            return new b0(iVar, this);
        }
        if (c3 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(a2.b.c(this.N)));
    }

    public final int i(int i8) {
        if (i8 != 0) {
            int i10 = i8 - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return this.Q ? 6 : 4;
                    }
                    if (i10 == 3 || i10 == 5) {
                        return 6;
                    }
                    throw new IllegalArgumentException("Unrecognized stage: ".concat(a2.b.c(i8)));
                } else if (this.J.a()) {
                    return 3;
                } else {
                    return i(3);
                }
            } else if (this.J.b()) {
                return 2;
            } else {
                return i(2);
            }
        } else {
            throw null;
        }
    }

    public final void j(long j10, String str, String str2) {
        StringBuilder b10 = d.a.b(str, " in ");
        b10.append(l5.h.a(j10));
        b10.append(", load key: ");
        b10.append(this.G);
        b10.append(str2 != null ? ", ".concat(str2) : "");
        b10.append(", thread: ");
        b10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", b10.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r1 = (r4.n) r0.B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r9 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r9.f13979a == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r1.f13940g.a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r9 = r1.f13934a;
        r9.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r0.L == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r9 = r9.f8517b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        r9 = r9.f8516a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        r9 = (java.util.Map) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r0.equals(r9.get(r8)) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r9.remove(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r8 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r8.hasNext() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        r9 = (r4.o.d) r8.next();
        r9.f13968b.execute(new r4.o.b(r9.f13967a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r0.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(r4.w<R> r8, p4.a r9, boolean r10) {
        /*
            r7 = this;
            r7.p()
            r4.j$a<R> r0 = r7.L
            r4.o r0 = (r4.o) r0
            monitor-enter(r0)
            r0.M = r8     // Catch:{ all -> 0x00c9 }
            r0.N = r9     // Catch:{ all -> 0x00c9 }
            r0.U = r10     // Catch:{ all -> 0x00c9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            monitor-enter(r0)
            m5.d$a r8 = r0.f13959b     // Catch:{ all -> 0x00c6 }
            r8.a()     // Catch:{ all -> 0x00c6 }
            boolean r8 = r0.T     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x0024
            r4.w<?> r8 = r0.M     // Catch:{ all -> 0x00c6 }
            r8.c()     // Catch:{ all -> 0x00c6 }
            r0.g()     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00b2
        L_0x0024:
            r4.o$e r8 = r0.f13958a     // Catch:{ all -> 0x00c6 }
            java.util.List<r4.o$d> r8 = r8.f13969a     // Catch:{ all -> 0x00c6 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x00be
            boolean r8 = r0.O     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x00b6
            r4.o$c r8 = r0.f13962e     // Catch:{ all -> 0x00c6 }
            r4.w<?> r2 = r0.M     // Catch:{ all -> 0x00c6 }
            boolean r3 = r0.I     // Catch:{ all -> 0x00c6 }
            p4.f r5 = r0.H     // Catch:{ all -> 0x00c6 }
            r4.r$a r6 = r0.f13960c     // Catch:{ all -> 0x00c6 }
            r8.getClass()     // Catch:{ all -> 0x00c6 }
            r4.r r8 = new r4.r     // Catch:{ all -> 0x00c6 }
            r4 = 1
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c6 }
            r0.R = r8     // Catch:{ all -> 0x00c6 }
            r8 = 1
            r0.O = r8     // Catch:{ all -> 0x00c6 }
            r4.o$e r9 = r0.f13958a     // Catch:{ all -> 0x00c6 }
            r9.getClass()     // Catch:{ all -> 0x00c6 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            java.util.List<r4.o$d> r9 = r9.f13969a     // Catch:{ all -> 0x00c6 }
            r10.<init>(r9)     // Catch:{ all -> 0x00c6 }
            int r9 = r10.size()     // Catch:{ all -> 0x00c6 }
            int r9 = r9 + r8
            r0.e(r9)     // Catch:{ all -> 0x00c6 }
            p4.f r8 = r0.H     // Catch:{ all -> 0x00c6 }
            r4.r<?> r9 = r0.R     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            r4.p r1 = r0.B
            r4.n r1 = (r4.n) r1
            monitor-enter(r1)
            if (r9 == 0) goto L_0x0074
            boolean r2 = r9.f13979a     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0074
            r4.c r2 = r1.f13940g     // Catch:{ all -> 0x00b3 }
            r2.a(r8, r9)     // Catch:{ all -> 0x00b3 }
        L_0x0074:
            f3.v r9 = r1.f13934a     // Catch:{ all -> 0x00b3 }
            r9.getClass()     // Catch:{ all -> 0x00b3 }
            boolean r2 = r0.L     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0080
            java.lang.Object r9 = r9.f8517b     // Catch:{ all -> 0x00b3 }
            goto L_0x0082
        L_0x0080:
            java.lang.Object r9 = r9.f8516a     // Catch:{ all -> 0x00b3 }
        L_0x0082:
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x00b3 }
            java.lang.Object r2 = r9.get(r8)     // Catch:{ all -> 0x00b3 }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0091
            r9.remove(r8)     // Catch:{ all -> 0x00b3 }
        L_0x0091:
            monitor-exit(r1)
            java.util.Iterator r8 = r10.iterator()
        L_0x0096:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r8.next()
            r4.o$d r9 = (r4.o.d) r9
            java.util.concurrent.Executor r10 = r9.f13968b
            r4.o$b r1 = new r4.o$b
            h5.h r9 = r9.f13967a
            r1.<init>(r9)
            r10.execute(r1)
            goto L_0x0096
        L_0x00af:
            r0.d()
        L_0x00b2:
            return
        L_0x00b3:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        L_0x00b6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Already have resource"
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00be:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Received a resource without any callbacks to notify"
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            throw r8
        L_0x00c9:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.j.k(r4.w, p4.a, boolean):void");
    }

    public final void l() {
        boolean a10;
        p();
        s sVar = new s("Failed to load resource", new ArrayList(this.f13912b));
        o oVar = (o) this.L;
        synchronized (oVar) {
            oVar.P = sVar;
        }
        synchronized (oVar) {
            oVar.f13959b.a();
            if (oVar.T) {
                oVar.g();
            } else if (oVar.f13958a.f13969a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!oVar.Q) {
                oVar.Q = true;
                f fVar = oVar.H;
                o.e eVar = oVar.f13958a;
                eVar.getClass();
                ArrayList<o.d> arrayList = new ArrayList<>(eVar.f13969a);
                oVar.e(arrayList.size() + 1);
                n nVar = (n) oVar.B;
                synchronized (nVar) {
                    v vVar = nVar.f13934a;
                    vVar.getClass();
                    Map map = (Map) (oVar.L ? vVar.f8517b : vVar.f8516a);
                    if (oVar.equals(map.get(fVar))) {
                        map.remove(fVar);
                    }
                }
                for (o.d dVar : arrayList) {
                    dVar.f13968b.execute(new o.a(dVar.f13967a));
                }
                oVar.d();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        e eVar2 = this.C;
        synchronized (eVar2) {
            eVar2.f13924c = true;
            a10 = eVar2.a();
        }
        if (a10) {
            m();
        }
    }

    public final void m() {
        e eVar = this.C;
        synchronized (eVar) {
            eVar.f13923b = false;
            eVar.f13922a = false;
            eVar.f13924c = false;
        }
        c<?> cVar = this.B;
        cVar.f13919a = null;
        cVar.f13920b = null;
        cVar.f13921c = null;
        i<R> iVar = this.f13910a;
        iVar.f13895c = null;
        iVar.f13896d = null;
        iVar.f13905n = null;
        iVar.f13899g = null;
        iVar.f13903k = null;
        iVar.f13901i = null;
        iVar.f13906o = null;
        iVar.f13902j = null;
        iVar.f13907p = null;
        iVar.f13893a.clear();
        iVar.f13904l = false;
        iVar.f13894b.clear();
        iVar.m = false;
        this.Z = false;
        this.D = null;
        this.E = null;
        this.K = null;
        this.F = null;
        this.G = null;
        this.L = null;
        this.N = 0;
        this.Y = null;
        this.S = null;
        this.T = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.P = 0;
        this.f13911a0 = false;
        this.R = null;
        this.f13912b.clear();
        this.f13916e.a(this);
    }

    public final void n() {
        this.S = Thread.currentThread();
        int i8 = l5.h.f10997b;
        this.P = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.f13911a0 && this.Y != null && !(z10 = this.Y.b())) {
            this.N = i(this.N);
            this.Y = h();
            if (this.N == 4) {
                c();
                return;
            }
        }
        if ((this.N == 6 || this.f13911a0) && !z10) {
            l();
        }
    }

    public final void o() {
        int c3 = q.g.c(this.O);
        if (c3 == 0) {
            this.N = i(1);
            this.Y = h();
            n();
        } else if (c3 == 1) {
            n();
        } else if (c3 == 2) {
            g();
        } else {
            throw new IllegalStateException("Unrecognized run reason: ".concat(k.a(this.O)));
        }
    }

    public final void p() {
        Throwable th;
        this.f13914c.a();
        if (this.Z) {
            if (this.f13912b.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.f13912b;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.Z = true;
    }

    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.X;
        try {
            if (this.f13911a0) {
                l();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            o();
            if (dVar != null) {
                dVar.b();
            }
        } catch (d e10) {
            throw e10;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            throw th;
        }
    }
}
