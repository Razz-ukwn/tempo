package zf;

import d.a;
import sf.j;

public class o extends n {
    public static final String a1(int i8, String str) {
        j.f(str, "<this>");
        if (i8 >= 0) {
            int length = str.length();
            if (i8 > length) {
                i8 = length;
            }
            String substring = str.substring(0, i8);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(a.a("Requested character count ", i8, " is less than zero.").toString());
    }

    public static final String b1(String str) {
        j.f(str, "<this>");
        int length = str.length();
        int i8 = 2;
        if (2 > length) {
            i8 = length;
        }
        String substring = str.substring(length - i8);
        j.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }
}
