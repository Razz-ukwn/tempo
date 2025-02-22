package androidx.compose.ui.platform;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import sf.j;

public final class k implements i {
    public k(Context context) {
        Object systemService = context.getSystemService("accessibility");
        j.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
    }
}
