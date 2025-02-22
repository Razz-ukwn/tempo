package v8;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import v8.j;
import v8.l;

public class f extends Drawable implements m {
    public static final Paint S;
    public final Matrix B;
    public final Path C;
    public final Path D;
    public final RectF E;
    public final RectF F;
    public final Region G;
    public final Region H;
    public i I;
    public final Paint J;
    public final Paint K;
    public final u8.a L;
    public final a M;
    public final j N;
    public PorterDuffColorFilter O;
    public PorterDuffColorFilter P;
    public final RectF Q;
    public boolean R;

    /* renamed from: a  reason: collision with root package name */
    public b f16250a;

    /* renamed from: b  reason: collision with root package name */
    public final l.f[] f16251b;

    /* renamed from: c  reason: collision with root package name */
    public final l.f[] f16252c;

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f16253d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16254e;

    public class a {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        S = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public f() {
        this(new i());
    }

    public final void b(RectF rectF, Path path) {
        j jVar = this.N;
        b bVar = this.f16250a;
        i iVar = bVar.f16256a;
        float f10 = bVar.f16265j;
        jVar.a(iVar, f10, rectF, this.M, path);
        if (this.f16250a.f16264i != 1.0f) {
            Matrix matrix = this.B;
            matrix.reset();
            float f11 = this.f16250a.f16264i;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.Q, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r2 = r4.getColor();
        r3 = d(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0014
            int r2 = r1.d(r2)
        L_0x0014:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r3)
            goto L_0x0030
        L_0x001a:
            if (r5 == 0) goto L_0x002e
            int r2 = r4.getColor()
            int r3 = r1.d(r2)
            if (r3 == r2) goto L_0x002e
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = r2
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.f.c(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final int d(int i8) {
        b bVar = this.f16250a;
        float f10 = bVar.f16268n + bVar.f16269o + bVar.m;
        j8.a aVar = bVar.f16257b;
        return aVar != null ? aVar.a(i8, f10) : i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0122, code lost:
        if ((!k() && !r3.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x020e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r22) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            android.graphics.Paint r8 = r6.J
            android.graphics.PorterDuffColorFilter r0 = r6.O
            r8.setColorFilter(r0)
            int r9 = r8.getAlpha()
            v8.f$b r0 = r6.f16250a
            int r0 = r0.f16267l
            int r1 = r0 >>> 7
            int r0 = r0 + r1
            int r0 = r0 * r9
            int r0 = r0 >>> 8
            r8.setAlpha(r0)
            android.graphics.Paint r10 = r6.K
            android.graphics.PorterDuffColorFilter r0 = r6.P
            r10.setColorFilter(r0)
            v8.f$b r0 = r6.f16250a
            float r0 = r0.f16266k
            r10.setStrokeWidth(r0)
            int r11 = r10.getAlpha()
            v8.f$b r0 = r6.f16250a
            int r0 = r0.f16267l
            int r1 = r0 >>> 7
            int r0 = r0 + r1
            int r0 = r0 * r11
            int r0 = r0 >>> 8
            r10.setAlpha(r0)
            boolean r0 = r6.f16254e
            android.graphics.Path r3 = r6.C
            r12 = 0
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L_0x0100
            v8.f$b r0 = r6.f16250a
            android.graphics.Paint$Style r0 = r0.f16275u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x0050
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x005a
        L_0x0050:
            float r0 = r10.getStrokeWidth()
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            r0 = r13
            goto L_0x005b
        L_0x005a:
            r0 = r14
        L_0x005b:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x0065
            float r0 = r10.getStrokeWidth()
            float r0 = r0 / r1
            goto L_0x0066
        L_0x0065:
            r0 = r12
        L_0x0066:
            float r0 = -r0
            v8.f$b r2 = r6.f16250a
            v8.i r2 = r2.f16256a
            r2.getClass()
            v8.i$a r4 = new v8.i$a
            r4.<init>(r2)
            v8.c r5 = r2.f16281e
            boolean r15 = r5 instanceof v8.g
            if (r15 == 0) goto L_0x007a
            goto L_0x0080
        L_0x007a:
            v8.b r15 = new v8.b
            r15.<init>(r0, r5)
            r5 = r15
        L_0x0080:
            r4.f16293e = r5
            v8.c r5 = r2.f16282f
            boolean r15 = r5 instanceof v8.g
            if (r15 == 0) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            v8.b r15 = new v8.b
            r15.<init>(r0, r5)
            r5 = r15
        L_0x008f:
            r4.f16294f = r5
            v8.c r5 = r2.f16284h
            boolean r15 = r5 instanceof v8.g
            if (r15 == 0) goto L_0x0098
            goto L_0x009e
        L_0x0098:
            v8.b r15 = new v8.b
            r15.<init>(r0, r5)
            r5 = r15
        L_0x009e:
            r4.f16296h = r5
            v8.c r2 = r2.f16283g
            boolean r5 = r2 instanceof v8.g
            if (r5 == 0) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            v8.b r5 = new v8.b
            r5.<init>(r0, r2)
            r2 = r5
        L_0x00ad:
            r4.f16295g = r2
            v8.i r0 = new v8.i
            r0.<init>(r4)
            r6.I = r0
            v8.f$b r2 = r6.f16250a
            float r2 = r2.f16265j
            android.graphics.RectF r4 = r6.F
            android.graphics.RectF r5 = r21.h()
            r4.set(r5)
            v8.f$b r5 = r6.f16250a
            android.graphics.Paint$Style r5 = r5.f16275u
            android.graphics.Paint$Style r15 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r5 == r15) goto L_0x00cf
            android.graphics.Paint$Style r15 = android.graphics.Paint.Style.STROKE
            if (r5 != r15) goto L_0x00d9
        L_0x00cf:
            float r5 = r10.getStrokeWidth()
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d9
            r5 = r13
            goto L_0x00da
        L_0x00d9:
            r5 = r14
        L_0x00da:
            if (r5 == 0) goto L_0x00e2
            float r5 = r10.getStrokeWidth()
            float r5 = r5 / r1
            goto L_0x00e3
        L_0x00e2:
            r5 = r12
        L_0x00e3:
            r4.inset(r5, r5)
            android.graphics.Path r1 = r6.D
            v8.j r15 = r6.N
            r19 = 0
            r16 = r0
            r17 = r2
            r18 = r4
            r20 = r1
            r15.a(r16, r17, r18, r19, r20)
            android.graphics.RectF r0 = r21.h()
            r6.b(r0, r3)
            r6.f16254e = r14
        L_0x0100:
            v8.f$b r0 = r6.f16250a
            int r1 = r0.f16270p
            r2 = 2
            if (r1 == r13) goto L_0x0126
            int r0 = r0.f16271q
            if (r0 <= 0) goto L_0x0126
            if (r1 == r2) goto L_0x0124
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r1 = r21.k()
            if (r1 != 0) goto L_0x0121
            boolean r1 = r3.isConvex()
            if (r1 != 0) goto L_0x0121
            r1 = 29
            if (r0 >= r1) goto L_0x0121
            r0 = r13
            goto L_0x0122
        L_0x0121:
            r0 = r14
        L_0x0122:
            if (r0 == 0) goto L_0x0126
        L_0x0124:
            r0 = r13
            goto L_0x0127
        L_0x0126:
            r0 = r14
        L_0x0127:
            if (r0 != 0) goto L_0x012b
            goto L_0x01d5
        L_0x012b:
            r22.save()
            v8.f$b r0 = r6.f16250a
            int r1 = r0.f16272r
            double r4 = (double) r1
            int r0 = r0.f16273s
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.sin(r0)
            double r0 = r0 * r4
            int r0 = (int) r0
            v8.f$b r1 = r6.f16250a
            int r4 = r1.f16272r
            double r4 = (double) r4
            int r1 = r1.f16273s
            double r13 = (double) r1
            double r13 = java.lang.Math.toRadians(r13)
            double r13 = java.lang.Math.cos(r13)
            double r13 = r13 * r4
            int r1 = (int) r13
            float r0 = (float) r0
            float r1 = (float) r1
            r7.translate(r0, r1)
            boolean r0 = r6.R
            if (r0 != 0) goto L_0x0162
            r21.e(r22)
            r22.restore()
            goto L_0x01d5
        L_0x0162:
            android.graphics.RectF r0 = r6.Q
            float r1 = r0.width()
            android.graphics.Rect r4 = r21.getBounds()
            int r4 = r4.width()
            float r4 = (float) r4
            float r1 = r1 - r4
            int r1 = (int) r1
            float r4 = r0.height()
            android.graphics.Rect r5 = r21.getBounds()
            int r5 = r5.height()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r4 = (int) r4
            if (r1 < 0) goto L_0x0218
            if (r4 < 0) goto L_0x0218
            float r5 = r0.width()
            int r5 = (int) r5
            v8.f$b r13 = r6.f16250a
            int r13 = r13.f16271q
            int r13 = r13 * r2
            int r13 = r13 + r5
            int r13 = r13 + r1
            float r0 = r0.height()
            int r0 = (int) r0
            v8.f$b r5 = r6.f16250a
            int r5 = r5.f16271q
            int r5 = r5 * r2
            int r5 = r5 + r0
            int r5 = r5 + r4
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r13, r5, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            android.graphics.Rect r5 = r21.getBounds()
            int r5 = r5.left
            v8.f$b r13 = r6.f16250a
            int r13 = r13.f16271q
            int r5 = r5 - r13
            int r5 = r5 - r1
            float r1 = (float) r5
            android.graphics.Rect r5 = r21.getBounds()
            int r5 = r5.top
            v8.f$b r13 = r6.f16250a
            int r13 = r13.f16271q
            int r5 = r5 - r13
            int r5 = r5 - r4
            float r4 = (float) r5
            float r5 = -r1
            float r13 = -r4
            r2.translate(r5, r13)
            r6.e(r2)
            r2 = 0
            r7.drawBitmap(r0, r1, r4, r2)
            r0.recycle()
            r22.restore()
        L_0x01d5:
            v8.f$b r0 = r6.f16250a
            android.graphics.Paint$Style r1 = r0.f16275u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r2) goto L_0x01e4
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            if (r1 != r2) goto L_0x01e2
            goto L_0x01e4
        L_0x01e2:
            r1 = 0
            goto L_0x01e5
        L_0x01e4:
            r1 = 1
        L_0x01e5:
            if (r1 == 0) goto L_0x01f5
            v8.i r4 = r0.f16256a
            android.graphics.RectF r5 = r21.h()
            r0 = r21
            r1 = r22
            r2 = r8
            r0.f(r1, r2, r3, r4, r5)
        L_0x01f5:
            v8.f$b r0 = r6.f16250a
            android.graphics.Paint$Style r0 = r0.f16275u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x0201
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x020b
        L_0x0201:
            float r0 = r10.getStrokeWidth()
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x020b
            r13 = 1
            goto L_0x020c
        L_0x020b:
            r13 = 0
        L_0x020c:
            if (r13 == 0) goto L_0x0211
            r21.g(r22)
        L_0x0211:
            r8.setAlpha(r9)
            r10.setAlpha(r11)
            return
        L_0x0218:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.f.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f16253d.cardinality() > 0) {
            Log.w("f", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i8 = this.f16250a.f16272r;
        Path path = this.C;
        u8.a aVar = this.L;
        if (i8 != 0) {
            canvas.drawPath(path, aVar.f15887a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            l.f fVar = this.f16251b[i10];
            int i11 = this.f16250a.f16271q;
            Matrix matrix = l.f.f16338b;
            fVar.a(matrix, aVar, i11, canvas);
            this.f16252c[i10].a(matrix, aVar, this.f16250a.f16271q, canvas);
        }
        if (this.R) {
            b bVar = this.f16250a;
            int sin = (int) (Math.sin(Math.toRadians((double) bVar.f16273s)) * ((double) bVar.f16272r));
            b bVar2 = this.f16250a;
            int cos = (int) (Math.cos(Math.toRadians((double) bVar2.f16273s)) * ((double) bVar2.f16272r));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, S);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (iVar.d(rectF)) {
            float a10 = iVar.f16282f.a(rectF) * this.f16250a.f16265j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void g(Canvas canvas) {
        Paint paint = this.K;
        Path path = this.D;
        i iVar = this.I;
        RectF rectF = this.F;
        rectF.set(h());
        Paint.Style style = this.f16250a.f16275u;
        float f10 = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            f10 = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f10, f10);
        f(canvas, paint, path, iVar, rectF);
    }

    public int getAlpha() {
        return this.f16250a.f16267l;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f16250a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f16250a.f16270p != 2) {
            if (k()) {
                outline.setRoundRect(getBounds(), i() * this.f16250a.f16265j);
                return;
            }
            RectF h3 = h();
            Path path = this.C;
            b(h3, path);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                outline.setPath(path);
            } else if (i8 >= 29) {
                try {
                    outline.setConvexPath(path);
                } catch (IllegalArgumentException unused) {
                }
            } else if (path.isConvex()) {
                outline.setConvexPath(path);
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f16250a.f16263h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.G;
        region.set(bounds);
        RectF h3 = h();
        Path path = this.C;
        b(h3, path);
        Region region2 = this.H;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.E;
        rectF.set(getBounds());
        return rectF;
    }

    public final float i() {
        return this.f16250a.f16256a.f16281e.a(h());
    }

    public final void invalidateSelf() {
        this.f16254e = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f16250a.f16259d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f16250a.f16258c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f16250a.f16261f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f16250a.f16260e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            v8.f$b r0 = r1.f16250a
            android.content.res.ColorStateList r0 = r0.f16261f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            v8.f$b r0 = r1.f16250a
            android.content.res.ColorStateList r0 = r0.f16260e
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            v8.f$b r0 = r1.f16250a
            android.content.res.ColorStateList r0 = r0.f16259d
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            v8.f$b r0 = r1.f16250a
            android.content.res.ColorStateList r0 = r0.f16258c
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.f.isStateful():boolean");
    }

    public final void j(Context context) {
        this.f16250a.f16257b = new j8.a(context);
        r();
    }

    public final boolean k() {
        return this.f16250a.f16256a.d(h());
    }

    public final void l(float f10) {
        b bVar = this.f16250a;
        if (bVar.f16268n != f10) {
            bVar.f16268n = f10;
            r();
        }
    }

    public final void m(ColorStateList colorStateList) {
        b bVar = this.f16250a;
        if (bVar.f16258c != colorStateList) {
            bVar.f16258c = colorStateList;
            onStateChange(getState());
        }
    }

    public final Drawable mutate() {
        this.f16250a = new b(this.f16250a);
        return this;
    }

    public final void n(float f10) {
        b bVar = this.f16250a;
        if (bVar.f16265j != f10) {
            bVar.f16265j = f10;
            this.f16254e = true;
            invalidateSelf();
        }
    }

    public final void o() {
        this.L.a(-12303292);
        this.f16250a.f16274t = false;
        super.invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        this.f16254e = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z10 = p(iArr) || q();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final boolean p(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f16250a.f16258c == null || (color2 = paint2.getColor()) == (colorForState2 = this.f16250a.f16258c.getColorForState(iArr, color2))) {
            z10 = false;
        } else {
            (paint2 = this.J).setColor(colorForState2);
            z10 = true;
        }
        if (this.f16250a.f16259d == null || (color = paint.getColor()) == (colorForState = this.f16250a.f16259d.getColorForState(iArr, color))) {
            return z10;
        }
        (paint = this.K).setColor(colorForState);
        return true;
    }

    public final boolean q() {
        PorterDuffColorFilter porterDuffColorFilter = this.O;
        PorterDuffColorFilter porterDuffColorFilter2 = this.P;
        b bVar = this.f16250a;
        this.O = c(bVar.f16261f, bVar.f16262g, this.J, true);
        b bVar2 = this.f16250a;
        this.P = c(bVar2.f16260e, bVar2.f16262g, this.K, false);
        b bVar3 = this.f16250a;
        if (bVar3.f16274t) {
            this.L.a(bVar3.f16261f.getColorForState(getState(), 0));
        }
        return !c2.b.a(porterDuffColorFilter, this.O) || !c2.b.a(porterDuffColorFilter2, this.P);
    }

    public final void r() {
        b bVar = this.f16250a;
        float f10 = bVar.f16268n + bVar.f16269o;
        bVar.f16271q = (int) Math.ceil((double) (0.75f * f10));
        this.f16250a.f16272r = (int) Math.ceil((double) (f10 * 0.25f));
        q();
        super.invalidateSelf();
    }

    public void setAlpha(int i8) {
        b bVar = this.f16250a;
        if (bVar.f16267l != i8) {
            bVar.f16267l = i8;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f16250a.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(i iVar) {
        this.f16250a.f16256a = iVar;
        invalidateSelf();
    }

    public final void setTint(int i8) {
        setTintList(ColorStateList.valueOf(i8));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f16250a.f16261f = colorStateList;
        q();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f16250a;
        if (bVar.f16262g != mode) {
            bVar.f16262g = mode;
            q();
            super.invalidateSelf();
        }
    }

    public f(Context context, AttributeSet attributeSet, int i8, int i10) {
        this(i.b(context, attributeSet, i8, i10).a());
    }

    public f(i iVar) {
        this(new b(iVar));
    }

    public f(b bVar) {
        j jVar;
        this.f16251b = new l.f[4];
        this.f16252c = new l.f[4];
        this.f16253d = new BitSet(8);
        this.B = new Matrix();
        this.C = new Path();
        this.D = new Path();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Region();
        this.H = new Region();
        Paint paint = new Paint(1);
        this.J = paint;
        Paint paint2 = new Paint(1);
        this.K = paint2;
        this.L = new u8.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f16313a;
        } else {
            jVar = new j();
        }
        this.N = jVar;
        this.Q = new RectF();
        this.R = true;
        this.f16250a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        q();
        p(getState());
        this.M = new a();
    }

    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f16256a;

        /* renamed from: b  reason: collision with root package name */
        public j8.a f16257b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f16258c = null;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f16259d = null;

        /* renamed from: e  reason: collision with root package name */
        public final ColorStateList f16260e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f16261f = null;

        /* renamed from: g  reason: collision with root package name */
        public PorterDuff.Mode f16262g = PorterDuff.Mode.SRC_IN;

        /* renamed from: h  reason: collision with root package name */
        public Rect f16263h = null;

        /* renamed from: i  reason: collision with root package name */
        public final float f16264i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f16265j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f16266k;

        /* renamed from: l  reason: collision with root package name */
        public int f16267l = 255;
        public float m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public float f16268n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public final float f16269o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public final int f16270p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f16271q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f16272r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f16273s = 0;

        /* renamed from: t  reason: collision with root package name */
        public boolean f16274t = false;

        /* renamed from: u  reason: collision with root package name */
        public final Paint.Style f16275u = Paint.Style.FILL_AND_STROKE;

        public b(i iVar) {
            this.f16256a = iVar;
            this.f16257b = null;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            f fVar = new f(this);
            fVar.f16254e = true;
            return fVar;
        }

        public b(b bVar) {
            this.f16256a = bVar.f16256a;
            this.f16257b = bVar.f16257b;
            this.f16266k = bVar.f16266k;
            this.f16258c = bVar.f16258c;
            this.f16259d = bVar.f16259d;
            this.f16262g = bVar.f16262g;
            this.f16261f = bVar.f16261f;
            this.f16267l = bVar.f16267l;
            this.f16264i = bVar.f16264i;
            this.f16272r = bVar.f16272r;
            this.f16270p = bVar.f16270p;
            this.f16274t = bVar.f16274t;
            this.f16265j = bVar.f16265j;
            this.m = bVar.m;
            this.f16268n = bVar.f16268n;
            this.f16269o = bVar.f16269o;
            this.f16271q = bVar.f16271q;
            this.f16273s = bVar.f16273s;
            this.f16260e = bVar.f16260e;
            this.f16275u = bVar.f16275u;
            if (bVar.f16263h != null) {
                this.f16263h = new Rect(bVar.f16263h);
            }
        }
    }
}
