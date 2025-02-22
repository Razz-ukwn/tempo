package p8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import b1.b;

public final class d extends m<h> {

    /* renamed from: c  reason: collision with root package name */
    public int f12490c = 1;

    /* renamed from: d  reason: collision with root package name */
    public float f12491d;

    /* renamed from: e  reason: collision with root package name */
    public float f12492e;

    /* renamed from: f  reason: collision with root package name */
    public float f12493f;

    public d(h hVar) {
        super(hVar);
    }

    public final void a(Canvas canvas, Paint paint, float f10, float f11, int i8) {
        if (f10 != f11) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i8);
            paint.setStrokeWidth(this.f12491d);
            float f12 = (float) this.f12490c;
            float f13 = f10 * 360.0f * f12;
            if (f11 < f10) {
                f11 += 1.0f;
            }
            float f14 = (f11 - f10) * 360.0f * f12;
            float f15 = this.f12493f;
            float f16 = -f15;
            canvas.drawArc(new RectF(f16, f16, f15, f15), f13, f14, false, paint);
            if (this.f12492e > 0.0f && Math.abs(f14) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                float f17 = this.f12491d;
                float f18 = this.f12492e;
                canvas.save();
                canvas.rotate(f13);
                float f19 = this.f12493f;
                float f20 = f17 / 2.0f;
                canvas.drawRoundRect(new RectF(f19 - f20, f18, f19 + f20, -f18), f18, f18, paint);
                canvas.restore();
                float f21 = this.f12491d;
                float f22 = this.f12492e;
                canvas.save();
                canvas.rotate(f13 + f14);
                float f23 = this.f12493f;
                float f24 = f21 / 2.0f;
                canvas.drawRoundRect(new RectF(f23 - f24, f22, f23 + f24, -f22), f22, f22, paint);
                canvas.restore();
            }
        }
    }

    public final void b(Canvas canvas, Paint paint) {
        int b10 = b.b(((h) this.f12518a).f12487d, this.f12519b.F);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(b10);
        paint.setStrokeWidth(this.f12491d);
        float f10 = this.f12493f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), 0.0f, 360.0f, false, paint);
    }

    public final int d() {
        S s10 = this.f12518a;
        return (((h) s10).f12509h * 2) + ((h) s10).f12508g;
    }
}
