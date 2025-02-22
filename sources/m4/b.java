package m4;

import ag.m;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ff.e;
import h4.h;
import i4.f;
import j4.a;
import q.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h4.b f11188a = new h4.b(0);

    public static final boolean a(h hVar) {
        int c3 = g.c(hVar.f9152i);
        if (c3 != 0) {
            if (c3 == 1) {
                return true;
            }
            if (c3 == 2) {
                f fVar = hVar.L.f9126b;
                f fVar2 = hVar.B;
                if (fVar == null && (fVar2 instanceof i4.b)) {
                    return true;
                }
                a aVar = hVar.f9146c;
                if ((aVar instanceof j4.b) && (fVar2 instanceof i4.g)) {
                    j4.b bVar = (j4.b) aVar;
                    return (bVar.a() instanceof ImageView) && bVar.a() == ((i4.g) fVar2).a();
                }
            } else {
                throw new e();
            }
        }
    }

    public static final Drawable b(h hVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return m.e(hVar.f9144a, num.intValue());
    }
}
