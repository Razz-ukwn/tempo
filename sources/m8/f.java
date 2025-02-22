package m8;

import ag.n2;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.n0;

public class f extends n0 {
    public Drawable L;
    public final Rect M;
    public final Rect N;
    public int O;
    public final boolean P;
    public boolean Q;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.L;
        if (drawable != null) {
            if (this.Q) {
                this.Q = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.P;
                Rect rect = this.M;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i8 = this.O;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.N;
                Gravity.apply(i8, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.L;
        if (drawable != null && drawable.isStateful()) {
            this.L.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.L;
    }

    public int getForegroundGravity() {
        return this.O;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        this.Q = z10 | this.Q;
    }

    public final void onSizeChanged(int i8, int i10, int i11, int i12) {
        super.onSizeChanged(i8, i10, i11, i12);
        this.Q = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.L);
            }
            this.L = drawable;
            this.Q = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.O == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i8) {
        if (this.O != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.O = i8;
            if (i8 == 119 && this.L != null) {
                this.L.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.L;
    }

    public f(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, 0);
        this.M = new Rect();
        this.N = new Rect();
        this.O = 119;
        this.P = true;
        this.Q = false;
        TypedArray d10 = s.d(context, attributeSet, n2.N, 0, 0, new int[0]);
        this.O = d10.getInt(1, this.O);
        Drawable drawable = d10.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.P = d10.getBoolean(2, true);
        d10.recycle();
    }
}
