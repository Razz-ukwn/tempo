package i0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import h0.a;
import h0.d;
import h0.f;

public final class e implements o {

    /* renamed from: a  reason: collision with root package name */
    public final Path f9366a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f9367b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f9368c;

    public e() {
        this(0);
    }

    public e(int i8) {
        this.f9366a = new Path();
        this.f9367b = new RectF();
        this.f9368c = new float[8];
        new Matrix();
    }

    public final void a(f fVar) {
        RectF rectF = this.f9367b;
        rectF.set(fVar.f9078a, fVar.f9079b, fVar.f9080c, fVar.f9081d);
        long j10 = fVar.f9082e;
        float b10 = a.b(j10);
        float[] fArr = this.f9368c;
        fArr[0] = b10;
        fArr[1] = a.c(j10);
        long j11 = fVar.f9083f;
        fArr[2] = a.b(j11);
        fArr[3] = a.c(j11);
        long j12 = fVar.f9084g;
        fArr[4] = a.b(j12);
        fArr[5] = a.c(j12);
        long j13 = fVar.f9085h;
        fArr[6] = a.b(j13);
        fArr[7] = a.c(j13);
        this.f9366a.addRoundRect(rectF, fArr, Path.Direction.CCW);
    }

    public final void b(d dVar) {
        float f10 = dVar.f9074a;
        if (!Float.isNaN(f10)) {
            float f11 = dVar.f9075b;
            if (!Float.isNaN(f11)) {
                float f12 = dVar.f9076c;
                if (!Float.isNaN(f12)) {
                    float f13 = dVar.f9077d;
                    if (!Float.isNaN(f13)) {
                        RectF rectF = this.f9367b;
                        rectF.set(f10, f11, f12, f13);
                        this.f9366a.addRect(rectF, Path.Direction.CCW);
                        return;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    public final void reset() {
        this.f9366a.reset();
    }
}
