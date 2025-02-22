package o0;

import sf.j;

public final class a implements l {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.a(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        a aVar = (a) obj;
        return j.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}
