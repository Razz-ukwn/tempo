package k6;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import g6.c;
import k6.s;

public final /* synthetic */ class m implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.a f10316b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f10317c;

    public /* synthetic */ m(long j10, c.a aVar, String str) {
        this.f10315a = str;
        this.f10316b = aVar;
        this.f10317c = j10;
    }

    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        String str = this.f10315a;
        c.a aVar = this.f10316b;
        boolean booleanValue = ((Boolean) s.D(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.f8886a)}), new j(2))).booleanValue();
        long j10 = this.f10317c;
        int i8 = aVar.f8886a;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i8));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i8)});
        }
        return null;
    }
}
