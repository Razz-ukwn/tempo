package q7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public final class l2 extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m2 f13160a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f13160a = m2Var;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            m2 m2Var = this.f13160a;
            s2 s2Var = ((x3) m2Var.f13121a).E;
            x3.l(s2Var);
            s2Var.B.b("Opening the local database failed, dropping and recreating it");
            ((x3) m2Var.f13121a).getClass();
            if (!((x3) m2Var.f13121a).f13419a.getDatabasePath("google_app_measurement_local.db").delete()) {
                s2 s2Var2 = ((x3) m2Var.f13121a).E;
                x3.l(s2Var2);
                s2Var2.B.c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                s2 s2Var3 = ((x3) m2Var.f13121a).E;
                x3.l(s2Var3);
                s2Var3.B.c(e11, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        s2 s2Var = ((x3) this.f13160a.f13121a).E;
        x3.l(s2Var);
        l.b(s2Var, sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        s2 s2Var = ((x3) this.f13160a.f13121a).E;
        x3.l(s2Var);
        l.a(s2Var, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
    }
}
