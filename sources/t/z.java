package t;

import androidx.activity.f;
import ff.m;
import rf.q;
import sf.k;

public final class z extends k implements q<c<?>, p2, i2, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object[] f15290a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Object[] objArr) {
        super(3);
        this.f15290a = objArr;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        f.e(cVar, "applier", (p2) obj2, "<anonymous parameter 1>", (i2) obj3, "<anonymous parameter 2>");
        for (Object b10 : this.f15290a) {
            cVar.b(b10);
        }
        return m.f8717a;
    }
}
