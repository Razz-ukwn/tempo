package y4;

import a5.k;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p4.h;
import p4.j;
import s4.c;

public final class w implements j<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final k f17244a;

    /* renamed from: b  reason: collision with root package name */
    public final c f17245b;

    public w(k kVar, c cVar) {
        this.f17244a = kVar;
        this.f17245b = cVar;
    }

    public final r4.w a(Object obj, int i8, int i10, h hVar) {
        r4.w c3 = this.f17244a.c((Uri) obj);
        if (c3 == null) {
            return null;
        }
        return m.a(this.f17245b, (Drawable) ((a5.h) c3).get(), i8, i10);
    }

    public final boolean b(Object obj, h hVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
