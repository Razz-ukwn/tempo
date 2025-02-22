package v0;

import sf.j;

public final class k {

    public static final class a extends sf.k implements rf.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16064a = new a();

        public a() {
            super(0);
        }

        public final T d() {
            return null;
        }
    }

    public static final <T> T a(j jVar, w<T> wVar) {
        j.f(jVar, "<this>");
        j.f(wVar, "key");
        j.f(a.f16064a, "defaultValue");
        T t2 = jVar.f16061a.get(wVar);
        if (t2 == null) {
            return null;
        }
        return t2;
    }
}
