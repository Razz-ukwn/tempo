package j1;

import java.util.Arrays;

public final class g implements Comparable<g> {
    public boolean B = false;
    public final float[] C = new float[9];
    public final float[] D = new float[9];
    public int E;
    public b[] F = new b[16];
    public int G = 0;
    public int H = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9783a;

    /* renamed from: b  reason: collision with root package name */
    public int f9784b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f9785c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f9786d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f9787e;

    public g(int i8) {
        this.E = i8;
    }

    public final void a(b bVar) {
        int i8 = 0;
        while (true) {
            int i10 = this.G;
            if (i8 >= i10) {
                b[] bVarArr = this.F;
                if (i10 >= bVarArr.length) {
                    this.F = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.F;
                int i11 = this.G;
                bVarArr2[i11] = bVar;
                this.G = i11 + 1;
                return;
            } else if (this.F[i8] != bVar) {
                i8++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i8 = this.G;
        int i10 = 0;
        while (i10 < i8) {
            if (this.F[i10] == bVar) {
                while (i10 < i8 - 1) {
                    b[] bVarArr = this.F;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.G--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.E = 5;
        this.f9786d = 0;
        this.f9784b = -1;
        this.f9785c = -1;
        this.f9787e = 0.0f;
        this.B = false;
        int i8 = this.G;
        for (int i10 = 0; i10 < i8; i10++) {
            this.F[i10] = null;
        }
        this.G = 0;
        this.H = 0;
        this.f9783a = false;
        Arrays.fill(this.D, 0.0f);
    }

    public final int compareTo(Object obj) {
        return this.f9784b - ((g) obj).f9784b;
    }

    public final void d(d dVar, float f10) {
        this.f9787e = f10;
        this.B = true;
        int i8 = this.G;
        this.f9785c = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            this.F[i10].h(dVar, this, false);
        }
        this.G = 0;
    }

    public final void e(d dVar, b bVar) {
        int i8 = this.G;
        for (int i10 = 0; i10 < i8; i10++) {
            this.F[i10].i(dVar, bVar, false);
        }
        this.G = 0;
    }

    public final String toString() {
        return "" + this.f9784b;
    }
}
