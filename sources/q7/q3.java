package q7;

import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.t2;
import java.util.LinkedHashMap;
import o.e;
import u6.q;

public final class q3 extends e {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r3 f13282f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q3(r3 r3Var) {
        super(20);
        this.f13282f = r3Var;
    }

    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        q.f(str);
        r3 r3Var = this.f13282f;
        r3Var.j();
        q.f(str);
        if (!r3Var.t(str)) {
            return null;
        }
        if (!r3Var.D.containsKey(str) || r3Var.D.getOrDefault(str, null) == null) {
            r3Var.o(str);
        } else {
            r3Var.p(str, (t2) r3Var.D.getOrDefault(str, null));
        }
        q3 q3Var = r3Var.F;
        synchronized (q3Var) {
            linkedHashMap = new LinkedHashMap(q3Var.f12023a);
        }
        return (o0) linkedHashMap.get(str);
    }
}
