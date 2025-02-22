package j0;

import androidx.databinding.a;
import androidx.fragment.app.z0;
import d2.f1;
import sf.j;

public final class k extends c {
    public k() {
        super("Generic L*a*b*", b.f9679c, 15);
    }

    public final float[] a(float[] fArr) {
        float f10 = fArr[0];
        float[] fArr2 = z0.B;
        float f11 = f10 / fArr2[0];
        float f12 = fArr[1] / fArr2[1];
        float f13 = fArr[2] / fArr2[2];
        float pow = f11 > 0.008856452f ? (float) Math.pow((double) f11, (double) 0.33333334f) : (f11 * 7.787037f) + 0.13793103f;
        float pow2 = f12 > 0.008856452f ? (float) Math.pow((double) f12, (double) 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        float pow3 = f13 > 0.008856452f ? (float) Math.pow((double) f13, (double) 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
        fArr[0] = f1.p((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = f1.p((pow - pow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = f1.p((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    public final float b(int i8) {
        return i8 == 0 ? 100.0f : 128.0f;
    }

    public final float c(int i8) {
        return i8 == 0 ? 0.0f : -128.0f;
    }

    public final long e(float f10, float f11, float f12) {
        float p10 = (f1.p(f10, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float p11 = (f1.p(f10, -128.0f, 128.0f) * 0.002f) + p10;
        float f13 = p11 > 0.20689656f ? p11 * p11 * p11 : (p11 - 0.13793103f) * 0.12841855f;
        float f14 = p10 > 0.20689656f ? p10 * p10 * p10 : (p10 - 0.13793103f) * 0.12841855f;
        float[] fArr = z0.B;
        return (((long) Float.floatToIntBits(f13 * fArr[0])) << 32) | (((long) Float.floatToIntBits(f14 * fArr[1])) & 4294967295L);
    }

    public final float[] f(float[] fArr) {
        fArr[0] = f1.p(fArr[0], 0.0f, 100.0f);
        fArr[1] = f1.p(fArr[1], -128.0f, 128.0f);
        float p10 = f1.p(fArr[2], -128.0f, 128.0f);
        fArr[2] = p10;
        float f10 = (fArr[0] + 16.0f) / 116.0f;
        float f11 = (fArr[1] * 0.002f) + f10;
        float f12 = f10 - (p10 * 0.005f);
        float f13 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        float f14 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
        float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = z0.B;
        fArr[0] = f13 * fArr2[0];
        fArr[1] = f14 * fArr2[1];
        fArr[2] = f15 * fArr2[2];
        return fArr;
    }

    public final float g(float f10, float f11, float f12) {
        float p10 = ((f1.p(f10, 0.0f, 100.0f) + 16.0f) / 116.0f) - (f1.p(f12, -128.0f, 128.0f) * 0.005f);
        return (p10 > 0.20689656f ? p10 * p10 * p10 : 0.12841855f * (p10 - 0.13793103f)) * z0.B[2];
    }

    public final long h(float f10, float f11, float f12, float f13, c cVar) {
        j.f(cVar, "colorSpace");
        float[] fArr = z0.B;
        float f14 = f10 / fArr[0];
        float f15 = f11 / fArr[1];
        float f16 = f12 / fArr[2];
        float pow = f14 > 0.008856452f ? (float) Math.pow((double) f14, (double) 0.33333334f) : (f14 * 7.787037f) + 0.13793103f;
        float pow2 = f15 > 0.008856452f ? (float) Math.pow((double) f15, (double) 0.33333334f) : (f15 * 7.787037f) + 0.13793103f;
        return a.e(f1.p((116.0f * pow2) - 16.0f, 0.0f, 100.0f), f1.p((pow - pow2) * 500.0f, -128.0f, 128.0f), f1.p((pow2 - (f16 > 0.008856452f ? (float) Math.pow((double) f16, (double) 0.33333334f) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f13, cVar);
    }
}
