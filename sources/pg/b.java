package pg;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import jg.c0;
import jg.q;
import jg.r;
import jg.v;
import jg.w;
import jg.x;
import og.i;
import sf.j;
import wg.g;
import wg.g0;
import wg.h;
import wg.i0;
import wg.j0;
import wg.p;
import zf.n;

public final class b implements og.d {

    /* renamed from: a  reason: collision with root package name */
    public final v f12612a;

    /* renamed from: b  reason: collision with root package name */
    public final ng.e f12613b;

    /* renamed from: c  reason: collision with root package name */
    public final h f12614c;

    /* renamed from: d  reason: collision with root package name */
    public final g f12615d;

    /* renamed from: e  reason: collision with root package name */
    public int f12616e;

    /* renamed from: f  reason: collision with root package name */
    public final a f12617f;

    /* renamed from: g  reason: collision with root package name */
    public q f12618g;

    public abstract class a implements i0 {

        /* renamed from: a  reason: collision with root package name */
        public final p f12619a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12620b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f12621c;

        public a(b bVar) {
            j.f(bVar, "this$0");
            this.f12621c = bVar;
            this.f12619a = new p(bVar.f12614c.b());
        }

        public long a0(wg.e eVar, long j10) {
            b bVar = this.f12621c;
            j.f(eVar, "sink");
            try {
                return bVar.f12614c.a0(eVar, j10);
            } catch (IOException e10) {
                bVar.f12613b.k();
                c();
                throw e10;
            }
        }

        public final j0 b() {
            return this.f12619a;
        }

        public final void c() {
            b bVar = this.f12621c;
            int i8 = bVar.f12616e;
            if (i8 != 6) {
                if (i8 == 5) {
                    b.i(bVar, this.f12619a);
                    bVar.f12616e = 6;
                    return;
                }
                throw new IllegalStateException(j.k(Integer.valueOf(bVar.f12616e), "state: "));
            }
        }
    }

    /* renamed from: pg.b$b  reason: collision with other inner class name */
    public final class C0248b implements g0 {

        /* renamed from: a  reason: collision with root package name */
        public final p f12622a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12623b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f12624c;

        public C0248b(b bVar) {
            j.f(bVar, "this$0");
            this.f12624c = bVar;
            this.f12622a = new p(bVar.f12615d.b());
        }

        public final void B(wg.e eVar, long j10) {
            j.f(eVar, "source");
            if (!(!this.f12623b)) {
                throw new IllegalStateException("closed".toString());
            } else if (j10 != 0) {
                b bVar = this.f12624c;
                bVar.f12615d.W(j10);
                bVar.f12615d.M("\r\n");
                bVar.f12615d.B(eVar, j10);
                bVar.f12615d.M("\r\n");
            }
        }

        public final j0 b() {
            return this.f12622a;
        }

        public final synchronized void close() {
            if (!this.f12623b) {
                this.f12623b = true;
                this.f12624c.f12615d.M("0\r\n\r\n");
                b.i(this.f12624c, this.f12622a);
                this.f12624c.f12616e = 3;
            }
        }

        public final synchronized void flush() {
            if (!this.f12623b) {
                this.f12624c.f12615d.flush();
            }
        }
    }

    public final class c extends a {
        public boolean B = true;
        public final /* synthetic */ b C;

        /* renamed from: d  reason: collision with root package name */
        public final r f12625d;

        /* renamed from: e  reason: collision with root package name */
        public long f12626e = -1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, r rVar) {
            super(bVar);
            j.f(bVar, "this$0");
            j.f(rVar, "url");
            this.C = bVar;
            this.f12625d = rVar;
        }

        public final long a0(wg.e eVar, long j10) {
            j.f(eVar, "sink");
            boolean z10 = true;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(j.k(Long.valueOf(j10), "byteCount < 0: ").toString());
            } else if (!(!this.f12620b)) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.B) {
                return -1;
            } else {
                long j11 = this.f12626e;
                int i8 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                b bVar = this.C;
                if (i8 == 0 || j11 == -1) {
                    if (j11 != -1) {
                        bVar.f12614c.j0();
                    }
                    try {
                        this.f12626e = bVar.f12614c.C0();
                        String obj = n.Z0(bVar.f12614c.j0()).toString();
                        if (this.f12626e >= 0) {
                            if (obj.length() <= 0) {
                                z10 = false;
                            }
                            if (!z10 || zf.j.x0(obj, ";", false)) {
                                if (this.f12626e == 0) {
                                    this.B = false;
                                    bVar.f12618g = bVar.f12617f.a();
                                    v vVar = bVar.f12612a;
                                    j.c(vVar);
                                    q qVar = bVar.f12618g;
                                    j.c(qVar);
                                    og.e.b(vVar.F, this.f12625d, qVar);
                                    c();
                                }
                                if (!this.B) {
                                    return -1;
                                }
                            }
                        }
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f12626e + obj + '\"');
                    } catch (NumberFormatException e10) {
                        throw new ProtocolException(e10.getMessage());
                    }
                }
                long a02 = super.a0(eVar, Math.min(j10, this.f12626e));
                if (a02 != -1) {
                    this.f12626e -= a02;
                    return a02;
                }
                bVar.f12613b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            }
        }

        public final void close() {
            if (!this.f12620b) {
                if (this.B && !kg.b.h(this, TimeUnit.MILLISECONDS)) {
                    this.C.f12613b.k();
                    c();
                }
                this.f12620b = true;
            }
        }
    }

    public final class d extends a {

        /* renamed from: d  reason: collision with root package name */
        public long f12627d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ b f12628e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar, long j10) {
            super(bVar);
            j.f(bVar, "this$0");
            this.f12628e = bVar;
            this.f12627d = j10;
            if (j10 == 0) {
                c();
            }
        }

        public final long a0(wg.e eVar, long j10) {
            j.f(eVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(j.k(Long.valueOf(j10), "byteCount < 0: ").toString());
            } else if (!this.f12620b) {
                long j11 = this.f12627d;
                if (j11 == 0) {
                    return -1;
                }
                long a02 = super.a0(eVar, Math.min(j11, j10));
                if (a02 != -1) {
                    long j12 = this.f12627d - a02;
                    this.f12627d = j12;
                    if (j12 == 0) {
                        c();
                    }
                    return a02;
                }
                this.f12628e.f12613b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final void close() {
            if (!this.f12620b) {
                if (this.f12627d != 0 && !kg.b.h(this, TimeUnit.MILLISECONDS)) {
                    this.f12628e.f12613b.k();
                    c();
                }
                this.f12620b = true;
            }
        }
    }

    public final class e implements g0 {

        /* renamed from: a  reason: collision with root package name */
        public final p f12629a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12630b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f12631c;

        public e(b bVar) {
            j.f(bVar, "this$0");
            this.f12631c = bVar;
            this.f12629a = new p(bVar.f12615d.b());
        }

        public final void B(wg.e eVar, long j10) {
            j.f(eVar, "source");
            if (!this.f12630b) {
                kg.b.c(eVar.f16752b, 0, j10);
                this.f12631c.f12615d.B(eVar, j10);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public final j0 b() {
            return this.f12629a;
        }

        public final void close() {
            if (!this.f12630b) {
                this.f12630b = true;
                p pVar = this.f12629a;
                b bVar = this.f12631c;
                b.i(bVar, pVar);
                bVar.f12616e = 3;
            }
        }

        public final void flush() {
            if (!this.f12630b) {
                this.f12631c.f12615d.flush();
            }
        }
    }

    public final class f extends a {

        /* renamed from: d  reason: collision with root package name */
        public boolean f12632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(b bVar) {
            super(bVar);
            j.f(bVar, "this$0");
        }

        public final long a0(wg.e eVar, long j10) {
            j.f(eVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(j.k(Long.valueOf(j10), "byteCount < 0: ").toString());
            } else if (!(!this.f12620b)) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f12632d) {
                return -1;
            } else {
                long a02 = super.a0(eVar, j10);
                if (a02 != -1) {
                    return a02;
                }
                this.f12632d = true;
                c();
                return -1;
            }
        }

        public final void close() {
            if (!this.f12620b) {
                if (!this.f12632d) {
                    c();
                }
                this.f12620b = true;
            }
        }
    }

    public b(v vVar, ng.e eVar, h hVar, g gVar) {
        j.f(eVar, "connection");
        this.f12612a = vVar;
        this.f12613b = eVar;
        this.f12614c = hVar;
        this.f12615d = gVar;
        this.f12617f = new a(hVar);
    }

    public static final void i(b bVar, p pVar) {
        bVar.getClass();
        j0 j0Var = pVar.f16790e;
        j0.a aVar = j0.f16769d;
        j.f(aVar, "delegate");
        pVar.f16790e = aVar;
        j0Var.a();
        j0Var.b();
    }

    public final g0 a(x xVar, long j10) {
        boolean z10 = true;
        if (zf.j.s0("chunked", xVar.f10221c.a("Transfer-Encoding"), true)) {
            int i8 = this.f12616e;
            if (i8 != 1) {
                z10 = false;
            }
            if (z10) {
                this.f12616e = 2;
                return new C0248b(this);
            }
            throw new IllegalStateException(j.k(Integer.valueOf(i8), "state: ").toString());
        } else if (j10 != -1) {
            int i10 = this.f12616e;
            if (i10 != 1) {
                z10 = false;
            }
            if (z10) {
                this.f12616e = 2;
                return new e(this);
            }
            throw new IllegalStateException(j.k(Integer.valueOf(i10), "state: ").toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final i0 b(c0 c0Var) {
        if (!og.e.a(c0Var)) {
            return j(0);
        }
        boolean z10 = true;
        if (zf.j.s0("chunked", c0.d(c0Var, "Transfer-Encoding"), true)) {
            r rVar = c0Var.f10051a.f10219a;
            int i8 = this.f12616e;
            if (i8 != 4) {
                z10 = false;
            }
            if (z10) {
                this.f12616e = 5;
                return new c(this, rVar);
            }
            throw new IllegalStateException(j.k(Integer.valueOf(i8), "state: ").toString());
        }
        long k10 = kg.b.k(c0Var);
        if (k10 != -1) {
            return j(k10);
        }
        int i10 = this.f12616e;
        if (i10 != 4) {
            z10 = false;
        }
        if (z10) {
            this.f12616e = 5;
            this.f12613b.k();
            return new f(this);
        }
        throw new IllegalStateException(j.k(Integer.valueOf(i10), "state: ").toString());
    }

    public final void c() {
        this.f12615d.flush();
    }

    public final void cancel() {
        Socket socket = this.f12613b.f11958c;
        if (socket != null) {
            kg.b.e(socket);
        }
    }

    public final long d(c0 c0Var) {
        if (!og.e.a(c0Var)) {
            return 0;
        }
        if (zf.j.s0("chunked", c0.d(c0Var, "Transfer-Encoding"), true)) {
            return -1;
        }
        return kg.b.k(c0Var);
    }

    public final c0.a e(boolean z10) {
        a aVar = this.f12617f;
        int i8 = this.f12616e;
        boolean z11 = true;
        if (!(i8 == 1 || i8 == 3)) {
            z11 = false;
        }
        if (z11) {
            try {
                String G = aVar.f12610a.G(aVar.f12611b);
                aVar.f12611b -= (long) G.length();
                i a10 = i.a.a(G);
                int i10 = a10.f12379b;
                c0.a aVar2 = new c0.a();
                w wVar = a10.f12378a;
                j.f(wVar, "protocol");
                aVar2.f10057b = wVar;
                aVar2.f10058c = i10;
                String str = a10.f12380c;
                j.f(str, "message");
                aVar2.f10059d = str;
                aVar2.f10061f = aVar.a().d();
                if (z10 && i10 == 100) {
                    return null;
                }
                if (i10 == 100) {
                    this.f12616e = 3;
                    return aVar2;
                }
                this.f12616e = 4;
                return aVar2;
            } catch (EOFException e10) {
                throw new IOException(j.k(this.f12613b.f11957b.f10079a.f10023i.f(), "unexpected end of stream on "), e10);
            }
        } else {
            throw new IllegalStateException(j.k(Integer.valueOf(i8), "state: ").toString());
        }
    }

    public final ng.e f() {
        return this.f12613b;
    }

    public final void g() {
        this.f12615d.flush();
    }

    public final void h(x xVar) {
        Proxy.Type type = this.f12613b.f11957b.f10080b.type();
        j.e(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xVar.f10220b);
        sb2.append(' ');
        r rVar = xVar.f10219a;
        if (!rVar.f10162j && type == Proxy.Type.HTTP) {
            sb2.append(rVar);
        } else {
            String b10 = rVar.b();
            String d10 = rVar.d();
            if (d10 != null) {
                b10 = b10 + '?' + d10;
            }
            sb2.append(b10);
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        k(xVar.f10221c, sb3);
    }

    public final d j(long j10) {
        int i8 = this.f12616e;
        if (i8 == 4) {
            this.f12616e = 5;
            return new d(this, j10);
        }
        throw new IllegalStateException(j.k(Integer.valueOf(i8), "state: ").toString());
    }

    public final void k(q qVar, String str) {
        j.f(qVar, "headers");
        j.f(str, "requestLine");
        int i8 = this.f12616e;
        if (i8 == 0) {
            g gVar = this.f12615d;
            gVar.M(str).M("\r\n");
            int length = qVar.f10150a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                gVar.M(qVar.c(i10)).M(": ").M(qVar.e(i10)).M("\r\n");
            }
            gVar.M("\r\n");
            this.f12616e = 1;
            return;
        }
        throw new IllegalStateException(j.k(Integer.valueOf(i8), "state: ").toString());
    }
}
