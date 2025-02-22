package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wh  reason: invalid package */
public final class wh {
    public static void a(int i8, int i10) {
        String str;
        if (i8 < 0 || i8 >= i10) {
            if (i8 < 0) {
                str = f2.a("%s (%s) must not be negative", "index", Integer.valueOf(i8));
            } else if (i10 < 0) {
                throw new IllegalArgumentException(q.a("negative size: ", i10));
            } else {
                str = f2.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void b(int i8, int i10) {
        if (i8 < 0 || i8 > i10) {
            throw new IndexOutOfBoundsException(d(i8, i10, "index"));
        }
    }

    public static void c(int i8, int i10, int i11) {
        String str;
        if (i8 < 0 || i10 < i8 || i10 > i11) {
            if (i8 < 0 || i8 > i11) {
                str = d(i8, i11, "start index");
            } else if (i10 < 0 || i10 > i11) {
                str = d(i10, i11, "end index");
            } else {
                str = f2.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i8));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static String d(int i8, int i10, String str) {
        if (i8 < 0) {
            return f2.a("%s (%s) must not be negative", str, Integer.valueOf(i8));
        } else if (i10 >= 0) {
            return f2.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i10));
        } else {
            throw new IllegalArgumentException(q.a("negative size: ", i10));
        }
    }
}
