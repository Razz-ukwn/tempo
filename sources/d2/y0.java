package d2;

import android.view.ViewGroup;

public final class y0 {
    public static int a(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean b(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public static void c(ViewGroup viewGroup, boolean z10) {
        viewGroup.setTransitionGroup(z10);
    }
}
