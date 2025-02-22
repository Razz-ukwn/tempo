package zf;

import cb.b;
import sf.j;

public class i extends h {
    public static final Float o0(String str) {
        try {
            c cVar = d.f17975a;
            cVar.getClass();
            if (cVar.f17974a.matcher(str).matches()) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static final Integer p0(String str) {
        int i8;
        boolean z10;
        int i10;
        b.s(10);
        int length = str.length();
        if (length != 0) {
            int i11 = 0;
            char charAt = str.charAt(0);
            int i12 = -2147483647;
            if (j.h(charAt, 48) < 0) {
                i8 = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        i12 = Integer.MIN_VALUE;
                        z10 = true;
                    } else if (charAt == '+') {
                        z10 = false;
                    }
                }
            } else {
                z10 = false;
                i8 = 0;
            }
            int i13 = -59652323;
            while (i8 < length) {
                int digit = Character.digit(str.charAt(i8), 10);
                if (digit >= 0 && ((i11 >= i13 || (i13 == -59652323 && i11 >= (i13 = i12 / 10))) && (i10 = i11 * 10) >= i12 + digit)) {
                    i11 = i10 - digit;
                    i8++;
                }
            }
            return z10 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
        }
        return null;
    }

    public static final Long q0(String str) {
        boolean z10;
        String str2 = str;
        j.f(str2, "<this>");
        b.s(10);
        int length = str.length();
        if (length != 0) {
            int i8 = 0;
            char charAt = str2.charAt(0);
            long j10 = -9223372036854775807L;
            if (j.h(charAt, 48) < 0) {
                z10 = true;
                if (length != 1) {
                    if (charAt == '-') {
                        j10 = Long.MIN_VALUE;
                        i8 = 1;
                    } else if (charAt == '+') {
                        z10 = false;
                        i8 = 1;
                    }
                }
            } else {
                z10 = false;
            }
            long j11 = 0;
            long j12 = -256204778801521550L;
            while (i8 < length) {
                int digit = Character.digit(str2.charAt(i8), 10);
                if (digit >= 0) {
                    if (j11 < j12) {
                        if (j12 == -256204778801521550L) {
                            j12 = j10 / ((long) 10);
                            if (j11 < j12) {
                            }
                        }
                    }
                    long j13 = j11 * ((long) 10);
                    long j14 = (long) digit;
                    if (j13 >= j10 + j14) {
                        j11 = j13 - j14;
                        i8++;
                    }
                }
            }
            return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
        }
        return null;
    }
}
