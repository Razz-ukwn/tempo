package com.google.android.material.button;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import h2.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m8.s;
import m8.v;
import v8.i;
import v8.m;
import w1.a;

public class MaterialButton extends AppCompatButton implements Checkable, m {
    public static final int[] M = {16842911};
    public static final int[] N = {16842912};
    public b B;
    public PorterDuff.Mode C;
    public ColorStateList D;
    public Drawable E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;

    /* renamed from: d  reason: collision with root package name */
    public final b8.a f5793d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<a> f5794e = new LinkedHashSet<>();

    public interface a {
        void a();
    }

    public interface b {
    }

    public static class c extends k2.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f5795c;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new c[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeInt(this.f5795c ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f5795c = parcel.readInt() != 1 ? false : true;
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, R.attr.materialButtonStyle, 2132018189), attributeSet, R.attr.materialButtonStyle);
        boolean z10 = false;
        this.J = false;
        this.K = false;
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, n2.P, R.attr.materialButtonStyle, 2132018189, new int[0]);
        this.I = d10.getDimensionPixelSize(12, 0);
        this.C = v.d(d10.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.D = r8.c.a(getContext(), d10, 14);
        this.E = r8.c.d(getContext(), d10, 10);
        this.L = d10.getInteger(11, 1);
        this.F = d10.getDimensionPixelSize(13, 0);
        b8.a aVar = new b8.a(this, new i(i.b(context2, attributeSet, R.attr.materialButtonStyle, 2132018189)));
        this.f5793d = aVar;
        aVar.f3277c = d10.getDimensionPixelOffset(1, 0);
        aVar.f3278d = d10.getDimensionPixelOffset(2, 0);
        aVar.f3279e = d10.getDimensionPixelOffset(3, 0);
        aVar.f3280f = d10.getDimensionPixelOffset(4, 0);
        if (d10.hasValue(8)) {
            int dimensionPixelSize = d10.getDimensionPixelSize(8, -1);
            aVar.f3281g = dimensionPixelSize;
            aVar.c(aVar.f3276b.e((float) dimensionPixelSize));
            aVar.f3289p = true;
        }
        aVar.f3282h = d10.getDimensionPixelSize(20, 0);
        aVar.f3283i = v.d(d10.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f3284j = r8.c.a(getContext(), d10, 6);
        aVar.f3285k = r8.c.a(getContext(), d10, 19);
        aVar.f3286l = r8.c.a(getContext(), d10, 16);
        aVar.f3290q = d10.getBoolean(5, false);
        aVar.f3293t = d10.getDimensionPixelSize(9, 0);
        aVar.f3291r = d10.getBoolean(21, true);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        int f10 = i0.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = i0.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d10.hasValue(0)) {
            aVar.f3288o = true;
            setSupportBackgroundTintList(aVar.f3284j);
            setSupportBackgroundTintMode(aVar.f3283i);
        } else {
            aVar.e();
        }
        i0.e.k(this, f10 + aVar.f3277c, paddingTop + aVar.f3279e, e10 + aVar.f3278d, paddingBottom + aVar.f3280f);
        d10.recycle();
        setCompoundDrawablePadding(this.I);
        c(this.E != null ? true : z10);
    }

    private String getA11yClassName() {
        b8.a aVar = this.f5793d;
        return (aVar != null && aVar.f3290q ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i8 = 0; i8 < lineCount; i8++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i8));
        }
        return (int) Math.ceil((double) f10);
    }

    public final boolean a() {
        b8.a aVar = this.f5793d;
        return aVar != null && !aVar.f3288o;
    }

    public final void b() {
        int i8 = this.L;
        boolean z10 = false;
        if (i8 == 1 || i8 == 2) {
            l.b.e(this, this.E, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (i8 == 3 || i8 == 4) {
            l.b.e(this, (Drawable) null, (Drawable) null, this.E, (Drawable) null);
            return;
        }
        if (i8 == 16 || i8 == 32) {
            z10 = true;
        }
        if (z10) {
            l.b.e(this, (Drawable) null, this.E, (Drawable) null, (Drawable) null);
        }
    }

    public final void c(boolean z10) {
        Drawable drawable = this.E;
        boolean z11 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.E = mutate;
            a.b.h(mutate, this.D);
            PorterDuff.Mode mode = this.C;
            if (mode != null) {
                a.b.i(this.E, mode);
            }
            int i8 = this.F;
            if (i8 == 0) {
                i8 = this.E.getIntrinsicWidth();
            }
            int i10 = this.F;
            if (i10 == 0) {
                i10 = this.E.getIntrinsicHeight();
            }
            Drawable drawable2 = this.E;
            int i11 = this.G;
            int i12 = this.H;
            drawable2.setBounds(i11, i12, i8 + i11, i10 + i12);
            this.E.setVisible(true, z10);
        }
        if (z10) {
            b();
            return;
        }
        Drawable[] a10 = l.b.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        int i13 = this.L;
        if (!(i13 == 1 || i13 == 2) || drawable3 == this.E) {
            if (!(i13 == 3 || i13 == 4) || drawable5 == this.E) {
                if (!(i13 == 16 || i13 == 32) || drawable4 == this.E) {
                    z11 = false;
                }
            }
        }
        if (z11) {
            b();
        }
    }

    public final void d(int i8, int i10) {
        if (this.E != null && getLayout() != null) {
            int i11 = this.L;
            boolean z10 = true;
            if (!(i11 == 1 || i11 == 2)) {
                if (!(i11 == 3 || i11 == 4)) {
                    if (!(i11 == 16 || i11 == 32)) {
                        z10 = false;
                    }
                    if (z10) {
                        this.G = 0;
                        if (i11 == 16) {
                            this.H = 0;
                            c(false);
                            return;
                        }
                        int i12 = this.F;
                        if (i12 == 0) {
                            i12 = this.E.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - i12) - this.I) - getPaddingBottom()) / 2);
                        if (this.H != max) {
                            this.H = max;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.H = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i13 = this.L;
            if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                this.G = 0;
                c(false);
                return;
            }
            int i14 = this.F;
            if (i14 == 0) {
                i14 = this.E.getIntrinsicWidth();
            }
            int textLayoutWidth = i8 - getTextLayoutWidth();
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            int e10 = (((textLayoutWidth - i0.e.e(this)) - i14) - this.I) - i0.e.f(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                e10 /= 2;
            }
            boolean z11 = i0.e.d(this) == 1;
            if (this.L != 4) {
                z10 = false;
            }
            if (z11 != z10) {
                e10 = -e10;
            }
            if (this.G != e10) {
                this.G = e10;
                c(false);
            }
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f5793d.f3281g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.E;
    }

    public int getIconGravity() {
        return this.L;
    }

    public int getIconPadding() {
        return this.I;
    }

    public int getIconSize() {
        return this.F;
    }

    public ColorStateList getIconTint() {
        return this.D;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.C;
    }

    public int getInsetBottom() {
        return this.f5793d.f3280f;
    }

    public int getInsetTop() {
        return this.f5793d.f3279e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f5793d.f3286l;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        if (a()) {
            return this.f5793d.f3276b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f5793d.f3285k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f5793d.f3282h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f5793d.f3284j : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f5793d.f3283i : super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.J;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            b1.b.l(this, this.f5793d.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 2);
        b8.a aVar = this.f5793d;
        if (aVar != null && aVar.f3290q) {
            View.mergeDrawableStates(onCreateDrawableState, M);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        b8.a aVar = this.f5793d;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.f3290q);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f10267a);
        setChecked(cVar.f5795c);
    }

    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f5795c = this.J;
        return cVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        super.onTextChanged(charSequence, i8, i10, i11);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        if (this.f5793d.f3291r) {
            toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.E != null) {
            if (this.E.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i8) {
        if (a()) {
            b8.a aVar = this.f5793d;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i8);
                return;
            }
            return;
        }
        super.setBackgroundColor(i8);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            b8.a aVar = this.f5793d;
            aVar.f3288o = true;
            ColorStateList colorStateList = aVar.f3284j;
            MaterialButton materialButton = aVar.f3275a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(aVar.f3283i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i8) {
        setBackgroundDrawable(i8 != 0 ? f.a.a(getContext(), i8) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (a()) {
            this.f5793d.f3290q = z10;
        }
    }

    public void setChecked(boolean z10) {
        b8.a aVar = this.f5793d;
        if ((aVar != null && aVar.f3290q) && isEnabled() && this.J != z10) {
            this.J = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.J;
                if (!materialButtonToggleGroup.B) {
                    materialButtonToggleGroup.b(getId(), z11);
                }
            }
            if (!this.K) {
                this.K = true;
                Iterator<a> it = this.f5794e.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.K = false;
            }
        }
    }

    public void setCornerRadius(int i8) {
        if (a()) {
            b8.a aVar = this.f5793d;
            if (!aVar.f3289p || aVar.f3281g != i8) {
                aVar.f3281g = i8;
                aVar.f3289p = true;
                aVar.c(aVar.f3276b.e((float) i8));
            }
        }
    }

    public void setCornerRadiusResource(int i8) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i8));
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f5793d.b(false).l(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.E != drawable) {
            this.E = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i8) {
        if (this.L != i8) {
            this.L = i8;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i8) {
        if (this.I != i8) {
            this.I = i8;
            setCompoundDrawablePadding(i8);
        }
    }

    public void setIconResource(int i8) {
        setIcon(i8 != 0 ? f.a.a(getContext(), i8) : null);
    }

    public void setIconSize(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.F != i8) {
            this.F = i8;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.C != mode) {
            this.C = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i8) {
        setIconTint(t1.a.b(getContext(), i8));
    }

    public void setInsetBottom(int i8) {
        b8.a aVar = this.f5793d;
        aVar.d(aVar.f3279e, i8);
    }

    public void setInsetTop(int i8) {
        b8.a aVar = this.f5793d;
        aVar.d(i8, aVar.f3280f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.B = bVar;
    }

    public void setPressed(boolean z10) {
        b bVar = this.B;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            b8.a aVar = this.f5793d;
            if (aVar.f3286l != colorStateList) {
                aVar.f3286l = colorStateList;
                MaterialButton materialButton = aVar.f3275a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(s8.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i8) {
        if (a()) {
            setRippleColor(t1.a.b(getContext(), i8));
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        if (a()) {
            this.f5793d.c(iVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            b8.a aVar = this.f5793d;
            aVar.f3287n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            b8.a aVar = this.f5793d;
            if (aVar.f3285k != colorStateList) {
                aVar.f3285k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i8) {
        if (a()) {
            setStrokeColor(t1.a.b(getContext(), i8));
        }
    }

    public void setStrokeWidth(int i8) {
        if (a()) {
            b8.a aVar = this.f5793d;
            if (aVar.f3282h != i8) {
                aVar.f3282h = i8;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i8) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i8));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            b8.a aVar = this.f5793d;
            if (aVar.f3284j != colorStateList) {
                aVar.f3284j = colorStateList;
                if (aVar.b(false) != null) {
                    a.b.h(aVar.b(false), aVar.f3284j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            b8.a aVar = this.f5793d;
            if (aVar.f3283i != mode) {
                aVar.f3283i = mode;
                if (aVar.b(false) != null && aVar.f3283i != null) {
                    a.b.i(aVar.b(false), aVar.f3283i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i8) {
        super.setTextAlignment(i8);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f5793d.f3291r = z10;
    }

    public final void toggle() {
        setChecked(!this.J);
    }
}
