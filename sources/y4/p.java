package y4;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p4.f;
import s4.c;

public final class p extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f17214b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f.f12458a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f17214b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i8, int i10) {
        return y.b(cVar, bitmap, i8, i10);
    }

    public final boolean equals(Object obj) {
        return obj instanceof p;
    }

    public final int hashCode() {
        return 1572326941;
    }
}
