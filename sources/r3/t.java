package r3;

import android.os.Build;
import android.view.ViewGroup;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13863a = true;

    public static void a(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (f13863a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f13863a = false;
            }
        }
    }
}
