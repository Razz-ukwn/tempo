package ag;

import jf.b;
import jf.d;
import jf.e;
import jf.f;
import kotlinx.coroutines.internal.g;
import rf.l;
import sf.j;
import sf.k;

public abstract class c0 extends jf.a implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f402b = new a();

    public static final class a extends b<e, c0> {

        /* renamed from: ag.c0$a$a  reason: collision with other inner class name */
        public static final class C0009a extends k implements l<f.b, c0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0009a f403a = new C0009a();

            public C0009a() {
                super(1);
            }

            public final Object invoke(Object obj) {
                f.b bVar = (f.b) obj;
                if (bVar instanceof c0) {
                    return (c0) bVar;
                }
                return null;
            }
        }

        public a() {
            super(e.a.f10012a, C0009a.f403a);
        }
    }

    public c0() {
        super(e.a.f10012a);
    }

    public final void D(d<?> dVar) {
        ((kotlinx.coroutines.internal.f) dVar).p();
    }

    public abstract void F0(f fVar, Runnable runnable);

    public void G0(f fVar, Runnable runnable) {
        F0(fVar, runnable);
    }

    public boolean H0() {
        return !(this instanceof o2);
    }

    public c0 I0(int i8) {
        cb.b.r(i8);
        return new g(this, i8);
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        j.f(cVar, "key");
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            f.c<?> cVar2 = this.f10005a;
            j.f(cVar2, "key");
            if (cVar2 == bVar || bVar.f10007b == cVar2) {
                E e10 = (f.b) bVar.f10006a.invoke(this);
                if (e10 instanceof f.b) {
                    return e10;
                }
            }
        } else if (e.a.f10012a == cVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + i0.d(this);
    }

    public final f w0(f.c<?> cVar) {
        j.f(cVar, "key");
        boolean z10 = cVar instanceof b;
        jf.g gVar = jf.g.f10014a;
        if (z10) {
            b bVar = (b) cVar;
            f.c<?> cVar2 = this.f10005a;
            j.f(cVar2, "key");
            if ((cVar2 == bVar || bVar.f10007b == cVar2) && ((f.b) bVar.f10006a.invoke(this)) != null) {
                return gVar;
            }
        } else if (e.a.f10012a == cVar) {
            return gVar;
        }
        return this;
    }

    public final kotlinx.coroutines.internal.f z(d dVar) {
        return new kotlinx.coroutines.internal.f(this, dVar);
    }
}
