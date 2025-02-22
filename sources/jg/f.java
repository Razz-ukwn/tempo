package jg;

import androidx.fragment.app.z;
import gf.q;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sf.j;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f10076c = new f(q.R0(new ArrayList()), (z) null);

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f10077a;

    /* renamed from: b  reason: collision with root package name */
    public final z f10078b;

    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            if (!j.a((Object) null, (Object) null)) {
                return false;
            }
            aVar.getClass();
            if (!j.a((Object) null, (Object) null)) {
                return false;
            }
            aVar.getClass();
            return j.a((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public f(Set<a> set, z zVar) {
        j.f(set, "pins");
        this.f10077a = set;
        this.f10078b = zVar;
    }

    public final void a(String str, rf.a<? extends List<? extends X509Certificate>> aVar) {
        j.f(str, "hostname");
        Iterator<T> it = this.f10077a.iterator();
        if (it.hasNext()) {
            ((a) it.next()).getClass();
            boolean unused = zf.j.x0((String) null, "**.", false);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return j.a(fVar.f10077a, this.f10077a) && j.a(fVar.f10078b, this.f10078b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f10077a.hashCode() + 1517) * 41;
        z zVar = this.f10078b;
        return hashCode + (zVar != null ? zVar.hashCode() : 0);
    }
}
