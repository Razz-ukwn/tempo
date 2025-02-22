package i0;

import android.graphics.Canvas;
import sf.j;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f9372a = new h();

    public final void a(Canvas canvas, boolean z10) {
        j.f(canvas, "canvas");
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
