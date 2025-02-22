package wa;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f16573a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    @TargetApi(26)
    public static boolean a(Resources resources, int i8) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i8, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i8);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i8 + ", treating it as an invalid icon");
            return false;
        }
    }
}
