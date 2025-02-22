package cg;

import cg.b;
import ff.m;
import gc.b;
import java.util.ArrayList;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.v;
import rf.l;

public final class n<E> extends a<E> {
    public n(l<? super E, m> lVar) {
        super(lVar);
    }

    public final boolean i() {
        return false;
    }

    public final boolean j() {
        return false;
    }

    public final Object l(E e10) {
        t tVar;
        do {
            Object l10 = super.l(e10);
            v vVar = b.f8933c;
            if (l10 == vVar) {
                return vVar;
            }
            if (l10 == b.f8934d) {
                h hVar = this.f4015b;
                b.a aVar = new b.a(e10);
                while (true) {
                    i q10 = hVar.q();
                    if (!(q10 instanceof t)) {
                        if (q10.l(aVar, hVar)) {
                            tVar = null;
                            break;
                        }
                    } else {
                        tVar = (t) q10;
                        break;
                    }
                }
                if (tVar == null) {
                    return vVar;
                }
            } else if (l10 instanceof j) {
                return l10;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + l10).toString());
            }
        } while (!(tVar instanceof j));
        return tVar;
    }

    public final boolean s() {
        return true;
    }

    public final boolean u() {
        return true;
    }

    public final void x(Object obj, j<?> jVar) {
        b0 b0Var = null;
        if (obj != null) {
            boolean z10 = obj instanceof ArrayList;
            l<E, m> lVar = this.f4014a;
            if (!z10) {
                v vVar = (v) obj;
                if (!(vVar instanceof b.a)) {
                    vVar.y(jVar);
                } else if (lVar != null) {
                    b0Var = o.a(lVar, ((b.a) vVar).f4016d, (b0) null);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                b0 b0Var2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    v vVar2 = (v) arrayList.get(size);
                    if (vVar2 instanceof b.a) {
                        b0Var2 = lVar != null ? o.a(lVar, ((b.a) vVar2).f4016d, b0Var2) : null;
                    } else {
                        vVar2.y(jVar);
                    }
                }
                b0Var = b0Var2;
            }
        }
        if (b0Var != null) {
            throw b0Var;
        }
    }
}
