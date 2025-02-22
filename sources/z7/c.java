package z7;

import android.view.View;
import d2.d1;
import d2.i0;
import d2.j1;
import java.util.WeakHashMap;
import m8.v;

public final class c implements v.b {
    public final j1 a(View view, j1 j1Var, v.c cVar) {
        cVar.f11315d = j1Var.a() + cVar.f11315d;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        boolean z10 = true;
        if (i0.e.d(view) != 1) {
            z10 = false;
        }
        int b10 = j1Var.b();
        int c3 = j1Var.c();
        int i8 = cVar.f11312a + (z10 ? c3 : b10);
        cVar.f11312a = i8;
        int i10 = cVar.f11314c;
        if (!z10) {
            b10 = c3;
        }
        int i11 = i10 + b10;
        cVar.f11314c = i11;
        i0.e.k(view, i8, cVar.f11313b, i11, cVar.f11315d);
        return j1Var;
    }
}
