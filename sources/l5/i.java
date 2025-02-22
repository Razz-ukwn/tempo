package l5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class i<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f10998a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public final long f10999b;

    /* renamed from: c  reason: collision with root package name */
    public long f11000c;

    public static final class a<Y> {

        /* renamed from: a  reason: collision with root package name */
        public final Y f11001a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11002b;

        public a(Y y10, int i8) {
            this.f11001a = y10;
            this.f11002b = i8;
        }
    }

    public i(long j10) {
        this.f10999b = j10;
    }

    public final synchronized Y a(T t2) {
        a aVar;
        aVar = (a) this.f10998a.get(t2);
        return aVar != null ? aVar.f11001a : null;
    }

    public int b(Y y10) {
        return 1;
    }

    public void c(T t2, Y y10) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized Y d(T r8, Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.b(r9)     // Catch:{ all -> 0x004c }
            long r1 = (long) r0     // Catch:{ all -> 0x004c }
            long r3 = r7.f10999b     // Catch:{ all -> 0x004c }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0012
            r7.c(r8, r9)     // Catch:{ all -> 0x004c }
            monitor-exit(r7)
            return r4
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r5 = r7.f11000c     // Catch:{ all -> 0x004c }
            long r5 = r5 + r1
            r7.f11000c = r5     // Catch:{ all -> 0x004c }
        L_0x0019:
            java.util.LinkedHashMap r1 = r7.f10998a     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x001f
            r2 = r4
            goto L_0x0024
        L_0x001f:
            l5.i$a r2 = new l5.i$a     // Catch:{ all -> 0x004c }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004c }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004c }
            l5.i$a r0 = (l5.i.a) r0     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f11000c     // Catch:{ all -> 0x004c }
            int r3 = r0.f11002b     // Catch:{ all -> 0x004c }
            long r5 = (long) r3     // Catch:{ all -> 0x004c }
            long r1 = r1 - r5
            r7.f11000c = r1     // Catch:{ all -> 0x004c }
            Y r1 = r0.f11001a     // Catch:{ all -> 0x004c }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f11001a     // Catch:{ all -> 0x004c }
            r7.c(r8, r9)     // Catch:{ all -> 0x004c }
        L_0x0041:
            long r8 = r7.f10999b     // Catch:{ all -> 0x004c }
            r7.e(r8)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            Y r4 = r0.f11001a     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r7)
            return r4
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.i.d(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized void e(long j10) {
        while (this.f11000c > j10) {
            Iterator it = this.f10998a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f11000c -= (long) aVar.f11002b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.f11001a);
        }
    }
}
