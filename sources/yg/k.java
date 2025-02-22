package yg;

import ag.l;
import jg.d;
import jg.d0;

public abstract class k<ResponseT, ReturnT> extends d0<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f17482a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f17483b;

    /* renamed from: c  reason: collision with root package name */
    public final f<d0, ResponseT> f17484c;

    public static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, ReturnT> f17485d;

        public a(a0 a0Var, d.a aVar, f<d0, ResponseT> fVar, c<ResponseT, ReturnT> cVar) {
            super(a0Var, aVar, fVar);
            this.f17485d = cVar;
        }

        public final Object c(t tVar, Object[] objArr) {
            return this.f17485d.a(tVar);
        }
    }

    public static final class b<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f17486d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f17487e = false;

        public b(a0 a0Var, d.a aVar, f fVar, c cVar) {
            super(a0Var, aVar, fVar);
            this.f17486d = cVar;
        }

        public final Object c(t tVar, Object[] objArr) {
            b bVar = (b) this.f17486d.a(tVar);
            jf.d dVar = objArr[objArr.length - 1];
            try {
                if (this.f17487e) {
                    l lVar = new l(1, e9.c.g(dVar));
                    lVar.v(new n(bVar));
                    bVar.e(new p(lVar));
                    return lVar.s();
                }
                l lVar2 = new l(1, e9.c.g(dVar));
                lVar2.v(new m(bVar));
                bVar.e(new o(lVar2));
                return lVar2.s();
            } catch (Exception e10) {
                return s.a(e10, dVar);
            }
        }
    }

    public static final class c<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f17488d;

        public c(a0 a0Var, d.a aVar, f<d0, ResponseT> fVar, c<ResponseT, b<ResponseT>> cVar) {
            super(a0Var, aVar, fVar);
            this.f17488d = cVar;
        }

        public final Object c(t tVar, Object[] objArr) {
            b bVar = (b) this.f17488d.a(tVar);
            jf.d dVar = objArr[objArr.length - 1];
            try {
                l lVar = new l(1, e9.c.g(dVar));
                lVar.v(new q(bVar));
                bVar.e(new r(lVar));
                return lVar.s();
            } catch (Exception e10) {
                return s.a(e10, dVar);
            }
        }
    }

    public k(a0 a0Var, d.a aVar, f<d0, ResponseT> fVar) {
        this.f17482a = a0Var;
        this.f17483b = aVar;
        this.f17484c = fVar;
    }

    public final ReturnT a(Object[] objArr) {
        return c(new t(this.f17482a, objArr, this.f17483b, this.f17484c), objArr);
    }

    public abstract Object c(t tVar, Object[] objArr);
}
