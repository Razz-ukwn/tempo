package y5;

import android.graphics.Paint;
import android.graphics.RectF;
import p2.c;
import z5.b;
import z5.e;
import z5.f;
import z5.g;

public abstract class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public final r5.a f17253b;

    /* renamed from: c  reason: collision with root package name */
    public final e f17254c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f17255d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f17256e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f17257f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f17258g;

    public a(g gVar, e eVar, r5.a aVar) {
        super(gVar);
        this.f17254c = eVar;
        this.f17253b = aVar;
        if (gVar != null) {
            this.f17256e = new Paint(1);
            Paint paint = new Paint();
            this.f17255d = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.f17257f = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.f17258g = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    public void f(float f10, float f11) {
        g gVar = (g) this.f12427a;
        if (gVar != null && gVar.a() > 10.0f && !gVar.c()) {
            RectF rectF = gVar.f17756b;
            float f12 = rectF.left;
            float f13 = rectF.top;
            e eVar = this.f17254c;
            b b10 = eVar.b(f12, f13);
            RectF rectF2 = gVar.f17756b;
            b b11 = eVar.b(rectF2.left, rectF2.bottom);
            b.c(b10);
            b.c(b11);
            f10 = (float) b11.f17727c;
            f11 = (float) b10.f17727c;
        }
        g(f10, f11);
    }

    public void g(float f10, float f11) {
        double d10;
        int i8;
        r5.a aVar = this.f17253b;
        int i10 = aVar.f14022n;
        double abs = (double) Math.abs(f11 - f10);
        if (i10 == 0 || abs <= 0.0d || Double.isInfinite(abs)) {
            aVar.f14020k = new float[0];
            aVar.f14021l = 0;
            return;
        }
        double e10 = (double) f.e(abs / ((double) i10));
        if (aVar.f14024p) {
            double d11 = (double) aVar.f14023o;
            if (e10 < d11) {
                e10 = d11;
            }
        }
        double e11 = (double) f.e(Math.pow(10.0d, (double) ((int) Math.log10(e10))));
        if (((int) (e10 / e11)) > 5) {
            e10 = Math.floor(e11 * 10.0d);
        }
        int i11 = (e10 > 0.0d ? 1 : (e10 == 0.0d ? 0 : -1));
        double ceil = i11 == 0 ? 0.0d : Math.ceil(((double) f10) / e10) * e10;
        if (i11 == 0) {
            d10 = 0.0d;
        } else {
            d10 = Math.floor(((double) f11) / e10) * e10;
            if (d10 != Double.POSITIVE_INFINITY) {
                double d12 = d10 + 0.0d;
                d10 = Double.longBitsToDouble(Double.doubleToRawLongBits(d12) + (d12 >= 0.0d ? 1 : -1));
            }
        }
        if (i11 != 0) {
            i8 = 0;
            for (double d13 = ceil; d13 <= d10; d13 += e10) {
                i8++;
            }
        } else {
            i8 = 0;
        }
        aVar.f14021l = i8;
        if (aVar.f14020k.length < i8) {
            aVar.f14020k = new float[i8];
        }
        for (int i12 = 0; i12 < i8; i12++) {
            if (ceil == 0.0d) {
                ceil = 0.0d;
            }
            aVar.f14020k[i12] = (float) ceil;
            ceil += e10;
        }
        if (e10 < 1.0d) {
            aVar.m = (int) Math.ceil(-Math.log10(e10));
        } else {
            aVar.m = 0;
        }
    }
}
