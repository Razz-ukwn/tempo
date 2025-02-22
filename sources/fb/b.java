package fb;

import ab.a0;
import ab.b0;
import ab.i;
import ab.u;
import androidx.activity.result.d;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class b extends a0<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8667b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f8668a = new SimpleDateFormat("hh:mm:ss a");

    public class a implements b0 {
        public final <T> a0<T> a(i iVar, gb.a<T> aVar) {
            if (aVar.f8928a == Time.class) {
                return new b();
            }
            return null;
        }
    }

    public final Object a(hb.a aVar) {
        Time time;
        if (aVar.k0() == 9) {
            aVar.d0();
            return null;
        }
        String f02 = aVar.f0();
        try {
            synchronized (this) {
                time = new Time(this.f8668a.parse(f02).getTime());
            }
            return time;
        } catch (ParseException e10) {
            StringBuilder c3 = d.c("Failed parsing '", f02, "' as SQL Time; at path ");
            c3.append(aVar.D());
            throw new u(c3.toString(), e10);
        }
    }

    public final void b(hb.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.z();
            return;
        }
        synchronized (this) {
            format = this.f8668a.format(time);
        }
        bVar.R(format);
    }
}
