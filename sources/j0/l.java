package j0;

import androidx.databinding.a;
import d2.f1;
import sf.j;

public final class l extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f9703d;

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f9704e;

    /* renamed from: f  reason: collision with root package name */
    public static final float[] f9705f;

    /* renamed from: g  reason: collision with root package name */
    public static final float[] f9706g;

    static {
        float[] fArr = {0.964212f, 1.0f, 0.8251883f};
        float[] fArr2 = {0.95042855f, 1.0f, 1.0889004f};
        float[] e10 = d.e(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.b(a.f9675b.f9676a, fArr, fArr2));
        f9703d = e10;
        float[] fArr3 = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f9704e = fArr3;
        f9705f = d.d(e10);
        f9706g = d.d(fArr3);
    }

    public l() {
        super("Oklab", b.f9679c, 17);
    }

    public final float[] a(float[] fArr) {
        d.g(f9703d, fArr);
        double d10 = (double) 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow((double) Math.abs(fArr[0]), d10));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow((double) Math.abs(fArr[1]), d10));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow((double) Math.abs(fArr[2]), d10));
        d.g(f9704e, fArr);
        return fArr;
    }

    public final float b(int i8) {
        return i8 == 0 ? 1.0f : 0.5f;
    }

    public final float c(int i8) {
        return i8 == 0 ? 0.0f : -0.5f;
    }

    public final long e(float f10, float f11, float f12) {
        float p10 = f1.p(f10, 0.0f, 1.0f);
        float p11 = f1.p(f11, -0.5f, 0.5f);
        float p12 = f1.p(f12, -0.5f, 0.5f);
        float[] fArr = f9706g;
        float h3 = d.h(fArr, p10, p11, p12);
        float i8 = d.i(fArr, p10, p11, p12);
        float j10 = d.j(fArr, p10, p11, p12);
        float f13 = h3 * h3 * h3;
        float f14 = i8 * i8 * i8;
        float f15 = j10 * j10 * j10;
        float[] fArr2 = f9705f;
        return (((long) Float.floatToIntBits(d.h(fArr2, f13, f14, f15))) << 32) | (((long) Float.floatToIntBits(d.i(fArr2, f13, f14, f15))) & 4294967295L);
    }

    public final float[] f(float[] fArr) {
        fArr[0] = f1.p(fArr[0], 0.0f, 1.0f);
        fArr[1] = f1.p(fArr[1], -0.5f, 0.5f);
        fArr[2] = f1.p(fArr[2], -0.5f, 0.5f);
        d.g(f9706g, fArr);
        float f10 = fArr[0];
        fArr[0] = f10 * f10 * f10;
        float f11 = fArr[1];
        fArr[1] = f11 * f11 * f11;
        float f12 = fArr[2];
        fArr[2] = f12 * f12 * f12;
        d.g(f9705f, fArr);
        return fArr;
    }

    public final float g(float f10, float f11, float f12) {
        float p10 = f1.p(f10, 0.0f, 1.0f);
        float p11 = f1.p(f11, -0.5f, 0.5f);
        float p12 = f1.p(f12, -0.5f, 0.5f);
        float[] fArr = f9706g;
        float h3 = d.h(fArr, p10, p11, p12);
        float i8 = d.i(fArr, p10, p11, p12);
        float j10 = d.j(fArr, p10, p11, p12);
        float f13 = j10 * j10 * j10;
        return d.j(f9705f, h3 * h3 * h3, i8 * i8 * i8, f13);
    }

    public final long h(float f10, float f11, float f12, float f13, c cVar) {
        j.f(cVar, "colorSpace");
        float[] fArr = f9703d;
        float h3 = d.h(fArr, f10, f11, f12);
        float i8 = d.i(fArr, f10, f11, f12);
        float j10 = d.j(fArr, f10, f11, f12);
        double d10 = (double) 0.33333334f;
        float signum = Math.signum(h3) * ((float) Math.pow((double) Math.abs(h3), d10));
        float signum2 = Math.signum(i8) * ((float) Math.pow((double) Math.abs(i8), d10));
        float signum3 = Math.signum(j10) * ((float) Math.pow((double) Math.abs(j10), d10));
        float[] fArr2 = f9704e;
        return a.e(d.h(fArr2, signum, signum2, signum3), d.i(fArr2, signum, signum2, signum3), d.j(fArr2, signum, signum2, signum3), f13, cVar);
    }
}
