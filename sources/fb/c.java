package fb;

import ab.a0;
import ab.b0;
import ab.i;
import hb.b;
import java.sql.Timestamp;
import java.util.Date;

public final class c extends a0<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8669b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final a0<Date> f8670a;

    public class a implements b0 {
        public final <T> a0<T> a(i iVar, gb.a<T> aVar) {
            if (aVar.f8928a != Timestamp.class) {
                return null;
            }
            iVar.getClass();
            return new c(iVar.c(new gb.a(Date.class)));
        }
    }

    public c(a0 a0Var) {
        this.f8670a = a0Var;
    }

    public final Object a(hb.a aVar) {
        Date a10 = this.f8670a.a(aVar);
        if (a10 != null) {
            return new Timestamp(a10.getTime());
        }
        return null;
    }

    public final void b(b bVar, Object obj) {
        this.f8670a.b(bVar, (Timestamp) obj);
    }
}
