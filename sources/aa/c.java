package aa;

import ea.e;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f217c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final e f218a;

    /* renamed from: b  reason: collision with root package name */
    public a f219b;

    public static final class a implements a {
        public final void a() {
        }

        public final String b() {
            return null;
        }

        public final void c(String str, long j10) {
        }
    }

    public c(e eVar) {
        this.f218a = eVar;
        this.f219b = f217c;
    }

    public final void a(String str) {
        this.f219b.a();
        this.f219b = f217c;
        if (str != null) {
            this.f219b = new f(this.f218a.b(str, "userlog"));
        }
    }

    public c(e eVar, String str) {
        this(eVar);
        a(str);
    }
}
