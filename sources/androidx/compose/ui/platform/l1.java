package androidx.compose.ui.platform;

import a0.b;
import android.os.Bundle;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class l1 implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0.a f1346a;

    public l1(b bVar) {
        this.f1346a = bVar;
    }

    public final Bundle a() {
        Map<String, List<Object>> a10 = this.f1346a.a();
        Bundle bundle = new Bundle();
        for (Map.Entry next : a10.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
        }
        return bundle;
    }
}
