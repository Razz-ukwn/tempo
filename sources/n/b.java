package n;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f11503a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f11504b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f11505c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f11506d;

    /* renamed from: e  reason: collision with root package name */
    public float f11507e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11508f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11509g = true;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f11510h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f11511i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f11512j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f11513k = PorterDuff.Mode.SRC_IN;

    public b(float f10, ColorStateList colorStateList) {
        this.f11503a = f10;
        this.f11504b = new Paint(5);
        b(colorStateList);
        this.f11505c = new RectF();
        this.f11506d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f11510h = colorStateList;
        this.f11504b.setColor(colorStateList.getColorForState(getState(), this.f11510h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f11505c;
        rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        Rect rect2 = this.f11506d;
        rect2.set(rect);
        if (this.f11508f) {
            float a10 = c.a(this.f11507e, this.f11503a, this.f11509g);
            float f10 = this.f11507e;
            float f11 = this.f11503a;
            if (this.f11509g) {
                f10 = (float) (((1.0d - c.f11514a) * ((double) f11)) + ((double) f10));
            }
            rect2.inset((int) Math.ceil((double) f10), (int) Math.ceil((double) a10));
            rectF.set(rect2);
        }
    }

    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f11504b;
        if (this.f11511i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f11511i);
            z10 = true;
        }
        RectF rectF = this.f11505c;
        float f10 = this.f11503a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f11506d, this.f11503a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f11510h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f11512j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f11510h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.b.isStateful():boolean");
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f11510h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f11504b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f11512j;
        if (colorStateList2 == null || (mode = this.f11513k) == null) {
            return z10;
        }
        this.f11511i = a(colorStateList2, mode);
        return true;
    }

    public final void setAlpha(int i8) {
        this.f11504b.setAlpha(i8);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11504b.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f11512j = colorStateList;
        this.f11511i = a(colorStateList, this.f11513k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f11513k = mode;
        this.f11511i = a(this.f11512j, mode);
        invalidateSelf();
    }
}
