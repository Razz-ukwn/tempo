package ag;

import ff.m;
import rf.l;
import sf.j;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Object f507a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, m> f508b;

    public x(Object obj, l<? super Throwable, m> lVar) {
        this.f507a = obj;
        this.f508b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return j.a(this.f507a, xVar.f507a) && j.a(this.f508b, xVar.f508b);
    }

    public final int hashCode() {
        Object obj = this.f507a;
        return this.f508b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f507a + ", onCancellation=" + this.f508b + ')';
    }
}
