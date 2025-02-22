package x8;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import d2.a;
import e2.i;

public final class e extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f16990d;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f16990d = baseTransientBottomBar;
    }

    public final void d(View view, i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        iVar.a(1048576);
        accessibilityNodeInfo.setDismissable(true);
    }

    public final boolean g(View view, int i8, Bundle bundle) {
        if (i8 != 1048576) {
            return super.g(view, i8, bundle);
        }
        this.f16990d.a();
        return true;
    }
}
