package wg;

import androidx.fragment.app.z0;
import d2.f1;
import gf.q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import sf.j;
import wg.z;
import xg.b;
import xg.f;
import xg.k;

public final class k0 extends l {
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final z f16781e = z.a.a("/", false);

    /* renamed from: b  reason: collision with root package name */
    public final z f16782b;

    /* renamed from: c  reason: collision with root package name */
    public final l f16783c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<z, f> f16784d;

    static {
        String str = z.f16808b;
    }

    public k0(z zVar, u uVar, LinkedHashMap linkedHashMap) {
        this.f16782b = zVar;
        this.f16783c = uVar;
        this.f16784d = linkedHashMap;
    }

    public final g0 a(z zVar) {
        throw new IOException("zip file systems are read-only");
    }

    public final void b(z zVar, z zVar2) {
        j.f(zVar, "source");
        j.f(zVar2, "target");
        throw new IOException("zip file systems are read-only");
    }

    public final void c(z zVar) {
        throw new IOException("zip file systems are read-only");
    }

    public final void d(z zVar) {
        j.f(zVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    public final List<z> g(z zVar) {
        j.f(zVar, "dir");
        z zVar2 = f16781e;
        zVar2.getClass();
        f fVar = this.f16784d.get(k.b(zVar2, zVar, true));
        if (fVar != null) {
            return q.O0(fVar.f17087h);
        }
        throw new IOException("not a directory: " + zVar);
    }

    public final k i(z zVar) {
        c0 c0Var;
        j.f(zVar, "path");
        z zVar2 = f16781e;
        zVar2.getClass();
        f fVar = this.f16784d.get(k.b(zVar2, zVar, true));
        Throwable th = null;
        if (fVar == null) {
            return null;
        }
        boolean z10 = fVar.f17081b;
        k kVar = new k(!z10, z10, (z) null, z10 ? null : Long.valueOf(fVar.f17083d), (Long) null, fVar.f17085f, (Long) null);
        long j10 = fVar.f17086g;
        if (j10 == -1) {
            return kVar;
        }
        j j11 = this.f16783c.j(this.f16782b);
        try {
            c0Var = f1.j(j11.j(j10));
        } catch (Throwable th2) {
            Throwable th3 = th2;
            c0Var = null;
            th = th3;
        }
        if (j11 != null) {
            try {
                j11.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                } else {
                    z0.c(th, th4);
                }
            }
        }
        if (th == null) {
            j.c(c0Var);
            k F = f1.F(c0Var, kVar);
            j.c(F);
            return F;
        }
        throw th;
    }

    public final j j(z zVar) {
        j.f(zVar, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    public final g0 k(z zVar) {
        j.f(zVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    public final i0 l(z zVar) {
        c0 c0Var;
        j.f(zVar, "file");
        z zVar2 = f16781e;
        zVar2.getClass();
        f fVar = this.f16784d.get(k.b(zVar2, zVar, true));
        if (fVar != null) {
            j j10 = this.f16783c.j(this.f16782b);
            try {
                c0Var = f1.j(j10.j(fVar.f17086g));
                th = null;
            } catch (Throwable th) {
                th = th;
                c0Var = null;
            }
            if (j10 != null) {
                try {
                    j10.close();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    } else {
                        z0.c(th, th2);
                    }
                }
            }
            if (th == null) {
                j.c(c0Var);
                f1.F(c0Var, (k) null);
                int i8 = fVar.f17084e;
                long j11 = fVar.f17083d;
                if (i8 == 0) {
                    return new b(c0Var, j11, true);
                }
                return new b(new r(f1.j(new b(c0Var, fVar.f17082c, true)), new Inflater(true)), j11, false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + zVar);
    }
}
