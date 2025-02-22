package o;

import cb.b;

public final class g<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f12033e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f12034a = false;

    /* renamed from: b  reason: collision with root package name */
    public int[] f12035b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f12036c;

    /* renamed from: d  reason: collision with root package name */
    public int f12037d;

    public g() {
        int i8;
        int i10 = 4;
        while (true) {
            i8 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i8 = i11;
                break;
            }
            i10++;
        }
        int i12 = i8 / 4;
        this.f12035b = new int[i12];
        this.f12036c = new Object[i12];
    }

    public final void a(int i8, E e10) {
        int i10 = this.f12037d;
        if (i10 == 0 || i8 > this.f12035b[i10 - 1]) {
            if (this.f12034a && i10 >= this.f12035b.length) {
                g();
            }
            int i11 = this.f12037d;
            if (i11 >= this.f12035b.length) {
                int i12 = (i11 + 1) * 4;
                int i13 = 4;
                while (true) {
                    if (i13 >= 32) {
                        break;
                    }
                    int i14 = (1 << i13) - 12;
                    if (i12 <= i14) {
                        i12 = i14;
                        break;
                    }
                    i13++;
                }
                int i15 = i12 / 4;
                int[] iArr = new int[i15];
                Object[] objArr = new Object[i15];
                int[] iArr2 = this.f12035b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f12036c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f12035b = iArr;
                this.f12036c = objArr;
            }
            this.f12035b[i11] = i8;
            this.f12036c[i11] = e10;
            this.f12037d = i11 + 1;
            return;
        }
        i(i8, e10);
    }

    /* renamed from: b */
    public final g<E> clone() {
        try {
            g<E> gVar = (g) super.clone();
            gVar.f12035b = (int[]) this.f12035b.clone();
            gVar.f12036c = (Object[]) this.f12036c.clone();
            return gVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean f(int i8) {
        if (this.f12034a) {
            g();
        }
        return b.n(this.f12037d, i8, this.f12035b) >= 0;
    }

    public final void g() {
        int i8 = this.f12037d;
        int[] iArr = this.f12035b;
        Object[] objArr = this.f12036c;
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            Object obj = objArr[i11];
            if (obj != f12033e) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        this.f12034a = false;
        this.f12037d = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f12036c[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(int r3, java.lang.Integer r4) {
        /*
            r2 = this;
            int[] r0 = r2.f12035b
            int r1 = r2.f12037d
            int r3 = cb.b.n(r1, r3, r0)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.f12036c
            r3 = r0[r3]
            java.lang.Object r0 = f12033e
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.h(int, java.lang.Integer):java.lang.Object");
    }

    public final void i(int i8, E e10) {
        int n2 = b.n(this.f12037d, i8, this.f12035b);
        if (n2 >= 0) {
            this.f12036c[n2] = e10;
            return;
        }
        int i10 = ~n2;
        int i11 = this.f12037d;
        if (i10 < i11) {
            Object[] objArr = this.f12036c;
            if (objArr[i10] == f12033e) {
                this.f12035b[i10] = i8;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f12034a && i11 >= this.f12035b.length) {
            g();
            i10 = ~b.n(this.f12037d, i8, this.f12035b);
        }
        int i12 = this.f12037d;
        if (i12 >= this.f12035b.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr2 = new Object[i16];
            int[] iArr2 = this.f12035b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f12036c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12035b = iArr;
            this.f12036c = objArr2;
        }
        int i17 = this.f12037d - i10;
        if (i17 != 0) {
            int[] iArr3 = this.f12035b;
            int i18 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i18, i17);
            Object[] objArr4 = this.f12036c;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f12037d - i10);
        }
        this.f12035b[i10] = i8;
        this.f12036c[i10] = e10;
        this.f12037d++;
    }

    public final int j() {
        if (this.f12034a) {
            g();
        }
        return this.f12037d;
    }

    public final E k(int i8) {
        if (this.f12034a) {
            g();
        }
        return this.f12036c[i8];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12037d * 28);
        sb2.append('{');
        for (int i8 = 0; i8 < this.f12037d; i8++) {
            if (i8 > 0) {
                sb2.append(", ");
            }
            if (this.f12034a) {
                g();
            }
            sb2.append(this.f12035b[i8]);
            sb2.append('=');
            Object k10 = k(i8);
            if (k10 != this) {
                sb2.append(k10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
