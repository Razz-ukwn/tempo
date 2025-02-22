package y4;

import android.graphics.Bitmap;
import l5.l;
import r4.t;
import r4.w;
import s4.c;

public final class d implements w<Bitmap>, t {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f17181a;

    /* renamed from: b  reason: collision with root package name */
    public final c f17182b;

    public d(Bitmap bitmap, c cVar) {
        if (bitmap != null) {
            this.f17181a = bitmap;
            if (cVar != null) {
                this.f17182b = cVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static d e(Bitmap bitmap, c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, cVar);
    }

    public final int a() {
        return l.c(this.f17181a);
    }

    public final void b() {
        this.f17181a.prepareToDraw();
    }

    public final void c() {
        this.f17182b.d(this.f17181a);
    }

    public final Class<Bitmap> d() {
        return Bitmap.class;
    }

    public final Object get() {
        return this.f17181a;
    }
}
