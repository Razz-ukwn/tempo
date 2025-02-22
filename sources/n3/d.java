package n3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.internal.measurement.f2;
import ff.j;
import java.io.File;
import java.util.UUID;
import m3.c;
import sf.k;

public final class d implements m3.c {
    public final j B = b7.a.x(new c(this));
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11553a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11554b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f11555c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11556d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11557e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public c f11558a = null;
    }

    public static final class b extends SQLiteOpenHelper {
        public static final /* synthetic */ int D = 0;
        public final o3.a B;
        public boolean C;

        /* renamed from: a  reason: collision with root package name */
        public final Context f11559a;

        /* renamed from: b  reason: collision with root package name */
        public final a f11560b;

        /* renamed from: c  reason: collision with root package name */
        public final c.a f11561c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f11562d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11563e;

        public static final class a extends RuntimeException {

            /* renamed from: a  reason: collision with root package name */
            public final int f11564a;

            /* renamed from: b  reason: collision with root package name */
            public final Throwable f11565b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(int i8, Throwable th) {
                super(th);
                f2.a(i8, "callbackName");
                this.f11564a = i8;
                this.f11565b = th;
            }

            public final Throwable getCause() {
                return this.f11565b;
            }
        }

        /* renamed from: n3.d$b$b  reason: collision with other inner class name */
        public static final class C0222b {
            public static c a(a aVar, SQLiteDatabase sQLiteDatabase) {
                sf.j.f(aVar, "refHolder");
                sf.j.f(sQLiteDatabase, "sqLiteDatabase");
                c cVar = aVar.f11558a;
                if (cVar != null && sf.j.a(cVar.f11551a, sQLiteDatabase)) {
                    return cVar;
                }
                c cVar2 = new c(sQLiteDatabase);
                aVar.f11558a = cVar2;
                return cVar2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, a aVar, c.a aVar2, boolean z10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar2.f11181a, new e(aVar2, aVar));
            sf.j.f(context, "context");
            sf.j.f(aVar2, "callback");
            this.f11559a = context;
            this.f11560b = aVar;
            this.f11561c = aVar2;
            this.f11562d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                sf.j.e(str, "randomUUID().toString()");
            }
            this.B = new o3.a(str, context.getCacheDir(), false);
        }

        public final m3.b c(boolean z10) {
            o3.a aVar = this.B;
            try {
                aVar.a(!this.C && getDatabaseName() != null);
                this.f11563e = false;
                SQLiteDatabase j10 = j(z10);
                if (this.f11563e) {
                    close();
                    return c(z10);
                }
                c d10 = d(j10);
                aVar.b();
                return d10;
            } finally {
                aVar.b();
            }
        }

        public final void close() {
            o3.a aVar = this.B;
            try {
                aVar.a(aVar.f12127a);
                super.close();
                this.f11560b.f11558a = null;
                this.C = false;
            } finally {
                aVar.b();
            }
        }

        public final c d(SQLiteDatabase sQLiteDatabase) {
            sf.j.f(sQLiteDatabase, "sqLiteDatabase");
            return C0222b.a(this.f11560b, sQLiteDatabase);
        }

        public final SQLiteDatabase e(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                sf.j.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            sf.j.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:12|11|13|14|15|16|17) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.database.sqlite.SQLiteDatabase j(boolean r6) {
            /*
                r5 = this;
                java.lang.String r0 = r5.getDatabaseName()
                boolean r1 = r5.C
                android.content.Context r2 = r5.f11559a
                if (r0 == 0) goto L_0x0032
                if (r1 != 0) goto L_0x0032
                java.io.File r1 = r2.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L_0x0032
                r1.mkdirs()
                boolean r3 = r1.isDirectory()
                if (r3 != 0) goto L_0x0032
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Invalid database parent file, not a directory: "
                r3.<init>(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                java.lang.String r3 = "SupportSQLite"
                android.util.Log.w(r3, r1)
            L_0x0032:
                android.database.sqlite.SQLiteDatabase r6 = r5.e(r6)     // Catch:{ all -> 0x0037 }
                return r6
            L_0x0037:
                super.close()
                r3 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x003f }
            L_0x003f:
                android.database.sqlite.SQLiteDatabase r6 = r5.e(r6)     // Catch:{ all -> 0x0044 }
                return r6
            L_0x0044:
                r1 = move-exception
                super.close()
                boolean r3 = r1 instanceof n3.d.b.a
                if (r3 == 0) goto L_0x0068
                n3.d$b$a r1 = (n3.d.b.a) r1
                int r3 = r1.f11564a
                int r3 = q.g.c(r3)
                java.lang.Throwable r1 = r1.f11565b
                if (r3 == 0) goto L_0x0067
                r4 = 1
                if (r3 == r4) goto L_0x0067
                r4 = 2
                if (r3 == r4) goto L_0x0067
                r4 = 3
                if (r3 == r4) goto L_0x0067
                boolean r3 = r1 instanceof android.database.sqlite.SQLiteException
                if (r3 == 0) goto L_0x0066
                goto L_0x0072
            L_0x0066:
                throw r1
            L_0x0067:
                throw r1
            L_0x0068:
                boolean r3 = r1 instanceof android.database.sqlite.SQLiteException
                if (r3 == 0) goto L_0x007f
                if (r0 == 0) goto L_0x007e
                boolean r3 = r5.f11562d
                if (r3 == 0) goto L_0x007e
            L_0x0072:
                r2.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r6 = r5.e(r6)     // Catch:{ a -> 0x007a }
                return r6
            L_0x007a:
                r6 = move-exception
                java.lang.Throwable r6 = r6.f11565b
                throw r6
            L_0x007e:
                throw r1
            L_0x007f:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n3.d.b.j(boolean):android.database.sqlite.SQLiteDatabase");
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            sf.j.f(sQLiteDatabase, "db");
            boolean z10 = this.f11563e;
            c.a aVar = this.f11561c;
            if (!z10 && aVar.f11181a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                aVar.b(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(1, th);
            }
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sf.j.f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f11561c.c(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(2, th);
            }
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
            sf.j.f(sQLiteDatabase, "db");
            this.f11563e = true;
            try {
                this.f11561c.d(d(sQLiteDatabase), i8, i10);
            } catch (Throwable th) {
                throw new a(4, th);
            }
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            sf.j.f(sQLiteDatabase, "db");
            if (!this.f11563e) {
                try {
                    this.f11561c.e(d(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(5, th);
                }
            }
            this.C = true;
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
            sf.j.f(sQLiteDatabase, "sqLiteDatabase");
            this.f11563e = true;
            try {
                this.f11561c.f(d(sQLiteDatabase), i8, i10);
            } catch (Throwable th) {
                throw new a(3, th);
            }
        }
    }

    public static final class c extends k implements rf.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f11566a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.f11566a = dVar;
        }

        public final Object d() {
            b bVar;
            d dVar = this.f11566a;
            if (dVar.f11554b == null || !dVar.f11556d) {
                bVar = new b(dVar.f11553a, dVar.f11554b, new a(), dVar.f11555c, dVar.f11557e);
            } else {
                Context context = dVar.f11553a;
                sf.j.f(context, "context");
                File noBackupFilesDir = context.getNoBackupFilesDir();
                sf.j.e(noBackupFilesDir, "context.noBackupFilesDir");
                bVar = new b(dVar.f11553a, new File(noBackupFilesDir, dVar.f11554b).getAbsolutePath(), new a(), dVar.f11555c, dVar.f11557e);
            }
            bVar.setWriteAheadLoggingEnabled(dVar.C);
            return bVar;
        }
    }

    public d(Context context, String str, c.a aVar, boolean z10, boolean z11) {
        sf.j.f(context, "context");
        sf.j.f(aVar, "callback");
        this.f11553a = context;
        this.f11554b = str;
        this.f11555c = aVar;
        this.f11556d = z10;
        this.f11557e = z11;
    }

    public final m3.b N() {
        return ((b) this.B.getValue()).c(true);
    }

    public final void close() {
        if (this.B.f8714b != cb.c.f3885a) {
            ((b) this.B.getValue()).close();
        }
    }

    public final void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.B.f8714b != cb.c.f3885a) {
            b bVar = (b) this.B.getValue();
            sf.j.f(bVar, "sQLiteOpenHelper");
            bVar.setWriteAheadLoggingEnabled(z10);
        }
        this.C = z10;
    }
}
