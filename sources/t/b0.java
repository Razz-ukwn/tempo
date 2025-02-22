package t;

import androidx.activity.f;
import ff.m;
import java.util.ArrayList;
import java.util.List;
import rf.q;
import sf.k;

public final class b0 extends k implements q<c<?>, p2, i2, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n2 f14989a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f14990b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List<q<c<?>, p2, i2, m>> f14991c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(n2 n2Var, b bVar, ArrayList arrayList) {
        super(3);
        this.f14989a = n2Var;
        this.f14990b = bVar;
        this.f14991c = arrayList;
    }

    /* JADX INFO: finally extract failed */
    public final Object e(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        p2 p2Var = (p2) obj2;
        i2 i2Var = (i2) obj3;
        f.e(cVar, "applier", p2Var, "slots", i2Var, "rememberManager");
        List<q<c<?>, p2, i2, m>> list = this.f14991c;
        n2 n2Var = this.f14989a;
        p2 e10 = n2Var.e();
        try {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                list.get(i8).e(cVar, e10, i2Var);
            }
            m mVar = m.f8717a;
            e10.f();
            p2Var.e();
            b bVar = this.f14990b;
            bVar.getClass();
            p2Var.u(n2Var, n2Var.b(bVar));
            p2Var.j();
            return m.f8717a;
        } catch (Throwable th) {
            e10.f();
            throw th;
        }
    }
}
