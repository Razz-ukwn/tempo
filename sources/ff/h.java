package ff;

import java.io.Serializable;
import sf.j;

public final class h<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8708a;

    public static final class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f8709a;

        public a(Throwable th) {
            j.f(th, "exception");
            this.f8709a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (j.a(this.f8709a, ((a) obj).f8709a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f8709a.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f8709a + ')';
        }
    }

    public /* synthetic */ h(Object obj) {
        this.f8708a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f8709a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return j.a(this.f8708a, ((h) obj).f8708a);
    }

    public final int hashCode() {
        Object obj = this.f8708a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f8708a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
