package y4;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import p4.f;
import s4.c;

public final class h extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f17185b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f.f12458a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f17185b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i8, int i10) {
        float f10;
        float f11;
        Paint paint = y.f17250a;
        if (bitmap.getWidth() == i8 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        if (bitmap.getWidth() * i10 > bitmap.getHeight() * i8) {
            f11 = ((float) i10) / ((float) bitmap.getHeight());
            f12 = (((float) i8) - (((float) bitmap.getWidth()) * f11)) * 0.5f;
            f10 = 0.0f;
        } else {
            f11 = ((float) i8) / ((float) bitmap.getWidth());
            f10 = (((float) i10) - (((float) bitmap.getHeight()) * f11)) * 0.5f;
        }
        matrix.setScale(f11, f11);
        matrix.postTranslate((float) ((int) (f12 + 0.5f)), (float) ((int) (f10 + 0.5f)));
        Bitmap e10 = cVar.e(i8, i10, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        e10.setHasAlpha(bitmap.hasAlpha());
        y.a(bitmap, e10, matrix);
        return e10;
    }

    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    public final int hashCode() {
        return -599754482;
    }
}
