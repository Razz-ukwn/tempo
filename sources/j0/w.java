package j0;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final float f9738a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9739b;

    public w(float f10, float f11) {
        this.f9738a = f10;
        this.f9739b = f11;
    }

    public final float[] a() {
        float f10 = this.f9738a;
        float f11 = this.f9739b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f9738a, wVar.f9738a) == 0 && Float.compare(this.f9739b, wVar.f9739b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9739b) + (Float.hashCode(this.f9738a) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.f9738a + ", y=" + this.f9739b + ')';
    }
}
