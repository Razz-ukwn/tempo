package y5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import r5.i;
import z5.e;
import z5.f;
import z5.g;

public class i extends a {

    /* renamed from: h  reason: collision with root package name */
    public final r5.i f17295h;

    /* renamed from: i  reason: collision with root package name */
    public final Path f17296i = new Path();

    /* renamed from: j  reason: collision with root package name */
    public final RectF f17297j = new RectF();

    /* renamed from: k  reason: collision with root package name */
    public float[] f17298k = new float[2];

    /* renamed from: l  reason: collision with root package name */
    public final Path f17299l;
    public final float[] m;

    /* renamed from: n  reason: collision with root package name */
    public final RectF f17300n;

    public i(g gVar, r5.i iVar, e eVar) {
        super(gVar, eVar, iVar);
        new Path();
        new RectF();
        this.f17299l = new Path();
        this.m = new float[2];
        this.f17300n = new RectF();
        this.f17295h = iVar;
        if (gVar != null) {
            this.f17256e.setColor(-16777216);
            this.f17256e.setTextSize(f.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public void h(Canvas canvas, float f10, float[] fArr, float f11) {
        r5.i iVar = this.f17295h;
        int i8 = iVar.E ? iVar.f14021l : iVar.f14021l - 1;
        for (int i10 = !iVar.D; i10 < i8; i10++) {
            canvas.drawText(iVar.b(i10), f10, fArr[(i10 * 2) + 1] + f11, this.f17256e);
        }
    }

    public RectF i() {
        RectF rectF = this.f17297j;
        rectF.set(((g) this.f12427a).f17756b);
        rectF.inset(0.0f, -this.f17253b.f14017h);
        return rectF;
    }

    public float[] j() {
        int length = this.f17298k.length;
        r5.i iVar = this.f17295h;
        int i8 = iVar.f14021l;
        if (length != i8 * 2) {
            this.f17298k = new float[(i8 * 2)];
        }
        float[] fArr = this.f17298k;
        for (int i10 = 0; i10 < fArr.length; i10 += 2) {
            fArr[i10 + 1] = iVar.f14020k[i10 / 2];
        }
        this.f17254c.f(fArr);
        return fArr;
    }

    public Path k(Path path, int i8, float[] fArr) {
        g gVar = (g) this.f12427a;
        int i10 = i8 + 1;
        path.moveTo(gVar.f17756b.left, fArr[i10]);
        path.lineTo(gVar.f17756b.right, fArr[i10]);
        return path;
    }

    public void l(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        r5.i iVar = this.f17295h;
        if (iVar.f14035a && iVar.f14027s) {
            float[] j10 = j();
            Paint paint = this.f17256e;
            paint.setTypeface((Typeface) null);
            paint.setTextSize(iVar.f14038d);
            paint.setColor(iVar.f14039e);
            float f13 = iVar.f14036b;
            float a10 = (((float) f.a(paint, "A")) / 2.5f) + iVar.f14037c;
            i.a aVar = i.a.f14064a;
            i.a aVar2 = iVar.I;
            int i8 = iVar.H;
            Object obj = this.f12427a;
            if (aVar2 == aVar) {
                if (i8 == 1) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f11 = ((g) obj).f17756b.left;
                    f10 = f11 - f13;
                    h(canvas, f10, j10, a10);
                }
                paint.setTextAlign(Paint.Align.LEFT);
                f12 = ((g) obj).f17756b.left;
            } else if (i8 == 1) {
                paint.setTextAlign(Paint.Align.LEFT);
                f12 = ((g) obj).f17756b.right;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f11 = ((g) obj).f17756b.right;
                f10 = f11 - f13;
                h(canvas, f10, j10, a10);
            }
            f10 = f12 + f13;
            h(canvas, f10, j10, a10);
        }
    }

    public void m(Canvas canvas) {
        r5.i iVar = this.f17295h;
        if (iVar.f14035a && iVar.f14026r) {
            Paint paint = this.f17257f;
            paint.setColor(iVar.f14018i);
            paint.setStrokeWidth(iVar.f14019j);
            i.a aVar = iVar.I;
            i.a aVar2 = i.a.f14064a;
            Object obj = this.f12427a;
            if (aVar == aVar2) {
                canvas.drawLine(((g) obj).f17756b.left, ((g) obj).f17756b.top, ((g) obj).f17756b.left, ((g) obj).f17756b.bottom, paint);
                return;
            }
            canvas.drawLine(((g) obj).f17756b.right, ((g) obj).f17756b.top, ((g) obj).f17756b.right, ((g) obj).f17756b.bottom, paint);
        }
    }

    public final void n(Canvas canvas) {
        r5.i iVar = this.f17295h;
        if (iVar.f14035a && iVar.f14025q) {
            int save = canvas.save();
            canvas.clipRect(i());
            float[] j10 = j();
            Paint paint = this.f17255d;
            paint.setColor(iVar.f14016g);
            paint.setStrokeWidth(iVar.f14017h);
            paint.setPathEffect(iVar.f14028t);
            Path path = this.f17296i;
            path.reset();
            for (int i8 = 0; i8 < j10.length; i8 += 2) {
                canvas.drawPath(k(path, i8, j10), paint);
                path.reset();
            }
            canvas.restoreToCount(save);
        }
    }

    public void o(Canvas canvas) {
        ArrayList arrayList = this.f17295h.f14029u;
        if (arrayList != null && arrayList.size() > 0) {
            float[] fArr = this.m;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.f17299l;
            path.reset();
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                if (((r5.g) arrayList.get(i8)).f14035a) {
                    int save = canvas.save();
                    RectF rectF = this.f17300n;
                    g gVar = (g) this.f12427a;
                    rectF.set(gVar.f17756b);
                    rectF.inset(0.0f, -0.0f);
                    canvas.clipRect(rectF);
                    Paint paint = this.f17258g;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(0);
                    paint.setStrokeWidth(0.0f);
                    paint.setPathEffect((PathEffect) null);
                    fArr[1] = 0.0f;
                    this.f17254c.f(fArr);
                    path.moveTo(gVar.f17756b.left, fArr[1]);
                    path.lineTo(gVar.f17756b.right, fArr[1]);
                    canvas.drawPath(path, paint);
                    path.reset();
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
