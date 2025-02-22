package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import gf.s;
import sf.j;

public final /* synthetic */ class q implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f1394a;

    public /* synthetic */ q(s sVar) {
        this.f1394a = sVar;
    }

    public final void onAccessibilityStateChanged(boolean z10) {
        s sVar = this.f1394a;
        j.f(sVar, "this$0");
        sVar.f1421i = z10 ? sVar.f1418f.getEnabledAccessibilityServiceList(-1) : s.f8978a;
    }
}
