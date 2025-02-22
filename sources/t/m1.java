package t;

import s0.b0;
import sf.j;

public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15146a;

    public m1(String str) {
        this.f15146a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && j.a(this.f15146a, ((m1) obj).f15146a);
    }

    public final int hashCode() {
        return this.f15146a.hashCode();
    }

    public final String toString() {
        return b0.a(new StringBuilder("OpaqueKey(key="), this.f15146a, ')');
    }
}
