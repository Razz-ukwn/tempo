package r3;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

public class x extends w {
    public static boolean M = true;
    public static boolean N = true;

    @SuppressLint({"NewApi"})
    public void p(View view, Matrix matrix) {
        if (M) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                M = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void q(View view, Matrix matrix) {
        if (N) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                N = false;
            }
        }
    }
}
