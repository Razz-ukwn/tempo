package y5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import z5.a;
import z5.b;
import z5.c;
import z5.d;
import z5.e;
import z5.f;
import z5.g;

public class h extends a {

    /* renamed from: h  reason: collision with root package name */
    public final r5.h f17288h;

    /* renamed from: i  reason: collision with root package name */
    public final Path f17289i = new Path();

    /* renamed from: j  reason: collision with root package name */
    public float[] f17290j = new float[2];

    /* renamed from: k  reason: collision with root package name */
    public final RectF f17291k = new RectF();

    /* renamed from: l  reason: collision with root package name */
    public final float[] f17292l = new float[2];
    public final RectF m = new RectF();

    /* renamed from: n  reason: collision with root package name */
    public final float[] f17293n = new float[4];

    /* renamed from: o  reason: collision with root package name */
    public final Path f17294o = new Path();

    public h(g gVar, r5.h hVar, e eVar) {
        super(gVar, eVar, hVar);
        this.f17288h = hVar;
        this.f17256e.setColor(-16777216);
        this.f17256e.setTextAlign(Paint.Align.CENTER);
        this.f17256e.setTextSize(f.c(10.0f));
    }

    public void f(float f10, float f11) {
        g gVar = (g) this.f12427a;
        if (gVar.a() > 10.0f && !gVar.b()) {
            RectF rectF = gVar.f17756b;
            float f12 = rectF.left;
            float f13 = rectF.top;
            e eVar = this.f17254c;
            b b10 = eVar.b(f12, f13);
            RectF rectF2 = gVar.f17756b;
            b b11 = eVar.b(rectF2.right, rectF2.top);
            b.c(b10);
            b.c(b11);
            f10 = (float) b10.f17726b;
            f11 = (float) b11.f17726b;
        }
        g(f10, f11);
    }

    public final void g(float f10, float f11) {
        super.g(f10, f11);
        h();
    }

    public void h() {
        r5.h hVar = this.f17288h;
        String c3 = hVar.c();
        Paint paint = this.f17256e;
        paint.setTypeface((Typeface) null);
        paint.setTextSize(hVar.f14038d);
        a b10 = f.b(paint, c3);
        float f10 = b10.f17723b;
        float a10 = (float) f.a(paint, "Q");
        a d10 = f.d(f10, a10);
        Math.round(f10);
        Math.round(a10);
        Math.round(d10.f17723b);
        hVar.D = Math.round(d10.f17724c);
        d<a> dVar = a.f17722d;
        dVar.c(d10);
        dVar.c(b10);
    }

    public void i(Canvas canvas, float f10, float f11, Path path) {
        g gVar = (g) this.f12427a;
        path.moveTo(f10, gVar.f17756b.bottom);
        path.lineTo(f10, gVar.f17756b.top);
        canvas.drawPath(path, this.f17255d);
        path.reset();
    }

    public final void j(Canvas canvas, String str, float f10, float f11, c cVar) {
        Paint paint = this.f17256e;
        Paint.FontMetrics fontMetrics = f.f17754i;
        float fontMetrics2 = paint.getFontMetrics(fontMetrics);
        int length = str.length();
        Rect rect = f.f17753h;
        paint.getTextBounds(str, 0, length, rect);
        float f12 = 0.0f - ((float) rect.left);
        float f13 = (-fontMetrics.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (!(cVar.f17729b == 0.0f && cVar.f17730c == 0.0f)) {
            f12 -= ((float) rect.width()) * cVar.f17729b;
            f13 -= fontMetrics2 * cVar.f17730c;
        }
        canvas.drawText(str, f12 + f10, f13 + f11, paint);
        paint.setTextAlign(textAlign);
    }

    public void k(Canvas canvas, float f10, c cVar) {
        r5.h hVar = this.f17288h;
        hVar.getClass();
        int i8 = hVar.f14021l * 2;
        float[] fArr = new float[i8];
        for (int i10 = 0; i10 < i8; i10 += 2) {
            fArr[i10] = hVar.f14020k[i10 / 2];
        }
        this.f17254c.f(fArr);
        for (int i11 = 0; i11 < i8; i11 += 2) {
            float f11 = fArr[i11];
            g gVar = (g) this.f12427a;
            if (gVar.e(f11) && gVar.f(f11)) {
                j(canvas, hVar.d().a(hVar.f14020k[i11 / 2]), f11, f10, cVar);
            }
        }
    }

    public RectF l() {
        RectF rectF = this.f17291k;
        rectF.set(((g) this.f12427a).f17756b);
        rectF.inset(-this.f17253b.f14017h, 0.0f);
        return rectF;
    }

    public void m(Canvas canvas) {
        r5.h hVar = this.f17288h;
        if (hVar.f14035a && hVar.f14027s) {
            float f10 = hVar.f14037c;
            Paint paint = this.f17256e;
            paint.setTypeface((Typeface) null);
            paint.setTextSize(hVar.f14038d);
            paint.setColor(hVar.f14039e);
            c b10 = c.b(0.0f, 0.0f);
            int i8 = hVar.E;
            Object obj = this.f12427a;
            if (i8 == 1) {
                b10.f17729b = 0.5f;
                b10.f17730c = 1.0f;
                k(canvas, ((g) obj).f17756b.top - f10, b10);
            } else if (i8 == 4) {
                b10.f17729b = 0.5f;
                b10.f17730c = 1.0f;
                k(canvas, ((g) obj).f17756b.top + f10 + ((float) hVar.D), b10);
            } else if (i8 == 2) {
                b10.f17729b = 0.5f;
                b10.f17730c = 0.0f;
                k(canvas, ((g) obj).f17756b.bottom + f10, b10);
            } else if (i8 == 5) {
                b10.f17729b = 0.5f;
                b10.f17730c = 0.0f;
                k(canvas, (((g) obj).f17756b.bottom - f10) - ((float) hVar.D), b10);
            } else {
                b10.f17729b = 0.5f;
                b10.f17730c = 1.0f;
                g gVar = (g) obj;
                k(canvas, gVar.f17756b.top - f10, b10);
                b10.f17729b = 0.5f;
                b10.f17730c = 0.0f;
                k(canvas, gVar.f17756b.bottom + f10, b10);
            }
            c.d(b10);
        }
    }

    public void n(Canvas canvas) {
        r5.h hVar = this.f17288h;
        if (hVar.f14026r && hVar.f14035a) {
            Paint paint = this.f17257f;
            paint.setColor(hVar.f14018i);
            paint.setStrokeWidth(hVar.f14019j);
            paint.setPathEffect((PathEffect) null);
            int i8 = hVar.E;
            Object obj = this.f12427a;
            if (i8 == 1 || i8 == 4 || i8 == 3) {
                RectF rectF = ((g) obj).f17756b;
                float f10 = rectF.left;
                float f11 = rectF.top;
                canvas.drawLine(f10, f11, rectF.right, f11, paint);
            }
            int i10 = hVar.E;
            if (i10 == 2 || i10 == 5 || i10 == 3) {
                RectF rectF2 = ((g) obj).f17756b;
                float f12 = rectF2.left;
                float f13 = rectF2.bottom;
                canvas.drawLine(f12, f13, rectF2.right, f13, paint);
            }
        }
    }

    public final void o(Canvas canvas) {
        r5.h hVar = this.f17288h;
        if (hVar.f14025q && hVar.f14035a) {
            int save = canvas.save();
            canvas.clipRect(l());
            if (this.f17290j.length != this.f17253b.f14021l * 2) {
                this.f17290j = new float[(hVar.f14021l * 2)];
            }
            float[] fArr = this.f17290j;
            for (int i8 = 0; i8 < fArr.length; i8 += 2) {
                float[] fArr2 = hVar.f14020k;
                int i10 = i8 / 2;
                fArr[i8] = fArr2[i10];
                fArr[i8 + 1] = fArr2[i10];
            }
            this.f17254c.f(fArr);
            Paint paint = this.f17255d;
            paint.setColor(hVar.f14016g);
            paint.setStrokeWidth(hVar.f14017h);
            paint.setPathEffect(hVar.f14028t);
            Path path = this.f17289i;
            path.reset();
            for (int i11 = 0; i11 < fArr.length; i11 += 2) {
                i(canvas, fArr[i11], fArr[i11 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }

    public void p(Canvas canvas) {
        ArrayList arrayList = this.f17288h.f14029u;
        if (arrayList != null && arrayList.size() > 0) {
            float[] fArr = this.f17292l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                if (((r5.g) arrayList.get(i8)).f14035a) {
                    int save = canvas.save();
                    RectF rectF = this.m;
                    g gVar = (g) this.f12427a;
                    rectF.set(gVar.f17756b);
                    rectF.inset(-0.0f, 0.0f);
                    canvas.clipRect(rectF);
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    this.f17254c.f(fArr);
                    float f10 = fArr[0];
                    float[] fArr2 = this.f17293n;
                    fArr2[0] = f10;
                    RectF rectF2 = gVar.f17756b;
                    fArr2[1] = rectF2.top;
                    fArr2[2] = fArr[0];
                    fArr2[3] = rectF2.bottom;
                    Path path = this.f17294o;
                    path.reset();
                    path.moveTo(fArr2[0], fArr2[1]);
                    path.lineTo(fArr2[2], fArr2[3]);
                    Paint paint = this.f17258g;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(0);
                    paint.setStrokeWidth(0.0f);
                    paint.setPathEffect((PathEffect) null);
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
