package a0;

import androidx.compose.ui.platform.m1;
import cb.d;
import gf.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rf.a;
import rf.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final l<Object, Boolean> f6a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f7b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f8c;

    public b(LinkedHashMap linkedHashMap, m1 m1Var) {
        this.f6a = m1Var;
        this.f7b = linkedHashMap != null ? y.Y(linkedHashMap) : new LinkedHashMap();
        this.f8c = new LinkedHashMap();
    }

    public final Map<String, List<Object>> a() {
        LinkedHashMap Y = y.Y(this.f7b);
        for (Map.Entry entry : this.f8c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            l<Object, Boolean> lVar = this.f6a;
            int i8 = 0;
            if (size == 1) {
                Object d10 = ((a) list.get(0)).d();
                if (d10 == null) {
                    continue;
                } else if (lVar.invoke(d10).booleanValue()) {
                    Y.put(str, d.m(d10));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size2 = list.size();
                ArrayList arrayList = new ArrayList(size2);
                while (i8 < size2) {
                    Object d11 = ((a) list.get(i8)).d();
                    if (d11 == null || lVar.invoke(d11).booleanValue()) {
                        arrayList.add(d11);
                        i8++;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                Y.put(str, arrayList);
            }
        }
        return Y;
    }
}
