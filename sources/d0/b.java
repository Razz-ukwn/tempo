package d0;

import d0.a;
import e9.c;
import f1.i;
import f1.j;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final float f7167a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7168b;

    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final float f7169a;

        public a(float f10) {
            this.f7169a = f10;
        }

        public final int a(int i8, j jVar) {
            sf.j.f(jVar, "layoutDirection");
            float f10 = ((float) (i8 + 0)) / 2.0f;
            j jVar2 = j.f8039a;
            float f11 = this.f7169a;
            if (jVar != jVar2) {
                f11 *= (float) -1;
            }
            return q4.a.g((((float) 1) + f11) * f10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f7169a, ((a) obj).f7169a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f7169a);
        }

        public final String toString() {
            return "Horizontal(bias=" + this.f7169a + ')';
        }
    }

    /* renamed from: d0.b$b  reason: collision with other inner class name */
    public static final class C0111b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        public final float f7170a;

        public C0111b(float f10) {
            this.f7170a = f10;
        }

        public final int a(int i8) {
            return q4.a.g((((float) 1) + this.f7170a) * (((float) (i8 + 0)) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0111b) && Float.compare(this.f7170a, ((C0111b) obj).f7170a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f7170a);
        }

        public final String toString() {
            return "Vertical(bias=" + this.f7170a + ')';
        }
    }

    public b(float f10, float f11) {
        this.f7167a = f10;
        this.f7168b = f11;
    }

    public final long a(long j10, j jVar) {
        sf.j.f(jVar, "layoutDirection");
        float f10 = ((float) (((int) (j10 >> 32)) - ((int) 0))) / 2.0f;
        float a10 = ((float) (i.a(j10) - i.a(0))) / 2.0f;
        j jVar2 = j.f8039a;
        float f11 = this.f7167a;
        if (jVar != jVar2) {
            f11 *= (float) -1;
        }
        float f12 = (float) 1;
        return c.a(q4.a.g((f11 + f12) * f10), q4.a.g((f12 + this.f7168b) * a10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f7167a, bVar.f7167a) == 0 && Float.compare(this.f7168b, bVar.f7168b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7168b) + (Float.hashCode(this.f7167a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.f7167a + ", verticalBias=" + this.f7168b + ')';
    }
}
