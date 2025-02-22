package s0;

import java.util.Arrays;
import sf.j;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public int[] f14428a;

    /* renamed from: b  reason: collision with root package name */
    public int f14429b;

    public s(int i8) {
        this.f14428a = new int[i8];
    }

    public final int a() {
        int[] iArr = this.f14428a;
        int i8 = this.f14429b - 1;
        this.f14429b = i8;
        return iArr[i8];
    }

    public final void b(int i8, int i10, int i11) {
        int i12 = this.f14429b;
        int i13 = i12 + 3;
        int[] iArr = this.f14428a;
        if (i13 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            j.e(copyOf, "copyOf(this, newSize)");
            this.f14428a = copyOf;
        }
        int[] iArr2 = this.f14428a;
        iArr2[i12 + 0] = i8 + i11;
        iArr2[i12 + 1] = i10 + i11;
        iArr2[i12 + 2] = i11;
        this.f14429b = i13;
    }

    public final void c(int i8, int i10, int i11, int i12) {
        int i13 = this.f14429b;
        int i14 = i13 + 4;
        int[] iArr = this.f14428a;
        if (i14 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            j.e(copyOf, "copyOf(this, newSize)");
            this.f14428a = copyOf;
        }
        int[] iArr2 = this.f14428a;
        iArr2[i13 + 0] = i8;
        iArr2[i13 + 1] = i10;
        iArr2[i13 + 2] = i11;
        iArr2[i13 + 3] = i12;
        this.f14429b = i14;
    }

    public final void d(int i8, int i10) {
        if (i8 < i10) {
            int i11 = i8 - 3;
            for (int i12 = i8; i12 < i10; i12 += 3) {
                int[] iArr = this.f14428a;
                int i13 = iArr[i12];
                int i14 = iArr[i10];
                if (i13 < i14 || (i13 == i14 && iArr[i12 + 1] <= iArr[i10 + 1])) {
                    i11 += 3;
                    e(i11, i12);
                }
            }
            int i15 = i11 + 3;
            e(i15, i10);
            d(i8, i15 - 3);
            d(i15 + 3, i10);
        }
    }

    public final void e(int i8, int i10) {
        int[] iArr = this.f14428a;
        int i11 = iArr[i8];
        iArr[i8] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i8 + 1;
        int i13 = i10 + 1;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i8 + 2;
        int i16 = i10 + 2;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }
}
