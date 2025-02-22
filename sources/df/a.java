package df;

import af.i;
import af.j;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final se.a f7520a = cf.a.a(new f());

    /* renamed from: df.a$a  reason: collision with other inner class name */
    public static final class C0121a {

        /* renamed from: a  reason: collision with root package name */
        public static final af.a f7521a = new af.a();
    }

    public static final class b implements Callable<se.a> {
        public final Object call() {
            return C0121a.f7521a;
        }
    }

    public static final class c implements Callable<se.a> {
        public final Object call() {
            return d.f7522a;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final af.b f7522a = new af.b();
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final af.c f7523a = new af.c();
    }

    public static final class f implements Callable<se.a> {
        public final Object call() {
            return e.f7523a;
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public static final i f7524a = new i();
    }

    public static final class h implements Callable<se.a> {
        public final Object call() {
            return g.f7524a;
        }
    }

    static {
        cf.a.a(new h());
        cf.a.a(new b());
        cf.a.a(new c());
        int i8 = j.f375b;
    }
}
