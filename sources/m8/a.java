package m8;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
import e2.i;

public final class a extends d2.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f11221d;

    public a(CheckableImageButton checkableImageButton) {
        this.f11221d = checkableImageButton;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f11221d.isChecked());
    }

    public final void d(View view, i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f11221d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f6003e);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
