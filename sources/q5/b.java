package q5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import r5.c;
import r5.e;
import r5.h;
import s5.d;
import s5.f;
import u5.a;
import z5.g;

public abstract class b<T extends d<? extends w5.d<? extends f>>> extends ViewGroup implements v5.b {
    public final t5.b B = new t5.b(0);
    public Paint C;
    public Paint D;
    public h E;
    public boolean F = true;
    public c G;
    public e H;
    public x5.b I;
    public String J = "No chart data available.";
    public y5.d K;
    public y5.c L;
    public a M;
    public g N = new g();
    public p5.a O;
    public float P = 0.0f;
    public float Q = 0.0f;
    public float R = 0.0f;
    public float S = 0.0f;
    public boolean T = false;
    public u5.b[] U;
    public float V = 0.0f;
    public final ArrayList<Runnable> W = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public boolean f12876a = false;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f12877a0 = false;

    /* renamed from: b  reason: collision with root package name */
    public T f12878b = null;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12879c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12880d = true;

    /* renamed from: e  reason: collision with root package name */
    public float f12881e = 0.9f;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public static void g(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback((Drawable.Callback) null);
        }
        if (view instanceof ViewGroup) {
            int i8 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i8 < viewGroup.getChildCount()) {
                    g(viewGroup.getChildAt(i8));
                    i8++;
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
        }
    }

    public abstract void b();

    public u5.b c(float f10, float f11) {
        if (this.f12878b != null) {
            return getHighlighter().a(f10, f11);
        }
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
        return null;
    }

    public final void d(u5.b bVar) {
        if (bVar == null) {
            this.U = null;
        } else {
            if (this.f12876a) {
                Log.i("MPAndroidChart", "Highlighted: " + bVar.toString());
            }
            T t2 = this.f12878b;
            t2.getClass();
            ArrayList arrayList = t2.f14729i;
            int size = arrayList.size();
            int i8 = bVar.f15732f;
            if ((i8 >= size ? null : ((w5.d) arrayList.get(i8)).j(bVar.f15727a, bVar.f15728b)) == null) {
                this.U = null;
            } else {
                this.U = new u5.b[]{bVar};
            }
        }
        setLastHighlighted(this.U);
        invalidate();
    }

    public void e() {
        setWillNotDraw(false);
        this.O = new p5.a();
        Context context = getContext();
        DisplayMetrics displayMetrics = z5.f.f17746a;
        if (context == null) {
            z5.f.f17747b = ViewConfiguration.getMinimumFlingVelocity();
            z5.f.f17748c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            z5.f.f17747b = viewConfiguration.getScaledMinimumFlingVelocity();
            z5.f.f17748c = viewConfiguration.getScaledMaximumFlingVelocity();
            z5.f.f17746a = context.getResources().getDisplayMetrics();
        }
        this.V = z5.f.c(500.0f);
        this.G = new c();
        e eVar = new e();
        this.H = eVar;
        this.K = new y5.d(this.N, eVar);
        this.E = new h();
        this.C = new Paint(1);
        Paint paint = new Paint(1);
        this.D = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.D.setTextAlign(Paint.Align.CENTER);
        this.D.setTextSize(z5.f.c(12.0f));
        if (this.f12876a) {
            Log.i("", "Chart.init()");
        }
    }

    public abstract void f();

    public p5.a getAnimator() {
        return this.O;
    }

    public z5.c getCenter() {
        return z5.c.b(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    public z5.c getCenterOfView() {
        return getCenter();
    }

    public z5.c getCenterOffsets() {
        RectF rectF = this.N.f17756b;
        return z5.c.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    public RectF getContentRect() {
        return this.N.f17756b;
    }

    public T getData() {
        return this.f12878b;
    }

    public t5.c getDefaultValueFormatter() {
        return this.B;
    }

    public c getDescription() {
        return this.G;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f12881e;
    }

    public float getExtraBottomOffset() {
        return this.R;
    }

    public float getExtraLeftOffset() {
        return this.S;
    }

    public float getExtraRightOffset() {
        return this.Q;
    }

    public float getExtraTopOffset() {
        return this.P;
    }

    public u5.b[] getHighlighted() {
        return this.U;
    }

    public u5.c getHighlighter() {
        return this.M;
    }

    public ArrayList<Runnable> getJobs() {
        return this.W;
    }

    public e getLegend() {
        return this.H;
    }

    public y5.d getLegendRenderer() {
        return this.K;
    }

    public r5.d getMarker() {
        return null;
    }

    @Deprecated
    public r5.d getMarkerView() {
        getMarker();
        return null;
    }

    public float getMaxHighlightDistance() {
        return this.V;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public x5.c getOnChartGestureListener() {
        return null;
    }

    public x5.b getOnTouchListener() {
        return this.I;
    }

    public y5.c getRenderer() {
        return this.L;
    }

    public g getViewPortHandler() {
        return this.N;
    }

    public h getXAxis() {
        return this.E;
    }

    public float getXChartMax() {
        return this.E.A;
    }

    public float getXChartMin() {
        return this.E.B;
    }

    public float getXRange() {
        return this.E.C;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.f12878b.f14721a;
    }

    public float getYMin() {
        return this.f12878b.f14722b;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f12877a0) {
            g(this);
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.f12878b == null) {
            if (!TextUtils.isEmpty(this.J)) {
                z5.c center = getCenter();
                canvas.drawText(this.J, center.f17729b, center.f17730c, this.D);
            }
        } else if (!this.T) {
            b();
            this.T = true;
        }
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            getChildAt(i13).layout(i8, i10, i11, i12);
        }
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
        int c3 = (int) z5.f.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(c3, i8)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(c3, i10)));
    }

    public void onSizeChanged(int i8, int i10, int i11, int i12) {
        if (this.f12876a) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i8 > 0 && i10 > 0 && i8 < 10000 && i10 < 10000) {
            if (this.f12876a) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + i8 + ", height: " + i10);
            }
            g gVar = this.N;
            float f10 = (float) i8;
            float f11 = (float) i10;
            RectF rectF = gVar.f17756b;
            float f12 = rectF.left;
            float f13 = rectF.top;
            float f14 = gVar.f17757c - rectF.right;
            float j10 = gVar.j();
            gVar.f17758d = f11;
            gVar.f17757c = f10;
            gVar.f17756b.set(f12, f13, f10 - f14, f11 - j10);
        } else if (this.f12876a) {
            Log.w("MPAndroidChart", "*Avoiding* setting chart dimens! width: " + i8 + ", height: " + i10);
        }
        f();
        ArrayList<Runnable> arrayList = this.W;
        Iterator<Runnable> it = arrayList.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        arrayList.clear();
        super.onSizeChanged(i8, i10, i11, i12);
    }

    public void setData(T t2) {
        this.f12878b = t2;
        int i8 = 0;
        this.T = false;
        if (t2 != null) {
            float f10 = t2.f14722b;
            float f11 = t2.f14721a;
            float e10 = z5.f.e((double) (t2.d() < 2 ? Math.max(Math.abs(f10), Math.abs(f11)) : Math.abs(f11 - f10)));
            if (!Float.isInfinite(e10)) {
                i8 = ((int) Math.ceil(-Math.log10((double) e10))) + 2;
            }
            t5.b bVar = this.B;
            bVar.b(i8);
            Iterator it = this.f12878b.f14729i.iterator();
            while (it.hasNext()) {
                w5.d dVar = (w5.d) it.next();
                if (dVar.F() || dVar.u() == bVar) {
                    dVar.v(bVar);
                }
            }
            f();
            if (this.f12876a) {
                Log.i("MPAndroidChart", "Data is set.");
            }
        }
    }

    public void setDescription(c cVar) {
        this.G = cVar;
    }

    public void setDragDecelerationEnabled(boolean z10) {
        this.f12880d = z10;
    }

    public void setDragDecelerationFrictionCoef(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 >= 1.0f) {
            f10 = 0.999f;
        }
        this.f12881e = f10;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z10) {
        setDrawMarkers(z10);
    }

    public void setDrawMarkers(boolean z10) {
    }

    public void setExtraBottomOffset(float f10) {
        this.R = z5.f.c(f10);
    }

    public void setExtraLeftOffset(float f10) {
        this.S = z5.f.c(f10);
    }

    public void setExtraRightOffset(float f10) {
        this.Q = z5.f.c(f10);
    }

    public void setExtraTopOffset(float f10) {
        this.P = z5.f.c(f10);
    }

    public void setHardwareAccelerationEnabled(boolean z10) {
        if (z10) {
            setLayerType(2, (Paint) null);
        } else {
            setLayerType(1, (Paint) null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z10) {
        this.f12879c = z10;
    }

    public void setHighlighter(a aVar) {
        this.M = aVar;
    }

    public void setLastHighlighted(u5.b[] bVarArr) {
        u5.b bVar;
        if (bVarArr == null || bVarArr.length <= 0 || (bVar = bVarArr[0]) == null) {
            this.I.f16965b = null;
        } else {
            this.I.f16965b = bVar;
        }
    }

    public void setLogEnabled(boolean z10) {
        this.f12876a = z10;
    }

    public void setMarker(r5.d dVar) {
    }

    @Deprecated
    public void setMarkerView(r5.d dVar) {
        setMarker(dVar);
    }

    public void setMaxHighlightDistance(float f10) {
        this.V = z5.f.c(f10);
    }

    public void setNoDataText(String str) {
        this.J = str;
    }

    public void setNoDataTextColor(int i8) {
        this.D.setColor(i8);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.D.setTypeface(typeface);
    }

    public void setOnChartGestureListener(x5.c cVar) {
    }

    public void setOnChartValueSelectedListener(x5.d dVar) {
    }

    public void setOnTouchListener(x5.b bVar) {
        this.I = bVar;
    }

    public void setRenderer(y5.c cVar) {
        if (cVar != null) {
            this.L = cVar;
        }
    }

    public void setTouchEnabled(boolean z10) {
        this.F = z10;
    }

    public void setUnbindEnabled(boolean z10) {
        this.f12877a0 = z10;
    }
}
