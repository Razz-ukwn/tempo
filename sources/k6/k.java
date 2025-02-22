package k6;

import android.database.sqlite.SQLiteDatabase;
import j0.p;
import k6.s;

public final /* synthetic */ class k implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f10311a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f10312b;

    public /* synthetic */ k(s sVar, long j10) {
        this.f10311a = sVar;
        this.f10312b = j10;
    }

    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s sVar = this.f10311a;
        sVar.getClass();
        String[] strArr = {String.valueOf(this.f10312b)};
        s.D(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new p(sVar, 3));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }
}
