package k6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class z extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    public static final String f10341c = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: d  reason: collision with root package name */
    public static final int f10342d = 5;

    /* renamed from: e  reason: collision with root package name */
    public static final List<a> f10343e = Arrays.asList(new a[]{new u(), new v(), new w(), new x(), new y()});

    /* renamed from: a  reason: collision with root package name */
    public final int f10344a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10345b = false;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public z(int i8, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i8);
        this.f10344a = i8;
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
        List<a> list = f10343e;
        if (i10 <= list.size()) {
            while (i8 < i10) {
                list.get(i8).a(sQLiteDatabase);
                i8++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i8 + " to " + i10 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f10345b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f10345b) {
            onConfigure(sQLiteDatabase);
        }
        c(sQLiteDatabase, 0, this.f10344a);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f10345b) {
            onConfigure(sQLiteDatabase);
        }
        c(sQLiteDatabase, 0, i10);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f10345b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
        if (!this.f10345b) {
            onConfigure(sQLiteDatabase);
        }
        c(sQLiteDatabase, i8, i10);
    }
}
