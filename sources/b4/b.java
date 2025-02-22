package b4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import b4.h;
import h4.l;
import jf.d;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f3213a;

    /* renamed from: b  reason: collision with root package name */
    public final l f3214b;

    public static final class a implements h.a<Bitmap> {
        public final h a(Object obj, l lVar) {
            return new b((Bitmap) obj, lVar);
        }
    }

    public b(Bitmap bitmap, l lVar) {
        this.f3213a = bitmap;
        this.f3214b = lVar;
    }

    public final Object a(d<? super g> dVar) {
        return new f(new BitmapDrawable(this.f3214b.f9195a.getResources(), this.f3213a), false, 2);
    }
}
