package n0;

import android.view.KeyEvent;
import sf.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final KeyEvent f11527a;

    public /* synthetic */ b(KeyEvent keyEvent) {
        this.f11527a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return j.a(this.f11527a, ((b) obj).f11527a);
    }

    public final int hashCode() {
        return this.f11527a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f11527a + ')';
    }
}
