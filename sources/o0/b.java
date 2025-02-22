package o0;

import sf.j;

public final class b implements l {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        b bVar = (b) obj;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "AndroidPointerIcon(type=0)";
    }
}
