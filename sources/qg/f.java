package qg;

import ff.m;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import qg.q;
import qg.r;
import sf.j;
import sf.t;
import wg.g;
import wg.h;
import wg.i;

public final class f implements Closeable {
    public static final v X;
    public int B;
    public boolean C;
    public final mg.d D;
    public final mg.c E;
    public final mg.c F;
    public final mg.c G;
    public final gc.b H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public final v N;
    public v O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public final Socket T;
    public final s U;
    public final c V;
    public final LinkedHashSet W;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13650a;

    /* renamed from: b  reason: collision with root package name */
    public final b f13651b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f13652c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final String f13653d;

    /* renamed from: e  reason: collision with root package name */
    public int f13654e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13655a = true;

        /* renamed from: b  reason: collision with root package name */
        public final mg.d f13656b;

        /* renamed from: c  reason: collision with root package name */
        public Socket f13657c;

        /* renamed from: d  reason: collision with root package name */
        public String f13658d;

        /* renamed from: e  reason: collision with root package name */
        public h f13659e;

        /* renamed from: f  reason: collision with root package name */
        public g f13660f;

        /* renamed from: g  reason: collision with root package name */
        public b f13661g;

        /* renamed from: h  reason: collision with root package name */
        public final gc.b f13662h;

        /* renamed from: i  reason: collision with root package name */
        public int f13663i;

        public a(mg.d dVar) {
            j.f(dVar, "taskRunner");
            this.f13656b = dVar;
            this.f13661g = b.f13664a;
            this.f13662h = u.f13751w;
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13664a = new a();

        public static final class a extends b {
            public final void b(r rVar) {
                j.f(rVar, "stream");
                rVar.c(b.REFUSED_STREAM, (IOException) null);
            }
        }

        public void a(f fVar, v vVar) {
            j.f(fVar, "connection");
            j.f(vVar, "settings");
        }

        public abstract void b(r rVar);
    }

    public final class c implements q.c, rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final q f13665a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f13666b;

        public c(f fVar, q qVar) {
            j.f(fVar, "this$0");
            this.f13666b = fVar;
            this.f13665a = qVar;
        }

        public final void a(int i8, List list) {
            f fVar = this.f13666b;
            fVar.getClass();
            synchronized (fVar) {
                if (fVar.W.contains(Integer.valueOf(i8))) {
                    fVar.u(i8, b.PROTOCOL_ERROR);
                    return;
                }
                fVar.W.add(Integer.valueOf(i8));
                mg.c cVar = fVar.F;
                cVar.c(new m(fVar.f13653d + '[' + i8 + "] onRequest", fVar, i8, list), 0);
            }
        }

        public final void b() {
        }

        public final void c(int i8, b bVar) {
            f fVar = this.f13666b;
            fVar.getClass();
            if (i8 != 0 && (i8 & 1) == 0) {
                fVar.F.c(new n(fVar.f13653d + '[' + i8 + "] onReset", fVar, i8, bVar), 0);
                return;
            }
            r j10 = fVar.j(i8);
            if (j10 != null) {
                synchronized (j10) {
                    if (j10.m == null) {
                        j10.m = bVar;
                        j10.notifyAll();
                    }
                }
            }
        }

        public final Object d() {
            b bVar;
            f fVar = this.f13666b;
            q qVar = this.f13665a;
            b bVar2 = b.INTERNAL_ERROR;
            e = null;
            try {
                qVar.d(this);
                while (qVar.c(false, this)) {
                }
                bVar = b.NO_ERROR;
                try {
                    fVar.c(bVar, b.CANCEL, (IOException) null);
                } catch (IOException e10) {
                    e = e10;
                    try {
                        b bVar3 = b.PROTOCOL_ERROR;
                        fVar.c(bVar3, bVar3, e);
                        kg.b.d(qVar);
                        return m.f8717a;
                    } catch (Throwable th) {
                        th = th;
                        fVar.c(bVar, bVar2, e);
                        kg.b.d(qVar);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                bVar = bVar2;
                b bVar32 = b.PROTOCOL_ERROR;
                fVar.c(bVar32, bVar32, e);
                kg.b.d(qVar);
                return m.f8717a;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                fVar.c(bVar, bVar2, e);
                kg.b.d(qVar);
                throw th;
            }
            kg.b.d(qVar);
            return m.f8717a;
        }

        public final void g(int i8, int i10, h hVar, boolean z10) {
            boolean z11;
            boolean z12;
            long j10;
            int i11 = i8;
            int i12 = i10;
            h hVar2 = hVar;
            j.f(hVar2, "source");
            this.f13666b.getClass();
            if (i11 != 0 && (i11 & 1) == 0) {
                f fVar = this.f13666b;
                fVar.getClass();
                wg.e eVar = new wg.e();
                long j11 = (long) i12;
                hVar2.z0(j11);
                hVar2.a0(eVar, j11);
                fVar.F.c(new k(fVar.f13653d + '[' + i11 + "] onData", fVar, i8, eVar, i10, z10), 0);
                return;
            }
            r e10 = this.f13666b.e(i11);
            if (e10 == null) {
                this.f13666b.u(i11, b.PROTOCOL_ERROR);
                long j12 = (long) i12;
                this.f13666b.q(j12);
                hVar2.skip(j12);
                return;
            }
            byte[] bArr = kg.b.f10474a;
            r.b bVar = e10.f13725i;
            long j13 = (long) i12;
            bVar.getClass();
            while (true) {
                if (j13 <= 0) {
                    break;
                }
                synchronized (bVar.B) {
                    z11 = bVar.f13735b;
                    z12 = bVar.f13737d.f16752b + j13 > bVar.f13734a;
                    m mVar = m.f8717a;
                }
                if (z12) {
                    hVar2.skip(j13);
                    bVar.B.e(b.FLOW_CONTROL_ERROR);
                    break;
                } else if (z11) {
                    hVar2.skip(j13);
                    break;
                } else {
                    long a02 = hVar2.a0(bVar.f13736c, j13);
                    if (a02 != -1) {
                        j13 -= a02;
                        r rVar = bVar.B;
                        synchronized (rVar) {
                            if (bVar.f13738e) {
                                wg.e eVar2 = bVar.f13736c;
                                j10 = eVar2.f16752b;
                                eVar2.j();
                            } else {
                                wg.e eVar3 = bVar.f13737d;
                                boolean z13 = eVar3.f16752b == 0;
                                eVar3.x(bVar.f13736c);
                                if (z13) {
                                    rVar.notifyAll();
                                }
                                j10 = 0;
                            }
                        }
                        if (j10 > 0) {
                            bVar.c(j10);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z10) {
                e10.i(kg.b.f10475b, true);
            }
        }

        public final void h(int i8, long j10) {
            if (i8 == 0) {
                f fVar = this.f13666b;
                synchronized (fVar) {
                    fVar.S += j10;
                    fVar.notifyAll();
                    m mVar = m.f8717a;
                }
                return;
            }
            r e10 = this.f13666b.e(i8);
            if (e10 != null) {
                synchronized (e10) {
                    e10.f13722f += j10;
                    if (j10 > 0) {
                        e10.notifyAll();
                    }
                    m mVar2 = m.f8717a;
                }
            }
        }

        public final void i(int i8, int i10, boolean z10) {
            if (z10) {
                f fVar = this.f13666b;
                synchronized (fVar) {
                    if (i8 == 1) {
                        fVar.J++;
                    } else if (i8 != 2) {
                        if (i8 == 3) {
                            fVar.notifyAll();
                        }
                        m mVar = m.f8717a;
                    } else {
                        fVar.L++;
                    }
                }
                return;
            }
            f fVar2 = this.f13666b;
            fVar2.E.c(new i(j.k(" ping", fVar2.f13653d), this.f13666b, i8, i10), 0);
        }

        public final void j(int i8, b bVar, i iVar) {
            int i10;
            Object[] array;
            j.f(iVar, "debugData");
            iVar.d();
            f fVar = this.f13666b;
            synchronized (fVar) {
                i10 = 0;
                array = fVar.f13652c.values().toArray(new r[0]);
                if (array != null) {
                    fVar.C = true;
                    m mVar = m.f8717a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
            r[] rVarArr = (r[]) array;
            int length = rVarArr.length;
            while (i10 < length) {
                r rVar = rVarArr[i10];
                i10++;
                if (rVar.f13717a > i8 && rVar.g()) {
                    b bVar2 = b.REFUSED_STREAM;
                    synchronized (rVar) {
                        if (rVar.m == null) {
                            rVar.m = bVar2;
                            rVar.notifyAll();
                        }
                    }
                    this.f13666b.j(rVar.f13717a);
                }
            }
        }

        public final void l(v vVar) {
            f fVar = this.f13666b;
            fVar.E.c(new j(j.k(" applyAndAckSettings", fVar.f13653d), this, vVar), 0);
        }

        public final void m() {
        }

        public final void n(int i8, List list, boolean z10) {
            this.f13666b.getClass();
            if (i8 != 0 && (i8 & 1) == 0) {
                f fVar = this.f13666b;
                fVar.getClass();
                fVar.F.c(new l(fVar.f13653d + '[' + i8 + "] onHeaders", fVar, i8, list, z10), 0);
                return;
            }
            f fVar2 = this.f13666b;
            synchronized (fVar2) {
                r e10 = fVar2.e(i8);
                if (e10 != null) {
                    m mVar = m.f8717a;
                    e10.i(kg.b.v(list), z10);
                } else if (!fVar2.C) {
                    if (i8 > fVar2.f13654e) {
                        if (i8 % 2 != fVar2.B % 2) {
                            r rVar = new r(i8, fVar2, false, z10, kg.b.v(list));
                            fVar2.f13654e = i8;
                            fVar2.f13652c.put(Integer.valueOf(i8), rVar);
                            mg.c f10 = fVar2.D.f();
                            f10.c(new h(fVar2.f13653d + '[' + i8 + "] onStream", fVar2, rVar), 0);
                        }
                    }
                }
            }
        }
    }

    public static final class d extends mg.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f13667e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f13668f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, f fVar, long j10) {
            super(str, true);
            this.f13667e = fVar;
            this.f13668f = j10;
        }

        public final long a() {
            f fVar;
            boolean z10;
            synchronized (this.f13667e) {
                fVar = this.f13667e;
                long j10 = fVar.J;
                long j11 = fVar.I;
                if (j10 < j11) {
                    z10 = true;
                } else {
                    fVar.I = j11 + 1;
                    z10 = false;
                }
            }
            if (z10) {
                fVar.d((IOException) null);
                return -1;
            }
            try {
                fVar.U.p(1, 0, false);
            } catch (IOException e10) {
                fVar.d(e10);
            }
            return this.f13668f;
        }
    }

    public static final class e extends mg.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f13669e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f13670f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b f13671g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, f fVar, int i8, b bVar) {
            super(str, true);
            this.f13669e = fVar;
            this.f13670f = i8;
            this.f13671g = bVar;
        }

        public final long a() {
            f fVar = this.f13669e;
            try {
                int i8 = this.f13670f;
                b bVar = this.f13671g;
                fVar.getClass();
                j.f(bVar, "statusCode");
                fVar.U.q(i8, bVar);
                return -1;
            } catch (IOException e10) {
                fVar.d(e10);
                return -1;
            }
        }
    }

    /* renamed from: qg.f$f  reason: collision with other inner class name */
    public static final class C0256f extends mg.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f13672e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f13673f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f13674g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0256f(String str, f fVar, int i8, long j10) {
            super(str, true);
            this.f13672e = fVar;
            this.f13673f = i8;
            this.f13674g = j10;
        }

        public final long a() {
            f fVar = this.f13672e;
            try {
                fVar.U.s(this.f13673f, this.f13674g);
                return -1;
            } catch (IOException e10) {
                fVar.d(e10);
                return -1;
            }
        }
    }

    static {
        v vVar = new v();
        vVar.c(7, 65535);
        vVar.c(5, 16384);
        X = vVar;
    }

    public f(a aVar) {
        boolean z10 = aVar.f13655a;
        this.f13650a = z10;
        this.f13651b = aVar.f13661g;
        String str = aVar.f13658d;
        if (str != null) {
            this.f13653d = str;
            this.B = z10 ? 3 : 2;
            mg.d dVar = aVar.f13656b;
            this.D = dVar;
            mg.c f10 = dVar.f();
            this.E = f10;
            this.F = dVar.f();
            this.G = dVar.f();
            this.H = aVar.f13662h;
            v vVar = new v();
            if (z10) {
                vVar.c(7, 16777216);
            }
            this.N = vVar;
            v vVar2 = X;
            this.O = vVar2;
            this.S = (long) vVar2.a();
            Socket socket = aVar.f13657c;
            if (socket != null) {
                this.T = socket;
                g gVar = aVar.f13660f;
                if (gVar != null) {
                    this.U = new s(gVar, z10);
                    h hVar = aVar.f13659e;
                    if (hVar != null) {
                        this.V = new c(this, new q(hVar, z10));
                        this.W = new LinkedHashSet();
                        int i8 = aVar.f13663i;
                        if (i8 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i8);
                            f10.c(new d(j.k(" ping", str), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    j.l("source");
                    throw null;
                }
                j.l("sink");
                throw null;
            }
            j.l("socket");
            throw null;
        }
        j.l("connectionName");
        throw null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|5|16|(2:18|(5:20|21|22|35|23))|25|26|27|28|29|31) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(qg.b r4, qg.b r5, java.io.IOException r6) {
        /*
            r3 = this;
            byte[] r0 = kg.b.f10474a
            r3.p(r4)     // Catch:{ IOException -> 0x0005 }
        L_0x0005:
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r3.f13652c     // Catch:{ all -> 0x005b }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x005b }
            r4 = r4 ^ 1
            r0 = 0
            if (r4 == 0) goto L_0x002d
            java.util.LinkedHashMap r4 = r3.f13652c     // Catch:{ all -> 0x005b }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x005b }
            qg.r[] r1 = new qg.r[r0]     // Catch:{ all -> 0x005b }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x0025
            java.util.LinkedHashMap r1 = r3.f13652c     // Catch:{ all -> 0x005b }
            r1.clear()     // Catch:{ all -> 0x005b }
            goto L_0x002e
        L_0x0025:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x005b }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r4.<init>(r5)     // Catch:{ all -> 0x005b }
            throw r4     // Catch:{ all -> 0x005b }
        L_0x002d:
            r4 = 0
        L_0x002e:
            ff.m r1 = ff.m.f8717a     // Catch:{ all -> 0x005b }
            monitor-exit(r3)
            qg.r[] r4 = (qg.r[]) r4
            if (r4 != 0) goto L_0x0036
            goto L_0x0041
        L_0x0036:
            int r1 = r4.length
        L_0x0037:
            if (r0 >= r1) goto L_0x0041
            r2 = r4[r0]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            int r0 = r0 + 1
            goto L_0x0037
        L_0x0041:
            qg.s r4 = r3.U     // Catch:{ IOException -> 0x0046 }
            r4.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            java.net.Socket r4 = r3.T     // Catch:{ IOException -> 0x004b }
            r4.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            mg.c r4 = r3.E
            r4.e()
            mg.c r4 = r3.F
            r4.e()
            mg.c r4 = r3.G
            r4.e()
            return
        L_0x005b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.f.c(qg.b, qg.b, java.io.IOException):void");
    }

    public final void close() {
        c(b.NO_ERROR, b.CANCEL, (IOException) null);
    }

    public final void d(IOException iOException) {
        b bVar = b.PROTOCOL_ERROR;
        c(bVar, bVar, iOException);
    }

    public final synchronized r e(int i8) {
        return (r) this.f13652c.get(Integer.valueOf(i8));
    }

    public final void flush() {
        s sVar = this.U;
        synchronized (sVar) {
            if (!sVar.f13744e) {
                sVar.f13740a.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final synchronized r j(int i8) {
        r rVar;
        rVar = (r) this.f13652c.remove(Integer.valueOf(i8));
        notifyAll();
        return rVar;
    }

    public final void p(b bVar) {
        synchronized (this.U) {
            t tVar = new t();
            synchronized (this) {
                if (!this.C) {
                    this.C = true;
                    int i8 = this.f13654e;
                    tVar.f14955a = i8;
                    m mVar = m.f8717a;
                    this.U.j(i8, bVar, kg.b.f10474a);
                }
            }
        }
    }

    public final synchronized void q(long j10) {
        long j11 = this.P + j10;
        this.P = j11;
        long j12 = j11 - this.Q;
        if (j12 >= ((long) (this.N.a() / 2))) {
            z(0, j12);
            this.Q += j12;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.U.f13743d);
        r6 = (long) r2;
        r8.R += r6;
        r4 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(int r9, boolean r10, wg.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            qg.s r12 = r8.U
            r12.d(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x006a
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.R     // Catch:{ InterruptedException -> 0x005b }
            long r6 = r8.S     // Catch:{ InterruptedException -> 0x005b }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.LinkedHashMap r2 = r8.f13652c     // Catch:{ InterruptedException -> 0x005b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005b }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x005b }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x005b }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005b }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005b }
            throw r9     // Catch:{ InterruptedException -> 0x005b }
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x0059 }
            int r2 = (int) r4     // Catch:{ all -> 0x0059 }
            qg.s r4 = r8.U     // Catch:{ all -> 0x0059 }
            int r4 = r4.f13743d     // Catch:{ all -> 0x0059 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0059 }
            long r4 = r8.R     // Catch:{ all -> 0x0059 }
            long r6 = (long) r2     // Catch:{ all -> 0x0059 }
            long r4 = r4 + r6
            r8.R = r4     // Catch:{ all -> 0x0059 }
            ff.m r4 = ff.m.f8717a     // Catch:{ all -> 0x0059 }
            monitor-exit(r8)
            long r12 = r12 - r6
            qg.s r4 = r8.U
            if (r10 == 0) goto L_0x0054
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = r3
        L_0x0055:
            r4.d(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0059:
            r9 = move-exception
            goto L_0x0068
        L_0x005b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0059 }
            r9.interrupt()     // Catch:{ all -> 0x0059 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0059 }
            r9.<init>()     // Catch:{ all -> 0x0059 }
            throw r9     // Catch:{ all -> 0x0059 }
        L_0x0068:
            monitor-exit(r8)
            throw r9
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.f.s(int, boolean, wg.e, long):void");
    }

    public final void u(int i8, b bVar) {
        this.E.c(new e(this.f13653d + '[' + i8 + "] writeSynReset", this, i8, bVar), 0);
    }

    public final void z(int i8, long j10) {
        this.E.c(new C0256f(this.f13653d + '[' + i8 + "] windowUpdate", this, i8, j10), 0);
    }
}
