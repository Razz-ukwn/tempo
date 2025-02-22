package q7;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

public final class l {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: android.database.Cursor} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f A[Catch:{ all -> 0x00d3, SQLiteException -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab A[Catch:{ all -> 0x00d3, SQLiteException -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7 A[Catch:{ all -> 0x00d3, SQLiteException -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(q7.s2 r16, android.database.sqlite.SQLiteDatabase r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String[] r21) {
        /*
            r1 = r16
            r10 = r17
            r11 = r18
            r12 = r21
            q7.q2 r13 = r1.E
            java.lang.String r14 = "SELECT * FROM "
            r15 = 0
            r9 = 0
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r0 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x003d, all -> 0x0038 }
            java.lang.String r5 = "name=?"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x003d, all -> 0x0038 }
            r6[r15] = r11     // Catch:{ SQLiteException -> 0x003d, all -> 0x0038 }
            r7 = 0
            r8 = 0
            r0 = 0
            r2 = r17
            r15 = r9
            r9 = r0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0036, all -> 0x0034 }
            boolean r0 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x0032 }
            r9.close()
            if (r0 != 0) goto L_0x004f
            goto L_0x004a
        L_0x0032:
            r0 = move-exception
            goto L_0x0040
        L_0x0034:
            r0 = move-exception
            goto L_0x003a
        L_0x0036:
            r0 = move-exception
            goto L_0x003f
        L_0x0038:
            r0 = move-exception
            r15 = r9
        L_0x003a:
            r9 = r15
            goto L_0x00e2
        L_0x003d:
            r0 = move-exception
            r15 = r9
        L_0x003f:
            r9 = r15
        L_0x0040:
            java.lang.String r2 = "Error querying for table"
            r13.d(r11, r0, r2)     // Catch:{ all -> 0x00e1 }
            if (r9 == 0) goto L_0x004a
            r9.close()
        L_0x004a:
            r2 = r19
            r10.execSQL(r2)
        L_0x004f:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00d8 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00d8 }
            r2.<init>(r14)     // Catch:{ SQLiteException -> 0x00d8 }
            r2.append(r11)     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r3 = " LIMIT 0"
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x00d8 }
            android.database.Cursor r2 = r10.rawQuery(r2, r15)     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String[] r3 = r2.getColumnNames()     // Catch:{ all -> 0x00d3 }
            java.util.Collections.addAll(r0, r3)     // Catch:{ all -> 0x00d3 }
            r2.close()     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r2 = ","
            r3 = r20
            java.lang.String[] r2 = r3.split(r2)     // Catch:{ SQLiteException -> 0x00d8 }
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x00d8 }
            r4 = 0
        L_0x007d:
            if (r4 >= r3) goto L_0x00a9
            r5 = r2[r4]     // Catch:{ SQLiteException -> 0x00d8 }
            boolean r6 = r0.remove(r5)     // Catch:{ SQLiteException -> 0x00d8 }
            if (r6 == 0) goto L_0x008a
            int r4 = r4 + 1
            goto L_0x007d
        L_0x008a:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00d8 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r3 = "Table "
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00d8 }
            r2.append(r11)     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r3 = " is missing required column: "
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00d8 }
            r2.append(r5)     // Catch:{ SQLiteException -> 0x00d8 }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x00d8 }
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x00d8 }
            throw r0     // Catch:{ SQLiteException -> 0x00d8 }
        L_0x00a9:
            if (r12 == 0) goto L_0x00c1
            r15 = 0
        L_0x00ac:
            int r2 = r12.length     // Catch:{ SQLiteException -> 0x00d8 }
            if (r15 >= r2) goto L_0x00c1
            r2 = r12[r15]     // Catch:{ SQLiteException -> 0x00d8 }
            boolean r2 = r0.remove(r2)     // Catch:{ SQLiteException -> 0x00d8 }
            if (r2 != 0) goto L_0x00be
            int r2 = r15 + 1
            r2 = r12[r2]     // Catch:{ SQLiteException -> 0x00d8 }
            r10.execSQL(r2)     // Catch:{ SQLiteException -> 0x00d8 }
        L_0x00be:
            int r15 = r15 + 2
            goto L_0x00ac
        L_0x00c1:
            boolean r2 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00d8 }
            if (r2 != 0) goto L_0x00d2
            java.lang.String r2 = "Table has extra columns. table, columns"
            java.lang.String r3 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r3, r0)     // Catch:{ SQLiteException -> 0x00d8 }
            r13.d(r11, r0, r2)     // Catch:{ SQLiteException -> 0x00d8 }
        L_0x00d2:
            return
        L_0x00d3:
            r0 = move-exception
            r2.close()     // Catch:{ SQLiteException -> 0x00d8 }
            throw r0     // Catch:{ SQLiteException -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            q7.q2 r1 = r1.B
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            r1.c(r11, r2)
            throw r0
        L_0x00e1:
            r0 = move-exception
        L_0x00e2:
            if (r9 == 0) goto L_0x00e7
            r9.close()
        L_0x00e7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.l.a(q7.s2, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void b(s2 s2Var, SQLiteDatabase sQLiteDatabase) {
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        q2 q2Var = s2Var.E;
        if (!readable) {
            q2Var.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            q2Var.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            q2Var.b("Failed to turn on database read permission for owner");
        }
        if (!file.setWritable(true, true)) {
            q2Var.b("Failed to turn on database write permission for owner");
        }
    }
}
