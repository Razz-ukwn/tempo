package r3;

import android.graphics.Matrix;
import android.view.View;

public final class a0 extends z {
    public final void l(View view, int i8) {
        view.setTransitionVisibility(i8);
    }

    public final float n(View view) {
        return view.getTransitionAlpha();
    }

    public final void o(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    public final void p(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public final void q(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public final void r(View view, int i8, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i8, i10, i11, i12);
    }
}
