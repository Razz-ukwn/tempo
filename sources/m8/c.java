package m8;

import a2.b;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import b2.j;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;
import m8.o;
import r8.a;
import r8.f;

public final class c {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public final boolean D = true;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f11223a;

    /* renamed from: a0  reason: collision with root package name */
    public float f11224a0;

    /* renamed from: b  reason: collision with root package name */
    public float f11225b;

    /* renamed from: b0  reason: collision with root package name */
    public float f11226b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f11227c;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f11228c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f11229d;

    /* renamed from: d0  reason: collision with root package name */
    public final int f11230d0 = 1;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f11231e;

    /* renamed from: e0  reason: collision with root package name */
    public final float f11232e0 = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int f11233f = 16;

    /* renamed from: f0  reason: collision with root package name */
    public final int f11234f0 = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f11235g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f11236h = 15.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f11237i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f11238j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f11239k;

    /* renamed from: l  reason: collision with root package name */
    public float f11240l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public float f11241n;

    /* renamed from: o  reason: collision with root package name */
    public float f11242o;

    /* renamed from: p  reason: collision with root package name */
    public float f11243p;

    /* renamed from: q  reason: collision with root package name */
    public float f11244q;

    /* renamed from: r  reason: collision with root package name */
    public Typeface f11245r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f11246s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f11247t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f11248u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f11249v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f11250w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f11251x;

    /* renamed from: y  reason: collision with root package name */
    public a f11252y;

    /* renamed from: z  reason: collision with root package name */
    public final TextUtils.TruncateAt f11253z = TextUtils.TruncateAt.END;

    public c(View view) {
        this.f11223a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f11229d = new Rect();
        this.f11227c = new Rect();
        this.f11231e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i8, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((((float) Color.alpha(i10)) * f10) + (((float) Color.alpha(i8)) * f11)), Math.round((((float) Color.red(i10)) * f10) + (((float) Color.red(i8)) * f11)), Math.round((((float) Color.green(i10)) * f10) + (((float) Color.green(i8)) * f11)), Math.round((((float) Color.blue(i10)) * f10) + (((float) Color.blue(i8)) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = v7.a.f16228a;
        return b.b(f11, f10, f12, f10);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        boolean z10 = true;
        if (i0.e.d(this.f11223a) != 1) {
            z10 = false;
        }
        if (!this.D) {
            return z10;
        }
        return (z10 ? j.f3019d : j.f3018c).b(charSequence, charSequence.length());
    }

    public final void c(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        boolean z11;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        if (this.A != null) {
            float width = (float) this.f11229d.width();
            float width2 = (float) this.f11227c.width();
            if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
                f12 = this.f11237i;
                f11 = this.V;
                this.F = 1.0f;
                typeface = this.f11245r;
            } else {
                float f13 = this.f11236h;
                float f14 = this.W;
                Typeface typeface2 = this.f11248u;
                if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                    this.F = 1.0f;
                } else {
                    this.F = f(this.f11236h, this.f11237i, f10, this.Q) / this.f11236h;
                }
                float f15 = this.f11237i / this.f11236h;
                width = (!z10 && width2 * f15 > width) ? Math.min(width / f15, width2) : width2;
                f12 = f13;
                f11 = f14;
                typeface = typeface2;
            }
            int i8 = (width > 0.0f ? 1 : (width == 0.0f ? 0 : -1));
            TextPaint textPaint = this.N;
            if (i8 > 0) {
                boolean z12 = this.G != f12;
                boolean z13 = this.X != f11;
                boolean z14 = this.f11251x != typeface;
                StaticLayout staticLayout2 = this.Y;
                z11 = z12 || z13 || (staticLayout2 != null && (width > ((float) staticLayout2.getWidth()) ? 1 : (width == ((float) staticLayout2.getWidth()) ? 0 : -1)) != 0) || z14 || this.M;
                this.G = f12;
                this.X = f11;
                this.f11251x = typeface;
                this.M = false;
                textPaint.setLinearText(this.F != 1.0f);
            } else {
                z11 = false;
            }
            if (this.B == null || z11) {
                textPaint.setTextSize(this.G);
                textPaint.setTypeface(this.f11251x);
                textPaint.setLetterSpacing(this.X);
                boolean b10 = b(this.A);
                this.C = b10;
                int i10 = this.f11230d0;
                if (!(i10 > 1 && !b10)) {
                    i10 = 1;
                }
                if (i10 == 1) {
                    try {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } catch (o.a e10) {
                        Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
                        staticLayout = null;
                    }
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f11233f, b10 ? 1 : 0) & 7;
                    alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
                }
                o oVar = new o(this.A, textPaint, (int) width);
                oVar.f11297l = this.f11253z;
                oVar.f11296k = b10;
                oVar.f11290e = alignment;
                oVar.f11295j = false;
                oVar.f11291f = i10;
                float f16 = this.f11232e0;
                oVar.f11292g = 0.0f;
                oVar.f11293h = f16;
                oVar.f11294i = this.f11234f0;
                staticLayout = oVar.a();
                staticLayout.getClass();
                this.Y = staticLayout;
                this.B = staticLayout.getText();
            }
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f11237i);
        textPaint.setTypeface(this.f11245r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f11247t;
            if (typeface != null) {
                this.f11246s = f.a(configuration, typeface);
            }
            Typeface typeface2 = this.f11250w;
            if (typeface2 != null) {
                this.f11249v = f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f11246s;
            if (typeface3 == null) {
                typeface3 = this.f11247t;
            }
            this.f11245r = typeface3;
            Typeface typeface4 = this.f11249v;
            if (typeface4 == null) {
                typeface4 = this.f11250w;
            }
            this.f11248u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z10) {
        float f10;
        StaticLayout staticLayout;
        boolean z11 = z10;
        View view = this.f11223a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z11) {
            c(1.0f, z11);
            CharSequence charSequence = this.B;
            TextPaint textPaint = this.N;
            if (!(charSequence == null || (staticLayout = this.Y) == null)) {
                this.f11228c0 = TextUtils.ellipsize(charSequence, textPaint, (float) staticLayout.getWidth(), this.f11253z);
            }
            CharSequence charSequence2 = this.f11228c0;
            if (charSequence2 != null) {
                this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f11235g, this.C ? 1 : 0);
            int i8 = absoluteGravity & 112;
            Rect rect = this.f11229d;
            if (i8 == 48) {
                this.m = (float) rect.top;
            } else if (i8 != 80) {
                this.m = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                this.m = textPaint.ascent() + ((float) rect.bottom);
            }
            int i10 = absoluteGravity & 8388615;
            if (i10 == 1) {
                this.f11242o = ((float) rect.centerX()) - (this.Z / 2.0f);
            } else if (i10 != 5) {
                this.f11242o = (float) rect.left;
            } else {
                this.f11242o = ((float) rect.right) - this.Z;
            }
            c(0.0f, z11);
            StaticLayout staticLayout2 = this.Y;
            float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
            StaticLayout staticLayout3 = this.Y;
            if (staticLayout3 == null || this.f11230d0 <= 1) {
                CharSequence charSequence3 = this.B;
                f10 = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
            } else {
                f10 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f11233f, this.C ? 1 : 0);
            int i11 = absoluteGravity2 & 112;
            Rect rect2 = this.f11227c;
            if (i11 == 48) {
                this.f11240l = (float) rect2.top;
            } else if (i11 != 80) {
                this.f11240l = ((float) rect2.centerY()) - (height / 2.0f);
            } else {
                this.f11240l = textPaint.descent() + (((float) rect2.bottom) - height);
            }
            int i12 = absoluteGravity2 & 8388615;
            if (i12 == 1) {
                this.f11241n = ((float) rect2.centerX()) - (f10 / 2.0f);
            } else if (i12 != 5) {
                this.f11241n = (float) rect2.left;
            } else {
                this.f11241n = ((float) rect2.right) - f10;
            }
            Bitmap bitmap = this.E;
            if (bitmap != null) {
                bitmap.recycle();
                this.E = null;
            }
            l(this.f11225b);
            float f11 = this.f11225b;
            float f12 = f((float) rect2.left, (float) rect.left, f11, this.P);
            RectF rectF = this.f11231e;
            rectF.left = f12;
            rectF.top = f(this.f11240l, this.m, f11, this.P);
            rectF.right = f((float) rect2.right, (float) rect.right, f11, this.P);
            rectF.bottom = f((float) rect2.bottom, (float) rect.bottom, f11, this.P);
            this.f11243p = f(this.f11241n, this.f11242o, f11, this.P);
            this.f11244q = f(this.f11240l, this.m, f11, this.P);
            l(f11);
            v2.b bVar = v7.a.f16229b;
            this.f11224a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f11, bVar);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(view);
            this.f11226b0 = f(1.0f, 0.0f, f11, bVar);
            i0.d.k(view);
            ColorStateList colorStateList = this.f11239k;
            ColorStateList colorStateList2 = this.f11238j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f11, e(colorStateList2), e(this.f11239k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.V;
            float f14 = this.W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, f11, bVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.H = f(0.0f, this.R, f11, (TimeInterpolator) null);
            this.I = f(0.0f, this.S, f11, (TimeInterpolator) null);
            this.J = f(0.0f, this.T, f11, (TimeInterpolator) null);
            int a10 = a(f11, e((ColorStateList) null), e(this.U));
            this.K = a10;
            textPaint.setShadowLayer(this.H, this.I, this.J, a10);
            i0.d.k(view);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f11239k != colorStateList || this.f11238j != colorStateList) {
            this.f11239k = colorStateList;
            this.f11238j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        a aVar = this.f11252y;
        if (aVar != null) {
            aVar.f14090d = true;
        }
        if (this.f11247t == typeface) {
            return false;
        }
        this.f11247t = typeface;
        Typeface a10 = f.a(this.f11223a.getContext().getResources().getConfiguration(), typeface);
        this.f11246s = a10;
        if (a10 == null) {
            a10 = this.f11247t;
        }
        this.f11245r = a10;
        return true;
    }

    public final void k(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f11225b) {
            this.f11225b = f10;
            Rect rect = this.f11227c;
            Rect rect2 = this.f11229d;
            float f11 = f((float) rect.left, (float) rect2.left, f10, this.P);
            RectF rectF = this.f11231e;
            rectF.left = f11;
            rectF.top = f(this.f11240l, this.m, f10, this.P);
            rectF.right = f((float) rect.right, (float) rect2.right, f10, this.P);
            rectF.bottom = f((float) rect.bottom, (float) rect2.bottom, f10, this.P);
            this.f11243p = f(this.f11241n, this.f11242o, f10, this.P);
            this.f11244q = f(this.f11240l, this.m, f10, this.P);
            l(f10);
            v2.b bVar = v7.a.f16229b;
            this.f11224a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, bVar);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            View view = this.f11223a;
            i0.d.k(view);
            this.f11226b0 = f(1.0f, 0.0f, f10, bVar);
            i0.d.k(view);
            ColorStateList colorStateList = this.f11239k;
            ColorStateList colorStateList2 = this.f11238j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, e(colorStateList2), e(this.f11239k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f12 = this.V;
            float f13 = this.W;
            if (f12 != f13) {
                textPaint.setLetterSpacing(f(f13, f12, f10, bVar));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.H = f(0.0f, this.R, f10, (TimeInterpolator) null);
            this.I = f(0.0f, this.S, f10, (TimeInterpolator) null);
            this.J = f(0.0f, this.T, f10, (TimeInterpolator) null);
            int a10 = a(f10, e((ColorStateList) null), e(this.U));
            this.K = a10;
            textPaint.setShadowLayer(this.H, this.I, this.J, a10);
            i0.d.k(view);
        }
    }

    public final void l(float f10) {
        c(f10, false);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.k(this.f11223a);
    }

    public final void m(Typeface typeface) {
        boolean z10;
        boolean j10 = j(typeface);
        if (this.f11250w != typeface) {
            this.f11250w = typeface;
            Typeface a10 = f.a(this.f11223a.getContext().getResources().getConfiguration(), typeface);
            this.f11249v = a10;
            if (a10 == null) {
                a10 = this.f11250w;
            }
            this.f11248u = a10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 || z10) {
            h(false);
        }
    }
}
