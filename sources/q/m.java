package q;

public final class m extends p {

    /* renamed from: a  reason: collision with root package name */
    public float f12725a;

    /* renamed from: b  reason: collision with root package name */
    public float f12726b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12727c = 2;

    public m(float f10, float f11) {
        this.f12725a = f10;
        this.f12726b = f11;
    }

    public final float a(int i8) {
        if (i8 == 0) {
            return this.f12725a;
        }
        if (i8 != 1) {
            return 0.0f;
        }
        return this.f12726b;
    }

    public final int b() {
        return this.f12727c;
    }

    public final p c() {
        return new m(0.0f, 0.0f);
    }

    public final void d() {
        this.f12725a = 0.0f;
        this.f12726b = 0.0f;
    }

    public final void e(int i8, float f10) {
        if (i8 == 0) {
            this.f12725a = f10;
        } else if (i8 == 1) {
            this.f12726b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!(mVar.f12725a == this.f12725a)) {
            return false;
        }
        return (mVar.f12726b > this.f12726b ? 1 : (mVar.f12726b == this.f12726b ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12726b) + (Float.hashCode(this.f12725a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f12725a + ", v2 = " + this.f12726b;
    }
}
