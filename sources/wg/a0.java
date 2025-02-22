package wg;

import sf.j;

public final class a0 implements i0 {
    public long B;

    /* renamed from: a  reason: collision with root package name */
    public final h f16728a;

    /* renamed from: b  reason: collision with root package name */
    public final e f16729b;

    /* renamed from: c  reason: collision with root package name */
    public d0 f16730c;

    /* renamed from: d  reason: collision with root package name */
    public int f16731d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16732e;

    public a0(h hVar) {
        j.f(hVar, "upstream");
        this.f16728a = hVar;
        e a10 = hVar.a();
        this.f16729b = a10;
        d0 d0Var = a10.f16751a;
        this.f16730c = d0Var;
        this.f16731d = d0Var != null ? d0Var.f16745b : -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r7.f16745b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a0(wg.e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            sf.j.f(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x007e
            boolean r5 = r8.f16732e
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0072
            wg.d0 r5 = r8.f16730c
            wg.e r6 = r8.f16729b
            if (r5 == 0) goto L_0x002a
            wg.d0 r7 = r6.f16751a
            if (r5 != r7) goto L_0x002b
            int r5 = r8.f16731d
            sf.j.c(r7)
            int r7 = r7.f16745b
            if (r5 != r7) goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            if (r3 == 0) goto L_0x0066
            if (r2 != 0) goto L_0x0030
            return r0
        L_0x0030:
            long r0 = r8.B
            r2 = 1
            long r0 = r0 + r2
            wg.h r2 = r8.f16728a
            boolean r0 = r2.c0(r0)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            wg.d0 r0 = r8.f16730c
            if (r0 != 0) goto L_0x004e
            wg.d0 r0 = r6.f16751a
            if (r0 == 0) goto L_0x004e
            r8.f16730c = r0
            int r0 = r0.f16745b
            r8.f16731d = r0
        L_0x004e:
            long r0 = r6.f16752b
            long r2 = r8.B
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            wg.e r2 = r8.f16729b
            long r3 = r8.B
            r5 = r10
            r7 = r9
            r2.u(r3, r5, r7)
            long r0 = r8.B
            long r0 = r0 + r10
            r8.B = r0
            return r10
        L_0x0066:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0072:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.a0.a0(wg.e, long):long");
    }

    public final j0 b() {
        return this.f16728a.b();
    }

    public final void close() {
        this.f16732e = true;
    }
}
