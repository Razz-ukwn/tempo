package y4;

import android.graphics.Bitmap;
import androidx.activity.result.d;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import p4.l;
import r4.w;
import s4.c;

public abstract class e implements l<Bitmap> {
    public final w b(h hVar, w wVar, int i8, int i10) {
        if (l5.l.g(i8, i10)) {
            c cVar = b.b(hVar).f4054a;
            Bitmap bitmap = (Bitmap) wVar.get();
            if (i8 == Integer.MIN_VALUE) {
                i8 = bitmap.getWidth();
            }
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getHeight();
            }
            Bitmap c3 = c(cVar, bitmap, i8, i10);
            return bitmap.equals(c3) ? wVar : d.e(c3, cVar);
        }
        throw new IllegalArgumentException(d.b("Cannot apply transformation on width: ", i8, " or height: ", i10, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    public abstract Bitmap c(c cVar, Bitmap bitmap, int i8, int i10);
}
