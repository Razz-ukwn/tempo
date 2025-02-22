package q;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public double f12764a;

    /* renamed from: b  reason: collision with root package name */
    public double f12765b;

    public r(double d10, double d11) {
        this.f12764a = d10;
        this.f12765b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f12764a, rVar.f12764a) == 0 && Double.compare(this.f12765b, rVar.f12765b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f12765b) + (Double.hashCode(this.f12764a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f12764a + ", _imaginary=" + this.f12765b + ')';
    }
}
