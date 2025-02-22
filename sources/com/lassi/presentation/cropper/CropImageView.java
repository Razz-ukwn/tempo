package com.lassi.presentation.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.lassi.presentation.cropper.CropOverlayView;
import java.io.File;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.UUID;

public class CropImageView extends FrameLayout {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f6535i0 = 0;
    public final float[] B = new float[8];
    public final float[] C = new float[8];
    public ac.c D;
    public Bitmap E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public j M;
    public boolean N = false;
    public boolean O = true;
    public boolean P = true;
    public boolean Q = true;
    public int R;
    public i S;
    public e T;
    public Uri U;
    public int V = 1;
    public float W = 1.0f;

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f6536a;

    /* renamed from: a0  reason: collision with root package name */
    public float f6537a0;

    /* renamed from: b  reason: collision with root package name */
    public final CropOverlayView f6538b;

    /* renamed from: b0  reason: collision with root package name */
    public float f6539b0;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f6540c = new Matrix();

    /* renamed from: c0  reason: collision with root package name */
    public RectF f6541c0;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f6542d = new Matrix();

    /* renamed from: d0  reason: collision with root package name */
    public int f6543d0;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f6544e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f6545e0;

    /* renamed from: f0  reason: collision with root package name */
    public Uri f6546f0;

    /* renamed from: g0  reason: collision with root package name */
    public WeakReference<b> f6547g0;

    /* renamed from: h0  reason: collision with root package name */
    public WeakReference<a> f6548h0;

    public class a implements CropOverlayView.a {
        public a() {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f6550a;

        public b(Uri uri, Exception exc, int i8) {
            this.f6550a = uri;
        }
    }

    public enum c {
        f6551a,
        f6552b;

        /* access modifiers changed from: public */
        c() {
        }
    }

    public enum d {
        f6554a,
        f6555b;

        /* access modifiers changed from: public */
        d() {
        }
    }

    public interface e {
        void r(CropImageView cropImageView, b bVar);
    }

    public interface f {
    }

    public interface g {
    }

    public interface h {
    }

    public interface i {
        void m(CropImageView cropImageView, Uri uri, Exception exc);
    }

    public enum j {
        f6557a,
        f6558b;

        /* access modifiers changed from: public */
        j() {
        }
    }

    /* JADX WARNING: type inference failed for: r3v41, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CropImageView(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            r8.<init>(r9, r10)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r8.f6540c = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r8.f6542d = r0
            r0 = 8
            float[] r1 = new float[r0]
            r8.B = r1
            float[] r1 = new float[r0]
            r8.C = r1
            r1 = 0
            r8.N = r1
            r2 = 1
            r8.O = r2
            r8.P = r2
            r8.Q = r2
            r8.V = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r8.W = r3
            boolean r3 = r9 instanceof android.app.Activity
            r4 = 0
            if (r3 == 0) goto L_0x0038
            r3 = r9
            android.app.Activity r3 = (android.app.Activity) r3
            android.content.Intent r3 = r3.getIntent()
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            if (r3 == 0) goto L_0x004c
            java.lang.String r5 = "CROP_IMAGE_EXTRA_BUNDLE"
            android.os.Bundle r3 = r3.getBundleExtra(r5)
            if (r3 == 0) goto L_0x004c
            java.lang.String r4 = "CROP_IMAGE_EXTRA_OPTIONS"
            android.os.Parcelable r3 = r3.getParcelable(r4)
            r4 = r3
            com.lassi.presentation.cropper.d r4 = (com.lassi.presentation.cropper.d) r4
        L_0x004c:
            if (r4 != 0) goto L_0x01dc
            com.lassi.presentation.cropper.d r4 = new com.lassi.presentation.cropper.d
            r4.<init>()
            if (r10 == 0) goto L_0x01dc
            int[] r3 = cb.c.f3889e
            android.content.res.TypedArray r10 = r9.obtainStyledAttributes(r10, r3, r1, r1)
            boolean r3 = r4.H     // Catch:{ all -> 0x01d7 }
            r5 = 10
            boolean r3 = r10.getBoolean(r5, r3)     // Catch:{ all -> 0x01d7 }
            r4.H = r3     // Catch:{ all -> 0x01d7 }
            int r3 = r4.I     // Catch:{ all -> 0x01d7 }
            int r3 = r10.getInteger(r1, r3)     // Catch:{ all -> 0x01d7 }
            r4.I = r3     // Catch:{ all -> 0x01d7 }
            int r3 = r4.J     // Catch:{ all -> 0x01d7 }
            int r3 = r10.getInteger(r2, r3)     // Catch:{ all -> 0x01d7 }
            r4.J = r3     // Catch:{ all -> 0x01d7 }
            com.lassi.presentation.cropper.CropImageView$j[] r3 = com.lassi.presentation.cropper.CropImageView.j.values()     // Catch:{ all -> 0x01d7 }
            com.lassi.presentation.cropper.CropImageView$j r6 = r4.f6619e     // Catch:{ all -> 0x01d7 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01d7 }
            r7 = 26
            int r6 = r10.getInt(r7, r6)     // Catch:{ all -> 0x01d7 }
            r3 = r3[r6]     // Catch:{ all -> 0x01d7 }
            r4.f6619e = r3     // Catch:{ all -> 0x01d7 }
            boolean r3 = r4.D     // Catch:{ all -> 0x01d7 }
            r6 = 2
            boolean r3 = r10.getBoolean(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.D = r3     // Catch:{ all -> 0x01d7 }
            boolean r3 = r4.E     // Catch:{ all -> 0x01d7 }
            r6 = 24
            boolean r3 = r10.getBoolean(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.E = r3     // Catch:{ all -> 0x01d7 }
            int r3 = r4.F     // Catch:{ all -> 0x01d7 }
            r6 = 19
            int r3 = r10.getInteger(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.F = r3     // Catch:{ all -> 0x01d7 }
            com.lassi.presentation.cropper.CropImageView$c[] r3 = com.lassi.presentation.cropper.CropImageView.c.values()     // Catch:{ all -> 0x01d7 }
            com.lassi.presentation.cropper.CropImageView$c r6 = r4.f6611a     // Catch:{ all -> 0x01d7 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01d7 }
            r7 = 27
            int r6 = r10.getInt(r7, r6)     // Catch:{ all -> 0x01d7 }
            r3 = r3[r6]     // Catch:{ all -> 0x01d7 }
            r4.f6611a = r3     // Catch:{ all -> 0x01d7 }
            com.lassi.presentation.cropper.CropImageView$d[] r3 = com.lassi.presentation.cropper.CropImageView.d.values()     // Catch:{ all -> 0x01d7 }
            com.lassi.presentation.cropper.CropImageView$d r6 = r4.f6617d     // Catch:{ all -> 0x01d7 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01d7 }
            r7 = 13
            int r6 = r10.getInt(r7, r6)     // Catch:{ all -> 0x01d7 }
            r3 = r3[r6]     // Catch:{ all -> 0x01d7 }
            r4.f6617d = r3     // Catch:{ all -> 0x01d7 }
            float r3 = r4.f6613b     // Catch:{ all -> 0x01d7 }
            r6 = 30
            float r3 = r10.getDimension(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.f6613b = r3     // Catch:{ all -> 0x01d7 }
            float r3 = r4.f6615c     // Catch:{ all -> 0x01d7 }
            r6 = 31
            float r3 = r10.getDimension(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.f6615c = r3     // Catch:{ all -> 0x01d7 }
            float r3 = r4.G     // Catch:{ all -> 0x01d7 }
            r6 = 16
            float r3 = r10.getFloat(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.G = r3     // Catch:{ all -> 0x01d7 }
            float r3 = r4.K     // Catch:{ all -> 0x01d7 }
            r6 = 9
            float r3 = r10.getDimension(r6, r3)     // Catch:{ all -> 0x01d7 }
            r4.K = r3     // Catch:{ all -> 0x01d7 }
            int r3 = r4.L     // Catch:{ all -> 0x01d7 }
            int r0 = r10.getInteger(r0, r3)     // Catch:{ all -> 0x01d7 }
            r4.L = r0     // Catch:{ all -> 0x01d7 }
            float r0 = r4.M     // Catch:{ all -> 0x01d7 }
            r3 = 7
            float r0 = r10.getDimension(r3, r0)     // Catch:{ all -> 0x01d7 }
            r4.M = r0     // Catch:{ all -> 0x01d7 }
            float r0 = r4.N     // Catch:{ all -> 0x01d7 }
            r6 = 6
            float r0 = r10.getDimension(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.N = r0     // Catch:{ all -> 0x01d7 }
            float r0 = r4.O     // Catch:{ all -> 0x01d7 }
            r6 = 5
            float r0 = r10.getDimension(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.O = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.P     // Catch:{ all -> 0x01d7 }
            r6 = 4
            int r0 = r10.getInteger(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.P = r0     // Catch:{ all -> 0x01d7 }
            float r0 = r4.Q     // Catch:{ all -> 0x01d7 }
            r6 = 15
            float r0 = r10.getDimension(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.Q = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.R     // Catch:{ all -> 0x01d7 }
            r6 = 14
            int r0 = r10.getInteger(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.R = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.S     // Catch:{ all -> 0x01d7 }
            r6 = 3
            int r0 = r10.getInteger(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.S = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r8.O     // Catch:{ all -> 0x01d7 }
            r6 = 28
            boolean r0 = r10.getBoolean(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.B = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r8.P     // Catch:{ all -> 0x01d7 }
            r6 = 29
            boolean r0 = r10.getBoolean(r6, r0)     // Catch:{ all -> 0x01d7 }
            r4.C = r0     // Catch:{ all -> 0x01d7 }
            float r0 = r4.M     // Catch:{ all -> 0x01d7 }
            float r0 = r10.getDimension(r3, r0)     // Catch:{ all -> 0x01d7 }
            r4.M = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.T     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 23
            float r0 = r10.getDimension(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.T = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.U     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 22
            float r0 = r10.getDimension(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.U = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.V     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 21
            float r0 = r10.getFloat(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.V = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.W     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 20
            float r0 = r10.getFloat(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.W = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.X     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 18
            float r0 = r10.getFloat(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.X = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r4.Y     // Catch:{ all -> 0x01d7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d7 }
            r3 = 17
            float r0 = r10.getFloat(r3, r0)     // Catch:{ all -> 0x01d7 }
            int r0 = (int) r0     // Catch:{ all -> 0x01d7 }
            r4.Y = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r4.f6630o0     // Catch:{ all -> 0x01d7 }
            r3 = 11
            boolean r0 = r10.getBoolean(r3, r0)     // Catch:{ all -> 0x01d7 }
            r4.f6630o0 = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r4.f6631p0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r10.getBoolean(r3, r0)     // Catch:{ all -> 0x01d7 }
            r4.f6631p0 = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r8.N     // Catch:{ all -> 0x01d7 }
            r3 = 25
            boolean r0 = r10.getBoolean(r3, r0)     // Catch:{ all -> 0x01d7 }
            r8.N = r0     // Catch:{ all -> 0x01d7 }
            boolean r0 = r10.hasValue(r1)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r10.hasValue(r1)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r10.hasValue(r5)     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x01d3
            r4.H = r2     // Catch:{ all -> 0x01d7 }
        L_0x01d3:
            r10.recycle()
            goto L_0x01dc
        L_0x01d7:
            r9 = move-exception
            r10.recycle()
            throw r9
        L_0x01dc:
            r4.a()
            com.lassi.presentation.cropper.CropImageView$j r10 = r4.f6619e
            r8.M = r10
            boolean r10 = r4.D
            r8.Q = r10
            int r10 = r4.F
            r8.R = r10
            boolean r10 = r4.B
            r8.O = r10
            boolean r10 = r4.C
            r8.P = r10
            boolean r10 = r4.f6630o0
            r8.H = r10
            boolean r10 = r4.f6631p0
            r8.I = r10
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r10 = 2131492934(0x7f0c0046, float:1.8609334E38)
            android.view.View r9 = r9.inflate(r10, r8, r2)
            r10 = 2131296288(0x7f090020, float:1.8210488E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r8.f6536a = r10
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r0)
            r10 = 2131296269(0x7f09000d, float:1.821045E38)
            android.view.View r10 = r9.findViewById(r10)
            com.lassi.presentation.cropper.CropOverlayView r10 = (com.lassi.presentation.cropper.CropOverlayView) r10
            r8.f6538b = r10
            com.lassi.presentation.cropper.CropImageView$a r0 = new com.lassi.presentation.cropper.CropImageView$a
            r0.<init>()
            r10.setCropWindowChangeListener(r0)
            r10.setInitialAttributeValues(r4)
            r10 = 2131296270(0x7f09000e, float:1.8210452E38)
            android.view.View r9 = r9.findViewById(r10)
            android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
            r8.f6544e = r9
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(float f10, float f11, boolean z10, boolean z11) {
        if (this.E != null) {
            float f12 = 0.0f;
            if (f10 > 0.0f && f11 > 0.0f) {
                Matrix matrix = this.f6540c;
                Matrix matrix2 = this.f6542d;
                matrix.invert(matrix2);
                CropOverlayView cropOverlayView = this.f6538b;
                RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                matrix2.mapRect(cropWindowRect);
                matrix.reset();
                matrix.postTranslate((f10 - ((float) this.E.getWidth())) / 2.0f, (f11 - ((float) this.E.getHeight())) / 2.0f);
                d();
                int i8 = this.G;
                float[] fArr = this.B;
                if (i8 > 0) {
                    matrix.postRotate((float) i8, (c.o(fArr) + c.p(fArr)) / 2.0f, (c.q(fArr) + c.m(fArr)) / 2.0f);
                    d();
                }
                float min = Math.min(f10 / (c.p(fArr) - c.o(fArr)), f11 / (c.m(fArr) - c.q(fArr)));
                j jVar = this.M;
                if (jVar == j.f6557a || ((jVar == j.f6558b && min < 1.0f) || (min > 1.0f && this.Q))) {
                    matrix.postScale(min, min, (c.o(fArr) + c.p(fArr)) / 2.0f, (c.q(fArr) + c.m(fArr)) / 2.0f);
                    d();
                }
                float f13 = this.H ? -this.W : this.W;
                float f14 = this.I ? -this.W : this.W;
                matrix.postScale(f13, f14, (c.o(fArr) + c.p(fArr)) / 2.0f, (c.q(fArr) + c.m(fArr)) / 2.0f);
                d();
                matrix.mapRect(cropWindowRect);
                if (z10) {
                    this.f6537a0 = f10 > c.p(fArr) - c.o(fArr) ? 0.0f : Math.max(Math.min((f10 / 2.0f) - cropWindowRect.centerX(), -c.o(fArr)), ((float) getWidth()) - c.p(fArr)) / f13;
                    if (f11 <= c.m(fArr) - c.q(fArr)) {
                        f12 = Math.max(Math.min((f11 / 2.0f) - cropWindowRect.centerY(), -c.q(fArr)), ((float) getHeight()) - c.m(fArr)) / f14;
                    }
                    this.f6539b0 = f12;
                } else {
                    this.f6537a0 = Math.min(Math.max(this.f6537a0 * f13, -cropWindowRect.left), (-cropWindowRect.right) + f10) / f13;
                    this.f6539b0 = Math.min(Math.max(this.f6539b0 * f14, -cropWindowRect.top), (-cropWindowRect.bottom) + f11) / f14;
                }
                matrix.postTranslate(this.f6537a0 * f13, this.f6539b0 * f14);
                cropWindowRect.offset(this.f6537a0 * f13, this.f6539b0 * f14);
                cropOverlayView.setCropWindowRect(cropWindowRect);
                d();
                cropOverlayView.invalidate();
                ImageView imageView = this.f6536a;
                if (z11) {
                    ac.c cVar = this.D;
                    System.arraycopy(fArr, 0, cVar.f286d, 0, 8);
                    cVar.B.set(cVar.f284b.getCropWindowRect());
                    matrix.getValues(cVar.D);
                    imageView.startAnimation(this.D);
                } else {
                    imageView.setImageMatrix(matrix);
                }
                j(false);
            }
        }
    }

    public final void b() {
        Bitmap bitmap = this.E;
        if (bitmap != null && (this.L > 0 || this.U != null)) {
            bitmap.recycle();
        }
        this.E = null;
        this.L = 0;
        this.U = null;
        this.V = 1;
        this.G = 0;
        this.W = 1.0f;
        this.f6537a0 = 0.0f;
        this.f6539b0 = 0.0f;
        this.f6540c.reset();
        this.f6546f0 = null;
        this.f6536a.setImageBitmap((Bitmap) null);
        g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r13, boolean r14) {
        /*
            r12 = this;
            int r0 = r12.getWidth()
            int r1 = r12.getHeight()
            android.graphics.Bitmap r2 = r12.E
            if (r2 == 0) goto L_0x010c
            if (r0 <= 0) goto L_0x010c
            if (r1 <= 0) goto L_0x010c
            com.lassi.presentation.cropper.CropOverlayView r2 = r12.f6538b
            android.graphics.RectF r3 = r2.getCropWindowRect()
            r4 = 0
            r5 = 0
            if (r13 == 0) goto L_0x003b
            float r13 = r3.left
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x0034
            float r13 = r3.top
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x0034
            float r13 = r3.right
            float r14 = (float) r0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x0034
            float r13 = r3.bottom
            float r14 = (float) r1
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x010c
        L_0x0034:
            float r13 = (float) r0
            float r14 = (float) r1
            r12.a(r13, r14, r4, r4)
            goto L_0x010c
        L_0x003b:
            boolean r13 = r12.Q
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r13 != 0) goto L_0x0047
            float r13 = r12.W
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x010c
        L_0x0047:
            float r13 = r12.W
            int r7 = r12.R
            float r7 = (float) r7
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 >= 0) goto L_0x0088
            float r13 = r3.width()
            float r7 = (float) r0
            r8 = 1056964608(0x3f000000, float:0.5)
            float r9 = r7 * r8
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x0088
            float r13 = r3.height()
            float r9 = (float) r1
            float r8 = r8 * r9
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x0088
            int r13 = r12.R
            float r13 = (float) r13
            float r8 = r3.width()
            float r10 = r12.W
            float r8 = r8 / r10
            r10 = 1059313418(0x3f23d70a, float:0.64)
            float r8 = r8 / r10
            float r7 = r7 / r8
            float r8 = r3.height()
            float r11 = r12.W
            float r8 = r8 / r11
            float r8 = r8 / r10
            float r9 = r9 / r8
            float r7 = java.lang.Math.min(r7, r9)
            float r13 = java.lang.Math.min(r13, r7)
            goto L_0x0089
        L_0x0088:
            r13 = r5
        L_0x0089:
            float r7 = r12.W
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c5
            float r7 = r3.width()
            float r8 = (float) r0
            r9 = 1059481190(0x3f266666, float:0.65)
            float r10 = r8 * r9
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x00a7
            float r7 = r3.height()
            float r10 = (float) r1
            float r10 = r10 * r9
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c5
        L_0x00a7:
            float r13 = r3.width()
            float r7 = r12.W
            float r13 = r13 / r7
            r7 = 1057132380(0x3f028f5c, float:0.51)
            float r13 = r13 / r7
            float r8 = r8 / r13
            float r13 = (float) r1
            float r3 = r3.height()
            float r9 = r12.W
            float r3 = r3 / r9
            float r3 = r3 / r7
            float r13 = r13 / r3
            float r13 = java.lang.Math.min(r8, r13)
            float r13 = java.lang.Math.max(r6, r13)
        L_0x00c5:
            boolean r3 = r12.Q
            if (r3 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r6 = r13
        L_0x00cb:
            int r13 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x010c
            float r13 = r12.W
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x010c
            if (r14 == 0) goto L_0x0104
            ac.c r13 = r12.D
            if (r13 != 0) goto L_0x00e4
            ac.c r13 = new ac.c
            android.widget.ImageView r3 = r12.f6536a
            r13.<init>(r3, r2)
            r12.D = r13
        L_0x00e4:
            ac.c r13 = r12.D
            android.graphics.Matrix r2 = r12.f6540c
            r13.reset()
            float[] r3 = r13.f285c
            r5 = 8
            float[] r7 = r12.B
            java.lang.System.arraycopy(r7, r4, r3, r4, r5)
            android.graphics.RectF r3 = r13.f287e
            com.lassi.presentation.cropper.CropOverlayView r4 = r13.f284b
            android.graphics.RectF r4 = r4.getCropWindowRect()
            r3.set(r4)
            float[] r13 = r13.C
            r2.getValues(r13)
        L_0x0104:
            r12.W = r6
            float r13 = (float) r0
            float r0 = (float) r1
            r1 = 1
            r12.a(r13, r0, r1, r14)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cropper.CropImageView.c(boolean, boolean):void");
    }

    public final void d() {
        float[] fArr = this.B;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = (float) this.E.getWidth();
        fArr[3] = 0.0f;
        fArr[4] = (float) this.E.getWidth();
        fArr[5] = (float) this.E.getHeight();
        fArr[6] = 0.0f;
        fArr[7] = (float) this.E.getHeight();
        Matrix matrix = this.f6540c;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.C;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 100.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 100.0f;
        fArr2[5] = 100.0f;
        fArr2[6] = 0.0f;
        fArr2[7] = 100.0f;
        matrix.mapPoints(fArr2);
    }

    public final void e(int i8) {
        int i10 = i8;
        if (this.E != null) {
            int i11 = i10 < 0 ? (i10 % 360) + 360 : i10 % 360;
            CropOverlayView cropOverlayView = this.f6538b;
            boolean z10 = !cropOverlayView.R && ((i11 > 45 && i11 < 135) || (i11 > 215 && i11 < 305));
            RectF rectF = c.f6602d;
            rectF.set(cropOverlayView.getCropWindowRect());
            float height = (z10 ? rectF.height() : rectF.width()) / 2.0f;
            float width = (z10 ? rectF.width() : rectF.height()) / 2.0f;
            if (z10) {
                boolean z11 = this.H;
                this.H = this.I;
                this.I = z11;
            }
            Matrix matrix = this.f6540c;
            Matrix matrix2 = this.f6542d;
            matrix.invert(matrix2);
            float[] fArr = c.f6603e;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            matrix2.mapPoints(fArr);
            this.G = (this.G + i11) % 360;
            a((float) getWidth(), (float) getHeight(), true, false);
            float[] fArr2 = c.f6604f;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = (float) (((double) this.W) / Math.sqrt(Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d) + Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d)));
            this.W = sqrt;
            this.W = Math.max(sqrt, 1.0f);
            a((float) getWidth(), (float) getHeight(), true, false);
            matrix.mapPoints(fArr2, fArr);
            double sqrt2 = Math.sqrt(Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d) + Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d));
            float f10 = (float) (((double) height) * sqrt2);
            float f11 = (float) (((double) width) * sqrt2);
            float f12 = fArr2[0];
            float f13 = fArr2[1];
            rectF.set(f12 - f10, f13 - f11, f12 + f10, f13 + f11);
            if (cropOverlayView.f6561a0) {
                cropOverlayView.setCropWindowRect(c.f6600b);
                cropOverlayView.f();
                cropOverlayView.invalidate();
            }
            cropOverlayView.setCropWindowRect(rectF);
            a((float) getWidth(), (float) getHeight(), true, false);
            c(false, false);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.d(cropWindowRect);
            cropOverlayView.f6560a.f6634a.set(cropWindowRect);
        }
    }

    public final void f(Bitmap bitmap, int i8, Uri uri, int i10, int i11) {
        Bitmap bitmap2 = this.E;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            ImageView imageView = this.f6536a;
            imageView.clearAnimation();
            b();
            this.E = bitmap;
            imageView.setImageBitmap(bitmap);
            this.U = uri;
            this.L = i8;
            this.V = i10;
            this.G = i11;
            a((float) getWidth(), (float) getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f6538b;
            if (cropOverlayView != null) {
                if (cropOverlayView.f6561a0) {
                    cropOverlayView.setCropWindowRect(c.f6600b);
                    cropOverlayView.f();
                    cropOverlayView.invalidate();
                }
                g();
            }
        }
    }

    public final void g() {
        CropOverlayView cropOverlayView = this.f6538b;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.O || this.E == null) ? 4 : 0);
        }
    }

    public Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.f6538b;
        return new Pair<>(Integer.valueOf(cropOverlayView.getAspectRatioX()), Integer.valueOf(cropOverlayView.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f6538b.getCropWindowRect();
        float f10 = cropWindowRect.left;
        float f11 = cropWindowRect.top;
        float f12 = cropWindowRect.right;
        float f13 = cropWindowRect.bottom;
        float[] fArr = {f10, f11, f12, f11, f12, f13, f10, f13};
        Matrix matrix = this.f6540c;
        Matrix matrix2 = this.f6542d;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        for (int i8 = 0; i8 < 8; i8++) {
            fArr[i8] = fArr[i8] * ((float) this.V);
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i8 = this.V;
        Bitmap bitmap = this.E;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i8;
        int height = i8 * bitmap.getHeight();
        CropOverlayView cropOverlayView = this.f6538b;
        return c.n(cropPoints, width, height, cropOverlayView.R, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY());
    }

    public c getCropShape() {
        return this.f6538b.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f6538b;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        Bitmap bitmap;
        if (this.E == null) {
            return null;
        }
        this.f6536a.clearAnimation();
        Uri uri = this.U;
        CropOverlayView cropOverlayView = this.f6538b;
        if (uri == null || this.V <= 1) {
            bitmap = c.f(this.E, getCropPoints(), this.G, cropOverlayView.R, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), this.H, this.I).f6607a;
        } else {
            int width = this.E.getWidth() * this.V;
            int height = this.E.getHeight() * this.V;
            bitmap = c.d(getContext(), this.U, getCropPoints(), this.G, width, height, cropOverlayView.R, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), 0, 0, this.H, this.I).f6607a;
        }
        return c.r(bitmap, 0, 0, 1);
    }

    public void getCroppedImageAsync() {
        if (this.T != null) {
            i(0, 0, 0, (Bitmap.CompressFormat) null, (Uri) null, 1);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    public d getGuidelines() {
        return this.f6538b.getGuidelines();
    }

    public int getImageResource() {
        return this.L;
    }

    public Uri getImageUri() {
        return this.U;
    }

    public int getMaxZoom() {
        return this.R;
    }

    public int getRotatedDegrees() {
        return this.G;
    }

    public j getScaleType() {
        return this.M;
    }

    public Rect getWholeImageRect() {
        int i8 = this.V;
        Bitmap bitmap = this.E;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i8, bitmap.getHeight() * i8);
    }

    public final void h() {
        int i8 = 0;
        if (!(this.P && ((this.E == null && this.f6547g0 != null) || this.f6548h0 != null))) {
            i8 = 4;
        }
        this.f6544e.setVisibility(i8);
    }

    public final void i(int i8, int i10, int i11, Bitmap.CompressFormat compressFormat, Uri uri, int i12) {
        CropImageView cropImageView;
        int i13 = i12;
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            this.f6536a.clearAnimation();
            WeakReference<a> weakReference = this.f6548h0;
            a aVar = weakReference != null ? weakReference.get() : null;
            if (aVar != null) {
                aVar.cancel(true);
            }
            int i14 = i13 != 1 ? i8 : 0;
            int i15 = i13 != 1 ? i10 : 0;
            int width = bitmap.getWidth() * this.V;
            int height = bitmap.getHeight();
            int i16 = this.V;
            int i17 = height * i16;
            Uri uri2 = this.U;
            CropOverlayView cropOverlayView = this.f6538b;
            if (uri2 == null || (i16 <= 1 && i13 != 2)) {
                a aVar2 = r0;
                a aVar3 = new a(this, bitmap, getCropPoints(), this.G, cropOverlayView.R, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), i14, i15, this.H, this.I, i12, uri, compressFormat, i11);
                cropImageView = this;
                cropImageView.f6548h0 = new WeakReference<>(aVar2);
            } else {
                a aVar4 = r0;
                a aVar5 = new a(this, this.U, getCropPoints(), this.G, width, i17, cropOverlayView.R, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), i14, i15, this.H, this.I, i12, uri, compressFormat, i11);
                this.f6548h0 = new WeakReference<>(aVar4);
                cropImageView = this;
            }
            cropImageView.f6548h0.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            h();
            return;
        }
    }

    public final void j(boolean z10) {
        Bitmap bitmap = this.E;
        CropOverlayView cropOverlayView = this.f6538b;
        if (bitmap != null && !z10) {
            float[] fArr = this.C;
            float p10 = (((float) this.V) * 100.0f) / (c.p(fArr) - c.o(fArr));
            float m = (((float) this.V) * 100.0f) / (c.m(fArr) - c.q(fArr));
            e eVar = cropOverlayView.f6560a;
            eVar.f6638e = (float) getWidth();
            eVar.f6639f = (float) getHeight();
            eVar.f6644k = p10;
            eVar.f6645l = m;
        }
        cropOverlayView.g(z10 ? null : this.B, getWidth(), getHeight());
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        if (this.J <= 0 || this.K <= 0) {
            j(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.J;
        layoutParams.height = this.K;
        setLayoutParams(layoutParams);
        if (this.E != null) {
            float f10 = (float) (i11 - i8);
            float f11 = (float) (i12 - i10);
            a(f10, f11, true, false);
            if (this.f6541c0 != null) {
                int i13 = this.f6543d0;
                if (i13 != this.F) {
                    this.G = i13;
                    a(f10, f11, true, false);
                }
                this.f6540c.mapRect(this.f6541c0);
                RectF rectF = this.f6541c0;
                CropOverlayView cropOverlayView = this.f6538b;
                cropOverlayView.setCropWindowRect(rectF);
                c(false, false);
                RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                cropOverlayView.d(cropWindowRect);
                cropOverlayView.f6560a.f6634a.set(cropWindowRect);
                this.f6541c0 = null;
            } else if (this.f6545e0) {
                this.f6545e0 = false;
                c(false, false);
            }
        } else {
            j(true);
        }
    }

    public final void onMeasure(int i8, int i10) {
        int i11;
        int i12;
        super.onMeasure(i8, i10);
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            double width = size < this.E.getWidth() ? ((double) size) / ((double) this.E.getWidth()) : Double.POSITIVE_INFINITY;
            double height = size2 < this.E.getHeight() ? ((double) size2) / ((double) this.E.getHeight()) : Double.POSITIVE_INFINITY;
            if (width == Double.POSITIVE_INFINITY && height == Double.POSITIVE_INFINITY) {
                i12 = this.E.getWidth();
                i11 = this.E.getHeight();
            } else if (width <= height) {
                i11 = (int) (((double) this.E.getHeight()) * width);
                i12 = size;
            } else {
                i12 = (int) (((double) this.E.getWidth()) * height);
                i11 = size2;
            }
            if (mode != 1073741824) {
                size = mode == Integer.MIN_VALUE ? Math.min(i12, size) : i12;
            }
            if (mode2 != 1073741824) {
                size2 = mode2 == Integer.MIN_VALUE ? Math.min(i11, size2) : i11;
            }
            this.J = size;
            this.K = size2;
            setMeasuredDimension(size, size2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.f6547g0 == null && this.U == null && this.E == null && this.L == 0) {
                Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair<String, WeakReference<Bitmap>> pair = c.f6605g;
                        Bitmap bitmap = (pair == null || !((String) pair.first).equals(string)) ? null : (Bitmap) ((WeakReference) c.f6605g.second).get();
                        c.f6605g = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            f(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.U == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i8 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i8 > 0) {
                        setImageResource(i8);
                    } else {
                        Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i10 = bundle.getInt("DEGREES_ROTATED");
                this.f6543d0 = i10;
                this.G = i10;
                Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
                CropOverlayView cropOverlayView = this.f6538b;
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    cropOverlayView.setInitialCropWindowRect(rect);
                }
                RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                    this.f6541c0 = rectF;
                }
                cropOverlayView.setCropShape(c.valueOf(bundle.getString("CROP_SHAPE")));
                this.Q = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.R = bundle.getInt("CROP_MAX_ZOOM");
                this.H = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                this.I = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        b bVar;
        OutputStream outputStream;
        boolean z10 = true;
        if (this.U == null && this.E == null && this.L < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.U;
        if (this.N && uri == null && this.L < 1) {
            Context context = getContext();
            Bitmap bitmap = this.E;
            Uri uri2 = this.f6546f0;
            Rect rect = c.f6599a;
            if (uri2 == null) {
                try {
                    uri2 = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
                } catch (Exception e10) {
                    Log.e(c.f6601c, "Failed to write bitmap to temp file for image-cropper save instance state", e10);
                    uri = null;
                }
            } else if (new File(uri2.getPath()).exists()) {
                z10 = false;
            }
            if (z10) {
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                try {
                    outputStream = context.getContentResolver().openOutputStream(uri2);
                    try {
                        bitmap.compress(compressFormat, 95, outputStream);
                        c.c(outputStream);
                    } catch (Throwable th) {
                        th = th;
                        c.c(outputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    c.c(outputStream);
                    throw th;
                }
            }
            uri = uri2;
            this.f6546f0 = uri;
        }
        if (!(uri == null || this.E == null)) {
            String uuid = UUID.randomUUID().toString();
            c.f6605g = new Pair<>(uuid, new WeakReference(this.E));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<b> weakReference = this.f6547g0;
        if (!(weakReference == null || (bVar = weakReference.get()) == null)) {
            bundle.putParcelable("LOADING_IMAGE_URI", bVar.f6590b);
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.L);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.V);
        bundle.putInt("DEGREES_ROTATED", this.G);
        CropOverlayView cropOverlayView = this.f6538b;
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getInitialCropWindowRect());
        RectF rectF = c.f6602d;
        rectF.set(cropOverlayView.getCropWindowRect());
        Matrix matrix = this.f6540c;
        Matrix matrix2 = this.f6542d;
        matrix.invert(matrix2);
        matrix2.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", cropOverlayView.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.Q);
        bundle.putInt("CROP_MAX_ZOOM", this.R);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.H);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.I);
        return bundle;
    }

    public final void onSizeChanged(int i8, int i10, int i11, int i12) {
        super.onSizeChanged(i8, i10, i11, i12);
        this.f6545e0 = i11 > 0 && i12 > 0;
    }

    public void setAutoZoomEnabled(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            c(false, false);
            this.f6538b.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f6538b.setInitialCropWindowRect(rect);
    }

    public void setCropShape(c cVar) {
        this.f6538b.setCropShape(cVar);
    }

    public void setFixedAspectRatio(boolean z10) {
        this.f6538b.setFixedAspectRatio(z10);
    }

    public void setFlippedHorizontally(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setGuidelines(d dVar) {
        this.f6538b.setGuidelines(dVar);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f6538b.setInitialCropWindowRect((Rect) null);
        f(bitmap, 0, (Uri) null, 1, 0);
    }

    public void setImageResource(int i8) {
        if (i8 != 0) {
            this.f6538b.setInitialCropWindowRect((Rect) null);
            f(BitmapFactory.decodeResource(getResources(), i8), i8, (Uri) null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            WeakReference<b> weakReference = this.f6547g0;
            b bVar = weakReference != null ? weakReference.get() : null;
            if (bVar != null) {
                bVar.cancel(true);
            }
            b();
            this.f6541c0 = null;
            this.f6543d0 = 0;
            this.f6538b.setInitialCropWindowRect((Rect) null);
            WeakReference<b> weakReference2 = new WeakReference<>(new b(this, uri));
            this.f6547g0 = weakReference2;
            weakReference2.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            h();
        }
    }

    public void setMaxZoom(int i8) {
        if (this.R != i8 && i8 > 0) {
            this.R = i8;
            c(false, false);
            this.f6538b.invalidate();
        }
    }

    public void setMultiTouchEnabled(boolean z10) {
        CropOverlayView cropOverlayView = this.f6538b;
        if (cropOverlayView.h(z10)) {
            c(false, false);
            cropOverlayView.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(e eVar) {
        this.T = eVar;
    }

    public void setOnCropWindowChangedListener(h hVar) {
    }

    public void setOnSetCropOverlayMovedListener(f fVar) {
    }

    public void setOnSetCropOverlayReleasedListener(g gVar) {
    }

    public void setOnSetImageUriCompleteListener(i iVar) {
        this.S = iVar;
    }

    public void setRotatedDegrees(int i8) {
        int i10 = this.G;
        if (i10 != i8) {
            e(i8 - i10);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z10) {
        this.N = z10;
    }

    public void setScaleType(j jVar) {
        if (jVar != this.M) {
            this.M = jVar;
            this.W = 1.0f;
            this.f6539b0 = 0.0f;
            this.f6537a0 = 0.0f;
            CropOverlayView cropOverlayView = this.f6538b;
            if (cropOverlayView.f6561a0) {
                cropOverlayView.setCropWindowRect(c.f6600b);
                cropOverlayView.f();
                cropOverlayView.invalidate();
            }
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            g();
        }
    }

    public void setShowProgressBar(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            h();
        }
    }

    public void setSnapRadius(float f10) {
        if (f10 >= 0.0f) {
            this.f6538b.setSnapRadius(f10);
        }
    }
}
