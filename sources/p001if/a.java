package p001if;

import d2.f1;
import java.util.Comparator;
import rf.l;
import sf.j;

/* renamed from: if.a  reason: invalid package */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l[] f9663a;

    public /* synthetic */ a(l[] lVarArr) {
        this.f9663a = lVarArr;
    }

    public final int compare(Object obj, Object obj2) {
        l[] lVarArr = this.f9663a;
        j.f(lVarArr, "$selectors");
        for (l lVar : lVarArr) {
            int t2 = f1.t((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (t2 != 0) {
                return t2;
            }
        }
        return 0;
    }
}
