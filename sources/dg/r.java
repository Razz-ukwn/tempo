package dg;

import cb.b;
import ff.h;
import ff.m;
import gf.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.d;
import jf.f;
import kotlinx.coroutines.flow.g;
import lf.c;
import rf.l;
import rf.p;
import sf.j;
import sf.k;
import zf.e;
import zf.n;

public final class r<T> extends c implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f7581a;

    /* renamed from: b  reason: collision with root package name */
    public final f f7582b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7583c;

    /* renamed from: d  reason: collision with root package name */
    public f f7584d;

    /* renamed from: e  reason: collision with root package name */
    public d<? super m> f7585e;

    public static final class a extends k implements p<Integer, f.b, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7586a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            f.b bVar = (f.b) obj2;
            return Integer.valueOf(((Number) obj).intValue() + 1);
        }
    }

    public r(g<? super T> gVar, f fVar) {
        super(p.f7579a, jf.g.f10014a);
        this.f7581a = gVar;
        this.f7582b = fVar;
        this.f7583c = ((Number) fVar.p(0, a.f7586a)).intValue();
    }

    public final lf.d getCallerFrame() {
        d<? super m> dVar = this.f7585e;
        if (dVar instanceof lf.d) {
            return (lf.d) dVar;
        }
        return null;
    }

    public final f getContext() {
        f fVar = this.f7584d;
        return fVar == null ? jf.g.f10014a : fVar;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object invokeSuspend(Object obj) {
        Throwable a10 = h.a(obj);
        if (a10 != null) {
            this.f7584d = new m(getContext(), a10);
        }
        d<? super m> dVar = this.f7585e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return kf.a.f10464a;
    }

    public final Object m(T t2, d<? super m> dVar) {
        try {
            Object o10 = o(dVar, t2);
            return o10 == kf.a.f10464a ? o10 : m.f8717a;
        } catch (Throwable th) {
            this.f7584d = new m(dVar.getContext(), th);
            throw th;
        }
    }

    public final Object o(d<? super m> dVar, T t2) {
        Comparable comparable;
        f context = dVar.getContext();
        cb.d.z(context);
        f fVar = this.f7584d;
        if (fVar != context) {
            if (fVar instanceof m) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((m) fVar).f7577a + ", but then emission attempt of value '" + t2 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                j.f(str, "<this>");
                List<String> K0 = n.K0(str);
                Iterable iterable = K0;
                ArrayList arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (true ^ zf.j.t0((String) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(gf.m.n0(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int length = str2.length();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            i8 = -1;
                            break;
                        } else if (!b.C(str2.charAt(i8))) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    if (i8 == -1) {
                        i8 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(i8));
                }
                Iterator it2 = arrayList2.iterator();
                if (!it2.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int size = (K0.size() * 0) + str.length();
                int H = cb.d.H(K0);
                ArrayList arrayList3 = new ArrayList();
                int i10 = 0;
                for (Object next2 : iterable) {
                    int i11 = i10 + 1;
                    if (i10 >= 0) {
                        String str3 = (String) next2;
                        if ((i10 == 0 || i10 == H) && zf.j.t0(str3)) {
                            str3 = null;
                        } else {
                            j.f(str3, "<this>");
                            if (intValue >= 0) {
                                int length2 = str3.length();
                                if (intValue <= length2) {
                                    length2 = intValue;
                                }
                                String substring = str3.substring(length2);
                                j.e(substring, "this as java.lang.String).substring(startIndex)");
                                String str4 = (String) e.f17976a.invoke(substring);
                                if (str4 != null) {
                                    str3 = str4;
                                }
                            } else {
                                throw new IllegalArgumentException(d.a.a("Requested character count ", intValue, " is less than zero.").toString());
                            }
                        }
                        if (str3 != null) {
                            arrayList3.add(str3);
                        }
                        i10 = i11;
                    } else {
                        cb.d.i0();
                        throw null;
                    }
                }
                StringBuilder sb2 = new StringBuilder(size);
                q.y0(arrayList3, sb2, "\n", "", "", -1, "...", (l) null);
                String sb3 = sb2.toString();
                j.e(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
                throw new IllegalStateException(sb3.toString());
            } else if (((Number) context.p(0, new t(this))).intValue() == this.f7583c) {
                this.f7584d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f7582b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f7585e = dVar;
        Object e10 = s.f7587a.e(this.f7581a, t2, this);
        if (!j.a(e10, kf.a.f10464a)) {
            this.f7585e = null;
        }
        return e10;
    }

    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
