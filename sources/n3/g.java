package n3;

import android.database.sqlite.SQLiteStatement;
import m3.f;

public final class g extends f implements f {

    /* renamed from: b  reason: collision with root package name */
    public final SQLiteStatement f11570b;

    public g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f11570b = sQLiteStatement;
    }

    public final long B0() {
        return this.f11570b.executeInsert();
    }

    public final int n() {
        return this.f11570b.executeUpdateDelete();
    }
}
