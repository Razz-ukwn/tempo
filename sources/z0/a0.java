package z0;

import sf.j;
import t.y2;

public interface a0 extends y2<Object> {

    public static final class a implements a0 {

        /* renamed from: a  reason: collision with root package name */
        public final Object f17592a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f17593b;

        public a(boolean z10, Object obj) {
            j.f(obj, "value");
            this.f17592a = obj;
            this.f17593b = z10;
        }

        public final boolean d() {
            return this.f17593b;
        }

        public final Object getValue() {
            return this.f17592a;
        }
    }

    boolean d();
}
