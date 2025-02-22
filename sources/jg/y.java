package jg;

import java.io.File;

public final class y extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f10230a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ File f10231b;

    public y(File file, t tVar) {
        this.f10230a = tVar;
        this.f10231b = file;
    }

    public final long a() {
        return this.f10231b.length();
    }

    public final t b() {
        return this.f10230a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        e9.c.c(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(wg.g r4) {
        /*
            r3 = this;
            java.util.logging.Logger r0 = wg.w.f16803a
            java.lang.String r0 = "<this>"
            java.io.File r1 = r3.f10231b
            sf.j.f(r1, r0)
            wg.s r0 = new wg.s
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r1)
            wg.j0$a r1 = wg.j0.f16769d
            r0.<init>(r2, r1)
            r4.x(r0)     // Catch:{ all -> 0x001d }
            r4 = 0
            e9.c.c(r0, r4)
            return
        L_0x001d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x001f }
        L_0x001f:
            r1 = move-exception
            e9.c.c(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.y.c(wg.g):void");
    }
}
