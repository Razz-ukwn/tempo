package h0;

import d2.f1;
import e9.c;
import q.n;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final d f9073e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f9074a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9075b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9076c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9077d;

    public d(float f10, float f11, float f12, float f13) {
        this.f9074a = f10;
        this.f9075b = f11;
        this.f9076c = f12;
        this.f9077d = f13;
    }

    public final long a() {
        float f10 = this.f9076c;
        float f11 = this.f9074a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f9077d;
        float f14 = this.f9075b;
        return f1.f(f12, ((f13 - f14) / 2.0f) + f14);
    }

    public final d b(float f10, float f11) {
        return new d(this.f9074a + f10, this.f9075b + f11, this.f9076c + f10, this.f9077d + f11);
    }

    public final d c(long j10) {
        return new d(c.b(j10) + this.f9074a, c.c(j10) + this.f9075b, c.b(j10) + this.f9076c, c.c(j10) + this.f9077d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f9074a, dVar.f9074a) == 0 && Float.compare(this.f9075b, dVar.f9075b) == 0 && Float.compare(this.f9076c, dVar.f9076c) == 0 && Float.compare(this.f9077d, dVar.f9077d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9077d) + n.a(this.f9076c, n.a(this.f9075b, Float.hashCode(this.f9074a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + c.p(this.f9074a) + ", " + c.p(this.f9075b) + ", " + c.p(this.f9076c) + ", " + c.p(this.f9077d) + ')';
    }
}
