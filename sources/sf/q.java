package sf;

import androidx.activity.g;
import b3.x;
import sf.b;
import xf.a;
import xf.f;

public abstract class q extends b implements f {
    public q(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return c().equals(qVar.c()) && this.f14946d.equals(qVar.f14946d) && this.f14947e.equals(qVar.f14947e) && j.a(this.f14944b, qVar.f14944b);
        } else if (obj instanceof f) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return this.f14947e.hashCode() + x.a(this.f14946d, c().hashCode() * 31, 31);
    }

    public final String toString() {
        a a10 = a();
        return a10 != this ? a10.toString() : g.a(new StringBuilder("property "), this.f14946d, " (Kotlin reflection is not available)");
    }

    public q() {
        super(b.a.f14948a, (Class) null, (String) null, (String) null, false);
    }
}
