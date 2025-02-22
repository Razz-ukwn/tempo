package h2;

import android.widget.PopupWindow;

public final class k {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    public static void d(PopupWindow popupWindow, int i8) {
        popupWindow.setWindowLayoutType(i8);
    }
}
