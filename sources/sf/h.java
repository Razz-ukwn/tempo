package sf;

import b3.x;
import xf.a;
import xf.c;

public class h extends b implements g, c {
    public final int C;
    public final int D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(int i8, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.C = i8;
        this.D = i10 >> 1;
    }

    public final a b() {
        w.f14958a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f14946d.equals(hVar.f14946d) && this.f14947e.equals(hVar.f14947e) && this.D == hVar.D && this.C == hVar.C && j.a(this.f14944b, hVar.f14944b) && j.a(c(), hVar.c());
        } else if (obj instanceof c) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public final int getArity() {
        return this.C;
    }

    public final int hashCode() {
        return this.f14947e.hashCode() + x.a(this.f14946d, c() == null ? 0 : c().hashCode() * 31, 31);
    }

    public final String toString() {
        a a10 = a();
        if (a10 != this) {
            return a10.toString();
        }
        String str = this.f14946d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : b2.c.a("function ", str, " (Kotlin reflection is not available)");
    }
}
