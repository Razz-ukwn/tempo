package q;

public final class o extends p {

    /* renamed from: a  reason: collision with root package name */
    public float f12757a;

    /* renamed from: b  reason: collision with root package name */
    public float f12758b;

    /* renamed from: c  reason: collision with root package name */
    public float f12759c;

    /* renamed from: d  reason: collision with root package name */
    public float f12760d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12761e = 4;

    public o(float f10, float f11, float f12, float f13) {
        this.f12757a = f10;
        this.f12758b = f11;
        this.f12759c = f12;
        this.f12760d = f13;
    }

    public final float a(int i8) {
        if (i8 == 0) {
            return this.f12757a;
        }
        if (i8 == 1) {
            return this.f12758b;
        }
        if (i8 == 2) {
            return this.f12759c;
        }
        if (i8 != 3) {
            return 0.0f;
        }
        return this.f12760d;
    }

    public final int b() {
        return this.f12761e;
    }

    public final p c() {
        return new o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void d() {
        this.f12757a = 0.0f;
        this.f12758b = 0.0f;
        this.f12759c = 0.0f;
        this.f12760d = 0.0f;
    }

    public final void e(int i8, float f10) {
        if (i8 == 0) {
            this.f12757a = f10;
        } else if (i8 == 1) {
            this.f12758b = f10;
        } else if (i8 == 2) {
            this.f12759c = f10;
        } else if (i8 == 3) {
            this.f12760d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!(oVar.f12757a == this.f12757a)) {
            return false;
        }
        if (!(oVar.f12758b == this.f12758b)) {
            return false;
        }
        if (!(oVar.f12759c == this.f12759c)) {
            return false;
        }
        return (oVar.f12760d > this.f12760d ? 1 : (oVar.f12760d == this.f12760d ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12760d) + n.a(this.f12759c, n.a(this.f12758b, Float.hashCode(this.f12757a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f12757a + ", v2 = " + this.f12758b + ", v3 = " + this.f12759c + ", v4 = " + this.f12760d;
    }
}
