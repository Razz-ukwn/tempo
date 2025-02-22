package n3;

import android.database.DatabaseErrorHandler;
import m3.c;
import n3.d;

public final /* synthetic */ class e implements DatabaseErrorHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.a f11567a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.a f11568b;

    public /* synthetic */ e(c.a aVar, d.a aVar2) {
        this.f11567a = aVar;
        this.f11568b = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r1 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r4 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        if (r4.hasNext() != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        r1 = ((android.util.Pair) r4.next()).second;
        sf.j.e(r1, "p.second");
        m3.c.a.a((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        r4 = r4.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r4 != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        m3.c.a.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0049 A[ExcHandler: all (r2v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
      PHI: (r1v15 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v7 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v8 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v8 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:6:0x0044, B:9:0x004b, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:6:0x0044] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            java.lang.String r0 = "$callback"
            m3.c$a r1 = r3.f11567a
            sf.j.f(r1, r0)
            n3.d$a r0 = r3.f11568b
            java.lang.String r1 = "$dbRef"
            sf.j.f(r0, r1)
            int r1 = n3.d.b.D
            java.lang.String r1 = "dbObj"
            sf.j.e(r4, r1)
            n3.c r4 = n3.d.b.C0222b.a(r0, r4)
            java.lang.String r0 = "p.second"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Corruption reported by sqlite on database: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ".path"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SupportSQLite"
            android.util.Log.e(r2, r1)
            boolean r1 = r4.isOpen()
            if (r1 != 0) goto L_0x0043
            java.lang.String r4 = r4.d()
            if (r4 == 0) goto L_0x00a0
            m3.c.a.a(r4)
            goto L_0x00a0
        L_0x0043:
            r1 = 0
            java.util.List r1 = r4.c()     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            goto L_0x004b
        L_0x0049:
            r2 = move-exception
            goto L_0x004f
        L_0x004b:
            r4.close()     // Catch:{ IOException -> 0x0078, all -> 0x0049 }
            goto L_0x0078
        L_0x004f:
            if (r1 == 0) goto L_0x006e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r4 = r1.iterator()
        L_0x0057:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0077
            java.lang.Object r1 = r4.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.second
            sf.j.e(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            m3.c.a.a(r1)
            goto L_0x0057
        L_0x006e:
            java.lang.String r4 = r4.d()
            if (r4 == 0) goto L_0x0077
            m3.c.a.a(r4)
        L_0x0077:
            throw r2
        L_0x0078:
            if (r1 == 0) goto L_0x0097
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r4 = r1.iterator()
        L_0x0080:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r1 = r4.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.second
            sf.j.e(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            m3.c.a.a(r1)
            goto L_0x0080
        L_0x0097:
            java.lang.String r4 = r4.d()
            if (r4 == 0) goto L_0x00a0
            m3.c.a.a(r4)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.e.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
