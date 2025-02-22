package v0;

import ff.a;
import rf.p;
import sf.j;
import sf.k;

public final class t extends k implements p<a<a<? extends Boolean>>, a<a<? extends Boolean>>, a<a<? extends Boolean>>> {

    /* renamed from: a  reason: collision with root package name */
    public static final t f16112a = new t();

    public t() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        T t2;
        a aVar = (a) obj;
        a aVar2 = (a) obj2;
        j.f(aVar2, "childValue");
        if (aVar == null || (str = aVar.f16036a) == null) {
            str = aVar2.f16036a;
        }
        if (aVar == null || (t2 = aVar.f16037b) == null) {
            t2 = aVar2.f16037b;
        }
        return new a(str, t2);
    }
}
