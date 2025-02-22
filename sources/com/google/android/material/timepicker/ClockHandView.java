package com.google.android.material.timepicker;

import ag.n2;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m8.v;

class ClockHandView extends View {
    public final Paint B;
    public final RectF C;
    public final int D;
    public float E;
    public boolean F;
    public double G;
    public int H;
    public int I;

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator f6231a = new ValueAnimator();

    /* renamed from: b  reason: collision with root package name */
    public boolean f6232b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f6233c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final int f6234d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6235e;

    public interface a {
        void a(float f10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.B = paint;
        this.C = new RectF();
        this.I = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.K, R.attr.materialClockStyle, 2132018281);
        n8.a.c(context, R.attr.motionDurationLong2, 200);
        n8.a.d(context, R.attr.motionEasingEmphasizedInterpolator, v7.a.f16229b);
        this.H = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f6234d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f6235e = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i8) {
        return i8 == 2 ? Math.round(((float) this.H) * 0.66f) : this.H;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f6231a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f10, false);
    }

    public final void c(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.E = f11;
        this.G = Math.toRadians((double) (f11 - 90.0f));
        float a10 = (float) a(this.I);
        float cos = (((float) Math.cos(this.G)) * a10) + ((float) (getWidth() / 2));
        float sin = (a10 * ((float) Math.sin(this.G))) + ((float) (getHeight() / 2));
        float f12 = (float) this.f6234d;
        this.C.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f6233c.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int a10 = a(this.I);
        float f10 = (float) width;
        float f11 = (float) a10;
        float f12 = (float) height;
        Paint paint = this.B;
        paint.setStrokeWidth(0.0f);
        int i8 = this.f6234d;
        canvas.drawCircle((((float) Math.cos(this.G)) * f11) + f10, (f11 * ((float) Math.sin(this.G))) + f12, (float) i8, paint);
        double sin = Math.sin(this.G);
        double d10 = (double) ((float) (a10 - i8));
        paint.setStrokeWidth((float) this.D);
        canvas.drawLine(f10, f12, (float) (width + ((int) (Math.cos(this.G) * d10))), (float) (height + ((int) (d10 * sin))), paint);
        canvas.drawCircle(f10, f12, this.f6235e, paint);
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        if (!this.f6231a.isRunning()) {
            b(this.E);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.F = false;
            z10 = true;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z11 = this.F;
            if (this.f6232b) {
                this.I = ((float) Math.hypot((double) (x10 - ((float) (getWidth() / 2))), (double) (y10 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + v.b(getContext(), 12) ? 2 : 1;
            }
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
        }
        boolean z13 = this.F;
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (y10 - ((float) (getHeight() / 2))), (double) (x10 - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f10 = (float) degrees;
        boolean z14 = this.E != f10;
        if (!z10 || !z14) {
            if (z14 || z11) {
                b(f10);
            }
            this.F = z13 | z12;
            return true;
        }
        z12 = true;
        this.F = z13 | z12;
        return true;
    }
}
