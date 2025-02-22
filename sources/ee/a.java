package ee;

import android.os.Bundle;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import cb.d;
import java.util.Set;
import jc.h;

public final class a {

    /* renamed from: ee.a$a  reason: collision with other inner class name */
    public interface C0131a {
        c a();
    }

    public interface b {
        c a();
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f7977a;

        /* renamed from: b  reason: collision with root package name */
        public final de.a f7978b;

        public c(Set set, h hVar) {
            this.f7977a = set;
            this.f7978b = hVar;
        }
    }

    public static d a(p pVar, m0.b bVar) {
        c a10 = ((b) d.E(b.class, pVar)).a();
        a10.getClass();
        Bundle bundle = pVar.C;
        bVar.getClass();
        return new d(a10.f7977a, bVar, a10.f7978b);
    }
}
