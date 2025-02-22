package qg;

import sf.j;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public int f13752a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f13753b = new int[10];

    public final int a() {
        if ((this.f13752a & 128) != 0) {
            return this.f13753b[7];
        }
        return 65535;
    }

    public final void b(v vVar) {
        j.f(vVar, "other");
        int i8 = 0;
        while (i8 < 10) {
            int i10 = i8 + 1;
            boolean z10 = true;
            if (((1 << i8) & vVar.f13752a) == 0) {
                z10 = false;
            }
            if (z10) {
                c(i8, vVar.f13753b[i8]);
            }
            i8 = i10;
        }
    }

    public final void c(int i8, int i10) {
        if (i8 >= 0) {
            int[] iArr = this.f13753b;
            if (i8 < iArr.length) {
                this.f13752a = (1 << i8) | this.f13752a;
                iArr[i8] = i10;
            }
        }
    }
}
