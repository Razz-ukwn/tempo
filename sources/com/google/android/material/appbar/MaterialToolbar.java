package com.google.android.material.appbar;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b1.b;
import c9.a;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import m8.s;
import m8.t;
import v8.f;
import w1.a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: y0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f5687y0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: t0  reason: collision with root package name */
    public Integer f5688t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f5689u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f5690v0;

    /* renamed from: w0  reason: collision with root package name */
    public ImageView.ScaleType f5691w0;

    /* renamed from: x0  reason: collision with root package name */
    public Boolean f5692x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2132018289), attributeSet, 0);
        int i8 = 0;
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, n2.Z, R.attr.toolbarStyle, 2132018289, new int[0]);
        if (d10.hasValue(2)) {
            setNavigationIconTint(d10.getColor(2, -1));
        }
        this.f5689u0 = d10.getBoolean(4, false);
        this.f5690v0 = d10.getBoolean(3, false);
        int i10 = d10.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f5687y0;
            if (i10 < scaleTypeArr.length) {
                this.f5691w0 = scaleTypeArr[i10];
            }
        }
        if (d10.hasValue(0)) {
            this.f5692x0 = Boolean.valueOf(d10.getBoolean(0, false));
        }
        d10.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            f fVar = new f();
            fVar.m(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i8));
            fVar.j(context2);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            fVar.l(i0.i.i(this));
            i0.d.q(this, fVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f5691w0;
    }

    public Integer getNavigationIconTint() {
        return this.f5688t0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.k(this);
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i8, i10, i11, i12);
        int i13 = 0;
        ImageView imageView2 = null;
        if (this.f5689u0 || this.f5690v0) {
            ArrayList b10 = t.b(this, getTitle());
            boolean isEmpty = b10.isEmpty();
            t.a aVar = t.f11308a;
            TextView textView = isEmpty ? null : (TextView) Collections.min(b10, aVar);
            ArrayList b11 = t.b(this, getSubtitle());
            TextView textView2 = b11.isEmpty() ? null : (TextView) Collections.max(b11, aVar);
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f5689u0 && textView != null) {
                    t(textView, pair);
                }
                if (this.f5690v0 && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i13 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i13);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i13++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f5692x0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f5691w0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        b.i(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f5692x0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f5692x0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f5691w0 != scaleType) {
            this.f5691w0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f5688t0 == null)) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.f5688t0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i8) {
        this.f5688t0 = Integer.valueOf(i8);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f5690v0 != z10) {
            this.f5690v0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f5689u0 != z10) {
            this.f5689u0 = z10;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i8 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i8;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i8, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i8 += max;
            i10 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i8, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i8, textView.getTop(), i10, textView.getBottom());
    }
}
