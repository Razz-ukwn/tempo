package jg;

import java.io.Closeable;
import jg.c;
import jg.q;
import ng.b;
import sf.j;

public final class c0 implements Closeable {
    public final q B;
    public final d0 C;
    public final c0 D;
    public final c0 E;
    public final c0 F;
    public final long G;
    public final long H;
    public final b I;
    public c J;

    /* renamed from: a  reason: collision with root package name */
    public final x f10051a;

    /* renamed from: b  reason: collision with root package name */
    public final w f10052b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10053c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10054d;

    /* renamed from: e  reason: collision with root package name */
    public final p f10055e;

    public c0(x xVar, w wVar, String str, int i8, p pVar, q qVar, d0 d0Var, c0 c0Var, c0 c0Var2, c0 c0Var3, long j10, long j11, b bVar) {
        this.f10051a = xVar;
        this.f10052b = wVar;
        this.f10053c = str;
        this.f10054d = i8;
        this.f10055e = pVar;
        this.B = qVar;
        this.C = d0Var;
        this.D = c0Var;
        this.E = c0Var2;
        this.F = c0Var3;
        this.G = j10;
        this.H = j11;
        this.I = bVar;
    }

    public static String d(c0 c0Var, String str) {
        c0Var.getClass();
        String a10 = c0Var.B.a(str);
        if (a10 == null) {
            return null;
        }
        return a10;
    }

    public final c c() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = c.f10031n;
        c b10 = c.b.b(this.B);
        this.J = b10;
        return b10;
    }

    public final void close() {
        d0 d0Var = this.C;
        if (d0Var != null) {
            d0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final boolean e() {
        int i8 = this.f10054d;
        return 200 <= i8 && i8 < 300;
    }

    public final String toString() {
        return "Response{protocol=" + this.f10052b + ", code=" + this.f10054d + ", message=" + this.f10053c + ", url=" + this.f10051a.f10219a + '}';
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public x f10056a;

        /* renamed from: b  reason: collision with root package name */
        public w f10057b;

        /* renamed from: c  reason: collision with root package name */
        public int f10058c;

        /* renamed from: d  reason: collision with root package name */
        public String f10059d;

        /* renamed from: e  reason: collision with root package name */
        public p f10060e;

        /* renamed from: f  reason: collision with root package name */
        public q.a f10061f;

        /* renamed from: g  reason: collision with root package name */
        public d0 f10062g;

        /* renamed from: h  reason: collision with root package name */
        public c0 f10063h;

        /* renamed from: i  reason: collision with root package name */
        public c0 f10064i;

        /* renamed from: j  reason: collision with root package name */
        public c0 f10065j;

        /* renamed from: k  reason: collision with root package name */
        public long f10066k;

        /* renamed from: l  reason: collision with root package name */
        public long f10067l;
        public b m;

        public a() {
            this.f10058c = -1;
            this.f10061f = new q.a();
        }

        public static void b(String str, c0 c0Var) {
            if (c0Var != null) {
                boolean z10 = true;
                if (c0Var.C == null) {
                    if (c0Var.D == null) {
                        if (c0Var.E == null) {
                            if (c0Var.F != null) {
                                z10 = false;
                            }
                            if (!z10) {
                                throw new IllegalArgumentException(j.k(".priorResponse != null", str).toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(j.k(".cacheResponse != null", str).toString());
                    }
                    throw new IllegalArgumentException(j.k(".networkResponse != null", str).toString());
                }
                throw new IllegalArgumentException(j.k(".body != null", str).toString());
            }
        }

        public final c0 a() {
            int i8 = this.f10058c;
            if (i8 >= 0) {
                x xVar = this.f10056a;
                if (xVar != null) {
                    w wVar = this.f10057b;
                    if (wVar != null) {
                        String str = this.f10059d;
                        if (str != null) {
                            return new c0(xVar, wVar, str, i8, this.f10060e, this.f10061f.c(), this.f10062g, this.f10063h, this.f10064i, this.f10065j, this.f10066k, this.f10067l, this.m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(j.k(Integer.valueOf(i8), "code < 0: ").toString());
        }

        public a(c0 c0Var) {
            j.f(c0Var, "response");
            this.f10056a = c0Var.f10051a;
            this.f10057b = c0Var.f10052b;
            this.f10058c = c0Var.f10054d;
            this.f10059d = c0Var.f10053c;
            this.f10060e = c0Var.f10055e;
            this.f10061f = c0Var.B.d();
            this.f10062g = c0Var.C;
            this.f10063h = c0Var.D;
            this.f10064i = c0Var.E;
            this.f10065j = c0Var.F;
            this.f10066k = c0Var.G;
            this.f10067l = c0Var.H;
            this.m = c0Var.I;
        }
    }
}
