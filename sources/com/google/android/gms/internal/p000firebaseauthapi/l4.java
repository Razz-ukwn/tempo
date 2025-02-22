package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l4  reason: invalid package */
public final class l4 {

    /* renamed from: f  reason: collision with root package name */
    public static final l4 f4703f = new l4(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f4704a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f4705b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f4706c;

    /* renamed from: d  reason: collision with root package name */
    public int f4707d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4708e;

    public l4() {
        this(0, new int[8], new Object[8], true);
    }

    public l4(int i8, int[] iArr, Object[] objArr, boolean z10) {
        this.f4707d = -1;
        this.f4704a = i8;
        this.f4705b = iArr;
        this.f4706c = objArr;
        this.f4708e = z10;
    }

    public static l4 b() {
        return new l4(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int i8;
        int i10;
        int i11;
        int i12 = this.f4707d;
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f4704a; i14++) {
            int i15 = this.f4705b[i14];
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i17 != 0) {
                if (i17 == 1) {
                    ((Long) this.f4706c[i14]).longValue();
                    i8 = y1.j(i16 << 3) + 8;
                } else if (i17 == 2) {
                    Logger logger = y1.f5090b;
                    int c3 = ((q1) this.f4706c[i14]).c();
                    i8 = y1.j(i16 << 3) + y1.j(c3) + c3;
                } else if (i17 == 3) {
                    int i18 = i16 << 3;
                    Logger logger2 = y1.f5090b;
                    i10 = ((l4) this.f4706c[i14]).a();
                    int j10 = y1.j(i18);
                    i11 = j10 + j10;
                } else if (i17 == 5) {
                    ((Integer) this.f4706c[i14]).intValue();
                    i8 = y1.j(i16 << 3) + 4;
                } else {
                    throw new IllegalStateException(w2.a());
                }
                i13 = i8 + i13;
            } else {
                int i19 = i16 << 3;
                i10 = y1.k(((Long) this.f4706c[i14]).longValue());
                i11 = y1.j(i19);
            }
            i8 = i11 + i10;
            i13 = i8 + i13;
        }
        this.f4707d = i13;
        return i13;
    }

    public final void c(int i8, Object obj) {
        if (this.f4708e) {
            e(this.f4704a + 1);
            int[] iArr = this.f4705b;
            int i10 = this.f4704a;
            iArr[i10] = i8;
            this.f4706c[i10] = obj;
            this.f4704a = i10 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(z1 z1Var) {
        if (this.f4704a != 0) {
            for (int i8 = 0; i8 < this.f4704a; i8++) {
                int i10 = this.f4705b[i8];
                Object obj = this.f4706c[i8];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    z1Var.n(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    z1Var.j(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    z1Var.f(i12, (q1) obj);
                } else if (i11 == 3) {
                    z1Var.f5119a.x(i12, 3);
                    ((l4) obj).d(z1Var);
                    z1Var.f5119a.x(i12, 4);
                } else if (i11 == 5) {
                    z1Var.i(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(w2.a());
                }
            }
        }
    }

    public final void e(int i8) {
        int[] iArr = this.f4705b;
        if (i8 > iArr.length) {
            int i10 = this.f4704a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i8) {
                i8 = i11;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f4705b = Arrays.copyOf(iArr, i8);
            this.f4706c = Arrays.copyOf(this.f4706c, i8);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        int i8 = this.f4704a;
        if (i8 == l4Var.f4704a) {
            int[] iArr = this.f4705b;
            int[] iArr2 = l4Var.f4705b;
            int i10 = 0;
            while (true) {
                if (i10 >= i8) {
                    Object[] objArr = this.f4706c;
                    Object[] objArr2 = l4Var.f4706c;
                    int i11 = this.f4704a;
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
        int i8 = this.f4704a;
        int i10 = i8 + 527;
        int[] iArr = this.f4705b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i8; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 * 31) + i12;
        Object[] objArr = this.f4706c;
        int i15 = this.f4704a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + i11;
    }
}
