package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f941a;

    public b(ActionBarContainer actionBarContainer) {
        this.f941a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f941a;
        if (actionBarContainer.D) {
            Drawable drawable = actionBarContainer.C;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f798e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.B;
        if (drawable3 != null && actionBarContainer.E) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f941a;
        if (!actionBarContainer.D) {
            Drawable drawable = actionBarContainer.f798e;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.C != null) {
            actionBarContainer.f798e.getOutline(outline);
        }
    }

    public final void setAlpha(int i8) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
