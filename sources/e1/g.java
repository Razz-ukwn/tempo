package e1;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final float f7770a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7771b;

    public g(float f10, float f11) {
        this.f7770a = f10;
        this.f7771b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!(this.f7770a == gVar.f7770a)) {
            return false;
        }
        return (this.f7771b > gVar.f7771b ? 1 : (this.f7771b == gVar.f7771b ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7771b) + (Float.hashCode(this.f7770a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.f7770a + ", skewX=" + this.f7771b + ')';
    }

    public g() {
        this(1.0f, 0.0f);
    }
}
