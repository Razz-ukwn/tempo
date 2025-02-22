package com.lassi.presentation.cropper;

import ac.d;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.lassi.presentation.cropper.CropImageView;
import java.util.Arrays;

public class CropOverlayView extends View {
    public ScaleGestureDetector B;
    public boolean C;
    public a D;
    public Paint E;
    public Paint F;
    public Paint G;
    public Paint H;
    public final Path I = new Path();
    public int J;
    public int K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public d Q;
    public boolean R;
    public int S;
    public int T;
    public float U = (((float) this.S) / ((float) this.T));
    public CropImageView.d V;
    public CropImageView.c W;

    /* renamed from: a  reason: collision with root package name */
    public final e f6560a = new e();

    /* renamed from: a0  reason: collision with root package name */
    public boolean f6561a0;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f6562b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public final float[] f6563c = new float[8];

    /* renamed from: d  reason: collision with root package name */
    public final RectF f6564d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f6565e = new Rect();

    public interface a {
    }

    public class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public b() {
        }

        @TargetApi(11)
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            CropOverlayView cropOverlayView = CropOverlayView.this;
            RectF a10 = cropOverlayView.f6560a.a();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f10 = focusY - currentSpanY;
            float f11 = focusX - currentSpanX;
            float f12 = focusX + currentSpanX;
            float f13 = focusY + currentSpanY;
            if (f11 >= f12 || f10 > f13 || f11 < 0.0f) {
                return true;
            }
            e eVar = cropOverlayView.f6560a;
            if (f12 > Math.min(eVar.f6638e, eVar.f6642i / eVar.f6644k) || f10 < 0.0f || f13 > Math.min(eVar.f6639f, eVar.f6643j / eVar.f6645l)) {
                return true;
            }
            a10.set(f11, f10, f12, f13);
            eVar.f6634a.set(a10);
            cropOverlayView.invalidate();
            return true;
        }
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Paint e(int i8, float f10) {
        if (f10 <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i8);
        paint.setStrokeWidth(f10);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    public final boolean a(RectF rectF) {
        float f10;
        float f11;
        RectF rectF2 = rectF;
        float[] fArr = this.f6563c;
        float o10 = c.o(fArr);
        float q10 = c.q(fArr);
        float p10 = c.p(fArr);
        float m = c.m(fArr);
        boolean z10 = (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
        RectF rectF3 = this.f6564d;
        if (!z10) {
            rectF3.set(o10, q10, p10, m);
            return false;
        }
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        if (f17 < f13) {
            f10 = fArr[3];
            if (f13 < f10) {
                float f18 = fArr[2];
                f11 = f16;
                f13 = f15;
                f16 = f18;
                f15 = f17;
                f12 = f14;
            } else {
                f16 = f12;
                f12 = fArr[2];
                f11 = f14;
                float f19 = f10;
                f10 = f13;
                f13 = f19;
            }
        } else {
            float f20 = fArr[3];
            if (f13 > f20) {
                f11 = fArr[2];
                f15 = f20;
                f10 = f17;
            } else {
                f11 = f12;
                f12 = f16;
                f16 = f14;
                f10 = f15;
                f15 = f13;
                f13 = f17;
            }
        }
        float f21 = (f13 - f15) / (f12 - f11);
        float f22 = -1.0f / f21;
        float f23 = f15 - (f21 * f11);
        float f24 = f15 - (f11 * f22);
        float f25 = f10 - (f21 * f16);
        float f26 = f10 - (f16 * f22);
        float centerY = rectF.centerY() - rectF2.top;
        float centerX = rectF.centerX();
        float f27 = rectF2.left;
        float f28 = centerY / (centerX - f27);
        float f29 = -f28;
        float f30 = rectF2.top;
        float f31 = f30 - (f27 * f28);
        RectF rectF4 = rectF3;
        float f32 = rectF2.right;
        float f33 = f30 - (f29 * f32);
        float f34 = f21 - f28;
        float f35 = (f31 - f23) / f34;
        float max = Math.max(o10, f35 < f32 ? f35 : o10);
        float f36 = (f31 - f24) / (f22 - f28);
        if (f36 >= rectF2.right) {
            f36 = max;
        }
        float max2 = Math.max(max, f36);
        float f37 = f22 - f29;
        float f38 = (f33 - f26) / f37;
        float f39 = m;
        if (f38 >= rectF2.right) {
            f38 = max2;
        }
        float max3 = Math.max(max2, f38);
        float f40 = (f33 - f24) / f37;
        if (f40 <= rectF2.left) {
            f40 = p10;
        }
        float min = Math.min(p10, f40);
        float f41 = (f33 - f25) / (f21 - f29);
        if (f41 <= rectF2.left) {
            f41 = min;
        }
        float min2 = Math.min(min, f41);
        float f42 = (f31 - f25) / f34;
        if (f42 <= rectF2.left) {
            f42 = min2;
        }
        float min3 = Math.min(min2, f42);
        float max4 = Math.max(q10, Math.max((f21 * max3) + f23, (f22 * min3) + f24));
        float min4 = Math.min(f39, Math.min((f22 * max3) + f26, (f21 * min3) + f25));
        RectF rectF5 = rectF4;
        rectF5.left = max3;
        rectF5.top = max4;
        rectF5.right = min3;
        rectF5.bottom = min4;
        return true;
    }

    public final void b(boolean z10) {
        try {
            a aVar = this.D;
            if (aVar != null) {
                CropImageView.a aVar2 = (CropImageView.a) aVar;
                aVar2.getClass();
                int i8 = CropImageView.f6535i0;
                CropImageView.this.c(z10, true);
            }
        } catch (Exception e10) {
            Log.e("AIC", "Exception in crop window changed", e10);
        }
    }

    public final void c(Canvas canvas) {
        if (this.G != null) {
            Paint paint = this.E;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF a10 = this.f6560a.a();
            a10.inset(strokeWidth, strokeWidth);
            float width = a10.width() / 3.0f;
            float height = a10.height() / 3.0f;
            if (this.W == CropImageView.c.f6552b) {
                float width2 = (a10.width() / 2.0f) - strokeWidth;
                float height2 = (a10.height() / 2.0f) - strokeWidth;
                float f10 = a10.left + width;
                float f11 = a10.right - width;
                float sin = (float) (Math.sin(Math.acos((double) ((width2 - width) / width2))) * ((double) height2));
                canvas.drawLine(f10, (a10.top + height2) - sin, f10, (a10.bottom - height2) + sin, this.G);
                canvas.drawLine(f11, (a10.top + height2) - sin, f11, (a10.bottom - height2) + sin, this.G);
                float f12 = a10.top + height;
                float f13 = a10.bottom - height;
                float cos = (float) (Math.cos(Math.asin((double) ((height2 - height) / height2))) * ((double) width2));
                canvas.drawLine((a10.left + width2) - cos, f12, (a10.right - width2) + cos, f12, this.G);
                canvas.drawLine((a10.left + width2) - cos, f13, (a10.right - width2) + cos, f13, this.G);
                return;
            }
            float f14 = a10.left + width;
            float f15 = a10.right - width;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f14, a10.top, f14, a10.bottom, this.G);
            canvas.drawLine(f15, a10.top, f15, a10.bottom, this.G);
            float f16 = a10.top + height;
            float f17 = a10.bottom - height;
            canvas2.drawLine(a10.left, f16, a10.right, f16, this.G);
            canvas.drawLine(a10.left, f17, a10.right, f17, this.G);
        }
    }

    public final void d(RectF rectF) {
        float width = rectF.width();
        e eVar = this.f6560a;
        if (width < Math.max(eVar.f6636c, eVar.f6640g / eVar.f6644k)) {
            float max = (Math.max(eVar.f6636c, eVar.f6640g / eVar.f6644k) - rectF.width()) / 2.0f;
            rectF.left -= max;
            rectF.right += max;
        }
        if (rectF.height() < Math.max(eVar.f6637d, eVar.f6641h / eVar.f6645l)) {
            float max2 = (Math.max(eVar.f6637d, eVar.f6641h / eVar.f6645l) - rectF.height()) / 2.0f;
            rectF.top -= max2;
            rectF.bottom += max2;
        }
        if (rectF.width() > Math.min(eVar.f6638e, eVar.f6642i / eVar.f6644k)) {
            float width2 = (rectF.width() - Math.min(eVar.f6638e, eVar.f6642i / eVar.f6644k)) / 2.0f;
            rectF.left += width2;
            rectF.right -= width2;
        }
        if (rectF.height() > Math.min(eVar.f6639f, eVar.f6643j / eVar.f6645l)) {
            float height = (rectF.height() - Math.min(eVar.f6639f, eVar.f6643j / eVar.f6645l)) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        a(rectF);
        RectF rectF2 = this.f6564d;
        if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
            float max3 = Math.max(rectF2.left, 0.0f);
            float max4 = Math.max(rectF2.top, 0.0f);
            float min = Math.min(rectF2.right, (float) getWidth());
            float min2 = Math.min(rectF2.bottom, (float) getHeight());
            if (rectF.left < max3) {
                rectF.left = max3;
            }
            if (rectF.top < max4) {
                rectF.top = max4;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.R && ((double) Math.abs(rectF.width() - (rectF.height() * this.U))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.U) {
                float abs = Math.abs((rectF.height() * this.U) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.U) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    public final void f() {
        float[] fArr = this.f6563c;
        float max = Math.max(c.o(fArr), 0.0f);
        float max2 = Math.max(c.q(fArr), 0.0f);
        float min = Math.min(c.p(fArr), (float) getWidth());
        float min2 = Math.min(c.m(fArr), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.f6561a0 = true;
            float f10 = this.N;
            float f11 = min - max;
            float f12 = f10 * f11;
            float f13 = min2 - max2;
            float f14 = f10 * f13;
            Rect rect = this.f6565e;
            int width = rect.width();
            e eVar = this.f6560a;
            if (width > 0 && rect.height() > 0) {
                float f15 = (((float) rect.left) / eVar.f6644k) + max;
                rectF.left = f15;
                rectF.top = (((float) rect.top) / eVar.f6645l) + max2;
                rectF.right = (((float) rect.width()) / eVar.f6644k) + f15;
                rectF.bottom = (((float) rect.height()) / eVar.f6645l) + rectF.top;
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (!this.R || min <= max || min2 <= max2) {
                rectF.left = max + f12;
                rectF.top = max2 + f14;
                rectF.right = min - f12;
                rectF.bottom = min2 - f14;
            } else if (f11 / f13 > this.U) {
                rectF.top = max2 + f14;
                rectF.bottom = min2 - f14;
                float width2 = ((float) getWidth()) / 2.0f;
                this.U = ((float) this.S) / ((float) this.T);
                float max3 = Math.max(Math.max(eVar.f6636c, eVar.f6640g / eVar.f6644k), rectF.height() * this.U) / 2.0f;
                rectF.left = width2 - max3;
                rectF.right = width2 + max3;
            } else {
                rectF.left = max + f12;
                rectF.right = min - f12;
                float height = ((float) getHeight()) / 2.0f;
                float max4 = Math.max(Math.max(eVar.f6637d, eVar.f6641h / eVar.f6645l), rectF.width() / this.U) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
            d(rectF);
            eVar.f6634a.set(rectF);
        }
    }

    public final void g(float[] fArr, int i8, int i10) {
        float[] fArr2 = this.f6563c;
        if (fArr == null || !Arrays.equals(fArr2, fArr)) {
            if (fArr == null) {
                Arrays.fill(fArr2, 0.0f);
            } else {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            }
            this.J = i8;
            this.K = i10;
            RectF a10 = this.f6560a.a();
            if (a10.width() == 0.0f || a10.height() == 0.0f) {
                f();
            }
        }
    }

    public int getAspectRatioX() {
        return this.S;
    }

    public int getAspectRatioY() {
        return this.T;
    }

    public CropImageView.c getCropShape() {
        return this.W;
    }

    public RectF getCropWindowRect() {
        return this.f6560a.a();
    }

    public CropImageView.d getGuidelines() {
        return this.V;
    }

    public Rect getInitialCropWindowRect() {
        return this.f6565e;
    }

    public final boolean h(boolean z10) {
        if (this.C == z10) {
            return false;
        }
        this.C = z10;
        if (!z10 || this.B != null) {
            return true;
        }
        this.B = new ScaleGestureDetector(getContext(), new b());
        return true;
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        e eVar = this.f6560a;
        RectF a10 = eVar.a();
        float[] fArr = this.f6563c;
        float max = Math.max(c.o(fArr), 0.0f);
        float max2 = Math.max(c.q(fArr), 0.0f);
        float min = Math.min(c.p(fArr), (float) getWidth());
        float min2 = Math.min(c.m(fArr), (float) getHeight());
        CropImageView.c cVar = this.W;
        CropImageView.c cVar2 = CropImageView.c.f6551a;
        Path path = this.I;
        boolean z10 = true;
        if (cVar == cVar2) {
            if ((fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true) {
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.close();
                canvas.save();
                canvas2.clipOutPath(path);
                canvas2.clipRect(a10, Region.Op.XOR);
                canvas.drawRect(max, max2, min, min2, this.H);
                canvas.restore();
            } else {
                Canvas canvas3 = canvas;
                float f10 = max;
                float f11 = min;
                canvas3.drawRect(f10, max2, f11, a10.top, this.H);
                canvas3.drawRect(f10, a10.bottom, f11, min2, this.H);
                canvas3.drawRect(f10, a10.top, a10.left, a10.bottom, this.H);
                canvas3.drawRect(a10.right, a10.top, min, a10.bottom, this.H);
            }
        } else {
            path.reset();
            RectF rectF = this.f6562b;
            rectF.set(a10.left, a10.top, a10.right, a10.bottom);
            path.addOval(rectF, Path.Direction.CW);
            canvas.save();
            canvas2.clipOutPath(path);
            canvas.drawRect(max, max2, min, min2, this.H);
            canvas.restore();
        }
        RectF rectF2 = eVar.f6634a;
        if (rectF2.width() < 100.0f || rectF2.height() < 100.0f) {
            z10 = false;
        }
        if (z10) {
            CropImageView.d dVar = this.V;
            if (dVar == CropImageView.d.f6555b) {
                c(canvas);
            } else if (dVar == CropImageView.d.f6554a && this.Q != null) {
                c(canvas);
            }
        }
        Paint paint = this.E;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF a11 = eVar.a();
            float f12 = strokeWidth / 2.0f;
            a11.inset(f12, f12);
            if (this.W == cVar2) {
                canvas2.drawRect(a11, this.E);
            } else {
                canvas2.drawOval(a11, this.E);
            }
        }
        if (this.F != null) {
            Paint paint2 = this.E;
            float strokeWidth2 = paint2 != null ? paint2.getStrokeWidth() : 0.0f;
            float strokeWidth3 = this.F.getStrokeWidth();
            float f13 = strokeWidth3 / 2.0f;
            float f14 = (this.W == cVar2 ? this.L : 0.0f) + f13;
            RectF a12 = eVar.a();
            a12.inset(f14, f14);
            float f15 = (strokeWidth3 - strokeWidth2) / 2.0f;
            float f16 = f13 + f15;
            float f17 = a12.left - f15;
            float f18 = a12.top;
            canvas.drawLine(f17, f18 - f16, f17, f18 + this.M, this.F);
            float f19 = a12.left;
            float f20 = a12.top - f15;
            canvas.drawLine(f19 - f16, f20, f19 + this.M, f20, this.F);
            float f21 = a12.right + f15;
            float f22 = a12.top;
            canvas.drawLine(f21, f22 - f16, f21, f22 + this.M, this.F);
            float f23 = a12.right;
            float f24 = a12.top - f15;
            canvas.drawLine(f23 + f16, f24, f23 - this.M, f24, this.F);
            float f25 = a12.left - f15;
            float f26 = a12.bottom;
            canvas.drawLine(f25, f26 + f16, f25, f26 - this.M, this.F);
            float f27 = a12.left;
            float f28 = a12.bottom + f15;
            canvas.drawLine(f27 - f16, f28, f27 + this.M, f28, this.F);
            float f29 = a12.right + f15;
            float f30 = a12.bottom;
            canvas.drawLine(f29, f30 + f16, f29, f30 - this.M, this.F);
            float f31 = a12.right;
            float f32 = a12.bottom + f15;
            canvas.drawLine(f31 + f16, f32, f31 - this.M, f32, this.F);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x036b, code lost:
        if (r3 < r10) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0376, code lost:
        if (r3 < r10) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03e8, code lost:
        if ((!(r10.width() >= 100.0f && r10.height() >= 100.0f)) != false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04a1, code lost:
        if ((!(r10.width() >= 100.0f && r10.height() >= 100.0f)) == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04a3, code lost:
        r2 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (r7 <= r15.right) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        if (r7 <= r15.bottom) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x035b, code lost:
        if (r3 < r10) goto L_0x044a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r20.isEnabled()
            r2 = 0
            if (r1 == 0) goto L_0x04b4
            boolean r1 = r0.C
            if (r1 == 0) goto L_0x0015
            android.view.ScaleGestureDetector r1 = r0.B
            r3 = r21
            r1.onTouchEvent(r3)
            goto L_0x0017
        L_0x0015:
            r3 = r21
        L_0x0017:
            int r1 = r21.getAction()
            r4 = 2
            r5 = 3
            r6 = 0
            r7 = 1
            com.lassi.presentation.cropper.e r8 = r0.f6560a
            r9 = 9
            if (r1 == 0) goto L_0x0324
            if (r1 == r7) goto L_0x030f
            if (r1 == r4) goto L_0x002c
            if (r1 == r5) goto L_0x030f
            return r2
        L_0x002c:
            float r1 = r21.getX()
            float r2 = r21.getY()
            ac.d r3 = r0.Q
            if (r3 == 0) goto L_0x0306
            float r3 = r0.P
            android.graphics.RectF r4 = r8.a()
            boolean r5 = r0.a(r4)
            r6 = 0
            if (r5 == 0) goto L_0x0046
            r3 = r6
        L_0x0046:
            ac.d r5 = r0.Q
            android.graphics.RectF r15 = r0.f6564d
            int r14 = r0.J
            int r13 = r0.K
            boolean r10 = r0.R
            float r12 = r0.U
            android.graphics.PointF r11 = r5.f293f
            float r7 = r11.x
            float r1 = r1 + r7
            float r7 = r11.y
            float r2 = r2 + r7
            int r7 = r5.f292e
            if (r7 != r9) goto L_0x00f0
            float r5 = r4.centerX()
            float r1 = r1 - r5
            float r5 = r4.centerY()
            float r2 = r2 - r5
            float r5 = r4.left
            float r5 = r5 + r1
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1065772646(0x3f866666, float:1.05)
            if (r7 < 0) goto L_0x0088
            float r7 = r4.right
            float r7 = r7 + r1
            float r12 = (float) r14
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x0088
            float r12 = r15.left
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x0088
            float r5 = r15.right
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0090
        L_0x0088:
            float r1 = r1 / r10
            float r5 = r11.x
            float r7 = r1 / r9
            float r5 = r5 - r7
            r11.x = r5
        L_0x0090:
            float r5 = r4.top
            float r5 = r5 + r2
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x00ab
            float r7 = r4.bottom
            float r7 = r7 + r2
            float r12 = (float) r13
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x00ab
            float r12 = r15.top
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x00ab
            float r5 = r15.bottom
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b3
        L_0x00ab:
            float r2 = r2 / r10
            float r5 = r11.y
            float r7 = r2 / r9
            float r5 = r5 - r7
            r11.y = r5
        L_0x00b3:
            r4.offset(r1, r2)
            float r1 = r4.left
            float r2 = r15.left
            float r5 = r2 + r3
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x00c4
            float r2 = r2 - r1
            r4.offset(r2, r6)
        L_0x00c4:
            float r1 = r4.top
            float r2 = r15.top
            float r5 = r2 + r3
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x00d2
            float r2 = r2 - r1
            r4.offset(r6, r2)
        L_0x00d2:
            float r1 = r4.right
            float r2 = r15.right
            float r5 = r2 - r3
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e0
            float r2 = r2 - r1
            r4.offset(r2, r6)
        L_0x00e0:
            float r1 = r4.bottom
            float r2 = r15.bottom
            float r3 = r2 - r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x02f9
            float r2 = r2 - r1
            r4.offset(r6, r2)
            goto L_0x02f9
        L_0x00f0:
            if (r10 == 0) goto L_0x0257
            int r6 = q.g.c(r7)
            switch(r6) {
                case 0: goto L_0x0218;
                case 1: goto L_0x01d7;
                case 2: goto L_0x0194;
                case 3: goto L_0x014f;
                case 4: goto L_0x013b;
                case 5: goto L_0x0127;
                case 6: goto L_0x0112;
                case 7: goto L_0x00fb;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            goto L_0x02f9
        L_0x00fb:
            r17 = 1
            r18 = 1
            r10 = r5
            r11 = r4
            r6 = r12
            r12 = r2
            r9 = r13
            r13 = r15
            r14 = r9
            r7 = r15
            r15 = r3
            r16 = r6
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18)
            ac.d.c(r4, r7, r6)
            goto L_0x02f9
        L_0x0112:
            r6 = r12
            r7 = r15
            r17 = 1
            r18 = 1
            r10 = r5
            r11 = r4
            r12 = r1
            r13 = r7
            r15 = r3
            r16 = r6
            r10.d(r11, r12, r13, r14, r15, r16, r17, r18)
            ac.d.f(r4, r7, r6)
            goto L_0x02f9
        L_0x0127:
            r6 = r12
            r7 = r15
            r16 = 1
            r17 = 1
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r7
            r14 = r3
            r15 = r6
            r10.e(r11, r12, r13, r14, r15, r16, r17)
            ac.d.c(r4, r7, r6)
            goto L_0x02f9
        L_0x013b:
            r6 = r12
            r7 = r15
            r16 = 1
            r17 = 1
            r10 = r5
            r11 = r4
            r12 = r1
            r13 = r7
            r14 = r3
            r15 = r6
            r10.b(r11, r12, r13, r14, r15, r16, r17)
            ac.d.f(r4, r7, r6)
            goto L_0x02f9
        L_0x014f:
            r6 = r12
            r9 = r13
            r7 = r15
            float r10 = r4.left
            float r11 = r4.top
            float r10 = r1 - r10
            float r11 = r2 - r11
            float r10 = r10 / r11
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x017a
            r17 = 0
            r18 = 1
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r7
            r14 = r9
            r15 = r3
            r16 = r6
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18)
            float r1 = r4.left
            float r2 = r4.height()
            float r2 = r2 * r6
            float r2 = r2 + r1
            r4.right = r2
            goto L_0x02f9
        L_0x017a:
            r17 = 0
            r18 = 1
            r10 = r5
            r11 = r4
            r12 = r1
            r13 = r7
            r15 = r3
            r16 = r6
            r10.d(r11, r12, r13, r14, r15, r16, r17, r18)
            float r1 = r4.top
            float r2 = r4.width()
            float r2 = r2 / r6
            float r2 = r2 + r1
            r4.bottom = r2
            goto L_0x02f9
        L_0x0194:
            r6 = r12
            r9 = r13
            r7 = r15
            float r10 = r4.top
            float r11 = r4.right
            float r11 = r11 - r1
            float r10 = r2 - r10
            float r11 = r11 / r10
            int r10 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x01be
            r17 = 1
            r18 = 0
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r7
            r14 = r9
            r15 = r3
            r16 = r6
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18)
            float r1 = r4.right
            float r2 = r4.height()
            float r2 = r2 * r6
            float r1 = r1 - r2
            r4.left = r1
            goto L_0x02f9
        L_0x01be:
            r16 = 0
            r17 = 1
            r10 = r5
            r11 = r4
            r12 = r1
            r13 = r7
            r14 = r3
            r15 = r6
            r10.b(r11, r12, r13, r14, r15, r16, r17)
            float r1 = r4.top
            float r2 = r4.width()
            float r2 = r2 / r6
            float r2 = r2 + r1
            r4.bottom = r2
            goto L_0x02f9
        L_0x01d7:
            r6 = r12
            r7 = r15
            float r9 = r4.left
            float r10 = r4.bottom
            float r9 = r1 - r9
            float r10 = r10 - r2
            float r9 = r9 / r10
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x01fe
            r16 = 0
            r17 = 1
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r7
            r14 = r3
            r15 = r6
            r10.e(r11, r12, r13, r14, r15, r16, r17)
            float r1 = r4.left
            float r2 = r4.height()
            float r2 = r2 * r6
            float r2 = r2 + r1
            r4.right = r2
            goto L_0x02f9
        L_0x01fe:
            r17 = 1
            r18 = 0
            r10 = r5
            r11 = r4
            r12 = r1
            r13 = r7
            r15 = r3
            r16 = r6
            r10.d(r11, r12, r13, r14, r15, r16, r17, r18)
            float r1 = r4.bottom
            float r2 = r4.width()
            float r2 = r2 / r6
            float r1 = r1 - r2
            r4.top = r1
            goto L_0x02f9
        L_0x0218:
            r6 = r12
            r7 = r15
            float r9 = r4.right
            float r10 = r4.bottom
            float r9 = r9 - r1
            float r10 = r10 - r2
            float r9 = r9 / r10
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x023e
            r16 = 1
            r17 = 0
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r7
            r14 = r3
            r15 = r6
            r10.e(r11, r12, r13, r14, r15, r16, r17)
            float r1 = r4.right
            float r2 = r4.height()
            float r2 = r2 * r6
            float r1 = r1 - r2
            r4.left = r1
            goto L_0x02f9
        L_0x023e:
            r16 = 1
            r17 = 0
            r10 = r5
            r11 = r4
            r12 = r1
            r13 = r7
            r14 = r3
            r15 = r6
            r10.b(r11, r12, r13, r14, r15, r16, r17)
            float r1 = r4.bottom
            float r2 = r4.width()
            float r2 = r2 / r6
            float r1 = r1 - r2
            r4.top = r1
            goto L_0x02f9
        L_0x0257:
            r9 = r13
            r6 = r15
            int r7 = q.g.c(r7)
            switch(r7) {
                case 0: goto L_0x02e8;
                case 1: goto L_0x02cf;
                case 2: goto L_0x02b7;
                case 3: goto L_0x02a1;
                case 4: goto L_0x0292;
                case 5: goto L_0x0283;
                case 6: goto L_0x0273;
                case 7: goto L_0x0262;
                default: goto L_0x0260;
            }
        L_0x0260:
            goto L_0x02f9
        L_0x0262:
            r16 = 0
            r17 = 0
            r18 = 0
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r6
            r14 = r9
            r15 = r3
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02f9
        L_0x0273:
            r16 = 0
            r17 = 0
            r18 = 0
            r10 = r5
            r11 = r4
            r12 = r1
            r13 = r6
            r15 = r3
            r10.d(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02f9
        L_0x0283:
            r15 = 0
            r16 = 0
            r17 = 0
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r6
            r14 = r3
            r10.e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02f9
        L_0x0292:
            r15 = 0
            r16 = 0
            r17 = 0
            r10 = r5
            r11 = r4
            r12 = r1
            r13 = r6
            r14 = r3
            r10.b(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02f9
        L_0x02a1:
            r16 = 0
            r17 = 0
            r18 = 0
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r6
            r7 = r14
            r14 = r9
            r15 = r3
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18)
            r12 = r1
            r14 = r7
            r10.d(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02f9
        L_0x02b7:
            r16 = 0
            r17 = 0
            r18 = 0
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r6
            r14 = r9
            r15 = r3
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18)
            r15 = 0
            r16 = 0
            r12 = r1
            r14 = r3
            r10.b(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02f9
        L_0x02cf:
            r7 = r14
            r15 = 0
            r16 = 0
            r17 = 0
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r6
            r14 = r3
            r10.e(r11, r12, r13, r14, r15, r16, r17)
            r16 = 0
            r18 = 0
            r12 = r1
            r14 = r7
            r15 = r3
            r10.d(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02f9
        L_0x02e8:
            r15 = 0
            r16 = 0
            r17 = 0
            r10 = r5
            r11 = r4
            r12 = r2
            r13 = r6
            r14 = r3
            r10.e(r11, r12, r13, r14, r15, r16, r17)
            r12 = r1
            r10.b(r11, r12, r13, r14, r15, r16, r17)
        L_0x02f9:
            android.graphics.RectF r1 = r8.f6634a
            r1.set(r4)
            r1 = 1
            r0.b(r1)
            r20.invalidate()
            goto L_0x0307
        L_0x0306:
            r1 = r7
        L_0x0307:
            android.view.ViewParent r2 = r20.getParent()
            r2.requestDisallowInterceptTouchEvent(r1)
            return r1
        L_0x030f:
            r1 = r7
            android.view.ViewParent r3 = r20.getParent()
            r3.requestDisallowInterceptTouchEvent(r2)
            ac.d r3 = r0.Q
            if (r3 == 0) goto L_0x0323
            r0.Q = r6
            r0.b(r2)
            r20.invalidate()
        L_0x0323:
            return r1
        L_0x0324:
            float r1 = r21.getX()
            float r3 = r21.getY()
            float r7 = r0.O
            com.lassi.presentation.cropper.CropImageView$c r10 = r0.W
            com.lassi.presentation.cropper.CropImageView$c r11 = com.lassi.presentation.cropper.CropImageView.c.f6552b
            android.graphics.RectF r12 = r8.f6634a
            if (r10 != r11) goto L_0x037a
            float r2 = r12.width()
            r7 = 1086324736(0x40c00000, float:6.0)
            float r2 = r2 / r7
            float r10 = r12.left
            float r11 = r10 + r2
            r13 = 1084227584(0x40a00000, float:5.0)
            float r2 = r2 * r13
            float r2 = r2 + r10
            float r10 = r12.height()
            float r10 = r10 / r7
            float r7 = r12.top
            float r12 = r7 + r10
            float r10 = r10 * r13
            float r10 = r10 + r7
            int r7 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x035f
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0359
            goto L_0x0384
        L_0x0359:
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x039e
            goto L_0x044a
        L_0x035f:
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x036f
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0369
            goto L_0x0409
        L_0x0369:
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0429
            goto L_0x04a3
        L_0x036f:
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0374
            goto L_0x0391
        L_0x0374:
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x03ab
            goto L_0x0469
        L_0x037a:
            float r10 = r12.left
            float r11 = r12.top
            boolean r10 = com.lassi.presentation.cropper.e.b(r1, r3, r10, r11, r7)
            if (r10 == 0) goto L_0x0387
        L_0x0384:
            r2 = 1
            goto L_0x04a4
        L_0x0387:
            float r10 = r12.right
            float r11 = r12.top
            boolean r10 = com.lassi.presentation.cropper.e.b(r1, r3, r10, r11, r7)
            if (r10 == 0) goto L_0x0394
        L_0x0391:
            r2 = r4
            goto L_0x04a4
        L_0x0394:
            float r4 = r12.left
            float r10 = r12.bottom
            boolean r4 = com.lassi.presentation.cropper.e.b(r1, r3, r4, r10, r7)
            if (r4 == 0) goto L_0x03a1
        L_0x039e:
            r2 = r5
            goto L_0x04a4
        L_0x03a1:
            float r4 = r12.right
            float r5 = r12.bottom
            boolean r4 = com.lassi.presentation.cropper.e.b(r1, r3, r4, r5, r7)
            if (r4 == 0) goto L_0x03ae
        L_0x03ab:
            r2 = 4
            goto L_0x04a4
        L_0x03ae:
            float r4 = r12.left
            float r5 = r12.top
            float r10 = r12.right
            float r11 = r12.bottom
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x03c8
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x03c8
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x03c8
            int r4 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x03c8
            r4 = 1
            goto L_0x03c9
        L_0x03c8:
            r4 = r2
        L_0x03c9:
            r5 = 1120403456(0x42c80000, float:100.0)
            android.graphics.RectF r10 = r8.f6634a
            if (r4 == 0) goto L_0x03ec
            float r4 = r10.width()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x03e3
            float r4 = r10.height()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x03e3
            r4 = 1
            r19 = 1
            goto L_0x03e6
        L_0x03e3:
            r19 = r2
            r4 = 1
        L_0x03e6:
            r11 = r19 ^ 1
            if (r11 == 0) goto L_0x03ec
            goto L_0x04a3
        L_0x03ec:
            float r4 = r12.left
            float r11 = r12.right
            float r13 = r12.top
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0406
            int r4 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0406
            float r4 = r3 - r13
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0406
            r4 = 1
            goto L_0x0407
        L_0x0406:
            r4 = r2
        L_0x0407:
            if (r4 == 0) goto L_0x040c
        L_0x0409:
            r2 = 6
            goto L_0x04a4
        L_0x040c:
            float r4 = r12.left
            float r11 = r12.right
            float r13 = r12.bottom
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0426
            int r4 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0426
            float r4 = r3 - r13
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0426
            r4 = 1
            goto L_0x0427
        L_0x0426:
            r4 = r2
        L_0x0427:
            if (r4 == 0) goto L_0x042d
        L_0x0429:
            r2 = 8
            goto L_0x04a4
        L_0x042d:
            float r4 = r12.left
            float r11 = r12.top
            float r13 = r12.bottom
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0447
            int r4 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0447
            int r4 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0447
            r4 = 1
            goto L_0x0448
        L_0x0447:
            r4 = r2
        L_0x0448:
            if (r4 == 0) goto L_0x044c
        L_0x044a:
            r2 = 5
            goto L_0x04a4
        L_0x044c:
            float r4 = r12.right
            float r11 = r12.top
            float r13 = r12.bottom
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0466
            int r4 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0466
            int r4 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0466
            r4 = 1
            goto L_0x0467
        L_0x0466:
            r4 = r2
        L_0x0467:
            if (r4 == 0) goto L_0x046b
        L_0x0469:
            r2 = 7
            goto L_0x04a4
        L_0x046b:
            float r4 = r12.left
            float r7 = r12.top
            float r11 = r12.right
            float r12 = r12.bottom
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0485
            int r4 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0485
            int r4 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0485
            int r4 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0485
            r4 = 1
            goto L_0x0486
        L_0x0485:
            r4 = r2
        L_0x0486:
            if (r4 == 0) goto L_0x04a4
            float r4 = r10.width()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x049c
            float r4 = r10.height()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x049c
            r4 = 1
            r19 = 1
            goto L_0x049f
        L_0x049c:
            r19 = r2
            r4 = 1
        L_0x049f:
            r5 = r19 ^ 1
            if (r5 != 0) goto L_0x04a4
        L_0x04a3:
            r2 = r9
        L_0x04a4:
            if (r2 == 0) goto L_0x04ab
            ac.d r6 = new ac.d
            r6.<init>(r2, r8, r1, r3)
        L_0x04ab:
            r0.Q = r6
            if (r6 == 0) goto L_0x04b2
            r20.invalidate()
        L_0x04b2:
            r1 = 1
            return r1
        L_0x04b4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cropper.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAspectRatioX(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.S != i8) {
            this.S = i8;
            this.U = ((float) i8) / ((float) this.T);
            if (this.f6561a0) {
                f();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.T != i8) {
            this.T = i8;
            this.U = ((float) this.S) / ((float) i8);
            if (this.f6561a0) {
                f();
                invalidate();
            }
        }
    }

    public void setCropShape(CropImageView.c cVar) {
        if (this.W != cVar) {
            this.W = cVar;
            invalidate();
        }
    }

    public void setCropWindowChangeListener(a aVar) {
        this.D = aVar;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f6560a.f6634a.set(rectF);
    }

    public void setFixedAspectRatio(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            if (this.f6561a0) {
                f();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.d dVar) {
        if (this.V != dVar) {
            this.V = dVar;
            if (this.f6561a0) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(d dVar) {
        e eVar = this.f6560a;
        eVar.getClass();
        eVar.f6636c = (float) dVar.T;
        eVar.f6637d = (float) dVar.U;
        eVar.f6640g = (float) dVar.V;
        eVar.f6641h = (float) dVar.W;
        eVar.f6642i = (float) dVar.X;
        eVar.f6643j = (float) dVar.Y;
        setCropShape(dVar.f6611a);
        setSnapRadius(dVar.f6613b);
        setGuidelines(dVar.f6617d);
        setFixedAspectRatio(dVar.H);
        setAspectRatioX(dVar.I);
        setAspectRatioY(dVar.J);
        h(dVar.E);
        this.O = dVar.f6615c;
        this.N = dVar.G;
        this.E = e(dVar.L, dVar.K);
        this.L = dVar.N;
        this.M = dVar.O;
        this.F = e(dVar.P, dVar.M);
        this.G = e(dVar.R, dVar.Q);
        int i8 = dVar.S;
        Paint paint = new Paint();
        paint.setColor(i8);
        this.H = paint;
    }

    public void setInitialCropWindowRect(Rect rect) {
        if (rect == null) {
            rect = c.f6599a;
        }
        this.f6565e.set(rect);
        if (this.f6561a0) {
            f();
            invalidate();
            b(false);
        }
    }

    public void setSnapRadius(float f10) {
        this.P = f10;
    }
}
