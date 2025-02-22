package ac;

import a2.b;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.lassi.presentation.cropper.CropOverlayView;

public final class c extends Animation implements Animation.AnimationListener {
    public final RectF B = new RectF();
    public final float[] C = new float[9];
    public final float[] D = new float[9];
    public final RectF E = new RectF();
    public final float[] F = new float[8];
    public final float[] G = new float[9];

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f283a;

    /* renamed from: b  reason: collision with root package name */
    public final CropOverlayView f284b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f285c = new float[8];

    /* renamed from: d  reason: collision with root package name */
    public final float[] f286d = new float[8];

    /* renamed from: e  reason: collision with root package name */
    public final RectF f287e = new RectF();

    public c(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f283a = imageView;
        this.f284b = cropOverlayView;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void applyTransformation(float f10, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.E;
        RectF rectF2 = this.f287e;
        float f11 = rectF2.left;
        RectF rectF3 = this.B;
        rectF.left = b.b(rectF3.left, f11, f10, f11);
        float f12 = rectF2.top;
        rectF.top = b.b(rectF3.top, f12, f10, f12);
        float f13 = rectF2.right;
        rectF.right = b.b(rectF3.right, f13, f10, f13);
        float f14 = rectF2.bottom;
        rectF.bottom = b.b(rectF3.bottom, f14, f10, f14);
        CropOverlayView cropOverlayView = this.f284b;
        cropOverlayView.setCropWindowRect(rectF);
        int i8 = 0;
        int i10 = 0;
        while (true) {
            fArr = this.F;
            if (i10 >= fArr.length) {
                break;
            }
            float f15 = this.f285c[i10];
            fArr[i10] = b.b(this.f286d[i10], f15, f10, f15);
            i10++;
        }
        ImageView imageView = this.f283a;
        cropOverlayView.g(fArr, imageView.getWidth(), imageView.getHeight());
        while (true) {
            float[] fArr2 = this.G;
            if (i8 < fArr2.length) {
                float f16 = this.C[i8];
                fArr2[i8] = b.b(this.D[i8], f16, f10, f16);
                i8++;
            } else {
                Matrix imageMatrix = imageView.getImageMatrix();
                imageMatrix.setValues(fArr2);
                imageView.setImageMatrix(imageMatrix);
                imageView.invalidate();
                cropOverlayView.invalidate();
                return;
            }
        }
    }

    public final void onAnimationEnd(Animation animation) {
        this.f283a.clearAnimation();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
