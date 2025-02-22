package d6;

import a6.b;
import a6.g;
import java.util.Set;
import k6.q;

public final class t implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f7359a;

    /* renamed from: b  reason: collision with root package name */
    public final s f7360b;

    /* renamed from: c  reason: collision with root package name */
    public final v f7361c;

    public t(Set set, j jVar, v vVar) {
        this.f7359a = set;
        this.f7360b = jVar;
        this.f7361c = vVar;
    }

    public final u a(String str, b bVar, q qVar) {
        Set<b> set = this.f7359a;
        if (set.contains(bVar)) {
            return new u(this.f7360b, str, bVar, qVar, this.f7361c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, set}));
    }
}
