package gf;

import cb.d;
import d2.f1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.coroutines.internal.v;
import sf.j;

public class l extends f1 {
    public static final List R(Object[] objArr) {
        j.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        j.e(asList, "asList(this)");
        return asList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> boolean S(T[] r4, T r5) {
        /*
            java.lang.String r0 = "<this>"
            sf.j.f(r4, r0)
            r0 = 0
            if (r5 != 0) goto L_0x0014
            int r5 = r4.length
            r1 = r0
        L_0x000a:
            if (r1 >= r5) goto L_0x0025
            r2 = r4[r1]
            if (r2 != 0) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x0014:
            int r1 = r4.length
            r2 = r0
        L_0x0016:
            if (r2 >= r1) goto L_0x0025
            r3 = r4[r2]
            boolean r3 = sf.j.a(r5, r3)
            if (r3 == 0) goto L_0x0022
            r1 = r2
            goto L_0x0026
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x0016
        L_0x0025:
            r1 = -1
        L_0x0026:
            if (r1 < 0) goto L_0x0029
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.l.S(java.lang.Object[], java.lang.Object):boolean");
    }

    public static final void T(int i8, int i10, int i11, byte[] bArr, byte[] bArr2) {
        j.f(bArr, "<this>");
        j.f(bArr2, "destination");
        System.arraycopy(bArr, i10, bArr2, i8, i11 - i10);
    }

    public static final void U(int i8, int i10, int i11, int[] iArr, int[] iArr2) {
        j.f(iArr, "<this>");
        j.f(iArr2, "destination");
        System.arraycopy(iArr, i10, iArr2, i8, i11 - i10);
    }

    public static final void V(int i8, int i10, int i11, Object[] objArr, Object[] objArr2) {
        j.f(objArr, "<this>");
        j.f(objArr2, "destination");
        System.arraycopy(objArr, i10, objArr2, i8, i11 - i10);
    }

    public static /* synthetic */ void W(int[] iArr, int[] iArr2, int i8, int i10) {
        if ((i10 & 8) != 0) {
            i8 = iArr.length;
        }
        U(0, 0, i8, iArr, iArr2);
    }

    public static /* synthetic */ void X(Object[] objArr, Object[] objArr2, int i8, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i8 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        V(i8, i10, i11, objArr, objArr2);
    }

    public static final byte[] Y(byte[] bArr, int i8, int i10) {
        j.f(bArr, "<this>");
        f1.u(i10, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i8, i10);
        j.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final void Z(Object[] objArr, int i8, int i10) {
        j.f(objArr, "<this>");
        Arrays.fill(objArr, i8, i10, (Object) null);
    }

    public static void a0(Object[] objArr, v vVar) {
        int length = objArr.length;
        j.f(objArr, "<this>");
        Arrays.fill(objArr, 0, length, vVar);
    }

    public static final ArrayList b0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String c0(Object[] objArr, String str, String str2, String str3, int i8) {
        if ((i8 & 1) != 0) {
            str = ", ";
        }
        if ((i8 & 2) != 0) {
            str2 = "";
        }
        if ((i8 & 4) != 0) {
            str3 = "";
        }
        int i10 = (i8 & 8) != 0 ? -1 : 0;
        String str4 = (i8 & 16) != 0 ? "..." : null;
        j.f(str, "separator");
        j.f(str2, "prefix");
        j.f(str3, "postfix");
        j.f(str4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                sb2.append(str);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            d.l(sb2, obj, (rf.l) null);
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(str4);
        }
        sb2.append(str3);
        String sb3 = sb2.toString();
        j.e(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final char d0(char[] cArr) {
        j.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final List<Integer> e0(int[] iArr) {
        j.f(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? g0(iArr) : d.O(Integer.valueOf(iArr[0])) : s.f8978a;
    }

    public static final <T> List<T> f0(T[] tArr) {
        j.f(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new j(tArr, false)) : d.O(tArr[0]) : s.f8978a;
    }

    public static final ArrayList g0(int[] iArr) {
        j.f(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }
}
