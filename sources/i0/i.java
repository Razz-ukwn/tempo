package i0;

import androidx.databinding.a;
import j0.b;
import j0.c;
import j0.g;
import j0.h;
import j0.i;
import j0.u;
import s0.b0;
import sf.j;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final long f9373b = a.f(4278190080L);

    /* renamed from: c  reason: collision with root package name */
    public static final long f9374c = a.f(4294901760L);

    /* renamed from: d  reason: collision with root package name */
    public static final long f9375d = a.f(4278190335L);

    /* renamed from: e  reason: collision with root package name */
    public static final long f9376e = a.e(0.0f, 0.0f, 0.0f, 0.0f, g.f9690e);

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f9377f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f9378a;

    static {
        a.f(4282664004L);
        a.f(4287137928L);
        a.f(4291611852L);
        a.f(4294967295L);
        a.f(4278255360L);
        a.f(4294967040L);
        a.f(4278255615L);
        a.f(4294902015L);
    }

    public /* synthetic */ i(long j10) {
        this.f9378a = j10;
    }

    public static final long a(long j10, c cVar) {
        j0.i iVar;
        j.f(cVar, "colorSpace");
        c e10 = e(j10);
        if (j.a(cVar, e10)) {
            return j10;
        }
        j.f(e10, "$this$connect");
        u uVar = g.f9688c;
        if (e10 == uVar) {
            if (cVar == uVar) {
                iVar = j0.i.f9693e;
            } else if (cVar == g.f9691f) {
                iVar = j0.i.f9694f;
            }
            return iVar.a(g(j10), f(j10), d(j10), c(j10));
        } else if (e10 == g.f9691f && cVar == uVar) {
            iVar = j0.i.f9695g;
            return iVar.a(g(j10), f(j10), d(j10), c(j10));
        }
        if (e10 == cVar) {
            h hVar = j0.i.f9693e;
            iVar = new h(e10);
        } else {
            long j11 = b.f9677a;
            iVar = (!b.a(e10.f9683b, j11) || !b.a(cVar.f9683b, j11)) ? new j0.i(e10, cVar, 0) : new i.b((u) e10, (u) cVar, 0);
        }
        return iVar.a(g(j10), f(j10), d(j10), c(j10));
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final float c(long j10) {
        float f10;
        float f11;
        if ((63 & j10) == 0) {
            f11 = (float) cb.b.K((j10 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            f11 = (float) cb.b.K((j10 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return f11 / f10;
    }

    public static final float d(long j10) {
        return (63 & j10) == 0 ? ((float) cb.b.K((j10 >>> 32) & 255)) / 255.0f : j.b((short) ((int) ((j10 >>> 16) & 65535)));
    }

    public static final c e(long j10) {
        float[] fArr = g.f9686a;
        return g.f9692g[(int) (j10 & 63)];
    }

    public static final float f(long j10) {
        return (63 & j10) == 0 ? ((float) cb.b.K((j10 >>> 40) & 255)) / 255.0f : j.b((short) ((int) ((j10 >>> 32) & 65535)));
    }

    public static final float g(long j10) {
        return (63 & j10) == 0 ? ((float) cb.b.K((j10 >>> 48) & 255)) / 255.0f : j.b((short) ((int) ((j10 >>> 48) & 65535)));
    }

    public static String h(long j10) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(g(j10));
        sb2.append(", ");
        sb2.append(f(j10));
        sb2.append(", ");
        sb2.append(d(j10));
        sb2.append(", ");
        sb2.append(c(j10));
        sb2.append(", ");
        return b0.a(sb2, e(j10).f9682a, ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f9378a == ((i) obj).f9378a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9378a);
    }

    public final String toString() {
        return h(this.f9378a);
    }
}
