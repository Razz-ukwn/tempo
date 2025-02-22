package eg;

import sf.j;

public abstract class e {

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final float f8013a;

        /* renamed from: b  reason: collision with root package name */
        public final float f8014b;

        public a(float f10, float f11) {
            this.f8013a = f10;
            this.f8014b = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return j.a(Float.valueOf(this.f8013a), Float.valueOf(aVar.f8013a)) && j.a(Float.valueOf(this.f8014b), Float.valueOf(aVar.f8014b));
        }

        public final int hashCode() {
            return Float.hashCode(this.f8014b) + (Float.hashCode(this.f8013a) * 31);
        }

        public final String toString() {
            return "Absolute(x=" + this.f8013a + ", y=" + this.f8014b + ')';
        }
    }

    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final double f8015a = 0.5d;

        /* renamed from: b  reason: collision with root package name */
        public final double f8016b;

        public b(double d10) {
            this.f8016b = d10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return j.a(Double.valueOf(this.f8015a), Double.valueOf(bVar.f8015a)) && j.a(Double.valueOf(this.f8016b), Double.valueOf(bVar.f8016b));
        }

        public final int hashCode() {
            return Double.hashCode(this.f8016b) + (Double.hashCode(this.f8015a) * 31);
        }

        public final String toString() {
            return "Relative(x=" + this.f8015a + ", y=" + this.f8016b + ')';
        }
    }

    public static final class c extends e {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return j.a((Object) null, (Object) null) && j.a((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "between(min=null, max=null)";
        }
    }
}
