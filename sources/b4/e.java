package b4;

import ag.v1;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import b4.h;
import h4.l;
import jf.d;
import m4.c;
import s3.g;

public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f3219a;

    /* renamed from: b  reason: collision with root package name */
    public final l f3220b;

    public static final class a implements h.a<Drawable> {
        public final h a(Object obj, l lVar) {
            return new e((Drawable) obj, lVar);
        }
    }

    public e(Drawable drawable, l lVar) {
        this.f3219a = drawable;
        this.f3220b = lVar;
    }

    public final Object a(d<? super g> dVar) {
        Bitmap.Config[] configArr = c.f11189a;
        Drawable drawable = this.f3219a;
        boolean z10 = (drawable instanceof VectorDrawable) || (drawable instanceof g);
        if (z10) {
            l lVar = this.f3220b;
            drawable = new BitmapDrawable(lVar.f9195a.getResources(), v1.h(drawable, lVar.f9196b, lVar.f9198d, lVar.f9199e, lVar.f9200f));
        }
        return new f(drawable, z10, 2);
    }
}
