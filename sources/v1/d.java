package v1;

import android.graphics.Color;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<double[]> f16119a = new ThreadLocal<>();

    public static int a(double d10, double d11, double d12) {
        double d13 = ((-0.4986d * d12) + ((-1.5372d * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + (-0.9689d * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + ((-0.204d * d11) + (0.0557d * d10))) / 100.0d;
        double pow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double pow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double pow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int i8 = 0;
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        if (round3 >= 0) {
            i8 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i8);
    }

    public static int b(int i8, int i10) {
        int i11;
        int i12;
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i8);
        int i13 = 255 - alpha2;
        int i14 = 255 - (((255 - alpha) * i13) / 255);
        int red = Color.red(i8);
        int red2 = Color.red(i10);
        int i15 = 0;
        if (i14 == 0) {
            i11 = 0;
        } else {
            i11 = (((red2 * alpha) * i13) + ((red * 255) * alpha2)) / (i14 * 255);
        }
        int green = Color.green(i8);
        int green2 = Color.green(i10);
        if (i14 == 0) {
            i12 = 0;
        } else {
            i12 = (((green2 * alpha) * i13) + ((green * 255) * alpha2)) / (i14 * 255);
        }
        int blue = Color.blue(i8);
        int blue2 = Color.blue(i10);
        if (i14 != 0) {
            i15 = (((blue2 * alpha) * i13) + ((blue * 255) * alpha2)) / (i14 * 255);
        }
        return Color.argb(i14, i11, i12, i15);
    }

    public static int c(int i8, int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return (i8 & 16777215) | (i10 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
