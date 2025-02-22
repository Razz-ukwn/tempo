package n3;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import m3.b;
import m3.e;
import m3.f;
import rf.r;
import sf.j;
import sf.k;

public final class c implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f11550b = new String[0];

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteDatabase f11551a;

    public static final class a extends k implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f11552a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(4);
            this.f11552a = eVar;
        }

        public final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
            j.c(sQLiteQuery);
            this.f11552a.c(new f(sQLiteQuery));
            return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        j.f(sQLiteDatabase, "delegate");
        this.f11551a = sQLiteDatabase;
    }

    public final void I() {
        this.f11551a.setTransactionSuccessful();
    }

    public final void J() {
        this.f11551a.beginTransactionNonExclusive();
    }

    public final void U() {
        this.f11551a.endTransaction();
    }

    public final Cursor Z(e eVar, CancellationSignal cancellationSignal) {
        j.f(eVar, "query");
        String d10 = eVar.d();
        String[] strArr = f11550b;
        j.c(cancellationSignal);
        a aVar = new a(eVar);
        SQLiteDatabase sQLiteDatabase = this.f11551a;
        j.f(sQLiteDatabase, "sQLiteDatabase");
        j.f(d10, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, d10, strArr, (String) null, cancellationSignal);
        j.e(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public final List<Pair<String, String>> c() {
        return this.f11551a.getAttachedDbs();
    }

    public final void close() {
        this.f11551a.close();
    }

    public final String d() {
        return this.f11551a.getPath();
    }

    public final Cursor e(String str) {
        j.f(str, "query");
        return u0(new m3.a(str));
    }

    public final void f() {
        this.f11551a.beginTransaction();
    }

    public final boolean isOpen() {
        return this.f11551a.isOpen();
    }

    public final void l(String str) {
        j.f(str, "sql");
        this.f11551a.execSQL(str);
    }

    public final f o(String str) {
        j.f(str, "sql");
        SQLiteStatement compileStatement = this.f11551a.compileStatement(str);
        j.e(compileStatement, "delegate.compileStatement(sql)");
        return new g(compileStatement);
    }

    public final boolean o0() {
        return this.f11551a.inTransaction();
    }

    public final boolean s0() {
        SQLiteDatabase sQLiteDatabase = this.f11551a;
        j.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor u0(e eVar) {
        j.f(eVar, "query");
        Cursor rawQueryWithFactory = this.f11551a.rawQueryWithFactory(new b(new a(eVar)), eVar.d(), f11550b, (String) null);
        j.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }
}
