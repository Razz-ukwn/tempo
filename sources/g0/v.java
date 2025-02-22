package g0;

import d0.g;
import ff.e;
import s0.i;
import sf.j;
import u.d;

public final class v {
    public static final s a(s sVar) {
        s a10;
        j.f(sVar, "<this>");
        int ordinal = sVar.G.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                g.c cVar = sVar.f7177a;
                if (cVar.F) {
                    d dVar = new d(new g.c[16]);
                    g.c cVar2 = cVar.f7181e;
                    if (cVar2 == null) {
                        i.a(dVar, cVar);
                    } else {
                        dVar.b(cVar2);
                    }
                    while (dVar.i()) {
                        g.c cVar3 = (g.c) dVar.k(dVar.f15640c - 1);
                        if ((cVar3.f7179c & 1024) == 0) {
                            i.a(dVar, cVar3);
                        } else {
                            while (true) {
                                if (cVar3 == null) {
                                    continue;
                                    break;
                                } else if ((cVar3.f7178b & 1024) == 0) {
                                    cVar3 = cVar3.f7181e;
                                } else if ((cVar3 instanceof s) && (a10 = a((s) cVar3)) != null) {
                                    return a10;
                                }
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Check failed.".toString());
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    return null;
                }
                throw new e();
            }
        }
        return sVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = ((s0.s0) com.google.android.gms.internal.p000firebaseauthapi.g.d(r2)).n0(r2, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final h0.d b(g0.s r2) {
        /*
            java.lang.String r0 = "<this>"
            sf.j.f(r2, r0)
            s0.s0 r2 = r2.C
            if (r2 == 0) goto L_0x0016
            q0.h r0 = com.google.android.gms.internal.p000firebaseauthapi.g.d(r2)
            r1 = 0
            s0.s0 r0 = (s0.s0) r0
            h0.d r2 = r0.n0(r2, r1)
            if (r2 != 0) goto L_0x0018
        L_0x0016:
            h0.d r2 = h0.d.f9073e
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.v.b(g0.s):h0.d");
    }

    public static final s c(s sVar) {
        j.f(sVar, "<this>");
        g.c cVar = sVar.f7177a;
        boolean z10 = cVar.F;
        if (!z10) {
            return null;
        }
        if (z10) {
            d dVar = new d(new g.c[16]);
            g.c cVar2 = cVar.f7181e;
            if (cVar2 == null) {
                i.a(dVar, cVar);
            } else {
                dVar.b(cVar2);
            }
            while (dVar.i()) {
                g.c cVar3 = (g.c) dVar.k(dVar.f15640c - 1);
                if ((cVar3.f7179c & 1024) == 0) {
                    i.a(dVar, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            continue;
                            break;
                        } else if ((cVar3.f7178b & 1024) == 0) {
                            cVar3 = cVar3.f7181e;
                        } else if (cVar3 instanceof s) {
                            s sVar2 = (s) cVar3;
                            int ordinal = sVar2.G.ordinal();
                            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                return sVar2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r3.C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean d(g0.s r3) {
        /*
            java.lang.String r0 = "<this>"
            sf.j.f(r3, r0)
            s0.s0 r3 = r3.C
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x0015
            s0.a0 r2 = r3.C
            if (r2 == 0) goto L_0x0015
            boolean r2 = r2.M
            if (r2 != r0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            if (r2 == 0) goto L_0x002a
            if (r3 == 0) goto L_0x0026
            s0.a0 r3 = r3.C
            if (r3 == 0) goto L_0x0026
            boolean r3 = r3.y()
            if (r3 != r0) goto L_0x0026
            r3 = r0
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            if (r3 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = r1
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.v.d(g0.s):boolean");
    }
}
