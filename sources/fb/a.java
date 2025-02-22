package fb;

import ab.a0;
import ab.b0;
import ab.i;
import ab.u;
import androidx.activity.result.d;
import hb.b;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class a extends a0<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final C0155a f8665b = new C0155a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f8666a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: fb.a$a  reason: collision with other inner class name */
    public class C0155a implements b0 {
        public final <T> a0<T> a(i iVar, gb.a<T> aVar) {
            if (aVar.f8928a == Date.class) {
                return new a();
            }
            return null;
        }
    }

    public final Object a(hb.a aVar) {
        java.util.Date parse;
        if (aVar.k0() == 9) {
            aVar.d0();
            return null;
        }
        String f02 = aVar.f0();
        try {
            synchronized (this) {
                parse = this.f8666a.parse(f02);
            }
            return new Date(parse.getTime());
        } catch (ParseException e10) {
            StringBuilder c3 = d.c("Failed parsing '", f02, "' as SQL Date; at path ");
            c3.append(aVar.D());
            throw new u(c3.toString(), e10);
        }
    }

    public final void b(b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.z();
            return;
        }
        synchronized (this) {
            format = this.f8666a.format(date);
        }
        bVar.R(format);
    }
}
