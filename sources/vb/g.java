package vb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import tb.e;

public final class g extends b {
    public static final wb.a C = new wb.a(g.class.getSimpleName());
    public boolean B;

    /* renamed from: d  reason: collision with root package name */
    public float f16383d;

    /* renamed from: e  reason: collision with root package name */
    public GestureDetector f16384e;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            boolean z10 = false;
            g.C.a(1, "onScroll:", "distanceX=" + f10, "distanceY=" + f11);
            if (motionEvent == null || motionEvent2 == null) {
                return false;
            }
            float x10 = motionEvent.getX();
            g gVar = g.this;
            if (x10 != gVar.getPoints()[0].x || motionEvent.getY() != gVar.getPoints()[0].y) {
                boolean z11 = Math.abs(f10) >= Math.abs(f11);
                gVar.setGestureType(z11 ? e.SCROLL_HORIZONTAL : e.SCROLL_VERTICAL);
                gVar.getPoints()[0].set(motionEvent.getX(), motionEvent.getY());
                z10 = z11;
            } else if (gVar.getGestureType() == e.SCROLL_HORIZONTAL) {
                z10 = true;
            }
            gVar.getPoints()[1].set(motionEvent2.getX(), motionEvent2.getY());
            gVar.f16383d = z10 ? f10 / ((float) gVar.getWidth()) : f11 / ((float) gVar.getHeight());
            float f12 = gVar.f16383d;
            if (z10) {
                f12 = -f12;
            }
            gVar.f16383d = f12;
            gVar.B = true;
            return true;
        }
    }

    public g(Context context) {
        super(context);
    }

    public final void b(Context context) {
        this.f16364c = new PointF[]{new PointF(0.0f, 0.0f), new PointF(0.0f, 0.0f)};
        GestureDetector gestureDetector = new GestureDetector(context, new a());
        this.f16384e = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    public final float c(float f10, float f11, float f12) {
        return b.a(f10, ((f12 - f11) * this.f16383d * 2.0f) + f10, f11, f12);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f16362a) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.B = false;
        }
        this.f16384e.onTouchEvent(motionEvent);
        if (this.B) {
            C.a(1, "Notifying a gesture of type", getGestureType().name());
        }
        return this.B;
    }
}
