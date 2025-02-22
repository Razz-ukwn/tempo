package n8;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import r8.b;
import v1.g;

public final class a {
    public static float a(int i8, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i8]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int c(Context context, int i8, int i10) {
        TypedValue a10 = b.a(context, i8);
        return (a10 == null || a10.type != 16) ? i10 : a10.data;
    }

    public static TimeInterpolator d(Context context, int i8, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i8, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!(b(valueOf, "cubic-bezier") || b(valueOf, "path"))) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (b(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return f2.a.b(a(0, split), a(1, split), a(2, split), a(3, split));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (b(valueOf, "path")) {
                return f2.a.c(g.d(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }
}
