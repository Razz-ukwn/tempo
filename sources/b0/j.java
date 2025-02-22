package b0;

import gf.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f2921a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2922b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f2923c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int[] f2924d;

    /* renamed from: e  reason: collision with root package name */
    public int f2925e;

    public j() {
        int[] iArr = new int[16];
        int i8 = 0;
        while (i8 < 16) {
            int i10 = i8 + 1;
            iArr[i8] = i10;
            i8 = i10;
        }
        this.f2924d = iArr;
    }

    public final int a(int i8) {
        int i10 = this.f2921a + 1;
        int[] iArr = this.f2922b;
        int length = iArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            l.W(iArr, iArr2, 0, 14);
            l.W(this.f2923c, iArr3, 0, 14);
            this.f2922b = iArr2;
            this.f2923c = iArr3;
        }
        int i12 = this.f2921a;
        this.f2921a = i12 + 1;
        int length2 = this.f2924d.length;
        if (this.f2925e >= length2) {
            int i13 = length2 * 2;
            int[] iArr4 = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                iArr4[i14] = i15;
                i14 = i15;
            }
            l.W(this.f2924d, iArr4, 0, 14);
            this.f2924d = iArr4;
        }
        int i16 = this.f2925e;
        int[] iArr5 = this.f2924d;
        this.f2925e = iArr5[i16];
        int[] iArr6 = this.f2922b;
        iArr6[i12] = i8;
        this.f2923c[i12] = i16;
        iArr5[i16] = i12;
        int i17 = iArr6[i12];
        while (i12 > 0) {
            int i18 = ((i12 + 1) >> 1) - 1;
            if (iArr6[i18] <= i17) {
                break;
            }
            b(i18, i12);
            i12 = i18;
        }
        return i16;
    }

    public final void b(int i8, int i10) {
        int[] iArr = this.f2922b;
        int[] iArr2 = this.f2923c;
        int[] iArr3 = this.f2924d;
        int i11 = iArr[i8];
        iArr[i8] = iArr[i10];
        iArr[i10] = i11;
        int i12 = iArr2[i8];
        iArr2[i8] = iArr2[i10];
        iArr2[i10] = i12;
        iArr3[iArr2[i8]] = i8;
        iArr3[iArr2[i10]] = i10;
    }
}
