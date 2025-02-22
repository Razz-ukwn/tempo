package s8;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import v1.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f14809a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f14810b = {16842908};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f14811c = {16842913, 16842919};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f14812d = {16842913};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f14813e = {16842910, 16842919};

    /* renamed from: f  reason: collision with root package name */
    public static final String f14814f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f14810b;
        return new ColorStateList(new int[][]{f14812d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f14811c), b(colorStateList, iArr), b(colorStateList, f14809a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return d.c(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f14813e, 0)) != 0) {
            Log.w(f14814f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i8 : iArr) {
            if (i8 == 16842910) {
                z10 = true;
            } else if (i8 == 16842908 || i8 == 16842919 || i8 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
