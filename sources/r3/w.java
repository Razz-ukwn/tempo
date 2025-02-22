package r3;

import ag.v1;
import android.annotation.SuppressLint;
import android.view.View;

public class w extends v1 {
    public static boolean L = true;

    @SuppressLint({"NewApi"})
    public float n(View view) {
        if (L) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                L = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void o(View view, float f10) {
        if (L) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                L = false;
            }
        }
        view.setAlpha(f10);
    }
}
