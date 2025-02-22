package l4;

import h4.e;
import h4.i;
import h4.n;
import l4.c;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final d f10978a;

    /* renamed from: b  reason: collision with root package name */
    public final i f10979b;

    public static final class a implements c.a {
        public final c a(d dVar, i iVar) {
            return new b(dVar, iVar);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(d dVar, i iVar) {
        this.f10978a = dVar;
        this.f10979b = iVar;
    }

    public final void a() {
        i iVar = this.f10979b;
        boolean z10 = iVar instanceof n;
        d dVar = this.f10978a;
        if (z10) {
            dVar.e(((n) iVar).f9212a);
        } else if (iVar instanceof e) {
            dVar.f(iVar.a());
        }
    }
}
