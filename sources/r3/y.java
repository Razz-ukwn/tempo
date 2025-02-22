package r3;

import android.annotation.SuppressLint;
import android.view.View;

public class y extends x {
    public static boolean O = true;

    @SuppressLint({"NewApi"})
    public void r(View view, int i8, int i10, int i11, int i12) {
        if (O) {
            try {
                view.setLeftTopRightBottom(i8, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                O = false;
            }
        }
    }
}
