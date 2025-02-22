package t;

import sf.j;

public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15281a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15282b;

    public y0(Integer num, Object obj) {
        this.f15281a = num;
        this.f15282b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return j.a(this.f15281a, y0Var.f15281a) && j.a(this.f15282b, y0Var.f15282b);
    }

    public final int hashCode() {
        Object obj = this.f15281a;
        int i8 = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f15282b;
        if (obj2 instanceof Enum) {
            i8 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i8 = obj2.hashCode();
        }
        return i8 + ordinal;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f15281a + ", right=" + this.f15282b + ')';
    }
}
