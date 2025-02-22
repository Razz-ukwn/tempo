package k6;

import android.database.sqlite.SQLiteDatabase;
import k6.z;

public final /* synthetic */ class w implements z.a {
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
