package f1;

public final class e implements Comparable<e> {

    /* renamed from: a  reason: collision with root package name */
    public final float f8028a;

    public /* synthetic */ e(float f10) {
        this.f8028a = f10;
    }

    public static final boolean a(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static String b(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    public final int compareTo(Object obj) {
        return Float.compare(this.f8028a, ((e) obj).f8028a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return Float.compare(this.f8028a, ((e) obj).f8028a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8028a);
    }

    public final String toString() {
        return b(this.f8028a);
    }
}
