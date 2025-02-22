package z5;

import android.graphics.Matrix;
import android.graphics.Path;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f17739a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f17740b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final g f17741c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f17742d = new float[1];

    /* renamed from: e  reason: collision with root package name */
    public final Matrix f17743e = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    public final float[] f17744f = new float[2];

    /* renamed from: g  reason: collision with root package name */
    public final Matrix f17745g = new Matrix();

    public e(g gVar) {
        new Matrix();
        this.f17741c = gVar;
    }

    public final b a(float f10, float f11) {
        float[] fArr = this.f17744f;
        fArr[0] = f10;
        fArr[1] = f11;
        f(fArr);
        return b.b((double) fArr[0], (double) fArr[1]);
    }

    public final b b(float f10, float f11) {
        b b10 = b.b(0.0d, 0.0d);
        c(f10, f11, b10);
        return b10;
    }

    public final void c(float f10, float f11, b bVar) {
        float[] fArr = this.f17744f;
        fArr[0] = f10;
        fArr[1] = f11;
        e(fArr);
        bVar.f17726b = (double) fArr[0];
        bVar.f17727c = (double) fArr[1];
    }

    public final void d(Path path) {
        path.transform(this.f17739a);
        path.transform(this.f17741c.f17755a);
        path.transform(this.f17740b);
    }

    public final void e(float[] fArr) {
        Matrix matrix = this.f17743e;
        matrix.reset();
        this.f17740b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f17741c.f17755a.invert(matrix);
        matrix.mapPoints(fArr);
        this.f17739a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public final void f(float[] fArr) {
        this.f17739a.mapPoints(fArr);
        this.f17741c.f17755a.mapPoints(fArr);
        this.f17740b.mapPoints(fArr);
    }

    public void g() {
        Matrix matrix = this.f17740b;
        matrix.reset();
        g gVar = this.f17741c;
        matrix.postTranslate(gVar.f17756b.left, gVar.f17758d - gVar.j());
    }

    public final void h(float f10, float f11, float f12, float f13) {
        g gVar = this.f17741c;
        float a10 = gVar.a() / f11;
        float height = gVar.f17756b.height() / f12;
        if (Float.isInfinite(a10)) {
            a10 = 0.0f;
        }
        if (Float.isInfinite(height)) {
            height = 0.0f;
        }
        Matrix matrix = this.f17739a;
        matrix.reset();
        matrix.postTranslate(-f10, -f13);
        matrix.postScale(a10, -height);
    }
}
