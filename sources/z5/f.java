package z5;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import t5.b;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static DisplayMetrics f17746a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f17747b = 50;

    /* renamed from: c  reason: collision with root package name */
    public static int f17748c = 8000;

    /* renamed from: d  reason: collision with root package name */
    public static final Rect f17749d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public static final Paint.FontMetrics f17750e = new Paint.FontMetrics();

    /* renamed from: f  reason: collision with root package name */
    public static final Rect f17751f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public static final b f17752g = new b(1);

    /* renamed from: h  reason: collision with root package name */
    public static final Rect f17753h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public static final Paint.FontMetrics f17754i = new Paint.FontMetrics();

    static {
        Double.longBitsToDouble(1);
        Float.intBitsToFloat(1);
        new Rect();
    }

    public static int a(Paint paint, String str) {
        Rect rect = f17749d;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static a b(Paint paint, String str) {
        a b10 = a.b(0.0f, 0.0f);
        Rect rect = f17751f;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        b10.f17723b = (float) rect.width();
        b10.f17724c = (float) rect.height();
        return b10;
    }

    public static float c(float f10) {
        DisplayMetrics displayMetrics = f17746a;
        if (displayMetrics != null) {
            return f10 * displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f10;
    }

    public static a d(float f10, float f11) {
        double d10 = (double) 0.0f;
        return a.b(Math.abs(((float) Math.sin(d10)) * f11) + Math.abs(((float) Math.cos(d10)) * f10), Math.abs(f11 * ((float) Math.cos(d10))) + Math.abs(f10 * ((float) Math.sin(d10))));
    }

    public static float e(double d10) {
        if (Double.isInfinite(d10) || Double.isNaN(d10) || d10 == 0.0d) {
            return 0.0f;
        }
        float pow = (float) Math.pow(10.0d, (double) (1 - ((int) ((float) Math.ceil((double) ((float) Math.log10(d10 < 0.0d ? -d10 : d10)))))));
        return ((float) Math.round(d10 * ((double) pow))) / pow;
    }
}
