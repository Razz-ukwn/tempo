package v1;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

public final class a {

    /* renamed from: v1.a$a  reason: collision with other inner class name */
    public static class C0296a {
        public static ColorFilter a(int i8, Object obj) {
            return new BlendModeColorFilter(i8, (BlendMode) obj);
        }
    }

    public static ColorFilter a(int i8) {
        b bVar = b.f16117a;
        if (Build.VERSION.SDK_INT >= 29) {
            Object a10 = c.a(bVar);
            if (a10 != null) {
                return C0296a.a(i8, a10);
            }
            return null;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        if (mode != null) {
            return new PorterDuffColorFilter(i8, mode);
        }
        return null;
    }
}
