package r4;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final b f13930a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f13931b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final e f13932c = new e();

    public class a extends m {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(p4.a aVar) {
            return aVar == p4.a.f12447b;
        }

        public final boolean d(boolean z10, p4.a aVar, p4.c cVar) {
            return (aVar == p4.a.f12449d || aVar == p4.a.f12450e) ? false : true;
        }
    }

    public class b extends m {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(p4.a aVar) {
            return false;
        }

        public final boolean d(boolean z10, p4.a aVar, p4.c cVar) {
            return false;
        }
    }

    public class c extends m {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(p4.a aVar) {
            return (aVar == p4.a.f12448c || aVar == p4.a.f12450e) ? false : true;
        }

        public final boolean d(boolean z10, p4.a aVar, p4.c cVar) {
            return false;
        }
    }

    public class d extends m {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(p4.a aVar) {
            return false;
        }

        public final boolean d(boolean z10, p4.a aVar, p4.c cVar) {
            return (aVar == p4.a.f12449d || aVar == p4.a.f12450e) ? false : true;
        }
    }

    public class e extends m {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(p4.a aVar) {
            return aVar == p4.a.f12447b;
        }

        public final boolean d(boolean z10, p4.a aVar, p4.c cVar) {
            return ((z10 && aVar == p4.a.f12448c) || aVar == p4.a.f12446a) && cVar == p4.c.f12455b;
        }
    }

    static {
        new a();
        new d();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(p4.a aVar);

    public abstract boolean d(boolean z10, p4.a aVar, p4.c cVar);
}
