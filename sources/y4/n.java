package y4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import java.security.MessageDigest;
import p4.l;
import r4.w;
import s4.c;

public final class n implements l<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f17212b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17213c;

    public n(l<Bitmap> lVar, boolean z10) {
        this.f17212b = lVar;
        this.f17213c = z10;
    }

    public final void a(MessageDigest messageDigest) {
        this.f17212b.a(messageDigest);
    }

    public final w b(h hVar, w wVar, int i8, int i10) {
        c cVar = b.b(hVar).f4054a;
        Drawable drawable = (Drawable) wVar.get();
        d a10 = m.a(cVar, drawable, i8, i10);
        if (a10 != null) {
            w b10 = this.f17212b.b(hVar, a10, i8, i10);
            if (!b10.equals(a10)) {
                return new t(hVar.getResources(), b10);
            }
            b10.c();
            return wVar;
        } else if (!this.f17213c) {
            return wVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f17212b.equals(((n) obj).f17212b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17212b.hashCode();
    }
}
