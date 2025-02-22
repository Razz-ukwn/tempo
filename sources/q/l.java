package q;

public final class l extends p {

    /* renamed from: a  reason: collision with root package name */
    public float f12723a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12724b = 1;

    public l(float f10) {
        this.f12723a = f10;
    }

    public final float a(int i8) {
        if (i8 == 0) {
            return this.f12723a;
        }
        return 0.0f;
    }

    public final int b() {
        return this.f12724b;
    }

    public final p c() {
        return new l(0.0f);
    }

    public final void d() {
        this.f12723a = 0.0f;
    }

    public final void e(int i8, float f10) {
        if (i8 == 0) {
            this.f12723a = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return (((l) obj).f12723a > this.f12723a ? 1 : (((l) obj).f12723a == this.f12723a ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12723a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f12723a;
    }
}
