package t;

import sf.j;

public final class l2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h f15144a;

    public /* synthetic */ l2(h hVar) {
        this.f15144a = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l2)) {
            return false;
        }
        return j.a(this.f15144a, ((l2) obj).f15144a);
    }

    public final int hashCode() {
        return this.f15144a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f15144a + ')';
    }
}
