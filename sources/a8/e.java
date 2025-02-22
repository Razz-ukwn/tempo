package a8;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.bottomsheet.b;
import d2.a;
import e2.i;

public final class e extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f131d;

    public e(b bVar) {
        this.f131d = bVar;
    }

    public final void d(View view, i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (this.f131d.F) {
            iVar.a(1048576);
            accessibilityNodeInfo.setDismissable(true);
            return;
        }
        accessibilityNodeInfo.setDismissable(false);
    }

    public final boolean g(View view, int i8, Bundle bundle) {
        if (i8 == 1048576) {
            b bVar = this.f131d;
            if (bVar.F) {
                bVar.cancel();
                return true;
            }
        }
        return super.g(view, i8, bundle);
    }
}
