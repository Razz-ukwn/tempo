package d2;

import android.graphics.Rect;
import android.view.Gravity;

public final class n {
    public static void a(int i8, int i10, int i11, Rect rect, int i12, int i13, Rect rect2, int i14) {
        Gravity.apply(i8, i10, i11, rect, i12, i13, rect2, i14);
    }

    public static void b(int i8, int i10, int i11, Rect rect, Rect rect2, int i12) {
        Gravity.apply(i8, i10, i11, rect, rect2, i12);
    }

    public static void c(int i8, Rect rect, Rect rect2, int i10) {
        Gravity.applyDisplay(i8, rect, rect2, i10);
    }
}
