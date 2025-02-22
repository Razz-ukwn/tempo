package com.google.android.material.timepicker;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.quickkonnect.silencio.R;
import d2.i0;
import e2.i;
import java.util.Arrays;
import r8.c;
import t1.a;

class ClockFaceView extends c implements ClockHandView.a {
    public final ClockHandView P;
    public final Rect Q = new Rect();
    public final RectF R = new RectF();
    public final Rect S = new Rect();
    public final SparseArray<TextView> T;
    public final b U;
    public final int[] V;
    public final float[] W;

    /* renamed from: a0  reason: collision with root package name */
    public final int f6224a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f6225b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f6226c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f6227d0;

    /* renamed from: e0  reason: collision with root package name */
    public String[] f6228e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f6229f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ColorStateList f6230g0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.T = sparseArray;
        this.W = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.J, R.attr.materialClockStyle, 2132018281);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 1);
        this.f6230g0 = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.P = clockHandView;
        this.f6224a0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.V = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.f6233c.add(this);
        int defaultColor = a.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.U = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f6228e0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i8 = 0; i8 < Math.max(this.f6228e0.length, size); i8++) {
            TextView textView = sparseArray.get(i8);
            if (i8 >= this.f6228e0.length) {
                removeView(textView);
                sparseArray.remove(i8);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    sparseArray.put(i8, textView);
                    addView(textView);
                }
                textView.setText(this.f6228e0[i8]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i8));
                int i10 = (i8 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z10 = i10 > 1 ? true : z10;
                i0.n(textView, this.U);
                textView.setTextColor(this.f6230g0);
            }
        }
        ClockHandView clockHandView2 = this.P;
        if (clockHandView2.f6232b && !z10) {
            clockHandView2.I = 1;
        }
        clockHandView2.f6232b = z10;
        clockHandView2.invalidate();
        this.f6225b0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f6226c0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f6227d0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void a(float f10) {
        if (Math.abs(this.f6229f0 - f10) > 0.001f) {
            this.f6229f0 = f10;
            p();
        }
    }

    public final void i() {
        super.i();
        int i8 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.T;
            if (i8 < sparseArray.size()) {
                sparseArray.get(i8).setVisibility(0);
                i8++;
            } else {
                return;
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i.c.a(1, this.f6228e0.length, 1).f7797a);
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        p();
    }

    public final void onMeasure(int i8, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.f6227d0) / Math.max(Math.max(((float) this.f6225b0) / ((float) displayMetrics.heightPixels), ((float) this.f6226c0) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void p() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.P.C;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i8 = 0;
        while (true) {
            sparseArray = this.T;
            int size = sparseArray.size();
            rectF = this.R;
            rect = this.Q;
            if (i8 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i8);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f10) {
                    textView = textView2;
                    f10 = height;
                }
            }
            i8++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = sparseArray.get(i10);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.S;
                textView3.getLineBounds(0, rect2);
                rectF.inset((float) rect2.left, (float) rect2.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.V, this.W, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }
}
