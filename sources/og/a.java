package og;

import cb.d;
import d2.f1;
import jg.b0;
import jg.c0;
import jg.d0;
import jg.k;
import jg.q;
import jg.r;
import jg.s;
import jg.t;
import jg.x;
import kg.b;
import sf.j;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public final k f12360a;

    public a(d dVar) {
        j.f(dVar, "cookieJar");
        this.f12360a = dVar;
    }

    public final c0 a(f fVar) {
        boolean z10;
        a aVar;
        d0 d0Var;
        f fVar2 = fVar;
        x xVar = fVar2.f12369e;
        xVar.getClass();
        x.a aVar2 = new x.a(xVar);
        b0 b0Var = xVar.f10222d;
        if (b0Var != null) {
            t b10 = b0Var.b();
            if (b10 != null) {
                aVar2.c("Content-Type", b10.f10173a);
            }
            long a10 = b0Var.a();
            if (a10 != -1) {
                aVar2.c("Content-Length", String.valueOf(a10));
                aVar2.f10227c.d("Transfer-Encoding");
            } else {
                aVar2.c("Transfer-Encoding", "chunked");
                aVar2.f10227c.d("Content-Length");
            }
        }
        q qVar = xVar.f10221c;
        String a11 = qVar.a("Host");
        int i8 = 0;
        r rVar = xVar.f10219a;
        if (a11 == null) {
            aVar2.c("Host", b.w(rVar, false));
        }
        if (qVar.a("Connection") == null) {
            aVar2.c("Connection", "Keep-Alive");
        }
        if (qVar.a("Accept-Encoding") == null && qVar.a("Range") == null) {
            aVar2.c("Accept-Encoding", "gzip");
            aVar = this;
            z10 = true;
        } else {
            aVar = this;
            z10 = false;
        }
        k kVar = aVar.f12360a;
        kVar.c(rVar);
        if (!true) {
            StringBuilder sb2 = new StringBuilder();
            gf.r rVar2 = gf.r.f8977a;
            while (rVar2.hasNext()) {
                Object next = rVar2.next();
                int i10 = i8 + 1;
                if (i8 >= 0) {
                    jg.j jVar = (jg.j) next;
                    if (i8 > 0) {
                        sb2.append("; ");
                    }
                    sb2.append(jVar.f10122a);
                    sb2.append('=');
                    sb2.append(jVar.f10123b);
                    i8 = i10;
                } else {
                    d.i0();
                    throw null;
                }
            }
            String sb3 = sb2.toString();
            j.e(sb3, "StringBuilder().apply(builderAction).toString()");
            aVar2.c("Cookie", sb3);
        }
        if (qVar.a("User-Agent") == null) {
            aVar2.c("User-Agent", "okhttp/4.10.0");
        }
        c0 c3 = fVar2.c(aVar2.a());
        q qVar2 = c3.B;
        e.b(kVar, rVar, qVar2);
        c0.a aVar3 = new c0.a(c3);
        aVar3.f10056a = xVar;
        if (z10 && zf.j.s0("gzip", c0.d(c3, "Content-Encoding"), true) && e.a(c3) && (d0Var = c3.C) != null) {
            wg.q qVar3 = new wg.q(d0Var.e());
            q.a d10 = qVar2.d();
            d10.d("Content-Encoding");
            d10.d("Content-Length");
            aVar3.f10061f = d10.c().d();
            aVar3.f10062g = new g(c0.d(c3, "Content-Type"), -1, f1.j(qVar3));
        }
        return aVar3.a();
    }
}
