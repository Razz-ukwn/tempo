package n6;

import a6.d;
import android.util.SparseArray;
import androidx.fragment.app.q;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray<d> f11597a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<d, Integer> f11598b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f11598b = hashMap;
        hashMap.put(d.f118a, 0);
        hashMap.put(d.f119b, 1);
        hashMap.put(d.f120c, 2);
        for (d next : hashMap.keySet()) {
            f11597a.append(f11598b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f11598b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i8) {
        d dVar = f11597a.get(i8);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(q.a("Unknown Priority for value ", i8));
    }
}
