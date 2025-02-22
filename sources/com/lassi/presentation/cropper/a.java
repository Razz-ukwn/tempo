package com.lassi.presentation.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import com.lassi.presentation.cropper.CropImageView;
import com.lassi.presentation.cropper.c;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

public final class a extends AsyncTask<Void, Void, C0083a> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<CropImageView> f6567a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap f6568b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f6569c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f6570d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f6571e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6572f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6573g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6574h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6575i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6576j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6577k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6578l;
    public final int m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f6579n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6580o;

    /* renamed from: p  reason: collision with root package name */
    public final int f6581p;

    /* renamed from: q  reason: collision with root package name */
    public final Uri f6582q;

    /* renamed from: r  reason: collision with root package name */
    public final Bitmap.CompressFormat f6583r;

    /* renamed from: s  reason: collision with root package name */
    public final int f6584s;

    public a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i8, boolean z10, int i10, int i11, int i12, int i13, boolean z11, boolean z12, int i14, Uri uri, Bitmap.CompressFormat compressFormat, int i15) {
        CropImageView cropImageView2 = cropImageView;
        this.f6567a = new WeakReference<>(cropImageView);
        this.f6570d = cropImageView.getContext();
        this.f6568b = bitmap;
        this.f6571e = fArr;
        this.f6569c = null;
        this.f6572f = i8;
        this.f6575i = z10;
        this.f6576j = i10;
        this.f6577k = i11;
        this.f6578l = i12;
        this.m = i13;
        this.f6579n = z11;
        this.f6580o = z12;
        this.f6581p = i14;
        this.f6582q = uri;
        this.f6583r = compressFormat;
        this.f6584s = i15;
        this.f6573g = 0;
        this.f6574h = 0;
    }

    public static Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Canvas canvas = new Canvas(createBitmap);
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawCircle((float) width, (float) height, (float) Math.min(width, height), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, new ByteArrayOutputStream());
        return createBitmap;
    }

    public final Object doInBackground(Object[] objArr) {
        OutputStream outputStream;
        c.a aVar;
        Void[] voidArr = (Void[]) objArr;
        try {
            outputStream = null;
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.f6569c;
            if (uri != null) {
                aVar = c.d(this.f6570d, uri, this.f6571e, this.f6572f, this.f6573g, this.f6574h, this.f6575i, this.f6576j, this.f6577k, this.f6578l, this.m, this.f6579n, this.f6580o);
            } else {
                Bitmap bitmap = this.f6568b;
                if (bitmap == null) {
                    return new C0083a((Bitmap) null, 1);
                }
                aVar = c.f(bitmap, this.f6571e, this.f6572f, this.f6575i, this.f6576j, this.f6577k, this.f6579n, this.f6580o);
            }
            Bitmap r10 = c.r(aVar.f6607a, this.f6578l, this.m, this.f6581p);
            rb.a aVar2 = rb.a.V;
            if (aVar2.L == CropImageView.c.f6552b && aVar2.Q) {
                r10 = a(r10);
            }
            Uri uri2 = this.f6582q;
            int i8 = aVar.f6608b;
            if (uri2 == null) {
                return new C0083a(r10, i8);
            }
            Context context = this.f6570d;
            Bitmap.CompressFormat compressFormat = this.f6583r;
            int i10 = this.f6584s;
            outputStream = context.getContentResolver().openOutputStream(uri2);
            r10.compress(compressFormat, i10, outputStream);
            c.c(outputStream);
            r10.recycle();
            return new C0083a(uri2, i8);
        } catch (Exception e10) {
            return new C0083a(e10);
        } catch (Throwable th) {
            c.c(outputStream);
            throw th;
        }
    }

    public final void onPostExecute(Object obj) {
        boolean z10;
        Bitmap bitmap;
        CropImageView cropImageView;
        C0083a aVar = (C0083a) obj;
        if (aVar != null) {
            if (isCancelled() || (cropImageView = this.f6567a.get()) == null) {
                z10 = false;
            } else {
                cropImageView.f6548h0 = null;
                cropImageView.h();
                CropImageView.e eVar = cropImageView.T;
                if (eVar != null) {
                    cropImageView.getCropPoints();
                    cropImageView.getCropRect();
                    cropImageView.getWholeImageRect();
                    cropImageView.getRotatedDegrees();
                    eVar.r(cropImageView, new CropImageView.b(aVar.f6586b, aVar.f6587c, aVar.f6588d));
                }
                z10 = true;
            }
            if (!z10 && (bitmap = aVar.f6585a) != null) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: com.lassi.presentation.cropper.a$a  reason: collision with other inner class name */
    public static final class C0083a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f6585a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f6586b;

        /* renamed from: c  reason: collision with root package name */
        public final Exception f6587c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6588d;

        public C0083a(Bitmap bitmap, int i8) {
            this.f6585a = bitmap;
            this.f6586b = null;
            this.f6587c = null;
            this.f6588d = i8;
        }

        public C0083a(Uri uri, int i8) {
            this.f6585a = null;
            this.f6586b = uri;
            this.f6587c = null;
            this.f6588d = i8;
        }

        public C0083a(Exception exc) {
            this.f6585a = null;
            this.f6586b = null;
            this.f6587c = exc;
            this.f6588d = 1;
        }
    }

    public a(CropImageView cropImageView, Uri uri, float[] fArr, int i8, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, boolean z11, boolean z12, int i16, Uri uri2, Bitmap.CompressFormat compressFormat, int i17) {
        CropImageView cropImageView2 = cropImageView;
        this.f6567a = new WeakReference<>(cropImageView);
        this.f6570d = cropImageView.getContext();
        this.f6569c = uri;
        this.f6571e = fArr;
        this.f6572f = i8;
        this.f6575i = z10;
        this.f6576j = i12;
        this.f6577k = i13;
        this.f6573g = i10;
        this.f6574h = i11;
        this.f6578l = i14;
        this.m = i15;
        this.f6579n = z11;
        this.f6580o = z12;
        this.f6581p = i16;
        this.f6582q = uri2;
        this.f6583r = compressFormat;
        this.f6584s = i17;
        this.f6568b = null;
    }
}
