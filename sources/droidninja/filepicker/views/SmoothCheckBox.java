package droidninja.filepicker.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Checkable;
import sf.j;

public final class SmoothCheckBox extends View implements Checkable {
    public static final int R = Color.parseColor("#FB4846");
    public static final int S = Color.parseColor("#DFDFDF");
    public static final int T = 25;
    public static final int U = 300;
    public Path B;
    public float C;
    public float D;
    public float E;
    public float F = 1.0f;
    public float G = 1.0f;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public b Q;

    /* renamed from: a  reason: collision with root package name */
    public Paint f7604a;

    /* renamed from: b  reason: collision with root package name */
    public Paint f7605b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f7606c;

    /* renamed from: d  reason: collision with root package name */
    public Point[] f7607d;

    /* renamed from: e  reason: collision with root package name */
    public Point f7608e;

    public static final class a {
        public static final int a(int i8, int i10, float f10) {
            int i11 = SmoothCheckBox.R;
            float f11 = ((float) 1) - f10;
            return Color.argb(255, (int) ((((float) ((16711680 & i10) >> 16)) * f10) + (((float) ((i8 & 16711680) >> 16)) * f11)), (int) ((((float) ((65280 & i10) >> 8)) * f10) + (((float) ((i8 & 65280) >> 8)) * f11)), (int) ((((float) (i10 & 255)) * f10) + (((float) (i8 & 255)) * f11)));
        }
    }

    public interface b {
        void a(SmoothCheckBox smoothCheckBox, boolean z10);
    }

    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SmoothCheckBox f7609a;

        public c(SmoothCheckBox smoothCheckBox) {
            this.f7609a = smoothCheckBox;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            j.e(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                SmoothCheckBox smoothCheckBox = this.f7609a;
                smoothCheckBox.F = floatValue;
                int i8 = SmoothCheckBox.R;
                smoothCheckBox.M = a.a(smoothCheckBox.L, smoothCheckBox.K, ((float) 1) - floatValue);
                smoothCheckBox.postInvalidate();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SmoothCheckBox f7610a;

        public d(SmoothCheckBox smoothCheckBox) {
            this.f7610a = smoothCheckBox;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            j.e(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                SmoothCheckBox smoothCheckBox = this.f7610a;
                smoothCheckBox.G = floatValue;
                smoothCheckBox.postInvalidate();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SmoothCheckBox f7611a;

        public e(SmoothCheckBox smoothCheckBox) {
            this.f7611a = smoothCheckBox;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            j.e(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                SmoothCheckBox smoothCheckBox = this.f7611a;
                smoothCheckBox.F = floatValue;
                int i8 = SmoothCheckBox.R;
                smoothCheckBox.M = a.a(smoothCheckBox.K, SmoothCheckBox.S, floatValue);
                smoothCheckBox.postInvalidate();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SmoothCheckBox f7612a;

        public f(SmoothCheckBox smoothCheckBox) {
            this.f7612a = smoothCheckBox;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            j.e(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                SmoothCheckBox smoothCheckBox = this.f7612a;
                smoothCheckBox.G = floatValue;
                smoothCheckBox.postInvalidate();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static {
        new a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmoothCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cb.b.f3883d);
        j.e(obtainStyledAttributes, "context.obtainStyledAttr…styleable.SmoothCheckBox)");
        int color = obtainStyledAttributes.getColor(1, -1);
        this.I = obtainStyledAttributes.getInt(4, U);
        this.M = obtainStyledAttributes.getColor(3, S);
        this.K = obtainStyledAttributes.getColor(0, R);
        this.L = obtainStyledAttributes.getColor(2, -1);
        Context context2 = getContext();
        j.e(context2, "context");
        Resources resources = context2.getResources();
        j.e(resources, "context.resources");
        this.J = obtainStyledAttributes.getDimensionPixelSize(5, (int) ((0.0f * resources.getDisplayMetrics().density) + 0.5f));
        obtainStyledAttributes.recycle();
        this.N = this.M;
        Paint paint = new Paint(1);
        this.f7605b = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.f7605b;
        j.c(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = this.f7605b;
        j.c(paint3);
        paint3.setColor(color);
        Paint paint4 = new Paint(1);
        this.f7606c = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = this.f7606c;
        j.c(paint5);
        paint5.setColor(this.M);
        Paint paint6 = new Paint(1);
        this.f7604a = paint6;
        paint6.setStyle(Paint.Style.FILL);
        Paint paint7 = this.f7604a;
        j.c(paint7);
        paint7.setColor(this.K);
        this.B = new Path();
        this.f7608e = new Point();
        this.f7607d = new Point[]{new Point(), new Point(), new Point()};
        setOnClickListener(new pe.c(this));
    }

    public final int a(int i8) {
        Context context = getContext();
        j.e(context, "context");
        Resources resources = context.getResources();
        j.e(resources, "context.resources");
        int i10 = (int) ((((float) T) * resources.getDisplayMetrics().density) + 0.5f);
        int size = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return Math.min(i10, size);
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    public final void b(boolean z10) {
        this.P = false;
        this.O = z10;
        this.E = 0.0f;
        if (z10) {
            c();
        } else {
            d();
        }
        b bVar = this.Q;
        if (bVar != null) {
            bVar.a(this, this.O);
        }
    }

    public final void c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        j.e(ofFloat, "animator");
        ofFloat.setDuration((long) ((this.I / 3) * 2));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new c(this));
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f});
        j.e(ofFloat2, "floorAnimator");
        ofFloat2.setDuration((long) this.I);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new d(this));
        ofFloat2.start();
        postDelayed(new pe.a(this), (long) this.I);
    }

    public final void d() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        j.e(ofFloat, "animator");
        ofFloat.setDuration((long) this.I);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new e(this));
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f});
        j.e(ofFloat2, "floorAnimator");
        ofFloat2.setDuration((long) this.I);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new f(this));
        ofFloat2.start();
    }

    public final boolean isChecked() {
        return this.O;
    }

    public final void onDraw(Canvas canvas) {
        j.f(canvas, "canvas");
        Paint paint = this.f7606c;
        j.c(paint);
        paint.setColor(this.M);
        Point point = this.f7608e;
        j.c(point);
        int i8 = point.x;
        Point point2 = this.f7608e;
        j.c(point2);
        Point point3 = this.f7608e;
        j.c(point3);
        float f10 = ((float) i8) * this.G;
        Paint paint2 = this.f7606c;
        j.c(paint2);
        canvas.drawCircle((float) point2.x, (float) point3.y, f10, paint2);
        Paint paint3 = this.f7604a;
        j.c(paint3);
        paint3.setColor(this.L);
        Point point4 = this.f7608e;
        j.c(point4);
        float f11 = ((float) (point4.x - this.J)) * this.F;
        Point point5 = this.f7608e;
        j.c(point5);
        Point point6 = this.f7608e;
        j.c(point6);
        Paint paint4 = this.f7604a;
        j.c(paint4);
        canvas.drawCircle((float) point5.x, (float) point6.y, f11, paint4);
        if (this.P && this.O) {
            Path path = this.B;
            j.c(path);
            path.reset();
            float f12 = this.E;
            int i10 = 3;
            if (f12 < this.C) {
                float f13 = ((float) this.H) / 20.0f;
                if (f13 < ((float) 3)) {
                    f13 = 3.0f;
                }
                this.E = f12 + f13;
                Point[] pointArr = this.f7607d;
                j.c(pointArr);
                Point[] pointArr2 = this.f7607d;
                j.c(pointArr2);
                int i11 = pointArr2[1].x;
                Point[] pointArr3 = this.f7607d;
                j.c(pointArr3);
                float f14 = ((((float) (i11 - pointArr3[0].x)) * this.E) / this.C) + ((float) pointArr[0].x);
                Point[] pointArr4 = this.f7607d;
                j.c(pointArr4);
                Point[] pointArr5 = this.f7607d;
                j.c(pointArr5);
                int i12 = pointArr5[1].y;
                Point[] pointArr6 = this.f7607d;
                j.c(pointArr6);
                float f15 = ((((float) (i12 - pointArr6[0].y)) * this.E) / this.C) + ((float) pointArr4[0].y);
                Path path2 = this.B;
                j.c(path2);
                Point[] pointArr7 = this.f7607d;
                j.c(pointArr7);
                Point[] pointArr8 = this.f7607d;
                j.c(pointArr8);
                path2.moveTo((float) pointArr7[0].x, (float) pointArr8[0].y);
                Path path3 = this.B;
                j.c(path3);
                path3.lineTo(f14, f15);
                Path path4 = this.B;
                j.c(path4);
                Paint paint5 = this.f7605b;
                j.c(paint5);
                canvas.drawPath(path4, paint5);
                float f16 = this.E;
                float f17 = this.C;
                if (f16 > f17) {
                    this.E = f17;
                }
            } else {
                Path path5 = this.B;
                j.c(path5);
                Point[] pointArr9 = this.f7607d;
                j.c(pointArr9);
                Point[] pointArr10 = this.f7607d;
                j.c(pointArr10);
                path5.moveTo((float) pointArr9[0].x, (float) pointArr10[0].y);
                Path path6 = this.B;
                j.c(path6);
                Point[] pointArr11 = this.f7607d;
                j.c(pointArr11);
                Point[] pointArr12 = this.f7607d;
                j.c(pointArr12);
                path6.lineTo((float) pointArr11[1].x, (float) pointArr12[1].y);
                Path path7 = this.B;
                j.c(path7);
                Paint paint6 = this.f7605b;
                j.c(paint6);
                canvas.drawPath(path7, paint6);
                if (this.E < this.C + this.D) {
                    Point[] pointArr13 = this.f7607d;
                    j.c(pointArr13);
                    Point[] pointArr14 = this.f7607d;
                    j.c(pointArr14);
                    int i13 = pointArr14[2].x;
                    Point[] pointArr15 = this.f7607d;
                    j.c(pointArr15);
                    float f18 = (((this.E - this.C) * ((float) (i13 - pointArr15[1].x))) / this.D) + ((float) pointArr13[1].x);
                    Point[] pointArr16 = this.f7607d;
                    j.c(pointArr16);
                    Point[] pointArr17 = this.f7607d;
                    j.c(pointArr17);
                    int i14 = pointArr17[1].y;
                    Point[] pointArr18 = this.f7607d;
                    j.c(pointArr18);
                    float f19 = ((float) pointArr16[1].y) - (((this.E - this.C) * ((float) (i14 - pointArr18[2].y))) / this.D);
                    Path path8 = this.B;
                    j.c(path8);
                    path8.reset();
                    Path path9 = this.B;
                    j.c(path9);
                    Point[] pointArr19 = this.f7607d;
                    j.c(pointArr19);
                    Point[] pointArr20 = this.f7607d;
                    j.c(pointArr20);
                    path9.moveTo((float) pointArr19[1].x, (float) pointArr20[1].y);
                    Path path10 = this.B;
                    j.c(path10);
                    path10.lineTo(f18, f19);
                    Path path11 = this.B;
                    j.c(path11);
                    Paint paint7 = this.f7605b;
                    j.c(paint7);
                    canvas.drawPath(path11, paint7);
                    int i15 = this.H / 20;
                    if (i15 >= 3) {
                        i10 = i15;
                    }
                    this.E += (float) i10;
                } else {
                    Path path12 = this.B;
                    j.c(path12);
                    path12.reset();
                    Path path13 = this.B;
                    j.c(path13);
                    Point[] pointArr21 = this.f7607d;
                    j.c(pointArr21);
                    Point[] pointArr22 = this.f7607d;
                    j.c(pointArr22);
                    path13.moveTo((float) pointArr21[1].x, (float) pointArr22[1].y);
                    Path path14 = this.B;
                    j.c(path14);
                    Point[] pointArr23 = this.f7607d;
                    j.c(pointArr23);
                    Point[] pointArr24 = this.f7607d;
                    j.c(pointArr24);
                    path14.lineTo((float) pointArr23[2].x, (float) pointArr24[2].y);
                    Path path15 = this.B;
                    j.c(path15);
                    Paint paint8 = this.f7605b;
                    j.c(paint8);
                    canvas.drawPath(path15, paint8);
                }
            }
            if (this.E < this.C + this.D) {
                postDelayed(new pe.b(this), 10);
            }
        }
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        this.H = getMeasuredWidth();
        int i13 = this.J;
        if (i13 == 0) {
            i13 = getMeasuredWidth() / 10;
        }
        this.J = i13;
        int measuredWidth = i13 > getMeasuredWidth() / 5 ? getMeasuredWidth() / 5 : this.J;
        this.J = measuredWidth;
        if (measuredWidth < 3) {
            measuredWidth = 3;
        }
        this.J = measuredWidth;
        Point point = this.f7608e;
        j.c(point);
        point.x = this.H / 2;
        Point point2 = this.f7608e;
        j.c(point2);
        point2.y = getMeasuredHeight() / 2;
        Point[] pointArr = this.f7607d;
        j.c(pointArr);
        float f10 = (float) 30;
        pointArr[0].x = Math.round((((float) getMeasuredWidth()) / f10) * ((float) 7));
        Point[] pointArr2 = this.f7607d;
        j.c(pointArr2);
        pointArr2[0].y = Math.round((((float) getMeasuredHeight()) / f10) * ((float) 14));
        Point[] pointArr3 = this.f7607d;
        j.c(pointArr3);
        pointArr3[1].x = Math.round((((float) getMeasuredWidth()) / f10) * ((float) 13));
        Point[] pointArr4 = this.f7607d;
        j.c(pointArr4);
        pointArr4[1].y = Math.round((((float) getMeasuredHeight()) / f10) * ((float) 20));
        Point[] pointArr5 = this.f7607d;
        j.c(pointArr5);
        pointArr5[2].x = Math.round((((float) getMeasuredWidth()) / f10) * ((float) 22));
        Point[] pointArr6 = this.f7607d;
        j.c(pointArr6);
        pointArr6[2].y = Math.round((((float) getMeasuredHeight()) / f10) * ((float) 10));
        Point[] pointArr7 = this.f7607d;
        j.c(pointArr7);
        int i14 = pointArr7[1].x;
        Point[] pointArr8 = this.f7607d;
        j.c(pointArr8);
        double pow = Math.pow((double) (i14 - pointArr8[0].x), 2.0d);
        Point[] pointArr9 = this.f7607d;
        j.c(pointArr9);
        int i15 = pointArr9[1].y;
        Point[] pointArr10 = this.f7607d;
        j.c(pointArr10);
        this.C = (float) Math.sqrt(Math.pow((double) (i15 - pointArr10[0].y), 2.0d) + pow);
        Point[] pointArr11 = this.f7607d;
        j.c(pointArr11);
        int i16 = pointArr11[2].x;
        Point[] pointArr12 = this.f7607d;
        j.c(pointArr12);
        double pow2 = Math.pow((double) (i16 - pointArr12[1].x), 2.0d);
        Point[] pointArr13 = this.f7607d;
        j.c(pointArr13);
        int i17 = pointArr13[2].y;
        Point[] pointArr14 = this.f7607d;
        j.c(pointArr14);
        this.D = (float) Math.sqrt(Math.pow((double) (i17 - pointArr14[1].y), 2.0d) + pow2);
        Paint paint = this.f7605b;
        j.c(paint);
        paint.setStrokeWidth((float) this.J);
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
        setMeasuredDimension(a(i8), a(i10));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        j.f(parcelable, "state");
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setChecked(bundle.getBoolean("InstanceState"));
            super.onRestoreInstanceState(bundle.getParcelable("InstanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("InstanceState", super.onSaveInstanceState());
        bundle.putBoolean("InstanceState", this.O);
        return bundle;
    }

    public void setChecked(boolean z10) {
        this.O = z10;
        this.P = true;
        float f10 = 1.0f;
        this.G = 1.0f;
        float f11 = 0.0f;
        if (z10) {
            f10 = 0.0f;
        }
        this.F = f10;
        this.M = z10 ? this.K : this.N;
        if (z10) {
            f11 = this.C + this.D;
        }
        this.E = f11;
        invalidate();
        b bVar = this.Q;
        if (bVar != null) {
            j.c(bVar);
            bVar.a(this, this.O);
        }
    }

    public final void setOnCheckedChangeListener(b bVar) {
        this.Q = bVar;
    }

    public final void toggle() {
        setChecked(!this.O);
    }
}
