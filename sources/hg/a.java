package hg;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import gg.a;
import sf.j;

public final class a {
    public static final void a(gg.a aVar, Canvas canvas, Paint paint, float f10) {
        j.f(aVar, "<this>");
        j.f(canvas, "canvas");
        j.f(paint, "paint");
        if (j.a(aVar, a.d.f8995a)) {
            canvas.drawRect(0.0f, 0.0f, f10, f10, paint);
        } else if (j.a(aVar, a.C0161a.f8990a)) {
            RectF rectF = a.C0161a.f8991b;
            rectF.set(0.0f, 0.0f, f10, f10);
            canvas.drawOval(rectF, paint);
        } else if (aVar instanceof a.c) {
            a.c cVar = (a.c) aVar;
            float f11 = 0.0f * f10;
            float f12 = (f10 - f11) / 2.0f;
            canvas.drawRect(0.0f, f12, f10, f12 + f11, paint);
        } else if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            boolean z10 = bVar.f8993b;
            Drawable drawable = bVar.f8992a;
            if (!z10) {
                drawable.setAlpha(paint.getAlpha());
            } else if (Build.VERSION.SDK_INT >= 29) {
                drawable.setColorFilter(new BlendModeColorFilter(paint.getColor(), BlendMode.SRC_IN));
            } else {
                drawable.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
            }
            int i8 = (int) (bVar.f8994c * f10);
            int i10 = (int) ((f10 - ((float) i8)) / 2.0f);
            drawable.setBounds(0, i10, (int) f10, i8 + i10);
            drawable.draw(canvas);
        }
    }
}
