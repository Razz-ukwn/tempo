package ng;

import androidx.lifecycle.u;
import d2.f1;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import jg.c0;
import jg.f0;
import jg.n;
import jg.p;
import jg.q;
import jg.v;
import jg.w;
import jg.x;
import og.d;
import pg.b;
import qg.b;
import qg.f;
import qg.r;
import qg.s;
import rg.h;
import sf.j;
import wg.b0;
import wg.c0;
import wg.j0;

public final class e extends f.b {

    /* renamed from: b  reason: collision with root package name */
    public final f0 f11957b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f11958c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f11959d;

    /* renamed from: e  reason: collision with root package name */
    public p f11960e;

    /* renamed from: f  reason: collision with root package name */
    public w f11961f;

    /* renamed from: g  reason: collision with root package name */
    public f f11962g;

    /* renamed from: h  reason: collision with root package name */
    public c0 f11963h;

    /* renamed from: i  reason: collision with root package name */
    public b0 f11964i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11965j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11966k;

    /* renamed from: l  reason: collision with root package name */
    public int f11967l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public int f11968n;

    /* renamed from: o  reason: collision with root package name */
    public int f11969o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f11970p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public long f11971q = Long.MAX_VALUE;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11972a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f11972a = iArr;
        }
    }

    public e(i iVar, f0 f0Var) {
        j.f(iVar, "connectionPool");
        j.f(f0Var, "route");
        this.f11957b = f0Var;
    }

    public static void d(v vVar, f0 f0Var, IOException iOException) {
        j.f(vVar, "client");
        j.f(f0Var, "failedRoute");
        j.f(iOException, "failure");
        if (f0Var.f10080b.type() != Proxy.Type.DIRECT) {
            jg.a aVar = f0Var.f10079a;
            aVar.f10022h.connectFailed(aVar.f10023i.g(), f0Var.f10080b.address(), iOException);
        }
        u uVar = vVar.U;
        synchronized (uVar) {
            ((Set) uVar.f2324b).add(f0Var);
        }
    }

    public final synchronized void a(f fVar, qg.v vVar) {
        j.f(fVar, "connection");
        j.f(vVar, "settings");
        this.f11969o = (vVar.f13752a & 16) != 0 ? vVar.f13753b[4] : Integer.MAX_VALUE;
    }

    public final void b(r rVar) {
        j.f(rVar, "stream");
        rVar.c(b.REFUSED_STREAM, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0163 A[EDGE_INSN: B:83:0x0163->B:76:0x0163 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r17, int r18, int r19, boolean r20, ng.d r21, jg.n r22) {
        /*
            r16 = this;
            r7 = r16
            r8 = r21
            r9 = r22
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r0 = "call"
            sf.j.f(r8, r0)
            java.lang.String r0 = "eventListener"
            sf.j.f(r9, r0)
            jg.w r0 = r7.f11961f
            r12 = 1
            if (r0 != 0) goto L_0x001b
            r0 = r12
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x0171
            jg.f0 r0 = r7.f11957b
            jg.a r0 = r0.f10079a
            java.util.List<jg.i> r0 = r0.f10025k
            q7.q2 r13 = new q7.q2
            r13.<init>(r0)
            jg.f0 r1 = r7.f11957b
            jg.a r1 = r1.f10079a
            javax.net.ssl.SSLSocketFactory r2 = r1.f10017c
            if (r2 != 0) goto L_0x006c
            jg.i r1 = jg.i.f10110f
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005f
            jg.f0 r0 = r7.f11957b
            jg.a r0 = r0.f10079a
            jg.r r0 = r0.f10023i
            java.lang.String r0 = r0.f10156d
            rg.h r1 = rg.h.f14273a
            rg.h r1 = rg.h.f14273a
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L_0x004c
            goto L_0x0076
        L_0x004c:
            ng.j r1 = new ng.j
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = b2.c.a(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x005f:
            ng.j r0 = new ng.j
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x006c:
            java.util.List<jg.w> r0 = r1.f10024j
            jg.w r1 = jg.w.B
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0164
        L_0x0076:
            r14 = 0
            r15 = r14
        L_0x0078:
            jg.f0 r0 = r7.f11957b     // Catch:{ IOException -> 0x00f6 }
            jg.a r1 = r0.f10079a     // Catch:{ IOException -> 0x00f6 }
            javax.net.ssl.SSLSocketFactory r1 = r1.f10017c     // Catch:{ IOException -> 0x00f6 }
            if (r1 == 0) goto L_0x008c
            java.net.Proxy r0 = r0.f10080b     // Catch:{ IOException -> 0x00f6 }
            java.net.Proxy$Type r0 = r0.type()     // Catch:{ IOException -> 0x00f6 }
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x00f6 }
            if (r0 != r1) goto L_0x008c
            r0 = r12
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 == 0) goto L_0x00ad
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            r6 = r22
            r1.f(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f6 }
            java.net.Socket r0 = r7.f11958c     // Catch:{ IOException -> 0x00f6 }
            if (r0 != 0) goto L_0x00a3
            goto L_0x00c5
        L_0x00a3:
            r1 = r17
            r2 = r18
            goto L_0x00b4
        L_0x00a8:
            r1 = r17
            r2 = r18
            goto L_0x00f8
        L_0x00ad:
            r1 = r17
            r2 = r18
            r7.e(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00f4 }
        L_0x00b4:
            r7.g(r13, r8, r9)     // Catch:{ IOException -> 0x00f4 }
            jg.f0 r0 = r7.f11957b     // Catch:{ IOException -> 0x00f4 }
            java.net.InetSocketAddress r3 = r0.f10081c     // Catch:{ IOException -> 0x00f4 }
            java.net.Proxy r0 = r0.f10080b     // Catch:{ IOException -> 0x00f4 }
            jg.n$a r4 = jg.n.f10137a     // Catch:{ IOException -> 0x00f4 }
            sf.j.f(r3, r11)     // Catch:{ IOException -> 0x00f4 }
            sf.j.f(r0, r10)     // Catch:{ IOException -> 0x00f4 }
        L_0x00c5:
            jg.f0 r0 = r7.f11957b
            jg.a r1 = r0.f10079a
            javax.net.ssl.SSLSocketFactory r1 = r1.f10017c
            if (r1 == 0) goto L_0x00d8
            java.net.Proxy r0 = r0.f10080b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r12 = 0
        L_0x00d9:
            if (r12 == 0) goto L_0x00ed
            java.net.Socket r0 = r7.f11958c
            if (r0 == 0) goto L_0x00e0
            goto L_0x00ed
        L_0x00e0:
            ng.j r0 = new ng.j
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00ed:
            long r0 = java.lang.System.nanoTime()
            r7.f11971q = r0
            return
        L_0x00f4:
            r0 = move-exception
            goto L_0x00f8
        L_0x00f6:
            r0 = move-exception
            goto L_0x00a8
        L_0x00f8:
            java.net.Socket r3 = r7.f11959d
            if (r3 != 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            kg.b.e(r3)
        L_0x0100:
            java.net.Socket r3 = r7.f11958c
            if (r3 != 0) goto L_0x0105
            goto L_0x0108
        L_0x0105:
            kg.b.e(r3)
        L_0x0108:
            r7.f11959d = r14
            r7.f11958c = r14
            r7.f11963h = r14
            r7.f11964i = r14
            r7.f11960e = r14
            r7.f11961f = r14
            r7.f11962g = r14
            r7.f11969o = r12
            jg.f0 r3 = r7.f11957b
            java.net.InetSocketAddress r4 = r3.f10081c
            java.net.Proxy r3 = r3.f10080b
            sf.j.f(r4, r11)
            sf.j.f(r3, r10)
            if (r15 != 0) goto L_0x012c
            ng.j r15 = new ng.j
            r15.<init>(r0)
            goto L_0x0133
        L_0x012c:
            java.io.IOException r3 = r15.f11983a
            androidx.fragment.app.z0.c(r3, r0)
            r15.f11984b = r0
        L_0x0133:
            if (r20 == 0) goto L_0x0163
            r13.f13280c = r12
            boolean r3 = r13.f13279b
            if (r3 != 0) goto L_0x013c
            goto L_0x015e
        L_0x013c:
            boolean r3 = r0 instanceof java.net.ProtocolException
            if (r3 == 0) goto L_0x0141
            goto L_0x015e
        L_0x0141:
            boolean r3 = r0 instanceof java.io.InterruptedIOException
            if (r3 == 0) goto L_0x0146
            goto L_0x015e
        L_0x0146:
            boolean r3 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r3 == 0) goto L_0x0153
            java.lang.Throwable r3 = r0.getCause()
            boolean r3 = r3 instanceof java.security.cert.CertificateException
            if (r3 == 0) goto L_0x0153
            goto L_0x015e
        L_0x0153:
            boolean r3 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L_0x0158
            goto L_0x015e
        L_0x0158:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x015e
            r0 = r12
            goto L_0x015f
        L_0x015e:
            r0 = 0
        L_0x015f:
            if (r0 == 0) goto L_0x0163
            goto L_0x0078
        L_0x0163:
            throw r15
        L_0x0164:
            ng.j r0 = new ng.j
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0171:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.e.c(int, int, int, boolean, ng.d, jg.n):void");
    }

    public final void e(int i8, int i10, d dVar, n nVar) {
        Socket socket;
        f0 f0Var = this.f11957b;
        Proxy proxy = f0Var.f10080b;
        jg.a aVar = f0Var.f10079a;
        Proxy.Type type = proxy.type();
        int i11 = type == null ? -1 : a.f11972a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socket = aVar.f10016b.createSocket();
            j.c(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f11958c = socket;
        InetSocketAddress inetSocketAddress = this.f11957b.f10081c;
        nVar.getClass();
        j.f(dVar, "call");
        j.f(inetSocketAddress, "inetSocketAddress");
        socket.setSoTimeout(i10);
        try {
            h hVar = h.f14273a;
            h.f14273a.e(socket, this.f11957b.f10081c, i8);
            try {
                this.f11963h = f1.j(f1.I(socket));
                this.f11964i = f1.i(f1.H(socket));
            } catch (NullPointerException e10) {
                if (j.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(j.k(this.f11957b.f10081c, "Failed to connect to "));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i8, int i10, int i11, d dVar, n nVar) {
        int i12 = i10;
        x.a aVar = new x.a();
        f0 f0Var = this.f11957b;
        jg.r rVar = f0Var.f10079a.f10023i;
        j.f(rVar, "url");
        aVar.f10225a = rVar;
        aVar.d("CONNECT", (jg.b0) null);
        jg.a aVar2 = f0Var.f10079a;
        aVar.c("Host", kg.b.w(aVar2.f10023i, true));
        aVar.c("Proxy-Connection", "Keep-Alive");
        aVar.c("User-Agent", "okhttp/4.10.0");
        x a10 = aVar.a();
        c0.a aVar3 = new c0.a();
        aVar3.f10056a = a10;
        aVar3.f10057b = w.f10215c;
        aVar3.f10058c = 407;
        aVar3.f10059d = "Preemptive Authenticate";
        aVar3.f10062g = kg.b.f10476c;
        aVar3.f10066k = -1;
        aVar3.f10067l = -1;
        q.a aVar4 = aVar3.f10061f;
        aVar4.getClass();
        q.b.a("Proxy-Authenticate");
        q.b.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar4.d("Proxy-Authenticate");
        aVar4.b("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.f10020f.c(f0Var, aVar3.a());
        e(i8, i12, dVar, nVar);
        wg.c0 c0Var = this.f11963h;
        j.c(c0Var);
        b0 b0Var = this.f11964i;
        j.c(b0Var);
        pg.b bVar = new pg.b((v) null, this, c0Var, b0Var);
        j0 b10 = c0Var.b();
        long j10 = (long) i12;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b10.g(j10, timeUnit);
        b0Var.b().g((long) i11, timeUnit);
        bVar.k(a10.f10221c, "CONNECT " + kg.b.w(a10.f10219a, true) + " HTTP/1.1");
        bVar.c();
        c0.a e10 = bVar.e(false);
        j.c(e10);
        e10.f10056a = a10;
        jg.c0 a11 = e10.a();
        long k10 = kg.b.k(a11);
        if (k10 != -1) {
            b.d j11 = bVar.j(k10);
            kg.b.u(j11, Integer.MAX_VALUE, timeUnit);
            j11.close();
        }
        int i13 = a11.f10054d;
        if (i13 != 200) {
            if (i13 == 407) {
                aVar2.f10020f.c(f0Var, a11);
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(j.k(Integer.valueOf(i13), "Unexpected response code for CONNECT: "));
        } else if (!c0Var.f16741b.y() || !b0Var.f16736b.y()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(q7.q2 r10, ng.d r11, jg.n r12) {
        /*
            r9 = this;
            jg.f0 r0 = r9.f11957b
            jg.a r0 = r0.f10079a
            javax.net.ssl.SSLSocketFactory r1 = r0.f10017c
            jg.w r2 = jg.w.f10215c
            if (r1 != 0) goto L_0x0025
            java.util.List<jg.w> r10 = r0.f10024j
            jg.w r11 = jg.w.B
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x001e
            java.net.Socket r10 = r9.f11958c
            r9.f11959d = r10
            r9.f11961f = r11
            r9.l()
            return
        L_0x001e:
            java.net.Socket r10 = r9.f11958c
            r9.f11959d = r10
            r9.f11961f = r2
            return
        L_0x0025:
            r12.getClass()
            java.lang.String r12 = "call"
            sf.j.f(r11, r12)
            java.lang.String r11 = "\n              |Hostname "
            java.lang.String r12 = "Hostname "
            jg.f0 r0 = r9.f11957b
            jg.a r0 = r0.f10079a
            javax.net.ssl.SSLSocketFactory r1 = r0.f10017c
            r3 = 0
            sf.j.c(r1)     // Catch:{ all -> 0x0194 }
            java.net.Socket r4 = r9.f11958c     // Catch:{ all -> 0x0194 }
            jg.r r5 = r0.f10023i     // Catch:{ all -> 0x0194 }
            java.lang.String r6 = r5.f10156d     // Catch:{ all -> 0x0194 }
            int r5 = r5.f10157e     // Catch:{ all -> 0x0194 }
            r7 = 1
            java.net.Socket r1 = r1.createSocket(r4, r6, r5, r7)     // Catch:{ all -> 0x0194 }
            if (r1 == 0) goto L_0x018c
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x0194 }
            jg.i r10 = r10.a(r1)     // Catch:{ all -> 0x0189 }
            boolean r4 = r10.f10112b     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x0061
            rg.h r4 = rg.h.f14273a     // Catch:{ all -> 0x0189 }
            rg.h r4 = rg.h.f14273a     // Catch:{ all -> 0x0189 }
            jg.r r5 = r0.f10023i     // Catch:{ all -> 0x0189 }
            java.lang.String r5 = r5.f10156d     // Catch:{ all -> 0x0189 }
            java.util.List<jg.w> r6 = r0.f10024j     // Catch:{ all -> 0x0189 }
            r4.d(r1, r5, r6)     // Catch:{ all -> 0x0189 }
        L_0x0061:
            r1.startHandshake()     // Catch:{ all -> 0x0189 }
            javax.net.ssl.SSLSession r4 = r1.getSession()     // Catch:{ all -> 0x0189 }
            java.lang.String r5 = "sslSocketSession"
            sf.j.e(r4, r5)     // Catch:{ all -> 0x0189 }
            jg.p r5 = jg.p.a.a(r4)     // Catch:{ all -> 0x0189 }
            javax.net.ssl.HostnameVerifier r6 = r0.f10018d     // Catch:{ all -> 0x0189 }
            sf.j.c(r6)     // Catch:{ all -> 0x0189 }
            jg.r r8 = r0.f10023i     // Catch:{ all -> 0x0189 }
            java.lang.String r8 = r8.f10156d     // Catch:{ all -> 0x0189 }
            boolean r4 = r6.verify(r8, r4)     // Catch:{ all -> 0x0189 }
            if (r4 != 0) goto L_0x012b
            java.util.List r10 = r5.a()     // Catch:{ all -> 0x0189 }
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0189 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0189 }
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x0110
            r12 = 0
            java.lang.Object r10 = r10.get(r12)     // Catch:{ all -> 0x0189 }
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch:{ all -> 0x0189 }
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r2.<init>(r11)     // Catch:{ all -> 0x0189 }
            jg.r r11 = r0.f10023i     // Catch:{ all -> 0x0189 }
            java.lang.String r11 = r11.f10156d     // Catch:{ all -> 0x0189 }
            r2.append(r11)     // Catch:{ all -> 0x0189 }
            java.lang.String r11 = " not verified:\n              |    certificate: "
            r2.append(r11)     // Catch:{ all -> 0x0189 }
            jg.f r11 = jg.f.f10076c     // Catch:{ all -> 0x0189 }
            java.lang.String r11 = "certificate"
            sf.j.f(r10, r11)     // Catch:{ all -> 0x0189 }
            wg.i r11 = wg.i.f16760d     // Catch:{ all -> 0x0189 }
            java.security.PublicKey r11 = r10.getPublicKey()     // Catch:{ all -> 0x0189 }
            byte[] r11 = r11.getEncoded()     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "publicKey.encoded"
            sf.j.e(r11, r0)     // Catch:{ all -> 0x0189 }
            wg.i r11 = wg.i.a.c(r11)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "SHA-256"
            wg.i r11 = r11.c(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r11 = r11.a()     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "sha256/"
            java.lang.String r11 = sf.j.k(r11, r0)     // Catch:{ all -> 0x0189 }
            r2.append(r11)     // Catch:{ all -> 0x0189 }
            java.lang.String r11 = "\n              |    DN: "
            r2.append(r11)     // Catch:{ all -> 0x0189 }
            java.security.Principal r11 = r10.getSubjectDN()     // Catch:{ all -> 0x0189 }
            java.lang.String r11 = r11.getName()     // Catch:{ all -> 0x0189 }
            r2.append(r11)     // Catch:{ all -> 0x0189 }
            java.lang.String r11 = "\n              |    subjectAltNames: "
            r2.append(r11)     // Catch:{ all -> 0x0189 }
            r11 = 7
            java.util.List r11 = ug.c.a(r10, r11)     // Catch:{ all -> 0x0189 }
            r0 = 2
            java.util.List r10 = ug.c.a(r10, r0)     // Catch:{ all -> 0x0189 }
            java.util.Collection r11 = (java.util.Collection) r11     // Catch:{ all -> 0x0189 }
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch:{ all -> 0x0189 }
            java.util.ArrayList r10 = gf.q.G0(r10, r11)     // Catch:{ all -> 0x0189 }
            r2.append(r10)     // Catch:{ all -> 0x0189 }
            java.lang.String r10 = "\n              "
            r2.append(r10)     // Catch:{ all -> 0x0189 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x0189 }
            java.lang.String r10 = zf.f.n0(r10)     // Catch:{ all -> 0x0189 }
            r12.<init>(r10)     // Catch:{ all -> 0x0189 }
            throw r12     // Catch:{ all -> 0x0189 }
        L_0x0110:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r11.<init>(r12)     // Catch:{ all -> 0x0189 }
            jg.r r12 = r0.f10023i     // Catch:{ all -> 0x0189 }
            java.lang.String r12 = r12.f10156d     // Catch:{ all -> 0x0189 }
            r11.append(r12)     // Catch:{ all -> 0x0189 }
            java.lang.String r12 = " not verified (no certificates)"
            r11.append(r12)     // Catch:{ all -> 0x0189 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0189 }
            r10.<init>(r11)     // Catch:{ all -> 0x0189 }
            throw r10     // Catch:{ all -> 0x0189 }
        L_0x012b:
            jg.f r11 = r0.f10019e     // Catch:{ all -> 0x0189 }
            sf.j.c(r11)     // Catch:{ all -> 0x0189 }
            jg.p r12 = new jg.p     // Catch:{ all -> 0x0189 }
            jg.g0 r4 = r5.f10144a     // Catch:{ all -> 0x0189 }
            jg.h r6 = r5.f10145b     // Catch:{ all -> 0x0189 }
            java.util.List<java.security.cert.Certificate> r7 = r5.f10146c     // Catch:{ all -> 0x0189 }
            ng.f r8 = new ng.f     // Catch:{ all -> 0x0189 }
            r8.<init>(r11, r5, r0)     // Catch:{ all -> 0x0189 }
            r12.<init>(r4, r6, r7, r8)     // Catch:{ all -> 0x0189 }
            r9.f11960e = r12     // Catch:{ all -> 0x0189 }
            jg.r r12 = r0.f10023i     // Catch:{ all -> 0x0189 }
            java.lang.String r12 = r12.f10156d     // Catch:{ all -> 0x0189 }
            ng.g r0 = new ng.g     // Catch:{ all -> 0x0189 }
            r0.<init>(r9)     // Catch:{ all -> 0x0189 }
            r11.a(r12, r0)     // Catch:{ all -> 0x0189 }
            boolean r10 = r10.f10112b     // Catch:{ all -> 0x0189 }
            if (r10 == 0) goto L_0x015a
            rg.h r10 = rg.h.f14273a     // Catch:{ all -> 0x0189 }
            rg.h r10 = rg.h.f14273a     // Catch:{ all -> 0x0189 }
            java.lang.String r3 = r10.f(r1)     // Catch:{ all -> 0x0189 }
        L_0x015a:
            r9.f11959d = r1     // Catch:{ all -> 0x0189 }
            wg.c r10 = d2.f1.I(r1)     // Catch:{ all -> 0x0189 }
            wg.c0 r10 = d2.f1.j(r10)     // Catch:{ all -> 0x0189 }
            r9.f11963h = r10     // Catch:{ all -> 0x0189 }
            wg.b r10 = d2.f1.H(r1)     // Catch:{ all -> 0x0189 }
            wg.b0 r10 = d2.f1.i(r10)     // Catch:{ all -> 0x0189 }
            r9.f11964i = r10     // Catch:{ all -> 0x0189 }
            if (r3 == 0) goto L_0x0176
            jg.w r2 = jg.w.a.a(r3)     // Catch:{ all -> 0x0189 }
        L_0x0176:
            r9.f11961f = r2     // Catch:{ all -> 0x0189 }
            rg.h r10 = rg.h.f14273a
            rg.h r10 = rg.h.f14273a
            r10.a(r1)
            jg.w r10 = r9.f11961f
            jg.w r11 = jg.w.f10217e
            if (r10 != r11) goto L_0x0188
            r9.l()
        L_0x0188:
            return
        L_0x0189:
            r10 = move-exception
            r3 = r1
            goto L_0x0195
        L_0x018c:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ all -> 0x0194 }
            java.lang.String r11 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r10.<init>(r11)     // Catch:{ all -> 0x0194 }
            throw r10     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r10 = move-exception
        L_0x0195:
            if (r3 == 0) goto L_0x019e
            rg.h r11 = rg.h.f14273a
            rg.h r11 = rg.h.f14273a
            r11.a(r3)
        L_0x019e:
            if (r3 != 0) goto L_0x01a1
            goto L_0x01a4
        L_0x01a1:
            kg.b.e(r3)
        L_0x01a4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.e.g(q7.q2, ng.d, jg.n):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c8, code lost:
        if (((r10.isEmpty() ^ true) && ug.c.c(r3, (java.security.cert.X509Certificate) r10.get(0))) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0 A[SYNTHETIC, Splitter:B:55:0x00d0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(jg.a r9, java.util.List<jg.f0> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "address"
            sf.j.f(r9, r0)
            byte[] r0 = kg.b.f10474a
            java.util.ArrayList r0 = r8.f11970p
            int r0 = r0.size()
            int r1 = r8.f11969o
            r2 = 0
            if (r0 >= r1) goto L_0x00f1
            boolean r0 = r8.f11965j
            if (r0 == 0) goto L_0x0018
            goto L_0x00f1
        L_0x0018:
            jg.f0 r0 = r8.f11957b
            jg.a r1 = r0.f10079a
            boolean r1 = r1.a(r9)
            if (r1 != 0) goto L_0x0023
            return r2
        L_0x0023:
            jg.r r1 = r9.f10023i
            java.lang.String r3 = r1.f10156d
            jg.a r4 = r0.f10079a
            jg.r r5 = r4.f10023i
            java.lang.String r5 = r5.f10156d
            boolean r3 = sf.j.a(r3, r5)
            r5 = 1
            if (r3 == 0) goto L_0x0035
            return r5
        L_0x0035:
            qg.f r3 = r8.f11962g
            if (r3 != 0) goto L_0x003a
            return r2
        L_0x003a:
            if (r10 == 0) goto L_0x00f1
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r3 = r10 instanceof java.util.Collection
            if (r3 == 0) goto L_0x004c
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x004c
            goto L_0x0081
        L_0x004c:
            java.util.Iterator r10 = r10.iterator()
        L_0x0050:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0081
            java.lang.Object r3 = r10.next()
            jg.f0 r3 = (jg.f0) r3
            java.net.Proxy r6 = r3.f10080b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L_0x007c
            java.net.Proxy r6 = r0.f10080b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L_0x007c
            java.net.InetSocketAddress r6 = r0.f10081c
            java.net.InetSocketAddress r3 = r3.f10081c
            boolean r3 = sf.j.a(r6, r3)
            if (r3 == 0) goto L_0x007c
            r3 = r5
            goto L_0x007d
        L_0x007c:
            r3 = r2
        L_0x007d:
            if (r3 == 0) goto L_0x0050
            r10 = r5
            goto L_0x0082
        L_0x0081:
            r10 = r2
        L_0x0082:
            if (r10 != 0) goto L_0x0086
            goto L_0x00f1
        L_0x0086:
            ug.c r10 = ug.c.f16035a
            javax.net.ssl.HostnameVerifier r0 = r9.f10018d
            if (r0 == r10) goto L_0x008d
            return r2
        L_0x008d:
            byte[] r10 = kg.b.f10474a
            jg.r r10 = r4.f10023i
            int r0 = r10.f10157e
            java.lang.String r3 = r1.f10156d
            int r1 = r1.f10157e
            if (r1 == r0) goto L_0x009a
            goto L_0x00cc
        L_0x009a:
            java.lang.String r10 = r10.f10156d
            boolean r10 = sf.j.a(r3, r10)
            if (r10 == 0) goto L_0x00a3
            goto L_0x00ca
        L_0x00a3:
            boolean r10 = r8.f11966k
            if (r10 != 0) goto L_0x00cc
            jg.p r10 = r8.f11960e
            if (r10 == 0) goto L_0x00cc
            java.util.List r10 = r10.a()
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r10 = r10.get(r2)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = ug.c.c(r3, r10)
            if (r10 == 0) goto L_0x00c7
            r10 = r5
            goto L_0x00c8
        L_0x00c7:
            r10 = r2
        L_0x00c8:
            if (r10 == 0) goto L_0x00cc
        L_0x00ca:
            r10 = r5
            goto L_0x00cd
        L_0x00cc:
            r10 = r2
        L_0x00cd:
            if (r10 != 0) goto L_0x00d0
            return r2
        L_0x00d0:
            jg.f r9 = r9.f10019e     // Catch:{ SSLPeerUnverifiedException -> 0x00f1 }
            sf.j.c(r9)     // Catch:{ SSLPeerUnverifiedException -> 0x00f1 }
            jg.p r10 = r8.f11960e     // Catch:{ SSLPeerUnverifiedException -> 0x00f1 }
            sf.j.c(r10)     // Catch:{ SSLPeerUnverifiedException -> 0x00f1 }
            java.util.List r10 = r10.a()     // Catch:{ SSLPeerUnverifiedException -> 0x00f1 }
            java.lang.String r0 = "hostname"
            sf.j.f(r3, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00f1 }
            java.lang.String r0 = "peerCertificates"
            sf.j.f(r10, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00f1 }
            jg.g r0 = new jg.g     // Catch:{ SSLPeerUnverifiedException -> 0x00f1 }
            r0.<init>(r9, r10, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00f1 }
            r9.a(r3, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00f1 }
            return r5
        L_0x00f1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.e.h(jg.a, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = kg.b.f10474a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f11958c
            sf.j.c(r2)
            java.net.Socket r3 = r9.f11959d
            sf.j.c(r3)
            wg.c0 r4 = r9.f11963h
            sf.j.c(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x002f
            goto L_0x007d
        L_0x002f:
            qg.f r2 = r9.f11962g
            r6 = 1
            if (r2 == 0) goto L_0x0051
            monitor-enter(r2)
            boolean r10 = r2.C     // Catch:{ all -> 0x004e }
            if (r10 == 0) goto L_0x003b
            monitor-exit(r2)
            goto L_0x004d
        L_0x003b:
            long r3 = r2.L     // Catch:{ all -> 0x004e }
            long r7 = r2.K     // Catch:{ all -> 0x004e }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004b
            long r3 = r2.M     // Catch:{ all -> 0x004e }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x004b
            monitor-exit(r2)
            goto L_0x004d
        L_0x004b:
            monitor-exit(r2)
            r5 = r6
        L_0x004d:
            return r5
        L_0x004e:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0051:
            monitor-enter(r9)
            long r7 = r9.f11971q     // Catch:{ all -> 0x007a }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0079
            if (r10 == 0) goto L_0x0079
            int r10 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x0072 }
            boolean r0 = r4.y()     // Catch:{ all -> 0x0072 }
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            r5 = r0
            goto L_0x0078
        L_0x0072:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
        L_0x0077:
            r5 = r6
        L_0x0078:
            return r5
        L_0x0079:
            return r6
        L_0x007a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x007d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.e.i(boolean):boolean");
    }

    public final d j(v vVar, og.f fVar) {
        Socket socket = this.f11959d;
        j.c(socket);
        wg.c0 c0Var = this.f11963h;
        j.c(c0Var);
        b0 b0Var = this.f11964i;
        j.c(b0Var);
        f fVar2 = this.f11962g;
        if (fVar2 != null) {
            return new qg.p(vVar, this, fVar, fVar2);
        }
        int i8 = fVar.f12371g;
        socket.setSoTimeout(i8);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0Var.b().g((long) i8, timeUnit);
        b0Var.b().g((long) fVar.f12372h, timeUnit);
        return new pg.b(vVar, this, c0Var, b0Var);
    }

    public final synchronized void k() {
        this.f11965j = true;
    }

    public final void l() {
        String str;
        Socket socket = this.f11959d;
        j.c(socket);
        wg.c0 c0Var = this.f11963h;
        j.c(c0Var);
        b0 b0Var = this.f11964i;
        j.c(b0Var);
        socket.setSoTimeout(0);
        mg.d dVar = mg.d.f11492i;
        f.a aVar = new f.a(dVar);
        String str2 = this.f11957b.f10079a.f10023i.f10156d;
        j.f(str2, "peerName");
        aVar.f13657c = socket;
        if (aVar.f13655a) {
            str = kg.b.f10480g + ' ' + str2;
        } else {
            str = j.k(str2, "MockWebServer ");
        }
        j.f(str, "<set-?>");
        aVar.f13658d = str;
        aVar.f13659e = c0Var;
        aVar.f13660f = b0Var;
        aVar.f13661g = this;
        aVar.f13663i = 0;
        f fVar = new f(aVar);
        this.f11962g = fVar;
        qg.v vVar = f.X;
        this.f11969o = (vVar.f13752a & 16) != 0 ? vVar.f13753b[4] : Integer.MAX_VALUE;
        s sVar = fVar.U;
        synchronized (sVar) {
            if (sVar.f13744e) {
                throw new IOException("closed");
            } else if (sVar.f13741b) {
                Logger logger = s.C;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(kg.b.i(j.k(qg.e.f13646b.e(), ">> CONNECTION "), new Object[0]));
                }
                sVar.f13740a.O(qg.e.f13646b);
                sVar.f13740a.flush();
            }
        }
        s sVar2 = fVar.U;
        qg.v vVar2 = fVar.N;
        synchronized (sVar2) {
            j.f(vVar2, "settings");
            if (!sVar2.f13744e) {
                sVar2.e(0, Integer.bitCount(vVar2.f13752a) * 6, 4, 0);
                int i8 = 0;
                while (i8 < 10) {
                    int i10 = i8 + 1;
                    boolean z10 = true;
                    if (((1 << i8) & vVar2.f13752a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        sVar2.f13740a.writeShort(i8 != 4 ? i8 != 7 ? i8 : 4 : 3);
                        sVar2.f13740a.writeInt(vVar2.f13753b[i8]);
                    }
                    i8 = i10;
                }
                sVar2.f13740a.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a10 = fVar.N.a();
        if (a10 != 65535) {
            fVar.U.s(0, (long) (a10 - 65535));
        }
        dVar.f().c(new mg.b(fVar.f13653d, fVar.V), 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        f0 f0Var = this.f11957b;
        sb2.append(f0Var.f10079a.f10023i.f10156d);
        sb2.append(':');
        sb2.append(f0Var.f10079a.f10023i.f10157e);
        sb2.append(", proxy=");
        sb2.append(f0Var.f10080b);
        sb2.append(" hostAddress=");
        sb2.append(f0Var.f10081c);
        sb2.append(" cipherSuite=");
        p pVar = this.f11960e;
        Object obj2 = "none";
        if (!(pVar == null || (obj = pVar.f10145b) == null)) {
            obj2 = obj;
        }
        sb2.append(obj2);
        sb2.append(" protocol=");
        sb2.append(this.f11961f);
        sb2.append('}');
        return sb2.toString();
    }
}
