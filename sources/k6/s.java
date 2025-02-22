package k6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import d6.n;
import g6.a;
import g6.c;
import j0.f;
import j0.m;
import j0.o;
import j6.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import l6.b;

public final class s implements d, l6.b, c {
    public static final a6.b B = new a6.b("proto");

    /* renamed from: a  reason: collision with root package name */
    public final z f10329a;

    /* renamed from: b  reason: collision with root package name */
    public final m6.a f10330b;

    /* renamed from: c  reason: collision with root package name */
    public final m6.a f10331c;

    /* renamed from: d  reason: collision with root package name */
    public final e f10332d;

    /* renamed from: e  reason: collision with root package name */
    public final ef.a<String> f10333e;

    public interface a<T, U> {
        U apply(T t2);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f10334a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10335b;

        public b(String str, String str2) {
            this.f10334a = str;
            this.f10335b = str2;
        }
    }

    public s(m6.a aVar, m6.a aVar2, e eVar, z zVar, ef.a<String> aVar3) {
        this.f10329a = zVar;
        this.f10330b = aVar;
        this.f10331c = aVar2;
        this.f10332d = eVar;
        this.f10333e = aVar3;
    }

    public static <T> T D(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long q(SQLiteDatabase sQLiteDatabase, d6.s sVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{sVar.b(), String.valueOf(n6.a.a(sVar.d()))}));
        if (sVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String z(Iterable<i> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public final Iterable<d6.s> A() {
        return (Iterable) s(new f(3));
    }

    public final b C(d6.s sVar, n nVar) {
        Object[] objArr = {sVar.d(), nVar.g(), sVar.b()};
        String c3 = h6.a.c("SQLiteEventStore");
        if (Log.isLoggable(c3, 3)) {
            Log.d(c3, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long longValue = ((Long) s(new o(1, this, nVar, sVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new b(longValue, sVar, nVar);
    }

    public final void c(long j10, c.a aVar, String str) {
        s(new m(j10, aVar, str));
    }

    public final void close() {
        this.f10329a.close();
    }

    public final <T> T d(b.a<T> aVar) {
        SQLiteDatabase p10 = p();
        m6.a aVar2 = this.f10331c;
        long a10 = aVar2.a();
        while (true) {
            try {
                p10.beginTransaction();
                try {
                    T b10 = aVar.b();
                    p10.setTransactionSuccessful();
                    return b10;
                } finally {
                    p10.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar2.a() < ((long) this.f10332d.a()) + a10) {
                    SystemClock.sleep(50);
                } else {
                    throw new l6.a("Timed out while trying to acquire the lock.", e10);
                }
            }
        }
    }

    public final void e() {
        s(new m(this, 4));
    }

    public final int g() {
        return ((Integer) s(new k(this, this.f10330b.a() - this.f10332d.b()))).intValue();
    }

    public final long h(d6.s sVar) {
        return ((Long) D(p().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(n6.a.a(sVar.d()))}), new o(2))).longValue();
    }

    public final void i(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            p().compileStatement("DELETE FROM events WHERE _id in " + z(iterable)).execute();
        }
    }

    public final boolean i0(d6.s sVar) {
        return ((Boolean) s(new l(this, sVar))).booleanValue();
    }

    public final g6.a j() {
        int i8 = g6.a.f8870e;
        a.C0157a aVar = new a.C0157a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase p10 = p();
        p10.beginTransaction();
        try {
            g6.a aVar2 = (g6.a) D(p10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new i6.b(this, hashMap, aVar));
            p10.setTransactionSuccessful();
            return aVar2;
        } finally {
            p10.endTransaction();
        }
    }

    public final SQLiteDatabase p() {
        Object obj;
        z zVar = this.f10329a;
        Objects.requireNonNull(zVar);
        j jVar = new j(0);
        m6.a aVar = this.f10331c;
        long a10 = aVar.a();
        while (true) {
            try {
                obj = zVar.getWritableDatabase();
                break;
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() >= ((long) this.f10332d.a()) + a10) {
                    obj = jVar.apply(e10);
                    break;
                }
                SystemClock.sleep(50);
            }
        }
        return (SQLiteDatabase) obj;
    }

    public final Iterable<i> r0(d6.s sVar) {
        return (Iterable) s(new i(this, sVar));
    }

    public final <T> T s(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase p10 = p();
        p10.beginTransaction();
        try {
            T apply = aVar.apply(p10);
            p10.setTransactionSuccessful();
            return apply;
        } finally {
            p10.endTransaction();
        }
    }

    public final ArrayList u(SQLiteDatabase sQLiteDatabase, d6.s sVar, int i8) {
        ArrayList arrayList = new ArrayList();
        Long q10 = q(sQLiteDatabase, sVar);
        if (q10 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        D(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{q10.toString()}, (String) null, (String) null, (String) null, String.valueOf(i8)), new p(this, arrayList, sVar));
        return arrayList;
    }

    public final void v(long j10, d6.s sVar) {
        s(new n(j10, sVar));
    }

    public final void y0(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            s(new o(0, this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + z(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }
}
