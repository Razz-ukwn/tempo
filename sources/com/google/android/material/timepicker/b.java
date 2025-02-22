package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.quickkonnect.silencio.R;
import d2.a;
import e2.i;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f6238d;

    public b(ClockFaceView clockFaceView) {
        this.f6238d = clockFaceView;
    }

    public final void d(View view, i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.f6238d.T.get(intValue - 1));
        }
        iVar.l(i.d.a(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        iVar.b(i.a.f7784g);
    }

    public final boolean g(View view, int i8, Bundle bundle) {
        if (i8 != 16) {
            return super.g(view, i8, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f6238d;
        view.getHitRect(clockFaceView.Q);
        float centerX = (float) clockFaceView.Q.centerX();
        float centerY = (float) clockFaceView.Q.centerY();
        clockFaceView.P.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.P.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
