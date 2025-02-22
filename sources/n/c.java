package n;

import android.graphics.drawable.Drawable;

public final class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static final double f11514a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11515b = 0;

    public static float a(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f11514a) * ((double) f11)) + ((double) (f10 * 1.5f)));
    }
}
