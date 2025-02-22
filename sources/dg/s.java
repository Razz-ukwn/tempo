package dg;

import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import rf.q;
import sf.i;
import sf.y;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final q<g<Object>, Object, d<? super m>, Object> f7587a;

    public /* synthetic */ class a extends i implements q<g<? super Object>, Object, d<? super m>, Object> {
        public static final a E = new a();

        public a() {
            super(3, g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            return ((g) obj).m(obj2, (d) obj3);
        }
    }

    static {
        a aVar = a.E;
        y.c(3, aVar);
        f7587a = aVar;
    }
}
