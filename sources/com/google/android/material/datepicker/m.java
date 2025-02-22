package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.quickkonnect.silencio.R;
import d2.a;
import e2.i;

public final class m extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j f5895d;

    public m(j jVar) {
        this.f5895d = jVar;
    }

    public final void d(View view, i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        j jVar = this.f5895d;
        accessibilityNodeInfo.setHintText(jVar.I0.getVisibility() == 0 ? jVar.x(R.string.mtrl_picker_toggle_to_year_selection) : jVar.x(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
