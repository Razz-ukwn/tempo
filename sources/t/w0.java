package t;

import java.util.Arrays;
import sf.j;

public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public int[] f15266a = new int[10];

    /* renamed from: b  reason: collision with root package name */
    public int f15267b;

    public final int a() {
        int[] iArr = this.f15266a;
        int i8 = this.f15267b - 1;
        this.f15267b = i8;
        return iArr[i8];
    }

    public final void b(int i8) {
        int i10 = this.f15267b;
        int[] iArr = this.f15266a;
        if (i10 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            j.e(copyOf, "copyOf(this, newSize)");
            this.f15266a = copyOf;
        }
        int[] iArr2 = this.f15266a;
        int i11 = this.f15267b;
        this.f15267b = i11 + 1;
        iArr2[i11] = i8;
    }
}
