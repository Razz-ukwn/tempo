package ag;

import android.graphics.Typeface;
import b3.l0;
import b3.y;
import b3.z;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.i;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.s;
import j1.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import q7.e2;
import q7.g2;
import sf.j;
import yf.k;
import z0.p;
import z0.q;
import z0.v;

public final class b1 implements e2, v {

    /* renamed from: a  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.v f395a = new kotlinx.coroutines.internal.v("REMOVED_TASK");

    /* renamed from: b  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.v f396b = new kotlinx.coroutines.internal.v("CLOSED_EMPTY");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ b1 f397c = new b1();

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f398d = {16842948};

    public static void a(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static Typeface e(String str, p pVar, int i8) {
        boolean z10 = true;
        if ((i8 == 0) && j.a(pVar, p.f17606c)) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                j.e(typeface, "DEFAULT");
                return typeface;
            }
        }
        int c3 = l0.c(pVar, i8);
        if (!(str == null || str.length() == 0)) {
            z10 = false;
        }
        if (z10) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(c3);
            j.e(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, c3);
        j.e(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    public static final boolean f(int i8, int i10) {
        return i8 == i10;
    }

    public static final boolean g(z zVar, int i8) {
        boolean z10;
        j.f(zVar, "<this>");
        int i10 = z.F;
        Iterator it = k.o0(zVar, y.f3200a).iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            if (((z) it.next()).D == i8) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return true;
    }

    public static o h(com.google.android.gms.internal.measurement.k kVar, s sVar, c cVar, ArrayList arrayList) {
        String str = sVar.f5509a;
        if (kVar.a(str)) {
            o d10 = kVar.d(str);
            if (d10 instanceof i) {
                return ((i) d10).e(cVar, arrayList);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{str}));
        } else if ("hasOwnProperty".equals(str)) {
            f4.h("hasOwnProperty", 1, arrayList);
            return kVar.a(cVar.m((o) arrayList.get(0)).zzi()) ? o.f5432o : o.f5433p;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{str}));
        }
    }

    public static g5 i(g5 g5Var) {
        return ((g5Var instanceof i5) || (g5Var instanceof h5)) ? g5Var : g5Var instanceof Serializable ? new h5(g5Var) : new i5(g5Var);
    }

    public static byte[] j(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        long j10 = 67108863;
        long l10 = (l(bArr3, 0) >> 0) & 67108863;
        long l11 = (l(bArr3, 3) >> 2) & 67108863 & 67108611;
        long l12 = (l(bArr3, 6) >> 4) & 67108863 & 67092735;
        long l13 = (l(bArr3, 9) >> 6) & 67108863 & 66076671;
        long l14 = (l(bArr3, 12) >> 8) & 67108863 & 1048575;
        int i8 = 17;
        byte[] bArr5 = new byte[17];
        long j11 = 0;
        int i10 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        while (true) {
            int length = bArr4.length;
            if (i10 < length) {
                int min = Math.min(16, length - i10);
                System.arraycopy(bArr4, i10, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i8, (byte) 0);
                }
                long j16 = l14 * 5;
                long j17 = l13 * 5;
                long j18 = l12 * 5;
                long l15 = j15 + ((l(bArr5, 0) >> 0) & j10);
                long l16 = j11 + ((l(bArr5, 3) >> 2) & j10);
                long l17 = j12 + ((l(bArr5, 6) >> 4) & j10);
                long l18 = j13 + ((l(bArr5, 9) >> 6) & j10);
                long l19 = j14 + (((l(bArr5, 12) >> 8) & j10) | ((long) (bArr5[16] << 24)));
                long j19 = l16 * l10;
                long j20 = l16 * l11;
                long j21 = l17 * l10;
                long j22 = l16 * l12;
                long j23 = l17 * l11;
                long j24 = l18 * l10;
                long j25 = l16 * l13;
                long j26 = l17 * l12;
                long j27 = l18 * l11;
                long j28 = l19 * l10;
                long j29 = (l11 * 5 * l19) + (l18 * j18) + (l17 * j17) + (l16 * j16) + (l15 * l10);
                long j30 = j29 & 67108863;
                long j31 = l18 * j17;
                long j32 = j18 * l19;
                long j33 = j32 + j31 + (l17 * j16) + (l15 * l11) + j19 + (j29 >> 26);
                long j34 = j17 * l19;
                long j35 = j34 + (l18 * j16) + (l15 * l12) + j20 + j21 + (j33 >> 26);
                long j36 = (l19 * j16) + (l15 * l13) + j22 + j23 + j24 + (j35 >> 26);
                long j37 = (l15 * l14) + j25 + j26 + j27 + j28 + (j36 >> 26);
                long j38 = ((j37 >> 26) * 5) + j30;
                j11 = (j33 & 67108863) + (j38 >> 26);
                i10 += 16;
                j12 = j35 & 67108863;
                j13 = j36 & 67108863;
                j14 = j37 & 67108863;
                i8 = 17;
                j15 = j38 & 67108863;
                j10 = 67108863;
            } else {
                long j39 = j10;
                long j40 = j12 + (j11 >> 26);
                long j41 = j40 & j39;
                long j42 = j13 + (j40 >> 26);
                long j43 = j42 & j39;
                long j44 = j14 + (j42 >> 26);
                long j45 = j44 & j39;
                long j46 = ((j44 >> 26) * 5) + j15;
                long j47 = j46 >> 26;
                long j48 = j46 & j39;
                long j49 = j48 + 5;
                long j50 = (j11 & j39) + j47;
                long j51 = j50 + (j49 >> 26);
                long j52 = (j51 >> 26) + j41;
                long j53 = j43 + (j52 >> 26);
                long j54 = (j45 + (j53 >> 26)) - 67108864;
                long j55 = j54 >> 63;
                long j56 = ~j55;
                long j57 = (j50 & j55) | (j51 & j39 & j56);
                long j58 = (j41 & j55) | (j52 & j39 & j56);
                long j59 = (j43 & j55) | (j53 & j39 & j56);
                long l20 = l(bArr3, 16) + (((j48 & j55) | (j49 & j39 & j56) | (j57 << 26)) & 4294967295L);
                long l21 = l(bArr3, 20);
                long l22 = l(bArr3, 28);
                byte[] bArr6 = new byte[16];
                n(bArr6, l20 & 4294967295L, 0);
                long j60 = l21 + (((j57 >> 6) | (j58 << 20)) & 4294967295L) + (l20 >> 32);
                n(bArr6, j60 & 4294967295L, 4);
                long l23 = l(bArr3, 24) + (((j58 >> 12) | (j59 << 14)) & 4294967295L) + (j60 >> 32);
                n(bArr6, l23 & 4294967295L, 8);
                n(bArr6, (l22 + (((j59 >> 18) | (((j45 & j55) | (j54 & j56)) << 8)) & 4294967295L) + (l23 >> 32)) & 4294967295L, 12);
                return bArr6;
            }
        }
    }

    public static e k(e eVar, c cVar, n nVar, Boolean bool, Boolean bool2) {
        e eVar2 = new e();
        Iterator h3 = eVar.h();
        while (h3.hasNext()) {
            int intValue = ((Integer) h3.next()).intValue();
            if (eVar.l(intValue)) {
                o e10 = nVar.e(cVar, Arrays.asList(new o[]{eVar.f(intValue), new h(Double.valueOf((double) intValue)), eVar}));
                if (e10.zzg().equals(bool)) {
                    return eVar2;
                }
                if (bool2 == null || e10.zzg().equals(bool2)) {
                    eVar2.k(intValue, e10);
                }
            }
        }
        return eVar2;
    }

    public static long l(byte[] bArr, int i8) {
        int i10 = (bArr[i8 + 1] & 255) << 8;
        return ((long) (((bArr[i8 + 3] & 255) << 24) | i10 | (bArr[i8] & 255) | ((bArr[i8 + 2] & 255) << 16))) & 4294967295L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.o m(com.google.android.gms.internal.measurement.e r9, j1.c r10, java.util.ArrayList r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            com.google.android.gms.internal.measurement.f4.i(r0, r1, r11)
            r2 = 2
            com.google.android.gms.internal.measurement.f4.j(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.android.gms.internal.measurement.o r3 = (com.google.android.gms.internal.measurement.o) r3
            com.google.android.gms.internal.measurement.o r3 = r10.m(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.i
            if (r4 == 0) goto L_0x009f
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            com.google.android.gms.internal.measurement.o r11 = (com.google.android.gms.internal.measurement.o) r11
            com.google.android.gms.internal.measurement.o r11 = r10.m(r11)
            boolean r4 = r11 instanceof com.google.android.gms.internal.measurement.g
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.e()
            if (r11 == 0) goto L_0x0097
            r11 = 0
        L_0x003d:
            com.google.android.gms.internal.measurement.i r3 = (com.google.android.gms.internal.measurement.i) r3
            int r4 = r9.e()
            if (r12 == 0) goto L_0x0047
            r5 = r0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            r6 = -1
            if (r12 == 0) goto L_0x004e
            int r4 = r4 + r6
            goto L_0x004f
        L_0x004e:
            r4 = r0
        L_0x004f:
            if (r1 == r12) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = r1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.o r11 = r9.f(r5)
            goto L_0x0094
        L_0x005a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x0096
            boolean r12 = r9.l(r5)
            if (r12 == 0) goto L_0x0094
            r12 = 4
            com.google.android.gms.internal.measurement.o[] r12 = new com.google.android.gms.internal.measurement.o[r12]
            r12[r0] = r11
            com.google.android.gms.internal.measurement.o r11 = r9.f(r5)
            r12[r1] = r11
            double r7 = (double) r5
            com.google.android.gms.internal.measurement.h r11 = new com.google.android.gms.internal.measurement.h
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            com.google.android.gms.internal.measurement.o r11 = r3.e(r10, r11)
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.g
            if (r12 != 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0094:
            int r5 = r5 + r6
            goto L_0x005a
        L_0x0096:
            return r11
        L_0x0097:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x009f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.b1.m(com.google.android.gms.internal.measurement.e, j1.c, java.util.ArrayList, boolean):com.google.android.gms.internal.measurement.o");
    }

    public static void n(byte[] bArr, long j10, int i8) {
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i8 + i10] = (byte) ((int) (255 & j10));
            j10 >>= 8;
        }
    }

    public Typeface c(p pVar, int i8) {
        j.f(pVar, "fontWeight");
        return e((String) null, pVar, i8);
    }

    public Typeface d(q qVar, p pVar, int i8) {
        String str;
        j.f(qVar, "name");
        j.f(pVar, "fontWeight");
        String str2 = qVar.f17609a;
        j.f(str2, "name");
        int i10 = pVar.f17608a / 100;
        boolean z10 = false;
        if (i10 >= 0 && i10 < 2) {
            str = str2.concat("-thin");
        } else {
            if (2 <= i10 && i10 < 4) {
                str = str2.concat("-light");
            } else {
                if (i10 != 4) {
                    if (i10 == 5) {
                        str = str2.concat("-medium");
                    } else {
                        if (!(6 <= i10 && i10 < 8)) {
                            if (8 <= i10 && i10 < 11) {
                                str = str2.concat("-black");
                            }
                        }
                    }
                }
                str = str2;
            }
        }
        Typeface typeface = null;
        if (!(str.length() == 0)) {
            Typeface e10 = e(str, pVar, i8);
            if (!j.a(e10, Typeface.create(Typeface.DEFAULT, l0.c(pVar, i8))) && !j.a(e10, e((String) null, pVar, i8))) {
                z10 = true;
            }
            if (z10) {
                typeface = e10;
            }
        }
        return typeface == null ? e(str2, pVar, i8) : typeface;
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().a());
    }
}
