package n3;

import android.database.sqlite.SQLiteProgram;
import m3.d;
import sf.j;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteProgram f11569a;

    public f(SQLiteProgram sQLiteProgram) {
        j.f(sQLiteProgram, "delegate");
        this.f11569a = sQLiteProgram;
    }

    public final void H(int i8, long j10) {
        this.f11569a.bindLong(i8, j10);
    }

    public final void S(byte[] bArr, int i8) {
        this.f11569a.bindBlob(i8, bArr);
    }

    public final void close() {
        this.f11569a.close();
    }

    public final void h0(int i8) {
        this.f11569a.bindNull(i8);
    }

    public final void m(int i8, String str) {
        j.f(str, "value");
        this.f11569a.bindString(i8, str);
    }

    public final void t(int i8, double d10) {
        this.f11569a.bindDouble(i8, d10);
    }
}
