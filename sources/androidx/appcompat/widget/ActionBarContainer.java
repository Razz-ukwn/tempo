package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import cb.e;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public class ActionBarContainer extends FrameLayout {
    public Drawable B;
    public Drawable C;
    public final boolean D;
    public boolean E;
    public final int F;

    /* renamed from: a  reason: collision with root package name */
    public boolean f794a;

    /* renamed from: b  reason: collision with root package name */
    public y0 f795b;

    /* renamed from: c  reason: collision with root package name */
    public View f796c;

    /* renamed from: d  reason: collision with root package name */
    public View f797d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f798e;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f3895b);
        boolean z10 = false;
        this.f798e = obtainStyledAttributes.getDrawable(0);
        this.B = obtainStyledAttributes.getDrawable(2);
        this.F = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.D = true;
            this.C = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.D ? this.f798e == null && this.B == null : this.C == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f798e;
        if (drawable != null && drawable.isStateful()) {
            this.f798e.setState(getDrawableState());
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null && drawable2.isStateful()) {
            this.B.setState(getDrawableState());
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null && drawable3.isStateful()) {
            this.C.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f795b;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f798e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f796c = findViewById(R.id.action_bar);
        this.f797d = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f794a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            androidx.appcompat.widget.y0 r5 = r4.f795b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.D
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.C
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.f798e
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f796c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.f798e
            android.view.View r7 = r4.f796c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f796c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f796c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f796c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.f797d
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.f798e
            android.view.View r7 = r4.f797d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f797d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f797d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f797d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.f798e
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.E = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.B
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i8, int i10) {
        int i11;
        if (this.f796c == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.F) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i8, i10);
        if (this.f796c != null) {
            int mode = View.MeasureSpec.getMode(i10);
            y0 y0Var = this.f795b;
            if (y0Var != null && y0Var.getVisibility() != 8 && mode != 1073741824) {
                View view = this.f796c;
                boolean z10 = true;
                int i12 = 0;
                if (!(view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0)) {
                    i12 = a(this.f796c);
                } else {
                    View view2 = this.f797d;
                    if (!(view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0)) {
                        z10 = false;
                    }
                    if (!z10) {
                        i12 = a(this.f797d);
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f795b) + i12, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i10) : Integer.MAX_VALUE));
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f798e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f798e);
        }
        this.f798e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f796c;
            if (view != null) {
                this.f798e.setBounds(view.getLeft(), this.f796c.getTop(), this.f796c.getRight(), this.f796c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.D ? !(this.f798e == null && this.B == null) : this.C != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.C);
        }
        this.C = drawable;
        boolean z10 = this.D;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.C) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? this.f798e == null && this.B == null : this.C == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.B;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.B);
        }
        this.B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.E && (drawable2 = this.B) != null) {
                drawable2.setBounds(this.f795b.getLeft(), this.f795b.getTop(), this.f795b.getRight(), this.f795b.getBottom());
            }
        }
        setWillNotDraw(!this.D ? this.f798e == null && this.B == null : this.C == null);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(y0 y0Var) {
        y0 y0Var2 = this.f795b;
        if (y0Var2 != null) {
            removeView(y0Var2);
        }
        this.f795b = y0Var;
        if (y0Var != null) {
            addView(y0Var);
            ViewGroup.LayoutParams layoutParams = y0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            y0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f794a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z10 = i8 == 0;
        Drawable drawable = this.f798e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i8) {
        if (i8 != 0) {
            return super.startActionModeForChild(view, callback, i8);
        }
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f798e;
        boolean z10 = this.D;
        return (drawable == drawable2 && !z10) || (drawable == this.B && this.E) || ((drawable == this.C && z10) || super.verifyDrawable(drawable));
    }
}
