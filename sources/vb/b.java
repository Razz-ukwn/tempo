package vb;

import android.content.Context;
import android.graphics.PointF;
import android.widget.FrameLayout;
import tb.e;

public abstract class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16362a;

    /* renamed from: b  reason: collision with root package name */
    public e f16363b;

    /* renamed from: c  reason: collision with root package name */
    public PointF[] f16364c;

    public b(Context context) {
        super(context);
        b(context);
    }

    public static float a(float f10, float f11, float f12, float f13) {
        if (f11 < f12) {
            f11 = f12;
        }
        if (f11 > f13) {
            f11 = f13;
        }
        float f14 = ((f13 - f12) / 50.0f) / 2.0f;
        return (f11 < f10 - f14 || f11 > f14 + f10) ? f11 : f10;
    }

    public void b(Context context) {
    }

    public abstract float c(float f10, float f11, float f12);

    public final e getGestureType() {
        return this.f16363b;
    }

    public final PointF[] getPoints() {
        return this.f16364c;
    }

    public void setGestureType(e eVar) {
        this.f16363b = eVar;
    }
}
