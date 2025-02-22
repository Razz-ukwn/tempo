package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f1335a = new j();

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        sf.j.f(accessibilityNodeInfo, "node");
        sf.j.f(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
