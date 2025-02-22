package o0;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<n, o> f12044a;

    /* renamed from: b  reason: collision with root package name */
    public final q f12045b;

    public e(LinkedHashMap linkedHashMap, q qVar) {
        this.f12044a = linkedHashMap;
        this.f12045b = qVar;
    }

    public final boolean a(long j10) {
        r rVar;
        List<r> list = this.f12045b.f12085a;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                rVar = null;
                break;
            }
            rVar = list.get(i8);
            if (rVar.f12087a == j10) {
                break;
            }
            i8++;
        }
        r rVar2 = rVar;
        if (rVar2 != null) {
            return rVar2.f12094h;
        }
        return false;
    }
}
