package v0;

import ff.a;
import sf.j;

public final class a<T extends ff.a<? extends Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public final String f16036a;

    /* renamed from: b  reason: collision with root package name */
    public final T f16037b;

    public a(String str, T t2) {
        this.f16036a = str;
        this.f16037b = t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f16036a, aVar.f16036a) && j.a(this.f16037b, aVar.f16037b);
    }

    public final int hashCode() {
        int i8 = 0;
        String str = this.f16036a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t2 = this.f16037b;
        if (t2 != null) {
            i8 = t2.hashCode();
        }
        return hashCode + i8;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f16036a + ", action=" + this.f16037b + ')';
    }
}
