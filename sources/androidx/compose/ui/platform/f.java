package androidx.compose.ui.platform;

public final class f extends b {

    /* renamed from: c  reason: collision with root package name */
    public static f f1286c;

    public f(int i8) {
    }

    public final int[] a(int i8) {
        int length = d().length();
        if (length <= 0 || i8 >= length) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < length && d().charAt(i8) == 10 && !f(i8)) {
            i8++;
        }
        if (i8 >= length) {
            return null;
        }
        int i10 = i8 + 1;
        while (i10 < length && !e(i10)) {
            i10++;
        }
        return c(i8, i10);
    }

    public final int[] b(int i8) {
        int length = d().length();
        if (length <= 0 || i8 <= 0) {
            return null;
        }
        if (i8 > length) {
            i8 = length;
        }
        while (i8 > 0) {
            int i10 = i8 - 1;
            if (d().charAt(i10) != 10 || e(i8)) {
                break;
            }
            i8 = i10;
        }
        if (i8 <= 0) {
            return null;
        }
        int i11 = i8 - 1;
        while (i11 > 0 && !f(i11)) {
            i11--;
        }
        return c(i11, i8);
    }

    public final boolean e(int i8) {
        return i8 > 0 && d().charAt(i8 + -1) != 10 && (i8 == d().length() || d().charAt(i8) == 10);
    }

    public final boolean f(int i8) {
        return d().charAt(i8) != 10 && (i8 == 0 || d().charAt(i8 - 1) == 10);
    }
}
