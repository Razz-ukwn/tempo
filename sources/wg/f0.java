package wg;

import ag.d;
import androidx.appcompat.widget.a1;
import d.a;
import d2.f1;
import gf.l;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlinx.coroutines.internal.o;
import sf.j;

public final class f0 extends i {
    public final transient int[] B;

    /* renamed from: e  reason: collision with root package name */
    public final transient byte[][] f16758e;

    public f0(byte[][] bArr, int[] iArr) {
        super(i.f16760d.f16761a);
        this.f16758e = bArr;
        this.B = iArr;
    }

    public final String a() {
        return t().a();
    }

    public final i c(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        byte[][] bArr = this.f16758e;
        int length = bArr.length;
        int i8 = 0;
        int i10 = 0;
        while (i8 < length) {
            int[] iArr = this.B;
            int i11 = iArr[length + i8];
            int i12 = iArr[i8];
            instance.update(bArr[i8], i11, i12 - i10);
            i8++;
            i10 = i12;
        }
        byte[] digest = instance.digest();
        j.e(digest, "digestBytes");
        return new i(digest);
    }

    public final int d() {
        return this.B[this.f16758e.length - 1];
    }

    public final String e() {
        return t().e();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (iVar.d() != d() || !l(0, iVar, d())) {
                return false;
            }
        }
        return true;
    }

    public final int f(byte[] bArr, int i8) {
        j.f(bArr, "other");
        return t().f(bArr, i8);
    }

    public final byte[] h() {
        return s();
    }

    public final int hashCode() {
        int i8 = this.f16762b;
        if (i8 != 0) {
            return i8;
        }
        byte[][] bArr = this.f16758e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.B;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f16762b = i11;
        return i11;
    }

    public final byte i(int i8) {
        byte[][] bArr = this.f16758e;
        int[] iArr = this.B;
        d.d((long) iArr[bArr.length - 1], (long) i8, 1);
        int c3 = o.c(this, i8);
        return bArr[c3][(i8 - (c3 == 0 ? 0 : iArr[c3 - 1])) + iArr[bArr.length + c3]];
    }

    public final int j(byte[] bArr, int i8) {
        j.f(bArr, "other");
        return t().j(bArr, i8);
    }

    public final boolean l(int i8, i iVar, int i10) {
        j.f(iVar, "other");
        if (i8 < 0 || i8 > d() - i10) {
            return false;
        }
        int i11 = i10 + i8;
        int c3 = o.c(this, i8);
        int i12 = 0;
        while (i8 < i11) {
            int[] iArr = this.B;
            int i13 = c3 == 0 ? 0 : iArr[c3 - 1];
            byte[][] bArr = this.f16758e;
            int i14 = iArr[bArr.length + c3];
            int min = Math.min(i11, (iArr[c3] - i13) + i13) - i8;
            if (!iVar.m(i12, bArr[c3], (i8 - i13) + i14, min)) {
                return false;
            }
            i12 += min;
            i8 += min;
            c3++;
        }
        return true;
    }

    public final boolean m(int i8, byte[] bArr, int i10, int i11) {
        j.f(bArr, "other");
        if (i8 < 0 || i8 > d() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i12 = i11 + i8;
        int c3 = o.c(this, i8);
        while (i8 < i12) {
            int[] iArr = this.B;
            int i13 = c3 == 0 ? 0 : iArr[c3 - 1];
            byte[][] bArr2 = this.f16758e;
            int i14 = iArr[bArr2.length + c3];
            int min = Math.min(i12, (iArr[c3] - i13) + i13) - i8;
            if (!d.c((i8 - i13) + i14, i10, min, bArr2[c3], bArr)) {
                return false;
            }
            i10 += min;
            i8 += min;
            c3++;
        }
        return true;
    }

    public final i n(int i8, int i10) {
        int i11 = d.i(this, i10);
        int i12 = 0;
        if (i8 >= 0) {
            if (i11 <= d()) {
                int i13 = i11 - i8;
                if (!(i13 >= 0)) {
                    throw new IllegalArgumentException(androidx.activity.result.d.a("endIndex=", i11, " < beginIndex=", i8).toString());
                } else if (i8 == 0 && i11 == d()) {
                    return this;
                } else {
                    if (i8 == i11) {
                        return i.f16760d;
                    }
                    int c3 = o.c(this, i8);
                    int c10 = o.c(this, i11 - 1);
                    int i14 = c10 + 1;
                    byte[][] bArr = this.f16758e;
                    j.f(bArr, "<this>");
                    f1.u(i14, bArr.length);
                    Object[] copyOfRange = Arrays.copyOfRange(bArr, c3, i14);
                    j.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
                    byte[][] bArr2 = (byte[][]) copyOfRange;
                    int[] iArr = new int[(bArr2.length * 2)];
                    int[] iArr2 = this.B;
                    if (c3 <= c10) {
                        int i15 = 0;
                        int i16 = c3;
                        while (true) {
                            iArr[i15] = Math.min(iArr2[i16] - i8, i13);
                            int i17 = i15 + 1;
                            iArr[i15 + bArr2.length] = iArr2[bArr.length + i16];
                            if (i16 == c10) {
                                break;
                            }
                            i16++;
                            i15 = i17;
                        }
                    }
                    if (c3 != 0) {
                        i12 = iArr2[c3 - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i8 - i12) + iArr[length];
                    return new f0(bArr2, iArr);
                }
            } else {
                StringBuilder b10 = a1.b("endIndex=", i11, " > length(");
                b10.append(d());
                b10.append(')');
                throw new IllegalArgumentException(b10.toString().toString());
            }
        } else {
            throw new IllegalArgumentException(a.a("beginIndex=", i8, " < 0").toString());
        }
    }

    public final i p() {
        return t().p();
    }

    public final void r(e eVar, int i8) {
        j.f(eVar, "buffer");
        int i10 = 0 + i8;
        int c3 = o.c(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.B;
            int i12 = c3 == 0 ? 0 : iArr[c3 - 1];
            byte[][] bArr = this.f16758e;
            int i13 = iArr[bArr.length + c3];
            int min = Math.min(i10, (iArr[c3] - i12) + i12) - i11;
            int i14 = (i11 - i12) + i13;
            d0 d0Var = new d0(bArr[c3], i14, i14 + min, true);
            d0 d0Var2 = eVar.f16751a;
            if (d0Var2 == null) {
                d0Var.f16750g = d0Var;
                d0Var.f16749f = d0Var;
                eVar.f16751a = d0Var;
            } else {
                d0 d0Var3 = d0Var2.f16750g;
                j.c(d0Var3);
                d0Var3.b(d0Var);
            }
            i11 += min;
            c3++;
        }
        eVar.f16752b += (long) i8;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f16758e;
        int length = bArr2.length;
        int i8 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < length) {
            int[] iArr = this.B;
            int i12 = iArr[length + i8];
            int i13 = iArr[i8];
            int i14 = i13 - i10;
            l.T(i11, i12, i12 + i14, bArr2[i8], bArr);
            i11 += i14;
            i8++;
            i10 = i13;
        }
        return bArr;
    }

    public final i t() {
        return new i(s());
    }

    public final String toString() {
        return t().toString();
    }
}
