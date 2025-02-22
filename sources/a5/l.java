package a5;

import android.graphics.drawable.Drawable;
import p4.h;
import p4.j;
import r4.w;

public final class l implements j<Drawable, Drawable> {
    public final w a(Object obj, int i8, int i10, h hVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return new j(drawable, 0);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        Drawable drawable = (Drawable) obj;
        return true;
    }
}
