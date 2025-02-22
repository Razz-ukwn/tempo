package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import b7.a;
import cb.b;
import sf.j;

public final class c1 implements b1 {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f1269a = new int[2];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f1270b = a.s();

    public final void a(View view, float[] fArr) {
        j.f(view, "view");
        j.f(fArr, "matrix");
        int i8 = 0;
        while (i8 < 4) {
            int i10 = 0;
            while (i10 < 4) {
                fArr[(i10 * 4) + i8] = i8 == i10 ? 1.0f : 0.0f;
                i10++;
            }
            i8++;
        }
        c(view, fArr);
    }

    public final void b(float[] fArr, float f10, float f11) {
        int i8 = 0;
        while (true) {
            float[] fArr2 = this.f1270b;
            if (i8 < 4) {
                int i10 = 0;
                while (i10 < 4) {
                    fArr2[(i10 * 4) + i8] = i8 == i10 ? 1.0f : 0.0f;
                    i10++;
                }
                i8++;
            } else {
                float f12 = (fArr2[8] * 0.0f) + (fArr2[4] * f11) + (fArr2[0] * f10) + fArr2[12];
                float f13 = (fArr2[9] * 0.0f) + (fArr2[5] * f11) + (fArr2[1] * f10) + fArr2[13];
                float f14 = (fArr2[10] * 0.0f) + (fArr2[6] * f11) + (fArr2[2] * f10) + fArr2[14];
                float f15 = fArr2[3] * f10;
                float f16 = fArr2[11] * 0.0f;
                fArr2[12] = f12;
                fArr2[13] = f13;
                fArr2[14] = f14;
                fArr2[15] = f16 + (fArr2[7] * f11) + f15 + fArr2[15];
                n0.a(fArr, fArr2);
                return;
            }
        }
    }

    public final void c(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            c((View) parent, fArr);
            b(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            b(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            int[] iArr = this.f1269a;
            view.getLocationInWindow(iArr);
            b(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            b(fArr, (float) iArr[0], (float) iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr2 = this.f1270b;
            b.I(matrix, fArr2);
            n0.a(fArr, fArr2);
        }
    }
}
