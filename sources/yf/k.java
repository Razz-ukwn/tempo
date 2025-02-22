package yf;

import cb.d;
import java.util.Iterator;
import rf.l;
import sf.j;

public class k extends d {

    public static final class a implements g<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterator f17389a;

        public a(Iterator it) {
            this.f17389a = it;
        }

        public final Iterator<T> iterator() {
            return this.f17389a;
        }
    }

    public static final class b extends sf.k implements rf.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ T f17390a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(T t2) {
            super(0);
            this.f17390a = t2;
        }

        public final T d() {
            return this.f17390a;
        }
    }

    public static final <T> g<T> n0(Iterator<? extends T> it) {
        j.f(it, "<this>");
        a aVar = new a(it);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    public static final <T> g<T> o0(T t2, l<? super T, ? extends T> lVar) {
        j.f(lVar, "nextFunction");
        return t2 == null ? d.f17372a : new f(new b(t2), lVar);
    }
}
