package j0;

import androidx.databinding.a;
import d2.f1;
import sf.j;

public final class x extends c {
    public x() {
        super("Generic XYZ", b.f9678b, 14);
    }

    public static float i(float f10) {
        return f1.p(f10, -2.0f, 2.0f);
    }

    public final float[] a(float[] fArr) {
        fArr[0] = i(fArr[0]);
        fArr[1] = i(fArr[1]);
        fArr[2] = i(fArr[2]);
        return fArr;
    }

    public final float b(int i8) {
        return 2.0f;
    }

    public final float c(int i8) {
        return -2.0f;
    }

    public final long e(float f10, float f11, float f12) {
        float i8 = i(f10);
        float i10 = i(f11);
        long floatToIntBits = (long) Float.floatToIntBits(i8);
        return (((long) Float.floatToIntBits(i10)) & 4294967295L) | (floatToIntBits << 32);
    }

    public final float[] f(float[] fArr) {
        fArr[0] = i(fArr[0]);
        fArr[1] = i(fArr[1]);
        fArr[2] = i(fArr[2]);
        return fArr;
    }

    public final float g(float f10, float f11, float f12) {
        return i(f12);
    }

    public final long h(float f10, float f11, float f12, float f13, c cVar) {
        j.f(cVar, "colorSpace");
        return a.e(i(f10), i(f11), i(f12), f13, cVar);
    }
}
