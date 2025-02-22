package androidx.appcompat.widget;

import androidx.fragment.app.z0;
import androidx.lifecycle.o0;
import ff.d;
import sf.j;

public final /* synthetic */ class a1 {
    public static o0 a(d dVar, String str) {
        o0 s10 = z0.b(dVar).s();
        j.e(s10, str);
        return s10;
    }

    public static StringBuilder b(String str, int i8, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i8);
        sb2.append(str2);
        return sb2;
    }

    public static /* bridge */ /* synthetic */ void c(Object obj, int i8, int i10, int i11) {
        throw null;
    }

    public static /* synthetic */ String d(int i8) {
        return i8 == 1 ? "BoundReached" : i8 == 2 ? "Finished" : "null";
    }
}
