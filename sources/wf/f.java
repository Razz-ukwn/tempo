package wf;

public final class f extends d implements c<Integer> {

    /* renamed from: d  reason: collision with root package name */
    public static final f f16721d = new f(1, 0);

    public f(int i8, int i10) {
        super(i8, i10, 1);
    }

    public final Comparable b() {
        return Integer.valueOf(this.f16714a);
    }

    public final Comparable c() {
        return Integer.valueOf(this.f16715b);
    }

    public final boolean e(int i8) {
        return this.f16714a <= i8 && i8 <= this.f16715b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (wf.f) r3;
        r0 = r3.f16714a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = r3.f16715b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof wf.f
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            wf.f r0 = (wf.f) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            wf.f r3 = (wf.f) r3
            int r0 = r3.f16714a
            int r1 = r2.f16714a
            if (r1 != r0) goto L_0x0023
            int r3 = r3.f16715b
            int r0 = r2.f16715b
            if (r0 != r3) goto L_0x0023
        L_0x0021:
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f16714a * 31) + this.f16715b;
    }

    public final boolean isEmpty() {
        return this.f16714a > this.f16715b;
    }

    public final String toString() {
        return this.f16714a + ".." + this.f16715b;
    }
}
