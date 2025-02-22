package r3;

import android.view.View;
import android.view.WindowId;

public final class d0 implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f13822a;

    public d0(View view) {
        this.f13822a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d0) && ((d0) obj).f13822a.equals(this.f13822a);
    }

    public final int hashCode() {
        return this.f13822a.hashCode();
    }
}
