package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import sf.j;

public final class f3 extends o1 {
    public f3(Context context) {
        super(context);
    }

    public final void dispatchDraw(Canvas canvas) {
        j.f(canvas, "canvas");
    }

    public final void dispatchGetDisplayList() {
    }
}
