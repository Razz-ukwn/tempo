package ag;

import jf.d;
import jf.e;
import jf.f;
import jf.g;
import kotlinx.coroutines.scheduling.c;
import rf.p;
import sf.k;
import sf.v;

public final class a0 {

    public static final class a extends k implements p<f, f.b, f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f390a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            f fVar = (f) obj;
            f.b bVar = (f.b) obj2;
            return bVar instanceof z ? fVar.n0(((z) bVar).g0()) : fVar.n0(bVar);
        }
    }

    public static final class b extends k implements p<f, f.b, f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v<f> f391a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f392b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(v<f> vVar, boolean z10) {
            super(2);
            this.f391a = vVar;
            this.f392b = z10;
        }

        public final Object invoke(Object obj, Object obj2) {
            f fVar = (f) obj;
            f.b bVar = (f.b) obj2;
            if (!(bVar instanceof z)) {
                return fVar.n0(bVar);
            }
            v<f> vVar = this.f391a;
            if (((f) vVar.f14957a).d(bVar.getKey()) == null) {
                z zVar = (z) bVar;
                if (this.f392b) {
                    zVar = zVar.g0();
                }
                return fVar.n0(zVar);
            }
            vVar.f14957a = ((f) vVar.f14957a).w0(bVar.getKey());
            return fVar.n0(((z) bVar).x0());
        }
    }

    public static final f a(f fVar, f fVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        b0 b0Var = b0.f394a;
        boolean booleanValue = ((Boolean) fVar.p(bool, b0Var)).booleanValue();
        boolean booleanValue2 = ((Boolean) fVar2.p(bool, b0Var)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return fVar.n0(fVar2);
        }
        v vVar = new v();
        vVar.f14957a = fVar2;
        g gVar = g.f10014a;
        f fVar3 = (f) fVar.p(gVar, new b(vVar, z10));
        if (booleanValue2) {
            vVar.f14957a = ((f) vVar.f14957a).p(gVar, a.f390a);
        }
        return fVar3.n0((f) vVar.f14957a);
    }

    public static final f b(g0 g0Var, f fVar) {
        f a10 = a(g0Var.f0(), fVar, true);
        c cVar = s0.f480a;
        return (a10 == cVar || a10.d(e.a.f10012a) != null) ? a10 : a10.n0(cVar);
    }

    public static final p2<?> c(d<?> dVar, f fVar, Object obj) {
        p2<?> p2Var = null;
        if (!(dVar instanceof lf.d)) {
            return null;
        }
        if (!(fVar.d(q2.f476a) != null)) {
            return null;
        }
        lf.d dVar2 = (lf.d) dVar;
        while (true) {
            if (!(dVar2 instanceof p0) && (dVar2 = dVar2.getCallerFrame()) != null) {
                if (dVar2 instanceof p2) {
                    p2Var = (p2) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (p2Var != null) {
            p2Var.f472d.set(new ff.g(fVar, obj));
        }
        return p2Var;
    }
}
