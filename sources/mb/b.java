package mb;

import ff.e;
import java.io.Serializable;
import sf.j;

public abstract class b<R> {

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f11373a;

        public a(Throwable th) {
            j.f(th, "throwable");
            this.f11373a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && j.a(this.f11373a, ((a) obj).f11373a);
        }

        public final int hashCode() {
            return this.f11373a.hashCode();
        }

        public final String toString() {
            return "Error(throwable=" + this.f11373a + ')';
        }
    }

    /* renamed from: mb.b$b  reason: collision with other inner class name */
    public static final class C0216b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0216b f11374a = new C0216b();
    }

    public static final class c<T> extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f11375a;

        public c(Serializable serializable) {
            this.f11375a = serializable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && j.a(this.f11375a, ((c) obj).f11375a);
        }

        public final int hashCode() {
            T t2 = this.f11375a;
            if (t2 == null) {
                return 0;
            }
            return t2.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.f11375a + ')';
        }
    }

    public String toString() {
        if (this instanceof c) {
            return "Success[data=" + ((c) this).f11375a + ']';
        } else if (this instanceof a) {
            return "Error[exception=" + ((a) this).f11373a + ']';
        } else if (j.a(this, C0216b.f11374a)) {
            return "Loading";
        } else {
            throw new e();
        }
    }
}
