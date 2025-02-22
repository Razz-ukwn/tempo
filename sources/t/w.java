package t;

import androidx.activity.f;
import ff.m;
import java.util.ArrayList;
import java.util.List;
import rf.q;
import sf.k;
import sf.t;

public final class w extends k implements q<c<?>, p2, i2, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f15264a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<q<c<?>, p2, i2, m>> f15265b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(t tVar, ArrayList arrayList) {
        super(3);
        this.f15264a = tVar;
        this.f15265b = arrayList;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        p2 p2Var = (p2) obj2;
        i2 i2Var = (i2) obj3;
        f.e(cVar, "applier", p2Var, "slots", i2Var, "rememberManager");
        int i8 = this.f15264a.f14955a;
        if (i8 > 0) {
            cVar = new l1(cVar, i8);
        }
        List<q<c<?>, p2, i2, m>> list = this.f15265b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).e(cVar, p2Var, i2Var);
        }
        return m.f8717a;
    }
}
