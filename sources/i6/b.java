package i6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import d6.n;
import g6.a;
import g6.c;
import g6.d;
import g6.e;
import g6.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k6.r;
import k6.s;
import l6.b;

public final /* synthetic */ class b implements b.a, s.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f9597a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9598b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9599c;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3) {
        this.f9597a = obj;
        this.f9598b = obj2;
        this.f9599c = obj3;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        s sVar = (s) this.f9597a;
        Map map = (Map) this.f9598b;
        a.C0157a aVar = (a.C0157a) this.f9599c;
        Cursor cursor = (Cursor) obj;
        a6.b bVar = s.B;
        sVar.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i8 = cursor.getInt(1);
            c.a aVar2 = c.a.REASON_UNKNOWN;
            if (i8 != 0) {
                if (i8 == 1) {
                    aVar2 = c.a.MESSAGE_TOO_OLD;
                } else if (i8 == 2) {
                    aVar2 = c.a.CACHE_FULL;
                } else if (i8 == 3) {
                    aVar2 = c.a.PAYLOAD_TOO_BIG;
                } else if (i8 == 4) {
                    aVar2 = c.a.MAX_RETRIES_REACHED;
                } else if (i8 == 5) {
                    aVar2 = c.a.INVALID_PAYLOD;
                } else if (i8 == 6) {
                    aVar2 = c.a.SERVER_ERROR;
                } else {
                    h6.a.a(Integer.valueOf(i8), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                }
            }
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(new c(j10, aVar2));
        }
        for (Map.Entry entry : map.entrySet()) {
            int i10 = d.f8887c;
            new ArrayList();
            aVar.f8876b.add(new d((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
        long a10 = sVar.f10330b.a();
        SQLiteDatabase p10 = sVar.p();
        p10.beginTransaction();
        try {
            f fVar = (f) s.D(p10.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new r(a10));
            p10.setTransactionSuccessful();
            p10.endTransaction();
            aVar.f8875a = fVar;
            aVar.f8877c = new g6.b(new e(sVar.p().compileStatement("PRAGMA page_size").simpleQueryForLong() * sVar.p().compileStatement("PRAGMA page_count").simpleQueryForLong(), k6.e.f10306a.f10295b));
            aVar.f8878d = sVar.f10333e.get();
            return new a(aVar.f8875a, Collections.unmodifiableList(aVar.f8876b), aVar.f8877c, aVar.f8878d);
        } catch (Throwable th) {
            p10.endTransaction();
            throw th;
        }
    }

    public final Object b() {
        c cVar = (c) this.f9597a;
        d6.s sVar = (d6.s) this.f9598b;
        cVar.f9604d.C(sVar, (n) this.f9599c);
        cVar.f9601a.b(sVar, 1);
        return null;
    }
}
