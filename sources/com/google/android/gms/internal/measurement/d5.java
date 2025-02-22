package com.google.android.gms.internal.measurement;

import androidx.fragment.app.q;

public final class d5 {
    public static void a(int i8, int i10) {
        String str;
        if (i8 < 0 || i8 >= i10) {
            if (i8 < 0) {
                str = f5.a("%s (%s) must not be negative", "index", Integer.valueOf(i8));
            } else if (i10 < 0) {
                throw new IllegalArgumentException(q.a("negative size: ", i10));
            } else {
                str = f5.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void b(int i8, int i10, int i11) {
        String str;
        if (i8 < 0 || i10 < i8 || i10 > i11) {
            if (i8 < 0 || i8 > i11) {
                str = c(i8, i11, "start index");
            } else if (i10 < 0 || i10 > i11) {
                str = c(i10, i11, "end index");
            } else {
                str = f5.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i8));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static String c(int i8, int i10, String str) {
        if (i8 < 0) {
            return f5.a("%s (%s) must not be negative", str, Integer.valueOf(i8));
        } else if (i10 >= 0) {
            return f5.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i10));
        } else {
            throw new IllegalArgumentException(q.a("negative size: ", i10));
        }
    }
}
