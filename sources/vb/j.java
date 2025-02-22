package vb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.quickkonnect.silencio.R;
import tb.e;

public final class j extends b {
    public FrameLayout B;
    public ImageView C;
    public final a D = new a();

    /* renamed from: d  reason: collision with root package name */
    public GestureDetector f16389d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16390e;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            j.this.e(false);
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            j jVar = j.this;
            jVar.f16390e = true;
            jVar.setGestureType(e.LONG_TAP);
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            j jVar = j.this;
            jVar.f16390e = true;
            jVar.setGestureType(e.TAP);
            return true;
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            j.d(j.this.B, 1.36f, 0.0f, 200, 1000, (AnimatorListenerAdapter) null);
        }
    }

    public j(Context context) {
        super(context);
    }

    public static void d(View view, float f10, float f11, long j10, long j11, AnimatorListenerAdapter animatorListenerAdapter) {
        view.animate().scaleX(f10).scaleY(f10).alpha(f11).setDuration(j10).setStartDelay(j11).setListener(animatorListenerAdapter).start();
    }

    public final void b(Context context) {
        this.f16364c = new PointF[]{new PointF(0.0f, 0.0f)};
        GestureDetector gestureDetector = new GestureDetector(context, new b());
        this.f16389d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        LayoutInflater.from(getContext()).inflate(R.layout.cameraview_layout_focus_marker, this);
        this.B = (FrameLayout) findViewById(R.id.focusMarkerContainer);
        this.C = (ImageView) findViewById(R.id.fill);
    }

    public final float c(float f10, float f11, float f12) {
        return 0.0f;
    }

    public final void e(boolean z10) {
        if (z10) {
            d(this.B, 1.0f, 0.0f, 500, 0, (AnimatorListenerAdapter) null);
            d(this.C, 1.0f, 0.0f, 500, 0, (AnimatorListenerAdapter) null);
            return;
        }
        d(this.C, 0.0f, 0.0f, 500, 0, (AnimatorListenerAdapter) null);
        d(this.B, 1.36f, 1.0f, 500, 0, new c());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f16362a) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.f16390e = false;
        }
        this.f16389d.onTouchEvent(motionEvent);
        if (!this.f16390e) {
            return false;
        }
        getPoints()[0].x = motionEvent.getX();
        getPoints()[0].y = motionEvent.getY();
        return true;
    }
}
