package androidx.compose.ui.platform;

import sf.j;

public final class x2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f1509a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1510b;

    public x2(Object obj, String str) {
        this.f1509a = str;
        this.f1510b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return j.a(this.f1509a, x2Var.f1509a) && j.a(this.f1510b, x2Var.f1510b);
    }

    public final int hashCode() {
        int hashCode = this.f1509a.hashCode() * 31;
        Object obj = this.f1510b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.f1509a + ", value=" + this.f1510b + ')';
    }
}
