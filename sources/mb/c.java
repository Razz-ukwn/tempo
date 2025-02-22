package mb;

import java.io.File;
import s0.b0;
import sf.j;

public abstract class c<T> {

    public static final class a<T> extends c<T> {
    }

    public static final class b<T> extends c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f11376a;

        public b(String str) {
            this.f11376a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && j.a(this.f11376a, ((b) obj).f11376a);
        }

        public final int hashCode() {
            return this.f11376a.hashCode();
        }

        public final String toString() {
            return b0.a(new StringBuilder("Error(minVideoTime="), this.f11376a, ')');
        }
    }

    /* renamed from: mb.c$c  reason: collision with other inner class name */
    public static final class C0217c<T> extends c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f11377a;

        public C0217c(File file) {
            this.f11377a = file;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0217c) && j.a(this.f11377a, ((C0217c) obj).f11377a);
        }

        public final int hashCode() {
            T t2 = this.f11377a;
            if (t2 == null) {
                return 0;
            }
            return t2.hashCode();
        }

        public final String toString() {
            return "Start(item=" + this.f11377a + ')';
        }
    }

    public static final class d<T> extends c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f11378a;

        public d(String str) {
            this.f11378a = str;
        }
    }
}
