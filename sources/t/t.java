package t;

import androidx.activity.f;
import ff.m;
import java.util.ArrayList;
import java.util.List;
import rf.q;
import sf.k;

public final class t extends k implements q<c<?>, p2, i2, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ sf.t f15229a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<Object> f15230b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(sf.t tVar, ArrayList arrayList) {
        super(3);
        this.f15229a = tVar;
        this.f15230b = arrayList;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        f.e(cVar, "applier", (p2) obj2, "<anonymous parameter 1>", (i2) obj3, "<anonymous parameter 2>");
        int i8 = this.f15229a.f14955a;
        List<Object> list = this.f15230b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj4 = list.get(i10);
            int i11 = i8 + i10;
            cVar.a(i11, obj4);
            cVar.f(i11, obj4);
        }
        return m.f8717a;
    }
}
