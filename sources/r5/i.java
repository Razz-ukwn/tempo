package r5;

import android.graphics.Paint;
import android.util.DisplayMetrics;
import z5.f;

public final class i extends a {
    public final boolean D = true;
    public final boolean E = true;
    public final float F = 10.0f;
    public final float G = 10.0f;
    public final int H = 1;
    public final a I;
    public final float J = Float.POSITIVE_INFINITY;

    public enum a {
        f14064a,
        f14065b;

        /* access modifiers changed from: public */
        a() {
        }
    }

    public i(a aVar) {
        this.I = aVar;
        this.f14037c = 0.0f;
    }

    public final void a(float f10, float f11) {
        if (Math.abs(f11 - f10) == 0.0f) {
            f11 += 1.0f;
            f10 -= 1.0f;
        }
        float abs = Math.abs(f11 - f10);
        float f12 = this.f14033y ? this.B : f10 - ((abs / 100.0f) * this.G);
        this.B = f12;
        float f13 = this.f14034z ? this.A : f11 + ((abs / 100.0f) * this.F);
        this.A = f13;
        this.C = Math.abs(f12 - f13);
    }

    public final float e(Paint paint) {
        paint.setTextSize(this.f14038d);
        String c3 = c();
        DisplayMetrics displayMetrics = f.f17746a;
        float measureText = (this.f14036b * 2.0f) + ((float) ((int) paint.measureText(c3)));
        float f10 = this.J;
        if (f10 > 0.0f && f10 != Float.POSITIVE_INFINITY) {
            f10 = f.c(f10);
        }
        if (((double) f10) <= 0.0d) {
            f10 = measureText;
        }
        return Math.max(0.0f, Math.min(measureText, f10));
    }
}
