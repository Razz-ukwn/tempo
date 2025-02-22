package com.google.android.material.card;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import b1.b;
import c8.c;
import com.quickkonnect.silencio.R;
import m8.s;
import v8.f;
import v8.i;
import v8.m;
import w1.a;

public class MaterialCardView extends CardView implements Checkable, m {
    public static final int[] H = {16842911};
    public static final int[] I = {16842912};
    public static final int[] J = {R.attr.state_dragged};
    public final c D;
    public final boolean E = true;
    public boolean F = false;
    public boolean G = false;

    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, R.attr.materialCardViewStyle, 2132018201), attributeSet, R.attr.materialCardViewStyle);
        TypedArray d10 = s.d(getContext(), attributeSet, n2.T, R.attr.materialCardViewStyle, 2132018201, new int[0]);
        c cVar = new c(this, attributeSet);
        this.D = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        f fVar = cVar.f3849c;
        fVar.m(cardBackgroundColor);
        cVar.f3848b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.j();
        MaterialCardView materialCardView = cVar.f3847a;
        ColorStateList a10 = r8.c.a(materialCardView.getContext(), d10, 11);
        cVar.f3859n = a10;
        if (a10 == null) {
            cVar.f3859n = ColorStateList.valueOf(-1);
        }
        cVar.f3854h = d10.getDimensionPixelSize(12, 0);
        boolean z10 = d10.getBoolean(0, false);
        cVar.f3864s = z10;
        materialCardView.setLongClickable(z10);
        cVar.f3858l = r8.c.a(materialCardView.getContext(), d10, 6);
        cVar.g(r8.c.d(materialCardView.getContext(), d10, 2));
        cVar.f3852f = d10.getDimensionPixelSize(5, 0);
        cVar.f3851e = d10.getDimensionPixelSize(4, 0);
        cVar.f3853g = d10.getInteger(3, 8388661);
        ColorStateList a11 = r8.c.a(materialCardView.getContext(), d10, 7);
        cVar.f3857k = a11;
        if (a11 == null) {
            cVar.f3857k = ColorStateList.valueOf(b.f(materialCardView, R.attr.colorControlHighlight));
        }
        ColorStateList a12 = r8.c.a(materialCardView.getContext(), d10, 1);
        f fVar2 = cVar.f3850d;
        fVar2.m(a12 == null ? ColorStateList.valueOf(0) : a12);
        int[] iArr = s8.a.f14809a;
        RippleDrawable rippleDrawable = cVar.f3860o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f3857k);
        }
        fVar.l(materialCardView.getCardElevation());
        ColorStateList colorStateList = cVar.f3859n;
        fVar2.f16250a.f16266k = (float) cVar.f3854h;
        fVar2.invalidateSelf();
        f.b bVar = fVar2.f16250a;
        if (bVar.f16259d != colorStateList) {
            bVar.f16259d = colorStateList;
            fVar2.onStateChange(fVar2.getState());
        }
        materialCardView.setBackgroundInternal(cVar.d(fVar));
        Drawable c3 = materialCardView.isClickable() ? cVar.c() : fVar2;
        cVar.f3855i = c3;
        materialCardView.setForeground(cVar.d(c3));
        d10.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.D.f3849c.getBounds());
        return rectF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r8.D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 <= r1) goto L_0x002a
            c8.c r0 = r8.D
            android.graphics.drawable.RippleDrawable r1 = r0.f3860o
            if (r1 == 0) goto L_0x002a
            android.graphics.Rect r1 = r1.getBounds()
            int r2 = r1.bottom
            android.graphics.drawable.RippleDrawable r3 = r0.f3860o
            int r4 = r1.left
            int r5 = r1.top
            int r6 = r1.right
            int r7 = r2 + -1
            r3.setBounds(r4, r5, r6, r7)
            android.graphics.drawable.RippleDrawable r0 = r0.f3860o
            int r3 = r1.left
            int r4 = r1.top
            int r1 = r1.right
            r0.setBounds(r3, r4, r1, r2)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.d():void");
    }

    public ColorStateList getCardBackgroundColor() {
        return this.D.f3849c.f16250a.f16258c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.D.f3850d.f16250a.f16258c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.D.f3856j;
    }

    public int getCheckedIconGravity() {
        return this.D.f3853g;
    }

    public int getCheckedIconMargin() {
        return this.D.f3851e;
    }

    public int getCheckedIconSize() {
        return this.D.f3852f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.D.f3858l;
    }

    public int getContentPaddingBottom() {
        return this.D.f3848b.bottom;
    }

    public int getContentPaddingLeft() {
        return this.D.f3848b.left;
    }

    public int getContentPaddingRight() {
        return this.D.f3848b.right;
    }

    public int getContentPaddingTop() {
        return this.D.f3848b.top;
    }

    public float getProgress() {
        return this.D.f3849c.f16250a.f16265j;
    }

    public float getRadius() {
        return this.D.f3849c.i();
    }

    public ColorStateList getRippleColor() {
        return this.D.f3857k;
    }

    public i getShapeAppearanceModel() {
        return this.D.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.D.f3859n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.D.f3859n;
    }

    public int getStrokeWidth() {
        return this.D.f3854h;
    }

    public final boolean isChecked() {
        return this.F;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.l(this, this.D.f3849c);
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 3);
        c cVar = this.D;
        if (cVar != null && cVar.f3864s) {
            View.mergeDrawableStates(onCreateDrawableState, H);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        if (this.G) {
            View.mergeDrawableStates(onCreateDrawableState, J);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.D;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f3864s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
        this.D.e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.E) {
            c cVar = this.D;
            if (!cVar.f3863r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.f3863r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.D.f3849c.m(colorStateList);
    }

    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        c cVar = this.D;
        cVar.f3849c.l(cVar.f3847a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        f fVar = this.D.f3850d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        fVar.m(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.D.f3864s = z10;
    }

    public void setChecked(boolean z10) {
        if (this.F != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.D.g(drawable);
    }

    public void setCheckedIconGravity(int i8) {
        c cVar = this.D;
        if (cVar.f3853g != i8) {
            cVar.f3853g = i8;
            MaterialCardView materialCardView = cVar.f3847a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i8) {
        this.D.f3851e = i8;
    }

    public void setCheckedIconMarginResource(int i8) {
        if (i8 != -1) {
            this.D.f3851e = getResources().getDimensionPixelSize(i8);
        }
    }

    public void setCheckedIconResource(int i8) {
        this.D.g(f.a.a(getContext(), i8));
    }

    public void setCheckedIconSize(int i8) {
        this.D.f3852f = i8;
    }

    public void setCheckedIconSizeResource(int i8) {
        if (i8 != 0) {
            this.D.f3852f = getResources().getDimensionPixelSize(i8);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.D;
        cVar.f3858l = colorStateList;
        Drawable drawable = cVar.f3856j;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
        }
    }

    public void setClickable(boolean z10) {
        super.setClickable(z10);
        c cVar = this.D;
        if (cVar != null) {
            Drawable drawable = cVar.f3855i;
            MaterialCardView materialCardView = cVar.f3847a;
            Drawable c3 = materialCardView.isClickable() ? cVar.c() : cVar.f3850d;
            cVar.f3855i = c3;
            if (drawable == c3) {
                return;
            }
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c3);
            } else {
                materialCardView.setForeground(cVar.d(c3));
            }
        }
    }

    public void setDragged(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.D.k();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        c cVar = this.D;
        cVar.k();
        cVar.j();
    }

    public void setProgress(float f10) {
        c cVar = this.D;
        cVar.f3849c.n(f10);
        f fVar = cVar.f3850d;
        if (fVar != null) {
            fVar.n(f10);
        }
        f fVar2 = cVar.f3862q;
        if (fVar2 != null) {
            fVar2.n(f10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if ((r0.f3847a.getPreventCornerOverlap() && !r0.f3849c.k()) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRadius(float r3) {
        /*
            r2 = this;
            super.setRadius(r3)
            c8.c r0 = r2.D
            v8.i r1 = r0.m
            v8.i r3 = r1.e(r3)
            r0.h(r3)
            android.graphics.drawable.Drawable r3 = r0.f3855i
            r3.invalidateSelf()
            boolean r3 = r0.i()
            if (r3 != 0) goto L_0x002e
            com.google.android.material.card.MaterialCardView r3 = r0.f3847a
            boolean r3 = r3.getPreventCornerOverlap()
            if (r3 == 0) goto L_0x002b
            v8.f r3 = r0.f3849c
            boolean r3 = r3.k()
            if (r3 != 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x0031
        L_0x002e:
            r0.j()
        L_0x0031:
            boolean r3 = r0.i()
            if (r3 == 0) goto L_0x003a
            r0.k()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.setRadius(float):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.D;
        cVar.f3857k = colorStateList;
        int[] iArr = s8.a.f14809a;
        RippleDrawable rippleDrawable = cVar.f3860o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i8) {
        ColorStateList b10 = t1.a.b(getContext(), i8);
        c cVar = this.D;
        cVar.f3857k = b10;
        int[] iArr = s8.a.f14809a;
        RippleDrawable rippleDrawable = cVar.f3860o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(b10);
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        setClipToOutline(iVar.d(getBoundsAsRectF()));
        this.D.h(iVar);
    }

    public void setStrokeColor(int i8) {
        setStrokeColor(ColorStateList.valueOf(i8));
    }

    public void setStrokeWidth(int i8) {
        c cVar = this.D;
        if (i8 != cVar.f3854h) {
            cVar.f3854h = i8;
            f fVar = cVar.f3850d;
            ColorStateList colorStateList = cVar.f3859n;
            fVar.f16250a.f16266k = (float) i8;
            fVar.invalidateSelf();
            f.b bVar = fVar.f16250a;
            if (bVar.f16259d != colorStateList) {
                bVar.f16259d = colorStateList;
                fVar.onStateChange(fVar.getState());
            }
        }
        invalidate();
    }

    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        c cVar = this.D;
        cVar.k();
        cVar.j();
    }

    public final void toggle() {
        c cVar = this.D;
        if ((cVar != null && cVar.f3864s) && isEnabled()) {
            this.F = !this.F;
            refreshDrawableState();
            d();
            cVar.f(this.F, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.D;
        if (cVar.f3859n != colorStateList) {
            cVar.f3859n = colorStateList;
            f fVar = cVar.f3850d;
            fVar.f16250a.f16266k = (float) cVar.f3854h;
            fVar.invalidateSelf();
            f.b bVar = fVar.f16250a;
            if (bVar.f16259d != colorStateList) {
                bVar.f16259d = colorStateList;
                fVar.onStateChange(fVar.getState());
            }
        }
        invalidate();
    }

    public void setCardBackgroundColor(int i8) {
        this.D.f3849c.m(ColorStateList.valueOf(i8));
    }
}
