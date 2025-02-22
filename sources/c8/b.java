package c8;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

public final class b extends InsetDrawable {
    public b(Drawable drawable, int i8, int i10, int i11, int i12) {
        super(drawable, i8, i10, i11, i12);
    }

    public final int getMinimumHeight() {
        return -1;
    }

    public final int getMinimumWidth() {
        return -1;
    }

    public final boolean getPadding(Rect rect) {
        return false;
    }
}
