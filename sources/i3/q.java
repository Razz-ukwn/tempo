package i3;

import m3.c;
import sf.j;

public final class q extends c.a {

    /* renamed from: b  reason: collision with root package name */
    public f f9534b;

    /* renamed from: c  reason: collision with root package name */
    public final a f9535c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9536d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9537e;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9538a;

        public a(int i8) {
            this.f9538a = i8;
        }

        public abstract void a(n3.c cVar);

        public abstract void b(n3.c cVar);

        public abstract void c(n3.c cVar);

        public abstract void d(n3.c cVar);

        public abstract void e();

        public abstract void f(n3.c cVar);

        public abstract b g(n3.c cVar);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9539a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9540b;

        public b(String str, boolean z10) {
            this.f9539a = z10;
            this.f9540b = str;
        }
    }

    public q(f fVar, a aVar, String str, String str2) {
        super(aVar.f9538a);
        this.f9534b = fVar;
        this.f9535c = aVar;
        this.f9536d = str;
        this.f9537e = str2;
    }

    public final void b(n3.c cVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        e9.c.c(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(n3.c r4) {
        /*
            r3 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r0 = r4.e(r0)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0045 }
            r2 = 0
            if (r1 == 0) goto L_0x0014
            int r1 = r0.getInt(r2)     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0014
            r2 = 1
        L_0x0014:
            r1 = 0
            e9.c.c(r0, r1)
            i3.q$a r0 = r3.f9535c
            r0.a(r4)
            if (r2 != 0) goto L_0x003e
            i3.q$b r1 = r0.g(r4)
            boolean r2 = r1.f9539a
            if (r2 == 0) goto L_0x0028
            goto L_0x003e
        L_0x0028:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f9540b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x003e:
            r3.g(r4)
            r0.c(r4)
            return
        L_0x0045:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            e9.c.c(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.q.c(n3.c):void");
    }

    public final void d(n3.c cVar, int i8, int i10) {
        f(cVar, i8, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        e9.c.c(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        e9.c.c(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(n3.c r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.e(r0)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x0015
            int r1 = r0.getInt(r2)     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            r3 = 0
            e9.c.c(r0, r3)
            i3.q$a r0 = r5.f9535c
            if (r1 == 0) goto L_0x006c
            m3.a r1 = new m3.a
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.u0(r1)
            boolean r4 = r1.moveToFirst()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0034
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x0065 }
            goto L_0x0035
        L_0x0034:
            r2 = r3
        L_0x0035:
            e9.c.c(r1, r3)
            java.lang.String r1 = r5.f9536d
            boolean r4 = sf.j.a(r1, r2)
            if (r4 != 0) goto L_0x007a
            java.lang.String r4 = r5.f9537e
            boolean r4 = sf.j.a(r4, r2)
            if (r4 == 0) goto L_0x0049
            goto L_0x007a
        L_0x0049:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = ", found: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0065:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            e9.c.c(r1, r6)
            throw r0
        L_0x006c:
            i3.q$b r1 = r0.g(r6)
            boolean r2 = r1.f9539a
            if (r2 == 0) goto L_0x0080
            r0.e()
            r5.g(r6)
        L_0x007a:
            r0.d(r6)
            r5.f9534b = r3
            return
        L_0x0080:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f9540b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0096:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r1 = move-exception
            e9.c.c(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.q.e(n3.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r10 <= r15) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r10 < r6) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0076 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(n3.c r13, int r14, int r15) {
        /*
            r12 = this;
            i3.f r0 = r12.f9534b
            i3.q$a r1 = r12.f9535c
            r2 = 0
            if (r0 == 0) goto L_0x00cd
            i3.p$c r0 = r0.f9450d
            r0.getClass()
            r3 = 1
            if (r14 != r15) goto L_0x0013
            gf.s r0 = gf.s.f8978a
            goto L_0x008c
        L_0x0013:
            if (r15 <= r14) goto L_0x0017
            r4 = r3
            goto L_0x0018
        L_0x0017:
            r4 = r2
        L_0x0018:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = r14
        L_0x001e:
            if (r4 == 0) goto L_0x0023
            if (r6 >= r15) goto L_0x0027
            goto L_0x0025
        L_0x0023:
            if (r6 <= r15) goto L_0x0027
        L_0x0025:
            r7 = r3
            goto L_0x0028
        L_0x0027:
            r7 = r2
        L_0x0028:
            if (r7 == 0) goto L_0x008b
            java.util.LinkedHashMap r7 = r0.f9533a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r7.get(r8)
            java.util.TreeMap r7 = (java.util.TreeMap) r7
            if (r7 != 0) goto L_0x0039
            goto L_0x0089
        L_0x0039:
            if (r4 == 0) goto L_0x0040
            java.util.NavigableSet r8 = r7.descendingKeySet()
            goto L_0x0044
        L_0x0040:
            java.util.Set r8 = r7.keySet()
        L_0x0044:
            java.util.Iterator r8 = r8.iterator()
        L_0x0048:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0086
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.String r10 = "targetVersion"
            if (r4 == 0) goto L_0x0066
            int r11 = r6 + 1
            sf.j.e(r9, r10)
            int r10 = r9.intValue()
            if (r11 > r10) goto L_0x0073
            if (r10 > r15) goto L_0x0073
            goto L_0x0071
        L_0x0066:
            sf.j.e(r9, r10)
            int r10 = r9.intValue()
            if (r15 > r10) goto L_0x0073
            if (r10 >= r6) goto L_0x0073
        L_0x0071:
            r10 = r3
            goto L_0x0074
        L_0x0073:
            r10 = r2
        L_0x0074:
            if (r10 == 0) goto L_0x0048
            java.lang.Object r6 = r7.get(r9)
            sf.j.c(r6)
            r5.add(r6)
            int r6 = r9.intValue()
            r7 = r3
            goto L_0x0087
        L_0x0086:
            r7 = r2
        L_0x0087:
            if (r7 != 0) goto L_0x001e
        L_0x0089:
            r0 = 0
            goto L_0x008c
        L_0x008b:
            r0 = r5
        L_0x008c:
            if (r0 == 0) goto L_0x00cd
            r1.f(r13)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0097:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r0.next()
            j3.a r2 = (j3.a) r2
            r2.a(r13)
            goto L_0x0097
        L_0x00a7:
            i3.q$b r0 = r1.g(r13)
            boolean r2 = r0.f9539a
            if (r2 == 0) goto L_0x00b7
            r1.e()
            r12.g(r13)
            r2 = r3
            goto L_0x00cd
        L_0x00b7:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Migration didn't properly handle: "
            r14.<init>(r15)
            java.lang.String r15 = r0.f9540b
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x00cd:
            if (r2 != 0) goto L_0x00f0
            i3.f r0 = r12.f9534b
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r0.a(r14, r15)
            if (r0 != 0) goto L_0x00e0
            r1.b(r13)
            r1.a(r13)
            goto L_0x00f0
        L_0x00e0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "A migration from "
            java.lang.String r1 = " to "
            java.lang.String r2 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.String r14 = androidx.activity.result.d.b(r0, r14, r1, r15, r2)
            r13.<init>(r14)
            throw r13
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.q.f(n3.c, int, int):void");
    }

    public final void g(n3.c cVar) {
        cVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f9536d;
        j.f(str, "hash");
        cVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }
}
