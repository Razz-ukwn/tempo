package za;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import t9.f;

public final class b implements f {
    public final List<t9.b<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (t9.b next : componentRegistrar.getComponents()) {
            String str = next.f15448a;
            if (str != null) {
                next = new t9.b(str, next.f15449b, next.f15450c, next.f15451d, next.f15452e, new a(str, next), next.f15454g);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
