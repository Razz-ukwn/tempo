package p0;

import q.n;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final float f12395a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12396b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12397c;

    public c(float f10, float f11, long j10) {
        this.f12395a = f10;
        this.f12396b = f11;
        this.f12397c = j10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!(cVar.f12395a == this.f12395a)) {
            return false;
        }
        return ((cVar.f12396b > this.f12396b ? 1 : (cVar.f12396b == this.f12396b ? 0 : -1)) == 0) && cVar.f12397c == this.f12397c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12397c) + n.a(this.f12396b, Float.hashCode(this.f12395a) * 31, 31);
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f12395a + ",horizontalScrollPixels=" + this.f12396b + ",uptimeMillis=" + this.f12397c + ')';
    }
}
