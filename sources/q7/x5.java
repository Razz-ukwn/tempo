package q7;

import ag.m;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import u6.q;
import y6.a;

public final class x5 extends x2 {
    public final p5 B;
    public final j6 C;
    public final ArrayList D = new ArrayList();
    public final r5 E;

    /* renamed from: c  reason: collision with root package name */
    public final w5 f13432c;

    /* renamed from: d  reason: collision with root package name */
    public j2 f13433d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Boolean f13434e;

    public x5(x3 x3Var) {
        super(x3Var);
        this.C = new j6(x3Var.J);
        this.f13432c = new w5(this);
        this.B = new p5(this, x3Var);
        this.E = new r5(this, x3Var);
    }

    public static void v(x5 x5Var, ComponentName componentName) {
        x5Var.i();
        if (x5Var.f13433d != null) {
            x5Var.f13433d = null;
            s2 s2Var = ((x3) x5Var.f13121a).E;
            x3.l(s2Var);
            s2Var.J.c(componentName, "Disconnected from device MeasurementService");
            x5Var.i();
            x5Var.w();
        }
    }

    public final boolean l() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v55, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0273, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0275, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x027e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0299, code lost:
        if (r7.inTransaction() != false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x029b, code lost:
        r7.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02b0, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b6, code lost:
        r13 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02cb, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02ee, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02f3, code lost:
        r16 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0308, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0309, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x030c, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0311, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        r18 = r8;
        r17 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        r18 = r8;
        r17 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cf, code lost:
        r18 = r8;
        r17 = r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x026b A[SYNTHETIC, Splitter:B:144:0x026b] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0273 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0295 A[SYNTHETIC, Splitter:B:162:0x0295] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x026e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x02fb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(q7.j2 r30, v6.a r31, q7.c7 r32) {
        /*
            r29 = this;
            r1 = r30
            r2 = r31
            r3 = r32
            r29.i()
            r29.j()
            r4 = r29
            q7.k4 r0 = r4.f13121a
            r5 = r0
            q7.x3 r5 = (q7.x3) r5
            r5.getClass()
            r5 = r0
            q7.x3 r5 = (q7.x3) r5
            r5.getClass()
            r6 = 100
            r0 = r6
            r8 = 0
        L_0x0020:
            r9 = 1001(0x3e9, float:1.403E-42)
            if (r8 >= r9) goto L_0x03c0
            if (r0 != r6) goto L_0x03c0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            q7.m2 r10 = r5.r()
            java.lang.String r11 = "rowid"
            java.lang.String r12 = "Error reading entries from local database"
            r10.i()
            boolean r0 = r10.f13201d
            if (r0 == 0) goto L_0x003b
            goto L_0x0065
        L_0x003b:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            q7.k4 r15 = r10.f13121a
            r0 = r15
            q7.x3 r0 = (q7.x3) r0
            android.content.Context r13 = r0.f13419a
            r0.getClass()
            java.lang.String r0 = "google_app_measurement_local.db"
            java.io.File r0 = r13.getDatabasePath(r0)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0329
            r13 = 5
            r16 = r13
            r6 = 0
        L_0x005a:
            if (r6 >= r13) goto L_0x0315
            r13 = 1
            android.database.sqlite.SQLiteDatabase r7 = r10.m()     // Catch:{ SQLiteFullException -> 0x02d1, SQLiteDatabaseLockedException -> 0x02b9, SQLiteException -> 0x028a, all -> 0x0285 }
            if (r7 != 0) goto L_0x006c
            r10.f13201d = r13     // Catch:{ SQLiteFullException -> 0x027e, SQLiteDatabaseLockedException -> 0x00c7, SQLiteException -> 0x0275, all -> 0x0273 }
        L_0x0065:
            r18 = r8
            r13 = 0
            r19 = 0
            goto L_0x032e
        L_0x006c:
            r7.beginTransaction()     // Catch:{ SQLiteFullException -> 0x027e, SQLiteDatabaseLockedException -> 0x00c7, SQLiteException -> 0x0275, all -> 0x0273 }
            java.lang.String r0 = "3"
            java.lang.String r18 = "messages"
            java.lang.String[] r19 = new java.lang.String[]{r11}     // Catch:{ all -> 0x0261 }
            java.lang.String r20 = "type=?"
            java.lang.String[] r21 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0261 }
            r22 = 0
            r23 = 0
            java.lang.String r24 = "rowid desc"
            java.lang.String r25 = "1"
            r17 = r7
            android.database.Cursor r13 = r17.query(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0261 }
            boolean r0 = r13.moveToFirst()     // Catch:{ all -> 0x025e }
            r26 = -1
            if (r0 == 0) goto L_0x00a4
            r4 = 0
            long r17 = r13.getLong(r4)     // Catch:{ all -> 0x025e }
            r13.close()     // Catch:{ SQLiteFullException -> 0x027e, SQLiteDatabaseLockedException -> 0x00c7, SQLiteException -> 0x0275, all -> 0x0273 }
            goto L_0x00a9
        L_0x009c:
            r18 = r8
            r17 = r11
            r19 = 0
            goto L_0x0269
        L_0x00a4:
            r13.close()     // Catch:{ SQLiteFullException -> 0x027e, SQLiteDatabaseLockedException -> 0x00c7, SQLiteException -> 0x0275, all -> 0x0273 }
            r17 = r26
        L_0x00a9:
            int r0 = (r17 > r26 ? 1 : (r17 == r26 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = "rowid<?"
            r4 = 1
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteFullException -> 0x027e, SQLiteDatabaseLockedException -> 0x00c7, SQLiteException -> 0x0275, all -> 0x0273 }
            java.lang.String r4 = java.lang.String.valueOf(r17)     // Catch:{ SQLiteFullException -> 0x027e, SQLiteDatabaseLockedException -> 0x00c7, SQLiteException -> 0x0275, all -> 0x0273 }
            r17 = 0
            r13[r17] = r4     // Catch:{ SQLiteFullException -> 0x027e, SQLiteDatabaseLockedException -> 0x00c7, SQLiteException -> 0x0275, all -> 0x0273 }
            r20 = r0
            r21 = r13
            goto L_0x00db
        L_0x00bf:
            r18 = r8
            r17 = r11
            r19 = 0
            goto L_0x0278
        L_0x00c7:
            r18 = r8
            r17 = r11
            r19 = 0
            goto L_0x027a
        L_0x00cf:
            r18 = r8
            r17 = r11
            r19 = 0
            goto L_0x0281
        L_0x00d7:
            r20 = 0
            r21 = 0
        L_0x00db:
            java.lang.String r18 = "messages"
            java.lang.String r0 = "type"
            java.lang.String r4 = "entry"
            java.lang.String[] r19 = new java.lang.String[]{r11, r0, r4}     // Catch:{ SQLiteFullException -> 0x027e, SQLiteDatabaseLockedException -> 0x00c7, SQLiteException -> 0x0275, all -> 0x0273 }
            r22 = 0
            r23 = 0
            java.lang.String r24 = "rowid asc"
            r4 = 100
            java.lang.String r25 = java.lang.Integer.toString(r4)     // Catch:{ SQLiteFullException -> 0x027e, SQLiteDatabaseLockedException -> 0x00c7, SQLiteException -> 0x0275, all -> 0x0273 }
            r17 = r7
            android.database.Cursor r4 = r17.query(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ SQLiteFullException -> 0x027e, SQLiteDatabaseLockedException -> 0x00c7, SQLiteException -> 0x0275, all -> 0x0273 }
        L_0x00f7:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteFullException -> 0x0254, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0245 }
            if (r0 == 0) goto L_0x0202
            r13 = 0
            long r26 = r4.getLong(r13)     // Catch:{ SQLiteFullException -> 0x0254, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0245 }
            r13 = 1
            int r0 = r4.getInt(r13)     // Catch:{ SQLiteFullException -> 0x0254, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0245 }
            r13 = 2
            r17 = r11
            byte[] r11 = r4.getBlob(r13)     // Catch:{ SQLiteFullException -> 0x01f4, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01ed }
            if (r0 != 0) goto L_0x0150
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01f4, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01ed }
            int r0 = r11.length     // Catch:{ a -> 0x0136, all -> 0x0132 }
            r18 = r8
            r8 = 0
            r13.unmarshall(r11, r8, r0)     // Catch:{ a -> 0x0138 }
            r13.setDataPosition(r8)     // Catch:{ a -> 0x0138 }
            android.os.Parcelable$Creator<q7.s> r0 = q7.s.CREATOR     // Catch:{ a -> 0x0138 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ a -> 0x0138 }
            q7.s r0 = (q7.s) r0     // Catch:{ a -> 0x0138 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            if (r0 == 0) goto L_0x01e7
            r14.add(r0)     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            goto L_0x01e7
        L_0x0130:
            r0 = move-exception
            goto L_0x014c
        L_0x0132:
            r0 = move-exception
            r18 = r8
            goto L_0x014c
        L_0x0136:
            r18 = r8
        L_0x0138:
            r0 = r15
            q7.x3 r0 = (q7.x3) r0     // Catch:{ all -> 0x0130 }
            q7.s2 r0 = r0.E     // Catch:{ all -> 0x0130 }
            q7.x3.l(r0)     // Catch:{ all -> 0x0130 }
            q7.q2 r0 = r0.B     // Catch:{ all -> 0x0130 }
            java.lang.String r8 = "Failed to load event from local database"
            r0.b(r8)     // Catch:{ all -> 0x0130 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            goto L_0x01e7
        L_0x014c:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
        L_0x0150:
            r18 = r8
            r8 = 1
            if (r0 != r8) goto L_0x018c
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            int r0 = r11.length     // Catch:{ a -> 0x016f }
            r13 = 0
            r8.unmarshall(r11, r13, r0)     // Catch:{ a -> 0x016f }
            r8.setDataPosition(r13)     // Catch:{ a -> 0x016f }
            android.os.Parcelable$Creator<q7.w6> r0 = q7.w6.CREATOR     // Catch:{ a -> 0x016f }
            java.lang.Object r0 = r0.createFromParcel(r8)     // Catch:{ a -> 0x016f }
            q7.w6 r0 = (q7.w6) r0     // Catch:{ a -> 0x016f }
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            goto L_0x0182
        L_0x016d:
            r0 = move-exception
            goto L_0x0188
        L_0x016f:
            r0 = r15
            q7.x3 r0 = (q7.x3) r0     // Catch:{ all -> 0x016d }
            q7.s2 r0 = r0.E     // Catch:{ all -> 0x016d }
            q7.x3.l(r0)     // Catch:{ all -> 0x016d }
            q7.q2 r0 = r0.B     // Catch:{ all -> 0x016d }
            java.lang.String r11 = "Failed to load user property from local database"
            r0.b(r11)     // Catch:{ all -> 0x016d }
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            r0 = 0
        L_0x0182:
            if (r0 == 0) goto L_0x01e7
            r14.add(r0)     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            goto L_0x01e7
        L_0x0188:
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
        L_0x018c:
            if (r0 != r13) goto L_0x01c5
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            int r0 = r11.length     // Catch:{ a -> 0x01a8 }
            r13 = 0
            r8.unmarshall(r11, r13, r0)     // Catch:{ a -> 0x01a8 }
            r8.setDataPosition(r13)     // Catch:{ a -> 0x01a8 }
            android.os.Parcelable$Creator<q7.c> r0 = q7.c.CREATOR     // Catch:{ a -> 0x01a8 }
            java.lang.Object r0 = r0.createFromParcel(r8)     // Catch:{ a -> 0x01a8 }
            q7.c r0 = (q7.c) r0     // Catch:{ a -> 0x01a8 }
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            goto L_0x01bb
        L_0x01a6:
            r0 = move-exception
            goto L_0x01c1
        L_0x01a8:
            r0 = r15
            q7.x3 r0 = (q7.x3) r0     // Catch:{ all -> 0x01a6 }
            q7.s2 r0 = r0.E     // Catch:{ all -> 0x01a6 }
            q7.x3.l(r0)     // Catch:{ all -> 0x01a6 }
            q7.q2 r0 = r0.B     // Catch:{ all -> 0x01a6 }
            java.lang.String r11 = "Failed to load conditional user property from local database"
            r0.b(r11)     // Catch:{ all -> 0x01a6 }
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            r0 = 0
        L_0x01bb:
            if (r0 == 0) goto L_0x01e7
            r14.add(r0)     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            goto L_0x01e7
        L_0x01c1:
            r8.recycle()     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
        L_0x01c5:
            r8 = 3
            if (r0 != r8) goto L_0x01d8
            r0 = r15
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            q7.x3.l(r0)     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            q7.q2 r0 = r0.E     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            java.lang.String r8 = "Skipping app launch break"
            r0.b(r8)     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            goto L_0x01e7
        L_0x01d8:
            r0 = r15
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            q7.x3.l(r0)     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            java.lang.String r8 = "Unknown record type in local database"
            r0.b(r8)     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
        L_0x01e7:
            r11 = r17
            r8 = r18
            goto L_0x00f7
        L_0x01ed:
            r0 = move-exception
            r18 = r8
            goto L_0x01f8
        L_0x01f1:
            r18 = r8
            goto L_0x01fc
        L_0x01f4:
            r0 = move-exception
            r18 = r8
            goto L_0x01ff
        L_0x01f8:
            r19 = 0
            goto L_0x0293
        L_0x01fc:
            r19 = 0
            goto L_0x0250
        L_0x01ff:
            r19 = 0
            goto L_0x025a
        L_0x0202:
            r18 = r8
            r17 = r11
            java.lang.String r0 = "messages"
            java.lang.String r8 = "rowid <= ?"
            r11 = 1
            java.lang.String[] r13 = new java.lang.String[r11]     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            java.lang.String r11 = java.lang.Long.toString(r26)     // Catch:{ SQLiteFullException -> 0x0243, SQLiteDatabaseLockedException -> 0x01fc, SQLiteException -> 0x0241 }
            r19 = 0
            r13[r19] = r11     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023c }
            int r0 = r7.delete(r0, r8, r13)     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023c }
            int r8 = r14.size()     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023c }
            if (r0 >= r8) goto L_0x022e
            r0 = r15
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023c }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023c }
            q7.x3.l(r0)     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023c }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023c }
            java.lang.String r8 = "Fewer entries removed from local database than expected"
            r0.b(r8)     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023c }
        L_0x022e:
            r7.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023c }
            r7.endTransaction()     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023c }
            r4.close()
            r7.close()
            goto L_0x032d
        L_0x023c:
            r0 = move-exception
            goto L_0x0293
        L_0x023f:
            r0 = move-exception
            goto L_0x025a
        L_0x0241:
            r0 = move-exception
            goto L_0x01f8
        L_0x0243:
            r0 = move-exception
            goto L_0x01ff
        L_0x0245:
            r0 = move-exception
            r18 = r8
            r17 = r11
            goto L_0x01f8
        L_0x024b:
            r18 = r8
            r17 = r11
            goto L_0x01fc
        L_0x0250:
            r13 = r16
            goto L_0x02c3
        L_0x0254:
            r0 = move-exception
            r18 = r8
            r17 = r11
            goto L_0x01ff
        L_0x025a:
            r13 = r16
            goto L_0x02dc
        L_0x025e:
            r0 = move-exception
            goto L_0x009c
        L_0x0261:
            r0 = move-exception
            r18 = r8
            r17 = r11
            r19 = 0
            r13 = 0
        L_0x0269:
            if (r13 == 0) goto L_0x026e
            r13.close()     // Catch:{ SQLiteFullException -> 0x0271, SQLiteDatabaseLockedException -> 0x027a, SQLiteException -> 0x026f, all -> 0x0273 }
        L_0x026e:
            throw r0     // Catch:{ SQLiteFullException -> 0x0271, SQLiteDatabaseLockedException -> 0x027a, SQLiteException -> 0x026f, all -> 0x0273 }
        L_0x026f:
            r0 = move-exception
            goto L_0x0278
        L_0x0271:
            r0 = move-exception
            goto L_0x0281
        L_0x0273:
            r0 = move-exception
            goto L_0x0287
        L_0x0275:
            r0 = move-exception
            goto L_0x00bf
        L_0x0278:
            r4 = 0
            goto L_0x0293
        L_0x027a:
            r13 = r16
            r4 = 0
            goto L_0x02c3
        L_0x027e:
            r0 = move-exception
            goto L_0x00cf
        L_0x0281:
            r13 = r16
            r4 = 0
            goto L_0x02dc
        L_0x0285:
            r0 = move-exception
            r7 = 0
        L_0x0287:
            r13 = 0
            goto L_0x030a
        L_0x028a:
            r0 = move-exception
            r18 = r8
            r17 = r11
            r19 = 0
            r4 = 0
            r7 = 0
        L_0x0293:
            if (r7 == 0) goto L_0x029e
            boolean r8 = r7.inTransaction()     // Catch:{ all -> 0x0308 }
            if (r8 == 0) goto L_0x029e
            r7.endTransaction()     // Catch:{ all -> 0x0308 }
        L_0x029e:
            r8 = r15
            q7.x3 r8 = (q7.x3) r8     // Catch:{ all -> 0x0308 }
            q7.s2 r8 = r8.E     // Catch:{ all -> 0x0308 }
            q7.x3.l(r8)     // Catch:{ all -> 0x0308 }
            q7.q2 r8 = r8.B     // Catch:{ all -> 0x0308 }
            r8.c(r0, r12)     // Catch:{ all -> 0x0308 }
            r8 = 1
            r10.f13201d = r8     // Catch:{ all -> 0x0308 }
            if (r4 == 0) goto L_0x02b3
            r4.close()
        L_0x02b3:
            if (r7 == 0) goto L_0x02b6
            goto L_0x02f5
        L_0x02b6:
            r13 = r16
            goto L_0x02f9
        L_0x02b9:
            r18 = r8
            r17 = r11
            r19 = 0
            r13 = r16
            r4 = 0
            r7 = 0
        L_0x02c3:
            long r0 = (long) r13
            android.os.SystemClock.sleep(r0)     // Catch:{ all -> 0x0308 }
            int r16 = r13 + 20
            if (r4 == 0) goto L_0x02ce
            r4.close()
        L_0x02ce:
            if (r7 == 0) goto L_0x02fb
            goto L_0x02f5
        L_0x02d1:
            r0 = move-exception
            r18 = r8
            r17 = r11
            r13 = r16
            r19 = 0
            r4 = 0
            r7 = 0
        L_0x02dc:
            r1 = r15
            q7.x3 r1 = (q7.x3) r1     // Catch:{ all -> 0x0308 }
            q7.s2 r1 = r1.E     // Catch:{ all -> 0x0308 }
            q7.x3.l(r1)     // Catch:{ all -> 0x0308 }
            q7.q2 r1 = r1.B     // Catch:{ all -> 0x0308 }
            r1.c(r0, r12)     // Catch:{ all -> 0x0308 }
            r1 = 1
            r10.f13201d = r1     // Catch:{ all -> 0x0308 }
            if (r4 == 0) goto L_0x02f1
            r4.close()
        L_0x02f1:
            if (r7 == 0) goto L_0x02f9
            r16 = r13
        L_0x02f5:
            r7.close()
            goto L_0x02fb
        L_0x02f9:
            r16 = r13
        L_0x02fb:
            int r6 = r6 + 1
            r4 = r29
            r1 = r30
            r11 = r17
            r8 = r18
            r13 = 5
            goto L_0x005a
        L_0x0308:
            r0 = move-exception
            r13 = r4
        L_0x030a:
            if (r13 == 0) goto L_0x030f
            r13.close()
        L_0x030f:
            if (r7 == 0) goto L_0x0314
            r7.close()
        L_0x0314:
            throw r0
        L_0x0315:
            r18 = r8
            r19 = 0
            q7.x3 r15 = (q7.x3) r15
            q7.s2 r0 = r15.E
            q7.x3.l(r0)
            java.lang.String r1 = "Failed to read events from database in reasonable time"
            q7.q2 r0 = r0.E
            r0.b(r1)
            r13 = 0
            goto L_0x032e
        L_0x0329:
            r18 = r8
            r19 = 0
        L_0x032d:
            r13 = r14
        L_0x032e:
            if (r13 == 0) goto L_0x0339
            r9.addAll(r13)
            int r0 = r13.size()
            r1 = r0
            goto L_0x033b
        L_0x0339:
            r1 = r19
        L_0x033b:
            r4 = 100
            if (r2 == 0) goto L_0x0344
            if (r1 >= r4) goto L_0x0344
            r9.add(r2)
        L_0x0344:
            int r6 = r9.size()
            r7 = r19
        L_0x034a:
            if (r7 >= r6) goto L_0x03b1
            java.lang.Object r0 = r9.get(r7)
            v6.a r0 = (v6.a) r0
            boolean r8 = r0 instanceof q7.s
            if (r8 == 0) goto L_0x0370
            q7.s r0 = (q7.s) r0     // Catch:{ RemoteException -> 0x0360 }
            r8 = r30
            r8.n(r0, r3)     // Catch:{ RemoteException -> 0x035e }
            goto L_0x03ae
        L_0x035e:
            r0 = move-exception
            goto L_0x0363
        L_0x0360:
            r0 = move-exception
            r8 = r30
        L_0x0363:
            q7.s2 r10 = r5.E
            q7.x3.l(r10)
            java.lang.String r11 = "Failed to send event to the service"
            q7.q2 r10 = r10.B
            r10.c(r0, r11)
            goto L_0x03ae
        L_0x0370:
            r8 = r30
            boolean r10 = r0 instanceof q7.w6
            if (r10 == 0) goto L_0x038a
            q7.w6 r0 = (q7.w6) r0     // Catch:{ RemoteException -> 0x037c }
            r8.e(r0, r3)     // Catch:{ RemoteException -> 0x037c }
            goto L_0x03ae
        L_0x037c:
            r0 = move-exception
            q7.s2 r10 = r5.E
            q7.x3.l(r10)
            java.lang.String r11 = "Failed to send user property to the service"
            q7.q2 r10 = r10.B
            r10.c(r0, r11)
            goto L_0x03ae
        L_0x038a:
            boolean r10 = r0 instanceof q7.c
            if (r10 == 0) goto L_0x03a2
            q7.c r0 = (q7.c) r0     // Catch:{ RemoteException -> 0x0394 }
            r8.r(r0, r3)     // Catch:{ RemoteException -> 0x0394 }
            goto L_0x03ae
        L_0x0394:
            r0 = move-exception
            q7.s2 r10 = r5.E
            q7.x3.l(r10)
            java.lang.String r11 = "Failed to send conditional user property to the service"
            q7.q2 r10 = r10.B
            r10.c(r0, r11)
            goto L_0x03ae
        L_0x03a2:
            q7.s2 r0 = r5.E
            q7.x3.l(r0)
            java.lang.String r10 = "Discarding data. Unrecognized parcel type."
            q7.q2 r0 = r0.B
            r0.b(r10)
        L_0x03ae:
            int r7 = r7 + 1
            goto L_0x034a
        L_0x03b1:
            r8 = r30
            int r0 = r18 + 1
            r6 = r4
            r4 = r29
            r28 = r8
            r8 = r0
            r0 = r1
            r1 = r28
            goto L_0x0020
        L_0x03c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.x5.m(q7.j2, v6.a, q7.c7):void");
    }

    public final void n(c cVar) {
        boolean z10;
        i();
        j();
        x3 x3Var = (x3) this.f13121a;
        x3Var.getClass();
        m2 r10 = x3Var.r();
        x3 x3Var2 = (x3) r10.f13121a;
        a7 a7Var = x3Var2.H;
        x3.j(a7Var);
        a7Var.getClass();
        byte[] a02 = a7.a0(cVar);
        if (a02.length > 131072) {
            s2 s2Var = x3Var2.E;
            x3.l(s2Var);
            s2Var.C.b("Conditional user property too long for local database. Sending directly to service");
            z10 = false;
        } else {
            z10 = r10.p(a02, 2);
        }
        c cVar2 = new c(cVar);
        u(new v4(this, r(true), z10, cVar2, cVar));
    }

    public final boolean o() {
        i();
        j();
        return this.f13433d != null;
    }

    public final boolean p() {
        i();
        j();
        if (!q()) {
            return true;
        }
        a7 a7Var = ((x3) this.f13121a).H;
        x3.j(a7Var);
        return a7Var.k0() >= ((Integer) g2.f13035g0.a((Object) null)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r8 = this;
            r8.i()
            r8.j()
            java.lang.Boolean r0 = r8.f13434e
            if (r0 != 0) goto L_0x016f
            r8.i()
            r8.j()
            q7.k4 r0 = r8.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.g3 r0 = r0.D
            q7.x3.j(r0)
            r0.i()
            android.content.SharedPreferences r1 = r0.m()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x002b
            r0 = 0
            goto L_0x0037
        L_0x002b:
            android.content.SharedPreferences r0 = r0.m()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0037:
            r1 = 1
            if (r0 == 0) goto L_0x0042
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x0042
            goto L_0x0169
        L_0x0042:
            q7.k4 r4 = r8.f13121a
            q7.x3 r4 = (q7.x3) r4
            r4.getClass()
            q7.k4 r4 = r8.f13121a
            q7.x3 r4 = (q7.x3) r4
            q7.k2 r4 = r4.q()
            r4.j()
            int r4 = r4.G
            if (r4 != r1) goto L_0x005a
            goto L_0x012c
        L_0x005a:
            q7.k4 r4 = r8.f13121a
            q7.x3 r4 = (q7.x3) r4
            q7.s2 r4 = r4.E
            q7.x3.l(r4)
            q7.q2 r4 = r4.J
            java.lang.String r5 = "Checking service availability"
            r4.b(r5)
            q7.k4 r4 = r8.f13121a
            q7.x3 r4 = (q7.x3) r4
            q7.a7 r4 = r4.H
            q7.x3.j(r4)
            r4.getClass()
            t6.f r5 = t6.f.f15396b
            q7.k4 r4 = r4.f13121a
            q7.x3 r4 = (q7.x3) r4
            android.content.Context r4 = r4.f13419a
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r5.c(r4, r6)
            if (r4 == 0) goto L_0x011c
            if (r4 == r1) goto L_0x010b
            r5 = 2
            if (r4 == r5) goto L_0x00e1
            r0 = 3
            if (r4 == r0) goto L_0x00cf
            r0 = 9
            if (r4 == r0) goto L_0x00be
            r0 = 18
            if (r4 == r0) goto L_0x00ac
            q7.k4 r0 = r8.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            q7.q2 r0 = r0.E
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.c(r1, r4)
            goto L_0x00df
        L_0x00ac:
            q7.k4 r0 = r8.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            q7.q2 r0 = r0.E
            java.lang.String r3 = "Service updating"
            r0.b(r3)
            goto L_0x012c
        L_0x00be:
            q7.k4 r0 = r8.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            q7.q2 r0 = r0.E
            java.lang.String r1 = "Service invalid"
            r0.b(r1)
            goto L_0x00df
        L_0x00cf:
            q7.k4 r0 = r8.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            q7.q2 r0 = r0.E
            java.lang.String r1 = "Service disabled"
            r0.b(r1)
        L_0x00df:
            r1 = r3
            goto L_0x012d
        L_0x00e1:
            q7.k4 r4 = r8.f13121a
            q7.x3 r4 = (q7.x3) r4
            q7.s2 r4 = r4.E
            q7.x3.l(r4)
            q7.q2 r4 = r4.I
            java.lang.String r5 = "Service container out of date"
            r4.b(r5)
            q7.k4 r4 = r8.f13121a
            q7.x3 r4 = (q7.x3) r4
            q7.a7 r4 = r4.H
            q7.x3.j(r4)
            int r4 = r4.k0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x0103
            goto L_0x012d
        L_0x0103:
            if (r0 != 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r1 = r3
        L_0x0107:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x012d
        L_0x010b:
            q7.k4 r0 = r8.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            q7.q2 r0 = r0.J
            java.lang.String r4 = "Service missing"
            r0.b(r4)
            goto L_0x012d
        L_0x011c:
            q7.k4 r0 = r8.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            q7.q2 r0 = r0.J
            java.lang.String r3 = "Service available"
            r0.b(r3)
        L_0x012c:
            r3 = r1
        L_0x012d:
            if (r3 != 0) goto L_0x014c
            q7.k4 r0 = r8.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.f r0 = r0.C
            boolean r0 = r0.v()
            if (r0 == 0) goto L_0x014c
            q7.k4 r0 = r8.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            q7.q2 r0 = r0.B
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.b(r1)
            goto L_0x0168
        L_0x014c:
            if (r1 == 0) goto L_0x0168
            q7.k4 r0 = r8.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.g3 r0 = r0.D
            q7.x3.j(r0)
            r0.i()
            android.content.SharedPreferences r0 = r0.m()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0168:
            r1 = r3
        L_0x0169:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.f13434e = r0
        L_0x016f:
            java.lang.Boolean r0 = r8.f13434e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.x5.q():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q7.c7 r(boolean r38) {
        /*
            r37 = this;
            r1 = r37
            q7.k4 r0 = r1.f13121a
            q7.x3 r0 = (q7.x3) r0
            r0.getClass()
            q7.k2 r2 = r0.q()
            r3 = 0
            r5 = 0
            if (r38 == 0) goto L_0x00b1
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            q7.k4 r0 = r0.f13121a
            r6 = r0
            q7.x3 r6 = (q7.x3) r6
            q7.g3 r6 = r6.D
            q7.x3.j(r6)
            q7.e3 r6 = r6.f13073d
            if (r6 != 0) goto L_0x0027
            goto L_0x00b1
        L_0x0027:
            q7.x3 r0 = (q7.x3) r0
            q7.g3 r0 = r0.D
            q7.x3.j(r0)
            q7.e3 r0 = r0.f13073d
            q7.g3 r6 = r0.f12976e
            r6.i()
            r6.i()
            q7.g3 r7 = r0.f12976e
            android.content.SharedPreferences r7 = r7.m()
            java.lang.String r8 = r0.f12972a
            long r7 = r7.getLong(r8, r3)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x004d
            r0.a()
            r7 = r3
            goto L_0x005f
        L_0x004d:
            q7.k4 r9 = r6.f13121a
            q7.x3 r9 = (q7.x3) r9
            ag.m r9 = r9.J
            r9.getClass()
            long r9 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)
        L_0x005f:
            long r9 = r0.f12975d
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0066
            goto L_0x006e
        L_0x0066:
            long r9 = r9 + r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0070
            r0.a()
        L_0x006e:
            r0 = r5
            goto L_0x009a
        L_0x0070:
            android.content.SharedPreferences r7 = r6.m()
            java.lang.String r8 = r0.f12974c
            java.lang.String r7 = r7.getString(r8, r5)
            android.content.SharedPreferences r6 = r6.m()
            java.lang.String r8 = r0.f12973b
            long r8 = r6.getLong(r8, r3)
            r0.a()
            if (r7 == 0) goto L_0x0098
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x008e
            goto L_0x0098
        L_0x008e:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r0.<init>(r7, r6)
            goto L_0x009a
        L_0x0098:
            android.util.Pair r0 = q7.g3.T
        L_0x009a:
            if (r0 == 0) goto L_0x00b1
            android.util.Pair r6 = q7.g3.T
            if (r0 != r6) goto L_0x00a1
            goto L_0x00b1
        L_0x00a1:
            java.lang.Object r5 = r0.second
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = ":"
            java.lang.String r5 = h0.e.b(r5, r6, r0)
        L_0x00b1:
            r17 = r5
            r2.i()
            q7.c7 r5 = new q7.c7
            java.lang.String r7 = r2.n()
            java.lang.String r8 = r2.o()
            r2.j()
            java.lang.String r9 = r2.f13150d
            r2.j()
            int r0 = r2.f13151e
            long r10 = (long) r0
            r2.j()
            java.lang.String r0 = r2.B
            u6.q.i(r0)
            java.lang.String r12 = r2.B
            q7.k4 r6 = r2.f13121a
            r13 = r6
            q7.x3 r13 = (q7.x3) r13
            q7.f r0 = r13.C
            r0.n()
            r2.j()
            r2.i()
            long r14 = r2.C
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            q7.a7 r3 = r13.H
            if (r0 != 0) goto L_0x0170
            q7.x3.j(r3)
            android.content.Context r0 = r13.f13419a
            java.lang.String r4 = r0.getPackageName()
            r3.i()
            u6.q.f(r4)
            android.content.pm.PackageManager r14 = r0.getPackageManager()
            java.security.MessageDigest r15 = q7.a7.q()
            q7.k4 r1 = r3.f13121a
            if (r15 != 0) goto L_0x0117
            q7.x3 r1 = (q7.x3) r1
            q7.s2 r0 = r1.E
            q7.x3.l(r0)
            java.lang.String r1 = "Could not get MD5 instance"
            q7.q2 r0 = r0.B
            r0.b(r1)
            goto L_0x0158
        L_0x0117:
            if (r14 == 0) goto L_0x016a
            boolean r4 = r3.U(r0, r4)     // Catch:{ NameNotFoundException -> 0x015b }
            if (r4 != 0) goto L_0x016a
            b7.b r0 = b7.c.a(r0)     // Catch:{ NameNotFoundException -> 0x015b }
            r4 = r1
            q7.x3 r4 = (q7.x3) r4     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.Context r4 = r4.f13419a     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x015b }
            r14 = 64
            android.content.pm.PackageInfo r0 = r0.b(r14, r4)     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x015b }
            if (r0 == 0) goto L_0x0149
            int r4 = r0.length     // Catch:{ NameNotFoundException -> 0x015b }
            if (r4 <= 0) goto L_0x0149
            r4 = 0
            r0 = r0[r4]     // Catch:{ NameNotFoundException -> 0x015b }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x015b }
            byte[] r0 = r15.digest(r0)     // Catch:{ NameNotFoundException -> 0x015b }
            long r0 = q7.a7.l0(r0)     // Catch:{ NameNotFoundException -> 0x015b }
            goto L_0x016c
        L_0x0149:
            r0 = r1
            q7.x3 r0 = (q7.x3) r0     // Catch:{ NameNotFoundException -> 0x015b }
            q7.s2 r0 = r0.E     // Catch:{ NameNotFoundException -> 0x015b }
            q7.x3.l(r0)     // Catch:{ NameNotFoundException -> 0x015b }
            q7.q2 r0 = r0.E     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r4 = "Could not get signatures"
            r0.b(r4)     // Catch:{ NameNotFoundException -> 0x015b }
        L_0x0158:
            r0 = -1
            goto L_0x016c
        L_0x015b:
            r0 = move-exception
            q7.x3 r1 = (q7.x3) r1
            q7.s2 r1 = r1.E
            q7.x3.l(r1)
            java.lang.String r4 = "Package name not found"
            q7.q2 r1 = r1.B
            r1.c(r0, r4)
        L_0x016a:
            r0 = 0
        L_0x016c:
            r2.C = r0
            r15 = r0
            goto L_0x0171
        L_0x0170:
            r15 = r14
        L_0x0171:
            boolean r18 = r13.g()
            q7.g3 r0 = r13.D
            q7.x3.j(r0)
            boolean r1 = r0.L
            r19 = r1 ^ 1
            r2.i()
            boolean r1 = r13.g()
            q7.f r4 = r13.C
            if (r1 != 0) goto L_0x018f
        L_0x0189:
            r22 = r10
            r20 = r15
            goto L_0x0216
        L_0x018f:
            com.google.android.gms.internal.measurement.zc r1 = com.google.android.gms.internal.measurement.zc.f5633b
            com.google.android.gms.internal.measurement.g5 r1 = r1.f5634a
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.measurement.ad r1 = (com.google.android.gms.internal.measurement.ad) r1
            r1.zza()
            q7.f2 r1 = q7.g2.f13027c0
            r14 = 0
            boolean r1 = r4.r(r14, r1)
            q7.s2 r14 = r13.E
            if (r1 == 0) goto L_0x01b2
            q7.x3.l(r14)
            java.lang.String r1 = "Disabled IID for tests."
            q7.q2 r6 = r14.J
            r6.b(r1)
            goto L_0x0189
        L_0x01b2:
            r1 = r6
            q7.x3 r1 = (q7.x3) r1     // Catch:{ ClassNotFoundException -> 0x0189 }
            android.content.Context r1 = r1.f13419a     // Catch:{ ClassNotFoundException -> 0x0189 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0189 }
            r20 = r15
            java.lang.String r15 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r1 = r1.loadClass(r15)     // Catch:{ ClassNotFoundException -> 0x0214 }
            if (r1 != 0) goto L_0x01c6
            goto L_0x0214
        L_0x01c6:
            java.lang.String r15 = "getInstance"
            r16 = r12
            r12 = 1
            r22 = r10
            java.lang.Class[] r10 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0209 }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r12 = 0
            r10[r12] = r11     // Catch:{ Exception -> 0x0209 }
            java.lang.reflect.Method r10 = r1.getDeclaredMethod(r15, r10)     // Catch:{ Exception -> 0x0209 }
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0209 }
            q7.x3 r6 = (q7.x3) r6     // Catch:{ Exception -> 0x0209 }
            android.content.Context r6 = r6.f13419a     // Catch:{ Exception -> 0x0209 }
            r11[r12] = r6     // Catch:{ Exception -> 0x0209 }
            r6 = 0
            java.lang.Object r6 = r10.invoke(r6, r11)     // Catch:{ Exception -> 0x0209 }
            if (r6 != 0) goto L_0x01e9
            goto L_0x0218
        L_0x01e9:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x01fa }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r10, r11)     // Catch:{ Exception -> 0x01fa }
            java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01fa }
            java.lang.Object r1 = r1.invoke(r6, r10)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x01fa }
            goto L_0x0219
        L_0x01fa:
            q7.x3.l(r14)
            java.lang.String r1 = "Failed to retrieve Firebase Instance Id"
            q7.q2 r6 = r14.G
            r6.b(r1)
            goto L_0x0218
        L_0x0205:
            r22 = r10
            r16 = r12
        L_0x0209:
            q7.x3.l(r14)
            java.lang.String r1 = "Failed to obtain Firebase Analytics instance"
            q7.q2 r6 = r14.F
            r6.b(r1)
            goto L_0x0218
        L_0x0214:
            r22 = r10
        L_0x0216:
            r16 = r12
        L_0x0218:
            r1 = 0
        L_0x0219:
            q7.x3.j(r0)
            q7.d3 r6 = r0.f13074e
            long r10 = r6.a()
            r14 = 0
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            long r14 = r13.f13424c0
            if (r6 != 0) goto L_0x022d
            r24 = r14
            goto L_0x0233
        L_0x022d:
            long r10 = java.lang.Math.min(r14, r10)
            r24 = r10
        L_0x0233:
            r2.j()
            int r15 = r2.G
            java.lang.String r6 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r6 = r4.q(r6)
            if (r6 == 0) goto L_0x0249
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0247
            goto L_0x0249
        L_0x0247:
            r6 = 0
            goto L_0x024a
        L_0x0249:
            r6 = 1
        L_0x024a:
            r26 = r6
            q7.x3.j(r0)
            r0.i()
            android.content.SharedPreferences r6 = r0.m()
            java.lang.String r10 = "deferred_analytics_collection"
            r11 = 0
            boolean r27 = r6.getBoolean(r10, r11)
            r2.j()
            java.lang.String r12 = r2.I
            java.lang.String r6 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r6 = r4.q(r6)
            if (r6 != 0) goto L_0x026c
            r6 = 0
            goto L_0x0276
        L_0x026c:
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
        L_0x0276:
            r28 = r6
            long r10 = r2.D
            java.util.List r6 = r2.E
            q7.x3.j(r0)
            q7.h r0 = r0.o()
            java.lang.String r31 = r0.e()
            java.lang.String r0 = r2.F
            if (r0 != 0) goto L_0x0294
            q7.x3.j(r3)
            java.lang.String r0 = r3.o()
            r2.F = r0
        L_0x0294:
            java.lang.String r0 = r2.F
            com.google.android.gms.internal.measurement.kc.b()
            q7.f2 r14 = q7.g2.f13043k0
            r29 = r6
            r6 = 0
            boolean r6 = r4.r(r6, r14)
            if (r6 == 0) goto L_0x02da
            r2.i()
            r32 = r10
            long r10 = r2.K
            r34 = 0
            int r6 = (r10 > r34 ? 1 : (r10 == r34 ? 0 : -1))
            if (r6 != 0) goto L_0x02b2
            goto L_0x02d0
        L_0x02b2:
            ag.m r6 = r13.J
            r6.getClass()
            long r10 = java.lang.System.currentTimeMillis()
            long r13 = r2.K
            long r10 = r10 - r13
            java.lang.String r6 = r2.J
            if (r6 == 0) goto L_0x02d0
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            int r6 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x02d0
            java.lang.String r6 = r2.L
            if (r6 != 0) goto L_0x02d0
            r2.p()
        L_0x02d0:
            java.lang.String r6 = r2.J
            if (r6 != 0) goto L_0x02d7
            r2.p()
        L_0x02d7:
            java.lang.String r6 = r2.J
            goto L_0x02df
        L_0x02da:
            r32 = r10
            r34 = 0
            r6 = 0
        L_0x02df:
            r10 = r34
            r34 = r6
            q7.k4 r6 = r4.f13121a
            java.lang.String r6 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r6 = r4.q(r6)
            if (r6 != 0) goto L_0x02ef
            r6 = 0
            goto L_0x02f3
        L_0x02ef:
            boolean r6 = r6.booleanValue()
        L_0x02f3:
            r35 = r6
            com.google.android.gms.internal.measurement.ob.a()
            q7.f2 r6 = q7.g2.f13066w0
            r13 = 0
            boolean r4 = r4.r(r13, r6)
            if (r4 == 0) goto L_0x033a
            q7.x3.j(r3)
            java.lang.String r2 = r2.n()
            q7.k4 r3 = r3.f13121a
            r4 = r3
            q7.x3 r4 = (q7.x3) r4
            android.content.Context r6 = r4.f13419a
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            if (r6 != 0) goto L_0x0316
            goto L_0x033a
        L_0x0316:
            q7.x3 r3 = (q7.x3) r3     // Catch:{ NameNotFoundException -> 0x0328 }
            android.content.Context r3 = r3.f13419a     // Catch:{ NameNotFoundException -> 0x0328 }
            b7.b r3 = b7.c.a(r3)     // Catch:{ NameNotFoundException -> 0x0328 }
            r6 = 0
            android.content.pm.ApplicationInfo r3 = r3.a(r6, r2)     // Catch:{ NameNotFoundException -> 0x0329 }
            if (r3 == 0) goto L_0x0338
            int r6 = r3.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x0329 }
            goto L_0x0338
        L_0x0328:
            r6 = 0
        L_0x0329:
            r4.getClass()
            q7.s2 r3 = r4.E
            q7.x3.l(r3)
            java.lang.String r4 = "PackageManager failed to find running app: app_id"
            q7.q2 r3 = r3.H
            r3.c(r2, r4)
        L_0x0338:
            long r2 = (long) r6
            goto L_0x033b
        L_0x033a:
            r2 = r10
        L_0x033b:
            r13 = 77000(0x12cc8, double:3.8043E-319)
            r4 = r29
            r6 = r5
            r29 = r32
            r10 = r22
            r32 = r12
            r12 = r16
            r23 = r15
            r15 = r20
            r20 = r1
            r21 = r24
            r24 = r26
            r25 = r27
            r26 = r32
            r27 = r28
            r28 = r29
            r30 = r4
            r32 = r0
            r33 = r34
            r34 = r35
            r35 = r2
            r6.<init>(r7, r8, r9, r10, r12, r13, r15, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.x5.r(boolean):q7.c7");
    }

    public final void s() {
        i();
        x3 x3Var = (x3) this.f13121a;
        s2 s2Var = x3Var.E;
        x3.l(s2Var);
        ArrayList arrayList = this.D;
        s2Var.J.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                s2 s2Var2 = x3Var.E;
                x3.l(s2Var2);
                s2Var2.B.c(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.E.a();
    }

    public final void t() {
        i();
        j6 j6Var = this.C;
        ((m) j6Var.f13141a).getClass();
        j6Var.f13142b = SystemClock.elapsedRealtime();
        ((x3) this.f13121a).getClass();
        this.B.c(((Long) g2.K.a((Object) null)).longValue());
    }

    public final void u(Runnable runnable) {
        i();
        if (o()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.D;
        x3 x3Var = (x3) this.f13121a;
        x3Var.getClass();
        if (((long) arrayList.size()) >= 1000) {
            s2 s2Var = x3Var.E;
            x3.l(s2Var);
            s2Var.B.b("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.E.c(60000);
        w();
    }

    public final void w() {
        i();
        j();
        if (!o()) {
            if (q()) {
                w5 w5Var = this.f13432c;
                w5Var.f13408c.i();
                Context context = ((x3) w5Var.f13408c.f13121a).f13419a;
                synchronized (w5Var) {
                    if (w5Var.f13406a) {
                        s2 s2Var = ((x3) w5Var.f13408c.f13121a).E;
                        x3.l(s2Var);
                        s2Var.J.b("Connection attempt already in progress");
                    } else if (w5Var.f13407b == null || (!w5Var.f13407b.e() && !w5Var.f13407b.h())) {
                        w5Var.f13407b = new o2(context, Looper.getMainLooper(), w5Var, w5Var);
                        s2 s2Var2 = ((x3) w5Var.f13408c.f13121a).E;
                        x3.l(s2Var2);
                        s2Var2.J.b("Connecting to remote service");
                        w5Var.f13406a = true;
                        q.i(w5Var.f13407b);
                        w5Var.f13407b.q();
                    } else {
                        s2 s2Var3 = ((x3) w5Var.f13408c.f13121a).E;
                        x3.l(s2Var3);
                        s2Var3.J.b("Already awaiting connection attempt");
                    }
                }
            } else if (!((x3) this.f13121a).C.v()) {
                ((x3) this.f13121a).getClass();
                List<ResolveInfo> queryIntentServices = ((x3) this.f13121a).f13419a.getPackageManager().queryIntentServices(new Intent().setClassName(((x3) this.f13121a).f13419a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    s2 s2Var4 = ((x3) this.f13121a).E;
                    x3.l(s2Var4);
                    s2Var4.B.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                x3 x3Var = (x3) this.f13121a;
                Context context2 = x3Var.f13419a;
                x3Var.getClass();
                intent.setComponent(new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementService"));
                w5 w5Var2 = this.f13432c;
                w5Var2.f13408c.i();
                Context context3 = ((x3) w5Var2.f13408c.f13121a).f13419a;
                a b10 = a.b();
                synchronized (w5Var2) {
                    if (w5Var2.f13406a) {
                        s2 s2Var5 = ((x3) w5Var2.f13408c.f13121a).E;
                        x3.l(s2Var5);
                        s2Var5.J.b("Connection attempt already in progress");
                        return;
                    }
                    s2 s2Var6 = ((x3) w5Var2.f13408c.f13121a).E;
                    x3.l(s2Var6);
                    s2Var6.J.b("Using local app measurement service");
                    w5Var2.f13406a = true;
                    b10.a(context3, intent, w5Var2.f13408c.f13432c, 129);
                }
            }
        }
    }

    public final void x() {
        i();
        j();
        w5 w5Var = this.f13432c;
        if (w5Var.f13407b != null && (w5Var.f13407b.h() || w5Var.f13407b.e())) {
            w5Var.f13407b.g();
        }
        w5Var.f13407b = null;
        try {
            a.b().c(((x3) this.f13121a).f13419a, this.f13432c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f13433d = null;
    }

    public final void y(AtomicReference atomicReference) {
        i();
        j();
        u(new o5(this, atomicReference, r(false)));
    }
}
