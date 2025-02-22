package zf;

import cb.b;
import gf.w;
import java.util.Collection;
import java.util.Iterator;
import wf.f;

public class j extends i {
    public static final boolean r0(String str, String str2, boolean z10) {
        sf.j.f(str, "<this>");
        sf.j.f(str2, "suffix");
        return !z10 ? str.endsWith(str2) : u0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static final boolean s0(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final boolean t0(CharSequence charSequence) {
        boolean z10;
        sf.j.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        f fVar = new f(0, charSequence.length() - 1);
        if (!(fVar instanceof Collection) || !((Collection) fVar).isEmpty()) {
            Iterator it = fVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!b.C(charSequence.charAt(((w) it).nextInt()))) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = true;
        return z10;
    }

    public static final boolean u0(int i8, int i10, int i11, String str, String str2, boolean z10) {
        sf.j.f(str, "<this>");
        sf.j.f(str2, "other");
        return !z10 ? str.regionMatches(i8, str2, i10, i11) : str.regionMatches(z10, i8, str2, i10, i11);
    }

    public static String v0(String str, String str2, String str3) {
        sf.j.f(str, "<this>");
        sf.j.f(str2, "oldValue");
        int D0 = n.D0(0, str, str2, false);
        if (D0 < 0) {
            return str;
        }
        int length = str2.length();
        int i8 = 1;
        if (length >= 1) {
            i8 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            int i10 = 0;
            do {
                sb2.append(str, i10, D0);
                sb2.append(str3);
                i10 = D0 + length;
                if (D0 >= str.length() || (D0 = n.D0(D0 + i8, str, str2, false)) <= 0) {
                    sb2.append(str, i10, str.length());
                    String sb3 = sb2.toString();
                    sf.j.e(sb3, "stringBuilder.append(this, i, length).toString()");
                }
                sb2.append(str, i10, D0);
                sb2.append(str3);
                i10 = D0 + length;
                break;
            } while ((D0 = n.D0(D0 + i8, str, str2, false)) <= 0);
            sb2.append(str, i10, str.length());
            String sb32 = sb2.toString();
            sf.j.e(sb32, "stringBuilder.append(this, i, length).toString()");
            return sb32;
        }
        throw new OutOfMemoryError();
    }

    public static final boolean w0(int i8, String str, String str2, boolean z10) {
        sf.j.f(str, "<this>");
        if (!z10) {
            return str.startsWith(str2, i8);
        }
        return u0(i8, 0, str2.length(), str, str2, z10);
    }

    public static final boolean x0(String str, String str2, boolean z10) {
        sf.j.f(str, "<this>");
        sf.j.f(str2, "prefix");
        return !z10 ? str.startsWith(str2) : u0(0, 0, str2.length(), str, str2, z10);
    }
}
