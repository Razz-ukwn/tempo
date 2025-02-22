package db;

import ab.a0;
import ab.u;
import cb.c;
import cb.p;
import hb.b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public final class d<T extends Date> extends a0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final a<T> f7416a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f7417b;

    public static abstract class a<T extends Date> {

        /* renamed from: b  reason: collision with root package name */
        public static final C0119a f7418b = new C0119a();

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f7419a;

        /* renamed from: db.d$a$a  reason: collision with other inner class name */
        public class C0119a extends a<Date> {
            public C0119a() {
                super(Date.class);
            }

            public final Date a(Date date) {
                return date;
            }
        }

        public a(Class<T> cls) {
            this.f7419a = cls;
        }

        public abstract T a(Date date);
    }

    public d(a aVar, int i8, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f7417b = arrayList;
        aVar.getClass();
        this.f7416a = aVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i8, i10, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i8, i10));
        }
        if (p.f3931a >= 9) {
            arrayList.add(c.i(i8, i10));
        }
    }

    public final Object a(hb.a aVar) {
        Date b10;
        if (aVar.k0() == 9) {
            aVar.d0();
            return null;
        }
        String f02 = aVar.f0();
        synchronized (this.f7417b) {
            Iterator it = this.f7417b.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        b10 = ((DateFormat) it.next()).parse(f02);
                        break;
                    } catch (ParseException unused) {
                    }
                } else {
                    try {
                        b10 = eb.a.b(f02, new ParsePosition(0));
                        break;
                    } catch (ParseException e10) {
                        StringBuilder c3 = androidx.activity.result.d.c("Failed parsing '", f02, "' as Date; at path ");
                        c3.append(aVar.D());
                        throw new u(c3.toString(), e10);
                    }
                }
            }
        }
        return this.f7416a.a(b10);
    }

    public final void b(b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.z();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f7417b.get(0);
        synchronized (this.f7417b) {
            format = dateFormat.format(date);
        }
        bVar.R(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f7417b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
