package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import cb.b;
import sf.j;

public final class e1 implements b1 {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f1278a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f1279b = new int[2];

    public void a(View view, float[] fArr) {
        j.f(view, "view");
        j.f(fArr, "matrix");
        Matrix matrix = this.f1278a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        int[] iArr = this.f1279b;
        view.getLocationOnScreen(iArr);
        int i8 = iArr[0];
        int i10 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate((float) (iArr[0] - i8), (float) (iArr[1] - i10));
        b.I(matrix, fArr);
    }
}
