package a9;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import v8.f;
import v8.i;

public class g extends f {
    public static final /* synthetic */ int U = 0;
    public final RectF T;

    @TargetApi(18)
    public static class a extends g {
        public a(i iVar) {
            super(iVar);
        }

        public final void g(Canvas canvas) {
            RectF rectF = this.T;
            if (rectF.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(rectF);
            super.g(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(iVar == null ? new i() : iVar);
        this.T = new RectF();
    }

    public final void s(float f10, float f11, float f12, float f13) {
        RectF rectF = this.T;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }
}
