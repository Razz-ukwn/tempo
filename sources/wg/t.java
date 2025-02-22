package wg;

import java.io.RandomAccessFile;

public final class t extends j {

    /* renamed from: c  reason: collision with root package name */
    public final RandomAccessFile f16802c;

    public t(RandomAccessFile randomAccessFile) {
        this.f16802c = randomAccessFile;
    }

    public final synchronized void c() {
        this.f16802c.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int d(long r2, byte[] r4, int r5, int r6) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            sf.j.f(r4, r0)     // Catch:{ all -> 0x0021 }
            java.io.RandomAccessFile r0 = r1.f16802c     // Catch:{ all -> 0x0021 }
            r0.seek(r2)     // Catch:{ all -> 0x0021 }
            r2 = 0
        L_0x000c:
            if (r2 >= r6) goto L_0x001f
            java.io.RandomAccessFile r3 = r1.f16802c     // Catch:{ all -> 0x0021 }
            int r0 = r6 - r2
            int r3 = r3.read(r4, r5, r0)     // Catch:{ all -> 0x0021 }
            r0 = -1
            if (r3 != r0) goto L_0x001d
            if (r2 != 0) goto L_0x001f
            monitor-exit(r1)
            return r0
        L_0x001d:
            int r2 = r2 + r3
            goto L_0x000c
        L_0x001f:
            monitor-exit(r1)
            return r2
        L_0x0021:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.t.d(long, byte[], int, int):int");
    }

    public final synchronized long e() {
        return this.f16802c.length();
    }
}
