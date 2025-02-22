package i0;

import h0.d;
import sf.j;

public abstract class m {

    public static final class a extends m {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return j.a((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static final class b extends m {

        /* renamed from: a  reason: collision with root package name */
        public final d f9382a;

        public b(d dVar) {
            this.f9382a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return j.a(this.f9382a, ((b) obj).f9382a);
        }

        public final int hashCode() {
            return this.f9382a.hashCode();
        }
    }

    public static final class c extends m {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return j.a((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }
    }
}
