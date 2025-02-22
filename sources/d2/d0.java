package d2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

public final class d0 {
    public static PointerIcon a(Bitmap bitmap, float f10, float f11) {
        return PointerIcon.create(bitmap, f10, f11);
    }

    public static PointerIcon b(Context context, int i8) {
        return PointerIcon.getSystemIcon(context, i8);
    }

    public static PointerIcon c(Resources resources, int i8) {
        return PointerIcon.load(resources, i8);
    }
}
