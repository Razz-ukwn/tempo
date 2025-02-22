package vb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import tb.e;

public final class f extends b {
    public boolean B;

    /* renamed from: d  reason: collision with root package name */
    public ScaleGestureDetector f16380d;

    /* renamed from: e  reason: collision with root package name */
    public float f16381e = 0.0f;

    public class a extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public a() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            f fVar = f.this;
            fVar.B = true;
            fVar.f16381e = (scaleGestureDetector.getScaleFactor() - 1.0f) * 2.0f;
            return true;
        }
    }

    public f(Context context) {
        super(context);
    }

    public final void b(Context context) {
        this.f16364c = new PointF[]{new PointF(0.0f, 0.0f), new PointF(0.0f, 0.0f)};
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new a());
        this.f16380d = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        setGestureType(e.PINCH);
    }

    public final float c(float f10, float f11, float f12) {
        return b.a(f10, ((f12 - f11) * this.f16381e) + f10, f11, f12);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (!this.f16362a) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.B = false;
        }
        this.f16380d.onTouchEvent(motionEvent);
        if (this.B) {
            getPoints()[0].x = motionEvent.getX(0);
            getPoints()[0].y = motionEvent.getY(0);
            z10 = true;
            if (motionEvent.getPointerCount() > 1) {
                getPoints()[1].x = motionEvent.getX(1);
                getPoints()[1].y = motionEvent.getY(1);
            }
        }
        return z10;
    }
}
