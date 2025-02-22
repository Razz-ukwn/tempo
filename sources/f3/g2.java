package f3;

import f3.f2;
import java.util.List;
import rb.b;
import sf.j;

public final class g2<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    public final List<f2.b.C0140b<Key, Value>> f8246a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f8247b;

    /* renamed from: c  reason: collision with root package name */
    public final w1 f8248c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8249d;

    public g2(List<f2.b.C0140b<Key, Value>> list, Integer num, w1 w1Var, int i8) {
        j.f(w1Var, "config");
        this.f8246a = list;
        this.f8247b = num;
        this.f8248c = w1Var;
        this.f8249d = i8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g2) {
            g2 g2Var = (g2) obj;
            return j.a(this.f8246a, g2Var.f8246a) && j.a(this.f8247b, g2Var.f8247b) && j.a(this.f8248c, g2Var.f8248c) && this.f8249d == g2Var.f8249d;
        }
    }

    public final int hashCode() {
        int hashCode = this.f8246a.hashCode();
        Integer num = this.f8247b;
        return Integer.hashCode(this.f8249d) + this.f8248c.hashCode() + hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingState(pages=");
        sb2.append(this.f8246a);
        sb2.append(", anchorPosition=");
        sb2.append(this.f8247b);
        sb2.append(", config=");
        sb2.append(this.f8248c);
        sb2.append(", leadingPlaceholderCount=");
        return b.a(sb2, this.f8249d, ')');
    }
}
