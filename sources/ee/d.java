package ee;

import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import java.util.Map;
import java.util.Set;
import x2.c;

public final class d implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f7981a;

    /* renamed from: b  reason: collision with root package name */
    public final m0.b f7982b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7983c;

    public interface a {
        Map<String, ef.a<j0>> a();
    }

    public d(Set set, m0.b bVar, de.a aVar) {
        this.f7981a = set;
        this.f7982b = bVar;
        this.f7983c = new c(aVar);
    }

    public final <T extends j0> T a(Class<T> cls) {
        return this.f7981a.contains(cls.getName()) ? this.f7983c.a(cls) : this.f7982b.a(cls);
    }

    public final j0 b(Class cls, c cVar) {
        return this.f7981a.contains(cls.getName()) ? this.f7983c.b(cls, cVar) : this.f7982b.b(cls, cVar);
    }
}
