package i0;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.databinding.a;
import b1.b;
import sf.j;

public final class c implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f9361a = new Paint(7);

    /* renamed from: b  reason: collision with root package name */
    public int f9362b = 3;

    /* renamed from: c  reason: collision with root package name */
    public Shader f9363c;

    public final Paint a() {
        return this.f9361a;
    }

    public final long b() {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        long color = ((long) paint.getColor()) << 32;
        int i8 = i.f9377f;
        return color;
    }

    public final int c() {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        return paint.isFilterBitmap() ? 1 : 0;
    }

    public final int d() {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i8 = strokeCap == null ? -1 : d.f9364a[strokeCap.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return 1;
            }
            if (i8 == 3) {
                return 2;
            }
        }
        return 0;
    }

    public final int e() {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i8 = strokeJoin == null ? -1 : d.f9365b[strokeJoin.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                return i8 != 3 ? 0 : 1;
            }
            return 2;
        }
    }

    public final float f() {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public final float g() {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public final void h(float f10) {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        paint.setAlpha((int) ((float) Math.rint((double) (f10 * 255.0f))));
    }

    public final void i(int i8) {
        PorterDuff.Mode mode;
        boolean z10 = true;
        if (!(this.f9362b == i8)) {
            this.f9362b = i8;
            Paint paint = this.f9361a;
            j.f(paint, "$this$setNativeBlendMode");
            if (Build.VERSION.SDK_INT >= 29) {
                v.f9395a.a(paint, i8);
                return;
            }
            if (i8 == 0) {
                mode = PorterDuff.Mode.CLEAR;
            } else {
                if (i8 == 1) {
                    mode = PorterDuff.Mode.SRC;
                } else {
                    if (i8 == 2) {
                        mode = PorterDuff.Mode.DST;
                    } else {
                        if (i8 == 3) {
                            mode = PorterDuff.Mode.SRC_OVER;
                        } else {
                            if (i8 == 4) {
                                mode = PorterDuff.Mode.DST_OVER;
                            } else {
                                if (i8 == 5) {
                                    mode = PorterDuff.Mode.SRC_IN;
                                } else {
                                    if (i8 == 6) {
                                        mode = PorterDuff.Mode.DST_IN;
                                    } else {
                                        if (i8 == 7) {
                                            mode = PorterDuff.Mode.SRC_OUT;
                                        } else {
                                            if (i8 == 8) {
                                                mode = PorterDuff.Mode.DST_OUT;
                                            } else {
                                                if (i8 == 9) {
                                                    mode = PorterDuff.Mode.SRC_ATOP;
                                                } else {
                                                    if (i8 == 10) {
                                                        mode = PorterDuff.Mode.DST_ATOP;
                                                    } else {
                                                        if (i8 == 11) {
                                                            mode = PorterDuff.Mode.XOR;
                                                        } else {
                                                            if (i8 == 12) {
                                                                mode = PorterDuff.Mode.ADD;
                                                            } else {
                                                                if (i8 == 14) {
                                                                    mode = PorterDuff.Mode.SCREEN;
                                                                } else {
                                                                    if (i8 == 15) {
                                                                        mode = PorterDuff.Mode.OVERLAY;
                                                                    } else {
                                                                        if (i8 == 16) {
                                                                            mode = PorterDuff.Mode.DARKEN;
                                                                        } else {
                                                                            if (i8 == 17) {
                                                                                mode = PorterDuff.Mode.LIGHTEN;
                                                                            } else {
                                                                                if (i8 != 13) {
                                                                                    z10 = false;
                                                                                }
                                                                                mode = z10 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
    }

    public final void j(long j10) {
        Paint paint = this.f9361a;
        j.f(paint, "$this$setNativeColor");
        paint.setColor(a.l(j10));
    }

    public final void k() {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        paint.setColorFilter((ColorFilter) null);
    }

    public final void l(int i8) {
        Paint paint = this.f9361a;
        j.f(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!(i8 == 0));
    }

    public final void m(b bVar) {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        paint.setPathEffect((PathEffect) null);
    }

    public final void n() {
        this.f9363c = null;
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        paint.setShader((Shader) null);
    }

    public final void o(int i8) {
        Paint.Cap cap;
        Paint paint = this.f9361a;
        j.f(paint, "$this$setNativeStrokeCap");
        boolean z10 = false;
        if (i8 == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            if (i8 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                if (i8 == 0) {
                    z10 = true;
                }
                cap = z10 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
        }
        paint.setStrokeCap(cap);
    }

    public final void p(int i8) {
        Paint.Join join;
        Paint paint = this.f9361a;
        j.f(paint, "$this$setNativeStrokeJoin");
        boolean z10 = false;
        if (i8 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (i8 == 2) {
                join = Paint.Join.BEVEL;
            } else {
                if (i8 == 1) {
                    z10 = true;
                }
                join = z10 ? Paint.Join.ROUND : Paint.Join.MITER;
            }
        }
        paint.setStrokeJoin(join);
    }

    public final void q(float f10) {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        paint.setStrokeMiter(f10);
    }

    public final void r(float f10) {
        Paint paint = this.f9361a;
        j.f(paint, "<this>");
        paint.setStrokeWidth(f10);
    }

    public final void s(int i8) {
        Paint paint = this.f9361a;
        j.f(paint, "$this$setNativeStyle");
        boolean z10 = true;
        if (i8 != 1) {
            z10 = false;
        }
        paint.setStyle(z10 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
