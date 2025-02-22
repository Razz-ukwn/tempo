package y4;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import p4.f;
import s4.c;

public final class i extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f17186b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f.f12458a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f17186b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i8, int i10) {
        Paint paint = y.f17250a;
        if (bitmap.getWidth() > i8 || bitmap.getHeight() > i10) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return y.b(cVar, bitmap, i8, i10);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    public final int hashCode() {
        return -670243078;
    }
}
