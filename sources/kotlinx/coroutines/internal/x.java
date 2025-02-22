package kotlinx.coroutines.internal;

import ag.h2;
import jf.f;
import rf.p;
import sf.j;
import sf.k;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final v f10740a = new v("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    public static final a f10741b = a.f10744a;

    /* renamed from: c  reason: collision with root package name */
    public static final b f10742c = b.f10745a;

    /* renamed from: d  reason: collision with root package name */
    public static final c f10743d = c.f10746a;

    public static final class a extends k implements p<Object, f.b, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10744a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            f.b bVar = (f.b) obj2;
            if (!(bVar instanceof h2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    public static final class b extends k implements p<h2<?>, f.b, h2<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10745a = new b();

        public b() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            h2 h2Var = (h2) obj;
            f.b bVar = (f.b) obj2;
            if (h2Var != null) {
                return h2Var;
            }
            if (bVar instanceof h2) {
                return (h2) bVar;
            }
            return null;
        }
    }

    public static final class c extends k implements p<a0, f.b, a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f10746a = new c();

        public c() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a0 a0Var = (a0) obj;
            f.b bVar = (f.b) obj2;
            if (bVar instanceof h2) {
                h2<Object> h2Var = (h2) bVar;
                String K = h2Var.K(a0Var.f10700a);
                int i8 = a0Var.f10703d;
                a0Var.f10701b[i8] = K;
                a0Var.f10703d = i8 + 1;
                a0Var.f10702c[i8] = h2Var;
            }
            return a0Var;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj != f10740a) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                h2<Object>[] h2VarArr = a0Var.f10702c;
                int length = h2VarArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i8 = length - 1;
                        h2<Object> h2Var = h2VarArr[length];
                        j.c(h2Var);
                        h2Var.p0(a0Var.f10701b[length]);
                        if (i8 >= 0) {
                            length = i8;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object p10 = fVar.p(null, f10742c);
                if (p10 != null) {
                    ((h2) p10).p0(obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
        }
    }

    public static final Object b(f fVar) {
        Object p10 = fVar.p(0, f10741b);
        j.c(p10);
        return p10;
    }

    public static final Object c(f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        return obj == 0 ? f10740a : obj instanceof Integer ? fVar.p(new a0(fVar, ((Number) obj).intValue()), f10743d) : ((h2) obj).K(fVar);
    }
}
