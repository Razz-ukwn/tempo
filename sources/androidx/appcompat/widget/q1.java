package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import d2.d1;
import d2.i0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f1113a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f1114b = (Build.VERSION.SDK_INT >= 27);

    static {
        Class<Rect> cls = Rect.class;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
            f1113a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        return i0.e.d(view) == 1;
    }
}
