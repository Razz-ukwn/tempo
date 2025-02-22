package z5;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f17755a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f17756b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public float f17757c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f17758d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f17759e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f17760f = Float.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f17761g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f17762h = Float.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public float f17763i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f17764j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f17765k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f17766l = 0.0f;
    public float m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public final Matrix f17767n = new Matrix();

    /* renamed from: o  reason: collision with root package name */
    public final float[] f17768o = new float[9];

    public final float a() {
        return this.f17756b.width();
    }

    public final boolean b() {
        float f10 = this.f17763i;
        float f11 = this.f17761g;
        return f10 <= f11 && f11 <= 1.0f;
    }

    public final boolean c() {
        float f10 = this.f17764j;
        float f11 = this.f17759e;
        return f10 <= f11 && f11 <= 1.0f;
    }

    public final boolean d(float f10) {
        return this.f17756b.bottom >= ((float) ((int) (f10 * 100.0f))) / 100.0f;
    }

    public final boolean e(float f10) {
        return this.f17756b.left <= f10 + 1.0f;
    }

    public final boolean f(float f10) {
        return this.f17756b.right >= (((float) ((int) (f10 * 100.0f))) / 100.0f) - 1.0f;
    }

    public final boolean g(float f10) {
        return this.f17756b.top <= f10;
    }

    public final boolean h(float f10) {
        return g(f10) && d(f10);
    }

    public final void i(Matrix matrix, RectF rectF) {
        float f10;
        float f11;
        float[] fArr = this.f17768o;
        matrix.getValues(fArr);
        float f12 = fArr[2];
        float f13 = fArr[0];
        float f14 = fArr[5];
        float f15 = fArr[4];
        this.f17763i = Math.min(Math.max(this.f17761g, f13), this.f17762h);
        this.f17764j = Math.min(Math.max(this.f17759e, f15), this.f17760f);
        if (rectF != null) {
            f11 = rectF.width();
            f10 = rectF.height();
        } else {
            f11 = 0.0f;
            f10 = 0.0f;
        }
        this.f17765k = Math.min(Math.max(f12, ((this.f17763i - 1.0f) * (-f11)) - this.f17766l), this.f17766l);
        float max = Math.max(Math.min(f14, ((this.f17764j - 1.0f) * f10) + this.m), -this.m);
        fArr[2] = this.f17765k;
        fArr[0] = this.f17763i;
        fArr[5] = max;
        fArr[4] = this.f17764j;
        matrix.setValues(fArr);
    }

    public final float j() {
        return this.f17758d - this.f17756b.bottom;
    }

    public final void k(Matrix matrix, View view, boolean z10) {
        Matrix matrix2 = this.f17755a;
        matrix2.set(matrix);
        i(matrix2, this.f17756b);
        if (z10) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }
}
