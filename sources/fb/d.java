package fb;

import db.d;
import fb.a;
import fb.b;
import fb.c;
import java.sql.Date;
import java.sql.Timestamp;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f8671a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f8672b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f8673c;

    /* renamed from: d  reason: collision with root package name */
    public static final a.C0155a f8674d;

    /* renamed from: e  reason: collision with root package name */
    public static final b.a f8675e;

    /* renamed from: f  reason: collision with root package name */
    public static final c.a f8676f;

    public class a extends d.a<Date> {
        public a() {
            super(Date.class);
        }

        public final java.util.Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    public class b extends d.a<Timestamp> {
        public b() {
            super(Timestamp.class);
        }

        public final java.util.Date a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f8671a = z10;
        if (z10) {
            f8672b = new a();
            f8673c = new b();
            f8674d = a.f8665b;
            f8675e = b.f8667b;
            f8676f = c.f8669b;
            return;
        }
        f8672b = null;
        f8673c = null;
        f8674d = null;
        f8675e = null;
        f8676f = null;
    }
}
