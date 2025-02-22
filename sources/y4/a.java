package y4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p4.h;
import p4.j;
import r4.w;

public final class a<DataType> implements j<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final j<DataType, Bitmap> f17166a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f17167b;

    public a(Resources resources, j<DataType, Bitmap> jVar) {
        this.f17167b = resources;
        this.f17166a = jVar;
    }

    public final w<BitmapDrawable> a(DataType datatype, int i8, int i10, h hVar) {
        w<Bitmap> a10 = this.f17166a.a(datatype, i8, i10, hVar);
        if (a10 == null) {
            return null;
        }
        return new t(this.f17167b, a10);
    }

    public final boolean b(DataType datatype, h hVar) {
        return this.f17166a.b(datatype, hVar);
    }
}
