package n3;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import n3.c;
import rf.r;
import sf.j;

public final /* synthetic */ class b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f11549a;

    public /* synthetic */ b(c.a aVar) {
        this.f11549a = aVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        r rVar = this.f11549a;
        j.f(rVar, "$tmp0");
        return (Cursor) rVar.k(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
