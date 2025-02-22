package o;

import cb.b;

public final class d<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f12018e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f12019a = false;

    /* renamed from: b  reason: collision with root package name */
    public long[] f12020b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f12021c;

    /* renamed from: d  reason: collision with root package name */
    public int f12022d;

    public d() {
        int i8;
        int i10 = 4;
        while (true) {
            i8 = 80;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (80 <= i11) {
                i8 = i11;
                break;
            }
            i10++;
        }
        int i12 = i8 / 8;
        this.f12020b = new long[i12];
        this.f12021c = new Object[i12];
    }

    public final void a() {
        int i8 = this.f12022d;
        Object[] objArr = this.f12021c;
        for (int i10 = 0; i10 < i8; i10++) {
            objArr[i10] = null;
        }
        this.f12022d = 0;
        this.f12019a = false;
    }

    /* renamed from: b */
    public final d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f12020b = (long[]) this.f12020b.clone();
            dVar.f12021c = (Object[]) this.f12021c.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void f() {
        int i8 = this.f12022d;
        long[] jArr = this.f12020b;
        Object[] objArr = this.f12021c;
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            Object obj = objArr[i11];
            if (obj != f12018e) {
                if (i11 != i10) {
                    jArr[i10] = jArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        this.f12019a = false;
        this.f12022d = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f12021c[r4];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.lang.Long r3, long r4) {
        /*
            r2 = this;
            long[] r0 = r2.f12020b
            int r1 = r2.f12022d
            int r4 = cb.b.o(r0, r1, r4)
            if (r4 < 0) goto L_0x0014
            java.lang.Object[] r5 = r2.f12021c
            r4 = r5[r4]
            java.lang.Object r5 = f12018e
            if (r4 != r5) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r4
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.g(java.lang.Long, long):java.lang.Object");
    }

    public final long h(int i8) {
        if (this.f12019a) {
            f();
        }
        return this.f12020b[i8];
    }

    public final void i(Object obj, long j10) {
        int o10 = b.o(this.f12020b, this.f12022d, j10);
        if (o10 >= 0) {
            this.f12021c[o10] = obj;
            return;
        }
        int i8 = ~o10;
        int i10 = this.f12022d;
        if (i8 < i10) {
            Object[] objArr = this.f12021c;
            if (objArr[i8] == f12018e) {
                this.f12020b[i8] = j10;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f12019a && i10 >= this.f12020b.length) {
            f();
            i8 = ~b.o(this.f12020b, this.f12022d, j10);
        }
        int i11 = this.f12022d;
        if (i11 >= this.f12020b.length) {
            int i12 = (i11 + 1) * 8;
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
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr2 = new Object[i15];
            long[] jArr2 = this.f12020b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f12021c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12020b = jArr;
            this.f12021c = objArr2;
        }
        int i16 = this.f12022d - i8;
        if (i16 != 0) {
            long[] jArr3 = this.f12020b;
            int i17 = i8 + 1;
            System.arraycopy(jArr3, i8, jArr3, i17, i16);
            Object[] objArr4 = this.f12021c;
            System.arraycopy(objArr4, i8, objArr4, i17, this.f12022d - i8);
        }
        this.f12020b[i8] = j10;
        this.f12021c[i8] = obj;
        this.f12022d++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f12021c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f12020b
            int r1 = r2.f12022d
            int r3 = cb.b.o(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f12021c
            r0 = r4[r3]
            java.lang.Object r1 = f12018e
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f12019a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.j(long):void");
    }

    public final int k() {
        if (this.f12019a) {
            f();
        }
        return this.f12022d;
    }

    public final E l(int i8) {
        if (this.f12019a) {
            f();
        }
        return this.f12021c[i8];
    }

    public final String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12022d * 28);
        sb2.append('{');
        for (int i8 = 0; i8 < this.f12022d; i8++) {
            if (i8 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i8));
            sb2.append('=');
            Object l10 = l(i8);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
