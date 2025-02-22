package a0;

import rf.l;
import rf.p;
import sf.j;
import sf.k;

public final class d {

    public static final class a extends k implements p<f, Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f11a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            j.f((f) obj, "$this$Saver");
            return obj2;
        }
    }

    public static final class b extends k implements l<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12a = new b();

        public b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            j.f(obj, "it");
            return obj;
        }
    }

    static {
        a(a.f11a, b.f12a);
    }

    public static final e a(p pVar, l lVar) {
        j.f(pVar, "save");
        j.f(lVar, "restore");
        return new e(pVar, lVar);
    }
}
