package p8;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import p8.c;

public abstract class m<S extends c> {

    /* renamed from: a  reason: collision with root package name */
    public final S f12518a;

    /* renamed from: b  reason: collision with root package name */
    public l f12519b;

    public m(S s10) {
        this.f12518a = s10;
    }

    public abstract void a(Canvas canvas, Paint paint, float f10, float f11, int i8);

    public abstract void b(Canvas canvas, Paint paint);

    public final void c(Canvas canvas, Rect rect, float f10) {
        this.f12518a.getClass();
        d dVar = (d) this;
        float width = ((float) rect.width()) / ((float) dVar.d());
        float height = ((float) rect.height()) / ((float) dVar.d());
        h hVar = (h) dVar.f12518a;
        float f11 = (((float) hVar.f12508g) / 2.0f) + ((float) hVar.f12509h);
        canvas.translate((f11 * width) + ((float) rect.left), (f11 * height) + ((float) rect.top));
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        boolean z10 = true;
        dVar.f12490c = hVar.f12510i == 0 ? 1 : -1;
        int i8 = hVar.f12484a;
        dVar.f12491d = ((float) i8) * f10;
        dVar.f12492e = ((float) hVar.f12485b) * f10;
        dVar.f12493f = ((float) (hVar.f12508g - i8)) / 2.0f;
        ValueAnimator valueAnimator = dVar.f12519b.f12516d;
        if (!(valueAnimator != null && valueAnimator.isRunning()) || hVar.f12488e != 2) {
            ValueAnimator valueAnimator2 = dVar.f12519b.f12517e;
            if (!(valueAnimator2 != null && valueAnimator2.isRunning()) || hVar.f12489f != 1) {
                ValueAnimator valueAnimator3 = dVar.f12519b.f12516d;
                if (!(valueAnimator3 != null && valueAnimator3.isRunning()) || hVar.f12488e != 1) {
                    ValueAnimator valueAnimator4 = dVar.f12519b.f12517e;
                    if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                        z10 = false;
                    }
                    if (!z10 || hVar.f12489f != 2) {
                        return;
                    }
                }
                dVar.f12493f -= ((1.0f - f10) * ((float) hVar.f12484a)) / 2.0f;
                return;
            }
        }
        dVar.f12493f = (((1.0f - f10) * ((float) hVar.f12484a)) / 2.0f) + dVar.f12493f;
    }
}
