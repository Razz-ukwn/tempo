package l9;

public final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    public final long f11016a;

    public f(long j10) {
        this.f11016a = j10;
    }

    public final void a() {
    }

    public final long b() {
        return this.f11016a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f11016a == gVar.b();
    }

    public final int hashCode() {
        long j10 = this.f11016a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ -724379968;
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.f11016a + "}";
    }
}
