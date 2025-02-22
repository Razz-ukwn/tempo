package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import sf.j;

public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4048b;

    public ImageViewTarget(ImageView imageView) {
        this.f4048b = imageView;
    }

    public final View a() {
        return this.f4048b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageViewTarget) {
            if (j.a(this.f4048b, ((ImageViewTarget) obj).f4048b)) {
                return true;
            }
        }
        return false;
    }

    public final Drawable h() {
        return this.f4048b.getDrawable();
    }

    public final int hashCode() {
        return this.f4048b.hashCode();
    }

    public final void i(Drawable drawable) {
        this.f4048b.setImageDrawable(drawable);
    }
}
