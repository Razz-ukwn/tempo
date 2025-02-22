package g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import w1.a;

public class a extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f8748a;

    public a(Drawable drawable) {
        Drawable drawable2 = this.f8748a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f8748a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f8748a.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f8748a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f8748a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f8748a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f8748a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f8748a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f8748a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f8748a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f8748a.getPadding(rect);
    }

    public final int[] getState() {
        return this.f8748a.getState();
    }

    public final Region getTransparentRegion() {
        return this.f8748a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return a.C0303a.d(this.f8748a);
    }

    public final boolean isStateful() {
        return this.f8748a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f8748a.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f8748a.setBounds(rect);
    }

    public final boolean onLevelChange(int i8) {
        return this.f8748a.setLevel(i8);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public final void setAlpha(int i8) {
        this.f8748a.setAlpha(i8);
    }

    public final void setAutoMirrored(boolean z10) {
        a.C0303a.e(this.f8748a, z10);
    }

    public final void setChangingConfigurations(int i8) {
        this.f8748a.setChangingConfigurations(i8);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8748a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z10) {
        this.f8748a.setDither(z10);
    }

    public final void setFilterBitmap(boolean z10) {
        this.f8748a.setFilterBitmap(z10);
    }

    public void setHotspot(float f10, float f11) {
        a.b.e(this.f8748a, f10, f11);
    }

    public void setHotspotBounds(int i8, int i10, int i11, int i12) {
        a.b.f(this.f8748a, i8, i10, i11, i12);
    }

    public boolean setState(int[] iArr) {
        return this.f8748a.setState(iArr);
    }

    public final void setTint(int i8) {
        a.b.g(this.f8748a, i8);
    }

    public final void setTintList(ColorStateList colorStateList) {
        a.b.h(this.f8748a, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        a.b.i(this.f8748a, mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f8748a.setVisible(z10, z11);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
