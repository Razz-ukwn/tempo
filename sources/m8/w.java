package m8;

import android.view.View;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public final class w implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.h.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
