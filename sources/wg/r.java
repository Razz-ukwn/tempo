package wg;

import java.util.zip.Inflater;

public final class r implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public final h f16796a;

    /* renamed from: b  reason: collision with root package name */
    public final Inflater f16797b;

    /* renamed from: c  reason: collision with root package name */
    public int f16798c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16799d;

    public r(c0 c0Var, Inflater inflater) {
        this.f16796a = c0Var;
        this.f16797b = inflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a0(wg.e r10, long r11) {
        /*
            r9 = this;
            java.lang.String r0 = "sink"
            sf.j.f(r10, r0)
        L_0x0005:
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L_0x000e
            r4 = r3
            goto L_0x000f
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 == 0) goto L_0x00c0
            boolean r4 = r9.f16799d
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x00b4
            wg.h r4 = r9.f16796a
            java.util.zip.Inflater r5 = r9.f16797b
            if (r2 != 0) goto L_0x001e
        L_0x001c:
            r2 = r0
            goto L_0x0088
        L_0x001e:
            wg.d0 r2 = r10.e0(r3)     // Catch:{ DataFormatException -> 0x00ad }
            int r3 = r2.f16746c     // Catch:{ DataFormatException -> 0x00ad }
            int r3 = 8192 - r3
            long r6 = (long) r3     // Catch:{ DataFormatException -> 0x00ad }
            long r6 = java.lang.Math.min(r11, r6)     // Catch:{ DataFormatException -> 0x00ad }
            int r3 = (int) r6     // Catch:{ DataFormatException -> 0x00ad }
            boolean r6 = r5.needsInput()     // Catch:{ DataFormatException -> 0x00ad }
            if (r6 != 0) goto L_0x0033
            goto L_0x004f
        L_0x0033:
            boolean r6 = r4.y()     // Catch:{ DataFormatException -> 0x00ad }
            if (r6 == 0) goto L_0x003a
            goto L_0x004f
        L_0x003a:
            wg.e r6 = r4.a()     // Catch:{ DataFormatException -> 0x00ad }
            wg.d0 r6 = r6.f16751a     // Catch:{ DataFormatException -> 0x00ad }
            sf.j.c(r6)     // Catch:{ DataFormatException -> 0x00ad }
            int r7 = r6.f16746c     // Catch:{ DataFormatException -> 0x00ad }
            int r8 = r6.f16745b     // Catch:{ DataFormatException -> 0x00ad }
            int r7 = r7 - r8
            r9.f16798c = r7     // Catch:{ DataFormatException -> 0x00ad }
            byte[] r6 = r6.f16744a     // Catch:{ DataFormatException -> 0x00ad }
            r5.setInput(r6, r8, r7)     // Catch:{ DataFormatException -> 0x00ad }
        L_0x004f:
            byte[] r6 = r2.f16744a     // Catch:{ DataFormatException -> 0x00ad }
            int r7 = r2.f16746c     // Catch:{ DataFormatException -> 0x00ad }
            int r3 = r5.inflate(r6, r7, r3)     // Catch:{ DataFormatException -> 0x00ad }
            int r6 = r9.f16798c     // Catch:{ DataFormatException -> 0x00ad }
            if (r6 != 0) goto L_0x005c
            goto L_0x006a
        L_0x005c:
            int r7 = r5.getRemaining()     // Catch:{ DataFormatException -> 0x00ad }
            int r6 = r6 - r7
            int r7 = r9.f16798c     // Catch:{ DataFormatException -> 0x00ad }
            int r7 = r7 - r6
            r9.f16798c = r7     // Catch:{ DataFormatException -> 0x00ad }
            long r6 = (long) r6     // Catch:{ DataFormatException -> 0x00ad }
            r4.skip(r6)     // Catch:{ DataFormatException -> 0x00ad }
        L_0x006a:
            if (r3 <= 0) goto L_0x0078
            int r6 = r2.f16746c     // Catch:{ DataFormatException -> 0x00ad }
            int r6 = r6 + r3
            r2.f16746c = r6     // Catch:{ DataFormatException -> 0x00ad }
            long r6 = r10.f16752b     // Catch:{ DataFormatException -> 0x00ad }
            long r2 = (long) r3     // Catch:{ DataFormatException -> 0x00ad }
            long r6 = r6 + r2
            r10.f16752b = r6     // Catch:{ DataFormatException -> 0x00ad }
            goto L_0x0088
        L_0x0078:
            int r3 = r2.f16745b     // Catch:{ DataFormatException -> 0x00ad }
            int r6 = r2.f16746c     // Catch:{ DataFormatException -> 0x00ad }
            if (r3 != r6) goto L_0x001c
            wg.d0 r3 = r2.a()     // Catch:{ DataFormatException -> 0x00ad }
            r10.f16751a = r3     // Catch:{ DataFormatException -> 0x00ad }
            wg.e0.a(r2)     // Catch:{ DataFormatException -> 0x00ad }
            goto L_0x001c
        L_0x0088:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            return r2
        L_0x008d:
            boolean r0 = r5.finished()
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r5.needsDictionary()
            if (r0 == 0) goto L_0x009a
            goto L_0x00aa
        L_0x009a:
            boolean r0 = r4.y()
            if (r0 != 0) goto L_0x00a2
            goto L_0x0005
        L_0x00a2:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        L_0x00aa:
            r10 = -1
            return r10
        L_0x00ad:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        L_0x00b4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00c0:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.r.a0(wg.e, long):long");
    }

    public final j0 b() {
        return this.f16796a.b();
    }

    public final void close() {
        if (!this.f16799d) {
            this.f16797b.end();
            this.f16799d = true;
            this.f16796a.close();
        }
    }
}
