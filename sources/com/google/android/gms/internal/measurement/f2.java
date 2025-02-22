package com.google.android.gms.internal.measurement;

import sf.j;

public final /* synthetic */ class f2 {
    public static /* synthetic */ void a(int i8, String str) {
        if (i8 == 0) {
            NullPointerException nullPointerException = new NullPointerException(j.i(str));
            j.j(j.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static /* synthetic */ String b(int i8) {
        return i8 == 1 ? "OK" : i8 == 2 ? "BAD_CONFIG" : "null";
    }
}
