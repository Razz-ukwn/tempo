package a1;

import sf.j;
import x0.a;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final a f19a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20b;

    public b(int i8, String str) {
        this.f19a = new a(str);
        this.f20b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f19a.f16819a, bVar.f19a.f16819a) && this.f20b == bVar.f20b;
    }

    public final int hashCode() {
        return (this.f19a.f16819a.hashCode() * 31) + this.f20b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f19a.f16819a);
        sb2.append("', newCursorPosition=");
        return rb.b.a(sb2, this.f20b, ')');
    }
}
