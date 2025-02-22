package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import cb.d;
import gf.q;
import java.util.List;
import sf.e;

public final class zzad extends SQLiteOpenHelper {
    public static final zzab zza;
    private static final int zzb;
    /* access modifiers changed from: private */
    public static zzad zzc;

    static {
        zzab zzab = new zzab((e) null);
        zza = zzab;
        zzb = zzab.zzb("18.2.1");
    }

    public /* synthetic */ zzad(Context context, e eVar) {
        super(context, "cesdb", (SQLiteDatabase.CursorFactory) null, zzb);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(q.A0(list, ", ", "(", ")", zzac.zza, 24)), (String[]) null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", (String[]) null);
        try {
            if (rawQuery.moveToNext()) {
                return rawQuery.getInt(0);
            }
            rawQuery.close();
            return -1;
        } catch (Exception unused) {
            return -1;
        } finally {
            rawQuery.close();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        return gf.s.f8978a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0047, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzd() {
        /*
            r8 = this;
            android.database.sqlite.SQLiteDatabase r0 = r8.getReadableDatabase()
            java.lang.String r1 = "ce"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "ts ASC"
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0016:
            boolean r2 = r0.moveToNext()     // Catch:{ Exception -> 0x0049 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = "id"
            int r2 = r0.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x0049 }
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r3 = "ss"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r4 = "ts"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ Exception -> 0x0049 }
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0049 }
            com.google.android.recaptcha.internal.zzae r6 = new com.google.android.recaptcha.internal.zzae     // Catch:{ Exception -> 0x0049 }
            r6.<init>(r3, r4, r2)     // Catch:{ Exception -> 0x0049 }
            r1.add(r6)     // Catch:{ Exception -> 0x0049 }
            goto L_0x0016
        L_0x0043:
            r0.close()
            return r1
        L_0x0047:
            r1 = move-exception
            goto L_0x004f
        L_0x0049:
            gf.s r1 = gf.s.f8978a     // Catch:{ all -> 0x0047 }
            r0.close()
            return r1
        L_0x004f:
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzad.zzd():java.util.List");
    }

    public final boolean zzf(zzae zzae) {
        return zza(d.O(zzae)) == 1;
    }
}
