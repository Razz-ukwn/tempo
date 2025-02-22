package androidx.lifecycle;

import androidx.lifecycle.t;
import rf.l;
import sf.f;
import sf.j;

public final class i0 {

    public static final class a implements w, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f2274a;

        public a(h0 h0Var) {
            this.f2274a = h0Var;
        }

        public final ff.a<?> a() {
            return this.f2274a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f2274a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f2274a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f2274a.hashCode();
        }
    }

    public static final t a(v vVar, l lVar) {
        j.f(lVar, "transform");
        t tVar = new t();
        a aVar = new a(new h0(tVar, lVar));
        t.a aVar2 = new t.a(vVar, aVar);
        t.a b10 = tVar.f2319l.b(vVar, aVar2);
        if (b10 == null || b10.f2321b == aVar) {
            if (b10 == null) {
                if (tVar.f2191c > 0) {
                    vVar.f(aVar2);
                }
            }
            return tVar;
        }
        throw new IllegalArgumentException("This source was already added with the different observer");
    }
}
