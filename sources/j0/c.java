package j0;

import androidx.databinding.a;
import h0.e;
import sf.j;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f9682a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9683b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9684c;

    public c(String str, long j10, int i8) {
        this.f9682a = str;
        this.f9683b = j10;
        this.f9684c = i8;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i8 < -1 || i8 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i8);

    public abstract float c(int i8);

    public boolean d() {
        return false;
    }

    public long e(float f10, float f11, float f12) {
        float[] f13 = f(new float[]{f10, f11, f12});
        return (((long) Float.floatToIntBits(f13[0])) << 32) | (((long) Float.floatToIntBits(f13[1])) & 4294967295L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9684c == cVar.f9684c && j.a(this.f9682a, cVar.f9682a)) {
            return b.a(this.f9683b, cVar.f9683b);
        }
        return false;
    }

    public abstract float[] f(float[] fArr);

    public float g(float f10, float f11, float f12) {
        return f(new float[]{f10, f11, f12})[2];
    }

    public long h(float f10, float f11, float f12, float f13, c cVar) {
        j.f(cVar, "colorSpace");
        int i8 = b.f9681e;
        float[] fArr = new float[((int) (this.f9683b >> 32))];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        float[] a10 = a(fArr);
        return a.e(a10[0], a10[1], a10[2], f13, cVar);
    }

    public int hashCode() {
        int i8 = b.f9681e;
        return e.a(this.f9683b, this.f9682a.hashCode() * 31, 31) + this.f9684c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9682a);
        sb2.append(" (id=");
        sb2.append(this.f9684c);
        sb2.append(", model=");
        long j10 = b.f9677a;
        long j11 = this.f9683b;
        sb2.append(b.a(j11, j10) ? "Rgb" : b.a(j11, b.f9678b) ? "Xyz" : b.a(j11, b.f9679c) ? "Lab" : b.a(j11, b.f9680d) ? "Cmyk" : "Unknown");
        sb2.append(')');
        return sb2.toString();
    }
}
