package t4;

import java.io.File;
import n4.a;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final j f15348a;

    /* renamed from: b  reason: collision with root package name */
    public final File f15349b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15350c;

    /* renamed from: d  reason: collision with root package name */
    public final b f15351d = new b();

    /* renamed from: e  reason: collision with root package name */
    public a f15352e;

    @Deprecated
    public d(File file, long j10) {
        this.f15349b = file;
        this.f15350c = j10;
        this.f15348a = new j();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(p4.f r8, r4.g r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Had two simultaneous puts for: "
            java.lang.String r1 = "Put: Obtained: "
            t4.j r2 = r7.f15348a
            java.lang.String r2 = r2.a(r8)
            t4.b r3 = r7.f15351d
            monitor-enter(r3)
            java.util.HashMap r4 = r3.f15341a     // Catch:{ all -> 0x00d6 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x00d6 }
            t4.b$a r4 = (t4.b.a) r4     // Catch:{ all -> 0x00d6 }
            if (r4 != 0) goto L_0x0035
            t4.b$b r4 = r3.f15342b     // Catch:{ all -> 0x00d6 }
            java.util.ArrayDeque r5 = r4.f15345a     // Catch:{ all -> 0x00d6 }
            monitor-enter(r5)     // Catch:{ all -> 0x00d6 }
            java.util.ArrayDeque r4 = r4.f15345a     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0032 }
            t4.b$a r4 = (t4.b.a) r4     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x002c
            t4.b$a r4 = new t4.b$a     // Catch:{ all -> 0x00d6 }
            r4.<init>()     // Catch:{ all -> 0x00d6 }
        L_0x002c:
            java.util.HashMap r5 = r3.f15341a     // Catch:{ all -> 0x00d6 }
            r5.put(r2, r4)     // Catch:{ all -> 0x00d6 }
            goto L_0x0035
        L_0x0032:
            r8 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            throw r8     // Catch:{ all -> 0x00d6 }
        L_0x0035:
            int r5 = r4.f15344b     // Catch:{ all -> 0x00d6 }
            r6 = 1
            int r5 = r5 + r6
            r4.f15344b = r5     // Catch:{ all -> 0x00d6 }
            monitor-exit(r3)     // Catch:{ all -> 0x00d6 }
            java.util.concurrent.locks.ReentrantLock r3 = r4.f15343a
            r3.lock()
            java.lang.String r3 = "DiskLruCacheWrapper"
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x00cf }
            if (r3 == 0) goto L_0x0063
            java.lang.String r3 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r4.<init>(r1)     // Catch:{ all -> 0x00cf }
            r4.append(r2)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = " for for Key: "
            r4.append(r1)     // Catch:{ all -> 0x00cf }
            r4.append(r8)     // Catch:{ all -> 0x00cf }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x00cf }
            android.util.Log.v(r3, r8)     // Catch:{ all -> 0x00cf }
        L_0x0063:
            monitor-enter(r7)     // Catch:{ IOException -> 0x00a6 }
            n4.a r8 = r7.f15352e     // Catch:{ all -> 0x00bb }
            if (r8 != 0) goto L_0x0072
            java.io.File r8 = r7.f15349b     // Catch:{ all -> 0x00bb }
            long r3 = r7.f15350c     // Catch:{ all -> 0x00bb }
            n4.a r8 = n4.a.u(r8, r3)     // Catch:{ all -> 0x00bb }
            r7.f15352e = r8     // Catch:{ all -> 0x00bb }
        L_0x0072:
            n4.a r8 = r7.f15352e     // Catch:{ all -> 0x00bb }
            monitor-exit(r7)     // Catch:{ IOException -> 0x00a6 }
            n4.a$e r1 = r8.q(r2)     // Catch:{ IOException -> 0x00a6 }
            if (r1 == 0) goto L_0x0081
        L_0x007b:
            t4.b r8 = r7.f15351d
            r8.a(r2)
            return
        L_0x0081:
            n4.a$c r8 = r8.j(r2)     // Catch:{ IOException -> 0x00a6 }
            if (r8 == 0) goto L_0x00b1
            java.io.File r0 = r8.b()     // Catch:{ all -> 0x00a8 }
            DataType r1 = r9.f13891b     // Catch:{ all -> 0x00a8 }
            p4.h r3 = r9.f13892c     // Catch:{ all -> 0x00a8 }
            p4.d<DataType> r9 = r9.f13890a     // Catch:{ all -> 0x00a8 }
            boolean r9 = r9.a(r1, r0, r3)     // Catch:{ all -> 0x00a8 }
            if (r9 == 0) goto L_0x009e
            n4.a r9 = n4.a.this     // Catch:{ all -> 0x00a8 }
            n4.a.c(r9, r8, r6)     // Catch:{ all -> 0x00a8 }
            r8.f11579c = r6     // Catch:{ all -> 0x00a8 }
        L_0x009e:
            boolean r9 = r8.f11579c     // Catch:{ IOException -> 0x00a6 }
            if (r9 != 0) goto L_0x007b
            r8.a()     // Catch:{ IOException -> 0x007b }
            goto L_0x007b
        L_0x00a6:
            r8 = move-exception
            goto L_0x00be
        L_0x00a8:
            r9 = move-exception
            boolean r0 = r8.f11579c     // Catch:{ IOException -> 0x00a6 }
            if (r0 != 0) goto L_0x00b0
            r8.a()     // Catch:{ IOException -> 0x00b0 }
        L_0x00b0:
            throw r9     // Catch:{ IOException -> 0x00a6 }
        L_0x00b1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r9 = r0.concat(r2)     // Catch:{ IOException -> 0x00a6 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00a6 }
            throw r8     // Catch:{ IOException -> 0x00a6 }
        L_0x00bb:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x00a6 }
            throw r8     // Catch:{ IOException -> 0x00a6 }
        L_0x00be:
            java.lang.String r9 = "DiskLruCacheWrapper"
            r0 = 5
            boolean r9 = android.util.Log.isLoggable(r9, r0)     // Catch:{ all -> 0x00cf }
            if (r9 == 0) goto L_0x007b
            java.lang.String r9 = "DiskLruCacheWrapper"
            java.lang.String r0 = "Unable to put to disk cache"
            android.util.Log.w(r9, r0, r8)     // Catch:{ all -> 0x00cf }
            goto L_0x007b
        L_0x00cf:
            r8 = move-exception
            t4.b r9 = r7.f15351d
            r9.a(r2)
            throw r8
        L_0x00d6:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d6 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.d.c(p4.f, r4.g):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (android.util.Log.isLoggable("DiskLruCacheWrapper", 5) != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        android.util.Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File d(p4.f r5) {
        /*
            r4 = this;
            t4.j r0 = r4.f15348a
            java.lang.String r0 = r0.a(r5)
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L_0x0028
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Get: Obtained: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " for for Key: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.v(r1, r5)
        L_0x0028:
            monitor-enter(r4)     // Catch:{ IOException -> 0x0046 }
            n4.a r5 = r4.f15352e     // Catch:{ all -> 0x0048 }
            if (r5 != 0) goto L_0x0037
            java.io.File r5 = r4.f15349b     // Catch:{ all -> 0x0048 }
            long r2 = r4.f15350c     // Catch:{ all -> 0x0048 }
            n4.a r5 = n4.a.u(r5, r2)     // Catch:{ all -> 0x0048 }
            r4.f15352e = r5     // Catch:{ all -> 0x0048 }
        L_0x0037:
            n4.a r5 = r4.f15352e     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)     // Catch:{ IOException -> 0x0046 }
            n4.a$e r5 = r5.q(r0)     // Catch:{ IOException -> 0x0046 }
            if (r5 == 0) goto L_0x0057
            java.io.File[] r5 = r5.f11588a     // Catch:{ IOException -> 0x0046 }
            r0 = 0
            r5 = r5[r0]     // Catch:{ IOException -> 0x0046 }
            goto L_0x0058
        L_0x0046:
            r5 = move-exception
            goto L_0x004b
        L_0x0048:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x0046 }
            throw r5     // Catch:{ IOException -> 0x0046 }
        L_0x004b:
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "Unable to get from disk cache"
            android.util.Log.w(r1, r0, r5)
        L_0x0057:
            r5 = 0
        L_0x0058:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.d.d(p4.f):java.io.File");
    }
}
