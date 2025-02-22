package og;

import androidx.appcompat.widget.a1;
import androidx.databinding.a;
import d2.f1;
import java.io.IOException;
import java.net.ProtocolException;
import jg.b0;
import jg.c0;
import jg.d0;
import jg.n;
import jg.s;
import jg.x;
import ng.b;
import ng.d;
import ng.e;
import sf.j;

public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12361a;

    public b(boolean z10) {
        this.f12361a = z10;
    }

    public final c0 a(f fVar) {
        boolean z10;
        boolean z11;
        c0.a aVar;
        Long l10;
        c0 c0Var;
        f fVar2 = fVar;
        ng.b bVar = fVar2.f12368d;
        j.c(bVar);
        d dVar = bVar.f11926d;
        n nVar = bVar.f11924b;
        d dVar2 = bVar.f11923a;
        x xVar = fVar2.f12369e;
        b0 b0Var = xVar.f10222d;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            nVar.getClass();
            j.f(dVar2, "call");
            dVar.h(xVar);
            boolean k10 = a.k(xVar.f10220b);
            e eVar = bVar.f11928f;
            if (!k10 || b0Var == null) {
                aVar = null;
                z11 = false;
                dVar2.j(bVar, true, false, null);
                z10 = true;
                l10 = null;
            } else {
                if (zf.j.s0("100-continue", xVar.f10221c.a("Expect"), true)) {
                    try {
                        dVar.g();
                        aVar = bVar.b(true);
                        nVar.getClass();
                        j.f(dVar2, "call");
                        z10 = false;
                    } catch (IOException e10) {
                        IOException iOException = e10;
                        nVar.getClass();
                        j.f(dVar2, "call");
                        bVar.c(iOException);
                        throw iOException;
                    }
                } else {
                    aVar = null;
                    z10 = true;
                }
                if (aVar == null) {
                    bVar.f11927e = false;
                    b0 b0Var2 = xVar.f10222d;
                    j.c(b0Var2);
                    long a10 = b0Var2.a();
                    nVar.getClass();
                    j.f(dVar2, "call");
                    wg.b0 i8 = f1.i(new b.a(bVar, dVar.a(xVar, a10), a10));
                    b0Var.c(i8);
                    i8.close();
                } else {
                    dVar2.j(bVar, true, false, null);
                    if (!(eVar.f11962g != null)) {
                        dVar.f().k();
                    }
                }
                l10 = null;
                z11 = false;
            }
            try {
                dVar.c();
                if (aVar == null) {
                    aVar = bVar.b(z11);
                    j.c(aVar);
                    if (z10) {
                        nVar.getClass();
                        j.f(dVar2, "call");
                        z10 = false;
                    }
                }
                aVar.f10056a = xVar;
                aVar.f10060e = eVar.f11960e;
                aVar.f10066k = currentTimeMillis;
                aVar.f10067l = System.currentTimeMillis();
                c0 a11 = aVar.a();
                int i10 = a11.f10054d;
                if (i10 == 100) {
                    c0.a b10 = bVar.b(false);
                    j.c(b10);
                    if (z10) {
                        nVar.getClass();
                        j.f(dVar2, "call");
                    }
                    b10.f10056a = xVar;
                    b10.f10060e = eVar.f11960e;
                    b10.f10066k = currentTimeMillis;
                    b10.f10067l = System.currentTimeMillis();
                    a11 = b10.a();
                    i10 = a11.f10054d;
                }
                if (!this.f12361a || i10 != 101) {
                    c0.a aVar2 = new c0.a(a11);
                    try {
                        String d10 = c0.d(a11, "Content-Type");
                        long d11 = dVar.d(a11);
                        aVar2.f10062g = new g(d10, d11, f1.j(new b.C0227b(bVar, dVar.b(a11), d11)));
                        c0Var = aVar2.a();
                    } catch (IOException e11) {
                        bVar.c(e11);
                        throw e11;
                    }
                } else {
                    c0.a aVar3 = new c0.a(a11);
                    aVar3.f10062g = kg.b.f10476c;
                    c0Var = aVar3.a();
                }
                if (zf.j.s0("close", c0Var.f10051a.f10221c.a("Connection"), true) || zf.j.s0("close", c0.d(c0Var, "Connection"), true)) {
                    dVar.f().k();
                }
                if (i10 == 204 || i10 == 205) {
                    d0 d0Var = c0Var.C;
                    if ((d0Var == null ? -1 : d0Var.c()) > 0) {
                        StringBuilder b11 = a1.b("HTTP ", i10, " had non-zero Content-Length: ");
                        if (d0Var != null) {
                            l10 = Long.valueOf(d0Var.c());
                        }
                        b11.append(l10);
                        throw new ProtocolException(b11.toString());
                    }
                }
                return c0Var;
            } catch (IOException e12) {
                IOException iOException2 = e12;
                bVar.c(iOException2);
                throw iOException2;
            }
        } catch (IOException e13) {
            nVar.getClass();
            j.f(dVar2, "call");
            bVar.c(e13);
            throw e13;
        }
    }
}
