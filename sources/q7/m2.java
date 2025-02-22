package q7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

public final class m2 extends x2 {

    /* renamed from: c  reason: collision with root package name */
    public final l2 f13200c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13201d;

    public m2(x3 x3Var) {
        super(x3Var);
        x3 x3Var2 = (x3) this.f13121a;
        Context context = x3Var2.f13419a;
        x3Var2.getClass();
        this.f13200c = new l2(this, context);
    }

    public final boolean l() {
        return false;
    }

    public final SQLiteDatabase m() {
        if (this.f13201d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f13200c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f13201d = true;
        return null;
    }

    public final void n() {
        int delete;
        k4 k4Var = this.f13121a;
        i();
        try {
            SQLiteDatabase m = m();
            if (m != null && (delete = m.delete("messages", (String) null, (String[]) null)) > 0) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.J.c(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e10) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.c(e10, "Error resetting local analytics data. error");
        }
    }

    public final boolean o() {
        i();
        if (this.f13201d) {
            return false;
        }
        k4 k4Var = this.f13121a;
        x3 x3Var = (x3) k4Var;
        Context context = x3Var.f13419a;
        x3Var.getClass();
        if (context.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i8 = 0;
            int i10 = 5;
            while (i8 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase m = m();
                    if (m == null) {
                        this.f13201d = true;
                        return false;
                    }
                    m.beginTransaction();
                    m.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m.setTransactionSuccessful();
                    m.endTransaction();
                    m.close();
                    return true;
                } catch (SQLiteFullException e10) {
                    s2 s2Var = ((x3) k4Var).E;
                    x3.l(s2Var);
                    s2Var.B.c(e10, "Error deleting app launch break from local database");
                    this.f13201d = true;
                    if (sQLiteDatabase == null) {
                        i8++;
                    }
                    sQLiteDatabase.close();
                    i8++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i10);
                    i10 += 20;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i8++;
                    } else {
                        i8++;
                    }
                } catch (SQLiteException e11) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    s2 s2Var2 = ((x3) k4Var).E;
                    x3.l(s2Var2);
                    s2Var2.B.c(e11, "Error deleting app launch break from local database");
                    this.f13201d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i8++;
                    } else {
                        i8++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            s2 s2Var3 = ((x3) k4Var).E;
            x3.l(s2Var3);
            s2Var3.E.b("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x013a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x013a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00de A[SYNTHETIC, Splitter:B:55:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00a4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(byte[] r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            r17.i()
            boolean r0 = r1.f13201d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            q7.k4 r4 = r1.f13121a
            r5 = r4
            q7.x3 r5 = (q7.x3) r5
            r5.getClass()
            r6 = 5
            r7 = r2
            r8 = r6
        L_0x002b:
            if (r7 >= r6) goto L_0x0150
            r9 = 0
            r10 = 1
            android.database.sqlite.SQLiteDatabase r11 = r17.m()     // Catch:{ SQLiteFullException -> 0x0119, SQLiteDatabaseLockedException -> 0x0103, SQLiteException -> 0x00d9, all -> 0x00d3 }
            if (r11 != 0) goto L_0x0038
            r1.f13201d = r10     // Catch:{ SQLiteFullException -> 0x00cf, SQLiteDatabaseLockedException -> 0x00cc, SQLiteException -> 0x00c8, all -> 0x00c3 }
            return r2
        L_0x0038:
            r11.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00cf, SQLiteDatabaseLockedException -> 0x00cc, SQLiteException -> 0x00c8, all -> 0x00c3 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r11.rawQuery(r0, r9)     // Catch:{ SQLiteFullException -> 0x00cf, SQLiteDatabaseLockedException -> 0x00cc, SQLiteException -> 0x00c8, all -> 0x00c3 }
            if (r12 == 0) goto L_0x0055
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            if (r0 == 0) goto L_0x0055
            long r13 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            goto L_0x0057
        L_0x004e:
            r0 = move-exception
            goto L_0x00b8
        L_0x0050:
            r0 = move-exception
            goto L_0x00bb
        L_0x0052:
            r0 = move-exception
            goto L_0x00c0
        L_0x0055:
            r13 = 0
        L_0x0057:
            r15 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            java.lang.String r6 = "messages"
            if (r0 < 0) goto L_0x00a4
            r0 = r4
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            q7.x3.l(r0)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            java.lang.String r9 = "Data loss, local db full"
            r0.b(r9)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            long r15 = r15 - r13
            java.lang.String r0 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r9 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            r13 = 1
            long r15 = r15 + r13
            java.lang.String r13 = java.lang.Long.toString(r15)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            r9[r2] = r13     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            int r0 = r11.delete(r6, r0, r9)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            long r13 = (long) r0     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00a2
            r0 = r4
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            q7.x3.l(r0)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            java.lang.String r9 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            long r15 = r15 - r13
            java.lang.Long r13 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            r0.e(r9, r2, r10, r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
        L_0x00a2:
            r2 = 0
            goto L_0x00a5
        L_0x00a4:
            r2 = r9
        L_0x00a5:
            r11.insertOrThrow(r6, r2, r3)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            r11.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            r11.endTransaction()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00be, SQLiteException -> 0x0050, all -> 0x004e }
            if (r12 == 0) goto L_0x00b3
            r12.close()
        L_0x00b3:
            r11.close()
            r2 = 1
            return r2
        L_0x00b8:
            r9 = r12
            goto L_0x0145
        L_0x00bb:
            r9 = r11
            r2 = r12
            goto L_0x00dc
        L_0x00be:
            r9 = r12
            goto L_0x0106
        L_0x00c0:
            r9 = r12
            goto L_0x011d
        L_0x00c3:
            r0 = move-exception
            r2 = r9
        L_0x00c5:
            r9 = r2
            goto L_0x0145
        L_0x00c8:
            r0 = move-exception
            r2 = r9
            r9 = r11
            goto L_0x00dc
        L_0x00cc:
            r2 = r9
            r9 = r2
            goto L_0x0106
        L_0x00cf:
            r0 = move-exception
            r2 = r9
            r9 = r2
            goto L_0x011d
        L_0x00d3:
            r0 = move-exception
            r2 = r9
            r9 = r2
            r11 = r9
            goto L_0x0145
        L_0x00d9:
            r0 = move-exception
            r2 = r9
            r9 = r2
        L_0x00dc:
            if (r9 == 0) goto L_0x00e7
            boolean r6 = r9.inTransaction()     // Catch:{ all -> 0x0101 }
            if (r6 == 0) goto L_0x00e7
            r9.endTransaction()     // Catch:{ all -> 0x0101 }
        L_0x00e7:
            r6 = r4
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x0101 }
            q7.s2 r6 = r6.E     // Catch:{ all -> 0x0101 }
            q7.x3.l(r6)     // Catch:{ all -> 0x0101 }
            q7.q2 r6 = r6.B     // Catch:{ all -> 0x0101 }
            java.lang.String r10 = "Error writing entry to local database"
            r6.c(r0, r10)     // Catch:{ all -> 0x0101 }
            r6 = 1
            r1.f13201d = r6     // Catch:{ all -> 0x0101 }
            if (r2 == 0) goto L_0x00fe
            r2.close()
        L_0x00fe:
            if (r9 == 0) goto L_0x013a
            goto L_0x0137
        L_0x0101:
            r0 = move-exception
            goto L_0x0143
        L_0x0103:
            r2 = r9
            r9 = r2
            r11 = r9
        L_0x0106:
            long r12 = (long) r8
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x0117 }
            int r8 = r8 + 20
            if (r9 == 0) goto L_0x0111
            r9.close()
        L_0x0111:
            if (r11 == 0) goto L_0x013a
            r11.close()
            goto L_0x013a
        L_0x0117:
            r0 = move-exception
            goto L_0x0145
        L_0x0119:
            r0 = move-exception
            r2 = r9
            r9 = r2
            r11 = r9
        L_0x011d:
            r2 = r4
            q7.x3 r2 = (q7.x3) r2     // Catch:{ all -> 0x0140 }
            q7.s2 r2 = r2.E     // Catch:{ all -> 0x0140 }
            q7.x3.l(r2)     // Catch:{ all -> 0x0140 }
            q7.q2 r2 = r2.B     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "Error writing entry; local database full"
            r2.c(r0, r6)     // Catch:{ all -> 0x0140 }
            r2 = 1
            r1.f13201d = r2     // Catch:{ all -> 0x0140 }
            if (r9 == 0) goto L_0x0134
            r9.close()
        L_0x0134:
            if (r11 == 0) goto L_0x013a
            r9 = r11
        L_0x0137:
            r9.close()
        L_0x013a:
            int r7 = r7 + 1
            r2 = 0
            r6 = 5
            goto L_0x002b
        L_0x0140:
            r0 = move-exception
            r2 = r9
            r9 = r11
        L_0x0143:
            r11 = r9
            goto L_0x00c5
        L_0x0145:
            if (r9 == 0) goto L_0x014a
            r9.close()
        L_0x014a:
            if (r11 == 0) goto L_0x014f
            r11.close()
        L_0x014f:
            throw r0
        L_0x0150:
            q7.s2 r0 = r5.E
            q7.x3.l(r0)
            java.lang.String r2 = "Failed to write entry to local database"
            q7.q2 r0 = r0.J
            r0.b(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.m2.p(byte[], int):boolean");
    }
}
