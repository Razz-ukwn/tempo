package v8;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

public final class l {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f16316a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f16317b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f16318c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f16319d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f16320e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f16321f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f16322g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f16323h = new ArrayList();

    public static class a extends f {

        /* renamed from: c  reason: collision with root package name */
        public final c f16324c;

        public a(c cVar) {
            this.f16324c = cVar;
        }

        public final void a(Matrix matrix, u8.a aVar, int i8, Canvas canvas) {
            u8.a aVar2 = aVar;
            int i10 = i8;
            Canvas canvas2 = canvas;
            c cVar = this.f16324c;
            float f10 = cVar.f16333f;
            float f11 = cVar.f16334g;
            RectF rectF = new RectF(cVar.f16329b, cVar.f16330c, cVar.f16331d, cVar.f16332e);
            aVar.getClass();
            boolean z10 = f11 < 0.0f;
            Path path = aVar2.f15893g;
            int[] iArr = u8.a.f15885k;
            if (z10) {
                iArr[0] = 0;
                iArr[1] = aVar2.f15892f;
                iArr[2] = aVar2.f15891e;
                iArr[3] = aVar2.f15890d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = (float) (-i10);
                rectF.inset(f12, f12);
                iArr[0] = 0;
                iArr[1] = aVar2.f15890d;
                iArr[2] = aVar2.f15891e;
                iArr[3] = aVar2.f15892f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f13 = 1.0f - (((float) i10) / width);
                float[] fArr = u8.a.f15886l;
                fArr[1] = f13;
                fArr[2] = ((1.0f - f13) / 2.0f) + f13;
                RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
                Paint paint = aVar2.f15888b;
                paint.setShader(radialGradient);
                canvas.save();
                canvas2.concat(matrix);
                canvas2.scale(1.0f, rectF.height() / rectF.width());
                if (!z10) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f15894h);
                }
                canvas.drawArc(rectF, f10, f11, true, paint);
                canvas.restore();
            }
        }
    }

    public static class b extends f {

        /* renamed from: c  reason: collision with root package name */
        public final d f16325c;

        /* renamed from: d  reason: collision with root package name */
        public final float f16326d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16327e;

        public b(d dVar, float f10, float f11) {
            this.f16325c = dVar;
            this.f16326d = f10;
            this.f16327e = f11;
        }

        public final void a(Matrix matrix, u8.a aVar, int i8, Canvas canvas) {
            u8.a aVar2 = aVar;
            int i10 = i8;
            Canvas canvas2 = canvas;
            d dVar = this.f16325c;
            float f10 = dVar.f16336c;
            float f11 = this.f16327e;
            float f12 = dVar.f16335b;
            float f13 = this.f16326d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f10 - f11), (double) (f12 - f13)), 0.0f);
            Matrix matrix2 = this.f16339a;
            matrix2.set(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += (float) i10;
            rectF.offset(0.0f, (float) (-i10));
            int[] iArr = u8.a.f15883i;
            iArr[0] = aVar2.f15892f;
            iArr[1] = aVar2.f15891e;
            iArr[2] = aVar2.f15890d;
            Paint paint = aVar2.f15889c;
            float f14 = rectF.left;
            paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, u8.a.f15884j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas2.concat(matrix2);
            canvas2.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f16325c;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f16336c - this.f16327e) / (dVar.f16335b - this.f16326d))));
        }
    }

    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f16328h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f16329b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f16330c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f16331d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f16332e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f16333f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f16334g;

        public c(float f10, float f11, float f12, float f13) {
            this.f16329b = f10;
            this.f16330c = f11;
            this.f16331d = f12;
            this.f16332e = f13;
        }

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f16337a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f16328h;
            rectF.set(this.f16329b, this.f16330c, this.f16331d, this.f16332e);
            path.arcTo(rectF, this.f16333f, this.f16334g, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f16335b;

        /* renamed from: c  reason: collision with root package name */
        public float f16336c;

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f16337a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f16335b, this.f16336c);
            path.transform(matrix);
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f16337a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class f {

        /* renamed from: b  reason: collision with root package name */
        public static final Matrix f16338b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f16339a = new Matrix();

        public abstract void a(Matrix matrix, u8.a aVar, int i8, Canvas canvas);
    }

    public l() {
        e(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        c cVar = new c(f10, f11, f12, f13);
        cVar.f16333f = f14;
        cVar.f16334g = f15;
        this.f16322g.add(cVar);
        a aVar = new a(cVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        float f17 = z10 ? (180.0f + f16) % 360.0f : f16;
        b(f14);
        this.f16323h.add(aVar);
        this.f16320e = f17;
        double d10 = (double) f16;
        this.f16318c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.f16319d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f16320e;
        if (f11 != f10) {
            float f12 = ((f10 - f11) + 360.0f) % 360.0f;
            if (f12 <= 180.0f) {
                float f13 = this.f16318c;
                float f14 = this.f16319d;
                c cVar = new c(f13, f14, f13, f14);
                cVar.f16333f = this.f16320e;
                cVar.f16334g = f12;
                this.f16323h.add(new a(cVar));
                this.f16320e = f10;
            }
        }
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f16322g;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((e) arrayList.get(i8)).a(matrix, path);
        }
    }

    public final void d(float f10, float f11) {
        d dVar = new d();
        dVar.f16335b = f10;
        dVar.f16336c = f11;
        this.f16322g.add(dVar);
        b bVar = new b(dVar, this.f16318c, this.f16319d);
        b(bVar.b() + 270.0f);
        this.f16323h.add(bVar);
        this.f16320e = bVar.b() + 270.0f;
        this.f16318c = f10;
        this.f16319d = f11;
    }

    public final void e(float f10, float f11, float f12) {
        this.f16316a = 0.0f;
        this.f16317b = f10;
        this.f16318c = 0.0f;
        this.f16319d = f10;
        this.f16320e = f11;
        this.f16321f = (f11 + f12) % 360.0f;
        this.f16322g.clear();
        this.f16323h.clear();
    }
}
