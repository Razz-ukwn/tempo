package m5;

import android.util.Log;
import c2.f;
import m5.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0213a f11214a = new C0213a();

    /* renamed from: m5.a$a  reason: collision with other inner class name */
    public class C0213a implements e<Object> {
        public final void a(Object obj) {
        }
    }

    public interface b<T> {
        T a();
    }

    public static final class c<T> implements c2.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f11215a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f11216b;

        /* renamed from: c  reason: collision with root package name */
        public final c2.d<T> f11217c;

        public c(f fVar, b bVar, e eVar) {
            this.f11217c = fVar;
            this.f11215a = bVar;
            this.f11216b = eVar;
        }

        public final boolean a(T t2) {
            if (t2 instanceof d) {
                ((d) t2).b().f11218a = true;
            }
            this.f11216b.a(t2);
            return this.f11217c.a(t2);
        }

        public final T b() {
            T b10 = this.f11217c.b();
            if (b10 == null) {
                b10 = this.f11215a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b10.getClass());
                }
            }
            if (b10 instanceof d) {
                ((d) b10).b().f11218a = false;
            }
            return b10;
        }
    }

    public interface d {
        d.a b();
    }

    public interface e<T> {
        void a(T t2);
    }

    public static c a(int i8, b bVar) {
        return new c(new f(i8), bVar, f11214a);
    }
}
