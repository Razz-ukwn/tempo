package jf;

import java.io.Serializable;
import jf.f;
import rf.p;
import s0.b0;
import sf.j;
import sf.k;

public final class c implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final f f10008a;

    /* renamed from: b  reason: collision with root package name */
    public final f.b f10009b;

    public static final class a extends k implements p<String, f.b, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10010a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            f.b bVar = (f.b) obj2;
            j.f(str, "acc");
            j.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(f.b bVar, f fVar) {
        j.f(fVar, "left");
        j.f(bVar, "element");
        this.f10008a = fVar;
        this.f10009b = bVar;
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        j.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            E d10 = cVar2.f10009b.d(cVar);
            if (d10 != null) {
                return d10;
            }
            f fVar = cVar2.f10008a;
            if (!(fVar instanceof c)) {
                return fVar.d(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i8 = 2;
            c cVar2 = cVar;
            int i10 = 2;
            while (true) {
                f fVar = cVar2.f10008a;
                cVar2 = fVar instanceof c ? (c) fVar : null;
                if (cVar2 == null) {
                    break;
                }
                i10++;
            }
            c cVar3 = this;
            while (true) {
                f fVar2 = cVar3.f10008a;
                cVar3 = fVar2 instanceof c ? (c) fVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i8++;
            }
            if (i10 != i8) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                f.b bVar = cVar4.f10009b;
                if (j.a(cVar.d(bVar.getKey()), bVar)) {
                    f fVar3 = cVar4.f10008a;
                    if (!(fVar3 instanceof c)) {
                        j.d(fVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f.b bVar2 = (f.b) fVar3;
                        z10 = j.a(cVar.d(bVar2.getKey()), bVar2);
                        break;
                    }
                    cVar4 = (c) fVar3;
                } else {
                    z10 = false;
                    break;
                }
            }
            return z10;
        }
    }

    public final int hashCode() {
        return this.f10009b.hashCode() + this.f10008a.hashCode();
    }

    public final f n0(f fVar) {
        return f.a.a(this, fVar);
    }

    public final <R> R p(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(this.f10008a.p(r10, pVar), this.f10009b);
    }

    public final String toString() {
        return b0.a(new StringBuilder("["), (String) p("", a.f10010a), ']');
    }

    public final f w0(f.c<?> cVar) {
        j.f(cVar, "key");
        f.b bVar = this.f10009b;
        f.b d10 = bVar.d(cVar);
        f fVar = this.f10008a;
        if (d10 != null) {
            return fVar;
        }
        f w02 = fVar.w0(cVar);
        return w02 == fVar ? this : w02 == g.f10014a ? bVar : new c(bVar, w02);
    }
}
