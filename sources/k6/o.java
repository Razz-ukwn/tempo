package k6;

import a6.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import d6.n;
import g6.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import k6.s;
import n6.a;

public final /* synthetic */ class o implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10320a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10321b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10322c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f10323d;

    public /* synthetic */ o(int i8, d dVar, Object obj, Object obj2) {
        this.f10320a = i8;
        this.f10321b = dVar;
        this.f10322c = obj;
        this.f10323d = obj2;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        long j10;
        int i8 = this.f10320a;
        Object obj2 = this.f10323d;
        Object obj3 = this.f10322c;
        Object obj4 = this.f10321b;
        switch (i8) {
            case 0:
                s sVar = (s) obj4;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                sVar.getClass();
                sQLiteDatabase.compileStatement((String) obj3).execute();
                Cursor rawQuery = sQLiteDatabase.rawQuery((String) obj2, (String[]) null);
                try {
                    b bVar = s.B;
                    while (rawQuery.moveToNext()) {
                        sVar.c((long) rawQuery.getInt(0), c.a.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    return null;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            default:
                s sVar2 = (s) obj4;
                n nVar = (n) obj3;
                d6.s sVar3 = (d6.s) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                long simpleQueryForLong = sVar2.p().compileStatement("PRAGMA page_count").simpleQueryForLong();
                e eVar = sVar2.f10332d;
                if (sVar2.p().compileStatement("PRAGMA page_size").simpleQueryForLong() * simpleQueryForLong >= eVar.e()) {
                    sVar2.c(1, c.a.CACHE_FULL, nVar.g());
                    return -1L;
                }
                Long q10 = s.q(sQLiteDatabase2, sVar3);
                if (q10 != null) {
                    j10 = q10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", sVar3.b());
                    contentValues.put("priority", Integer.valueOf(a.a(sVar3.d())));
                    contentValues.put("next_request_ms", 0);
                    if (sVar3.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(sVar3.c(), 0));
                    }
                    j10 = sQLiteDatabase2.insert("transport_contexts", (String) null, contentValues);
                }
                int d10 = eVar.d();
                byte[] bArr = nVar.d().f7354b;
                boolean z10 = bArr.length <= d10;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(j10));
                contentValues2.put("transport_name", nVar.g());
                contentValues2.put("timestamp_ms", Long.valueOf(nVar.e()));
                contentValues2.put("uptime_ms", Long.valueOf(nVar.h()));
                contentValues2.put("payload_encoding", nVar.d().f7353a.f117a);
                contentValues2.put("code", nVar.c());
                contentValues2.put("num_attempts", 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr : new byte[0]);
                long insert = sQLiteDatabase2.insert("events", (String) null, contentValues2);
                if (!z10) {
                    int ceil = (int) Math.ceil(((double) bArr.length) / ((double) d10));
                    for (int i10 = 1; i10 <= ceil; i10++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, (i10 - 1) * d10, Math.min(i10 * d10, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase2.insert("event_payloads", (String) null, contentValues3);
                    }
                }
                for (Map.Entry next : Collections.unmodifiableMap(nVar.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert));
                    contentValues4.put("name", (String) next.getKey());
                    contentValues4.put("value", (String) next.getValue());
                    sQLiteDatabase2.insert("event_metadata", (String) null, contentValues4);
                }
                return Long.valueOf(insert);
        }
    }
}
