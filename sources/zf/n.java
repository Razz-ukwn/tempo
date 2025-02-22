package zf;

import cb.b;
import d.a;
import gf.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sf.j;
import wf.d;
import wf.e;
import wf.f;
import yf.m;
import yf.o;
import yf.q;

public class n extends j {
    public static boolean A0(CharSequence charSequence, String str) {
        j.f(charSequence, "<this>");
        j.f(str, "other");
        return G0(charSequence, str, 0, false, 2) >= 0;
    }

    public static boolean B0(String str, char c3) {
        return str.length() > 0 && b.w(str.charAt(C0(str)), c3, false);
    }

    public static final int C0(CharSequence charSequence) {
        j.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int D0(int i8, CharSequence charSequence, String str, boolean z10) {
        j.f(charSequence, "<this>");
        j.f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i8);
        }
        return E0(charSequence, str, i8, charSequence.length(), z10, false);
    }

    public static final int E0(CharSequence charSequence, CharSequence charSequence2, int i8, int i10, boolean z10, boolean z11) {
        d dVar;
        if (!z11) {
            if (i8 < 0) {
                i8 = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            dVar = new f(i8, i10);
        } else {
            int C0 = C0(charSequence);
            if (i8 > C0) {
                i8 = C0;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            dVar = new d(i8, i10, -1);
        }
        boolean z12 = charSequence instanceof String;
        int i11 = dVar.f16714a;
        int i12 = dVar.f16716c;
        int i13 = dVar.f16715b;
        if (!z12 || !(charSequence2 instanceof String)) {
            if ((i12 > 0 && i11 <= i13) || (i12 < 0 && i13 <= i11)) {
                while (true) {
                    if (!N0(charSequence2, 0, charSequence, i11, charSequence2.length(), z10)) {
                        if (i11 == i13) {
                            break;
                        }
                        i11 += i12;
                    } else {
                        return i11;
                    }
                }
            }
        } else if ((i12 > 0 && i11 <= i13) || (i12 < 0 && i13 <= i11)) {
            while (true) {
                if (!j.u0(0, i11, charSequence2.length(), (String) charSequence2, (String) charSequence, z10)) {
                    if (i11 == i13) {
                        break;
                    }
                    i11 += i12;
                } else {
                    return i11;
                }
            }
        }
        return -1;
    }

    public static int F0(CharSequence charSequence, char c3, int i8, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        j.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c3, i8);
        }
        return H0(i8, charSequence, z10, new char[]{c3});
    }

    public static /* synthetic */ int G0(CharSequence charSequence, String str, int i8, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return D0(i8, charSequence, str, z10);
    }

    public static final int H0(int i8, CharSequence charSequence, boolean z10, char[] cArr) {
        boolean z11;
        j.f(charSequence, "<this>");
        j.f(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i8 < 0) {
                i8 = 0;
            }
            e d10 = new f(i8, C0(charSequence)).iterator();
            while (d10.f16719c) {
                int nextInt = d10.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z11 = false;
                        continue;
                        break;
                    } else if (b.w(cArr[i10], charAt, z10)) {
                        z11 = true;
                        continue;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (z11) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(l.d0(cArr), i8);
    }

    public static int I0(CharSequence charSequence, char c3, int i8, int i10) {
        if ((i10 & 2) != 0) {
            i8 = C0(charSequence);
        }
        j.f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c3, i8);
        }
        char[] cArr = {c3};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(l.d0(cArr), i8);
        }
        int C0 = C0(charSequence);
        if (i8 > C0) {
            i8 = C0;
        }
        while (-1 < i8) {
            if (b.w(cArr[0], charSequence.charAt(i8), false)) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    public static int J0(String str, String str2, int i8) {
        int C0 = (i8 & 2) != 0 ? C0(str) : 0;
        j.f(str, "<this>");
        j.f(str2, "string");
        return str.lastIndexOf(str2, C0);
    }

    public static final List<String> K0(CharSequence charSequence) {
        j.f(charSequence, "<this>");
        return o.r0(new q(M0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new m(charSequence)));
    }

    public static String L0(String str, int i8) {
        CharSequence charSequence;
        j.f(str, "<this>");
        if (i8 >= 0) {
            if (i8 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i8);
                sb2.append(str);
                e d10 = new f(1, i8 - str.length()).iterator();
                while (d10.f16719c) {
                    d10.nextInt();
                    sb2.append(' ');
                }
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(a.a("Desired length ", i8, " is less than zero."));
    }

    public static b M0(CharSequence charSequence, String[] strArr, boolean z10, int i8) {
        P0(i8);
        return new b(charSequence, 0, i8, new l(l.R(strArr), z10));
    }

    public static final boolean N0(CharSequence charSequence, int i8, CharSequence charSequence2, int i10, int i11, boolean z10) {
        j.f(charSequence, "<this>");
        j.f(charSequence2, "other");
        if (i10 < 0 || i8 < 0 || i8 > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!b.w(charSequence.charAt(i8 + i12), charSequence2.charAt(i10 + i12), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final String O0(String str, String str2) {
        if (!j.x0(str2, str, false)) {
            return str2;
        }
        String substring = str2.substring(str.length());
        j.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final void P0(int i8) {
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(androidx.fragment.app.q.a("Limit must be non-negative, but was ", i8).toString());
        }
    }

    public static final List Q0(int i8, CharSequence charSequence, String str, boolean z10) {
        P0(i8);
        int i10 = 0;
        int D0 = D0(0, charSequence, str, z10);
        if (D0 == -1 || i8 == 1) {
            return cb.d.O(charSequence.toString());
        }
        boolean z11 = i8 > 0;
        int i11 = 10;
        if (z11 && i8 <= 10) {
            i11 = i8;
        }
        ArrayList arrayList = new ArrayList(i11);
        do {
            arrayList.add(charSequence.subSequence(i10, D0).toString());
            i10 = str.length() + D0;
            if ((z11 && arrayList.size() == i8 - 1) || (D0 = D0(i10, charSequence, str, z10)) == -1) {
                arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i10, D0).toString());
            i10 = str.length() + D0;
            break;
        } while ((D0 = D0(i10, charSequence, str, z10)) == -1);
        arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
        return arrayList;
    }

    public static List R0(CharSequence charSequence, char[] cArr) {
        j.f(charSequence, "<this>");
        if (cArr.length == 1) {
            return Q0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        P0(0);
        m mVar = new m(new b(charSequence, 0, 0, new k(cArr, false)));
        ArrayList arrayList = new ArrayList(gf.m.n0(mVar));
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            arrayList.add(T0(charSequence, (f) it.next()));
        }
        return arrayList;
    }

    public static List S0(String str, String[] strArr) {
        boolean z10 = true;
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                return Q0(0, str, str2, false);
            }
        }
        m mVar = new m(M0(str, strArr, false, 0));
        ArrayList arrayList = new ArrayList(gf.m.n0(mVar));
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            arrayList.add(T0(str, (f) it.next()));
        }
        return arrayList;
    }

    public static final String T0(CharSequence charSequence, f fVar) {
        j.f(charSequence, "<this>");
        j.f(fVar, "range");
        return charSequence.subSequence(Integer.valueOf(fVar.f16714a).intValue(), Integer.valueOf(fVar.f16715b).intValue() + 1).toString();
    }

    public static String U0(String str, char c3) {
        int F0 = F0(str, c3, 0, false, 6);
        if (F0 == -1) {
            return str;
        }
        String substring = str.substring(F0 + 1, str.length());
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String V0(String str, String str2) {
        j.f(str2, "delimiter");
        int G0 = G0(str, str2, 0, false, 6);
        if (G0 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + G0, str.length());
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String W0(String str, char c3, String str2) {
        j.f(str, "<this>");
        j.f(str2, "missingDelimiterValue");
        int I0 = I0(str, c3, 0, 6);
        if (I0 == -1) {
            return str2;
        }
        String substring = str.substring(I0 + 1, str.length());
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String X0(String str, char c3) {
        int F0 = F0(str, c3, 0, false, 6);
        if (F0 == -1) {
            return str;
        }
        String substring = str.substring(0, F0);
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String Y0(String str, char c3) {
        j.f(str, "<this>");
        j.f(str, "missingDelimiterValue");
        int I0 = I0(str, c3, 0, 6);
        if (I0 == -1) {
            return str;
        }
        String substring = str.substring(0, I0);
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final CharSequence Z0(CharSequence charSequence) {
        j.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z10 = false;
        while (i8 <= length) {
            boolean C = b.C(charSequence.charAt(!z10 ? i8 : length));
            if (!z10) {
                if (!C) {
                    z10 = true;
                } else {
                    i8++;
                }
            } else if (!C) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    public static boolean z0(CharSequence charSequence, char c3) {
        j.f(charSequence, "<this>");
        return F0(charSequence, c3, 0, false, 2) >= 0;
    }
}
