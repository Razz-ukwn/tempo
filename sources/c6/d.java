package c6;

import java.util.ArrayList;
import java.util.List;

public final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    public final List<m> f3807a;

    public d(ArrayList arrayList) {
        this.f3807a = arrayList;
    }

    public final List<m> a() {
        return this.f3807a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f3807a.equals(((j) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3807a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f3807a + "}";
    }
}
