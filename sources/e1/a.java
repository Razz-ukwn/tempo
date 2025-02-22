package e1;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f7766a;

    public /* synthetic */ a(float f10) {
        this.f7766a = f10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Float.compare(this.f7766a, ((a) obj).f7766a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7766a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f7766a + ')';
    }
}
