package j0;

import androidx.fragment.app.z0;
import j0.a;
import sf.j;

public final class d {
    public static c a(c cVar) {
        w wVar = z0.f2177c;
        a.C0180a aVar = a.f9675b;
        j.f(cVar, "<this>");
        if (!b.a(cVar.f9683b, b.f9677a)) {
            return cVar;
        }
        u uVar = (u) cVar;
        if (c(uVar.f9718d, wVar)) {
            return cVar;
        }
        float[] a10 = wVar.a();
        float[] e10 = e(b(aVar.f9676a, uVar.f9718d.a(), a10), uVar.f9723i);
        return new u(uVar.f9682a, uVar.f9722h, wVar, e10, uVar.f9725k, uVar.m, uVar.f9719e, uVar.f9720f, uVar.f9721g, -1);
    }

    public static final float[] b(float[] fArr, float[] fArr2, float[] fArr3) {
        j.f(fArr, "matrix");
        g(fArr, fArr2);
        g(fArr, fArr3);
        return e(d(fArr), f(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean c(w wVar, w wVar2) {
        j.f(wVar, "a");
        j.f(wVar2, "b");
        if (wVar == wVar2) {
            return true;
        }
        return Math.abs(wVar.f9738a - wVar2.f9738a) < 0.001f && Math.abs(wVar.f9739b - wVar2.f9739b) < 0.001f;
    }

    public static final float[] d(float[] fArr) {
        float[] fArr2 = fArr;
        j.f(fArr2, "m");
        float f10 = fArr2[0];
        float f11 = fArr2[3];
        float f12 = fArr2[6];
        float f13 = fArr2[1];
        float f14 = fArr2[4];
        float f15 = fArr2[7];
        float f16 = fArr2[2];
        float f17 = fArr2[5];
        float f18 = fArr2[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f12 * f21) + (f11 * f20) + (f10 * f19);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f19 / f22;
        fArr3[1] = f20 / f22;
        fArr3[2] = f21 / f22;
        fArr3[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr3[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr3[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr3[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr3[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr3[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr3;
    }

    public static final float[] e(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        j.f(fArr3, "lhs");
        j.f(fArr4, "rhs");
        float f10 = fArr3[3];
        float f11 = fArr4[1];
        float f12 = f10 * f11;
        float f13 = fArr3[6];
        float f14 = fArr4[2];
        float f15 = f13 * f14;
        float f16 = fArr3[1];
        float f17 = fArr4[0];
        float f18 = fArr3[4];
        float f19 = f11 * f18;
        float f20 = fArr3[7];
        float f21 = f20 * f14;
        float f22 = fArr3[5];
        float f23 = fArr4[1] * f22;
        float f24 = fArr3[8];
        float f25 = f14 * f24;
        float f26 = fArr3[0];
        float f27 = fArr4[4];
        float f28 = (f10 * f27) + (fArr4[3] * f26);
        float f29 = fArr4[5];
        float f30 = fArr3[1];
        float f31 = fArr4[3];
        float f32 = f18 * f27;
        float f33 = fArr3[2];
        float f34 = f22 * fArr4[4];
        float f35 = f26 * fArr4[6];
        float f36 = fArr3[3];
        float f37 = fArr4[7];
        float f38 = (f36 * f37) + f35;
        float f39 = fArr4[8];
        float f40 = fArr4[6];
        float f41 = f20 * f39;
        float f42 = f24 * f39;
        return new float[]{f15 + f12 + (fArr3[0] * fArr4[0]), f21 + f19 + (f16 * f17), f25 + f23 + (fArr3[2] * f17), (f13 * f29) + f28, (f20 * f29) + f32 + (f30 * f31), (f29 * f24) + f34 + (f31 * f33), (f13 * f39) + f38, f41 + (fArr3[4] * f37) + (f30 * f40), f42 + (fArr3[5] * fArr4[7]) + (f33 * f40)};
    }

    public static final float[] f(float[] fArr, float[] fArr2) {
        j.f(fArr2, "rhs");
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f10, fArr2[4] * f11, fArr2[5] * f12, f10 * fArr2[6], f11 * fArr2[7], f12 * fArr2[8]};
    }

    public static final void g(float[] fArr, float[] fArr2) {
        j.f(fArr, "lhs");
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        fArr2[1] = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f13 = fArr[2] * f10;
        fArr2[2] = (fArr[8] * f12) + (fArr[5] * f11) + f13;
    }

    public static final float h(float[] fArr, float f10, float f11, float f12) {
        j.f(fArr, "lhs");
        float f13 = fArr[0] * f10;
        return (fArr[6] * f12) + (fArr[3] * f11) + f13;
    }

    public static final float i(float[] fArr, float f10, float f11, float f12) {
        j.f(fArr, "lhs");
        float f13 = fArr[1] * f10;
        return (fArr[7] * f12) + (fArr[4] * f11) + f13;
    }

    public static final float j(float[] fArr, float f10, float f11, float f12) {
        j.f(fArr, "lhs");
        float f13 = fArr[2] * f10;
        return (fArr[8] * f12) + (fArr[5] * f11) + f13;
    }
}
