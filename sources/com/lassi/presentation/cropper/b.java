package com.lassi.presentation.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.lassi.presentation.cropper.CropImageView;
import com.lassi.presentation.cropper.c;
import java.lang.ref.WeakReference;

public final class b extends AsyncTask<Void, Void, a> {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<CropImageView> f6589a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f6590b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f6591c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6592d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6593e;

    public b(CropImageView cropImageView, Uri uri) {
        this.f6590b = uri;
        this.f6589a = new WeakReference<>(cropImageView);
        this.f6591c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f10 = displayMetrics.density;
        double d10 = f10 > 1.0f ? (double) (1.0f / f10) : 1.0d;
        this.f6592d = (int) (((double) displayMetrics.widthPixels) * d10);
        this.f6593e = (int) (((double) displayMetrics.heightPixels) * d10);
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Context context = this.f6591c;
        Uri uri = this.f6590b;
        try {
            if (!isCancelled()) {
                c.a j10 = c.j(context, uri, this.f6592d, this.f6593e);
                if (!isCancelled()) {
                    c.b s10 = c.s(context, j10.f6607a, uri);
                    return new a(uri, s10.f6609a, j10.f6608b, s10.f6610b);
                }
            }
            return null;
        } catch (Exception e10) {
            return new a(uri, e10);
        }
    }

    public final void onPostExecute(Object obj) {
        boolean z10;
        Bitmap bitmap;
        CropImageView cropImageView;
        a aVar = (a) obj;
        if (aVar != null) {
            if (isCancelled() || (cropImageView = this.f6589a.get()) == null) {
                z10 = false;
            } else {
                cropImageView.f6547g0 = null;
                cropImageView.h();
                Exception exc = aVar.f6598e;
                if (exc == null) {
                    int i8 = aVar.f6597d;
                    cropImageView.F = i8;
                    cropImageView.f(aVar.f6595b, 0, aVar.f6594a, aVar.f6596c, i8);
                }
                CropImageView.i iVar = cropImageView.S;
                if (iVar != null) {
                    iVar.m(cropImageView, aVar.f6594a, exc);
                }
                z10 = true;
            }
            if (!z10 && (bitmap = aVar.f6595b) != null) {
                bitmap.recycle();
            }
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f6594a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f6595b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6596c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6597d;

        /* renamed from: e  reason: collision with root package name */
        public final Exception f6598e;

        public a(Uri uri, Bitmap bitmap, int i8, int i10) {
            this.f6594a = uri;
            this.f6595b = bitmap;
            this.f6596c = i8;
            this.f6597d = i10;
            this.f6598e = null;
        }

        public a(Uri uri, Exception exc) {
            this.f6594a = uri;
            this.f6595b = null;
            this.f6596c = 0;
            this.f6597d = 0;
            this.f6598e = exc;
        }
    }
}
