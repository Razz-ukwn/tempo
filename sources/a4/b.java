package a4;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.fragment.app.q;
import cb.f;
import d2.f1;
import java.util.ArrayList;
import q4.a;
import s3.c;

public final class b extends Drawable implements Drawable.Callback, Animatable {
    public final int B;
    public final int C;
    public long D;
    public int E;
    public int F;
    public Drawable G;
    public final Drawable H;

    /* renamed from: a  reason: collision with root package name */
    public final int f100a;

    /* renamed from: b  reason: collision with root package name */
    public final int f101b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f102c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f103d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f104e = new ArrayList();

    public b(Drawable drawable, Drawable drawable2, int i8, int i10, boolean z10, boolean z11) {
        this.f100a = i8;
        this.f101b = i10;
        this.f102c = z10;
        this.f103d = z11;
        Drawable drawable3 = null;
        this.B = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.C = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.E = 255;
        this.G = drawable != null ? drawable.mutate() : null;
        drawable3 = drawable2 != null ? drawable2.mutate() : drawable3;
        this.H = drawable3;
        if (i10 > 0) {
            Drawable drawable4 = this.G;
            if (drawable4 != null) {
                drawable4.setCallback(this);
            }
            if (drawable3 != null) {
                drawable3.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    public final int a(Integer num, Integer num2) {
        int i8 = -1;
        if (!this.f103d && ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1))) {
            return -1;
        }
        int intValue = num != null ? num.intValue() : -1;
        if (num2 != null) {
            i8 = num2.intValue();
        }
        return Math.max(intValue, i8);
    }

    public final void b() {
        this.F = 2;
        this.G = null;
        ArrayList arrayList = this.f104e;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((c) arrayList.get(i8)).a(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double c3 = f.c(intrinsicWidth, intrinsicHeight, width, height, this.f100a);
        double d10 = (double) 2;
        int f10 = a.f((((double) width) - (((double) intrinsicWidth) * c3)) / d10);
        int f11 = a.f((((double) height) - (c3 * ((double) intrinsicHeight))) / d10);
        drawable.setBounds(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i8 = this.F;
        if (i8 == 0) {
            Drawable drawable2 = this.G;
            if (drawable2 != null) {
                drawable2.setAlpha(this.E);
                int save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } else {
            Drawable drawable3 = this.H;
            if (i8 != 2) {
                double uptimeMillis = ((double) (SystemClock.uptimeMillis() - this.D)) / ((double) this.f101b);
                double o10 = f1.o(uptimeMillis, 0.0d, 1.0d);
                int i10 = this.E;
                int i11 = (int) (o10 * ((double) i10));
                if (this.f102c) {
                    i10 -= i11;
                }
                boolean z10 = uptimeMillis >= 1.0d;
                if (!z10 && (drawable = this.G) != null) {
                    drawable.setAlpha(i10);
                    int save2 = canvas.save();
                    try {
                        drawable.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save2);
                    }
                }
                if (drawable3 != null) {
                    drawable3.setAlpha(i11);
                    int save3 = canvas.save();
                    try {
                        drawable3.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save3);
                    }
                }
                if (z10) {
                    b();
                } else {
                    invalidateSelf();
                }
            } else if (drawable3 != null) {
                drawable3.setAlpha(this.E);
                int save4 = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
        }
    }

    public final int getAlpha() {
        return this.E;
    }

    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i8 = this.F;
        if (i8 != 0) {
            Drawable drawable = this.H;
            if (i8 != 1) {
                if (i8 == 2 && drawable != null) {
                    return drawable.getColorFilter();
                }
                return null;
            } else if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                return colorFilter;
            } else {
                Drawable drawable2 = this.G;
                if (drawable2 != null) {
                    return drawable2.getColorFilter();
                }
                return null;
            }
        } else {
            Drawable drawable3 = this.G;
            if (drawable3 != null) {
                return drawable3.getColorFilter();
            }
            return null;
        }
    }

    public final int getIntrinsicHeight() {
        return this.C;
    }

    public final int getIntrinsicWidth() {
        return this.B;
    }

    public final int getOpacity() {
        Drawable drawable = this.G;
        int i8 = this.F;
        if (i8 != 0) {
            Drawable drawable2 = this.H;
            if (i8 == 2) {
                if (drawable2 != null) {
                    return drawable2.getOpacity();
                }
                return -2;
            } else if (drawable != null && drawable2 != null) {
                return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
            } else {
                if (drawable != null) {
                    return drawable.getOpacity();
                }
                if (drawable2 != null) {
                    return drawable2.getOpacity();
                }
                return -2;
            }
        } else if (drawable != null) {
            return drawable.getOpacity();
        } else {
            return -2;
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isRunning() {
        return this.F == 1;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.G;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    public final boolean onLevelChange(int i8) {
        Drawable drawable = this.G;
        boolean level = drawable != null ? drawable.setLevel(i8) : false;
        Drawable drawable2 = this.H;
        return level || (drawable2 != null ? drawable2.setLevel(i8) : false);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.G;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.H;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public final void setAlpha(int i8) {
        boolean z10 = false;
        if (i8 >= 0 && i8 < 256) {
            z10 = true;
        }
        if (z10) {
            this.E = i8;
            return;
        }
        throw new IllegalArgumentException(q.a("Invalid alpha: ", i8).toString());
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i8) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTint(i8);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTint(i8);
        }
    }

    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.G
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.start()
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r4.H
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0019
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x0019:
            if (r2 == 0) goto L_0x001e
            r2.start()
        L_0x001e:
            int r0 = r4.F
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            r0 = 1
            r4.F = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.D = r0
            java.util.ArrayList r0 = r4.f104e
            int r1 = r0.size()
            r2 = 0
        L_0x0033:
            if (r2 >= r1) goto L_0x0041
            java.lang.Object r3 = r0.get(r2)
            s3.c r3 = (s3.c) r3
            r3.b(r4)
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0041:
            r4.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.b.start():void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void stop() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.G
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.stop()
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r3.H
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0019
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x0019:
            if (r2 == 0) goto L_0x001e
            r2.stop()
        L_0x001e:
            int r0 = r3.F
            r1 = 2
            if (r0 == r1) goto L_0x0026
            r3.b()
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.b.stop():void");
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
