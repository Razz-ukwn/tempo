package u1;

import androidx.databinding.a;

public final class l {

    /* renamed from: k  reason: collision with root package name */
    public static final l f15687k;

    /* renamed from: a  reason: collision with root package name */
    public final float f15688a;

    /* renamed from: b  reason: collision with root package name */
    public final float f15689b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15690c;

    /* renamed from: d  reason: collision with root package name */
    public final float f15691d;

    /* renamed from: e  reason: collision with root package name */
    public final float f15692e;

    /* renamed from: f  reason: collision with root package name */
    public final float f15693f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f15694g;

    /* renamed from: h  reason: collision with root package name */
    public final float f15695h;

    /* renamed from: i  reason: collision with root package name */
    public final float f15696i;

    /* renamed from: j  reason: collision with root package name */
    public final float f15697j;

    static {
        float f10;
        float f11;
        float[] fArr = a.B;
        float m = (float) ((((double) a.m()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = a.f1767d;
        float f12 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f13 = fArr[1];
        float f14 = fArr3[1] * f13;
        float f15 = fArr[2];
        float f16 = (fArr3[2] * f15) + f14 + (fArr3[0] * f12);
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f13) + (fArr4[0] * f12);
        float[] fArr5 = fArr2[2];
        float f18 = (f15 * fArr5[2]) + (f13 * fArr5[1]) + (f12 * fArr5[0]);
        if (((double) 1.0f) >= 0.9d) {
            f11 = 0.100000046f;
            f10 = 0.59f;
        } else {
            f11 = 0.12999998f;
            f10 = 0.525f;
        }
        float f19 = f11 + f10;
        float exp = (1.0f - (((float) Math.exp((double) (((-m) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d10 = (double) exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp};
        float f20 = 1.0f / ((5.0f * m) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float cbrt = (0.1f * f22 * f22 * ((float) Math.cbrt(((double) m) * 5.0d))) + (f21 * m);
        float m10 = a.m() / fArr[1];
        double d11 = (double) m10;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f18)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f17)) / 100.0d, 0.42d), pow2};
        float f23 = fArr7[0];
        float f24 = fArr7[1];
        f15687k = new l(m10, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f23 * 400.0f) / (f23 + 27.13f)) * 2.0f) + ((f24 * 400.0f) / (f24 + 27.13f))) * pow, pow, pow, f19, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f15693f = f10;
        this.f15688a = f11;
        this.f15689b = f12;
        this.f15690c = f13;
        this.f15691d = f14;
        this.f15692e = f15;
        this.f15694g = fArr;
        this.f15695h = f16;
        this.f15696i = f17;
        this.f15697j = f18;
    }
}
