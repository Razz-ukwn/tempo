package db;

import ab.a0;
import ab.b0;
import ab.i;
import db.q;
import gb.a;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class t implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f7494a = Calendar.class;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f7495b = GregorianCalendar.class;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a0 f7496c;

    public t(q.r rVar) {
        this.f7496c = rVar;
    }

    public final <T> a0<T> a(i iVar, a<T> aVar) {
        Class<? super T> cls = aVar.f8928a;
        if (cls == this.f7494a || cls == this.f7495b) {
            return this.f7496c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f7494a.getName() + "+" + this.f7495b.getName() + ",adapter=" + this.f7496c + "]";
    }
}
