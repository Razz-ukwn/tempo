package d0;

import d0.g;
import rf.l;
import rf.p;
import s0.b0;
import sf.j;
import sf.k;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final g f7171a;

    /* renamed from: b  reason: collision with root package name */
    public final g f7172b;

    public static final class a extends k implements p<String, g.b, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7173a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            g.b bVar = (g.b) obj2;
            j.f(str, "acc");
            j.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g gVar2) {
        j.f(gVar, "outer");
        j.f(gVar2, "inner");
        this.f7171a = gVar;
        this.f7172b = gVar2;
    }

    public final <R> R a(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return this.f7172b.a(this.f7171a.a(r10, pVar), pVar);
    }

    public final boolean b(l<? super g.b, Boolean> lVar) {
        j.f(lVar, "predicate");
        return this.f7171a.b(lVar) && this.f7172b.b(lVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return j.a(this.f7171a, cVar.f7171a) && j.a(this.f7172b, cVar.f7172b);
        }
    }

    public final int hashCode() {
        return (this.f7172b.hashCode() * 31) + this.f7171a.hashCode();
    }

    public final String toString() {
        return b0.a(new StringBuilder("["), (String) a("", a.f7173a), ']');
    }
}
