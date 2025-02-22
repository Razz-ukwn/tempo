package r3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

public class z extends y {
    public static boolean P = true;

    @SuppressLint({"NewApi"})
    public void l(View view, int i8) {
        if (Build.VERSION.SDK_INT == 28) {
            super.l(view, i8);
        } else if (P) {
            try {
                view.setTransitionVisibility(i8);
            } catch (NoSuchMethodError unused) {
                P = false;
            }
        }
    }
}
