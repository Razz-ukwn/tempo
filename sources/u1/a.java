package u1;

import android.graphics.Color;
import v1.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f15648a;

    /* renamed from: b  reason: collision with root package name */
    public final float f15649b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15650c;

    /* renamed from: d  reason: collision with root package name */
    public final float f15651d;

    /* renamed from: e  reason: collision with root package name */
    public final float f15652e;

    /* renamed from: f  reason: collision with root package name */
    public final float f15653f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f15648a = f10;
        this.f15649b = f11;
        this.f15650c = f12;
        this.f15651d = f13;
        this.f15652e = f14;
        this.f15653f = f15;
    }

    public static a a(int i8) {
        l lVar = l.f15687k;
        float i10 = androidx.databinding.a.i(Color.red(i8));
        float i11 = androidx.databinding.a.i(Color.green(i8));
        float i12 = androidx.databinding.a.i(Color.blue(i8));
        float[][] fArr = androidx.databinding.a.C;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * i12) + (fArr2[1] * i11) + (fArr2[0] * i10);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * i12) + (fArr3[1] * i11) + (fArr3[0] * i10);
        float[] fArr4 = fArr[2];
        float f12 = (i12 * fArr4[2]) + (i11 * fArr4[1]) + (i10 * fArr4[0]);
        float[][] fArr5 = androidx.databinding.a.f1767d;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = fArr7[1] * f11;
        float f15 = fArr7[2] * f12;
        float[] fArr8 = fArr5[2];
        float f16 = f10 * fArr8[0];
        float f17 = f12 * fArr8[2];
        float[] fArr9 = lVar.f15694g;
        float f18 = fArr9[0] * f13;
        float f19 = fArr9[1] * (f15 + f14 + (fArr7[0] * f10));
        float f20 = fArr9[2] * (f17 + (f11 * fArr8[1]) + f16);
        float abs = Math.abs(f18);
        float f21 = lVar.f15695h;
        float pow = (float) Math.pow(((double) (abs * f21)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f19) * f21)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f20) * f21)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = (double) signum3;
        float f22 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d10)) / 11.0f;
        float f23 = ((float) (((double) (signum + signum2)) - (d10 * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = ((21.0f * signum3) + ((signum * 20.0f) + f24)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f23, (double) f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = atan2;
        float f28 = (3.1415927f * f27) / 180.0f;
        float f29 = f26 * lVar.f15689b;
        float f30 = lVar.f15688a;
        double d11 = (double) (f29 / f30);
        float f31 = lVar.f15697j;
        float f32 = lVar.f15691d;
        float pow4 = ((float) Math.pow(d11, (double) (f31 * f32))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float f33 = f30 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.f15693f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f27) < 20.14d ? 360.0f + f27 : f27)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f15692e) * lVar.f15690c) * ((float) Math.sqrt((double) ((f23 * f23) + (f22 * f22))))) / (f25 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * f32) / f33));
        float f34 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((lVar.f15696i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d12 = (double) f28;
        return new a(f27, sqrt, pow4, f34, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    public static a b(float f10, float f11, float f12) {
        l lVar = l.f15687k;
        float f13 = lVar.f15691d;
        double d10 = ((double) f10) / 100.0d;
        Math.sqrt(d10);
        Math.sqrt((double) (((f11 / ((float) Math.sqrt(d10))) * lVar.f15691d) / (lVar.f15688a + 4.0f)));
        float f14 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((((double) (lVar.f15696i * f11)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (double) ((3.1415927f * f12) / 180.0f);
        return new a(f12, f11, f10, f14, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public final int c(l lVar) {
        float f10;
        l lVar2 = lVar;
        float f11 = this.f15649b;
        int i8 = (((double) f11) > 0.0d ? 1 : (((double) f11) == 0.0d ? 0 : -1));
        float f12 = this.f15650c;
        if (i8 != 0) {
            double d10 = (double) f12;
            if (d10 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar2.f15693f), 0.73d), 1.1111111111111112d);
                double d11 = (double) ((this.f15648a * 3.1415927f) / 180.0f);
                float pow2 = lVar2.f15688a * ((float) Math.pow(((double) f12) / 100.0d, (1.0d / ((double) lVar2.f15691d)) / ((double) lVar2.f15697j)));
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f * 3846.1538f * lVar2.f15692e * lVar2.f15690c;
                float f13 = pow2 / lVar2.f15689b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f14 = 11.0f * pow * cos2;
                float f15 = (((0.305f + f13) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f14 + (cos * 23.0f)));
                float f16 = cos2 * f15;
                float f17 = f15 * sin;
                float f18 = f13 * 460.0f;
                float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
                float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
                float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19))));
                float signum = Math.signum(f19);
                float f22 = 100.0f / lVar2.f15695h;
                float pow3 = signum * f22 * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = Math.signum(f20) * f22 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20))))), 2.380952380952381d));
                float[] fArr = lVar2.f15694g;
                float f23 = pow3 / fArr[0];
                float f24 = signum2 / fArr[1];
                float signum3 = ((Math.signum(f21) * f22) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f21)) * 27.13d) / (400.0d - ((double) Math.abs(f21))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = androidx.databinding.a.f1768e;
                float[] fArr3 = fArr2[0];
                float f25 = fArr3[1] * f24;
                float f26 = (fArr3[2] * signum3) + f25 + (fArr3[0] * f23);
                float[] fArr4 = fArr2[1];
                float f27 = fArr4[1] * f24;
                float f28 = fArr4[2] * signum3;
                float[] fArr5 = fArr2[2];
                float f29 = f23 * fArr5[0];
                return d.a((double) f26, (double) (f28 + f27 + (fArr4[0] * f23)), (double) ((signum3 * fArr5[2]) + (f24 * fArr5[1]) + f29));
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar2.f15693f), 0.73d), 1.1111111111111112d);
        double d112 = (double) ((this.f15648a * 3.1415927f) / 180.0f);
        float pow22 = lVar2.f15688a * ((float) Math.pow(((double) f12) / 100.0d, (1.0d / ((double) lVar2.f15691d)) / ((double) lVar2.f15697j)));
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f * 3846.1538f * lVar2.f15692e * lVar2.f15690c;
        float f132 = pow22 / lVar2.f15689b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f142 = 11.0f * pow4 * cos22;
        float f152 = (((0.305f + f132) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f142 + (cos3 * 23.0f)));
        float f162 = cos22 * f152;
        float f172 = f152 * sin2;
        float f182 = f132 * 460.0f;
        float f192 = ((288.0f * f172) + ((451.0f * f162) + f182)) / 1403.0f;
        float f202 = ((f182 - (891.0f * f162)) - (261.0f * f172)) / 1403.0f;
        float f212 = ((f182 - (f162 * 220.0f)) - (f172 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (((double) Math.abs(f192)) * 27.13d) / (400.0d - ((double) Math.abs(f192))));
        float signum4 = Math.signum(f192);
        float f222 = 100.0f / lVar2.f15695h;
        float pow32 = signum4 * f222 * ((float) Math.pow((double) max2, 2.380952380952381d));
        float signum22 = Math.signum(f202) * f222 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f202)) * 27.13d) / (400.0d - ((double) Math.abs(f202))))), 2.380952380952381d));
        float[] fArr6 = lVar2.f15694g;
        float f232 = pow32 / fArr6[0];
        float f242 = signum22 / fArr6[1];
        float signum32 = ((Math.signum(f212) * f222) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f212)) * 27.13d) / (400.0d - ((double) Math.abs(f212))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = androidx.databinding.a.f1768e;
        float[] fArr32 = fArr22[0];
        float f252 = fArr32[1] * f242;
        float f262 = (fArr32[2] * signum32) + f252 + (fArr32[0] * f232);
        float[] fArr42 = fArr22[1];
        float f272 = fArr42[1] * f242;
        float f282 = fArr42[2] * signum32;
        float[] fArr52 = fArr22[2];
        float f292 = f232 * fArr52[0];
        return d.a((double) f262, (double) (f282 + f272 + (fArr42[0] * f232)), (double) ((signum32 * fArr52[2]) + (f242 * fArr52[1]) + f292));
    }
}
