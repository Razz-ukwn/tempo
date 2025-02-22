package i4;

import android.content.Context;
import android.util.DisplayMetrics;
import i4.a;
import sf.j;
import x3.i;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9568a;

    public b(Context context) {
        this.f9568a = context;
    }

    public final Object c(i iVar) {
        DisplayMetrics displayMetrics = this.f9568a.getResources().getDisplayMetrics();
        a.C0176a aVar = new a.C0176a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new e(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            if (j.a(this.f9568a, ((b) obj).f9568a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9568a.hashCode();
    }
}
