package i4;

import i4.a;
import sf.j;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f9572c;

    /* renamed from: a  reason: collision with root package name */
    public final a f9573a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9574b;

    static {
        a.b bVar = a.b.f9567a;
        f9572c = new e(bVar, bVar);
    }

    public e(a aVar, a aVar2) {
        this.f9573a = aVar;
        this.f9574b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return j.a(this.f9573a, eVar.f9573a) && j.a(this.f9574b, eVar.f9574b);
    }

    public final int hashCode() {
        return this.f9574b.hashCode() + (this.f9573a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f9573a + ", height=" + this.f9574b + ')';
    }
}
