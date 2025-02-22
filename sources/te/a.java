package te;

import bf.b;

public final class a implements b, we.a {

    /* renamed from: a  reason: collision with root package name */
    public b<b> f15625a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f15626b;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r1.f3643d;
        r3 = r1.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r5 >= r3) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r6 = r1[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((r6 instanceof te.b) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((te.b) r6).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        e9.c.m(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r2.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if (r2.size() != 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        throw bf.a.a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        throw new ue.a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            boolean r0 = r8.f15626b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r8)
            boolean r0 = r8.f15626b     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            return
        L_0x000c:
            r0 = 1
            r8.f15626b = r0     // Catch:{ all -> 0x0056 }
            bf.b<te.b> r1 = r8.f15625a     // Catch:{ all -> 0x0056 }
            r2 = 0
            r8.f15625a = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0055
        L_0x0018:
            T[] r1 = r1.f3643d
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L_0x001d:
            if (r5 >= r3) goto L_0x003c
            r6 = r1[r5]
            boolean r7 = r6 instanceof te.b
            if (r7 == 0) goto L_0x0039
            te.b r6 = (te.b) r6     // Catch:{ all -> 0x002b }
            r6.a()     // Catch:{ all -> 0x002b }
            goto L_0x0039
        L_0x002b:
            r6 = move-exception
            e9.c.m(r6)
            if (r2 != 0) goto L_0x0036
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0036:
            r2.add(r6)
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x001d
        L_0x003c:
            if (r2 == 0) goto L_0x0055
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004f
            java.lang.Object r0 = r2.get(r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = bf.a.a(r0)
            throw r0
        L_0x004f:
            ue.a r0 = new ue.a
            r0.<init>(r2)
            throw r0
        L_0x0055:
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: te.a.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004a A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(te.b r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposables is null"
            if (r8 == 0) goto L_0x0051
            boolean r0 = r7.f15626b
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            monitor-enter(r7)
            boolean r0 = r7.f15626b     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            return r1
        L_0x0011:
            bf.b<te.b> r0 = r7.f15625a     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004c
            T[] r2 = r0.f3643d     // Catch:{ all -> 0x004e }
            int r3 = r0.f3640a     // Catch:{ all -> 0x004e }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x004e }
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004e }
            r6 = 1
            if (r5 != 0) goto L_0x002b
            goto L_0x003b
        L_0x002b:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0035
            r0.b(r4, r3, r2)     // Catch:{ all -> 0x004e }
            goto L_0x0046
        L_0x0035:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004e }
            if (r5 != 0) goto L_0x003d
        L_0x003b:
            r8 = r1
            goto L_0x0047
        L_0x003d:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0035
            r0.b(r4, r3, r2)     // Catch:{ all -> 0x004e }
        L_0x0046:
            r8 = r6
        L_0x0047:
            if (r8 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            return r6
        L_0x004c:
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            throw r8
        L_0x0051:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: te.a.b(te.b):boolean");
    }

    public final boolean c(b bVar) {
        if (!this.f15626b) {
            synchronized (this) {
                if (!this.f15626b) {
                    b<b> bVar2 = this.f15625a;
                    if (bVar2 == null) {
                        bVar2 = new b<>();
                        this.f15625a = bVar2;
                    }
                    bVar2.a(bVar);
                    return true;
                }
            }
        }
        bVar.a();
        return false;
    }

    public final boolean d(b bVar) {
        if (!b(bVar)) {
            return false;
        }
        bVar.a();
        return true;
    }
}
