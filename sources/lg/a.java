package lg;

import jg.c0;
import jg.d0;
import jg.n;
import jg.q;
import jg.s;
import jg.w;
import jg.x;
import kg.b;
import ng.d;
import og.f;
import zf.j;

public final class a implements s {

    /* renamed from: lg.a$a  reason: collision with other inner class name */
    public static final class C0210a {
        public static final c0 a(c0 c0Var) {
            if ((c0Var == null ? null : c0Var.C) == null) {
                return c0Var;
            }
            c0Var.getClass();
            c0.a aVar = new c0.a(c0Var);
            aVar.f10062g = null;
            return aVar.a();
        }

        public static boolean b(String str) {
            return !j.s0("Connection", str, true) && !j.s0("Keep-Alive", str, true) && !j.s0("Proxy-Authenticate", str, true) && !j.s0("Proxy-Authorization", str, true) && !j.s0("TE", str, true) && !j.s0("Trailers", str, true) && !j.s0("Transfer-Encoding", str, true) && !j.s0("Upgrade", str, true);
        }
    }

    static {
        new C0210a();
    }

    public final c0 a(f fVar) {
        boolean z10;
        boolean z11;
        q qVar;
        boolean z12;
        f fVar2 = fVar;
        System.currentTimeMillis();
        x xVar = fVar2.f12369e;
        sf.j.f(xVar, "request");
        b bVar = new b(xVar, (c0) null);
        if (xVar.a().f10042j) {
            bVar = new b((x) null, (c0) null);
        }
        d dVar = fVar2.f12365a;
        d dVar2 = dVar instanceof d ? dVar : null;
        Object obj = dVar2 == null ? null : dVar2.f11951e;
        if (obj == null) {
            obj = n.f10137a;
        }
        x xVar2 = bVar.f11114a;
        c0 c0Var = bVar.f11115b;
        if (xVar2 == null && c0Var == null) {
            c0.a aVar = new c0.a();
            sf.j.f(xVar, "request");
            aVar.f10056a = xVar;
            aVar.f10057b = w.f10215c;
            aVar.f10058c = 504;
            aVar.f10059d = "Unsatisfiable Request (only-if-cached)";
            aVar.f10062g = b.f10476c;
            aVar.f10066k = -1;
            aVar.f10067l = System.currentTimeMillis();
            c0 a10 = aVar.a();
            obj.getClass();
            sf.j.f(dVar, "call");
            return a10;
        } else if (xVar2 == null) {
            sf.j.c(c0Var);
            c0.a aVar2 = new c0.a(c0Var);
            c0 a11 = C0210a.a(c0Var);
            c0.a.b("cacheResponse", a11);
            aVar2.f10064i = a11;
            c0 a12 = aVar2.a();
            obj.getClass();
            sf.j.f(dVar, "call");
            return a12;
        } else {
            if (c0Var != null) {
                obj.getClass();
                sf.j.f(dVar, "call");
            }
            try {
                c0 c3 = fVar2.c(xVar2);
                if (c0Var != null) {
                    th = true;
                    if (c3.f10054d != 304) {
                        z10 = false;
                    }
                    if (z10) {
                        c0.a aVar3 = new c0.a(c0Var);
                        q.a aVar4 = new q.a();
                        q qVar2 = c0Var.B;
                        int length = qVar2.f10150a.length / 2;
                        int i8 = 0;
                        while (true) {
                            qVar = c3.B;
                            if (i8 >= length) {
                                break;
                            }
                            int i10 = i8 + 1;
                            String c10 = qVar2.c(i8);
                            String e10 = qVar2.e(i8);
                            if (j.s0("Warning", c10, z11)) {
                                z12 = false;
                                if (j.x0(e10, "1", false)) {
                                    i8 = i10;
                                    z11 = true;
                                }
                            } else {
                                z12 = false;
                            }
                            if (((j.s0("Content-Length", c10, true) || j.s0("Content-Encoding", c10, true) || j.s0("Content-Type", c10, true)) ? true : z12) || !C0210a.b(c10) || qVar.a(c10) == null) {
                                aVar4.b(c10, e10);
                                i8 = i10;
                                z11 = true;
                            } else {
                                i8 = i10;
                                z11 = true;
                            }
                        }
                        int length2 = qVar.f10150a.length / 2;
                        int i11 = 0;
                        while (i11 < length2) {
                            int i12 = i11 + 1;
                            String c11 = qVar.c(i11);
                            if (!(j.s0("Content-Length", c11, true) || j.s0("Content-Encoding", c11, true) || j.s0("Content-Type", c11, true)) && C0210a.b(c11)) {
                                aVar4.b(c11, qVar.e(i11));
                            }
                            i11 = i12;
                        }
                        aVar3.f10061f = aVar4.c().d();
                        aVar3.f10066k = c3.G;
                        aVar3.f10067l = c3.H;
                        c0 a13 = C0210a.a(c0Var);
                        c0.a.b("cacheResponse", a13);
                        aVar3.f10064i = a13;
                        c0 a14 = C0210a.a(c3);
                        c0.a.b("networkResponse", a14);
                        aVar3.f10063h = a14;
                        aVar3.a();
                        d0 d0Var = c3.C;
                        sf.j.c(d0Var);
                        d0Var.close();
                        sf.j.c((Object) null);
                        throw null;
                    }
                    d0 d0Var2 = c0Var.C;
                    if (d0Var2 != null) {
                        b.d(d0Var2);
                    }
                }
                c0.a aVar5 = new c0.a(c3);
                c0 a15 = C0210a.a(c0Var);
                c0.a.b("cacheResponse", a15);
                aVar5.f10064i = a15;
                c0 a16 = C0210a.a(c3);
                c0.a.b("networkResponse", a16);
                aVar5.f10063h = a16;
                return aVar5.a();
            } finally {
                boolean z13 = th;
            }
        }
    }
}
