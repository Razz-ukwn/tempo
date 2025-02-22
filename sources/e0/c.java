package e0;

import android.view.ViewStructure;
import sf.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f7762a = new c();

    public final int a(ViewStructure viewStructure, int i8) {
        j.f(viewStructure, "structure");
        return viewStructure.addChildCount(i8);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i8) {
        j.f(viewStructure, "structure");
        return viewStructure.newChild(i8);
    }

    public final void c(ViewStructure viewStructure, int i8, int i10, int i11, int i12, int i13, int i14) {
        j.f(viewStructure, "structure");
        viewStructure.setDimens(i8, i10, i11, i12, i13, i14);
    }

    public final void d(ViewStructure viewStructure, int i8, String str, String str2, String str3) {
        j.f(viewStructure, "structure");
        viewStructure.setId(i8, str, str2, str3);
    }
}
