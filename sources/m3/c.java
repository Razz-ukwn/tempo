package m3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import zf.j;

public interface c extends Closeable {

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11181a;

        public a(int i8) {
            this.f11181a = i8;
        }

        public static void a(String str) {
            boolean z10 = true;
            if (!j.s0(str, ":memory:", true)) {
                int length = str.length() - 1;
                int i8 = 0;
                boolean z11 = false;
                while (i8 <= length) {
                    boolean z12 = sf.j.h(str.charAt(!z11 ? i8 : length), 32) <= 0;
                    if (!z11) {
                        if (!z12) {
                            z11 = true;
                        } else {
                            i8++;
                        }
                    } else if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i8, length + 1).toString().length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                    try {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } catch (Exception e10) {
                        Log.w("SupportSQLite", "delete failed: ", e10);
                    }
                }
            }
        }

        public abstract void b(n3.c cVar);

        public abstract void c(n3.c cVar);

        public abstract void d(n3.c cVar, int i8, int i10);

        public abstract void e(n3.c cVar);

        public abstract void f(n3.c cVar, int i8, int i10);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f11182a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11183b;

        /* renamed from: c  reason: collision with root package name */
        public final a f11184c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f11185d = false;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f11186e = false;

        public b(Context context, String str, a aVar) {
            sf.j.f(context, "context");
            this.f11182a = context;
            this.f11183b = str;
            this.f11184c = aVar;
        }
    }

    /* renamed from: m3.c$c  reason: collision with other inner class name */
    public interface C0212c {
        c b(b bVar);
    }

    b N();

    void setWriteAheadLoggingEnabled(boolean z10);
}
