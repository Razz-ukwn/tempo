package g0;

import d0.g;
import ff.e;
import s0.a0;
import s0.b1;
import s0.i;
import s0.s0;
import s0.x0;
import sf.j;

public final class u {
    public static final boolean a(s sVar, boolean z10, boolean z11) {
        j.f(sVar, "<this>");
        int ordinal = sVar.G.ordinal();
        r rVar = r.f8780d;
        if (ordinal == 0) {
            sVar.G = rVar;
            if (z11) {
                e.b(sVar);
            }
        } else if (ordinal == 1) {
            s c3 = v.c(sVar);
            if (!(c3 != null ? a(c3, z10, z11) : true)) {
                return false;
            }
            sVar.G = rVar;
            if (z11) {
                e.b(sVar);
            }
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                throw new e();
            }
        } else if (!z10) {
            return z10;
        } else {
            sVar.G = rVar;
            if (!z11) {
                return z10;
            }
            e.b(sVar);
            return z10;
        }
        return true;
    }

    public static final void b(s sVar) {
        x0.a(sVar, new t(sVar));
        int ordinal = sVar.G.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            sVar.G = r.f8777a;
        }
    }

    public static final boolean c(s sVar) {
        j.f(sVar, "<this>");
        if (sVar.f7177a.F) {
            sVar.C();
            int ordinal = sVar.G.ordinal();
            boolean z10 = true;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    s c3 = v.c(sVar);
                    if (c3 != null ? a(c3, false, true) : true) {
                        b(sVar);
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        e.b(sVar);
                    }
                    return z10;
                } else if (ordinal != 2) {
                    if (ordinal == 3) {
                        g.c c10 = i.c(sVar, 1024);
                        if (!(c10 instanceof s)) {
                            c10 = null;
                        }
                        s sVar2 = (s) c10;
                        if (sVar2 != null) {
                            return d(sVar2, sVar);
                        }
                        if (e(sVar)) {
                            b(sVar);
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            e.b(sVar);
                        }
                        return z10;
                    }
                    throw new e();
                }
            }
            e.b(sVar);
            return true;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final boolean d(s sVar, s sVar2) {
        g.c c3 = i.c(sVar2, 1024);
        s sVar3 = null;
        if (!(c3 instanceof s)) {
            c3 = null;
        }
        if (j.a((s) c3, sVar)) {
            int ordinal = sVar.G.ordinal();
            r rVar = r.f8778b;
            boolean z10 = true;
            if (ordinal == 0) {
                b(sVar2);
                sVar.G = rVar;
                e.b(sVar2);
                e.b(sVar);
                return true;
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        g.c c10 = i.c(sVar, 1024);
                        if (c10 instanceof s) {
                            sVar3 = c10;
                        }
                        s sVar4 = sVar3;
                        if (sVar4 == null && e(sVar)) {
                            sVar.G = r.f8777a;
                            e.b(sVar);
                            return d(sVar, sVar2);
                        } else if (sVar4 != null && d(sVar4, sVar)) {
                            boolean d10 = d(sVar, sVar2);
                            if (sVar.G != rVar) {
                                z10 = false;
                            }
                            if (z10) {
                                return d10;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new e();
                    }
                }
                return false;
            } else if (v.c(sVar) != null) {
                s c11 = v.c(sVar);
                if (c11 != null ? a(c11, false, true) : true) {
                    b(sVar2);
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return z10;
                }
                e.b(sVar2);
                return z10;
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
    }

    public static final boolean e(s sVar) {
        a0 a0Var;
        b1 b1Var;
        s0 s0Var = sVar.C;
        if (s0Var != null && (a0Var = s0Var.C) != null && (b1Var = a0Var.D) != null) {
            return b1Var.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
