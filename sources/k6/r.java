package k6;

import android.database.Cursor;
import g6.f;
import k6.s;

public final /* synthetic */ class r implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f10328a;

    public /* synthetic */ r(long j10) {
        this.f10328a = j10;
    }

    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new f(cursor.getLong(0), this.f10328a);
    }
}
