package k6;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import k6.s;
import n6.a;

public final /* synthetic */ class n implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f10318a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d6.s f10319b;

    public /* synthetic */ n(long j10, d6.s sVar) {
        this.f10318a = j10;
        this.f10319b = sVar;
    }

    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f10318a));
        d6.s sVar = this.f10319b;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(a.a(sVar.d()))}) < 1) {
            contentValues.put("backend_name", sVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(sVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
