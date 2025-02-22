package kc;

import n3.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0190a f10402a = new C0190a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f10403b = new b();

    /* renamed from: kc.a$a  reason: collision with other inner class name */
    public static final class C0190a extends j3.a {
        public C0190a() {
            super(1, 2);
        }

        public final void a(c cVar) {
            try {
                cVar.l("ALTER TABLE user ADD createdAt varchar(50)");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static final class b extends j3.a {
        public b() {
            super(2, 3);
        }

        public final void a(c cVar) {
            try {
                cVar.l("ALTER TABLE user ADD email varchar(50)");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
