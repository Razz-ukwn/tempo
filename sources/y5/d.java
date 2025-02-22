package y5;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import p2.c;
import r5.e;
import z5.f;
import z5.g;

public final class d extends c {

    /* renamed from: b  reason: collision with root package name */
    public final Paint f17268b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f17269c;

    /* renamed from: d  reason: collision with root package name */
    public final e f17270d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f17271e = new ArrayList(16);

    /* renamed from: f  reason: collision with root package name */
    public final Paint.FontMetrics f17272f = new Paint.FontMetrics();

    /* renamed from: g  reason: collision with root package name */
    public final Path f17273g = new Path();

    public d(g gVar, e eVar) {
        super(gVar);
        this.f17270d = eVar;
        Paint paint = new Paint(1);
        this.f17268b = paint;
        paint.setTextSize(f.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.f17269c = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    public final void f(Canvas canvas, float f10, float f11, r5.f fVar, e eVar) {
        int i8 = fVar.f14063f;
        if (i8 != 1122868 && i8 != 1122867 && i8 != 0) {
            int save = canvas.save();
            int i10 = fVar.f14059b;
            if (i10 == 3) {
                i10 = eVar.f14047k;
            }
            Paint paint = this.f17269c;
            paint.setColor(i8);
            float f12 = fVar.f14060c;
            if (Float.isNaN(f12)) {
                f12 = eVar.f14048l;
            }
            float c3 = f.c(f12);
            float f13 = c3 / 2.0f;
            int c10 = q.g.c(i10);
            if (c10 != 2) {
                if (c10 == 3) {
                    paint.setStyle(Paint.Style.FILL);
                    float f14 = f11 + f13;
                    canvas.drawRect(f10, f11 - f13, f10 + c3, f14, paint);
                } else if (c10 != 4) {
                    if (c10 == 5) {
                        float f15 = fVar.f14061d;
                        if (Float.isNaN(f15)) {
                            f15 = eVar.m;
                        }
                        float c11 = f.c(f15);
                        DashPathEffect dashPathEffect = fVar.f14062e;
                        if (dashPathEffect == null) {
                            eVar.getClass();
                            dashPathEffect = null;
                        }
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeWidth(c11);
                        paint.setPathEffect(dashPathEffect);
                        Path path = this.f17273g;
                        path.reset();
                        path.moveTo(f10, f11);
                        path.lineTo(f10 + c3, f11);
                        canvas.drawPath(path, paint);
                    }
                }
                canvas.restoreToCount(save);
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f10 + f13, f11, f13, paint);
            canvas.restoreToCount(save);
        }
    }
}
