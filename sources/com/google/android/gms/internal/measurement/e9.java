package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.logging.Logger;

public final class e9 {

    /* renamed from: f  reason: collision with root package name */
    public static final e9 f5259f = new e9(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f5260a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5261b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f5262c;

    /* renamed from: d  reason: collision with root package name */
    public int f5263d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5264e;

    public e9() {
        this(0, new int[8], new Object[8], true);
    }

    public e9(int i8, int[] iArr, Object[] objArr, boolean z10) {
        this.f5263d = -1;
        this.f5260a = i8;
        this.f5261b = iArr;
        this.f5262c = objArr;
        this.f5264e = z10;
    }

    public static e9 b() {
        return new e9(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int i8;
        int i10;
        int i11;
        int i12 = this.f5263d;
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f5260a; i14++) {
            int i15 = this.f5261b[i14];
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i17 != 0) {
                if (i17 == 1) {
                    ((Long) this.f5262c[i14]).longValue();
                    i8 = o6.v(i16 << 3) + 8;
                } else if (i17 == 2) {
                    Logger logger = o6.f5446d;
                    int c3 = ((k6) this.f5262c[i14]).c();
                    i8 = o6.v(i16 << 3) + o6.v(c3) + c3;
                } else if (i17 == 3) {
                    int i18 = i16 << 3;
                    Logger logger2 = o6.f5446d;
                    i10 = ((e9) this.f5262c[i14]).a();
                    int v3 = o6.v(i18);
                    i11 = v3 + v3;
                } else if (i17 == 5) {
                    ((Integer) this.f5262c[i14]).intValue();
                    i8 = o6.v(i16 << 3) + 4;
                } else {
                    int i19 = o7.f5449a;
                    throw new IllegalStateException(new n7());
                }
                i13 += i8;
            } else {
                int i20 = i16 << 3;
                i10 = o6.w(((Long) this.f5262c[i14]).longValue());
                i11 = o6.v(i20);
            }
            i8 = i11 + i10;
            i13 += i8;
        }
        this.f5263d = i13;
        return i13;
    }

    public final void c(int i8, Object obj) {
        if (this.f5264e) {
            e(this.f5260a + 1);
            int[] iArr = this.f5261b;
            int i10 = this.f5260a;
            iArr[i10] = i8;
            this.f5262c[i10] = obj;
            this.f5260a = i10 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(p6 p6Var) {
        if (this.f5260a != 0) {
            for (int i8 = 0; i8 < this.f5260a; i8++) {
                int i10 = this.f5261b[i8];
                Object obj = this.f5262c[i8];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    p6Var.n(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    p6Var.j(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    p6Var.f(i12, (k6) obj);
                } else if (i11 == 3) {
                    p6Var.f5465a.n(i12, 3);
                    ((e9) obj).d(p6Var);
                    p6Var.f5465a.n(i12, 4);
                } else if (i11 == 5) {
                    p6Var.i(i12, ((Integer) obj).intValue());
                } else {
                    int i13 = o7.f5449a;
                    throw new RuntimeException(new n7());
                }
            }
        }
    }

    public final void e(int i8) {
        int[] iArr = this.f5261b;
        if (i8 > iArr.length) {
            int i10 = this.f5260a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i8) {
                i8 = i11;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f5261b = Arrays.copyOf(iArr, i8);
            this.f5262c = Arrays.copyOf(this.f5262c, i8);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj;
        int i8 = this.f5260a;
        if (i8 == e9Var.f5260a) {
            int[] iArr = this.f5261b;
            int[] iArr2 = e9Var.f5261b;
            int i10 = 0;
            while (true) {
                if (i10 >= i8) {
                    Object[] objArr = this.f5262c;
                    Object[] objArr2 = e9Var.f5262c;
                    int i11 = this.f5260a;
                    int i12 = 0;
                    while (i12 < i11) {
                        if (objArr[i12].equals(objArr2[i12])) {
                            i12++;
                        }
                    }
                    return true;
                } else if (iArr[i10] != iArr2[i10]) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f5260a;
        int i10 = i8 + 527;
        int[] iArr = this.f5261b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i8; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 * 31) + i12;
        Object[] objArr = this.f5262c;
        int i15 = this.f5260a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + i11;
    }
}
