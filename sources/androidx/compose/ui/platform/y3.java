package androidx.compose.ui.platform;

import android.view.View;
import java.util.Map;
import sf.j;

public final class y3 {

    /* renamed from: a  reason: collision with root package name */
    public static final y3 f1529a = new y3();

    public final Map<Integer, Integer> a(View view) {
        j.f(view, "view");
        Map<Integer, Integer> c3 = view.getAttributeSourceResourceMap();
        j.e(c3, "view.attributeSourceResourceMap");
        return c3;
    }
}
