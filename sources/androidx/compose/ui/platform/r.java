package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import sf.j;

public final /* synthetic */ class r implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f1406a;

    public /* synthetic */ r(s sVar) {
        this.f1406a = sVar;
    }

    public final void onTouchExplorationStateChanged(boolean z10) {
        s sVar = this.f1406a;
        j.f(sVar, "this$0");
        sVar.f1421i = sVar.f1418f.getEnabledAccessibilityServiceList(-1);
    }
}
