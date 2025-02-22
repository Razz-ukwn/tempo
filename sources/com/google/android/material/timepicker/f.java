package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

public final class f implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f6241a;

    public f(GestureDetector gestureDetector) {
        this.f6241a = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f6241a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
