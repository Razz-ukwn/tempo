package t;

import java.util.HashMap;
import java.util.LinkedHashSet;
import rf.a;
import sf.k;
import t.e0;

public final class p1 extends k implements a<HashMap<Object, LinkedHashSet<z0>>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q1 f15186a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var) {
        super(0);
        this.f15186a = q1Var;
    }

    public final Object d() {
        e0.b bVar = e0.f15020a;
        HashMap hashMap = new HashMap();
        q1 q1Var = this.f15186a;
        int size = q1Var.f15209a.size();
        for (int i8 = 0; i8 < size; i8++) {
            z0 z0Var = q1Var.f15209a.get(i8);
            Object obj = z0Var.f15292b;
            int i10 = z0Var.f15291a;
            Object y0Var = obj != null ? new y0(Integer.valueOf(i10), z0Var.f15292b) : Integer.valueOf(i10);
            Object obj2 = hashMap.get(y0Var);
            if (obj2 == null) {
                obj2 = new LinkedHashSet();
                hashMap.put(y0Var, obj2);
            }
            ((LinkedHashSet) obj2).add(z0Var);
        }
        return hashMap;
    }
}
