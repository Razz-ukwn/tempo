package t9;

import androidx.activity.g;
import androidx.fragment.app.q;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final u<?> f15479a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15480b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15481c;

    public l(int i8, int i10, Class cls) {
        this((u<?>) u.a(cls), i8, i10);
    }

    public static l a(Class<?> cls) {
        return new l(1, 0, (Class) cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f15479a.equals(lVar.f15479a) && this.f15480b == lVar.f15480b && this.f15481c == lVar.f15481c;
    }

    public final int hashCode() {
        return ((((this.f15479a.hashCode() ^ 1000003) * 1000003) ^ this.f15480b) * 1000003) ^ this.f15481c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f15479a);
        sb2.append(", type=");
        int i8 = this.f15480b;
        sb2.append(i8 == 1 ? "required" : i8 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.f15481c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else if (i10 == 2) {
            str = "deferred";
        } else {
            throw new AssertionError(q.a("Unsupported injection: ", i10));
        }
        return g.a(sb2, str, "}");
    }

    public l(u<?> uVar, int i8, int i10) {
        this.f15479a = uVar;
        this.f15480b = i8;
        this.f15481c = i10;
    }
}
