package wf;

public final class a implements b<Float> {

    /* renamed from: a  reason: collision with root package name */
    public final float f16712a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public final float f16713b = 0.0f;

    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final Comparable b() {
        return Float.valueOf(this.f16712a);
    }

    public final Comparable c() {
        return Float.valueOf(this.f16713b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (!isEmpty() || !((a) obj).isEmpty()) {
            a aVar = (a) obj;
            if (!(this.f16712a == aVar.f16712a)) {
                return false;
            }
            if (!(this.f16713b == aVar.f16713b)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f16712a) * 31) + Float.hashCode(this.f16713b);
    }

    public final boolean isEmpty() {
        return this.f16712a > this.f16713b;
    }

    public final String toString() {
        return this.f16712a + ".." + this.f16713b;
    }
}
