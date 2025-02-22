package h8;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f9278a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9279b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9280c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9281d;

    public a(Dialog dialog, Rect rect) {
        this.f9278a = dialog;
        this.f9279b = rect.left;
        this.f9280c = rect.top;
        this.f9281d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f9279b;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f9280c;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i8 = this.f9281d;
            obtain.setLocation((float) ((-i8) - 1), (float) ((-i8) - 1));
        }
        view.performClick();
        return this.f9278a.onTouchEvent(obtain);
    }
}
