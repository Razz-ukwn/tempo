package y4;

import ag.b1;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import r4.w;

public final class t implements w<BitmapDrawable>, r4.t {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f17236a;

    /* renamed from: b  reason: collision with root package name */
    public final w<Bitmap> f17237b;

    public t(Resources resources, w<Bitmap> wVar) {
        b1.b(resources);
        this.f17236a = resources;
        b1.b(wVar);
        this.f17237b = wVar;
    }

    public final int a() {
        return this.f17237b.a();
    }

    public final void b() {
        w<Bitmap> wVar = this.f17237b;
        if (wVar instanceof r4.t) {
            ((r4.t) wVar).b();
        }
    }

    public final void c() {
        this.f17237b.c();
    }

    public final Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    public final Object get() {
        return new BitmapDrawable(this.f17236a, this.f17237b.get());
    }
}
