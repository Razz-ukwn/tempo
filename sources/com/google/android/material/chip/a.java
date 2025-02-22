package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.quickkonnect.silencio.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import m8.p;
import m8.v;
import v1.d;
import v7.g;
import v8.f;
import v8.j;
import w1.a;
import w1.b;

public final class a extends f implements Drawable.Callback, p.b {

    /* renamed from: c1  reason: collision with root package name */
    public static final int[] f5812c1 = {16842910};

    /* renamed from: d1  reason: collision with root package name */
    public static final ShapeDrawable f5813d1 = new ShapeDrawable(new OvalShape());
    public final Context A0;
    public final Paint B0 = new Paint(1);
    public final Paint.FontMetrics C0 = new Paint.FontMetrics();
    public final RectF D0 = new RectF();
    public final PointF E0 = new PointF();
    public final Path F0 = new Path();
    public final p G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public boolean N0;
    public int O0;
    public int P0 = 255;
    public ColorFilter Q0;
    public PorterDuffColorFilter R0;
    public ColorStateList S0;
    public ColorStateList T;
    public PorterDuff.Mode T0 = PorterDuff.Mode.SRC_IN;
    public ColorStateList U;
    public int[] U0;
    public float V;
    public boolean V0;
    public float W = -1.0f;
    public ColorStateList W0;
    public ColorStateList X;
    public WeakReference<C0072a> X0 = new WeakReference<>((Object) null);
    public float Y;
    public TextUtils.TruncateAt Y0;
    public ColorStateList Z;
    public boolean Z0;

    /* renamed from: a0  reason: collision with root package name */
    public CharSequence f5814a0;

    /* renamed from: a1  reason: collision with root package name */
    public int f5815a1;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f5816b0;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f5817b1;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f5818c0;

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f5819d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f5820e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f5821f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f5822g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f5823h0;

    /* renamed from: i0  reason: collision with root package name */
    public RippleDrawable f5824i0;

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f5825j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f5826k0;

    /* renamed from: l0  reason: collision with root package name */
    public SpannableStringBuilder f5827l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f5828m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f5829n0;

    /* renamed from: o0  reason: collision with root package name */
    public Drawable f5830o0;

    /* renamed from: p0  reason: collision with root package name */
    public ColorStateList f5831p0;

    /* renamed from: q0  reason: collision with root package name */
    public g f5832q0;

    /* renamed from: r0  reason: collision with root package name */
    public g f5833r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f5834s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f5835t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f5836u0;

    /* renamed from: v0  reason: collision with root package name */
    public float f5837v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f5838w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f5839x0;

    /* renamed from: y0  reason: collision with root package name */
    public float f5840y0;

    /* renamed from: z0  reason: collision with root package name */
    public float f5841z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0072a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2132018203);
        j(context);
        this.A0 = context;
        p pVar = new p(this);
        this.G0 = pVar;
        this.f5814a0 = "";
        pVar.f11298a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f5812c1;
        setState(iArr);
        if (!Arrays.equals(this.U0, iArr)) {
            this.U0 = iArr;
            if (X()) {
                A(getState(), iArr);
            }
        }
        this.Z0 = true;
        int[] iArr2 = s8.a.f14809a;
        f5813d1.setTint(-1);
    }

    public static void Y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean x(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean y(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final boolean A(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.T;
        int d10 = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.H0) : 0);
        boolean z12 = true;
        if (this.H0 != d10) {
            this.H0 = d10;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.U;
        int d11 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.I0) : 0);
        if (this.I0 != d11) {
            this.I0 = d11;
            onStateChange = true;
        }
        int b10 = d.b(d11, d10);
        if ((this.J0 != b10) || (this.f16250a.f16258c == null)) {
            this.J0 = b10;
            m(ColorStateList.valueOf(b10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.X;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.K0) : 0;
        if (this.K0 != colorForState) {
            this.K0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.W0 == null || !s8.a.d(iArr)) ? 0 : this.W0.getColorForState(iArr, this.L0);
        if (this.L0 != colorForState2) {
            this.L0 = colorForState2;
            if (this.V0) {
                onStateChange = true;
            }
        }
        r8.d dVar = this.G0.f11303f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f14100j) == null) ? 0 : colorStateList.getColorForState(iArr, this.M0);
        if (this.M0 != colorForState3) {
            this.M0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                } else if (state[i8] == 16842912) {
                    z10 = true;
                    break;
                } else {
                    i8++;
                }
            }
        }
        z10 = false;
        boolean z13 = z10 && this.f5828m0;
        if (this.N0 == z13 || this.f5830o0 == null) {
            z11 = false;
        } else {
            float u7 = u();
            this.N0 = z13;
            if (u7 != u()) {
                onStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.S0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.O0) : 0;
        if (this.O0 != colorForState4) {
            this.O0 = colorForState4;
            ColorStateList colorStateList6 = this.S0;
            PorterDuff.Mode mode = this.T0;
            this.R0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z12 = onStateChange;
        }
        if (y(this.f5818c0)) {
            z12 |= this.f5818c0.setState(iArr);
        }
        if (y(this.f5830o0)) {
            z12 |= this.f5830o0.setState(iArr);
        }
        if (y(this.f5823h0)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z12 |= this.f5823h0.setState(iArr3);
        }
        int[] iArr4 = s8.a.f14809a;
        if (y(this.f5824i0)) {
            z12 |= this.f5824i0.setState(iArr2);
        }
        if (z12) {
            invalidateSelf();
        }
        if (z11) {
            z();
        }
        return z12;
    }

    public final void B(boolean z10) {
        if (this.f5828m0 != z10) {
            this.f5828m0 = z10;
            float u7 = u();
            if (!z10 && this.N0) {
                this.N0 = false;
            }
            float u10 = u();
            invalidateSelf();
            if (u7 != u10) {
                z();
            }
        }
    }

    public final void C(Drawable drawable) {
        if (this.f5830o0 != drawable) {
            float u7 = u();
            this.f5830o0 = drawable;
            float u10 = u();
            Y(this.f5830o0);
            s(this.f5830o0);
            invalidateSelf();
            if (u7 != u10) {
                z();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        if (this.f5831p0 != colorStateList) {
            this.f5831p0 = colorStateList;
            if (this.f5829n0 && this.f5830o0 != null && this.f5828m0) {
                a.b.h(this.f5830o0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z10) {
        if (this.f5829n0 != z10) {
            boolean V2 = V();
            this.f5829n0 = z10;
            boolean V3 = V();
            if (V2 != V3) {
                if (V3) {
                    s(this.f5830o0);
                } else {
                    Y(this.f5830o0);
                }
                invalidateSelf();
                z();
            }
        }
    }

    @Deprecated
    public final void F(float f10) {
        if (this.W != f10) {
            this.W = f10;
            setShapeAppearanceModel(this.f16250a.f16256a.e(f10));
        }
    }

    public final void G(Drawable drawable) {
        Drawable drawable2 = this.f5818c0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof b) {
            drawable2 = ((b) drawable2).b();
        }
        if (drawable2 != drawable) {
            float u7 = u();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f5818c0 = drawable3;
            float u10 = u();
            Y(drawable2);
            if (W()) {
                s(this.f5818c0);
            }
            invalidateSelf();
            if (u7 != u10) {
                z();
            }
        }
    }

    public final void H(float f10) {
        if (this.f5820e0 != f10) {
            float u7 = u();
            this.f5820e0 = f10;
            float u10 = u();
            invalidateSelf();
            if (u7 != u10) {
                z();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        this.f5821f0 = true;
        if (this.f5819d0 != colorStateList) {
            this.f5819d0 = colorStateList;
            if (W()) {
                a.b.h(this.f5818c0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z10) {
        if (this.f5816b0 != z10) {
            boolean W2 = W();
            this.f5816b0 = z10;
            boolean W3 = W();
            if (W2 != W3) {
                if (W3) {
                    s(this.f5818c0);
                } else {
                    Y(this.f5818c0);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (this.f5817b1) {
                f.b bVar = this.f16250a;
                if (bVar.f16259d != colorStateList) {
                    bVar.f16259d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void L(float f10) {
        if (this.Y != f10) {
            this.Y = f10;
            this.B0.setStrokeWidth(f10);
            if (this.f5817b1) {
                this.f16250a.f16266k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void M(Drawable drawable) {
        Drawable drawable2 = this.f5823h0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof b) {
            drawable2 = ((b) drawable2).b();
        }
        if (drawable2 != drawable) {
            float v3 = v();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f5823h0 = drawable3;
            int[] iArr = s8.a.f14809a;
            this.f5824i0 = new RippleDrawable(s8.a.c(this.Z), this.f5823h0, f5813d1);
            float v10 = v();
            Y(drawable2);
            if (X()) {
                s(this.f5823h0);
            }
            invalidateSelf();
            if (v3 != v10) {
                z();
            }
        }
    }

    public final void N(float f10) {
        if (this.f5840y0 != f10) {
            this.f5840y0 = f10;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void O(float f10) {
        if (this.f5826k0 != f10) {
            this.f5826k0 = f10;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void P(float f10) {
        if (this.f5839x0 != f10) {
            this.f5839x0 = f10;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.f5825j0 != colorStateList) {
            this.f5825j0 = colorStateList;
            if (X()) {
                a.b.h(this.f5823h0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R(boolean z10) {
        if (this.f5822g0 != z10) {
            boolean X2 = X();
            this.f5822g0 = z10;
            boolean X3 = X();
            if (X2 != X3) {
                if (X3) {
                    s(this.f5823h0);
                } else {
                    Y(this.f5823h0);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void S(float f10) {
        if (this.f5836u0 != f10) {
            float u7 = u();
            this.f5836u0 = f10;
            float u10 = u();
            invalidateSelf();
            if (u7 != u10) {
                z();
            }
        }
    }

    public final void T(float f10) {
        if (this.f5835t0 != f10) {
            float u7 = u();
            this.f5835t0 = f10;
            float u10 = u();
            invalidateSelf();
            if (u7 != u10) {
                z();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            this.W0 = this.V0 ? s8.a.c(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean V() {
        return this.f5829n0 && this.f5830o0 != null && this.N0;
    }

    public final boolean W() {
        return this.f5816b0 && this.f5818c0 != null;
    }

    public final boolean X() {
        return this.f5822g0 && this.f5823h0 != null;
    }

    public final void a() {
        z();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i8;
        RectF rectF;
        int i10;
        int i11;
        int i12;
        RectF rectF2;
        int i13;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i8 = this.P0) != 0) {
            int saveLayerAlpha = i8 < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i8) : 0;
            boolean z10 = this.f5817b1;
            Paint paint = this.B0;
            RectF rectF3 = this.D0;
            if (!z10) {
                paint.setColor(this.H0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, w(), w(), paint);
            }
            if (!this.f5817b1) {
                paint.setColor(this.I0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.Q0;
                if (colorFilter == null) {
                    colorFilter = this.R0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, w(), w(), paint);
            }
            if (this.f5817b1) {
                super.draw(canvas);
            }
            if (this.Y > 0.0f && !this.f5817b1) {
                paint.setColor(this.K0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f5817b1) {
                    ColorFilter colorFilter2 = this.Q0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.R0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f10 = this.Y / 2.0f;
                rectF3.set(((float) bounds.left) + f10, ((float) bounds.top) + f10, ((float) bounds.right) - f10, ((float) bounds.bottom) - f10);
                float f11 = this.W - (this.Y / 2.0f);
                canvas2.drawRoundRect(rectF3, f11, f11, paint);
            }
            paint.setColor(this.L0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.f5817b1) {
                canvas2.drawRoundRect(rectF3, w(), w(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.F0;
                j jVar = this.N;
                f.b bVar = this.f16250a;
                jVar.a(bVar.f16256a, bVar.f16265j, rectF4, this.M, path);
                f(canvas, paint, path, this.f16250a.f16256a, h());
            }
            if (W()) {
                t(bounds, rectF3);
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                canvas2.translate(f12, f13);
                this.f5818c0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f5818c0.draw(canvas2);
                canvas2.translate(-f12, -f13);
            }
            if (V()) {
                t(bounds, rectF3);
                float f14 = rectF3.left;
                float f15 = rectF3.top;
                canvas2.translate(f14, f15);
                this.f5830o0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f5830o0.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (!this.Z0 || this.f5814a0 == null) {
                rectF = rectF3;
                i11 = saveLayerAlpha;
                i10 = 0;
                i12 = 255;
            } else {
                PointF pointF = this.E0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f5814a0;
                p pVar = this.G0;
                if (charSequence != null) {
                    float u7 = u() + this.f5834s0 + this.f5837v0;
                    if (a.c.a(this) == 0) {
                        pointF.x = ((float) bounds.left) + u7;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - u7;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = pVar.f11298a;
                    Paint.FontMetrics fontMetrics = this.C0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.f5814a0 != null) {
                    float u10 = u() + this.f5834s0 + this.f5837v0;
                    float v3 = v() + this.f5841z0 + this.f5838w0;
                    if (a.c.a(this) == 0) {
                        rectF3.left = ((float) bounds.left) + u10;
                        rectF3.right = ((float) bounds.right) - v3;
                    } else {
                        rectF3.left = ((float) bounds.left) + v3;
                        rectF3.right = ((float) bounds.right) - u10;
                    }
                    rectF3.top = (float) bounds.top;
                    rectF3.bottom = (float) bounds.bottom;
                }
                r8.d dVar = pVar.f11303f;
                TextPaint textPaint2 = pVar.f11298a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    pVar.f11303f.e(this.A0, textPaint2, pVar.f11299b);
                }
                textPaint2.setTextAlign(align);
                boolean z11 = Math.round(pVar.a(this.f5814a0.toString())) > Math.round(rectF3.width());
                if (z11) {
                    i13 = canvas.save();
                    canvas2.clipRect(rectF3);
                } else {
                    i13 = 0;
                }
                CharSequence charSequence2 = this.f5814a0;
                if (z11 && this.Y0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.Y0);
                }
                CharSequence charSequence3 = charSequence2;
                rectF = rectF3;
                int length = charSequence3.length();
                i11 = saveLayerAlpha;
                float f16 = pointF.x;
                i10 = 0;
                float f17 = pointF.y;
                i12 = 255;
                canvas.drawText(charSequence3, 0, length, f16, f17, textPaint2);
                if (z11) {
                    canvas2.restoreToCount(i13);
                }
            }
            if (X()) {
                rectF.setEmpty();
                if (X()) {
                    float f18 = this.f5841z0 + this.f5840y0;
                    if (a.c.a(this) == 0) {
                        float f19 = ((float) bounds.right) - f18;
                        rectF2 = rectF;
                        rectF2.right = f19;
                        rectF2.left = f19 - this.f5826k0;
                    } else {
                        rectF2 = rectF;
                        float f20 = ((float) bounds.left) + f18;
                        rectF2.left = f20;
                        rectF2.right = f20 + this.f5826k0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f21 = this.f5826k0;
                    float f22 = exactCenterY - (f21 / 2.0f);
                    rectF2.top = f22;
                    rectF2.bottom = f22 + f21;
                } else {
                    rectF2 = rectF;
                }
                float f23 = rectF2.left;
                float f24 = rectF2.top;
                canvas2.translate(f23, f24);
                this.f5823h0.setBounds(i10, i10, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = s8.a.f14809a;
                this.f5824i0.setBounds(this.f5823h0.getBounds());
                this.f5824i0.jumpToCurrentState();
                this.f5824i0.draw(canvas2);
                canvas2.translate(-f23, -f24);
            }
            if (this.P0 < i12) {
                canvas2.restoreToCount(i11);
            }
        }
    }

    public final int getAlpha() {
        return this.P0;
    }

    public final ColorFilter getColorFilter() {
        return this.Q0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.V;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(v() + this.G0.a(this.f5814a0.toString()) + u() + this.f5834s0 + this.f5837v0 + this.f5838w0 + this.f5841z0), this.f5815a1);
    }

    public final int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f5817b1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.W);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.V, this.W);
        }
        outline.setAlpha(((float) this.P0) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r0.f14100j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.T
            boolean r0 = x(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.U
            boolean r0 = x(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.X
            boolean r0 = x(r0)
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.V0
            if (r0 == 0) goto L_0x0025
            android.content.res.ColorStateList r0 = r3.W0
            boolean r0 = x(r0)
            if (r0 != 0) goto L_0x0066
        L_0x0025:
            m8.p r0 = r3.G0
            r8.d r0 = r0.f11303f
            r2 = 0
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.f14100j
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r0 = r2
        L_0x0039:
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.f5829n0
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.f5830o0
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.f5828m0
            if (r0 == 0) goto L_0x0049
            r0 = r1
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.f5818c0
            boolean r0 = y(r0)
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.f5830o0
            boolean r0 = y(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.S0
            boolean r0 = x(r0)
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.isStateful():boolean");
    }

    public final boolean onLayoutDirectionChanged(int i8) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i8);
        if (W()) {
            onLayoutDirectionChanged |= a.c.b(this.f5818c0, i8);
        }
        if (V()) {
            onLayoutDirectionChanged |= a.c.b(this.f5830o0, i8);
        }
        if (X()) {
            onLayoutDirectionChanged |= a.c.b(this.f5823h0, i8);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i8) {
        boolean onLevelChange = super.onLevelChange(i8);
        if (W()) {
            onLevelChange |= this.f5818c0.setLevel(i8);
        }
        if (V()) {
            onLevelChange |= this.f5830o0.setLevel(i8);
        }
        if (X()) {
            onLevelChange |= this.f5823h0.setLevel(i8);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.f5817b1) {
            super.onStateChange(iArr);
        }
        return A(iArr, this.U0);
    }

    public final void s(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            a.c.b(drawable, a.c.a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f5823h0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.U0);
                }
                a.b.h(drawable, this.f5825j0);
                return;
            }
            Drawable drawable2 = this.f5818c0;
            if (drawable == drawable2 && this.f5821f0) {
                a.b.h(drawable2, this.f5819d0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public final void setAlpha(int i8) {
        if (this.P0 != i8) {
            this.P0 = i8;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.Q0 != colorFilter) {
            this.Q0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.S0 != colorStateList) {
            this.S0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.T0 != mode) {
            this.T0 = mode;
            ColorStateList colorStateList = this.S0;
            this.R0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (W()) {
            visible |= this.f5818c0.setVisible(z10, z11);
        }
        if (V()) {
            visible |= this.f5830o0.setVisible(z10, z11);
        }
        if (X()) {
            visible |= this.f5823h0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Rect rect, RectF rectF) {
        float f10;
        rectF.setEmpty();
        if (W() || V()) {
            float f11 = this.f5834s0 + this.f5835t0;
            Drawable drawable = this.N0 ? this.f5830o0 : this.f5818c0;
            float f12 = this.f5820e0;
            if (f12 <= 0.0f && drawable != null) {
                f12 = (float) drawable.getIntrinsicWidth();
            }
            if (a.c.a(this) == 0) {
                float f13 = ((float) rect.left) + f11;
                rectF.left = f13;
                rectF.right = f13 + f12;
            } else {
                float f14 = ((float) rect.right) - f11;
                rectF.right = f14;
                rectF.left = f14 - f12;
            }
            Drawable drawable2 = this.N0 ? this.f5830o0 : this.f5818c0;
            float f15 = this.f5820e0;
            if (f15 <= 0.0f && drawable2 != null) {
                f15 = (float) Math.ceil((double) v.b(this.A0, 24));
                if (((float) drawable2.getIntrinsicHeight()) <= f15) {
                    f10 = (float) drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f15;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public final float u() {
        if (!W() && !V()) {
            return 0.0f;
        }
        float f10 = this.f5835t0;
        Drawable drawable = this.N0 ? this.f5830o0 : this.f5818c0;
        float f11 = this.f5820e0;
        if (f11 <= 0.0f && drawable != null) {
            f11 = (float) drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.f5836u0;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (X()) {
            return this.f5839x0 + this.f5826k0 + this.f5840y0;
        }
        return 0.0f;
    }

    public final float w() {
        return this.f5817b1 ? i() : this.W;
    }

    public final void z() {
        C0072a aVar = this.X0.get();
        if (aVar != null) {
            aVar.a();
        }
    }
}
