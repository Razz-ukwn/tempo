package o0;

import android.view.MotionEvent;
import d2.f1;
import sf.j;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f12052a = new g();

    public final long a(MotionEvent motionEvent, int i8) {
        j.f(motionEvent, "motionEvent");
        return f1.f(motionEvent.getRawX(i8), motionEvent.getRawY(i8));
    }
}
