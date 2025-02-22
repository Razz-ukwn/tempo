package a5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import f.a;
import h.c;
import t1.a;
import u1.f;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f110a = true;

    public static Drawable a(Context context, Context context2, int i8, Resources.Theme theme) {
        try {
            if (f110a) {
                return a.a(theme != null ? new c(context2, theme) : context2, i8);
            }
        } catch (NoClassDefFoundError unused) {
            f110a = false;
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = t1.a.f15323a;
                return a.c.b(context2, i8);
            }
            throw e10;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = f.f15671a;
        return f.a.a(resources, i8, theme);
    }
}
