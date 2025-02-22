package y5;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import p5.a;
import z5.g;

public abstract class f extends g {
    public f(a aVar, g gVar) {
        super(aVar, gVar);
    }

    public final void o(Canvas canvas, Path path, Drawable drawable) {
        DisplayMetrics displayMetrics = z5.f.f17746a;
        int save = canvas.save();
        canvas.clipPath(path);
        RectF rectF = ((g) this.f12427a).f17756b;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }
}
