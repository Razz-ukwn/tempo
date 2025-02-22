package f1;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f8026a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8027b;

    public d(float f10, float f11) {
        this.f8026a = f10;
        this.f8027b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f8026a, dVar.f8026a) == 0 && Float.compare(this.f8027b, dVar.f8027b) == 0;
    }

    public final float getDensity() {
        return this.f8026a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8027b) + (Float.hashCode(this.f8026a) * 31);
    }

    public final float m() {
        return this.f8027b;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.f8026a + ", fontScale=" + this.f8027b + ')';
    }
}
