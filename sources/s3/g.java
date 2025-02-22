package s3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import v1.g;
import w1.a;

public final class g extends f {
    public static final PorterDuff.Mode F = PorterDuff.Mode.SRC_IN;
    public boolean B;
    public final float[] C;
    public final Matrix D;
    public final Rect E;

    /* renamed from: b  reason: collision with root package name */
    public C0276g f14611b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuffColorFilter f14612c;

    /* renamed from: d  reason: collision with root package name */
    public ColorFilter f14613d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14614e;

    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: s3.g$g  reason: collision with other inner class name */
    public static class C0276g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f14656a;

        /* renamed from: b  reason: collision with root package name */
        public f f14657b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f14658c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f14659d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f14660e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f14661f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f14662g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f14663h;

        /* renamed from: i  reason: collision with root package name */
        public int f14664i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f14665j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f14666k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f14667l;

        public C0276g(C0276g gVar) {
            this.f14658c = null;
            this.f14659d = g.F;
            if (gVar != null) {
                this.f14656a = gVar.f14656a;
                f fVar = new f(gVar.f14657b);
                this.f14657b = fVar;
                if (gVar.f14657b.f14646e != null) {
                    fVar.f14646e = new Paint(gVar.f14657b.f14646e);
                }
                if (gVar.f14657b.f14645d != null) {
                    this.f14657b.f14645d = new Paint(gVar.f14657b.f14645d);
                }
                this.f14658c = gVar.f14658c;
                this.f14659d = gVar.f14659d;
                this.f14660e = gVar.f14660e;
            }
        }

        public int getChangingConfigurations() {
            return this.f14656a;
        }

        public final Drawable newDrawable() {
            return new g(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new g(this);
        }

        public C0276g() {
            this.f14658c = null;
            this.f14659d = g.F;
            this.f14657b = new f();
        }
    }

    public g() {
        this.B = true;
        this.C = new float[9];
        this.D = new Matrix();
        this.E = new Rect();
        this.f14611b = new C0276g();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f14610a;
        if (drawable == null) {
            return false;
        }
        a.b.b(drawable);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        if ((r5 == r10.getWidth() && r6 == r9.f14661f.getHeight()) == false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.drawable.Drawable r2 = r0.f14610a
            if (r2 == 0) goto L_0x000c
            r2.draw(r1)
            return
        L_0x000c:
            android.graphics.Rect r2 = r0.E
            r0.copyBounds(r2)
            int r3 = r2.width()
            if (r3 <= 0) goto L_0x017d
            int r3 = r2.height()
            if (r3 > 0) goto L_0x001f
            goto L_0x017d
        L_0x001f:
            android.graphics.ColorFilter r3 = r0.f14613d
            if (r3 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r3 = r0.f14612c
        L_0x0025:
            android.graphics.Matrix r4 = r0.D
            r1.getMatrix(r4)
            float[] r5 = r0.C
            r4.getValues(r5)
            r4 = 0
            r6 = r5[r4]
            float r6 = java.lang.Math.abs(r6)
            r7 = 4
            r7 = r5[r7]
            float r7 = java.lang.Math.abs(r7)
            r8 = 1
            r9 = r5[r8]
            float r9 = java.lang.Math.abs(r9)
            r10 = 3
            r5 = r5[r10]
            float r5 = java.lang.Math.abs(r5)
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r9 != 0) goto L_0x0056
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0058
        L_0x0056:
            r6 = r11
            r7 = r6
        L_0x0058:
            int r5 = r2.width()
            float r5 = (float) r5
            float r5 = r5 * r6
            int r5 = (int) r5
            int r6 = r2.height()
            float r6 = (float) r6
            float r6 = r6 * r7
            int r6 = (int) r6
            r7 = 2048(0x800, float:2.87E-42)
            int r5 = java.lang.Math.min(r7, r5)
            int r6 = java.lang.Math.min(r7, r6)
            if (r5 <= 0) goto L_0x017d
            if (r6 > 0) goto L_0x0076
            goto L_0x017d
        L_0x0076:
            int r7 = r19.save()
            int r9 = r2.left
            float r9 = (float) r9
            int r12 = r2.top
            float r12 = (float) r12
            r1.translate(r9, r12)
            boolean r9 = r18.isAutoMirrored()
            if (r9 == 0) goto L_0x0091
            int r9 = w1.a.c.a(r18)
            if (r9 != r8) goto L_0x0091
            r9 = r8
            goto L_0x0092
        L_0x0091:
            r9 = r4
        L_0x0092:
            if (r9 == 0) goto L_0x00a1
            int r9 = r2.width()
            float r9 = (float) r9
            r1.translate(r9, r10)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.scale(r9, r11)
        L_0x00a1:
            r2.offsetTo(r4, r4)
            s3.g$g r9 = r0.f14611b
            android.graphics.Bitmap r10 = r9.f14661f
            if (r10 == 0) goto L_0x00bd
            int r10 = r10.getWidth()
            if (r5 != r10) goto L_0x00ba
            android.graphics.Bitmap r10 = r9.f14661f
            int r10 = r10.getHeight()
            if (r6 != r10) goto L_0x00ba
            r10 = r8
            goto L_0x00bb
        L_0x00ba:
            r10 = r4
        L_0x00bb:
            if (r10 != 0) goto L_0x00c7
        L_0x00bd:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r5, r6, r10)
            r9.f14661f = r10
            r9.f14666k = r8
        L_0x00c7:
            boolean r9 = r0.B
            if (r9 != 0) goto L_0x00e7
            s3.g$g r9 = r0.f14611b
            android.graphics.Bitmap r10 = r9.f14661f
            r10.eraseColor(r4)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            android.graphics.Bitmap r10 = r9.f14661f
            r15.<init>(r10)
            s3.g$f r12 = r9.f14657b
            s3.g$c r13 = r12.f14648g
            android.graphics.Matrix r14 = s3.g.f.f14641p
            r16 = r5
            r17 = r6
            r12.a(r13, r14, r15, r16, r17)
            goto L_0x0141
        L_0x00e7:
            s3.g$g r9 = r0.f14611b
            boolean r10 = r9.f14666k
            if (r10 != 0) goto L_0x010b
            android.content.res.ColorStateList r10 = r9.f14662g
            android.content.res.ColorStateList r11 = r9.f14658c
            if (r10 != r11) goto L_0x010b
            android.graphics.PorterDuff$Mode r10 = r9.f14663h
            android.graphics.PorterDuff$Mode r11 = r9.f14659d
            if (r10 != r11) goto L_0x010b
            boolean r10 = r9.f14665j
            boolean r11 = r9.f14660e
            if (r10 != r11) goto L_0x010b
            int r10 = r9.f14664i
            s3.g$f r9 = r9.f14657b
            int r9 = r9.getRootAlpha()
            if (r10 != r9) goto L_0x010b
            r9 = r8
            goto L_0x010c
        L_0x010b:
            r9 = r4
        L_0x010c:
            if (r9 != 0) goto L_0x0141
            s3.g$g r9 = r0.f14611b
            android.graphics.Bitmap r10 = r9.f14661f
            r10.eraseColor(r4)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            android.graphics.Bitmap r10 = r9.f14661f
            r15.<init>(r10)
            s3.g$f r12 = r9.f14657b
            s3.g$c r13 = r12.f14648g
            android.graphics.Matrix r14 = s3.g.f.f14641p
            r16 = r5
            r17 = r6
            r12.a(r13, r14, r15, r16, r17)
            s3.g$g r5 = r0.f14611b
            android.content.res.ColorStateList r6 = r5.f14658c
            r5.f14662g = r6
            android.graphics.PorterDuff$Mode r6 = r5.f14659d
            r5.f14663h = r6
            s3.g$f r6 = r5.f14657b
            int r6 = r6.getRootAlpha()
            r5.f14664i = r6
            boolean r6 = r5.f14660e
            r5.f14665j = r6
            r5.f14666k = r4
        L_0x0141:
            s3.g$g r5 = r0.f14611b
            s3.g$f r6 = r5.f14657b
            int r6 = r6.getRootAlpha()
            r9 = 255(0xff, float:3.57E-43)
            if (r6 >= r9) goto L_0x014e
            r4 = r8
        L_0x014e:
            r6 = 0
            if (r4 != 0) goto L_0x0155
            if (r3 != 0) goto L_0x0155
            r3 = r6
            goto L_0x0175
        L_0x0155:
            android.graphics.Paint r4 = r5.f14667l
            if (r4 != 0) goto L_0x0163
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r5.f14667l = r4
            r4.setFilterBitmap(r8)
        L_0x0163:
            android.graphics.Paint r4 = r5.f14667l
            s3.g$f r8 = r5.f14657b
            int r8 = r8.getRootAlpha()
            r4.setAlpha(r8)
            android.graphics.Paint r4 = r5.f14667l
            r4.setColorFilter(r3)
            android.graphics.Paint r3 = r5.f14667l
        L_0x0175:
            android.graphics.Bitmap r4 = r5.f14661f
            r1.drawBitmap(r4, r6, r2, r3)
            r1.restoreToCount(r7)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.g.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        Drawable drawable = this.f14610a;
        return drawable != null ? a.C0303a.a(drawable) : this.f14611b.f14657b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f14610a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f14611b.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f14610a;
        return drawable != null ? a.b.c(drawable) : this.f14613d;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f14610a != null) {
            return new h(this.f14610a.getConstantState());
        }
        this.f14611b.f14656a = getChangingConfigurations();
        return this.f14611b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f14610a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f14611b.f14657b.f14650i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f14610a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f14611b.f14657b.f14649h;
    }

    public final int getOpacity() {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f14610a;
        return drawable != null ? a.C0303a.d(drawable) : this.f14611b.f14660e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0276g gVar = this.f14611b;
            if (gVar != null) {
                f fVar = gVar.f14657b;
                if (fVar.f14654n == null) {
                    fVar.f14654n = Boolean.valueOf(fVar.f14648g.a());
                }
                if (fVar.f14654n.booleanValue() || ((colorStateList = this.f14611b.f14658c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final Drawable mutate() {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f14614e && super.mutate() == this) {
            this.f14611b = new C0276g(this.f14611b);
            this.f14614e = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0276g gVar = this.f14611b;
        ColorStateList colorStateList = gVar.f14658c;
        if (colorStateList == null || (mode = gVar.f14659d) == null) {
            z10 = false;
        } else {
            this.f14612c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        f fVar = gVar.f14657b;
        if (fVar.f14654n == null) {
            fVar.f14654n = Boolean.valueOf(fVar.f14648g.a());
        }
        if (fVar.f14654n.booleanValue()) {
            boolean b10 = gVar.f14657b.f14648g.b(iArr);
            gVar.f14666k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public final void setAlpha(int i8) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.setAlpha(i8);
        } else if (this.f14611b.f14657b.getRootAlpha() != i8) {
            this.f14611b.f14657b.setRootAlpha(i8);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            a.C0303a.e(drawable, z10);
        } else {
            this.f14611b.f14660e = z10;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f14613d = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i8) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            w1.a.a(drawable, i8);
        } else {
            setTintList(ColorStateList.valueOf(i8));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        C0276g gVar = this.f14611b;
        if (gVar.f14658c != colorStateList) {
            gVar.f14658c = colorStateList;
            this.f14612c = a(colorStateList, gVar.f14659d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        C0276g gVar = this.f14611b;
        if (gVar.f14659d != mode) {
            gVar.f14659d = mode;
            this.f14612c = a(gVar.f14658c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f14610a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f14668a;

        public h(Drawable.ConstantState constantState) {
            this.f14668a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f14668a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f14668a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            g gVar = new g();
            gVar.f14610a = (VectorDrawable) this.f14668a.newDrawable();
            return gVar;
        }

        public final Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f14610a = (VectorDrawable) this.f14668a.newDrawable(resources);
            return gVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f14610a = (VectorDrawable) this.f14668a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public static abstract class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public g.a[] f14637a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f14638b;

        /* renamed from: c  reason: collision with root package name */
        public int f14639c = 0;

        /* renamed from: d  reason: collision with root package name */
        public final int f14640d;

        public e() {
        }

        public g.a[] getPathData() {
            return this.f14637a;
        }

        public String getPathName() {
            return this.f14638b;
        }

        public void setPathData(g.a[] aVarArr) {
            if (!v1.g.a(this.f14637a, aVarArr)) {
                this.f14637a = v1.g.e(aVarArr);
                return;
            }
            g.a[] aVarArr2 = this.f14637a;
            for (int i8 = 0; i8 < aVarArr.length; i8++) {
                aVarArr2[i8].f16126a = aVarArr[i8].f16126a;
                int i10 = 0;
                while (true) {
                    float[] fArr = aVarArr[i8].f16127b;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    aVarArr2[i8].f16127b[i10] = fArr[i10];
                    i10++;
                }
            }
        }

        public e(e eVar) {
            this.f14638b = eVar.f14638b;
            this.f14640d = eVar.f14640d;
            this.f14637a = v1.g.e(eVar.f14637a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            android.graphics.drawable.Drawable r0 = r1.f14610a
            if (r0 == 0) goto L_0x0012
            w1.a.b.d(r0, r2, r3, r4, r5)
            return
        L_0x0012:
            s3.g$g r6 = r1.f14611b
            s3.g$f r0 = new s3.g$f
            r0.<init>()
            r6.f14657b = r0
            int[] r0 = s3.a.f14591a
            android.content.res.TypedArray r7 = u1.k.e(r2, r5, r4, r0)
            s3.g$g r8 = r1.f14611b
            s3.g$f r9 = r8.f14657b
            java.lang.String r0 = "tintMode"
            r10 = 6
            r11 = -1
            int r0 = u1.k.c(r7, r3, r0, r10, r11)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r13 = 9
            r14 = 5
            r15 = 3
            if (r0 == r15) goto L_0x0049
            if (r0 == r14) goto L_0x004b
            if (r0 == r13) goto L_0x0046
            switch(r0) {
                case 14: goto L_0x0043;
                case 15: goto L_0x0040;
                case 16: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x004b
        L_0x003d:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x004b
        L_0x0040:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x004b
        L_0x0043:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004b
        L_0x0046:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x004b
        L_0x0049:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x004b:
            r8.f14659d = r12
            java.lang.String r0 = "tint"
            boolean r0 = u1.k.d(r3, r0)
            r12 = 0
            r10 = 1
            r13 = 2
            if (r0 == 0) goto L_0x00a3
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.getValue(r10, r0)
            int r11 = r0.type
            if (r11 == r13) goto L_0x008f
            r13 = 28
            if (r11 < r13) goto L_0x0073
            r13 = 31
            if (r11 > r13) goto L_0x0073
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00a4
        L_0x0073:
            android.content.res.Resources r0 = r7.getResources()
            int r11 = r7.getResourceId(r10, r12)
            java.lang.ThreadLocal<android.util.TypedValue> r13 = u1.b.f15654a
            android.content.res.XmlResourceParser r11 = r0.getXml(r11)     // Catch:{ Exception -> 0x0086 }
            android.content.res.ColorStateList r0 = u1.b.a(r0, r11, r5)     // Catch:{ Exception -> 0x0086 }
            goto L_0x00a4
        L_0x0086:
            r0 = move-exception
            java.lang.String r11 = "CSLCompat"
            java.lang.String r13 = "Failed to inflate ColorStateList."
            android.util.Log.e(r11, r13, r0)
            goto L_0x00a3
        L_0x008f:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to resolve attribute at index 1: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            if (r0 == 0) goto L_0x00a8
            r8.f14658c = r0
        L_0x00a8:
            boolean r0 = r8.f14660e
            java.lang.String r11 = "autoMirrored"
            boolean r11 = u1.k.d(r3, r11)
            if (r11 != 0) goto L_0x00b3
            goto L_0x00b7
        L_0x00b3:
            boolean r0 = r7.getBoolean(r14, r0)
        L_0x00b7:
            r8.f14660e = r0
            float r0 = r9.f14651j
            java.lang.String r8 = "viewportWidth"
            r11 = 7
            float r0 = u1.k.b(r7, r3, r8, r11, r0)
            r9.f14651j = r0
            float r0 = r9.f14652k
            java.lang.String r8 = "viewportHeight"
            r13 = 8
            float r0 = u1.k.b(r7, r3, r8, r13, r0)
            r9.f14652k = r0
            float r8 = r9.f14651j
            r17 = 0
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x03c9
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x03ae
            float r0 = r9.f14649h
            float r0 = r7.getDimension(r15, r0)
            r9.f14649h = r0
            float r0 = r9.f14650i
            r8 = 2
            float r0 = r7.getDimension(r8, r0)
            r9.f14650i = r0
            float r8 = r9.f14649h
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x0393
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0378
            float r0 = r9.getAlpha()
            java.lang.String r8 = "alpha"
            r14 = 4
            float r0 = u1.k.b(r7, r3, r8, r14, r0)
            r9.setAlpha(r0)
            java.lang.String r0 = r7.getString(r12)
            if (r0 == 0) goto L_0x0112
            r9.m = r0
            o.a<java.lang.String, java.lang.Object> r8 = r9.f14655o
            r8.put(r0, r9)
        L_0x0112:
            r7.recycle()
            int r0 = r21.getChangingConfigurations()
            r6.f14656a = r0
            r6.f14666k = r10
            s3.g$g r0 = r1.f14611b
            s3.g$f r7 = r0.f14657b
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            s3.g$c r9 = r7.f14648g
            r8.push(r9)
            int r9 = r23.getEventType()
            int r18 = r23.getDepth()
            int r11 = r18 + 1
            r18 = r10
        L_0x0137:
            if (r9 == r10) goto L_0x0363
            int r14 = r23.getDepth()
            if (r14 >= r11) goto L_0x0141
            if (r9 == r15) goto L_0x0363
        L_0x0141:
            java.lang.String r14 = "group"
            r15 = 2
            if (r9 != r15) goto L_0x033c
            java.lang.String r9 = r23.getName()
            java.lang.Object r15 = r8.peek()
            s3.g$c r15 = (s3.g.c) r15
            java.lang.String r13 = "path"
            boolean r13 = r13.equals(r9)
            o.a<java.lang.String, java.lang.Object> r10 = r7.f14655o
            java.lang.String r12 = "fillType"
            r19 = r7
            java.lang.String r7 = "pathData"
            if (r13 == 0) goto L_0x0258
            s3.g$b r9 = new s3.g$b
            r9.<init>()
            int[] r13 = s3.a.f14593c
            android.content.res.TypedArray r13 = u1.k.e(r2, r5, r4, r13)
            boolean r7 = u1.k.d(r3, r7)
            if (r7 != 0) goto L_0x0175
            r20 = r11
            goto L_0x0235
        L_0x0175:
            r7 = 0
            java.lang.String r14 = r13.getString(r7)
            if (r14 == 0) goto L_0x017e
            r9.f14638b = r14
        L_0x017e:
            r7 = 2
            java.lang.String r14 = r13.getString(r7)
            if (r14 == 0) goto L_0x018b
            v1.g$a[] r7 = v1.g.c(r14)
            r9.f14637a = r7
        L_0x018b:
            java.lang.String r7 = "fillColor"
            r14 = 1
            u1.c r7 = u1.k.a(r13, r3, r5, r7, r14)
            r9.f14617g = r7
            float r7 = r9.f14619i
            java.lang.String r14 = "fillAlpha"
            r20 = r11
            r11 = 12
            float r7 = u1.k.b(r13, r3, r14, r11, r7)
            r9.f14619i = r7
            java.lang.String r7 = "strokeLineCap"
            r11 = 8
            r14 = -1
            int r7 = u1.k.c(r13, r3, r7, r11, r14)
            android.graphics.Paint$Cap r14 = r9.m
            if (r7 == 0) goto L_0x01bc
            r11 = 1
            if (r7 == r11) goto L_0x01b9
            r11 = 2
            if (r7 == r11) goto L_0x01b6
            goto L_0x01be
        L_0x01b6:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.SQUARE
            goto L_0x01be
        L_0x01b9:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.ROUND
            goto L_0x01be
        L_0x01bc:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.BUTT
        L_0x01be:
            r9.m = r14
            java.lang.String r7 = "strokeLineJoin"
            r11 = 9
            r14 = -1
            int r7 = u1.k.c(r13, r3, r7, r11, r14)
            android.graphics.Paint$Join r11 = r9.f14623n
            if (r7 == 0) goto L_0x01da
            r14 = 1
            if (r7 == r14) goto L_0x01d7
            r14 = 2
            if (r7 == r14) goto L_0x01d4
            goto L_0x01dc
        L_0x01d4:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.BEVEL
            goto L_0x01dc
        L_0x01d7:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.ROUND
            goto L_0x01dc
        L_0x01da:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.MITER
        L_0x01dc:
            r9.f14623n = r11
            float r7 = r9.f14624o
            java.lang.String r11 = "strokeMiterLimit"
            r14 = 10
            float r7 = u1.k.b(r13, r3, r11, r14, r7)
            r9.f14624o = r7
            java.lang.String r7 = "strokeColor"
            r11 = 3
            u1.c r7 = u1.k.a(r13, r3, r5, r7, r11)
            r9.f14615e = r7
            float r7 = r9.f14618h
            java.lang.String r11 = "strokeAlpha"
            r14 = 11
            float r7 = u1.k.b(r13, r3, r11, r14, r7)
            r9.f14618h = r7
            float r7 = r9.f14616f
            java.lang.String r11 = "strokeWidth"
            r14 = 4
            float r7 = u1.k.b(r13, r3, r11, r14, r7)
            r9.f14616f = r7
            float r7 = r9.f14621k
            java.lang.String r11 = "trimPathEnd"
            r14 = 6
            float r7 = u1.k.b(r13, r3, r11, r14, r7)
            r9.f14621k = r7
            float r7 = r9.f14622l
            java.lang.String r11 = "trimPathOffset"
            r14 = 7
            float r7 = u1.k.b(r13, r3, r11, r14, r7)
            r9.f14622l = r7
            float r7 = r9.f14620j
            java.lang.String r11 = "trimPathStart"
            r14 = 5
            float r7 = u1.k.b(r13, r3, r11, r14, r7)
            r9.f14620j = r7
            int r7 = r9.f14639c
            r11 = 13
            int r7 = u1.k.c(r13, r3, r12, r11, r7)
            r9.f14639c = r7
        L_0x0235:
            r13.recycle()
            java.util.ArrayList<s3.g$d> r7 = r15.f14626b
            r7.add(r9)
            java.lang.String r7 = r9.getPathName()
            if (r7 == 0) goto L_0x024a
            java.lang.String r7 = r9.getPathName()
            r10.put(r7, r9)
        L_0x024a:
            int r7 = r0.f14656a
            int r9 = r9.f14640d
            r7 = r7 | r9
            r0.f14656a = r7
            r11 = 0
            r13 = 7
            r14 = 5
            r18 = 0
            goto L_0x0339
        L_0x0258:
            r20 = r11
            r11 = -1
            java.lang.String r13 = "clip-path"
            boolean r13 = r13.equals(r9)
            if (r13 == 0) goto L_0x02b0
            s3.g$a r9 = new s3.g$a
            r9.<init>()
            boolean r7 = u1.k.d(r3, r7)
            if (r7 != 0) goto L_0x026f
            goto L_0x0295
        L_0x026f:
            int[] r7 = s3.a.f14594d
            android.content.res.TypedArray r7 = u1.k.e(r2, r5, r4, r7)
            r13 = 0
            java.lang.String r14 = r7.getString(r13)
            if (r14 == 0) goto L_0x027e
            r9.f14638b = r14
        L_0x027e:
            r14 = 1
            java.lang.String r16 = r7.getString(r14)
            if (r16 == 0) goto L_0x028b
            v1.g$a[] r14 = v1.g.c(r16)
            r9.f14637a = r14
        L_0x028b:
            r14 = 2
            int r12 = u1.k.c(r7, r3, r12, r14, r13)
            r9.f14639c = r12
            r7.recycle()
        L_0x0295:
            java.util.ArrayList<s3.g$d> r7 = r15.f14626b
            r7.add(r9)
            java.lang.String r7 = r9.getPathName()
            if (r7 == 0) goto L_0x02a7
            java.lang.String r7 = r9.getPathName()
            r10.put(r7, r9)
        L_0x02a7:
            int r7 = r0.f14656a
            int r9 = r9.f14640d
            r7 = r7 | r9
            r0.f14656a = r7
            goto L_0x0336
        L_0x02b0:
            boolean r7 = r14.equals(r9)
            if (r7 == 0) goto L_0x0336
            s3.g$c r7 = new s3.g$c
            r7.<init>()
            int[] r9 = s3.a.f14592b
            android.content.res.TypedArray r9 = u1.k.e(r2, r5, r4, r9)
            float r12 = r7.f14627c
            java.lang.String r13 = "rotation"
            r14 = 5
            float r12 = u1.k.b(r9, r3, r13, r14, r12)
            r7.f14627c = r12
            float r12 = r7.f14628d
            r13 = 1
            float r12 = r9.getFloat(r13, r12)
            r7.f14628d = r12
            float r12 = r7.f14629e
            r11 = 2
            float r12 = r9.getFloat(r11, r12)
            r7.f14629e = r12
            float r12 = r7.f14630f
            java.lang.String r11 = "scaleX"
            r13 = 3
            float r11 = u1.k.b(r9, r3, r11, r13, r12)
            r7.f14630f = r11
            float r11 = r7.f14631g
            java.lang.String r12 = "scaleY"
            r13 = 4
            float r11 = u1.k.b(r9, r3, r12, r13, r11)
            r7.f14631g = r11
            float r11 = r7.f14632h
            java.lang.String r12 = "translateX"
            r13 = 6
            float r11 = u1.k.b(r9, r3, r12, r13, r11)
            r7.f14632h = r11
            float r11 = r7.f14633i
            java.lang.String r12 = "translateY"
            r13 = 7
            float r11 = u1.k.b(r9, r3, r12, r13, r11)
            r7.f14633i = r11
            r11 = 0
            java.lang.String r12 = r9.getString(r11)
            if (r12 == 0) goto L_0x0313
            r7.f14636l = r12
        L_0x0313:
            r7.c()
            r9.recycle()
            java.util.ArrayList<s3.g$d> r9 = r15.f14626b
            r9.add(r7)
            r8.push(r7)
            java.lang.String r9 = r7.getGroupName()
            if (r9 == 0) goto L_0x032e
            java.lang.String r9 = r7.getGroupName()
            r10.put(r9, r7)
        L_0x032e:
            int r9 = r0.f14656a
            int r7 = r7.f14635k
            r7 = r7 | r9
            r0.f14656a = r7
            goto L_0x0339
        L_0x0336:
            r11 = 0
            r13 = 7
            r14 = 5
        L_0x0339:
            r7 = r14
            r10 = 3
            goto L_0x0353
        L_0x033c:
            r19 = r7
            r20 = r11
            r11 = r12
            r7 = 5
            r10 = 3
            r13 = 7
            if (r9 != r10) goto L_0x0353
            java.lang.String r9 = r23.getName()
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x0353
            r8.pop()
        L_0x0353:
            int r9 = r23.next()
            r15 = r10
            r12 = r11
            r7 = r19
            r11 = r20
            r10 = 1
            r13 = 8
            r14 = 4
            goto L_0x0137
        L_0x0363:
            if (r18 != 0) goto L_0x0370
            android.content.res.ColorStateList r0 = r6.f14658c
            android.graphics.PorterDuff$Mode r2 = r6.f14659d
            android.graphics.PorterDuffColorFilter r0 = r1.a(r0, r2)
            r1.f14612c = r0
            return
        L_0x0370:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "no path defined"
            r0.<init>(r2)
            throw r0
        L_0x0378:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0393:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03ae:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03c9:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public g(C0276g gVar) {
        this.B = true;
        this.C = new float[9];
        this.D = new Matrix();
        this.E = new Rect();
        this.f14611b = gVar;
        this.f14612c = a(gVar.f14658c, gVar.f14659d);
    }

    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public u1.c f14615e;

        /* renamed from: f  reason: collision with root package name */
        public float f14616f = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        public u1.c f14617g;

        /* renamed from: h  reason: collision with root package name */
        public float f14618h = 1.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f14619i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f14620j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f14621k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f14622l = 0.0f;
        public Paint.Cap m = Paint.Cap.BUTT;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Join f14623n = Paint.Join.MITER;

        /* renamed from: o  reason: collision with root package name */
        public float f14624o = 4.0f;

        public b() {
        }

        public final boolean a() {
            return this.f14617g.b() || this.f14615e.b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                u1.c r0 = r6.f14617g
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                android.content.res.ColorStateList r1 = r0.f15656b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f15657c
                if (r1 == r4) goto L_0x001c
                r0.f15657c = r1
                r0 = r2
                goto L_0x001d
            L_0x001c:
                r0 = r3
            L_0x001d:
                u1.c r1 = r6.f14615e
                boolean r4 = r1.b()
                if (r4 == 0) goto L_0x0036
                android.content.res.ColorStateList r4 = r1.f15656b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f15657c
                if (r7 == r4) goto L_0x0036
                r1.f15657c = r7
                goto L_0x0037
            L_0x0036:
                r2 = r3
            L_0x0037:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.g.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f14619i;
        }

        public int getFillColor() {
            return this.f14617g.f15657c;
        }

        public float getStrokeAlpha() {
            return this.f14618h;
        }

        public int getStrokeColor() {
            return this.f14615e.f15657c;
        }

        public float getStrokeWidth() {
            return this.f14616f;
        }

        public float getTrimPathEnd() {
            return this.f14621k;
        }

        public float getTrimPathOffset() {
            return this.f14622l;
        }

        public float getTrimPathStart() {
            return this.f14620j;
        }

        public void setFillAlpha(float f10) {
            this.f14619i = f10;
        }

        public void setFillColor(int i8) {
            this.f14617g.f15657c = i8;
        }

        public void setStrokeAlpha(float f10) {
            this.f14618h = f10;
        }

        public void setStrokeColor(int i8) {
            this.f14615e.f15657c = i8;
        }

        public void setStrokeWidth(float f10) {
            this.f14616f = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f14621k = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f14622l = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f14620j = f10;
        }

        public b(b bVar) {
            super(bVar);
            this.f14615e = bVar.f14615e;
            this.f14616f = bVar.f14616f;
            this.f14618h = bVar.f14618h;
            this.f14617g = bVar.f14617g;
            this.f14639c = bVar.f14639c;
            this.f14619i = bVar.f14619i;
            this.f14620j = bVar.f14620j;
            this.f14621k = bVar.f14621k;
            this.f14622l = bVar.f14622l;
            this.m = bVar.m;
            this.f14623n = bVar.f14623n;
            this.f14624o = bVar.f14624o;
        }
    }

    public static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f14625a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<d> f14626b;

        /* renamed from: c  reason: collision with root package name */
        public float f14627c;

        /* renamed from: d  reason: collision with root package name */
        public float f14628d;

        /* renamed from: e  reason: collision with root package name */
        public float f14629e;

        /* renamed from: f  reason: collision with root package name */
        public float f14630f;

        /* renamed from: g  reason: collision with root package name */
        public float f14631g;

        /* renamed from: h  reason: collision with root package name */
        public float f14632h;

        /* renamed from: i  reason: collision with root package name */
        public float f14633i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f14634j;

        /* renamed from: k  reason: collision with root package name */
        public final int f14635k;

        /* renamed from: l  reason: collision with root package name */
        public String f14636l;

        public c() {
            this.f14625a = new Matrix();
            this.f14626b = new ArrayList<>();
            this.f14627c = 0.0f;
            this.f14628d = 0.0f;
            this.f14629e = 0.0f;
            this.f14630f = 1.0f;
            this.f14631g = 1.0f;
            this.f14632h = 0.0f;
            this.f14633i = 0.0f;
            this.f14634j = new Matrix();
            this.f14636l = null;
        }

        public final boolean a() {
            int i8 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f14626b;
                if (i8 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i8).a()) {
                    return true;
                }
                i8++;
            }
        }

        public final boolean b(int[] iArr) {
            int i8 = 0;
            boolean z10 = false;
            while (true) {
                ArrayList<d> arrayList = this.f14626b;
                if (i8 >= arrayList.size()) {
                    return z10;
                }
                z10 |= arrayList.get(i8).b(iArr);
                i8++;
            }
        }

        public final void c() {
            Matrix matrix = this.f14634j;
            matrix.reset();
            matrix.postTranslate(-this.f14628d, -this.f14629e);
            matrix.postScale(this.f14630f, this.f14631g);
            matrix.postRotate(this.f14627c, 0.0f, 0.0f);
            matrix.postTranslate(this.f14632h + this.f14628d, this.f14633i + this.f14629e);
        }

        public String getGroupName() {
            return this.f14636l;
        }

        public Matrix getLocalMatrix() {
            return this.f14634j;
        }

        public float getPivotX() {
            return this.f14628d;
        }

        public float getPivotY() {
            return this.f14629e;
        }

        public float getRotation() {
            return this.f14627c;
        }

        public float getScaleX() {
            return this.f14630f;
        }

        public float getScaleY() {
            return this.f14631g;
        }

        public float getTranslateX() {
            return this.f14632h;
        }

        public float getTranslateY() {
            return this.f14633i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f14628d) {
                this.f14628d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f14629e) {
                this.f14629e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f14627c) {
                this.f14627c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f14630f) {
                this.f14630f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f14631g) {
                this.f14631g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f14632h) {
                this.f14632h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f14633i) {
                this.f14633i = f10;
                c();
            }
        }

        public c(c cVar, o.a<String, Object> aVar) {
            e eVar;
            this.f14625a = new Matrix();
            this.f14626b = new ArrayList<>();
            this.f14627c = 0.0f;
            this.f14628d = 0.0f;
            this.f14629e = 0.0f;
            this.f14630f = 1.0f;
            this.f14631g = 1.0f;
            this.f14632h = 0.0f;
            this.f14633i = 0.0f;
            Matrix matrix = new Matrix();
            this.f14634j = matrix;
            this.f14636l = null;
            this.f14627c = cVar.f14627c;
            this.f14628d = cVar.f14628d;
            this.f14629e = cVar.f14629e;
            this.f14630f = cVar.f14630f;
            this.f14631g = cVar.f14631g;
            this.f14632h = cVar.f14632h;
            this.f14633i = cVar.f14633i;
            String str = cVar.f14636l;
            this.f14636l = str;
            this.f14635k = cVar.f14635k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(cVar.f14634j);
            ArrayList<d> arrayList = cVar.f14626b;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                d dVar = arrayList.get(i8);
                if (dVar instanceof c) {
                    this.f14626b.add(new c((c) dVar, aVar));
                } else {
                    if (dVar instanceof b) {
                        eVar = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        eVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f14626b.add(eVar);
                    String str2 = eVar.f14638b;
                    if (str2 != null) {
                        aVar.put(str2, eVar);
                    }
                }
            }
        }
    }

    public static class f {

        /* renamed from: p  reason: collision with root package name */
        public static final Matrix f14641p = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f14642a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f14643b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f14644c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f14645d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f14646e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f14647f;

        /* renamed from: g  reason: collision with root package name */
        public final c f14648g;

        /* renamed from: h  reason: collision with root package name */
        public float f14649h;

        /* renamed from: i  reason: collision with root package name */
        public float f14650i;

        /* renamed from: j  reason: collision with root package name */
        public float f14651j;

        /* renamed from: k  reason: collision with root package name */
        public float f14652k;

        /* renamed from: l  reason: collision with root package name */
        public int f14653l;
        public String m;

        /* renamed from: n  reason: collision with root package name */
        public Boolean f14654n;

        /* renamed from: o  reason: collision with root package name */
        public final o.a<String, Object> f14655o;

        public f() {
            this.f14644c = new Matrix();
            this.f14649h = 0.0f;
            this.f14650i = 0.0f;
            this.f14651j = 0.0f;
            this.f14652k = 0.0f;
            this.f14653l = 255;
            this.m = null;
            this.f14654n = null;
            this.f14655o = new o.a<>();
            this.f14648g = new c();
            this.f14642a = new Path();
            this.f14643b = new Path();
        }

        public final void a(c cVar, Matrix matrix, Canvas canvas, int i8, int i10) {
            int i11;
            boolean z10;
            float f10;
            c cVar2 = cVar;
            Canvas canvas2 = canvas;
            cVar2.f14625a.set(matrix);
            Matrix matrix2 = cVar2.f14625a;
            matrix2.preConcat(cVar2.f14634j);
            canvas.save();
            char c3 = 0;
            int i12 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar2.f14626b;
                if (i12 < arrayList.size()) {
                    d dVar = arrayList.get(i12);
                    if (dVar instanceof c) {
                        a((c) dVar, matrix2, canvas, i8, i10);
                    } else if (dVar instanceof e) {
                        e eVar = (e) dVar;
                        float f11 = ((float) i8) / this.f14651j;
                        float f12 = ((float) i10) / this.f14652k;
                        float min = Math.min(f11, f12);
                        Matrix matrix3 = this.f14644c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f11, f12);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        float f13 = min;
                        i11 = i12;
                        float hypot = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
                        float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float max = Math.max((float) Math.hypot((double) fArr[c3], (double) fArr[1]), hypot);
                        float abs = max > 0.0f ? Math.abs(f14) / max : 0.0f;
                        if (abs != 0.0f) {
                            eVar.getClass();
                            Path path = this.f14642a;
                            path.reset();
                            g.a[] aVarArr = eVar.f14637a;
                            if (aVarArr != null) {
                                g.a.b(aVarArr, path);
                            }
                            Path path2 = this.f14643b;
                            path2.reset();
                            if (eVar instanceof a) {
                                path2.setFillType(eVar.f14639c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                path2.addPath(path, matrix3);
                                canvas2.clipPath(path2);
                            } else {
                                b bVar = (b) eVar;
                                float f15 = bVar.f14620j;
                                if (!(f15 == 0.0f && bVar.f14621k == 1.0f)) {
                                    float f16 = bVar.f14622l;
                                    float f17 = (f15 + f16) % 1.0f;
                                    float f18 = (bVar.f14621k + f16) % 1.0f;
                                    if (this.f14647f == null) {
                                        this.f14647f = new PathMeasure();
                                    }
                                    this.f14647f.setPath(path, false);
                                    float length = this.f14647f.getLength();
                                    float f19 = f17 * length;
                                    float f20 = f18 * length;
                                    path.reset();
                                    if (f19 > f20) {
                                        this.f14647f.getSegment(f19, length, path, true);
                                        f10 = 0.0f;
                                        this.f14647f.getSegment(0.0f, f20, path, true);
                                    } else {
                                        f10 = 0.0f;
                                        this.f14647f.getSegment(f19, f20, path, true);
                                    }
                                    path.rLineTo(f10, f10);
                                }
                                path2.addPath(path, matrix3);
                                u1.c cVar3 = bVar.f14617g;
                                if ((cVar3.f15655a != null) || cVar3.f15657c != 0) {
                                    if (this.f14646e == null) {
                                        Paint paint = new Paint(1);
                                        this.f14646e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f14646e;
                                    Shader shader = cVar3.f15655a;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(bVar.f14619i * 255.0f));
                                    } else {
                                        paint2.setShader((Shader) null);
                                        paint2.setAlpha(255);
                                        int i13 = cVar3.f15657c;
                                        float f21 = bVar.f14619i;
                                        PorterDuff.Mode mode = g.F;
                                        paint2.setColor((i13 & 16777215) | (((int) (((float) Color.alpha(i13)) * f21)) << 24));
                                    }
                                    paint2.setColorFilter((ColorFilter) null);
                                    path2.setFillType(bVar.f14639c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas2.drawPath(path2, paint2);
                                }
                                u1.c cVar4 = bVar.f14615e;
                                if ((cVar4.f15655a != null) || cVar4.f15657c != 0) {
                                    if (this.f14645d == null) {
                                        z10 = true;
                                        Paint paint3 = new Paint(1);
                                        this.f14645d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    } else {
                                        z10 = true;
                                    }
                                    Paint paint4 = this.f14645d;
                                    Paint.Join join = bVar.f14623n;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = bVar.m;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(bVar.f14624o);
                                    Shader shader2 = cVar4.f15655a;
                                    if (shader2 == null) {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(bVar.f14618h * 255.0f));
                                    } else {
                                        paint4.setShader((Shader) null);
                                        paint4.setAlpha(255);
                                        int i14 = cVar4.f15657c;
                                        float f22 = bVar.f14618h;
                                        PorterDuff.Mode mode2 = g.F;
                                        paint4.setColor((i14 & 16777215) | (((int) (((float) Color.alpha(i14)) * f22)) << 24));
                                    }
                                    paint4.setColorFilter((ColorFilter) null);
                                    paint4.setStrokeWidth(bVar.f14616f * abs * f13);
                                    canvas2.drawPath(path2, paint4);
                                }
                            }
                        }
                        i12 = i11 + 1;
                        c3 = 0;
                    }
                    int i15 = i8;
                    int i16 = i10;
                    i11 = i12;
                    i12 = i11 + 1;
                    c3 = 0;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f14653l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i8) {
            this.f14653l = i8;
        }

        public f(f fVar) {
            this.f14644c = new Matrix();
            this.f14649h = 0.0f;
            this.f14650i = 0.0f;
            this.f14651j = 0.0f;
            this.f14652k = 0.0f;
            this.f14653l = 255;
            this.m = null;
            this.f14654n = null;
            o.a<String, Object> aVar = new o.a<>();
            this.f14655o = aVar;
            this.f14648g = new c(fVar.f14648g, aVar);
            this.f14642a = new Path(fVar.f14642a);
            this.f14643b = new Path(fVar.f14643b);
            this.f14649h = fVar.f14649h;
            this.f14650i = fVar.f14650i;
            this.f14651j = fVar.f14651j;
            this.f14652k = fVar.f14652k;
            this.f14653l = fVar.f14653l;
            this.m = fVar.m;
            String str = fVar.m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f14654n = fVar.f14654n;
        }
    }
}
