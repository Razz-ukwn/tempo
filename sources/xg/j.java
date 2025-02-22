package xg;

import wg.d0;
import wg.e;
import wg.x;
import zf.a;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f17097a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(a.f17962b);
        sf.j.e(bytes, "this as java.lang.String).getBytes(charset)");
        f17097a = bytes;
    }

    public static final String a(e eVar, long j10) {
        sf.j.f(eVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.z(j11) == ((byte) 13)) {
                String Y = eVar.Y(j11);
                eVar.skip(2);
                return Y;
            }
        }
        String Y2 = eVar.Y(j10);
        eVar.skip(1);
        return Y2;
    }

    public static final int b(e eVar, x xVar, boolean z10) {
        int i8;
        int i10;
        byte[] bArr;
        d0 d0Var;
        int i11;
        e eVar2 = eVar;
        x xVar2 = xVar;
        sf.j.f(eVar2, "<this>");
        sf.j.f(xVar2, "options");
        d0 d0Var2 = eVar2.f16751a;
        int i12 = -2;
        if (d0Var2 == null) {
            return z10 ? -2 : -1;
        }
        int i13 = d0Var2.f16745b;
        int i14 = d0Var2.f16746c;
        byte[] bArr2 = d0Var2.f16744a;
        d0 d0Var3 = d0Var2;
        int i15 = -1;
        int i16 = 0;
        loop0:
        while (true) {
            int i17 = i16 + 1;
            int[] iArr = xVar2.f16805b;
            int i18 = iArr[i16];
            int i19 = i17 + 1;
            int i20 = iArr[i17];
            if (i20 != -1) {
                i15 = i20;
            }
            if (d0Var3 == null) {
                break;
            }
            if (i18 < 0) {
                int i21 = (i18 * -1) + i19;
                while (true) {
                    int i22 = i13 + 1;
                    int i23 = i19 + 1;
                    if ((bArr2[i13] & 255) != iArr[i19]) {
                        return i15;
                    }
                    boolean z11 = i23 == i21;
                    if (i22 == i14) {
                        sf.j.c(d0Var3);
                        d0 d0Var4 = d0Var3.f16749f;
                        sf.j.c(d0Var4);
                        i11 = d0Var4.f16745b;
                        int i24 = d0Var4.f16746c;
                        bArr = d0Var4.f16744a;
                        if (d0Var4 == d0Var2) {
                            if (!z11) {
                                break loop0;
                            }
                            i14 = i24;
                            d0Var = null;
                        } else {
                            int i25 = i24;
                            d0Var = d0Var4;
                            i14 = i25;
                        }
                    } else {
                        d0 d0Var5 = d0Var3;
                        bArr = bArr2;
                        i11 = i22;
                        d0Var = d0Var5;
                    }
                    if (z11) {
                        i8 = iArr[i23];
                        i10 = i11;
                        bArr2 = bArr;
                        d0Var3 = d0Var;
                        break;
                    }
                    i13 = i11;
                    bArr2 = bArr;
                    i19 = i23;
                    d0Var3 = d0Var;
                }
            } else {
                int i26 = i13 + 1;
                byte b10 = bArr2[i13] & 255;
                int i27 = i19 + i18;
                while (i19 != i27) {
                    if (b10 == iArr[i19]) {
                        i8 = iArr[i19 + i18];
                        if (i26 == i14) {
                            d0Var3 = d0Var3.f16749f;
                            sf.j.c(d0Var3);
                            i10 = d0Var3.f16745b;
                            i14 = d0Var3.f16746c;
                            bArr2 = d0Var3.f16744a;
                            if (d0Var3 == d0Var2) {
                                d0Var3 = null;
                            }
                        } else {
                            i10 = i26;
                        }
                    } else {
                        i19++;
                    }
                }
                return i15;
            }
            if (i8 >= 0) {
                return i8;
            }
            i16 = -i8;
            i13 = i10;
            i12 = -2;
        }
        return z10 ? i12 : i15;
    }
}
