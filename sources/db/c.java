package db;

import ab.a0;
import ab.b0;
import ab.i;
import ab.u;
import androidx.activity.result.d;
import cb.p;
import hb.b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public final class c extends a0<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f7414b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7415a;

    public class a implements b0 {
        public final <T> a0<T> a(i iVar, gb.a<T> aVar) {
            if (aVar.f8928a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f7415a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (p.f3931a >= 9) {
            arrayList.add(cb.c.i(2, 2));
        }
    }

    public final Object a(hb.a aVar) {
        if (aVar.k0() == 9) {
            aVar.d0();
            return null;
        }
        String f02 = aVar.f0();
        synchronized (this.f7415a) {
            Iterator it = this.f7415a.iterator();
            while (it.hasNext()) {
                try {
                    Date parse = ((DateFormat) it.next()).parse(f02);
                    return parse;
                } catch (ParseException unused) {
                }
            }
            try {
                return eb.a.b(f02, new ParsePosition(0));
            } catch (ParseException e10) {
                StringBuilder c3 = d.c("Failed parsing '", f02, "' as Date; at path ");
                c3.append(aVar.D());
                throw new u(c3.toString(), e10);
            }
        }
    }

    public final void b(b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.z();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f7415a.get(0);
        synchronized (this.f7415a) {
            format = dateFormat.format(date);
        }
        bVar.R(format);
    }
}
