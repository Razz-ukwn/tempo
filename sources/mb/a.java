package mb;

import sf.j;

public abstract class a<T> {

    /* renamed from: mb.a$a  reason: collision with other inner class name */
    public static final class C0215a<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f11371a;

        public C0215a(Throwable th) {
            j.f(th, "throwable");
            this.f11371a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0215a) && j.a(this.f11371a, ((C0215a) obj).f11371a);
        }

        public final int hashCode() {
            return this.f11371a.hashCode();
        }

        public final String toString() {
            return "Error(throwable=" + this.f11371a + ')';
        }
    }

    public static final class b<T> extends a<T> {
    }

    public static final class c<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f11372a;

        public c(T t2) {
            this.f11372a = t2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && j.a(this.f11372a, ((c) obj).f11372a);
        }

        public final int hashCode() {
            T t2 = this.f11372a;
            if (t2 == null) {
                return 0;
            }
            return t2.hashCode();
        }

        public final String toString() {
            return "Success(item=" + this.f11372a + ')';
        }
    }
}
