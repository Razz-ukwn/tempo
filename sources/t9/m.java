package t9;

import com.google.android.gms.internal.measurement.c9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class m extends c9 {

    /* renamed from: a  reason: collision with root package name */
    public final List<b<?>> f15482a;

    public m(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.f15482a = arrayList;
    }
}
