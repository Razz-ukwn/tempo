package androidx.compose.ui.platform;

import a1.a0;
import a1.t;
import rf.l;
import sf.j;
import sf.k;

public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1355a = a.f1356a;

    public static final class a extends k implements l<t, a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1356a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            t tVar = (t) obj;
            j.f(tVar, "it");
            return new a0(tVar);
        }
    }

    public static final void a(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float b10 = b(fArr4, 0, fArr3, 0);
        float b11 = b(fArr4, 0, fArr3, 1);
        float b12 = b(fArr4, 0, fArr3, 2);
        float b13 = b(fArr4, 0, fArr3, 3);
        float b14 = b(fArr4, 1, fArr3, 0);
        float b15 = b(fArr4, 1, fArr3, 1);
        float b16 = b(fArr4, 1, fArr3, 2);
        float b17 = b(fArr4, 1, fArr3, 3);
        float b18 = b(fArr4, 2, fArr3, 0);
        float b19 = b(fArr4, 2, fArr3, 1);
        float b20 = b(fArr4, 2, fArr3, 2);
        float b21 = b(fArr4, 2, fArr3, 3);
        float b22 = b(fArr4, 3, fArr3, 0);
        float b23 = b(fArr4, 3, fArr3, 1);
        float b24 = b(fArr4, 3, fArr3, 2);
        float b25 = b(fArr4, 3, fArr3, 3);
        fArr3[0] = b10;
        fArr3[1] = b11;
        fArr3[2] = b12;
        fArr3[3] = b13;
        fArr3[4] = b14;
        fArr3[5] = b15;
        fArr3[6] = b16;
        fArr3[7] = b17;
        fArr3[8] = b18;
        fArr3[9] = b19;
        fArr3[10] = b20;
        fArr3[11] = b21;
        fArr3[12] = b22;
        fArr3[13] = b23;
        fArr3[14] = b24;
        fArr3[15] = b25;
    }

    public static final float b(float[] fArr, int i8, float[] fArr2, int i10) {
        int i11 = i8 * 4;
        float f10 = (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11 + 0] * fArr2[0 + i10]);
        return (fArr[i11 + 3] * fArr2[12 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + f10;
    }
}
